package com.example.android.quakereport;


public class Earthquake {
    private double mMagntitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(double number, String adress, long date, String url)
    {
        mMagntitude = number;
        mLocation = adress;
        mDate = date;
        mUrl = url;
    }

    public double getmMagnititude() {
        return mMagntitude;
    }

    public String getmAdress() {
        return mLocation;
    }

    public String getmUrl() {return mUrl;}

    public long getmDate() {
        return mDate;
    }
}
