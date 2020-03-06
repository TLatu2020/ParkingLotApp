package com.example.parkinglotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ParkingLotPage extends AppCompatActivity {

    //This constant uses the name of the class itself as the tag
    private static final String LOG_TAG =
            ParkingLotPage.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_lot_page);
    }

    //Called when the user taps the View Parking Lot button
    public void viewParkingSpotA1(View view){

        //Testing button
        Log.d(LOG_TAG, "parking spot A1 button pushed!");

        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPage.class);
        startActivity(intent);
    }

    public void viewParkingSpotA2(View view){

        //Testing button
        Log.d(LOG_TAG, "parking spot A2 button pushed!");

        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA2.class);
        startActivity(intent);
    }
}
