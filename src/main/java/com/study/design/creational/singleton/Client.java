package com.study.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: renjiahui
 * @date: 2021-03-16 23:30
 * @description: 单例测试
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySignleton instance = LazySignleton.getInstance();

//        new Thread(new ThreadTest()).start();
//        new Thread(new ThreadTest()).start();
//        System.out.println("program end");

        //饿汉模式的单例
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("Singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//
//        //通过对ObjectInputStream源码中2107行左右的代码的分析得出：
//        //序列化破坏了单例
//        System.out.println(newInstance == instance);

        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton object = (HungrySingleton)constructor.newInstance();
        System.out.println(instance);

        System.out.println(object);
        System.out.println(object == instance);
    }
}
