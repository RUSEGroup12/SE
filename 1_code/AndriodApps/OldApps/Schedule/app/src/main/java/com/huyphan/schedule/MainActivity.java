package com.huyphan.schedule;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText alarmTime;
    EditText timeToGetReady;

    TextView locationLatitude;
    TextView locationLongitude;
    TextView destinationLatitude;
    TextView destinationLongtitude;

    SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alarmTime = (EditText) findViewById(R.id.editText1);
        timeToGetReady = (EditText) findViewById(R.id.editText2);

        locationLatitude = (TextView) findViewById(R.id.LocationLatitude);
        locationLongitude =(TextView) findViewById(R.id.LocationLongitude);
        destinationLatitude = (TextView) findViewById(R.id.DestinationLatitude);
        destinationLongtitude = (TextView) findViewById(R.id.DesinationLongitude);


        settings = this.getSharedPreferences("com.huyphan.schedule", Context.MODE_PRIVATE);

        String alarmTimeString = settings.getString("alarmTime", "");
        alarmTime.setText(alarmTimeString);
        String timeToGetReadyString = settings.getString("timeToGetReady", "");
        timeToGetReady.setText(timeToGetReadyString);

        InputMethodManager inputMethodManager =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(timeToGetReady.getWindowToken(), 0);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        locationLatitude.setText(settings.getString("locationLatitude", ""));
        locationLongitude.setText(settings.getString("locationLongitude", ""));
        destinationLatitude.setText(settings.getString("destinationLatitude", ""));
        destinationLongtitude.setText(settings.getString("destinationLongitude", ""));
    }

    public void save(View view){
        settings.edit().putString("alarmTime", alarmTime.getText().toString()).apply();
        settings.edit().putString("timeToGetReady", timeToGetReady.getText().toString()).apply();

        Toast.makeText(getApplicationContext(), "Settings Saved", Toast.LENGTH_SHORT).show();
    }

    public void showMaps(View view){
        Intent showMaps = new Intent(this, MapsActivity.class);
        startActivity(showMaps);
    }

    public void showPrediction(View view){
        Intent showPrediction = new Intent(this, PredictionActivity.class);
        showPrediction.putExtra("locationLatitude", locationLatitude.getText().toString());
        showPrediction.putExtra("locationLongitude", locationLongitude.getText().toString());
        showPrediction.putExtra("destinationLatitude", destinationLatitude.getText().toString());
        showPrediction.putExtra("destinationLongitude", destinationLongtitude.getText().toString());

        startActivity(showPrediction);
    }
}
