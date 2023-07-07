package com.example.assignment;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    public database(@Nullable Context context, int version) {
        super(context,"UNIVERSITY.db",null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table courses(code TEXT, coursename TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
