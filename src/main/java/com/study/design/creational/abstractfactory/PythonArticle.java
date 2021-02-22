package com.study.design.creational.abstractfactory;

/**
 * @author: renjiahui
 * @date: 2021-02-22 23:00
 * @description: 抽象工厂模式--具体的产品（Python课程手记）
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
