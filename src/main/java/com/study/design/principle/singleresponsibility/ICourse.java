package com.study.design.principle.singleresponsibility;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:34
 * @description: 从这里看，也是违反了单一职责原则，
 * 因为有获取课程信息的接口，但如果退订了课程，那么就不能查看课程了。
 * 因为可以拆分为课程管理接口和课程管理接口
 */
public interface ICourse {

    /**
     * 获得课程名称
     * @return
     */
    String getCourseName();

    /**
     * 获取视频字节流
     * @return
     */
    byte[] getCourseVideo();



    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退订课程
     */
    void refundCourse();
}
