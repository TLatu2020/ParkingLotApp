package com.example.parkinglotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //This constant uses the name of the class itself as the tag
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user taps the View Parking Lot button
    public void viewParkingLot(View view){

        //Testing button
        Log.d(LOG_TAG, "view parking lot button pushed!");

        Intent intent = new Intent (MainActivity.this, ParkingLotPage.class);
        startActivity(intent);

    }
}



