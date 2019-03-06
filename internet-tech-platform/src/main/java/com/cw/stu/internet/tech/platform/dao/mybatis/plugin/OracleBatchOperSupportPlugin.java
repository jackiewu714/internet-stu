package com.cw.stu.internet.tech.platform.dao.mybatis.plugin;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Jackie  2018/12/26 10:00
 * 
 */
public class OracleBatchOperSupportPlugin extends BasePluginAdapter {

	@Override
	public boolean sqlMapDocumentGenerated(Document document,
										   IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		//生成sqlmap中批量插入节点（insert all 方式）
		this.sqlMapInsertListSelectiveElementGenerated(document.getRootElement(), introspectedTable);
		//生成sqlmap中批量插入节点（union 方式）
		this.sqlMapInsertListSelectiveByUnionElementGenerated(document.getRootElement(), introspectedTable);
		return true;
	}

	/**
	 * 生成Mapper接口中批量插入方法（insert all 方式）
	 * @param _method				Method
	 * @param interfaze				Interface
	 * @param introspectedTable		IntrospectedTable
	 * @return	boolean
	 */
	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method _method,
														Interface interfaze,
														IntrospectedTable introspectedTable) {

		FullyQualifiedJavaType parameterType = introspectedTable.getRules().calculateAllFieldsClass();

		Method method = new Method();
		BeanUtils.copyProperties(_method, method);
		this.introspectedTable = introspectedTable;
		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		importedTypes.add(parameterType);
		importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

		method.setVisibility(JavaVisibility.PUBLIC);

		FullyQualifiedJavaType listParameterType = FullyQualifiedJavaType.getNewListInstance();
		FullyQualifiedJavaType rowBoundsType = new FullyQualifiedJavaType(RowBounds.class.getName());
		importedTypes.add(rowBoundsType);

		listParameterType.addTypeArgument(parameterType);
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());

		method.setName("insertListSelective");
		method.addParameter(new Parameter(listParameterType, "records", "@Param(\"records\")"));

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);

		//生成Mapper接口中批量插入方法（union 方式）
		this.clientInsertSelectiveByUnionMethodGenerated(_method, interfaze, introspectedTable);
		return true;
	}

	/**
	 * 生成Mapper接口中批量插入方法（union 方式）
	 * @param _method				Method
	 * @param interfaze				Interface
	 * @param introspectedTable		IntrospectedTable
	 * @return	boolean
	 */
	public boolean clientInsertSelectiveByUnionMethodGenerated(Method _method,
															   Interface interfaze,
															   IntrospectedTable introspectedTable) {

		FullyQualifiedJavaType parameterType = introspectedTable.getRules().calculateAllFieldsClass();

		Method method = new Method();
		BeanUtils.copyProperties(_method, method);
		this.introspectedTable = introspectedTable;
		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		importedTypes.add(parameterType);
		importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

		method.setVisibility(JavaVisibility.PUBLIC);

		FullyQualifiedJavaType listParameterType = FullyQualifiedJavaType.getNewListInstance();
		FullyQualifiedJavaType rowBoundsType = new FullyQualifiedJavaType(RowBounds.class.getName());
		importedTypes.add(rowBoundsType);

		listParameterType.addTypeArgument(parameterType);
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());

		method.setName("insertListSelectiveByUnion");
		method.addParameter(new Parameter(parameterType, "record", "@Param(\"record\")"));
		method.addParameter(new Parameter(listParameterType, "records", "@Param(\"records\")"));

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public void addMapperAnnotations(Interface interfaze,
									 Method method) {
		interfaze.addMethod(method);
		return;
	}

	/**
	 * 生成sqlmap中批量插入节点（insert all 方式）
	 * @param element				XmlElement
	 * @param introspectedTable		IntrospectedTable
	 * @return	boolean
	 */
	public boolean sqlMapInsertListSelectiveElementGenerated(XmlElement element,
															 IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;

		XmlElement answer = new XmlElement("insert");
		answer.addAttribute(new Attribute("id", "insertListSelective"));
		answer.addAttribute(new Attribute("parameterType", "map"));

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		genInsertAllXml(introspectedTable, answer);
		return true;
	}

	public void genInsertXml(IntrospectedTable introspectedTable,
							 XmlElement answer,
							 StringBuilder sb) {
		XmlElement insertTrimElement = new XmlElement("trim");
		insertTrimElement.addAttribute(new Attribute("prefix", "("));
		insertTrimElement.addAttribute(new Attribute("suffix", ")"));
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ","));
		answer.addElement(insertTrimElement);

		XmlElement valuesTrimElement = new XmlElement("trim");
		valuesTrimElement.addAttribute(new Attribute("prefix", "("));
		valuesTrimElement.addAttribute(new Attribute("suffix", ")"));
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ","));

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}

			XmlElement insertNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null");
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null");
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString().replace("#{", "#{listItem.")));
			valuesTrimElement.addElement(valuesNotNullElement);
		}

		XmlElement innerForEach = new XmlElement("foreach");
		innerForEach.addAttribute(new Attribute("collection", "records"));
		innerForEach.addAttribute(new Attribute("item", "listItem"));
		innerForEach.addAttribute(new Attribute("open", "values "));
		innerForEach.addAttribute(new Attribute("close", " "));
		innerForEach.addAttribute(new Attribute("separator", ","));
		innerForEach.addElement(valuesTrimElement);
		answer.addElement(innerForEach);
	}

	/**
	 * 生成oracle批量插入的sqlmap语句块（insert all 方式），示例代码如下：
	 *
	 *  INSERT ALL
	 *  	INTO bms.test(name1, name2, name3, name4, name5) VALUES(1, 12, 13, 14, 15)
	 *  	INTO bms.test(name1, name2, name3, name4, name5) VALUES(2, 22, 23, 24, 25)
	 *  	INTO bms.test(name1, name2, name3, name4, name5) VALUES(3, 32, 33, 34, 35)
	 * 	SELECT 1 FROM DUAL
	 *
	 * @param introspectedTable		IntrospectedTable
	 * @param answer				XmlElement
	 */
	protected void genInsertAllXml(IntrospectedTable introspectedTable,
								   XmlElement answer) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert all ");
		answer.addElement(new TextElement(sb.toString()));

		XmlElement insertTrimElement = new XmlElement("trim");
		insertTrimElement.addAttribute(new Attribute("prefix", "("));
		insertTrimElement.addAttribute(new Attribute("suffix", ")"));
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ","));

		XmlElement valuesTrimElement = new XmlElement("trim");
		valuesTrimElement.addAttribute(new Attribute("prefix", "("));
		valuesTrimElement.addAttribute(new Attribute("suffix", ")"));
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ","));

		XmlElement innerForEach = new XmlElement("foreach");
		innerForEach.addAttribute(new Attribute("collection", "records"));
		innerForEach.addAttribute(new Attribute("item", "listItem"));
		innerForEach.addAttribute(new Attribute("open", " "));
		innerForEach.addAttribute(new Attribute("close", " "));
		innerForEach.addAttribute(new Attribute("separator", " "));

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}
			XmlElement insertNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("listItem."));
			sb.append(" != null");
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("listItem."));
			sb.append(" != null");
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString().replace("#{", "#{listItem.")));
			valuesTrimElement.addElement(valuesNotNullElement);
		}

		String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
		innerForEach.addElement(new TextElement(String.format("into %S", tableName)));
		innerForEach.addElement(insertTrimElement);
		innerForEach.addElement(new TextElement(" values "));
		innerForEach.addElement(valuesTrimElement);
		innerForEach.addElement(new TextElement(" SELECT 1 FROM DUAL "));

		answer.addElement(innerForEach);
	}

	/**
	 * 生成sqlmap中批量插入节点（union 方式）
	 * @param element				XmlElement
	 * @param introspectedTable		IntrospectedTable
	 * @return	boolean
	 */
	public boolean sqlMapInsertListSelectiveByUnionElementGenerated(XmlElement element,
																	IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;

		XmlElement answer = new XmlElement("insert");
		answer.addAttribute(new Attribute("id", "insertListSelectiveByUnion"));
		answer.addAttribute(new Attribute("parameterType", "map"));

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		genInsertByUnionXml(introspectedTable, answer);
		return true;
	}

	/**
	 * 生成oracle批量插入的sqlmap语句块（union 方式），示例代码如下：
	 *
	 *  INSERT INTO bms.test(name1, name2, name3, name4, name5)
	 *  	SELECT 1, 12, 13, 14, 15 FROM dual UNION ALL
	 *  	SELECT 2, 22, 23, 24, 25 FROM dual UNION ALL
	 *  	SELECT 3, 32, 33, 34, 35 FROM dual
	 *
	 * @param introspectedTable		IntrospectedTable
	 * @param answer				XmlElement
	 */
	protected void genInsertByUnionXml(IntrospectedTable introspectedTable,
									   XmlElement answer) {
		XmlElement insertTrimElement = new XmlElement("trim");
		insertTrimElement.addAttribute(new Attribute("prefix", "("));
		insertTrimElement.addAttribute(new Attribute("suffix", ")"));
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ","));

		XmlElement valuesTrimElement = new XmlElement("trim");
		valuesTrimElement.addAttribute(new Attribute("prefix", " "));
		valuesTrimElement.addAttribute(new Attribute("suffix", " "));
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ","));

		StringBuilder sb = new StringBuilder();
		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}
			XmlElement insertNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null");
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if");
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null");
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString()));

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString().replace("#{", "#{listItem.")));
			valuesTrimElement.addElement(valuesNotNullElement);
		}

		String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
		answer.addElement(new TextElement(String.format("insert into %S", tableName)));
		answer.addElement(insertTrimElement);

		XmlElement innerForEach = new XmlElement("foreach");
		innerForEach.addAttribute(new Attribute("collection", "records"));
		innerForEach.addAttribute(new Attribute("item", "listItem"));
		innerForEach.addAttribute(new Attribute("open", " "));
		innerForEach.addAttribute(new Attribute("close", " "));
		innerForEach.addAttribute(new Attribute("separator", "union all"));

		innerForEach.addElement(new TextElement("select"));
		innerForEach.addElement(valuesTrimElement);
		innerForEach.addElement(new TextElement("from dual"));

		answer.addElement(innerForEach);
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

}