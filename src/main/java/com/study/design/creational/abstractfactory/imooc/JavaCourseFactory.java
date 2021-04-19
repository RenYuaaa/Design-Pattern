package com.study.design.creational.abstractfactory.imooc;

/**
 * @author: renjiahui
 * @date: 2021-02-22 22:55
 * @description: 抽象工厂模式--产品族
 *                  抽象工厂模式中：横向扩张产品族不会违背开闭原则，扩展较方便
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
