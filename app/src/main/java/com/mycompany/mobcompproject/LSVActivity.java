package com.mycompany.mobcompproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LSVActivity extends AppCompatActivity {

    String Population;
    String WindDirection;
    String WindStrength;
    String SwellHeight;
    boolean Currents;
    boolean WeatherConditions;

    private TextView PopulationOutput;
    private TextView WindDirectionOutput;
    private TextView WindStrengthOutput;
    private TextView SwellHeightOutput;
    private TextView CurrentsOutput;
    private TextView WeatherConditionsOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsv);

        PopulationOutput = (TextView) findViewById(R.id.PopulationOutput);
        WindDirectionOutput = (TextView) findViewById(R.id.WindDirectionOutput);
        WindStrengthOutput = (TextView) findViewById(R.id.WindStrengthOutput);
        SwellHeightOutput = (TextView) findViewById(R.id.SwellHeightOutput);
        CurrentsOutput = (TextView) findViewById(R.id.CurrentsOuput);
        WeatherConditionsOutput = (TextView) findViewById(R.id.WeatherConditionsOutput);



        Intent intent = getIntent();
        if (intent.hasExtra("Population")) {
            Population = intent.getStringExtra("Population");
            WindDirection = intent.getStringExtra("WindDirection");
            WindStrength = intent.getStringExtra("WindStrength");
            SwellHeight = intent.getStringExtra("SwellHeight");
           // Currents = intent.getStringExtra("DeepWaterSwitch");
            Currents = getIntent().getBooleanExtra("DeepWaterSwitch", false);
            WeatherConditions = getIntent().getBooleanExtra("NoCloudCheck", false);
        }
        else Population = "No data from intent." ;

            PopulationOutput.setText(Population) ;
            WindDirectionOutput.setText(WindDirection);
            WindStrengthOutput.setText(WindStrength + "km/h");
            SwellHeightOutput.setText(SwellHeight + "m");
            CurrentsOutput.setText(String.valueOf(Currents));
            WeatherConditionsOutput.setText(String.valueOf(WeatherConditions));
    }
}
