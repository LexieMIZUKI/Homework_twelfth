package com.lexieluv.homeworktwelfth.entity;

public class Food {
    private int foodImage;//食物图片
    private String title,comment,price,place, amount;//标题，评价，价格，来源地，剩余份数

    public Food(int foodImage, String title, String comment, String price, String place, String amount) {
        this.foodImage = foodImage;
        this.title = title;
        this.comment = comment;
        this.price = price;
        this.place = place;
        this.amount = amount;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
