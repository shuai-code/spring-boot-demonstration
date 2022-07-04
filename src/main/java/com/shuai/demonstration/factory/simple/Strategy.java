package com.shuai.demonstration.factory.simple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 此注解用于标记推送策略, 基于注解的type值获取对应的厂商通道
 * @author Yangs
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategy {

    int type();
}
