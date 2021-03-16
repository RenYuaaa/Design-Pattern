package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-03-16 23:32
 * @description:
 */
public class ThreadTest implements Runnable {
    @Override
    public void run() {
//        LazySignleton lazySignleton = LazySignleton.getInstance();

        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance );
    }
}
