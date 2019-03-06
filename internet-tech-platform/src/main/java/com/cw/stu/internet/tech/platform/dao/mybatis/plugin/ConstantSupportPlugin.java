package com.cw.stu.internet.tech.platform.dao.mybatis.plugin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cw.stu.internet.tech.platform.dao.mybatis.util.MbgConstants;
import org.apache.commons.lang.StringUtils;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.DefaultJavaFormatter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.internal.JDBCConnectionFactory;

/**
 * 
 * @author Jackie
 * 
 */
public class ConstantSupportPlugin extends BasePluginAdapter {
	protected List<String> warnings;

	/**
	 * This plugin is always valid - no properties are required
	 */
	@Override
    public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		return true;
	}

	@Override
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles() {
		List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
		GeneratedJavaFile file = DictTableGenerate();
		files.add(file);
		file = exceptionCodeGenerate2();
		files.add(file);
		file = eventIdConstantGenerate();
		files.add(file);
		return files;
	}

	private GeneratedJavaFile eventIdConstantGenerate() {
		String constantPackage = System.getProperty("constantPackage");
		String fullTypeSpecification = "com.codegen.core.common.util.EventIdConstant";
		if (StringUtils.isNotEmpty(constantPackage)) {
			fullTypeSpecification = constantPackage + ".EventIdConstant";
		}

		FullyQualifiedJavaType type = new FullyQualifiedJavaType(fullTypeSpecification);
		TopLevelClass topLevelClass = new TopLevelClass(type);
		String targetProject = "./src/main/java";
		GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, targetProject, 
				MbgConstants.DEFAULT_ENCODING, new DefaultJavaFormatter());

//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		try {
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("select event_id,name,code from tb_sm_event order by code");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				String eventId = rs.getString("event_id");
				Field f = new Field(code, new FullyQualifiedJavaType(Integer.class.getName()));
				f.setFinal(true);
				f.setInitializationString(eventId);
				f.setName(code.toUpperCase());
				f.setStatic(true);
				f.setVisibility(JavaVisibility.PUBLIC);
				f.addJavaDocLine("/*" + name + "*/");
				topLevelClass.addField(f);
			}
			topLevelClass.setVisibility(JavaVisibility.PUBLIC);
			topLevelClass.addFileCommentLine("//事件标识类，根据数据库配置生成。author:Jackie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return file;
	}

	private GeneratedJavaFile DictTableGenerate() {
		String constantPackage = System.getProperty("constantPackage");
		String fullTypeSpecification = "com.codegen.core.common.util.DictConstant";
		if (StringUtils.isNotEmpty(constantPackage)) {
			fullTypeSpecification = constantPackage + ".DictConstant";
		}

		FullyQualifiedJavaType type = new FullyQualifiedJavaType(fullTypeSpecification);
		TopLevelClass topLevelClass = new TopLevelClass(type);
		String targetProject = "./src/main/java";
		GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, targetProject, 
				MbgConstants.DEFAULT_ENCODING, new DefaultJavaFormatter());

