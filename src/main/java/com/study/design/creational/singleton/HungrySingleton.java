package com.study.design.creational.singleton;

import java.io.Serializable;

/**
 * @author: renjiahui
 * @date: 2021-03-17 22:53
 * @description: 饿汉式单例--类加载时就创建好对象
 * 饿汉式：
 *      类加载到内存后，就实例化一个单例，JVM保证线程安全
 *      简单实用，推荐使用
 *      唯一缺点：不管用到与否，类加载时就完成实例化
 */
public class HungrySingleton implements Serializable {

    /**
     * 类加载时完成赋值,也可以放在静态代码块中初始化
     */
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        //对于饿汉式的单例模式适用--禁止反射调用其构造方法
        //该方式也同样使用于静态内部类的懒汉式单例模式
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        //类加载时就创建好了，所以不用判断为空
        return hungrySingleton;
    }

}
