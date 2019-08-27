package com.example.hp.tourguide;

import android.util.Log;

public class Place {

    private String mTitle;
    private String mInfo;
    private String mAddress;
    private String mTiming;
    private String mPhone;
    // Drawable resource ID
    private int mImageResourceId;

    public Place(String title, String info, int imageResourceId) {
        mTitle = title;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    public Place(String title, String info, String address, String timing, String phone,
                    int imageResourceId) {
        mTitle = title;
        mInfo = info;
        mAddress = address;
        mTiming = timing;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getTiming() {
        return mTiming;
    }

    public String getPhone() {
        return mPhone;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasTiming(){
        return getTiming() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }


    @Override
    public String toString() {
        String output = getImageResourceId() + "\n" +
                getTitle() + "\n" +
                getInfo() + "\n" +
                getAddress() + "\n" +
                getTiming() + "\n" +
                getPhone();
        return output;
    }
}
