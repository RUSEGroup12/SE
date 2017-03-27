package comrusegroup12.github.smarthomesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HVAC extends AppCompatActivity {

    private int temp = 73;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hvac);
    }

    public void increment(View view) {
        temp++;
        displayPreTemp(temp);
        TextView v = (TextView) findViewById(R.id.currentTemp);
        int tem = Integer.parseInt(v.getText().toString());
        double t = Time2Temp(0.3,7,temp,tem);
        updateDisplayT2T(t);
    }


    private void updateDisplayT2T(double t){

        TextView quantityTextView = (TextView) findViewById(R.id.time2Temp);
        quantityTextView.setText("" + t +" mintues");

    }

    private double Time2Temp(double k, int helpConst, int preferred, int current) {
        if(preferred == current){
            return 0;
        }
        double x = Math.exp((double)current/(double)preferred);
        double t = - (helpConst /(x * k)) * Math.log((0.01*preferred)/(preferred - current));
        return t;//time2tmp
    }


    public void decrement(View view) {
        temp--;
        displayPreTemp(temp);
    }

    private void displayPreTemp(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.prefTemp);
        quantityTextView.setText("" + number +" \u00b0F");
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
