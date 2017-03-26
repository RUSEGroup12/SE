package com.example.akhil.frame;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int i = 0;
    int x = 0;
    boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mtextView = (TextView)findViewById(R.id.textView);
        mtextView.setText("No music is playing");


        final ImageButton playbutton = (ImageButton) findViewById(R.id.playButton);
        playbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mtextView.setText("Song " +i +" is Playing");
                playing = true;

            }
        });

        final ImageButton pausebutton = (ImageButton) findViewById(R.id.pauseButton);
        pausebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mtextView.setText("Song " +i +" is Paused");
                playing = false;

            }
        });

        final ImageButton forwardbutton = (ImageButton) findViewById(R.id.forwardButton);
        forwardbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                i=i+1;
                mtextView.setText("Changing to song "+i);
                playing = false;

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        mtextView.setText("Song " +i +" is Playing");
                        playing = true;
                    }
                }, 1300);

            }
        });

        final ImageButton backbutton = (ImageButton) findViewById(R.id.backButton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if((i-1)>=0) {
                    i = i - 1;
                } else{

                }
                mtextView.setText("Changing to song "+i);
                playing = false;
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        mtextView.setText("Song " +i +" is Playing");
                        playing = true;
                    }
                }, 1300);


            }
        });


















    }
}
