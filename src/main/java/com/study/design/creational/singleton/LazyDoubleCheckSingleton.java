package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-03-16 23:48
 * @description: 双锁机制的懒汉单例
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }


    /**
     * 双重锁机制
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    /**
                     * new的过程经历了三个步骤：
                     *  1、分配内存地址
                     *  2、初始化对象
                     *  3、设置lazyDoubleCheckSingleton,指向刚刚分配出来的对象地址
                     * 此处涉及到指令重排序，正常顺序应该是1、2、3，但是也有可能执行的顺序是1、3、2
                     * Java语言规范中指出，所有线程在执行程序时要遵循intra-thread semantics
                     * 保证重排序不会改变单线程内的程序执行结果。
                     * 例如上述1、2、3的步骤，改为1、3、2也不会影响程序执行结果
                     * 如笔记中记载的：
                     *  单线程时发生指令重排序没问题，但多线程时如笔记中的图，就出现了问题。因此多线程时要避免此现象。
                     *      1、可以尝试禁止2、3步骤发生指令重排序--在private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;加入volatile关键字
                     *      加了之后，所有线程可以看到内存的共享状态
                     *      2、可以不让其他线程看到线程0内发生的重排序--使用静态内部类解决
                     */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
