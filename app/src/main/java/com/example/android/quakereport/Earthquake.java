package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by MANCHOY on 4/18/2018.
 */

public class Earthquake {

    private String mMagnitude, mLocation;
    private long mTimeMilliseconds;

    public Earthquake(String magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeMilliseconds = timeInMilliseconds;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getmTimeMilliseconds() {
        return mTimeMilliseconds;
    }

    public void setmTimeMilliseconds(long mTimeMilliseconds) {
        this.mTimeMilliseconds = mTimeMilliseconds;
    }
}
