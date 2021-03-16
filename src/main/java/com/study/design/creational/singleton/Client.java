package com.study.design.creational.singleton;

/**
 * @author: renjiahui
 * @date: 2021-03-16 23:30
 * @description: 单例测试
 */
public class Client {

    public static void main(String[] args) {
//        LazySignleton instance = LazySignleton.getInstance();

        new Thread(new ThreadTest()).start();
        new Thread(new ThreadTest()).start();
        System.out.println("program end");
    }
}
