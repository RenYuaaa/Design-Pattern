package com.study.design.principle.dependenceinversion;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:25
 * @description:
 */
public class PythonCourse implements ICourse {
    @Override
    public void studeCourse() {
        System.out.println("Ren在学习Python课程");
    }
}
