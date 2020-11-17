package edu.nustti.aop3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author LemonCCC
 * @description 注解切点
 * @create 2020/11/16  20:39
 */

@Component //<bean id="annotationPointCut" class="edu.nustti.aop3.AnnotationPointCut"/>
@Aspect
public class AnnotationPointCut {
    @Before(value = "execution(* edu.nustti.service.*.*(..))")
    public void before_annotation() {
        System.out.println("[Annotation]方法运行前执行...");
    }

    @After(value = "execution(* edu.nustti.service.*.*(..))")
    public void after_annotation() {
        System.out.println("[Annotation]方法运行后执行...");
    }
}
