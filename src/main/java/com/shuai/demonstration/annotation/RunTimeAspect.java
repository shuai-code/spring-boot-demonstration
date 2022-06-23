package com.shuai.demonstration.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Yangs
 */
@Slf4j
@Aspect
@Component
public class RunTimeAspect {

    /**
     * * @annotation 用于方法上, 对当前方法生效
     * */
    @Pointcut("@annotation(RunTime)")
    public void doCut() {

    }

    /**
     * * @within 用于类上, 会对类下的所有方法生效
     * */
    @Pointcut("@within(RunTime)")
    public void doClassCut() {

    }


    /**
     * 前置通知, 进入方法之前执行
     * */
    @Before(value = "doCut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("切面逻辑, 请求入参: {}", joinPoint.getArgs());
        log.info("切面逻辑, 请求的目标对象: {}", joinPoint.getTarget());
        log.info("切面逻辑, 请求的源对象: {}", joinPoint.getSourceLocation());
    }
}
