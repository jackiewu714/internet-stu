package com.rhtop.buss.common.dao.sys.persistence;

import com.rhtop.buss.common.dao.sys.domain.FileAttach;
import com.rhtop.buss.common.dao.sys.domain.FileAttachCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FileAttachMapper {
    long countByExample(FileAttachCriteria example);

    int deleteByExample(FileAttachCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileAttach record);

    int insertListSelective(@Param("record") FileAttach record, @Param("records") List<FileAttach> records);

    int replaceListSelective(@Param("record") FileAttach record, @Param("records") List<FileAttach> records);

    int replaceSelective(FileAttach record);

    int insertOnDuplicateKeySelective(FileAttach record);

    int insertListOnDuplicateKeySelective(@Param("record") FileAttach record, @Param("records") List<FileAttach> records);

    int insertSelective(FileAttach record);

    List<FileAttach> selectByExample(FileAttachCriteria example, RowBounds rowbounds);

    List<FileAttach> selectByExampleWithBLOBs(FileAttachCriteria example, RowBounds rowbounds);

    List<FileAttach> selectByExample(FileAttachCriteria example);

    FileAttach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileAttach record, @Param("example") FileAttachCriteria example);

    int updateByExample(@Param("record") FileAttach record, @Param("example") FileAttachCriteria example);

    int updateByPrimaryKeySelective(FileAttach record);

    int updateByPrimaryKey(FileAttach record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<FileAttach> listPage(FileAttachCriteria pagerData);
}