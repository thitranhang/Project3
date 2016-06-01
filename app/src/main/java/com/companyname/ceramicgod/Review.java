package com.companyname.ceramicgod;

import android.graphics.Bitmap;

/**
 * Created by David on 5/31/2016.
 */
public class Review {

    private String name;
    private float rating;
    private String date;
    private String comments;
    private float latitude;
    private float longitude;
    private Bitmap picture;

    public Review(String name, float rating, String date, String comments, float latitude, float longitude, Bitmap picture) {
        this.name = name;
        this.rating = rating;
        this.date = date;
        this.comments = comments;
        this.latitude = latitude;
        this.longitude = longitude;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}
