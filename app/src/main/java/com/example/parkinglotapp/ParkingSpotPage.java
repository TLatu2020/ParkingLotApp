package com.example.parkinglotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ParkingSpotPage extends AppCompatActivity {

    //This constant uses the name of the class itself as the tag
    private static final String LOG_TAG =
            ParkingSpotPage.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_spot_page);

        Intent intent = getIntent();
    }

    //Called when the user taps the View Parking Lot button
    public void viewParkingSpot(View view){

        //Testing button
        Log.d(LOG_TAG, "parking spot button pushed!");

    }
}

