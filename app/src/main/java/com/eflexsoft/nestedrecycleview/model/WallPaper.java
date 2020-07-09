package com.eflexsoft.nestedrecycleview.model;

import java.util.List;

public class WallPaper {

    private String categoryName;
    private List<WallpaperItem> wallpaperItemList;

    public WallPaper(String categoryName, List<WallpaperItem> wallpaperItemList) {
        this.categoryName = categoryName;
        this.wallpaperItemList = wallpaperItemList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<WallpaperItem> getWallpaperItemList() {
        return wallpaperItemList;
    }

    public void setWallpaperItemList(List<WallpaperItem> wallpaperItemList) {
        this.wallpaperItemList = wallpaperItemList;
    }
}
