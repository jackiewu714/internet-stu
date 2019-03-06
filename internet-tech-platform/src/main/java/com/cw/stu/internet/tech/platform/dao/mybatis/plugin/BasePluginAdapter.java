package com.cw.stu.internet.tech.platform.dao.mybatis.plugin;

import static org.mybatis.generator.internal.util.JavaBeansUtil.getGetterMethodName;
import static org.mybatis.generator.internal.util.JavaBeansUtil.getSetterMethodName;
import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 
 * @author Jackie
 *
 */
public class BasePluginAdapter extends PluginAdapter {

	private static Configuration config;
	protected IntrospectedTable introspectedTable;

	@Override
	public boolean validate(List<String> warnings) {
		// TODO Auto-generated method stub
		return false;
	}

	public static Configuration getConfig() {
		return config;
	}

	public static void setConfig(Configuration config) {
		BasePluginAdapter.config = config;
	}

	public String getRootClass() {
		String rootClass = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_ROOT_CLASS);
		if (rootClass == null) {
			Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
			rootClass = properties.getProperty(PropertyRegistry.ANY_ROOT_CLASS);
		}

		return rootClass;
	}

	public Field getJavaBeansField(IntrospectedColumn introspectedColumn) {
		FullyQualifiedJavaType fqjt = introspectedColumn.getFullyQualifiedJavaType();
		String property = introspectedColumn.getJavaProperty();

		Field field = new Field();
		field.setVisibility(JavaVisibility.PRIVATE);
		field.setType(fqjt);
		field.setName(property);
		context.getCommentGenerator().addFieldComment(field, introspectedTable, introspectedColumn);

		return field;
	}

	public Method getJavaBeansGetter(IntrospectedColumn introspectedColumn) {
		FullyQualifiedJavaType fqjt = introspectedColumn.getFullyQualifiedJavaType();
		String property = introspectedColumn.getJavaProperty();

		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(fqjt);
		method.setName(getGetterMethodName(property, fqjt));
		context.getCommentGenerator().addGetterComment(method, introspectedTable, introspectedColumn);

		StringBuilder sb = new StringBuilder();
		sb.append("return "); //$NON-NLS-1$
		sb.append(property);
		sb.append(';');
		method.addBodyLine(sb.toString());

		return method;
	}

	public Method getJavaBeansSetter(IntrospectedColumn introspectedColumn) {
		FullyQualifiedJavaType fqjt = introspectedColumn.getFullyQualifiedJavaType();
		String property = introspectedColumn.getJavaProperty();

		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setName(getSetterMethodName(property));
		method.addParameter(new Parameter(fqjt, property));
		context.getCommentGenerator().addSetterComment(method, introspectedTable, introspectedColumn);

		StringBuilder sb = new StringBuilder();
		if (isTrimStringsEnabled() && introspectedColumn.isStringColumn()) {
			sb.append("this."); //$NON-NLS-1$
			sb.append(property);
			sb.append(" = "); //$NON-NLS-1$
			sb.append(property);
			sb.append(" == null ? null : "); //$NON-NLS-1$
			sb.append(property);
			sb.append(".trim();"); //$NON-NLS-1$
			method.addBodyLine(sb.toString());
		} else {
			sb.append("this."); //$NON-NLS-1$
			sb.append(property);
			sb.append(" = "); //$NON-NLS-1$
			sb.append(property);
			sb.append(';');
			method.addBodyLine(sb.toString());
		}

		return method;
	}

	public boolean isTrimStringsEnabled() {
		Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
		boolean rc = isTrue(properties.getProperty(PropertyRegistry.MODEL_GENERATOR_TRIM_STRINGS));
		return rc;
	}

	protected XmlElement getBlobColumnListElement() {
		XmlElement answer = new XmlElement("include"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("refid", //$NON-NLS-1$
				introspectedTable.getBlobColumnListId()));
		return answer;
	}
}
