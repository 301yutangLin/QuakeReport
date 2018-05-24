package com.example.android.quakereport;

/**
 * Created by Tony on 2018-05-23.
 */

public class Earthquake {

    /** Earthquake attributes*/
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Earthquake Constructor
     * @param mMagnitude is the magnitude of the earthquake
     * @param mLocation is the location of the earthquake
     * @param mDate is the date of the earthquake
     */
    public Earthquake(String mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    /**
     * @return magnitude of the earthquake
     */
    public String getmMagnitude() {
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
    public String getmDate() {
        return mDate;
    }
}
