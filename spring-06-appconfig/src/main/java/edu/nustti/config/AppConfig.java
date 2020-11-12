package edu.nustti.config;


import edu.nustti.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:01
 */
@Configuration
public class AppConfig {

    @Bean
    public User getUser(){
        return  new User();
    }
}
