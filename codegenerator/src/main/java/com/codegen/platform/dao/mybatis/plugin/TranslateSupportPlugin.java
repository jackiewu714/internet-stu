package com.codegen.platform.dao.mybatis.plugin;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.internal.JDBCConnectionFactory;
import org.springframework.beans.BeanUtils;

/**
 * 
 * @author Jackie
 * 
 */
public class TranslateSupportPlugin extends BasePluginAdapter {

	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		XmlElement answer = new XmlElement("resultMap"); //$NON-NLS-1$
		document.getRootElement().addElement(answer);
		answer.addAttribute(new Attribute("id", //$NON-NLS-1$
				"ResultMapWithTranslation"));

		String returnType;
		if (introspectedTable.getRules().generateRecordWithBLOBsClass()) {
			returnType = introspectedTable.getRecordWithBLOBsType();
		} else {
			// table has BLOBs, but no BLOB class - BLOB fields must be
			// in the base class
			returnType = introspectedTable.getBaseRecordType();
		}

		answer.addAttribute(new Attribute("type", //$NON-NLS-1$
				"com.codegen.platform.util.camel.CamelCaseHashMap"));

		if (!introspectedTable.isConstructorBased()) {
			answer.addAttribute(new Attribute("extends", //$NON-NLS-1$
					introspectedTable.getBaseResultMapId()));
		}

		context.getCommentGenerator().addComment(answer);

