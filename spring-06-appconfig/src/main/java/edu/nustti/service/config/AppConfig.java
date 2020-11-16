package edu.nustti.service.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:01
 */
@Configuration //相当于Spring的配置文件
@Import({UserConfig.class,StudentConfig.class}) //相当于导入了另一个配置文件
public class AppConfig {

}
