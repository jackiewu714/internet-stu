package com.cw.stu.internet.tech.platform.dao.mybatis.generator;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cw.stu.internet.tech.platform.dao.mybatis.plugin.BasePluginAdapter;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @author Jackie
 */
public class MbGenerator {

    public static void generat(String location) {
        generat(location, null);
    }

    public static void generat(String location, Properties properties) {
        if (properties != null) {
            System.setProperties(properties);
        }
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        Resource resource = ctx.getResource(location);
        File configFile = null;
        try {
            configFile = new File(resource.getFile().getAbsolutePath());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            BasePluginAdapter.setConfig(config);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisSurpriseGenerator myBatisGenerator = new MyBatisSurpriseGenerator(config, callback, warnings);
            myBatisGenerator.generate(new NullProgressCallback() {

                @Override
                public void saveStarted(int totalTasks) {
                    super.saveStarted(totalTasks);
                }

            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XMLParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
