package com.study.design.creational.builder.v1;

/**
 * @author: renjiahui
 * @date: 2021-03-14 22:35
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        CourseActualBuilder courseActualBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseActualBuilder);
        Course course = coach.makeCourse("Java设计模式精讲", "Java设计模式精讲PPT",
                "Java设计模式视频", "Java设计模式手记",
                "Java设计模式问答");
        System.out.println(course);

    }
}
