package com.example.zgeveryday;

public class Places {
   private String mName;
   private String mWorkingHours;
   private String mBio;
   private int mImgResourceId;
   private String mUrl;


   // New constructor
    public Places(String name, String workingHours, String bio, int imgResourceId, String url){
        mName = name;
        mWorkingHours = workingHours;
        mBio = bio;
        mImgResourceId = imgResourceId;
        mUrl = url;


    }

    // get name of the place
    public String getName (){
        return mName;
    }

    //get working hours od the place
    public String getWorkingHours (){
        return mWorkingHours;
    }

    //get short description for the place
    public String getBio (){
        return mBio;
    }

    // get image of the place
    public int getImgResourceId (){
        return mImgResourceId;
    }

    public String getUrl (){ return mUrl;}

}

