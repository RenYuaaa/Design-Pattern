package com.study.design.principle.singleresponsibility;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:37
 * @description: 课程详情
 */
public interface ICourseContent {

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
}
