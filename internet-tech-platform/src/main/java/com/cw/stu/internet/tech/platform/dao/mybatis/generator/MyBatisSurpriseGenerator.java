package com.cw.stu.internet.tech.platform.dao.mybatis.generator;

import static org.mybatis.generator.internal.util.ClassloaderUtility.getCustomClassloader;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cw.stu.internet.tech.platform.dao.mybatis.util.MbgConstants;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.ShellException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;
import org.mybatis.generator.internal.ObjectFactory;

/**
 * @author Jackie
 */
public class MyBatisSurpriseGenerator extends MyBatisGenerator {

    public MyBatisSurpriseGenerator(Configuration configuration, ShellCallback shellCallback, List<String> warnings)
            throws InvalidConfigurationException {
        super(configuration, shellCallback, warnings);
        if (configuration == null) {
            throw new IllegalArgumentException(getString("RuntimeError.2")); //$NON-NLS-1$
        } else {
            this.configuration = configuration;
        }

        if (shellCallback == null) {
            this.shellCallback = new DefaultShellCallback(false);
        } else {
            this.shellCallback = shellCallback;
        }

        if (warnings == null) {
            this.warnings = new ArrayList<String>();
        } else {
            this.warnings = warnings;
        }
        generatedJavaFiles = new ArrayList<GeneratedJavaFile>();
        generatedXmlFiles = new ArrayList<GeneratedXmlFile>();
        projects = new HashSet<String>();

        this.configuration.validate();
    }

    private Configuration configuration;

    private ShellCallback shellCallback;

    private List<GeneratedJavaFile> generatedJavaFiles;

    private List<GeneratedXmlFile> generatedXmlFiles;

    private List<String> warnings;

    private Set<String> projects;

    /**
     * This is the main method for generating code. This method is long running,
     * but progress can be provided and the method can be canceled through the
     * ProgressCallback interface. This version of the method runs all
     * configured contexts.
     *
     * @param callback an instance of the ProgressCallback interface, or
     *                 <code>null</code> if you do not require progress information
     * @throws SQLException
     * @throws IOException
     * @throws InterruptedException if the method is canceled through the ProgressCallback
     */
    @Override
    public void generate(ProgressCallback callback) throws SQLException, IOException, InterruptedException {
        generate(callback, null, null);
    }

    /**
     * This is the main method for generating code. This method is long running,
     * but progress can be provided and the method can be canceled through the
     * ProgressCallback interface.
     *
     * @param callback   an instance of the ProgressCallback interface, or
     *                   <code>null</code> if you do not require progress information
     * @param contextIds a set of Strings containing context ids to run. Only the
     *                   contexts with an id specified in this list will be run. If the
     *                   list is null or empty, than all contexts are run.
     * @throws InvalidConfigurationException
     * @throws SQLException
     * @throws IOException
     * @throws InterruptedException          if the method is canceled through the ProgressCallback
     */
    @Override
    public void generate(ProgressCallback callback, Set<String> contextIds)
            throws SQLException, IOException, InterruptedException {
        generate(callback, contextIds, null);
    }

