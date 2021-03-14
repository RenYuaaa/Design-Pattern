package com.study.design.creational.builder.v1;

/**
 * @author: renjiahui
 * @date: 2021-03-14 22:26
 * @description:
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCouser();
}
