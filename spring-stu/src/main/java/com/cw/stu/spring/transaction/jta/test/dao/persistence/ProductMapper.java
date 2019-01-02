package com.cw.stu.spring.transaction.jta.test.dao.persistence;

import com.cw.stu.spring.transaction.jta.test.dao.domain.Product;
import com.cw.stu.spring.transaction.jta.test.dao.domain.ProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductMapper {
    long countByExample(ProductCriteria example);

    int deleteByExample(ProductCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    int insertListSelective(@Param("record") Product record, @Param("records") List<Product> records);

    int replaceListSelective(@Param("record") Product record, @Param("records") List<Product> records);

    int replaceSelective(Product record);

    int insertOnDuplicateKeySelective(Product record);

    int insertListOnDuplicateKeySelective(@Param("record") Product record, @Param("records") List<Product> records);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductCriteria example, RowBounds rowbounds);

    List<Product> selectByExampleWithBLOBs(ProductCriteria example, RowBounds rowbounds);

    List<Product> selectByExample(ProductCriteria example);

    Product selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductCriteria example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductCriteria example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}