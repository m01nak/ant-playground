package com.moinak.ant.app;

import com.moinak.ant.frame.Frame;
import com.moinak.ant.frame.WoodenFrame;
import com.moinak.ant.picture.LandscapePicture;

public class ApplicationRunner {
    public static void main(String[] args) {
        Frame frame = new WoodenFrame();
        frame.installPicture(new LandscapePicture());
        System.out.println(frame.inspectPicture());
    }
}
