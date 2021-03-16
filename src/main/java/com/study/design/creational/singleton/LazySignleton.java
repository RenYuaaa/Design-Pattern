package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-03-16 23:28
 * @description: 懒汉式单例模式
 */
public class LazySignleton {

    private static LazySignleton lazySignleton = null;

    private LazySignleton() {

    }

    //该方法多线程使用该单例的时候是不安全的
//    public static LazySignleton getInstance() {
//        if (lazySignleton == null) {
//            lazySignleton = new LazySignleton();
//        }
//        return lazySignleton;
//    }

    /**
     * 同步锁有了开锁和解锁的开销，synchronized修饰静态方式时锁的时Class，锁的范围很大，对性能有很大影响
     * @return
     */
    public synchronized static LazySignleton getInstance() {
        if (lazySignleton == null) {
            lazySignleton = new LazySignleton();
        }
        return lazySignleton;
    }
}
