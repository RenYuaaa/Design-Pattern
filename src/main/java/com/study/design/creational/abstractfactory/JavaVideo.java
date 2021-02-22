package com.study.design.creational.abstractfactory;

/**
 * @author: renjiahui
 * @date: 2021-02-22 22:57
 * @description: 抽象工厂模式--具体的产品（Java课程视频）
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
