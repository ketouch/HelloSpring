package edu.nustti.aop02;

/**
 * @author LemonCCC
 * @description 自定义的切面 这种定义方式需要在beans.xml中配置
 * @create 2020/11/16  20:19
 * beans.xml中配置：<!--方法2：定义切面来实现-->
 *         <bean id="myPointCut" class="edu.nustti.aop02.MyPointCut"/>
 *         <aop:config>
 *                 <!--配置切面-->
 *                 <aop:aspect ref="myPointCut" >
 *                         <aop:pointcut id="pointcut" expression="execution(* edu.nustti.service.*.*(..))"/>
 *                         <aop:before method="before" pointcut-ref="pointcut"/>
 *                         <aop:after method="after" pointcut-ref="pointcut"/>
 *                 </aop:aspect>
 *         </aop:config>
 *
 */
public class MyPointCut {
    public void before(){
        System.out.println("[自定义]方法运行前执行...");
    }
    public void after(){
        System.out.println("[自定义]方法运行后执行...");
    }
}
