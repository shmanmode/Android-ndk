package com.example.card_view;

public class CardData {
    public String getCard_image_url() {
        return card_image_url;
    }

    public void setCard_image_url(String card_image_url) {
        this.card_image_url = card_image_url;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getCard_offer() {
        return card_offer;
    }

    public void setCard_offer(String card_offer) {
        this.card_offer = card_offer;
    }

    public String getCard_distance() {
        return card_distance;
    }

    public void setCard_distance(String card_distance) {
        this.card_distance = card_distance;
    }

    public String getCard_rating() {
        return card_rating;
    }

    public void setCard_rating(String card_rating) {
        this.card_rating = card_rating;
    }

    private String card_image_url;
    private String card_name;
    private String card_offer;
    private String card_distance;
    private String card_rating;
}
