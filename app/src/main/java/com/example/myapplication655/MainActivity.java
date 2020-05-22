package com.example.myapplication655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CallReceiver callReceiver = new CallReceiver();
    }
    public void Start(View view) {
        Log.i("inform", "Start is started");
        Intent intent = new Intent(this, CallReceiver.class);
        startActivity(intent);
    }

}
