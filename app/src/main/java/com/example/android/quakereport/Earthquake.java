package com.example.android.quakereport;

/**
 * Created by Tony on 2018-05-23.
 */

public class Earthquake {

    /** Earthquake attributes*/
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Earthquake Constructor
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the date of the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    /**
     * @return magnitude of the earthquake
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the location of the earthquake
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * @return url of the earthquake
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * @return the date of the earthquake

     */
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
