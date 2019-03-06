/**
 * @Title: DataTablesQryCriteira.java
 * @Description: datatables 查询条件criteria
 * Copyright: Copyright (c) 2018
 * @author WuLiangzhi
 * @date May 30, 2016 2:47:55 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.datatables.model;

/**
 * @ClassName: DataTablesQryCriteira
 * @Description: datatables 查询条件criteria
 * @author WuLiangzhi
 * @date May 30, 2016 2:47:55 PM
 *
 */

public class DataTablesQryCriteira {

    protected String orderByClause; //排序条件

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
}
