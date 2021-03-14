package com.study.design.creational.builder.v1;

/**
 * @author: renjiahui
 * @date: 2021-03-14 22:31
 * @description:
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String cousreActrive,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseArticle(cousreActrive);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCouser();
    }
}
