package com.study.design.creational.facotrymethod;

/**
 * @author: renjiahui
 * @date: 2021-02-17 17:03
 * @description:
 */
public class PaythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