    /**
     * This is the main method for generating code. This method is long running,
     * but progress can be provided and the method can be cancelled through the
     * ProgressCallback interface.
     *
     * @param callback                 an instance of the ProgressCallback interface, or
     *                                 <code>null</code> if you do not require progress information
     * @param contextIds               a set of Strings containing context ids to run. Only the
     *                                 contexts with an id specified in this list will be run. If the
     *                                 list is null or empty, than all contexts are run.
     * @param fullyQualifiedTableNames a set of table names to generate. The elements of the set must
     *                                 be Strings that exactly match what's specified in the
     *                                 configuration. For example, if table name = "foo" and schema =
     *                                 "bar", then the fully qualified table name is "foo.bar". If
     *                                 the Set is null or empty, then all tables in the configuration
     *                                 will be used for code generation.
     * @throws InvalidConfigurationException
     * @throws SQLException
     * @throws IOException
     * @throws InterruptedException          if the method is canceled through the ProgressCallback
     */
    public void generate(ProgressCallback callback, Set<String> contextIds, Set<String> fullyQualifiedTableNames)
            throws SQLException, IOException, InterruptedException {

        if (callback == null) {
            callback = new NullProgressCallback();
        }

        generatedJavaFiles.clear();
        generatedXmlFiles.clear();

        /*
         * ApplicationContext ctxload = new ClassPathXmlApplicationContext();
         * Properties jdbcProperties = new Properties(); try { InputStream in =
         * ctxload.getResource("jdbc.properties").getInputStream(); if (null !=
         * in) { jdbcProperties.load(in); in.close(); } } catch (IOException e)
         * { e.printStackTrace(); } JDBCConnectionConfiguration
         * jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
         * jdbcConnectionConfiguration.setConnectionURL(jdbcProperties.
         * getProperty("jdbc_url"));
         * jdbcConnectionConfiguration.setDriverClass(jdbcProperties.getProperty
         * ("jdbc_driverClassName"));
         * jdbcConnectionConfiguration.setPassword(jdbcProperties.getProperty(
         * "jdbc_password"));
         * jdbcConnectionConfiguration.setUserId(jdbcProperties.getProperty(
         * "jdbc_user"));
         */
        // calculate the contexts to run
        List<Context> contextsToRun;
        if (contextIds == null || contextIds.size() == 0) {
            contextsToRun = configuration.getContexts();
        } else {
            contextsToRun = new ArrayList<Context>();
            for (Context context : configuration.getContexts()) {
                if (contextIds.contains(context.getId())) {
                    contextsToRun.add(context);
                    // context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
                }
            }
        }

        // setup custom classloader if required
        if (configuration.getClassPathEntries().size() > 0) {
            ClassLoader classLoader = getCustomClassloader(configuration.getClassPathEntries());
//			ObjectFactory.setExternalClassLoader(classLoader);
            ObjectFactory.addExternalClassLoader(classLoader);
        }

        // now run the introspections...
        int totalSteps = 0;
        for (Context context : contextsToRun) {
            totalSteps += context.getIntrospectionSteps();
        }
        callback.introspectionStarted(totalSteps);

        for (Context context : contextsToRun) {
            context.introspectTables(callback, warnings, fullyQualifiedTableNames);
        }

        // now run the generates
        totalSteps = 0;
        for (Context context : contextsToRun) {
            totalSteps += context.getGenerationSteps();
        }
        callback.generationStarted(totalSteps);

        for (Context context : contextsToRun) {
            context.generateFiles(callback, generatedJavaFiles, generatedXmlFiles, warnings);
        }

        // now save the files
        callback.saveStarted(generatedXmlFiles.size() + generatedJavaFiles.size());

        for (GeneratedXmlFile gxf : generatedXmlFiles) {
            projects.add(gxf.getTargetProject());

            File targetFile;
            String source;
            try {
                File directory = shellCallback.getDirectory(gxf.getTargetProject(), gxf.getTargetPackage());
                targetFile = new File(directory, gxf.getFileName());
                if (targetFile.exists()) {
                    if (shellCallback.isOverwriteEnabled()) {
                        source = gxf.getFormattedContent();
                        warnings.add(getString("Warning.11", //$NON-NLS-1$
                                targetFile.getAbsolutePath()));
                    } else {
                        source = gxf.getFormattedContent();
                        targetFile = getUniqueFileName(directory, gxf.getFileName());
                        warnings.add(getString("Warning.2", targetFile.getAbsolutePath())); //$NON-NLS-1$
                    }
                } else {
                    source = gxf.getFormattedContent();
                }
            } catch (ShellException e) {
                warnings.add(e.getMessage());
                continue;
            }

            callback.checkCancel();
            callback.startTask(getString("Progress.15", targetFile.getName())); //$NON-NLS-1$
            writeFile(targetFile, source);
        }

        for (GeneratedJavaFile gjf : generatedJavaFiles) {
            projects.add(gjf.getTargetProject());

            File targetFile;
            String source;
            try {
                File directory = shellCallback.getDirectory(gjf.getTargetProject(), gjf.getTargetPackage());
                targetFile = new File(directory, gjf.getFileName());
                if (targetFile.exists()) {
                    if (shellCallback.isMergeSupported()) {
                        source = shellCallback.mergeJavaFile(gjf.getFormattedContent(), targetFile.getAbsolutePath(),
                                MergeConstants.OLD_ELEMENT_TAGS, MbgConstants.DEFAULT_ENCODING);
                    } else if (shellCallback.isOverwriteEnabled()) {
                        source = gjf.getFormattedContent();
                        warnings.add(getString("Warning.11", //$NON-NLS-1$
                                targetFile.getAbsolutePath()));
                    } else {
                        source = gjf.getFormattedContent();
                        targetFile = getUniqueFileName(directory, gjf.getFileName());
                        warnings.add(getString("Warning.2", targetFile.getAbsolutePath())); //$NON-NLS-1$
                    }
                } else {
                    source = gjf.getFormattedContent();
                }

                callback.checkCancel();
                callback.startTask(getString("Progress.15", targetFile.getName())); //$NON-NLS-1$
                writeFile(targetFile, source);
            } catch (ShellException e) {
                warnings.add(e.getMessage());
            }
        }

        for (String project : projects) {
            shellCallback.refreshProject(project);
        }

        callback.done();
    }

    /**
     * Writes, or overwrites, the contents of the specified file
     *
     * @param file
     * @param content
     */
    private void writeFile(File file, String content) throws IOException {
        file.delete();
        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
        bw.write(content);
        bw.close();
    }

    private File getUniqueFileName(File directory, String fileName) {
        File answer = null;

        // try up to 1000 times to generate a unique file name
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            sb.setLength(0);
            sb.append(fileName);
            sb.append('.');
            sb.append(i);

            File testFile = new File(directory, sb.toString());
            if (!testFile.exists()) {
                answer = testFile;
                break;
            }
        }

        if (answer == null) {
            throw new RuntimeException(getString("RuntimeError.3", directory.getAbsolutePath())); //$NON-NLS-1$
        }

        return answer;
    }

}
