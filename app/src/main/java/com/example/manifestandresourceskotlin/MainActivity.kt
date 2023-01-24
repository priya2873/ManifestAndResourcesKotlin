package com.example.manifestandresourceskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.app.Activity;

public class MyActivity: AppCompatActivity(){

    /**
     * Called when the activity is first created.
     */
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}