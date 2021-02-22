package com.study.design.creational.abstractfactory;

/**
 * @author: renjiahui
 * @date: 2021-02-22 22:53
 * @description: 抽象工厂模式--抽象工厂--课程
 *                  在现有的产品等级中增加新的产品等级--不符合开闭原则，所有的类都要修改，太过于麻烦
 *                  但是如果修改过的课程可以使用个1年、2年、3年之类不会变动，则可以修改
 */
public interface CourseFactory {

    /**
     * 产品等级结构
     *
     * @return
     */
    Video getVideo();

    /**
     * 产品等级结构
     *
     * @return
     */
    Article getArticle();
}
