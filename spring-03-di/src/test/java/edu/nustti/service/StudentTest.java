package edu.nustti.service;

import edu.nustti.service.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  10:38
 */
public class StudentTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student) context.getBean("student");
        System.out.println(s.getName());
        System.out.println(s.getAddress().getName());
        System.out.println(s.getHobby()[1]);
        System.out.println(s.getTeachers().get(2));
        System.out.println(s.getCourses().get("1"));
        System.out.println(s.getGames());
        System.out.println(s.getProps().getProperty("driver"));
    }
}
