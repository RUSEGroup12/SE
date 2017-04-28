package comrusegroup12.github.smarthomesystem;

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

    public void openHVAC(View view){
        Intent i = new Intent(this, HVAC.class);
        startActivity(i);
    }

    public void openAudio(View view){
        Intent i = new Intent(this, Audio.class);
        startActivity(i);
    }
}
