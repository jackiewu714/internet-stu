package com.cw.stu.internet.tech.platform.dao.mybatis.plugin;

import static org.mybatis.generator.internal.util.JavaBeansUtil.getGetterMethodName;
import static org.mybatis.generator.internal.util.JavaBeansUtil.getSetterMethodName;
import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.cw.stu.internet.tech.platform.util.CommentUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.RootClassInfo;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 
 * @author Jackie
 * 
 */
public class FlatCauseSupportPlugin extends BasePluginAdapter {
	private IntrospectedTable introspectedTable;
	protected List<String> warnings;

	@Override
	public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		Plugin plugins = context.getPlugins();
		CommentGenerator commentGenerator = context.getCommentGenerator();

		topLevelClass.setVisibility(JavaVisibility.PUBLIC);
		commentGenerator.addJavaFileComment(topLevelClass);

		String rootClass = getRootClass();
		if (rootClass != null) {
			topLevelClass.setSuperClass(new FullyQualifiedJavaType(rootClass));
			topLevelClass.addImportedType(topLevelClass.getSuperClass());
		}

		if (introspectedTable.isConstructorBased()) {
			addParameterizedConstructor(topLevelClass);

			if (!introspectedTable.isImmutable()) {
				addDefaultConstructor(topLevelClass);
			}
		}

		IntrospectedColumn stringColumn = new IntrospectedColumn();
		Field stringField = new Field();
		List<Field> ls = topLevelClass.getFields();
		ls.iterator();
		Set<String> fieldNameSet = new HashSet<String>();
		for (Field f : ls) {
			fieldNameSet.add(f.getName());
		}
		for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
			if (RootClassInfo.getInstance(rootClass, warnings).containsProperty(introspectedColumn)) {
				continue;
			}

