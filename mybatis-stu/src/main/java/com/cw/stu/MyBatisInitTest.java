package com.cw.stu;

import com.alibaba.fastjson.JSON;
import com.cw.stu.mybatis.dao.domain.Product;
import com.cw.stu.mybatis.dao.persistence.ProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

/**
 * mybatis 初始化测试用例
 * @author WuLiangzhi  2018/09/27 22:38
 */
public class MyBatisInitTest {

    public static void main(String[] args) {
        String resource = "configs/mybatis/mybatis-config.xml";
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();

            //获取到mapper，通过mapper进行操作
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            List<Product> productList = productMapper.selectProductList();
            for (Product product : productList) {
                System.out.println("ProductMapper操作: " + JSON.toJSONString(product));
            }

            //使用 SqlSession 封装好的方法进行操作
            List<Product> queryProductList = sqlSession.selectList("com.cw.stu.mybatis.dao.persistence.ProductMapper.selectProductList");
            System.out.println("SqlSession操作, queryProductList: " + JSON.toJSONString(queryProductList));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
