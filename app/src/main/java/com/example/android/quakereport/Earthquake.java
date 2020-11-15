package com.example.android.quakereport;

public class Earthquake {
    //String for holding the magnitude
    private double mMagnitude;
    //String for location
    private String mLocation;

    private String mUrl;

    private  long mDate;

    public Earthquake(double Magnitude, String Location, long Date,String url){
        mMagnitude=Magnitude;
        mDate=Date;
        mLocation=Location;
        mUrl=url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl(){
        return  mUrl;
    }
}
