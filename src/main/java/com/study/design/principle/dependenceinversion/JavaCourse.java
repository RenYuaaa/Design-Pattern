package com.study.design.principle.dependenceinversion;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:23
 * @description:
 */
public class JavaCourse implements ICourse {

    @Override
    public void studeCourse() {
        System.out.println("Ren在学习Java课程");
    }
}
