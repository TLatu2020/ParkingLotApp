package com.example.parkinglotapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
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
    private DocumentReference dbPageA3 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA3");
    private DocumentReference dbPageA4 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA4");
    private DocumentReference dbPageA5 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA5");
    private DocumentReference dbPageA6 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA6");
    private DocumentReference dbPageA7 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA7");
    private DocumentReference dbPageA8 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA8");
    private DocumentReference dbPageA9 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA9");
    private DocumentReference dbPageA10 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA10");
    private DocumentReference dbPageA11= FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA11");
    private DocumentReference dbPageA12 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA12");
    private DocumentReference dbPageA13 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA13");
    private DocumentReference dbPageA14 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA14");
    private DocumentReference dbPageA15 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA15");
    private DocumentReference dbPageA16 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA16");
    private DocumentReference dbPageA17 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA17");
    private DocumentReference dbPageA18 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA18");
    private DocumentReference dbPageA19 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA19");
    private DocumentReference dbPageA20 = FirebaseFirestore.getInstance().collection("parkingLot").document("parkingSpaceA20");

    TextView A1model;
    TextView A1color;
    TextView A1vin;

    TextView A2model;
    TextView A2color;
    TextView A2vin;

    TextView A3model;
    TextView A3color;
    TextView A3vin;

    TextView A4model;
    TextView A4color;
    TextView A4vin;

    TextView A5model;
    TextView A5color;
    TextView A5vin;

    TextView A6model;
    TextView A6color;
    TextView A6vin;

    TextView A7model;
    TextView A7color;
    TextView A7vin;

    TextView A8model;
    TextView A8color;
    TextView A8vin;

    TextView A9model;
    TextView A9color;
    TextView A9vin;

    TextView A10model;
    TextView A10color;
    TextView A10vin;

    TextView A11model;
    TextView A11color;
    TextView A11vin;

    TextView A12model;
    TextView A12color;
    TextView A12vin;

    TextView A13model;
    TextView A13color;
    TextView A13vin;

    TextView A14model;
    TextView A14color;
    TextView A14vin;

    TextView A15model;
    TextView A15color;
    TextView A15vin;

    TextView A16model;
    TextView A16color;
    TextView A16vin;

    TextView A17model;
    TextView A17color;
    TextView A17vin;

    TextView A18model;
    TextView A18color;
    TextView A18vin;

    TextView A19model;
    TextView A19color;
    TextView A19vin;

    TextView A20model;
    TextView A20color;
    TextView A20vin;

    Button btnA1;
    Button btnA2;
    Button btnA3;
    Button btnA4;
    Button btnA5;
    Button btnA6;
    Button btnA7;
    Button btnA8;
    Button btnA9;
    Button btnA10;
    Button btnA11;
    Button btnA12;
    Button btnA13;
    Button btnA14;
    Button btnA15;
    Button btnA16;
    Button btnA17;
    Button btnA18;
    Button btnA19;
    Button btnA20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_lot_page);

        A1model=(TextView)findViewById(R.id.textView3);
        A1color=(TextView)findViewById(R.id.textView5);
        A1vin=(TextView)findViewById(R.id.textView6);

        A2model=(TextView)findViewById(R.id.textView4);
        A2color=(TextView)findViewById(R.id.textView8);
        A2vin=(TextView)findViewById(R.id.textView7);

        A3model=(TextView)findViewById(R.id.textViewA3m);
        A3color=(TextView)findViewById(R.id.textViewA3c);
        A3vin=(TextView)findViewById(R.id.textViewA3v);

        A4model=(TextView)findViewById(R.id.textViewA4m);
        A4color=(TextView)findViewById(R.id.textViewA4c);
        A4vin=(TextView)findViewById(R.id.textViewA4v);

        A5model=(TextView)findViewById(R.id.textViewA5m);
        A5color=(TextView)findViewById(R.id.textViewA5c);
        A5vin=(TextView)findViewById(R.id.textViewA5v);

        A6model=(TextView)findViewById(R.id.textViewA6m);
        A6color=(TextView)findViewById(R.id.textViewA6c);
        A6vin=(TextView)findViewById(R.id.textViewA6v);

        A7model=(TextView)findViewById(R.id.textViewA7m);
        A7color=(TextView)findViewById(R.id.textViewA7c);
        A7vin=(TextView)findViewById(R.id.textViewA7v);

        A8model=(TextView)findViewById(R.id.textViewA8m);
        A8color=(TextView)findViewById(R.id.textViewA8c);
        A8vin=(TextView)findViewById(R.id.textViewA8v);

        A9model=(TextView)findViewById(R.id.textViewA9m);
        A9color=(TextView)findViewById(R.id.textViewA9c);
        A9vin=(TextView)findViewById(R.id.textViewA9v);

        A10model=(TextView)findViewById(R.id.textViewA10m);
        A10color=(TextView)findViewById(R.id.textViewA10c);
        A10vin=(TextView)findViewById(R.id.textViewA10v);

        A11model=(TextView)findViewById(R.id.textViewA11m);
        A11color=(TextView)findViewById(R.id.textViewA11c);
        A11vin=(TextView)findViewById(R.id.textViewA11v);

        A12model=(TextView)findViewById(R.id.textViewA12m);
        A12color=(TextView)findViewById(R.id.textViewA12c);
        A12vin=(TextView)findViewById(R.id.textViewA12v);

        A13model=(TextView)findViewById(R.id.textViewA13m);
        A13color=(TextView)findViewById(R.id.textViewA13c);
        A13vin=(TextView)findViewById(R.id.textViewA13v);

        A14model=(TextView)findViewById(R.id.textViewA14m);
        A14color=(TextView)findViewById(R.id.textViewA14c);
        A14vin=(TextView)findViewById(R.id.textViewA14v);

        A15model=(TextView)findViewById(R.id.textViewA15m);
        A15color=(TextView)findViewById(R.id.textViewA15c);
        A15vin=(TextView)findViewById(R.id.textViewA15v);

        A16model=(TextView)findViewById(R.id.textViewA16m);
        A16color=(TextView)findViewById(R.id.textViewA16c);
        A16vin=(TextView)findViewById(R.id.textViewA16v);

        A17model=(TextView)findViewById(R.id.textViewA17m);
        A17color=(TextView)findViewById(R.id.textViewA17c);
        A17vin=(TextView)findViewById(R.id.textViewA17v);

        A18model=(TextView)findViewById(R.id.textViewA18m);
        A18color=(TextView)findViewById(R.id.textViewA18c);
        A18vin=(TextView)findViewById(R.id.textViewA18v);

        A19model=(TextView)findViewById(R.id.textViewA19m);
        A19color=(TextView)findViewById(R.id.textViewA19c);
        A19vin=(TextView)findViewById(R.id.textViewA19v);

        A20model=(TextView)findViewById(R.id.textViewA20m);
        A20color=(TextView)findViewById(R.id.textViewA20c);
        A20vin=(TextView)findViewById(R.id.textViewA20v);

        btnA1 = findViewById(R.id.button2);
        btnA2 = findViewById(R.id.button3);
        btnA3 = findViewById(R.id.buttonA3);
        btnA4 = findViewById(R.id.buttonA4);
        btnA5 = findViewById(R.id.buttonA5);
        btnA6 = findViewById(R.id.buttonA6);
        btnA7 = findViewById(R.id.buttonA7);
        btnA8 = findViewById(R.id.buttonA8);
        btnA9 = findViewById(R.id.buttonA9);
        btnA10 = findViewById(R.id.buttonA10);
        btnA11 = findViewById(R.id.buttonA11);
        btnA12 = findViewById(R.id.buttonA12);
        btnA13 = findViewById(R.id.buttonA13);
        btnA14 = findViewById(R.id.buttonA14);
        btnA15 = findViewById(R.id.buttonA15);
        btnA16 = findViewById(R.id.buttonA16);
        btnA17 = findViewById(R.id.buttonA17);
        btnA18 = findViewById(R.id.buttonA18);
        btnA19 = findViewById(R.id.buttonA19);
        btnA20 = findViewById(R.id.buttonA20);


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
                        btnA1.setBackgroundColor(Color.RED);
                        System.out.println("********"+A1dbModel+ " "+A1dbColor+" "+A1dbVin+"*************");
                    }else{
                        A1model.setText("");
                        A1color.setText("");
                        A1vin.setText("");
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
                        btnA2.setBackgroundColor(Color.RED);
                        System.out.println("********"+A2dbModel+ " "+A2dbColor+" "+A2dbVin+"*************");
                    }else{
                        A2model.setText("");
                        A2color.setText("");
                        A2vin.setText("");
                    }
                }
            }
        });
        dbPageA3.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A3dbModel = documentSnapshot.getString("model");
                    String A3dbColor = documentSnapshot.getString("color");
                    String A3dbVin = documentSnapshot.getString("vin");
                    Boolean A3dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A3dbOccupied==true){
                        A3model.setText(A3dbModel);
                        A3color.setText(A3dbColor);
                        A3vin.setText(A3dbVin);
                        btnA3.setBackgroundColor(Color.RED);
                        System.out.println("********"+A3dbModel+ " "+A3dbColor+" "+A3dbVin+"*************");
                    }else{
                        A3model.setText("");
                        A3color.setText("");
                        A3vin.setText("");
                    }
                }
            }
        });
        dbPageA4.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A4dbModel = documentSnapshot.getString("model");
                    String A4dbColor = documentSnapshot.getString("color");
                    String A4dbVin = documentSnapshot.getString("vin");
                    Boolean A4dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A4dbOccupied==true){
                        A4model.setText(A4dbModel);
                        A4color.setText(A4dbColor);
                        A4vin.setText(A4dbVin);
                        btnA4.setBackgroundColor(Color.RED);
                        System.out.println("********"+A4dbModel+ " "+A4dbColor+" "+A4dbVin+"*************");
                    }else{
                        A4model.setText("");
                        A4color.setText("");
                        A4vin.setText("");
                    }
                }
            }
        });
        dbPageA5.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A5dbModel = documentSnapshot.getString("model");
                    String A5dbColor = documentSnapshot.getString("color");
                    String A5dbVin = documentSnapshot.getString("vin");
                    Boolean A5dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A5dbOccupied==true){
                        A5model.setText(A5dbModel);
                        A5color.setText(A5dbColor);
                        A5vin.setText(A5dbVin);
                        btnA5.setBackgroundColor(Color.RED);
                        System.out.println("********"+A5dbModel+ " "+A5dbColor+" "+A5dbVin+"*************");
                    }else{
                        A5model.setText("");
                        A5color.setText("");
                        A5vin.setText("");
                    }
                }
            }
        });
        dbPageA6.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A6dbModel = documentSnapshot.getString("model");
                    String A6dbColor = documentSnapshot.getString("color");
                    String A6dbVin = documentSnapshot.getString("vin");
                    Boolean A6dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A6dbOccupied==true){
                        A6model.setText(A6dbModel);
                        A6color.setText(A6dbColor);
                        A6vin.setText(A6dbVin);
                        btnA6.setBackgroundColor(Color.RED);
                        System.out.println("********"+A6dbModel+ " "+A6dbColor+" "+A6dbVin+"*************");
                    }else{
                        A6model.setText("");
                        A6color.setText("");
                        A6vin.setText("");
                    }
                }
            }
        });
        dbPageA7.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A7dbModel = documentSnapshot.getString("model");
                    String A7dbColor = documentSnapshot.getString("color");
                    String A7dbVin = documentSnapshot.getString("vin");
                    Boolean A7dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A7dbOccupied==true){
                        A7model.setText(A7dbModel);
                        A7color.setText(A7dbColor);
                        A7vin.setText(A7dbVin);
                        btnA7.setBackgroundColor(Color.RED);
                        System.out.println("********"+A7dbModel+ " "+A7dbColor+" "+A7dbVin+"*************");
                    }else{
                        A7model.setText("");
                        A7color.setText("");
                        A7vin.setText("");
                    }
                }
            }
        });
        dbPageA8.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A8dbModel = documentSnapshot.getString("model");
                    String A8dbColor = documentSnapshot.getString("color");
                    String A8dbVin = documentSnapshot.getString("vin");
                    Boolean A8dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A8dbOccupied==true){
                        A8model.setText(A8dbModel);
                        A8color.setText(A8dbColor);
                        A8vin.setText(A8dbVin);
                        btnA8.setBackgroundColor(Color.RED);
                        System.out.println("********"+A8dbModel+ " "+A8dbColor+" "+A8dbVin+"*************");
                    }else{
                        A8model.setText("");
                        A8color.setText("");
                        A8vin.setText("");
                    }
                }
            }
        });
        dbPageA9.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A9dbModel = documentSnapshot.getString("model");
                    String A9dbColor = documentSnapshot.getString("color");
                    String A9dbVin = documentSnapshot.getString("vin");
                    Boolean A9dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A9dbOccupied==true){
                        A9model.setText(A9dbModel);
                        A9color.setText(A9dbColor);
                        A9vin.setText(A9dbVin);
                        btnA9.setBackgroundColor(Color.RED);
                        System.out.println("********"+A9dbModel+ " "+A9dbColor+" "+A9dbVin+"*************");
                    }else{
                        A9model.setText("");
                        A9color.setText("");
                        A9vin.setText("");
                    }
                }
            }
        });
        dbPageA10.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A10dbModel = documentSnapshot.getString("model");
                    String A10dbColor = documentSnapshot.getString("color");
                    String A10dbVin = documentSnapshot.getString("vin");
                    Boolean A10dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A10dbOccupied==true){
                        A10model.setText(A10dbModel);
                        A10color.setText(A10dbColor);
                        A10vin.setText(A10dbVin);
                        btnA10.setBackgroundColor(Color.RED);
                        System.out.println("********"+A10dbModel+ " "+A10dbColor+" "+A10dbVin+"*************");
                    }
                    else{
                        A10model.setText("");
                        A10color.setText("");
                        A10vin.setText("");
                    }
                }
            }
        });
        dbPageA11.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A11dbModel = documentSnapshot.getString("model");
                    String A11dbColor = documentSnapshot.getString("color");
                    String A11dbVin = documentSnapshot.getString("vin");
                    Boolean A11dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A11dbOccupied==true){
                        A11model.setText(A11dbModel);
                        A11color.setText(A11dbColor);
                        A11vin.setText(A11dbVin);
                        btnA11.setBackgroundColor(Color.RED);
                        System.out.println("********"+A11dbModel+ " "+A11dbColor+" "+A11dbVin+"*************");
                    }else{
                        A11model.setText("");
                        A11color.setText("");
                        A11vin.setText("");
                    }
                }
            }
        });
        dbPageA12.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A12dbModel = documentSnapshot.getString("model");
                    String A12dbColor = documentSnapshot.getString("color");
                    String A12dbVin = documentSnapshot.getString("vin");
                    Boolean A12dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A12dbOccupied==true){
                        A12model.setText(A12dbModel);
                        A12color.setText(A12dbColor);
                        A12vin.setText(A12dbVin);
                        btnA12.setBackgroundColor(Color.RED);
                        System.out.println("********"+A12dbModel+ " "+A12dbColor+" "+A12dbVin+"*************");
                    }else{
                        A12model.setText("");
                        A12color.setText("");
                        A12vin.setText("");
                    }
                }
            }
        });
        dbPageA13.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A13dbModel = documentSnapshot.getString("model");
                    String A13dbColor = documentSnapshot.getString("color");
                    String A13dbVin = documentSnapshot.getString("vin");
                    Boolean A13dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A13dbOccupied==true){
                        A13model.setText(A13dbModel);
                        A13color.setText(A13dbColor);
                        A13vin.setText(A13dbVin);
                        btnA13.setBackgroundColor(Color.RED);
                        System.out.println("********"+A13dbModel+ " "+A13dbColor+" "+A13dbVin+"*************");
                    }else{
                        A13model.setText("");
                        A13color.setText("");
                        A13vin.setText("");
                    }
                }
            }
        });
        dbPageA14.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A14dbModel = documentSnapshot.getString("model");
                    String A14dbColor = documentSnapshot.getString("color");
                    String A14dbVin = documentSnapshot.getString("vin");
                    Boolean A14dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A14dbOccupied==true){
                        A14model.setText(A14dbModel);
                        A14color.setText(A14dbColor);
                        A14vin.setText(A14dbVin);
                        btnA14.setBackgroundColor(Color.RED);
                        System.out.println("********"+A14dbModel+ " "+A14dbColor+" "+A14dbVin+"*************");
                    }else{
                        A14model.setText("");
                        A14color.setText("");
                        A14vin.setText("");
                    }
                }
            }
        });
        dbPageA15.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A15dbModel = documentSnapshot.getString("model");
                    String A15dbColor = documentSnapshot.getString("color");
                    String A15dbVin = documentSnapshot.getString("vin");
                    Boolean A15dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A15dbOccupied==true){
                        A15model.setText(A15dbModel);
                        A15color.setText(A15dbColor);
                        A15vin.setText(A15dbVin);
                        btnA15.setBackgroundColor(Color.RED);
                        System.out.println("********"+A15dbModel+ " "+A15dbColor+" "+A15dbVin+"*************");
                    }else{
                        A15model.setText("");
                        A15color.setText("");
                        A15vin.setText("");
                    }
                }
            }
        });
        dbPageA16.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A16dbModel = documentSnapshot.getString("model");
                    String A16dbColor = documentSnapshot.getString("color");
                    String A16dbVin = documentSnapshot.getString("vin");
                    Boolean A16dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A16dbOccupied==true){
                        A16model.setText(A16dbModel);
                        A16color.setText(A16dbColor);
                        A16vin.setText(A16dbVin);
                        btnA16.setBackgroundColor(Color.RED);
                        System.out.println("********"+A16dbModel+ " "+A16dbColor+" "+A16dbVin+"*************");
                    }else{
                        A16model.setText("");
                        A16color.setText("");
                        A16vin.setText("");
                    }
                }
            }
        });
        dbPageA17.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A17dbModel = documentSnapshot.getString("model");
                    String A17dbColor = documentSnapshot.getString("color");
                    String A17dbVin = documentSnapshot.getString("vin");
                    Boolean A17dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A17dbOccupied==true){
                        A17model.setText(A17dbModel);
                        A17color.setText(A17dbColor);
                        A17vin.setText(A17dbVin);
                        btnA17.setBackgroundColor(Color.RED);
                        System.out.println("********"+A17dbModel+ " "+A17dbColor+" "+A17dbVin+"*************");
                    }else{
                        A17model.setText("");
                        A17color.setText("");
                        A17vin.setText("");
                    }
                }
            }
        });
        dbPageA18.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A18dbModel = documentSnapshot.getString("model");
                    String A18dbColor = documentSnapshot.getString("color");
                    String A18dbVin = documentSnapshot.getString("vin");
                    Boolean A18dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A18dbOccupied==true){
                        A18model.setText(A18dbModel);
                        A18color.setText(A18dbColor);
                        A18vin.setText(A18dbVin);
                        btnA18.setBackgroundColor(Color.RED);
                        System.out.println("********"+A18dbModel+ " "+A18dbColor+" "+A18dbVin+"*************");
                    }else{
                        A18model.setText("");
                        A18color.setText("");
                        A18vin.setText("");
                    }
                }
            }
        });
        dbPageA19.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A19dbModel = documentSnapshot.getString("model");
                    String A19dbColor = documentSnapshot.getString("color");
                    String A19dbVin = documentSnapshot.getString("vin");
                    Boolean A19dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A19dbOccupied==true){
                        A19model.setText(A19dbModel);
                        A19color.setText(A19dbColor);
                        A19vin.setText(A19dbVin);
                        btnA19.setBackgroundColor(Color.RED);
                        System.out.println("********"+A19dbModel+ " "+A19dbColor+" "+A19dbVin+"*************");
                    }else{
                        A19model.setText("");
                        A19color.setText("");
                        A19vin.setText("");
                    }
                }
            }
        });
        dbPageA20.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    String A20dbModel = documentSnapshot.getString("model");
                    String A20dbColor = documentSnapshot.getString("color");
                    String A20dbVin = documentSnapshot.getString("vin");
                    Boolean A20dbOccupied = documentSnapshot.getBoolean("occupied");
                    if(A20dbOccupied==true){
                        A20model.setText(A20dbModel);
                        A20color.setText(A20dbColor);
                        A20vin.setText(A20dbVin);
                        btnA20.setBackgroundColor(Color.RED);
                        System.out.println("********"+A20dbModel+ " "+A20dbColor+" "+A20dbVin+"*************");
                    }else{
                        A20model.setText("");
                        A20color.setText("");
                        A20vin.setText("");
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
    public void viewParkingSpotA3(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A3 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA3.class);
        startActivity(intent);
    }
    public void viewParkingSpotA4(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A4 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA4.class);
        startActivity(intent);
    }
    public void viewParkingSpotA5(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A5 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA5.class);
        startActivity(intent);
    }
    public void viewParkingSpotA6(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A6 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA6.class);
        startActivity(intent);
    }
    public void viewParkingSpotA7(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A7 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA7.class);
        startActivity(intent);
    }
    public void viewParkingSpotA8(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A8 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA8.class);
        startActivity(intent);
    }
    public void viewParkingSpotA9(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A9 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA9.class);
        startActivity(intent);
    }
    public void viewParkingSpotA10(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A10 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA10.class);
        startActivity(intent);
    }
    public void viewParkingSpotA11(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A11 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA11.class);
        startActivity(intent);
    }
    public void viewParkingSpotA12(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A12 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA12.class);
        startActivity(intent);
    }
    public void viewParkingSpotA13(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A13 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA13.class);
        startActivity(intent);
    }
    public void viewParkingSpotA14(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A14 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA14.class);
        startActivity(intent);
    }
    public void viewParkingSpotA15(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A15 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA15.class);
        startActivity(intent);
    }
    public void viewParkingSpotA16(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A16 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA16.class);
        startActivity(intent);
    }
    public void viewParkingSpotA17(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A17 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA17.class);
        startActivity(intent);
    }
    public void viewParkingSpotA18(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A18 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA18.class);
        startActivity(intent);
    }
    public void viewParkingSpotA19(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A19 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA19.class);
        startActivity(intent);
    }
    public void viewParkingSpotA20(View view){
        //Testing button
        Log.d(LOG_TAG, "parking spot A20 button pushed!");
        Intent intent = new Intent (ParkingLotPage.this, ParkingSpotPageA20.class);
        startActivity(intent);
    }
}