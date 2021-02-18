package com.study.design.principle.singleresponsibility;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:38
 * @description: 接口级别的单一职责原则
 */
public class CourseImpl implements ICourseManage, ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
