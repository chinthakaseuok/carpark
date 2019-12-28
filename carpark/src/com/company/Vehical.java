package com.company;

public abstract class Vehical {
    private int placeID;
    private String brnd;
    private float Etime;
    private String date;

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getBrnd() {
        return brnd;
    }

    public void setBrnd(String brnd) {
        this.brnd = brnd;
    }

    public float getEtime() {
        return Etime;
    }

    public void setEtime(float etime) {
        Etime = etime;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
