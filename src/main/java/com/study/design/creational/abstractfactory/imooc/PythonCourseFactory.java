package com.study.design.creational.abstractfactory.imooc;

/**
 * @author: renjiahui
 * @date: 2021-02-22 23:00
 * @description: 抽象工厂模式--产品族
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
