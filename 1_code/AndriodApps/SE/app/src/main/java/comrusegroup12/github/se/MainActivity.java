package comrusegroup12.github.se;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static comrusegroup12.github.se.R.id.minusButton;

public class MainActivity extends AppCompatActivity {

    SharedPreferences settings;
    TextView prefTemp;
    TextView currentTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getviews
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        currentTemp = (TextView) findViewById(R.id.current_temp);

        //settings
        settings = this.getSharedPreferences("comrusegroup12.github.se", Context.MODE_PRIVATE);

        //get from settings cache and update the views
        prefTemp.setText(String.valueOf(settings.getInt("prefTemp",0)));
        currentTemp.setText(String.valueOf(settings.getInt("currentTemp",72)));

    }

    public void dec(View view) {
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        int x = settings.getInt("prefTemp",73);
        x--;
        settings.edit().putInt("prefTemp", x).commit();
        prefTemp.setText(String.valueOf(x));

    }

    public void inc(View view) {
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        int x = settings.getInt("prefTemp",73);
        x++;
        settings.edit().putInt("prefTemp", x).commit();
        prefTemp.setText(String.valueOf(x));
    }



}
