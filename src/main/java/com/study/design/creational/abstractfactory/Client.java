package com.study.design.creational.abstractfactory;

/**
 * @author: renjiahui
 * @date: 2021-02-22 23:04
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        Article article = javaCourseFactory.getArticle();
        article.produce();
        Video video = javaCourseFactory.getVideo();
        video.produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        Video video1 = pythonCourseFactory.getVideo();
        video1.produce();
        Article article1 = pythonCourseFactory.getArticle();
        article1.produce();

    }
}
