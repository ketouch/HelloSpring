使用注解形式：
1.定义切面类，该类中直接包含前置和后置方法
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
-- 注意：①类上加了一个@Component注解，就可以代替beans.xml文件中的<bean id="pc" class="edu.nustti.aop3.AnnotationPointCut"/>配置；
        ②然后需要在类上加@Aspect注解，表示这个类是一个切面类
        ③在前置方法前面使用@Before注解，对应value值就是切点的值
        ④在前置方法前面使用@After注解，对应value值就是切点的值

2.在beans.xml中配置
        <!--方法3：使用注解-->
        <!--类上加了@Compontent注解，那么这条配置可以省略-->
        <bean id="annotationPointCut" class="edu.nustti.aop3.AnnotationPointCut"/>
        <!--context:component-scan功能上包含了context:annotation-config-->
        <!--开启注解功能 -->
        <context:annotation-config/>
        <!--开启注解扫描-->
        <context:component-scan base-package="edu.nustti.aop3"/>
        <!--开启注解自动代理-->
        <aop:aspectj-autoproxy/>
