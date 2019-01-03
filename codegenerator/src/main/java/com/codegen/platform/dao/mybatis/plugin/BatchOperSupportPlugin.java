package com.codegen.platform.dao.mybatis.plugin;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.springframework.beans.BeanUtils;

/**
 * 
 * @author Jackie
 * 
 */
public class BatchOperSupportPlugin extends BasePluginAdapter {

	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		this.sqlMapInsertListSelectiveElementGenerated(document.getRootElement(), introspectedTable);
		this.sqlMapReplaceListSelectiveElementGenerated(document.getRootElement(), introspectedTable);
		this.sqlMapReplaceSelectiveElementGenerated(document.getRootElement(), introspectedTable);
		this.sqlMapInsertOnDuplicateKeySelectiveElementGenerated(document.getRootElement(), introspectedTable);
		this.sqlMapInsertListOnDuplicateKeySelectiveElementGenerated(document.getRootElement(), introspectedTable);
		return true;
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method _method, Interface interfaze,
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
		method.addParameter(new Parameter(parameterType, "record", "@Param(\"record\")")); //$NON-NLS-1$
		method.addParameter(new Parameter(listParameterType, "records", "@Param(\"records\")")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		clientReplaceListSelectiveMethodGenerated(_method, interfaze, introspectedTable);
		clientReplaceSelectiveMethodGenerated(_method, interfaze, introspectedTable);
		clientInsertOnDuplicateKeySelectiveMethodGenerated(_method, interfaze, introspectedTable);
		clientInsertListOnDuplicateKeySelectiveMethodGenerated(_method, interfaze, introspectedTable);
		return true;
	}

