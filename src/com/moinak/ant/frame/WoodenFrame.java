package com.moinak.ant.frame;

import com.moinak.ant.picture.Picture;

public class WoodenFrame implements Frame {
    private Picture installedPicture;

    public void setInstalledPicture(Picture picture) {
        this.installedPicture = picture;
    }

    public Picture getInstalledPicture() {
        return this.installedPicture;
    }

    @Override
    public void installPicture(Picture picture) {
        setInstalledPicture(picture);
    }

    @Override
    public void uninstallPicture() {
        setInstalledPicture(null);
    }

    @Override
    public String inspectPicture() {
        return getInstalledPicture().getPictureInfo();
    }

}
