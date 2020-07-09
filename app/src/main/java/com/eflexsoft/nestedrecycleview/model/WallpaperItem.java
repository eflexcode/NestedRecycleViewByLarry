package com.eflexsoft.nestedrecycleview.model;

public class WallpaperItem {

    int image;
    String imageName;

    public WallpaperItem(int image, String imageName) {
        this.image = image;
        this.imageName = imageName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
