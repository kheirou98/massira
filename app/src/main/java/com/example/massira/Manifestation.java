package com.example.massira;

import java.util.Date;

public class Manifestation {
    private int id ;
    private String lieu;
    private Date date;
    private String description ;
    private float longitude;
    private float latitude;
    private int image ;
    private int video;
    public Manifestation (int id,String lieu,Date date,String description,float longitude,float latitude,int image,
                          int video ){
        this.id=id;
        this.lieu=lieu;
        this.description=description;
        this.date=date;
        this.longitude=longitude;
        this.latitude=latitude;
        this.image=image;
        this.video=video;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }
}
