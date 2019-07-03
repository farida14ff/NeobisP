package com.example.tourguideapp;

public class More {
    String mTitle;
    String mHistory;
    String mLocation;
    int mImage1;

    public More(String title,String history, String location,int image1){
        mTitle = title;
        mHistory = history;
        mLocation = location;
        mImage1 = image1;
    }

    public String getmTitle() {return mTitle;}

    public String getmLocation() {return mLocation;}

    public String getmHistory() {return mHistory;}

    public int getmImage1() { return mImage1;}

}
