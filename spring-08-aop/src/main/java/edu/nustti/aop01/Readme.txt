定义切点：
1.定义前置执行类
public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[Before]"+target.getClass().getName() + "的( " + method.getName() + " )方法被调用了!");
    }
}
2.定义后置执行类
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[After]"+target.getClass().getName() + "的( " + method.getName() + " )方法被调用了!");
    }
}
3.在beans.xml中配置
        <!--方法1：Spring API 接口实现-->
        <aop:config>
                <!-- 配置切入点，就是需要执行AOP操作的方法 -->
                <aop:pointcut id="pointcut" expression="execution(* edu.nustti.service.*.*(..))"/>
                <!-- 配置执行AOP操作的方法的前后方法，就比如一个方法要开启事务，这里就配置事务操作 -->
                <aop:advisor advice-ref="beforeLog" pointcut-ref="pointcut"/>
                <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
        </aop:config>