//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		Map<String, List<Map>> dicts = new HashMap<String, List<Map>>();
		try {
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection.prepareStatement(
					"select dict_id, dict_type,dict_code,dict_name from tb_pc_dict where status = 'S0A' order by dict_type,dict_id");
			ResultSet rs = pstm.executeQuery();
			Map<String, String> dictTypeMap = new HashMap<String, String>();
			while (rs.next()) {
				String dictType = rs.getString("dict_type");
				String dictId = rs.getString("dict_id");
				String dictName = rs.getString("dict_name");
				String dictCode = rs.getString("dict_code");
				if (dicts.get(dictType) == null) {
					dicts.put(dictType, new ArrayList<Map>());
				}
				Map m = new HashMap();
				m.put("dictId", dictId);
				m.put("dictName", dictName);
				m.put("dictCode", dictCode);
				dicts.get(dictType).add(m);
				dictTypeMap.put(dictType, dictName);
			}
			Set<String> keys = dicts.keySet();
			for (String key : keys) {
				FullyQualifiedJavaType classType = new FullyQualifiedJavaType(key.toUpperCase());
				InnerClass innerClass = new InnerClass(classType);
				innerClass.setVisibility(JavaVisibility.PUBLIC);
				innerClass.setStatic(true);
				List<Map> dictIds = dicts.get(key);
				for (Map m : dictIds) {
					String dictId = m.get("dictId").toString();
					String dictCode = m.get("dictCode").toString();
					Field f = new Field(dictId, new FullyQualifiedJavaType(String.class.getName()));
					f.setFinal(true);
					f.setInitializationString("\"" + dictId + "\"");
					f.setName(dictCode.toUpperCase());
					f.setStatic(true);
					f.setVisibility(JavaVisibility.PUBLIC);
					f.addJavaDocLine("/*" + m.get("dictName").toString() + "*/");
					innerClass.addField(f);
				}
				topLevelClass.addInnerClass(innerClass);
				topLevelClass.setVisibility(JavaVisibility.PUBLIC);
			}

			FullyQualifiedJavaType classType = new FullyQualifiedJavaType("DICT_TYPE");
			InnerClass innerClass = new InnerClass(classType);
			innerClass.setVisibility(JavaVisibility.PUBLIC);
			innerClass.setStatic(true);
			Set<Entry<String, String>> sets = dictTypeMap.entrySet();
			for (Entry<String, String> entry : sets) {
				Field f = new Field(entry.getKey(), new FullyQualifiedJavaType(String.class.getName()));
				f.setFinal(true);
				f.setInitializationString("\"" + entry.getKey() + "\"");
				f.setName(entry.getKey().toUpperCase());
				f.setStatic(true);
				f.setVisibility(JavaVisibility.PUBLIC);
				f.addJavaDocLine("/*" + entry.getValue() + "*/");
				innerClass.addField(f);
			}
			topLevelClass.addInnerClass(innerClass);
			topLevelClass.setVisibility(JavaVisibility.PUBLIC);

			topLevelClass.addFileCommentLine("//数据字典类，根据数据库配置生成。author:Jackie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return file;
	}

	private GeneratedJavaFile exceptionCodeGenerate2() {
		String constantPackage = System.getProperty("constantPackage");
		String fullTypeSpecification = "com.codegen.core.common.util.BizCodeConstant";
		if (StringUtils.isNotEmpty(constantPackage)) {
			fullTypeSpecification = constantPackage + ".BizCodeConstant";
		}
		FullyQualifiedJavaType type = new FullyQualifiedJavaType(fullTypeSpecification);
		TopLevelClass topLevelClass = new TopLevelClass(type);
		String targetProject = "./src/main/java";
		GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, targetProject, 
				MbgConstants.DEFAULT_ENCODING, new DefaultJavaFormatter());

		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
				.getJdbcConnectionConfiguration();
		try {
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("select biz_code,name from tb_sm_biz_code order by biz_code");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String bizCode = rs.getString("biz_code");
				String name = rs.getString("name");
				Field f = new Field(bizCode, new FullyQualifiedJavaType(String.class.getName()));
				f.setFinal(true);
				f.setInitializationString("\"" + bizCode + "\"");
				f.setName(bizCode.toUpperCase());
				f.setStatic(true);
				f.setVisibility(JavaVisibility.PUBLIC);
				f.addJavaDocLine("/*" + name + "*/");
				topLevelClass.addField(f);
			}
			topLevelClass.setVisibility(JavaVisibility.PUBLIC);
			topLevelClass.addFileCommentLine("//业务编码类，根据数据库配置生成。author:Jackie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return file;
	}

	private GeneratedJavaFile exceptionCodeGenerate() {
		String fullTypeSpecification = "com.codegen.core.common.util.BizCodeConstan";
		FullyQualifiedJavaType type = new FullyQualifiedJavaType(fullTypeSpecification);
		TopLevelClass topLevelClass = new TopLevelClass(type);
		String targetProject = "./src/main/java";
		GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, targetProject, 
				MbgConstants.DEFAULT_ENCODING, new DefaultJavaFormatter());

//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		Map<String, List<String>> catalogs = new HashMap<String, List<String>>();
		Map<String, List<Map>> blocks = new HashMap<String, List<Map>>();
		try {
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection.prepareStatement(
					"select catalog, block,biz_code,name from tb_sm_biz_code order by catalog, block,biz_code");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String catalog = rs.getString("catalog");
				String block = rs.getString("block");
				String bizCode = rs.getString("biz_code");
				String name = rs.getString("name");

				if (catalogs.get(catalog) == null) {
					catalogs.put(catalog, new ArrayList<String>());
				}
				catalogs.get(catalog).add(block);
				if (blocks.get(block) == null) {
					blocks.put(block, new ArrayList<Map>());
				}
				Map m = new HashMap();
				m.put("bizCode", bizCode);
				m.put("name", name);
				blocks.get(block).add(m);
			}
			Set<String> keys = catalogs.keySet();
			for (String key : keys) {
				FullyQualifiedJavaType classType = new FullyQualifiedJavaType(key.toUpperCase());
				InnerClass innerClass = new InnerClass(classType);
				topLevelClass.addInnerClass(innerClass);
				innerClass.setVisibility(JavaVisibility.PUBLIC);
				innerClass.setStatic(true);
				List<String> blockIds = catalogs.get(key);
				Set<String> inner2Set = new HashSet<String>();
				for (String blockId : blockIds) {
					if (inner2Set.contains(blockId)) {
						continue;
					}
					inner2Set.add(blockId);
					FullyQualifiedJavaType classType2 = new FullyQualifiedJavaType(blockId.toUpperCase());
					InnerClass innerClass2 = new InnerClass(classType2);
					innerClass2.setVisibility(JavaVisibility.PUBLIC);
					innerClass2.setStatic(true);
					innerClass.addInnerClass(innerClass2);
					List<Map> bizs = blocks.get(blockId);
					for (Map m : bizs) {
						String bizCode = m.get("bizCode").toString();
						String name = m.get("name").toString();
						Field f = new Field(bizCode, new FullyQualifiedJavaType(String.class.getName()));
						f.setFinal(true);
						f.setInitializationString("\"" + bizCode + "\"");
						f.setName(bizCode.toUpperCase());
						f.setStatic(true);
						f.setVisibility(JavaVisibility.PUBLIC);
						f.addJavaDocLine("/*" + name + "*/");
						innerClass2.addField(f);
					}
				}
				topLevelClass.setVisibility(JavaVisibility.PUBLIC);
			}
			topLevelClass.addFileCommentLine("//业务编码类，根据数据库配置生成。author:Jackie");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return file;
	}

	/**
	 * 获取JDBC连接工厂
	 * @return	JDBCConnectionFactory
	 */
	private JDBCConnectionFactory getJDBCConnectionFactory() {
		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
				.getJdbcConnectionConfiguration();
		return new JDBCConnectionFactory(jdbcConnectionConfiguration);
	}
	
}