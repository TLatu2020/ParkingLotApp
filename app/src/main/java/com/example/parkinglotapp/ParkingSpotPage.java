package com.example.parkinglotapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ParkingSpotPage extends AppCompatActivity {

    //This constant uses the name of the class itself as the tag
    private static final String LOG_TAG =
            ParkingSpotPage.class.getSimpleName();
    public static final String TAG = "A1 ParkingSpotData";

    private DocumentReference mDocRef = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA1");

    EditText model;
    EditText color;
    EditText vin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_spot_page);
        Intent intent = getIntent();

        model=(EditText)findViewById(R.id.editText2);
        color=(EditText)findViewById(R.id.editText3);
        vin=(EditText)findViewById(R.id.editText4);


        mDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String dbModel = documentSnapshot.getString("model");
                    String dbColor = documentSnapshot.getString("color");
                    String dbVin = documentSnapshot.getString("vin");
                    Boolean dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(dbOccupied==true){
                        model.setText(dbModel);
                        color.setText(dbColor);
                        vin.setText(dbVin);
                        System.out.println("********"+dbModel+ " "+dbColor+" "+dbVin+"*************");
                    }
                }
            }
        });
    }

    //Called when the user taps the View Parking Lot button
    public void viewParkingSpot(View view){

        //Testing button
        Log.d(LOG_TAG, "parking spot button pushed!");

    }

    public void saveParkingSpotData(View view){

        EditText model = (EditText) findViewById(R.id.editText2);
        EditText color = (EditText) findViewById(R.id.editText3);
        EditText vin = (EditText) findViewById(R.id.editText4);

        String modelString = model.getText().toString();
        String colorString = color.getText().toString();
        String vinString = vin.getText().toString();

        System.out.println("Testing Writting Data to Firebase: " + "\""+modelString+"\"" + " -" + colorString + " - " + vinString);
        if(modelString.isEmpty()||colorString.isEmpty()){return;}

        Map<String, Object> dataToSave = new HashMap<String, Object>();
        dataToSave.put("model", modelString);
        dataToSave.put("color", colorString);
        dataToSave.put("vin", vinString);
        dataToSave.put("occupied", true);
        mDocRef.set(dataToSave).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "Document has been saved!");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Document was not saved", e);
            }
        });

    }
}

