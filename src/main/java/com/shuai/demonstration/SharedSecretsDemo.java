package com.shuai.demonstration;

import sun.misc.JavaLangAccess;
import sun.misc.SharedSecrets;

/**
 * @author Yangs
 */
public class SharedSecretsDemo {

    public static void main(String[] args) {
        Ni.nio();
    }

    public static class Ni {
        /**
         * 输出栈帧中所有类
         * */
        public static void nio() {
            JavaLangAccess javaLangAccess = SharedSecrets.getJavaLangAccess();
            Throwable throwable = new Throwable();
            int depth = javaLangAccess.getStackTraceDepth(throwable);

            for (int i = 0; i < depth; i++) {
                StackTraceElement element = javaLangAccess.getStackTraceElement(throwable, i);
                String className = element.getClassName();
                System.out.println(className);
            }
        }
    }
}
