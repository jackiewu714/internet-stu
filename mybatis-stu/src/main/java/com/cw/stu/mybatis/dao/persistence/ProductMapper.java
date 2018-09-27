package com.cw.stu.mybatis.dao.persistence;

import com.cw.stu.mybatis.dao.domain.Product;

import java.util.List;

/**
 * @author WuLiangzhi  2018/09/27 22:28
 */
public interface ProductMapper {

    /**
     * 查询所有的产品
     * @return
     */
    List<Product> selectProductList();

}
