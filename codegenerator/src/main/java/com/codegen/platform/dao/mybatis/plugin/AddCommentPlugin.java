package com.codegen.platform.dao.mybatis.plugin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

import com.codegen.platform.util.CommentUtil;

/**
 * 向Bean对象中字段添加数据库对字段的注释定义
 * 前提条件数据库字段必须添加了备注，如果未添加备注说明，则bean字段也无相应说明
 * @author 李彬彬
 *
 */
public class AddCommentPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		if (StringUtility.stringHasValue(getContext().getTargetRuntime()) && "MyBatis3".equalsIgnoreCase(getContext().getTargetRuntime()) == false ){
            return false;
        }
		return true;
	}
	
	/**
	 * 为字段属性添加注释说明
	 * @param topLevelClass
	 * @param introspectedTable
	 */
	private void addComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable){
		List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
		List<Field> fields = topLevelClass.getFields();
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		for (Field field : fields) {
			fieldMap.put(field.getName(), field);
		}
		
//		if (StringUtils.isNotEmpty(introspectedTable.getRemarks())){
//			//添加bean对象说明备注，需数据库有表说明
//			topLevelClass.addFileCommentLine(introspectedTable.getRemarks());
//		}
		for (int i=0; i<columns.size(); i++){
			IntrospectedColumn cloumn = columns.get(i);
			if (cloumn != null){
				Field tmp = fieldMap.get(cloumn.getJavaProperty());
				if (StringUtils.isNotEmpty(cloumn.getRemarks())){
//					tmp.addJavaDocLine("//" + cloumn.getRemarks());
					tmp.addJavaDocLine(CommentUtil.generateComment(cloumn.getRemarks()));
				}
			}
		}
	}
	
	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		addComment(topLevelClass, introspectedTable);
		
		return true;
	}
}
