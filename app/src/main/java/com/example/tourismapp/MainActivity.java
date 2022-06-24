package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.example.tourismapp.Login;

public class MainActivity extends AppCompatActivity {

    int logFlag=0;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            Intent logIntent = new Intent(MainActivity.this,Login.class);
            startActivity(logIntent);
    }
}