package com.atguigu.factory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MySqlSessionFactory {

    public static SqlSession getSqlSession(){

        InputStream inputStream = SqlSessionFactory.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory.openSession();
    }

}
