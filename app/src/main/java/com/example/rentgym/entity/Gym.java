package com.example.rentgym.entity;

public class Gym {
    String price;
    int favorite;
    String address;
    String city;
    int image;
    String information;
    String date;

    public Gym(String price, int favorite, String address, String city, int image, String information, String date) {
        this.price = price;
        this.favorite = favorite;
        this.address = address;
        this.city = city;
        this.image = image;
        this.information = information;
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }
}
