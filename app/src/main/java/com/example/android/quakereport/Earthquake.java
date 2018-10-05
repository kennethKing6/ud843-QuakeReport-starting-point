package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mPlace;
    private String mTime;

    public Earthquake(String mag, String place, String time) {
        this.mMagnitude = mag;
        this.mPlace = place;
        this.mTime = time;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDate() {
        return mTime;
    }


}
