package com.shuai.demonstration.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一个记录方法执行时间的注解
 * @author Yangs
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RunTimeClass {

    /**
     * 时间阈值, 超出后打印异常日志
     * */
    int exceptionTime() default 100;
}
