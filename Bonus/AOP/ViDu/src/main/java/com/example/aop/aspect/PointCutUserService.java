package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class PointCutUserService {

    @Before("execution(* com.example.aop.controller.*(..))")
    public void before(JoinPoint joinPoint){
        String className=joinPoint.getTarget().getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        Object[] objects=joinPoint.getArgs();

        System.out.println("Before: =Before Method: "+methodName);

        for(Object args: objects){
            System.out.println("Before: == ARG: "+args);
            System.out.println("Before: == Type of arg: "+args.getClass());
        }

    }
//    @AfterReturning(pointcut = "execution(* com.example.aop.controller.*(..))",returning = "result")
//    public void afterReturning(Object result){
//        System.out.println("After Returning: ==Method returning result: "+result);
//    }
//    @After("execution(* com.example.aop.controller.*(..))")
//    public void after(JoinPoint joinPoint){
//        System.out.println("After: ===After Method: ");
//    }
//    @Around("execution(* com.example.aop.controller.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Around: Before Process");
//        Object result= joinPoint.proceed();
//        System.out.println("Aroud: After Process");
//    }
}