		addResultMapElements(answer);
		this.sqlMapTranslationColumnListElementGenerated(document.getRootElement(), introspectedTable);
		this.sqlMapSelectByExampleWithTranslationElementGenerated(document.getRootElement(), introspectedTable);
		return true;
	}

	private void addResultMapElements(XmlElement answer) {
//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		try {
			String tableName = introspectedTable.getTableConfiguration().getTableName();
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection.prepareStatement("select * from tb_em_translate where table_name=?");// +
																														// "'
																														// and
																														// status
																														// =
																														// 'S0A'"
			pstm.setString(1, tableName);
			ResultSet rs = pstm.executeQuery();
			Set<String> set = new HashSet<String>();
			while (rs.next()) {
				String columName = rs.getString("colum_name");
				for (IntrospectedColumn introspectedColumn : introspectedTable.getBaseColumns()) {
					if (introspectedColumn.getActualColumnName().equals(columName) && !set.contains(columName)) {
						XmlElement resultElement = new XmlElement("result"); //$NON-NLS-1$
						set.add(columName);
						resultElement.addAttribute(new Attribute("column", name_of( //$NON-NLS-1$
								MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn))));
						resultElement
								.addAttribute(new Attribute("property", nameOf(introspectedColumn.getJavaProperty()))); //$NON-NLS-1$
						resultElement.addAttribute(new Attribute("jdbcType", "VARCHAR")); //$NON-NLS-1$

						if (stringHasValue(introspectedColumn.getTypeHandler())) {
							resultElement
									.addAttribute(new Attribute("typeHandler", introspectedColumn.getTypeHandler())); //$NON-NLS-1$
						}

						answer.addElement(resultElement);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String name_of(String str) {
		return "name_of_" + str;
	}

	private String nameOf(String str) {
		return "nameOf" + str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(0)).toUpperCase());
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method _method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		Method method = new Method();
		BeanUtils.copyProperties(_method, method);
		this.introspectedTable = introspectedTable;
		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		FullyQualifiedJavaType type = new FullyQualifiedJavaType(introspectedTable.getExampleType());
		importedTypes.add(type);
		importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

		method.setVisibility(JavaVisibility.PUBLIC);

		FullyQualifiedJavaType returnType = FullyQualifiedJavaType.getNewListInstance();
		FullyQualifiedJavaType listType;
		/*
		 * if (introspectedTable.getRules().generateBaseRecordClass()) {
		 * listType = new
		 * FullyQualifiedJavaType(introspectedTable.getBaseRecordType()); } else
		 * if (introspectedTable.getRules().generatePrimaryKeyClass()) {
		 * listType = new
		 * FullyQualifiedJavaType(introspectedTable.getPrimaryKeyType()); } else
		 * { throw new RuntimeException(getString("RuntimeError.12"));
		 * //$NON-NLS-1$ }
		 */
		listType = new FullyQualifiedJavaType(Map.class.getName());
		FullyQualifiedJavaType rowBoundsType = new FullyQualifiedJavaType(RowBounds.class.getName());
		importedTypes.add(rowBoundsType);

		importedTypes.add(listType);
		returnType.addTypeArgument(listType);
		method.setReturnType(returnType);

		method.setName("selectByExampleWithTranslation");
		method.addParameter(new Parameter(type, "example")); //$NON-NLS-1$
		method.addParameter(new Parameter(rowBoundsType, "rowbounds")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public void addMapperAnnotations(Interface interfaze, Method method) {
		interfaze.addMethod(method);
		return;
	}

	public boolean sqlMapSelectByExampleWithTranslationElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		String fqjt = introspectedTable.getExampleType();

		XmlElement answer = new XmlElement("select"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "selectByExampleWithTranslation")); //$NON-NLS-1$
		answer.addAttribute(new Attribute("resultMap", "ResultMapWithTranslation")); //$NON-NLS-1$
		answer.addAttribute(new Attribute("parameterType", fqjt)); //$NON-NLS-1$

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		answer.addElement(new TextElement("select")); //$NON-NLS-1$
		XmlElement ifElement = new XmlElement("if"); //$NON-NLS-1$
		ifElement.addAttribute(new Attribute("test", "distinct")); //$NON-NLS-1$ //$NON-NLS-2$
		ifElement.addElement(new TextElement("distinct")); //$NON-NLS-1$
		answer.addElement(ifElement);

		StringBuilder sb = new StringBuilder();
		if (stringHasValue(introspectedTable.getSelectByExampleQueryId())) {
			sb.append('\'');
			sb.append(introspectedTable.getSelectByExampleQueryId());
			sb.append("' as QUERYID,"); //$NON-NLS-1$
			answer.addElement(new TextElement(sb.toString()));
		}

		answer.addElement(getBaseColumnListElement());
		if (introspectedTable.getRules().generateSelectByExampleWithBLOBs()) {
			answer.addElement(new TextElement(","));
			answer.addElement(getBlobColumnListElement());
		}

		/*
		 * JDBCConnectionConfiguration jdbcConnectionConfiguration =
		 * getConfig().getContexts().get(0) .getJdbcConnectionConfiguration();
		 * try { String tableName =
		 * introspectedTable.getTableConfiguration().getTableName(); Connection
		 * connection = ConnectionFactory.getInstance().getConnection(
		 * jdbcConnectionConfiguration ); PreparedStatement pstm =
		 * connection.prepareStatement(
		 * "select * from tb_em_translate where table_name='" + tableName +
		 * "' and status = 'S0A'"); ResultSet rs = pstm.executeQuery(); if
		 * (rs.next()) { answer.addElement(new TextElement(",")); //$NON-NLS-1$
		 * answer.addElement(getTranslateColumnListElement()); } } catch
		 * (SQLException e) { e.printStackTrace(); }
		 */
		generateExtracSelectColumnXml(answer);

		sb.setLength(0);
		sb.append("from "); //$NON-NLS-1$
		sb.append(introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime() + " a ");
		answer.addElement(new TextElement(sb.toString()));
		generateExtracTableXml(answer);
		answer.addElement(getExampleIncludeElement());

		ifElement = new XmlElement("if"); //$NON-NLS-1$
		ifElement.addAttribute(new Attribute("test", "orderByClause != null")); //$NON-NLS-1$ //$NON-NLS-2$
		ifElement.addElement(new TextElement("order by ${orderByClause}")); //$NON-NLS-1$
		answer.addElement(ifElement);
		return true;
	}

	protected XmlElement getBaseColumnListElement() {
		XmlElement answer = new XmlElement("include"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("refid", //$NON-NLS-1$
				introspectedTable.getBaseColumnListId()));
		return answer;
	}

	protected XmlElement getTranslateColumnListElement() {
		XmlElement answer = new XmlElement("include"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("refid", //$NON-NLS-1$
				"Translation_Column_List"));
		return answer;
	}

	protected XmlElement getExampleIncludeElement() {
		XmlElement ifElement = new XmlElement("if"); //$NON-NLS-1$
		ifElement.addAttribute(new Attribute("test", "_parameter != null")); //$NON-NLS-1$ //$NON-NLS-2$

		XmlElement includeElement = new XmlElement("include"); //$NON-NLS-1$
		includeElement.addAttribute(new Attribute("refid", //$NON-NLS-1$
				introspectedTable.getExampleWhereClauseId()));
		ifElement.addElement(includeElement);

		return ifElement;
	}

	public boolean sqlMapTranslationColumnListElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		XmlElement answer = new XmlElement("sql"); //$NON-NLS-1$
		element.addElement(answer);
		answer.addAttribute(new Attribute("id", //$NON-NLS-1$
				"Translation_Column_List"));

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		try {
			String tableName = introspectedTable.getTableConfiguration().getTableName();
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection.prepareStatement(
					"select * from tb_em_translate where table_name='" + tableName + "' and status = 'S0A'");
			ResultSet rs = pstm.executeQuery();
			Set<String> set = new HashSet<String>();
			while (rs.next()) {
				String columName = rs.getString("colum_name");
				String relaColumName = rs.getString("rela_colum_name");
				Iterator<IntrospectedColumn> iter = introspectedTable.getBaseColumns().iterator();
				while (iter.hasNext()) {
					IntrospectedColumn ic = iter.next();
					if (ic.getActualColumnName().equals(columName) && !set.contains(columName)) {
						set.add(columName);
						String transType = rs.getString("trans_type");
						if (transType.equals("S01")) {
							String dictTypeid = rs.getString("dict_type");
							sb.append("(select dict_name from tb_pc_dict b where b.dict_type='" + dictTypeid
									+ "' and b.dict_id = a." + columName + " and b.status = 'S0A' limit 0, 1) AS "
									+ name_of(MyBatis3FormattingUtilities.getSelectListPhrase(ic)));
						} else if (transType.equals("S02")) {
							String transTableName = rs.getString("trans_table_name");
							String transColumName = rs.getString("trans_colum_name");
							sb.append("(select " + transColumName + " from " + transTableName + " b where b."
									+ relaColumName + " = a." + columName + " limit 0, 1) AS "
									+ name_of(MyBatis3FormattingUtilities.getSelectListPhrase(ic)));
						} else if (transType.equals("S03")) {
							String transSql = rs.getString("trans_sql");
							sb.append("(" + transSql + ") AS "
									+ name_of(MyBatis3FormattingUtilities.getSelectListPhrase(ic)));
						} else {
							continue;
						}
						if (!rs.isLast()) {
							sb.append(", "); //$NON-NLS-1$
						}

						if (sb.length() > 80) {
							answer.addElement(new TextElement(sb.toString()));
							sb.setLength(0);
						}
					}

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (sb.length() > 0) {
			answer.addElement((new TextElement(sb.toString())));
		}
		return true;
	}

	private void generateExtracSelectColumnXml(XmlElement dynamicElement) {
		StringBuilder sb = new StringBuilder();
		XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
		sb.setLength(0);
		sb.append("extracSelectColunm"); //$NON-NLS-1$
		sb.append(" != null"); //$NON-NLS-1$
		sb.append(" and "); //$NON-NLS-1$
		sb.append("extracSelectColunm"); //$NON-NLS-1$
		sb.append(" != ''"); //$NON-NLS-1$
		isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
		dynamicElement.addElement(isNotNullElement);

		sb.setLength(0);
		sb.append(" , "); //$NON-NLS-1$
		sb.append(" ${extracSelectColunm} "); //$NON-NLS-1$

		isNotNullElement.addElement(new TextElement(sb.toString()));

	}

	private void generateExtracTableXml(XmlElement dynamicElement) {
		StringBuilder sb = new StringBuilder();
		XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
		sb.setLength(0);
		sb.append("extracTable"); //$NON-NLS-1$
		sb.append(" != null"); //$NON-NLS-1$
		sb.append(" and "); //$NON-NLS-1$
		sb.append("extracTable"); //$NON-NLS-1$
		sb.append(" != ''"); //$NON-NLS-1$
		isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
		dynamicElement.addElement(isNotNullElement);

		sb.setLength(0);
		// sb.append(" , "); //$NON-NLS-1$
		sb.append(" ${extracTable} "); //$NON-NLS-1$

		isNotNullElement.addElement(new TextElement(sb.toString()));

	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		Plugin plugins = context.getPlugins();

//		JDBCConnectionConfiguration jdbcConnectionConfiguration = getConfig().getContexts().get(0)
//				.getJdbcConnectionConfiguration();
		try {
			String tableName = introspectedTable.getTableConfiguration().getTableName();
			Connection connection = getJDBCConnectionFactory().getConnection();
			PreparedStatement pstm = connection.prepareStatement(
					"select * from tb_em_translate where table_name='" + tableName + "' and status = 'S0A'");
			ResultSet rs = pstm.executeQuery();
			Set<String> set = new HashSet<String>();
			while (rs.next()) {
				String columName = rs.getString("colum_name");
				List<IntrospectedColumn> introspectedColumns = getColumnsInThisClass();

				for (IntrospectedColumn introspectedColumn : introspectedColumns) {
					if (!introspectedColumn.getActualColumnName().equals(columName)) {
						continue;
					}
					if (set.contains(columName)) {
						continue;
					}
					set.add(columName);
					IntrospectedColumn ic = new IntrospectedColumn();
					BeanUtils.copyProperties(introspectedColumn, ic);
					ic.setFullyQualifiedJavaType(new FullyQualifiedJavaType(String.class.getName()));
					ic.setJavaProperty(nameOf(ic.getJavaProperty()));

					Field field = getJavaBeansField(ic);
					if (plugins.modelFieldGenerated(field, topLevelClass, ic, introspectedTable,
							Plugin.ModelClassType.BASE_RECORD)) {
						topLevelClass.addField(field);
						topLevelClass.addImportedType(field.getType());
					}

					Method method = getJavaBeansGetter(ic);
					if (plugins.modelGetterMethodGenerated(method, topLevelClass, ic, introspectedTable,
							Plugin.ModelClassType.BASE_RECORD)) {
						topLevelClass.addMethod(method);
					}

					if (!introspectedTable.isImmutable()) {
						method = getJavaBeansSetter(ic);
						if (plugins.modelSetterMethodGenerated(method, topLevelClass, ic, introspectedTable,
								Plugin.ModelClassType.BASE_RECORD)) {
							topLevelClass.addMethod(method);
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	private List<IntrospectedColumn> getColumnsInThisClass() {
		List<IntrospectedColumn> introspectedColumns;
		if (includePrimaryKeyColumns()) {
			if (includeBLOBColumns()) {
				introspectedColumns = introspectedTable.getAllColumns();
			} else {
				introspectedColumns = introspectedTable.getNonBLOBColumns();
			}
		} else {
			if (includeBLOBColumns()) {
				introspectedColumns = introspectedTable.getNonPrimaryKeyColumns();
			} else {
				introspectedColumns = introspectedTable.getBaseColumns();
			}
		}

		return introspectedColumns;
	}

	private boolean includePrimaryKeyColumns() {
		return !introspectedTable.getRules().generatePrimaryKeyClass() && introspectedTable.hasPrimaryKeyColumns();
	}

	private boolean includeBLOBColumns() {
		return !introspectedTable.getRules().generateRecordWithBLOBsClass() && introspectedTable.hasBLOBColumns();
	}

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean sqlMapBlobColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		return true;
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