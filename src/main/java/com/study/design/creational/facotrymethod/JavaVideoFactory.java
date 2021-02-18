package com.study.design.creational.facotrymethod;

/**
 * @author: renjiahui
 * @date: 2021-02-17 17:02
 * @description:
 */
public class JavaVideoFactory extends VideoFactory {


    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
