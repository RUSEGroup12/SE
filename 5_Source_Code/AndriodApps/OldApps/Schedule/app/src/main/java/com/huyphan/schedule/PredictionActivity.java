package com.huyphan.schedule;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PredictionActivity extends AppCompatActivity {

    String locationLatitude;
    String locationLongitude;
    String destinationLatitude;
    String destinationLongitude;
    TextView jsonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);

        jsonText = (TextView) findViewById(R.id.JSON);

        Intent intent = getIntent();
        locationLatitude = intent.getStringExtra("locationLatitude");
        locationLongitude = intent.getStringExtra("locationLongitude");
        destinationLatitude = intent.getStringExtra("destinationLatitude");
        destinationLongitude = intent.getStringExtra("destinationLongitude");


        DownloadTask task = new DownloadTask();
//        task.execute("https://maps.googleapis.com/maps/api/directions/json?origin=Brooklyn&destination=Queens&mode=transit&key=AIzaSyC2iXJQJrb7xeZJv-qVyQ0UkdAtP_G8Lkk");

        task.execute("https://maps.googleapis.com/maps/api/directions/json?" +
                "origin=" + locationLatitude + "," + locationLongitude +
                "&destination=" + destinationLatitude + "," + destinationLongitude +
                "&key=AIzaSyCpl9VDsbJ_-tmb2askZQ-nABj_pj6PVh4");

    }

    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {

            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;

            try {
                url = new URL(urls[0]);

                urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();

                InputStreamReader reader = new InputStreamReader(in);

                int data = reader.read();

                while (data != -1) {

                    char current = (char) data;

                    result += current;

                    data = reader.read();

                }

                return result;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Log.i("Google Map ----", result);

            jsonText.setText(result);

            Log.i("locationLatitude :", locationLatitude);
            Log.i("locationLongitude :", locationLongitude);
            Log.i("destinationLatitude :", destinationLatitude);
            Log.i("destinationLongitude :", destinationLongitude);

        }
    }


}
