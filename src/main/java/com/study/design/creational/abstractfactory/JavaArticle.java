package com.study.design.creational.abstractfactory;

/**
 * @author: renjiahui
 * @date: 2021-02-22 22:58
 * @description: 抽象工厂模式--具体的产品（Java课程手记）
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
