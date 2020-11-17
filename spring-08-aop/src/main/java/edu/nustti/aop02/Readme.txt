定义切面：
1.定义切面类
public class MyPointCut {
    public void before(){
        System.out.println("方法运行前执行...");
    }
    public void after(){
        System.out.println("方法运行后执行...");
    }
}
2.在beans.xml文件中配置
        <!--方法2：定义切面来实现-->
        <bean id="myPointCut" class="edu.nustti.aop02.MyPointCut"/>
        <aop:config>
                <!--配置切面-->
                <aop:aspect ref="myPointCut" >
                        <aop:pointcut id="pointcut" expression="execution(* edu.nustti.service.*.*(..))"/>
                        <aop:before method="before" pointcut-ref="pointcut"/>
                        <aop:after method="after" pointcut-ref="pointcut"/>
                </aop:aspect>
        </aop:config>