			if (fieldNameSet.contains(introspectedColumn.getJavaProperty() + "Range")) {
				continue;
			}
			Field field = getJavaBeansField(introspectedColumn);
			if (field.getType().toString().equals(String.class.getName())) {
				try {
					BeanUtils.copyProperties(stringField, field);
					BeanUtils.copyProperties(stringColumn, introspectedColumn);
					stringField.setName(stringField.getName() + "Range");
					stringColumn.setJavaProperty(stringColumn.getJavaProperty() + "Range");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				fieldNameSet.add(stringField.getName());
				if (plugins.modelFieldGenerated(stringField, topLevelClass, stringColumn, introspectedTable,
						Plugin.ModelClassType.PRIMARY_KEY)) {
					topLevelClass.addField(stringField);
					topLevelClass.addImportedType(stringField.getType());
				}

				Method method = getJavaBeansGetter(stringColumn);
				if (plugins.modelGetterMethodGenerated(method, topLevelClass, stringColumn, introspectedTable,
						Plugin.ModelClassType.PRIMARY_KEY)) {
					topLevelClass.addMethod(method);
				}

				if (!introspectedTable.isImmutable()) {
					method = getJavaBeansSetter(stringColumn);
					if (plugins.modelSetterMethodGenerated(method, topLevelClass, stringColumn, introspectedTable,
							Plugin.ModelClassType.PRIMARY_KEY)) {
						topLevelClass.addMethod(method);
					}
				}
			} else if (field.getType().toString().equals(Date.class.getName())) {
				try {
					Field fieldRange1 = new Field();
					BeanUtils.copyProperties(fieldRange1, field);
					fieldRange1.setName(field.getName() + "Range1");
					IntrospectedColumn column = new IntrospectedColumn();
					BeanUtils.copyProperties(column, introspectedColumn);
					column.setJavaProperty(introspectedColumn.getJavaProperty() + "Range1");
					generateModel(topLevelClass, introspectedTable, plugins, column, fieldRange1);

					Field fieldRange2 = new Field();
					BeanUtils.copyProperties(fieldRange2, field);
					fieldRange2.setName(field.getName() + "Range2");
					column.setJavaProperty(introspectedColumn.getJavaProperty() + "Range2");
					generateModel(topLevelClass, introspectedTable, plugins, column, fieldRange2);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}

		return true;
	}

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		this.introspectedTable = introspectedTable;
		Plugin plugins = context.getPlugins();
		CommentGenerator commentGenerator = context.getCommentGenerator();

		topLevelClass.setVisibility(JavaVisibility.PUBLIC);
		commentGenerator.addJavaFileComment(topLevelClass);

		FullyQualifiedJavaType superClass = getSuperClass();
		if (superClass != null) {
			topLevelClass.setSuperClass(superClass);
			topLevelClass.addImportedType(superClass);
		}

		List<IntrospectedColumn> introspectedColumns = getColumnsInThisClass();

		if (introspectedTable.isConstructorBased()) {
			addParameterizedConstructor(topLevelClass);

			if (!introspectedTable.isImmutable()) {
				addDefaultConstructor(topLevelClass);
			}
		}

		IntrospectedColumn stringColumn = new IntrospectedColumn();
		Field stringField = new Field();

		List<Field> ls = topLevelClass.getFields();
		ls.iterator();
		Set<String> fieldNameSet = new HashSet<String>();
		for (Field f : ls) {
			fieldNameSet.add(f.getName());
		}

		String rootClass = getRootClass();
		for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
			if (RootClassInfo.getInstance(rootClass, warnings).containsProperty(introspectedColumn)) {
				continue;
			}
			if (fieldNameSet.contains(introspectedColumn.getJavaProperty() + "Range")) {
				continue;
			}
			Field field = getJavaBeansField(introspectedColumn);
			generateModel(topLevelClass, introspectedTable, plugins, introspectedColumn, field);
			// 添加说明注释
			if (StringUtils.isNotEmpty(introspectedColumn.getRemarks())) {
				field.addJavaDocLine(CommentUtil.generateComment(introspectedColumn.getRemarks()));
			}
			if (field.getType().toString().equals(String.class.getName())) {
				try {
					Field fieldRange = new Field();
					BeanUtils.copyProperties(fieldRange, field);
					fieldRange.setName(fieldRange.getName() + "Range");
					IntrospectedColumn column = new IntrospectedColumn();
					BeanUtils.copyProperties(column, introspectedColumn);
					column.setJavaProperty(introspectedColumn.getJavaProperty() + "Range");

					generateModel(topLevelClass, introspectedTable, plugins, column, fieldRange);

					BeanUtils.copyProperties(stringColumn, column);
					BeanUtils.copyProperties(stringField, fieldRange);

				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				fieldNameSet.add(stringField.getName());
			} else if (field.getType().toString().equals(Date.class.getName())) {
				try {
					Field fieldRange1 = new Field();
					BeanUtils.copyProperties(fieldRange1, field);
					fieldRange1.setName(field.getName() + "Range1");
					IntrospectedColumn column = new IntrospectedColumn();
					BeanUtils.copyProperties(column, introspectedColumn);
					column.setJavaProperty(introspectedColumn.getJavaProperty() + "Range1");
					generateModel(topLevelClass, introspectedTable, plugins, column, fieldRange1);

					Field fieldRange2 = new Field();
					BeanUtils.copyProperties(fieldRange2, field);
					fieldRange2.setName(field.getName() + "Range2");
					column.setJavaProperty(introspectedColumn.getJavaProperty() + "Range2");
					generateModel(topLevelClass, introspectedTable, plugins, column, fieldRange2);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		stringField.setFinal(false);
		stringField.setStatic(false);
		FullyQualifiedJavaType fullyQualifiedJavaType = new FullyQualifiedJavaType("java.lang.String");
		stringField.setType(fullyQualifiedJavaType);
		stringField.setVisibility(JavaVisibility.PRIVATE);
		stringField.setName("extracClause");
		stringColumn.setJavaProperty("extracClause");
		stringColumn.setFullyQualifiedJavaType(fullyQualifiedJavaType);
		generateModel(topLevelClass, introspectedTable, plugins, stringColumn, stringField);

		IntrospectedColumn stringColumn2 = new IntrospectedColumn();
		Field stringField2 = new Field();

		try {
			BeanUtils.copyProperties(stringColumn2, stringColumn);
			BeanUtils.copyProperties(stringField2, stringField);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		stringField2.setName("extracSelectColunm");
		stringColumn2.setJavaProperty("extracSelectColunm");
		generateModel(topLevelClass, introspectedTable, plugins, stringColumn2, stringField2);

		IntrospectedColumn stringColumn3 = new IntrospectedColumn();
		Field stringField3 = new Field();

		try {
			BeanUtils.copyProperties(stringColumn3, stringColumn);
			BeanUtils.copyProperties(stringField3, stringField);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		stringField3.setName("extracTable");
		stringColumn3.setJavaProperty("extracTable");
		generateModel(topLevelClass, introspectedTable, plugins, stringColumn3, stringField3);

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

	private void addParameterizedConstructor(TopLevelClass topLevelClass) {
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setConstructor(true);
		method.setName(topLevelClass.getType().getShortName());

		List<IntrospectedColumn> constructorColumns = includeBLOBColumns() ? introspectedTable.getAllColumns()
				: introspectedTable.getNonBLOBColumns();

		for (IntrospectedColumn introspectedColumn : constructorColumns) {
			method.addParameter(new Parameter(introspectedColumn.getFullyQualifiedJavaType(),
					introspectedColumn.getJavaProperty()));
		}

		StringBuilder sb = new StringBuilder();
		if (introspectedTable.getRules().generatePrimaryKeyClass()) {
			boolean comma = false;
			sb.append("super("); //$NON-NLS-1$
			for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
				if (comma) {
					sb.append(", "); //$NON-NLS-1$
				} else {
					comma = true;
				}
				sb.append(introspectedColumn.getJavaProperty());
			}
			sb.append(");"); //$NON-NLS-1$
			method.addBodyLine(sb.toString());
		}

		List<IntrospectedColumn> introspectedColumns = getColumnsInThisClass();

		for (IntrospectedColumn introspectedColumn : introspectedColumns) {
			sb.setLength(0);
			sb.append("this."); //$NON-NLS-1$
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(" = "); //$NON-NLS-1$
			sb.append(introspectedColumn.getJavaProperty());
			sb.append(';');
			method.addBodyLine(sb.toString());
		}

		topLevelClass.addMethod(method);
	}

	private FullyQualifiedJavaType getSuperClass() {
		FullyQualifiedJavaType superClass;
		if (introspectedTable.getRules().generatePrimaryKeyClass()) {
			superClass = new FullyQualifiedJavaType(introspectedTable.getPrimaryKeyType());
		} else {
			String rootClass = getRootClass();
			if (rootClass != null) {
				superClass = new FullyQualifiedJavaType(rootClass);
			} else {
				superClass = null;
			}
		}

		return superClass;
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
		// 如果是like模糊匹配，增加前后模糊关键字%
		if ("like".equals(operator)) {
			sb.append("concat('%',#{" + introspectedColumn.getJavaProperty(prefix) + "},'%')"); //$NON-NLS-1$
		} else {
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, prefix)); // $NON-NLS-1$
		}

		isNotNullElement.addElement(new TextElement(sb.toString()));
	}

	/**
	 * This plugin is always valid - no properties are required
	 */
	@Override
    public boolean validate(List<String> warnings) {
		return true;
	}

	protected void addDefaultConstructor(TopLevelClass topLevelClass) {
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setConstructor(true);
		method.setName(topLevelClass.getType().getShortName());
		method.addBodyLine("super();"); //$NON-NLS-1$
		topLevelClass.addMethod(method);
	}

	@Override
	public String getRootClass() {
		String rootClass = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_ROOT_CLASS);
		if (rootClass == null) {
			Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
			rootClass = properties.getProperty(PropertyRegistry.ANY_ROOT_CLASS);
		}

		return rootClass;
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

	@Override
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

	@Override
	public boolean isTrimStringsEnabled() {
		Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
		boolean rc = isTrue(properties.getProperty(PropertyRegistry.MODEL_GENERATOR_TRIM_STRINGS));
		return rc;
	}

	@Override
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

	@Override
	public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement answer,
			IntrospectedTable introspectedTable) {
		answer.getElements().clear();

		context.getCommentGenerator().addComment(answer);

		StringBuilder sb = new StringBuilder();
		sb.append("update "); //$NON-NLS-1$
		sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
		answer.addElement(new TextElement(sb.toString()));

		// set up for first column
		sb.setLength(0);
		sb.append("set "); //$NON-NLS-1$

		List<IntrospectedColumn> cols = new ArrayList<IntrospectedColumn>();
		cols.addAll(introspectedTable.getBaseColumns());
		cols.addAll(introspectedTable.getBLOBColumns());
		Iterator<IntrospectedColumn> iter = cols.iterator();
		while (iter.hasNext()) {
			IntrospectedColumn introspectedColumn = iter.next();

			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(" = "); //$NON-NLS-1$
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));

			if (iter.hasNext()) {
				sb.append(',');
			}

			answer.addElement(new TextElement(sb.toString()));

			// set up for the next column
			if (iter.hasNext()) {
				sb.setLength(0);
				OutputUtilities.xmlIndent(sb, 1);
			}
		}

		boolean and = false;
		for (IntrospectedColumn introspectedColumn : introspectedTable.getPrimaryKeyColumns()) {
			sb.setLength(0);
			if (and) {
				sb.append("  and "); //$NON-NLS-1$
			} else {
				sb.append("where "); //$NON-NLS-1$
				and = true;
			}

			sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
			sb.append(" = "); //$NON-NLS-1$
			sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
			answer.addElement(new TextElement(sb.toString()));
		}
		return true;
	}

}