	public boolean clientReplaceListSelectiveMethodGenerated(Method _method, Interface interfaze,
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

		method.setName("replaceListSelective");
		method.addParameter(new Parameter(parameterType, "record", "@Param(\"record\")")); //$NON-NLS-1$
		method.addParameter(new Parameter(listParameterType, "records", "@Param(\"records\")")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public boolean clientReplaceSelectiveMethodGenerated(Method _method, Interface interfaze,
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

		method.setName("replaceSelective");
		method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public boolean clientInsertOnDuplicateKeySelectiveMethodGenerated(Method _method, Interface interfaze,
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

		method.setName("insertOnDuplicateKeySelective");
		method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public boolean clientInsertListOnDuplicateKeySelectiveMethodGenerated(Method _method, Interface interfaze,
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

		method.setName("insertListOnDuplicateKeySelective");
		method.addParameter(new Parameter(parameterType, "record", "@Param(\"record\")")); //$NON-NLS-1$
		method.addParameter(new Parameter(listParameterType, "records", "@Param(\"records\")")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
		interfaze.addImportedTypes(importedTypes);
		addMapperAnnotations(interfaze, method);
		return true;
	}

	public void addMapperAnnotations(Interface interfaze, Method method) {
		interfaze.addMethod(method);
		return;
	}

	public boolean sqlMapInsertListSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;

		XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "insertListSelective")); //$NON-NLS-1$
		answer.addAttribute(new Attribute("parameterType", "map")); //$NON-NLS-1$

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

		sb.append("insert into "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		genInsertXml(introspectedTable, answer, sb);

		return true;
	}

	public boolean sqlMapInsertListOnDuplicateKeySelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;

		XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "insertListOnDuplicateKeySelective")); //$NON-NLS-1$
		answer.addAttribute(new Attribute("parameterType", "map")); //$NON-NLS-1$

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

		sb.append("insert into "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		genInsertXml(introspectedTable, answer, sb);

		sb.setLength(0);
		sb.append(" on duplicate key update ");
		answer.addElement(new TextElement(sb.toString()));

		XmlElement updateTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		updateTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(updateTrimElement);

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}

			XmlElement updateNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null"); //$NON-NLS-1$
			updateNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn) + "=values("
					+ MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn) + ")");
			sb.append(',');
			updateNotNullElement.addElement(new TextElement(sb.toString()));
			updateTrimElement.addElement(updateNotNullElement);
		}
		return true;
	}

	public void genInsertXml(IntrospectedTable introspectedTable, XmlElement answer, StringBuilder sb) {
		XmlElement insertTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		insertTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(insertTrimElement);

		XmlElement valuesTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		valuesTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}

			/*
			 * if (introspectedColumn.isSequenceColumn() ||
			 * introspectedColumn.getFullyQualifiedJavaType().isPrimitive()) {
			 * // if it is a sequence column, it is not optional // This is
			 * required for MyBatis3 because MyBatis3 parses // and calculates
			 * the SQL before executing the selectKey
			 * 
			 * // if it is primitive, we cannot do a null check sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(
			 * introspectedColumn)); sb.append(',');
			 * insertTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getParameterClause(
			 * introspectedColumn)); sb.append(',');
			 * valuesTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * continue; }
			 */

			XmlElement insertNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null"); //$NON-NLS-1$
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty("record."));
			sb.append(" != null"); //$NON-NLS-1$
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString().replace("#{", "#{listItem.")));
			valuesTrimElement.addElement(valuesNotNullElement);
		}

		XmlElement innerForEach = new XmlElement("foreach"); //$NON-NLS-1$
		innerForEach.addAttribute(new Attribute("collection", "records")); //$NON-NLS-1$ //$NON-NLS-2$
		innerForEach.addAttribute(new Attribute("item", "listItem")); //$NON-NLS-1$ //$NON-NLS-2$
		innerForEach.addAttribute(new Attribute("open", "values ")); //$NON-NLS-1$ //$NON-NLS-2$
		innerForEach.addAttribute(new Attribute("close", " ")); //$NON-NLS-1$ //$NON-NLS-2$
		innerForEach.addAttribute(new Attribute("separator", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		innerForEach.addElement(valuesTrimElement);
		answer.addElement(innerForEach);
	}

	public boolean sqlMapReplaceListSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;

		XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "replaceListSelective")); //$NON-NLS-1$
		answer.addAttribute(new Attribute("parameterType", "map")); //$NON-NLS-1$

		element.addElement(answer);

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

		sb.append("replace into "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		genInsertXml(introspectedTable, answer, sb);

		return true;
	}

	public boolean sqlMapReplaceSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
		element.addElement(answer);

		answer.addAttribute(new Attribute("id", "replaceSelective")); //$NON-NLS-1$

		FullyQualifiedJavaType parameterType = introspectedTable.getRules().calculateAllFieldsClass();

		answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
				parameterType.getFullyQualifiedName()));

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

		sb.append("replace into "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		XmlElement insertTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		insertTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(insertTrimElement);

		XmlElement valuesTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		valuesTrimElement.addAttribute(new Attribute("prefix", "values (")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(valuesTrimElement);

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}

			/*
			 * if (introspectedColumn.isSequenceColumn() ||
			 * introspectedColumn.getFullyQualifiedJavaType().isPrimitive()) {
			 * // if it is a sequence column, it is not optional // This is
			 * required for MyBatis3 because MyBatis3 parses // and calculates
			 * the SQL before executing the selectKey
			 * 
			 * // if it is primitive, we cannot do a null check sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(
			 * introspectedColumn)); sb.append(',');
			 * insertTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getParameterClause(
			 * introspectedColumn)); sb.append(',');
			 * valuesTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * continue; }
			 */

			XmlElement insertNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" != null"); //$NON-NLS-1$
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" != null"); //$NON-NLS-1$
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString()));
			valuesTrimElement.addElement(valuesNotNullElement);
		}
		return true;
	}

	public boolean sqlMapInsertOnDuplicateKeySelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
		element.addElement(answer);

		answer.addAttribute(new Attribute("id", "insertOnDuplicateKeySelective")); //$NON-NLS-1$

		FullyQualifiedJavaType parameterType = introspectedTable.getRules().calculateAllFieldsClass();

		answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
				parameterType.getFullyQualifiedName()));

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();

		sb.append("insert into "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		XmlElement insertTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		insertTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		insertTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(insertTrimElement);

		XmlElement valuesTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		valuesTrimElement.addAttribute(new Attribute("prefix", "values (")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
		valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(valuesTrimElement);

		sb.setLength(0);
		sb.append(" on duplicate key update ");
		answer.addElement(new TextElement(sb.toString()));

		XmlElement updateTrimElement = new XmlElement("trim"); //$NON-NLS-1$
		updateTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(updateTrimElement);

		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (introspectedColumn.isIdentity()) {
				// cannot set values on identity fields
				// continue;
			}

			/*
			 * if (introspectedColumn.isSequenceColumn() ||
			 * introspectedColumn.getFullyQualifiedJavaType().isPrimitive()) {
			 * // if it is a sequence column, it is not optional // This is
			 * required for MyBatis3 because MyBatis3 parses // and calculates
			 * the SQL before executing the selectKey
			 * 
			 * // if it is primitive, we cannot do a null check sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(
			 * introspectedColumn)); sb.append(',');
			 * insertTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * sb.setLength(0);
			 * sb.append(MyBatis3FormattingUtilities.getParameterClause(
			 * introspectedColumn)); sb.append(',');
			 * valuesTrimElement.addElement(new TextElement(sb.toString()));
			 * 
			 * continue; }
			 */

			XmlElement insertNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" != null"); //$NON-NLS-1$
			insertNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(',');
			insertNotNullElement.addElement(new TextElement(sb.toString()));
			insertTrimElement.addElement(insertNotNullElement);

			XmlElement valuesNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" != null"); //$NON-NLS-1$
			valuesNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			sb.append(',');
			valuesNotNullElement.addElement(new TextElement(sb.toString()));
			valuesTrimElement.addElement(valuesNotNullElement);

			XmlElement updateNotNullElement = new XmlElement("if"); //$NON-NLS-1$
			sb.setLength(0);
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" != null"); //$NON-NLS-1$
			updateNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$

			sb.setLength(0);
			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn) + "=values("
					+ MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn) + ")");
			sb.append(',');
			updateNotNullElement.addElement(new TextElement(sb.toString()));
			updateTrimElement.addElement(updateNotNullElement);
		}
		return true;
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