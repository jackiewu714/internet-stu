package com.codegen.platform.dao.mybatis.generator;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.Set;
import java.util.TreeSet;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;
import org.springframework.beans.BeanUtils;

/**
 * @author Jackie
 */
public class SelectByExampleWithPaginationGenerator extends AbstractJavaMapperMethodGenerator {

    public SelectByExampleWithPaginationGenerator() {
        super();
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
        FullyQualifiedJavaType type = new FullyQualifiedJavaType(introspectedTable.getExampleType());
        importedTypes.add(type);
        importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

        FullyQualifiedJavaType rowBoundsType = new FullyQualifiedJavaType(RowBounds.class.getName());
        importedTypes.add(rowBoundsType);

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);

        FullyQualifiedJavaType returnType = FullyQualifiedJavaType.getNewListInstance();
        FullyQualifiedJavaType listType;
        if (introspectedTable.getRules().generateBaseRecordClass()) {
            listType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
        } else if (introspectedTable.getRules().generatePrimaryKeyClass()) {
            listType = new FullyQualifiedJavaType(introspectedTable.getPrimaryKeyType());
        } else {
            throw new RuntimeException(getString("RuntimeError.12")); //$NON-NLS-1$
        }

        importedTypes.add(listType);
        returnType.addTypeArgument(listType);
        method.setReturnType(returnType);

        method.setName(introspectedTable.getSelectByExampleStatementId());
        method.addParameter(new Parameter(type, "example")); //$NON-NLS-1$
        method.addParameter(new Parameter(rowBoundsType, "rowbounds")); //$NON-NLS-1$

        context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);

        addMapperAnnotations(interfaze, method);
        interfaze.addImportedTypes(importedTypes);

        interfaze.addMethod(method);

        Method method2 = new Method();
        BeanUtils.copyProperties(method, method2);
        method2.setName(introspectedTable.getSelectByExampleWithBLOBsStatementId());
        method2.addParameter(new Parameter(type, "example")); //$NON-NLS-1$
        method2.addParameter(new Parameter(rowBoundsType, "rowbounds")); //$NON-NLS-1$
        interfaze.addMethod(method2);

    }

    public void addMapperAnnotations(Interface interfaze, Method method) {
        return;
    }
}