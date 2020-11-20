package edu.nustti;

import edu.nustti.entity.Admin;
import edu.nustti.mapper.AdminMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/19  17:36
 */
public class AdminTest {
    static AdminMapper mapper = null;

    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        mapper = context.getBean("adminMapper", AdminMapper.class);
    }

    @Test
    public void testFindAll() {
        mapper.findAll().forEach(admin -> System.out.println(admin));
    }

    @Test
    public void testInsert() {
        mapper.addAdmin(new Admin(null, "赵山河11", "eee", "eee"));
        mapper.findAll().forEach(admin -> System.out.println(admin));
    }

    @Test
    public void testDelete() {
        mapper.deleteAdmin(new Admin(1, null, null, null));
        mapper.findAll().forEach(admin -> System.out.println(admin));
    }

    @Test
    public void testUpdate() {
        mapper.updateAdmin(new Admin(2, "李老四", "laosiLi", "null"));
        mapper.findAll().forEach(admin -> System.out.println(admin));
    }

    @Test
    public void testFindAdmin() {
        Admin admin = mapper.findAdmin(new Admin(4, null, null, null));
        System.out.println(admin);
    }
}
