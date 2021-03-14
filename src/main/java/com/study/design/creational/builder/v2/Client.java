package com.study.design.creational.builder.v2;

/**
 * @author: renjiahui
 * @date: 2021-03-14 22:52
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCouserName("Java设计模式精讲")
                .buildcoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .buildCourseQA("Java设计模式精讲问答")
                .build();
        System.out.println(course);

        //guava中ImmutableSet中使用的建造者模式
//        Set<String> set = ImmutableSet.<String>.builder().add("a").add("b").build();
//        System.out.println(set);
    }
}
