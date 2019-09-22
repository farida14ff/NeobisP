package com.example.taskapp;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.v4.content.pm.PermissionInfoCompat;
import android.widget.TextView;

@Entity(tableName = "notes")
public class Notes {
    @PrimaryKey
    public int id;
    public String mTitle;
    public String mText;


    public Notes(String title, String text){
        mTitle = title;
        mText = text;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
