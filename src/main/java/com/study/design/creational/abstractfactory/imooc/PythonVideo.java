package com.study.design.creational.abstractfactory.imooc;

/**
 * @author: renjiahui
 * @date: 2021-02-22 22:59
 * @description: 抽象工厂模式--具体的产品（Python课程视频）
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }
}
