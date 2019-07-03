package com.example.tourguideapp;

public class Guide  {
    private String mAzTranstetion;
    private String mRuTransletion;
    private String mHistory;
    private String mLocation;
    private String mGeo;
    private int mImageId;

    public Guide(String ruTransletion, String azTranstetion, int imageId, String history , String location,String geo) {
        mRuTransletion = ruTransletion;
        mAzTranstetion = azTranstetion;
        mHistory = history;
        mLocation = location;
        mImageId = imageId;
        mGeo = geo;
    }


    public String getAzTranstetion(){
        return mAzTranstetion;
    }
    public String getRuTransletion(){
        return mRuTransletion;
    }
    public String getmHistory(){return mHistory;}
    public String getmLocation(){return mLocation;}
    public String getmGeo(){return mGeo;}
    public int getmImageId(){return mImageId;}
}
