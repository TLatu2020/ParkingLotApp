package com.example.parkinglotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class ParkingLotPage extends AppCompatActivity {

    //This constant uses the name of the class itself as the tag
    private static final String LOG_TAG =
            ParkingLotPage.class.getSimpleName();

    private DocumentReference dbPageA1 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA1");
    private DocumentReference dbPageA2 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA2");

    TextView A1model;
    TextView A1color;
    TextView A1vin;
    TextView A2model;
    TextView A2color;
    TextView A2vin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_lot_page);

        A1model=(TextView)findViewById(R.id.textView3);
       // RelativeLayout rla1model = (RelativeLayout)findViewById(R.id.textView3)
        A1color=(TextView)findViewById(R.id.textView5);
        A1vin=(TextView)findViewById(R.id.textView6);
        A2model=(TextView)findViewById(R.id.textView4);
        A2color=(TextView)findViewById(R.id.textView8);
        A2vin=(TextView)findViewById(R.id.textView7);

        dbPageA1.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A1dbModel = documentSnapshot.getString("model");
                    String A1dbColor = documentSnapshot.getString("color");
                    String A1dbVin = documentSnapshot.getString("vin");
                    Boolean A1dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A1dbOccupied==true){
                        A1model.setText(A1dbModel);
                        A1color.setText(A1dbColor);
                        A1vin.setText(A1dbVin);
                        System.out.println("********"+A1dbModel+ " "+A1dbColor+" "+A1dbVin+"*************");
                    }
                }
            }
        });

        dbPageA2.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A2dbModel = documentSnapshot.getString("model");
                    String A2dbColor = documentSnapshot.getString("color");
                    String A2dbVin = documentSnapshot.getString("vin");
                    Boolean A2dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A2dbOccupied==true){
                        A2model.setText(A2dbModel);
                        A2color.setText(A2dbColor);
                        A2vin.setText(A2dbVin);
                        System.out.println("********"+A2dbModel+ " "+A2dbColor+" "+A2dbVin+"*************");
                    }
                }
            }
        });

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
