package com.shuai.demonstration;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yangs
 */
public class MemoryDemo {

    public static void main(String[] args) {
        doPrintMemory();
    }

    public static void doPrintMemory() {
        Integer a = 1;
        System.out.println("Integer类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(a) + "字节");
        Boolean b = false;
        System.out.println("Boolean类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(b) + "字节");
        String c = "";
        System.out.println("String类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(c) + "字节");
        String d = "啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊";
        System.out.println("String类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(d) + "字节");
        Double e = 0.0;
        System.out.println("Double类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(e) + "字节");
        Float f = 0.1f;
        System.out.println("Float类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(f) + "字节");
        U u = new U();
        System.out.println("空对象U类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(u) + "字节");
        V v = new V();
        v.a = 1;
        System.out.println("对象V类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(v) + "字节");
        List<String> x = new ArrayList<>();
        System.out.println("空列表类型, 占用内存:" + ObjectSizeCalculator.getObjectSize(x) + "字节");
        x.add("aaa");
        System.out.println("列表类型, 添加1个元素, 因为扩容预分配空间的原因, 占用内存:" + ObjectSizeCalculator.getObjectSize(x) + "字节");
    }

    public static class U {

    }

    public static class V {
        private Integer a;
    }
}
