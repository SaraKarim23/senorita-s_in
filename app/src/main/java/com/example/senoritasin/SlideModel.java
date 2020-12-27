package com.example.senoritasin;

public class SlideModel {
    String imageTitle;
    String imageUrl;

    public SlideModel(String imageTitle, String imageUrl) {
        this.imageTitle = imageTitle;
        this.imageUrl = imageUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
