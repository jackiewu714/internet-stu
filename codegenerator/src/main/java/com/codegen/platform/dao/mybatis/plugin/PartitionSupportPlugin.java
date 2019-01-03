package com.codegen.platform.dao.mybatis.plugin;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

/**
 * 
 * @author Jackie
 * 
 */
public class PartitionSupportPlugin extends BasePluginAdapter {
	private IntrospectedTable introspectedTable;
	protected List<String> warnings;

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		Plugin plugins = context.getPlugins();

		IntrospectedColumn stringColumn = new IntrospectedColumn();
		Field stringField = new Field();

		stringField.setFinal(false);
		stringField.setStatic(false);
		FullyQualifiedJavaType fullyQualifiedJavaType = new FullyQualifiedJavaType("java.lang.String");
		stringField.setType(fullyQualifiedJavaType);
		stringField.setVisibility(JavaVisibility.PRIVATE);
		stringField.setName("tableSuffix");
		stringColumn.setJavaProperty("tableSuffix");
		stringColumn.setFullyQualifiedJavaType(fullyQualifiedJavaType);
		generateModel(topLevelClass, introspectedTable, plugins, stringColumn, stringField);

		return true;
	}

	private void generateModel(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, Plugin plugins,
			IntrospectedColumn introspectedColumn, Field field) {
		if (plugins.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable,
				Plugin.ModelClassType.BASE_RECORD)) {
			topLevelClass.addField(field);
			topLevelClass.addImportedType(field.getType());
		}

		Method method = getJavaBeansGetter(introspectedColumn);
		if (plugins.modelGetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable,
				Plugin.ModelClassType.BASE_RECORD)) {
			topLevelClass.addMethod(method);
		}

		if (!introspectedTable.isImmutable()) {
			method = getJavaBeansSetter(introspectedColumn);
			if (plugins.modelSetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable,
					Plugin.ModelClassType.BASE_RECORD)) {
				topLevelClass.addMethod(method);
			}
		}
	}

	@Override
	public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		StringBuilder sb = new StringBuilder();
		String prefix = "";
		if (element.getAttributes().get(0).getValue().equals("Update_By_Example_Where_Clause")) {
			prefix = "example.";
		}
		XmlElement dynamicElement = (XmlElement) element.getElements().get(0);
		XmlElement oredElement = (XmlElement) dynamicElement.getElements().get(0);
		XmlElement oredTestElement = new XmlElement("if"); //$NON-NLS-1$
		sb.setLength(0);
		sb.append(oredElement.getAttributes().get(0).getValue()); // $NON-NLS-1$
		sb.append(" != null"); //$NON-NLS-1$
		oredTestElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
		oredTestElement.addElement(oredElement);
		dynamicElement.getElements().remove(0);
		dynamicElement.addElement(oredTestElement);
		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			generateMapXml(dynamicElement, sb, introspectedColumn, "=", prefix);
			try {
				if (introspectedColumn.getFullyQualifiedJavaType().toString().equals(String.class.getName())) {
					IntrospectedColumn column = new IntrospectedColumn();
					BeanUtils.copyProperties(column, introspectedColumn);
					column.setJavaProperty(column.getJavaProperty() + "Range");
					generateMapXml(dynamicElement, sb, column, "like", prefix);
				} else if (introspectedColumn.getFullyQualifiedJavaType().toString().equals(Date.class.getName())) {
					IntrospectedColumn column1 = new IntrospectedColumn();
					BeanUtils.copyProperties(column1, introspectedColumn);
					column1.setJavaProperty(column1.getJavaProperty() + "Range1");
					generateMapXml(dynamicElement, sb, column1, "&gt;=", prefix);

					IntrospectedColumn column2 = new IntrospectedColumn();
					BeanUtils.copyProperties(column2, introspectedColumn);
					column2.setJavaProperty(column2.getJavaProperty() + "Range2");
					generateMapXml(dynamicElement, sb, column2, "&lt;=", prefix);
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		generateExtracXml(dynamicElement, prefix);

		return true;
	}

	private void generateExtracXml(XmlElement dynamicElement, String prefix) {
		StringBuilder sb = new StringBuilder();
		XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
		sb.setLength(0);
		sb.append(prefix + "extracClause"); //$NON-NLS-1$
		sb.append(" != null"); //$NON-NLS-1$
		sb.append(" and "); //$NON-NLS-1$
		sb.append(prefix + "extracClause"); //$NON-NLS-1$
		sb.append(" != ''"); //$NON-NLS-1$
		isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
		dynamicElement.addElement(isNotNullElement);

		sb.setLength(0);
		sb.append(" and "); //$NON-NLS-1$
		sb.append(" ${" + prefix + "extracClause} "); //$NON-NLS-1$

		isNotNullElement.addElement(new TextElement(sb.toString()));

	}

	private void generateMapXml(XmlElement dynamicElement, StringBuilder sb, IntrospectedColumn introspectedColumn,
			String operator, String prefix) {
		XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
		sb.setLength(0);
		sb.append(prefix + introspectedColumn.getJavaProperty()); // $NON-NLS-1$
		sb.append(" != null"); //$NON-NLS-1$
		sb.append(" and "); //$NON-NLS-1$
		sb.append(prefix + introspectedColumn.getJavaProperty()); // $NON-NLS-1$
		sb.append(" != ''"); //$NON-NLS-1$
		isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
		dynamicElement.addElement(isNotNullElement);

		sb.setLength(0);
		sb.append(" and "); //$NON-NLS-1$
		sb.append(MyBatis3FormattingUtilities.getAliasedEscapedColumnName(introspectedColumn));
		sb.append(" " + operator + " "); //$NON-NLS-1$
		sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, prefix)); // $NON-NLS-1$

		isNotNullElement.addElement(new TextElement(sb.toString()));
	}

	/**
	 * This plugin is always valid - no properties are required
	 */
	public boolean validate(List<String> warnings) {
		return true;
	}

}