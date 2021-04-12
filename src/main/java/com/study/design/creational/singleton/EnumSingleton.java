package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-04-12 23:39
 * @description:
 */
public enum EnumSingleton {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(EnumSingleton.INSTANCE.hashCode())).start();
        }
    }

}
