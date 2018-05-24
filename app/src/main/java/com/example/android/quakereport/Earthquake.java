package com.example.android.quakereport;

/**
 * Created by Tony on 2018-05-23.
 */

public class Earthquake {

    /** Earthquake attributes*/
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    /**
     * Earthquake Constructor
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the date of the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
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
     * @return the date of the earthquake
     */
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
