package com.mycompany.mobcompproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckInClick(View view) {// function named in OnClick
        startActivity(new Intent(MainActivity.this, InformationActivity.class));
        // come back via onResume() event.
    }

    public void SensorClick(View view) {// function named in OnClick
        startActivity(new Intent(MainActivity.this, SensorActivity.class));
        // come back via onResume() event.
    }

    public void SnapshotClick(View view) {// function named in OnClick
        startActivity(new Intent(MainActivity.this, SnapshotActivity.class));
        // come back via onResume() event.
    }

    //TODO: Create Drop down menu for menu button
    //TODO: Improve UI
    //TODO: (If time permits) Inventory System
}
