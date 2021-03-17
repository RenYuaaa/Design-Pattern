package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-03-17 22:43
 * @description: 静态内部类懒汉式的单例
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton =
                new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
