package comrusegroup12.github.smarthomesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;


public class HVAC extends AppCompatActivity {

    //Create HVAC object
    HVACClass myHVAC = new HVACClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView timeToTemp = (TextView) findViewById(R.id.timeToTemp); // Get timeToTemp TextView object
        myHVAC.updateTimeToTemp(myHVAC.k, myHVAC.helpConst, 72, 69, timeToTemp); // Initialize timeToTemp
    }

    // Increase value of preferred on GUI
    public void increasePreferred(View view){
        TextView preferredTempText = (TextView) findViewById(R.id.preferred_temp);
        String preferredString = preferredTempText.getText().toString();
        int preferredTemp = Integer.parseInt(preferredString);
        if(preferredTemp < 90) {
            preferredTemp++;
            preferredString = Integer.toString(preferredTemp);
            preferredTempText.setText(preferredString);
        }
        else
            return;
    }

    // Decrease value of preferred on GUI
    public void decreasePreferred(View view){
        TextView preferredTempText = (TextView)findViewById(R.id.preferred_temp);
        String preferredString = preferredTempText.getText().toString();
        int preferredTemp = Integer.parseInt(preferredString);
        if(preferredTemp > 60) {
            preferredTemp--;
            preferredString = Integer.toString(preferredTemp);
            preferredTempText.setText(preferredString);
        }
        else
            return;
    }

    public void setTTT(View view){
        TextView timeToTemp = (TextView) findViewById(R.id.timeToTemp);
        TextView preferredTempText = (TextView)findViewById(R.id.preferred_temp);
        TextView currentTempText = (TextView)findViewById(R.id.current_temp);

        String preferredString = preferredTempText.getText().toString();
        int preferred = Integer.parseInt(preferredString);

        String currentString = currentTempText.getText().toString();
        int current = Integer.parseInt(currentString);

        myHVAC.updateTimeToTemp(myHVAC.k, myHVAC.helpConst, preferred, current, timeToTemp);
    }



    public class HVACClass {

        // Class constructor
        public HVACClass(){}

        public double k = 0.3; // used in e^(kt)
        public int helpConst = 7; // multiplier used to get normalized timeToTemp

        // Given 4 values calculates timeToTemp and returns a double
        private double timeToTemp(double k, int helpConst, int preferred, int current){
            double x = Math.exp((double)current/(double)preferred);
            double t = - (helpConst /(x * k)) * Math.log((0.01*preferred)/(preferred - current));
            return t;
        }

        // Given a TextView parameter it calculates timeToTemp and sets a new string to t
        public void updateTimeToTemp(double k, int helpConst, int preferred, int current, TextView t){
            double temp = timeToTemp(k, helpConst, preferred, current);
            String setString = getString(temp);
            t.setText( setString );
        }

        public String getString(double x){
            String s;
            if(x == 0){
                s = "Temperature already reached";}
            else if(x < 10){
                s = "< 10 minutes";}
            else if(x < 15){
                s = "10 minutes";}
            else if(x < 20){
                s = "15 minutes";}
            else if(x < 25){
                s = "20 minutes";}
            else if(x < 30){
                s = "25 minutes";}
            else if(x < 35){
                s = "30 minutes";}
            else if(x < 40){
                s = "35 minutes";}
            else if(x < 45){
                s = "40 minutes";}
            else if(x < 50){
                s = "45 minutes";}
            else if(x < 55){
                s = "50 minutes";}
            else if(x < 60){
                s = "55 minutes";}
            else if(x >= 60){
                s = "> 1 hour";}
            else
                s = "Error";

            return s;
        }

    }
}