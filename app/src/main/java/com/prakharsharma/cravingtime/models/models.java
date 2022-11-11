package com.prakharsharma.cravingtime.models;

public class models {
    int image;
    String name, price , about;

    public models(int image, String name, String price, String about) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
