package comrusegroup12.github.shs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void oneUp(View view) {
        TextView qView = (TextView) findViewById(R.id.prefTemp);
        String s = qView.getText().toString();
        s = s.substring(0,s.indexOf("\u00b0")-1);
        int q = Integer.parseInt(s);
        display(q + 1);
    }

    public void oneDown(View view) {
        TextView qView = (TextView) findViewById(R.id.prefTemp);
        String s = qView.getText().toString();
        s = s.substring(0,s.indexOf("\u00b0")-1);
        int q = Integer.parseInt(s);
        display(q - 1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.prefTemp);
        quantityTextView.setText("" + number +" \u00b0F");
    }
}