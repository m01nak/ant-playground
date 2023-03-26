package com.moinak.ant.picture;

public class LandscapePicture implements Picture {
    
    private static final String LANDSCAPE_PICTURE_INFO = "This is a beautiful painting of a landscape.";

    @Override
    public String getPictureInfo() {
        return LANDSCAPE_PICTURE_INFO;
    }
}
