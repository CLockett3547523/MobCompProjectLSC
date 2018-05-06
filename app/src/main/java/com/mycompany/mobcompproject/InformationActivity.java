package com.mycompany.mobcompproject;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Switch;

public class InformationActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 10;
    private TextInputEditText Population;
    private Spinner WindDirection;
    private TextInputEditText WindStrength;
    private TextInputEditText SwellHeight;
    private Switch DeepWaterSwitch;

    private CheckBox NoCloudCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Population = (TextInputEditText)findViewById(R.id.Population);
        WindDirection = (Spinner)findViewById(R.id.WindDirection);
        WindStrength = (TextInputEditText)findViewById(R.id.WindStrength);
        SwellHeight = (TextInputEditText)findViewById(R.id.SwellHeight);
        DeepWaterSwitch = (Switch)findViewById(R.id.DeepWaterSwitch);

        NoCloudCheck = (CheckBox)findViewById(R.id.NoCloudCheck);
    }

    public void SendInfoClick(View view) {// function named in OnClick
        Intent myIntent = new Intent(InformationActivity.this, LSVActivity.class);
        myIntent.putExtra("Population", Population.getText().toString());
        myIntent.putExtra("WindDirection", WindDirection.getSelectedItem().toString());
        myIntent.putExtra("WindStrength", WindStrength.getText().toString());
        myIntent.putExtra("SwellHeight", SwellHeight.getText().toString());
        myIntent.putExtra("DeepWaterSwitch", DeepWaterSwitch.isChecked());

        myIntent.putExtra("NoCloudCheck", NoCloudCheck.isChecked());

        startActivityForResult(myIntent, REQUEST_CODE);
        // come back via onResume() event.
    }
}
