package com.example.zomato;

public class HotelData {
    private String hotel_name;
    private String hotel_image_url;
    private String hotel_rating;
    private String hotel_menu;
    private String hotel_per_person_cost;
    private String hotel_delivery_time;

    public String getHotel_per_person_cost() {
        return hotel_per_person_cost;
    }

    public void setHotel_per_person_cost(String hotel_per_person_cost) {
        this.hotel_per_person_cost = hotel_per_person_cost;
    }

    public String getHotel_delivery_time() {
        return hotel_delivery_time;
    }

    public void setHotel_delivery_time(String hotel_delivery_time) {
        this.hotel_delivery_time = hotel_delivery_time;
    }

    public String getHotel_menu() {
        return hotel_menu;
    }

    public void setHotel_menu(String hotel_menu) {
        this.hotel_menu = hotel_menu;
    }

    public String getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(String hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_image_url() {
        return hotel_image_url;
    }

    public void setHotel_image_url(String hotel_image_url) {
        this.hotel_image_url = hotel_image_url;
    }

}
