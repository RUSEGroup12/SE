package comrusegroup12.github.smarthomesystem;

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
        display(temp);

    }

    public void decrement(View view) {
        temp--;
        display(temp);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.prefTemp);
        quantityTextView.setText("" + number +" \u00b0F");
    }

}
