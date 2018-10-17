package com.finalone.lakhan.finalone;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.finalone.lakhan.finalone.location.GPS;

public class MainActivity extends AppCompatActivity {

    private GPS gps;
    private Location location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gps = new GPS(MainActivity.this);
        location = gps.getLocation();
        //TODO: Add Firebase account
        //TODO: Add icon
        //
    }
}
