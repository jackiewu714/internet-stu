package com.codegen.platform.dao.mybatis.plugin;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
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
import org.mybatis.generator.internal.util.StringUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codegen.platform.dao.mybatis.generator.BaseGenerator;
import com.codegen.platform.dao.mybatis.util.XmlElementGeneratorTools;

/**
 * 在bean对象中创建分页对象属性。和分页组件配合使用
 * @author 李彬彬
 *
 */
public class PagerPlugin extends PluginAdapter {
	//分页默认方法
	public static final String METHOD_NAME = "listPage"; 
	
	private static final Logger logger = LoggerFactory.getLogger(PagerPlugin.class);


    public PagerPlugin() {
    }
	
	@Override
	public boolean validate(List<String> warnings) {
		if (StringUtility.stringHasValue(getContext().getTargetRuntime()) && "MyBatis3".equalsIgnoreCase(getContext().getTargetRuntime()) == false ){
            return false;
        }
		return true;
	}
	
	/**
	 * 在Bean对象中创建分页属性对象
	 * @param topLevelClass
	 */
	private void createPagerObject(TopLevelClass topLevelClass){
		//查看配置的包前缀名
//        String mainPackage = getContext().getProperty("mainpackage");
        String mainPackage = BaseGenerator.getProperty("pageObjPackage");
//        String mainPackage = "com.platform.page"; //for test
        //导入分页对象
        topLevelClass.addImportedType(mainPackage+".Page");
        FullyQualifiedJavaType pageJava = new FullyQualifiedJavaType("Page");
        //创建分页对象字段
        Field pagerField = new Field("page", pageJava);
        pagerField.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(pagerField);
        
        Method setPager = new Method();
        setPager.setVisibility(JavaVisibility.PUBLIC);
        setPager.setName("setPage");
        setPager.addParameter(new Parameter(pageJava, "page"));
        setPager.addBodyLine("this.page = page;");
        topLevelClass.addMethod(setPager);

        Method getPager = new Method();
        getPager.setVisibility(JavaVisibility.PUBLIC);
        getPager.setReturnType(pageJava);
        getPager.setName("getPage");
        getPager.addBodyLine("return this.page;");
        topLevelClass.addMethod(getPager);
        
        logger.info("modelExampleClassGenerated createPagerObject end, className={}", topLevelClass.getType());
	}
	
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		createPagerObject(topLevelClass);
        return true;
	}

	/**
     * Java Client Methods 生成（Mapper文件）
     * 具体执行顺序 http://www.mybatis.org/generator/reference/pluggingIn.html
     *
     * @param interfaze
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 方法生成
        Method method = new Method(METHOD_NAME);
        // 方法可见性 interface会忽略
        // method.setVisibility(JavaVisibility.PUBLIC);
        // 返回值类型
        FullyQualifiedJavaType returnType = FullyQualifiedJavaType.getNewListInstance();
        returnType.addTypeArgument(introspectedTable.getRules().calculateAllFieldsClass());
        method.setReturnType(returnType);
        // 添加参数
        FullyQualifiedJavaType type = new FullyQualifiedJavaType(introspectedTable.getExampleType());
        method.addParameter(new Parameter(type, "pagerData"));
        // 添加方法说明        
        method.addJavaDocLine("/**"); //$NON-NLS-1$
        method.addJavaDocLine(" * 分页方法，方法名后缀必须以"+METHOD_NAME+"结尾");
        method.addJavaDocLine(" * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml ");
        method.addJavaDocLine(" */"); //$NON-NLS-1$

        // interface 增加方法
        interfaze.addMethod(method);
        return true;
    }
    
    /**
     * SQL Map Methods 生成
     * 具体执行顺序 http://www.mybatis.org/generator/reference/pluggingIn.html
     *
     * @param document
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        //数据库表名
        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();

        // 生成查询语句
        XmlElement listPageElement = new XmlElement("select");
        // 添加注释(!!!必须添加注释，overwrite覆盖生成时，@see XmlFileMergerJaxp.isGeneratedNode会去判断注释中是否存在OLD_ELEMENT_TAGS中的一点，例子：@mbg.generated)
        //CommentTools.addComment(listPageElement);

        // 添加ID
        listPageElement.addAttribute(new Attribute("id", METHOD_NAME));

        // ----------------------------------------- 表中是否有blob类型字段 ---------------------------------------
        if (introspectedTable.hasBLOBColumns()){
            // 添加返回类型
            listPageElement.addAttribute(new Attribute("resultMap", introspectedTable.getResultMapWithBLOBsId()));
            // 添加参数类型
            listPageElement.addAttribute(new Attribute("parameterType", introspectedTable.getExampleType()));
            // 添加查询SQL
            listPageElement.addElement(new TextElement("select")); //$NON-NLS-1$

            StringBuilder sb = new StringBuilder();
            if (StringUtils.isNotEmpty(introspectedTable.getSelectByExampleQueryId())) {
                sb.append('\'');
                sb.append(introspectedTable.getSelectByExampleQueryId());
                sb.append("' as QUERYID,"); //$NON-NLS-1$
                listPageElement.addElement(new TextElement(sb.toString()));
            }

            listPageElement.addElement(XmlElementGeneratorTools.getBaseColumnListElement(introspectedTable));
            listPageElement.addElement(new TextElement(",")); //$NON-NLS-1$
            listPageElement.addElement(XmlElementGeneratorTools.getBlobColumnListElement(introspectedTable));

            sb.setLength(0);
            sb.append("from "); //$NON-NLS-1$
            sb.append(introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
            listPageElement.addElement(new TextElement(sb.toString()));
            listPageElement.addElement(XmlElementGeneratorTools.getExampleIncludeElement(introspectedTable));

            XmlElement ifElement = new XmlElement("if"); //$NON-NLS-1$
            ifElement.addAttribute(new Attribute("test", "orderByClause != null")); //$NON-NLS-1$ //$NON-NLS-2$
            ifElement.addElement(new TextElement("order by ${orderByClause}")); //$NON-NLS-1$
            listPageElement.addElement(ifElement);
        } else {
            // 添加返回类型
            listPageElement.addAttribute(new Attribute("resultMap", introspectedTable.getBaseResultMapId()));
            // 添加参数类型
            listPageElement.addAttribute(new Attribute("parameterType", introspectedTable.getExampleType()));
            listPageElement.addElement(new TextElement("select")); //$NON-NLS-1$

            StringBuilder sb = new StringBuilder();
            if (StringUtils.isNotEmpty(introspectedTable.getSelectByExampleQueryId())) {
                sb.append('\'');
                sb.append(introspectedTable.getSelectByExampleQueryId());
                sb.append("' as QUERYID,"); //$NON-NLS-1$
                listPageElement.addElement(new TextElement(sb.toString()));
            }
            listPageElement.addElement(XmlElementGeneratorTools.getBaseColumnListElement(introspectedTable));

            sb.setLength(0);
            sb.append("from "); //$NON-NLS-1$
            sb.append(introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
            listPageElement.addElement(new TextElement(sb.toString()));
            listPageElement.addElement(XmlElementGeneratorTools.getExampleIncludeElement(introspectedTable));

            XmlElement ifElement = new XmlElement("if"); //$NON-NLS-1$
            ifElement.addAttribute(new Attribute("test", "orderByClause != null")); //$NON-NLS-1$ //$NON-NLS-2$
            ifElement.addElement(new TextElement("order by ${orderByClause}")); //$NON-NLS-1$
            listPageElement.addElement(ifElement);

        }

        // 添加到根节点
        document.getRootElement().addElement(listPageElement);
        logger.debug("itfsw(查询单条数据插件):"+introspectedTable.getMyBatis3XmlMapperFileName()+"增加SelectOneByExample方法("+(introspectedTable.hasBLOBColumns() ? "有" : "无")+"Blob类型))。");

        return true;
    }
}
