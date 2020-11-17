package edu.nustti;

import edu.nustti.entity.Admin;
import edu.nustti.mapper.AdminMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/17  14:00
 */
public class AdminTest {
    //Mybatis的读取方法
    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        List<Admin> admins = mapper.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    //Mybatis - Spring整合的读取方法  使用sqlSessionFactory
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        List<Admin> admins = mapper.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    //Mybatis - Spring整合的读取方法 直接使用sqlSession
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SqlSession sqlSession = (SqlSession) context.getBean("sqlSession");
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        List<Admin> admins = mapper.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    //Mybatis - Spring整合的读取方法 直接使用AdminMapper
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AdminMapper mapper = context.getBean("adminMapper", AdminMapper.class);
        List<Admin> admins = mapper.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    //Mybatis - Spring整合的读取方法 直接使用AdminMapper2
    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AdminMapper mapper = context.getBean("adminMapper2", AdminMapper.class);
        List<Admin> admins = mapper.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
}
