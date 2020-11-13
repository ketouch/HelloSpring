package edu.nustti.config;


import edu.nustti.entity.Student;
import edu.nustti.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:01
 */
@Configuration //相当于Spring的配置文件
public class StudentConfig {

    //相当于在Spring配置文件中配置了一个bean
    //方法的名字getUser就相当于bean的id属性值
    //方法的返回值就相当于bean中class属性的值
    @Bean
    public Student student(){
        return  new Student(); //返回注入到bean的对象
    }
}
