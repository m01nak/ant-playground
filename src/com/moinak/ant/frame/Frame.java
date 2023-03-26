package com.moinak.ant.frame;

import com.moinak.ant.picture.Picture;

public interface Frame {
    public void installPicture(Picture picture);
    public void uninstallPicture();
    public String inspectPicture();
}