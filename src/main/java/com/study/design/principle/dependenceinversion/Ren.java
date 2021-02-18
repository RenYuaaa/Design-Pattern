package com.study.design.principle.dependenceinversion;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:19
 * @description: 依赖倒置原则，如果使用该类中的方法，那么每新学一种课程都要新增加一个方法，扩展性差
 */
public class Ren {
    //v1
//    public void studyJavaCourse() {
//        System.out.println("Ren在学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Ren在学习前端课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Ren在学习Python课程");
//    }

    //v2
//    public void stydyCourse(ICourse iCourse) {
//        iCourse.studeCourse();
//    }

    private ICourse iCourse;
//
//    public Ren(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }


    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studeCourse();
    }
}
