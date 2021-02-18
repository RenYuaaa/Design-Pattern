package com.study.design.principle.dependenceinversion;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:26
 * @description:
 */
public class FECourse implements ICourse  {
    @Override
    public void studeCourse() {
        System.out.println("Ren在学习前端课程");
    }
}
