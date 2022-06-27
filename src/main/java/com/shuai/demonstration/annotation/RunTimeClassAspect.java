package com.shuai.demonstration.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author Yangs
 */
@Slf4j
@Aspect
@Component
public class RunTimeClassAspect {

    /**
     * * @within 用于类上, 会对类下的所有方法生效
     * */
    @Pointcut("@within(RunTimeClass)")
    public void doCut() {

    }

    /**
     * 前置通知, 进入方法之前执行
     * */
    @Before(value = "doCut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("切面逻辑, 请求入参: {}", joinPoint.getArgs());
        log.info("切面逻辑, 请求的目标对象: {}", joinPoint.getTarget());
        log.info("切面逻辑, 请求的源对象: {}", joinPoint.getSourceLocation());
        log.info("前置通知执行......");
    }

    /**
     * 后置通知
     * */
    @After(value = "doCut()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("后置通知执行......");
    }

    /**
     * 环绕通知
     * * @Around比@After后执行
     * */
    @Around(value = "doCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        stopWatch.stop();
        log.info("环绕通知执行......, 执行时间: {}", stopWatch.getLastTaskTimeMillis());
        return proceed;
    }
}
