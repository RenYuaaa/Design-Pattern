package com.study.design.creational.facotrymethod.imooc;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:32
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory paythonVideoFactory = new PaythonVideoFactory();
        Video video1 = paythonVideoFactory.getVideo();
        video1.produce();
    }
}
