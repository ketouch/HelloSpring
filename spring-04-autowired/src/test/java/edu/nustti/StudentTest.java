package edu.nustti;

import edu.nustti.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  14:19
 */
public class StudentTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student stu= context.getBean("student", Student.class);
        stu.show();
    }
}
