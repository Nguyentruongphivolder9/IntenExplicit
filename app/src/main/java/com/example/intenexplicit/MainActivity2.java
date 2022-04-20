package com.example.intenexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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
        Intent intent = getIntent();

        if (intent != null) {
            Animal animal = (Animal) intent.getSerializableExtra("Object");
            Log.d("BBB",animal.toString());
        }
    }
}