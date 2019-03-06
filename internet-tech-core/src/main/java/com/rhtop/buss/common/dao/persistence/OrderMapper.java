package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.Order;
import com.rhtop.buss.common.dao.domain.OrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderMapper {
    long countByExample(OrderCriteria example);

    int deleteByExample(OrderCriteria example);

    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertListSelective(@Param("record") Order record, @Param("records") List<Order> records);

    int replaceListSelective(@Param("record") Order record, @Param("records") List<Order> records);

    int replaceSelective(Order record);

    int insertOnDuplicateKeySelective(Order record);

    int insertListOnDuplicateKeySelective(@Param("record") Order record, @Param("records") List<Order> records);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderCriteria example, RowBounds rowbounds);

    List<Order> selectByExampleWithBLOBs(OrderCriteria example, RowBounds rowbounds);

    List<Order> selectByExample(OrderCriteria example);

    Order selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderCriteria example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderCriteria example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<Order> listPage(OrderCriteria pagerData);
}