package com.sysc4806.project;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Category category;

    private String url;

    private Product(){};

    public Product(String url, Category category){
        this.url = url;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    private int averageRating;
//
//    private int numberOfRatings;
//
//    private int ratingTotal;
//
//
//    public int getAverageRating() {
//        return averageRating;
//    }
//
//    public void setAverageRating(int averageRating) {
//        this.averageRating = averageRating;
//    }
//
//    public int getNumberOfRatings() {
//        return numberOfRatings;
//    }
//
//    public void setNumberOfRatings(int numberOfRatings) {
//        this.numberOfRatings = numberOfRatings;
//    }
//
//    public int getRatingTotal() {
//        return ratingTotal;
//    }
//
//    public void setRatingTotal(int ratingTotal) {
//        this.ratingTotal = ratingTotal;
//    }
}
