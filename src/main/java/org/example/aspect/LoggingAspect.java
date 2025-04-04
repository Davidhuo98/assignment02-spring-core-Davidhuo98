package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 日志切面类，用于拦截服务层方法执行前后，记录日志信息
 */
@Aspect
@Component
public class LoggingAspect {

    /**
     * 在服务层方法执行前记录方法名称
     *
     * @param joinPoint 切入点对象，包含被拦截方法的信息
     */
    @Before("execution(* org.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("执行方法：" + joinPoint.getSignature().getName());
    }

    /**
     * 在服务层方法抛出异常后记录异常信息
     *
     * @param ex 被拦截方法抛出的异常对象
     */
    @AfterThrowing(pointcut = "execution(* org.example.service.*.*(..))", throwing = "ex")
    public void logException(Exception ex) {
        System.out.println("发生异常：" + ex.getMessage());
    }
}
