package com.shuai.demonstration.factory.simple;

/**
 * @author Yangs
 */
public abstract class AbstractVendor<T> {

    /**
     * 发送消息
     */
    public abstract void doPush();

    /**
     * 处理回调
     * 使用泛型接收入参, 多个实现类接收不同类型的入参
     * @param callbackMessage  回调消息
     */
    public abstract void doCallBack(T callbackMessage);
}
