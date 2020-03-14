package com.example.inventorysysytem;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AppActivity extends AppCompatActivity {

    Button btn_systemunit;
    Button btn_headset;
    Button btn_monitor;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_app);

        btn_systemunit = findViewById(R.id.btn_sysunit);
        btn_headset = findViewById(R.id.btn_headset);
        btn_monitor = findViewById(R.id.btn_monitor);

        btn_systemunit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                systemunit();
            }
        });

        btn_monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitors();
            }
        });

        btn_headset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                headsets();
            }
        });
    }

    public void systemunit(){
        startActivity(new Intent(getApplicationContext(),SystemUnit.class));
    }

    public void monitors(){
        startActivity(new Intent(getApplicationContext(),Monitor.class));
    }

    public void headsets(){
        startActivity(new Intent(getApplicationContext(),Headset.class));
    }

}



