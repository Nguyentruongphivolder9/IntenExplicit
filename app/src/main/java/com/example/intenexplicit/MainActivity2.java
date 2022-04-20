package com.example.intenexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        // 1 : Nhận kiểu String
//        Intent intent = getIntent();
//
//        if (intent != null){
//            String text = intent.getStringExtra("text");
//            Log.d("BBB",text);
//        }

        // 2 : Nhận kiểu Object
//        Intent intent = getIntent();
//
//        if (intent != null) {
//            ArrayList<Animal> animal = intent.getParcelableArrayListExtra("Object");
//            Log.d("BBB",animal.size() + "");
//        }

        // 3 : Nhận kiểu Bundle
        Intent intent = getIntent();

        if (intent != null) {
            Bundle bundle = intent.getBundleExtra("bundle");
            String text = bundle.getString("text");
            int number = bundle.getInt("number");
            Log.d("BBB",text);
            Log.d("BBB",number + "");
        }
    }
}