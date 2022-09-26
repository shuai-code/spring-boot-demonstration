package com.shuai.demonstration.utils;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yangs
 */
@Slf4j
public class MemoryUtils {
    /**
     * 对象占用的内存大小
     * */
    public static void getObjectSize(Object object) {
        log.info("该对象占用内存为: {} 字节", ObjectSizeCalculator.getObjectSize(object));
        // 这几个参数还不知道作用
        log.info("未知参数: {} 字节", ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification().getObjectHeaderSize());
        log.info("未知参数: {} 字节", ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification().getObjectPadding());
        log.info("未知参数: {} 字节", ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification().getReferenceSize());
        log.info("未知参数: {} 字节", ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification().getArrayHeaderSize());
        log.info("未知参数: {} 字节", ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification().getSuperclassFieldPadding());
    }
}
