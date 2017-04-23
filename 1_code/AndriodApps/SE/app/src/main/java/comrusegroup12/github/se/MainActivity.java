package comrusegroup12.github.se;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;


import static comrusegroup12.github.se.R.id.minusButton;

public class MainActivity extends AppCompatActivity {

    public static final String apiurl = "http://9aa4017f.ngrok.io/data/preferred";

    SharedPreferences settings;
    TextView prefTemp;
    TextView currentTemp;
    TextView t2tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getviews
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        currentTemp = (TextView) findViewById(R.id.current_temp);
        t2tView = (TextView) findViewById(R.id.time2temp);

        //settings
        settings = this.getSharedPreferences("comrusegroup12.github.se", Context.MODE_PRIVATE);

        //get from settings cache and update the views
        prefTemp.setText(String.valueOf(settings.getInt("prefTemp",72)));
        currentTemp.setText(String.valueOf(settings.getInt("currentTemp",72)));
        t2tView.setText(settings.getString("t22","0.0"));


    }

    public void dec(View view) {
        //decrement the temp in data
        int x = settings.getInt("prefTemp",73);
        x--;
        settings.edit().putInt("prefTemp", x).commit();
        //update the views
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        prefTemp.setText(String.valueOf(x));

    }

    public void inc(View view) {
       //increment the temp in data
        int x = settings.getInt("prefTemp",73);
        x++;
        settings.edit().putInt("prefTemp", x).commit();
        //update the view with the new temp
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        prefTemp.setText(String.valueOf(x));
    }

    public void setFunc(View view) {
        //calculates the temperature
        int cTemp = settings.getInt("currentTemp", 73);
        int pTemp = settings.getInt("prefTemp", 73);
        String t2t = String.valueOf(t2t(cTemp, pTemp, 0.3, 7));

        t2t = t2t.substring(0, 4);


        //update cache
        settings.edit().putString("t2t", t2t).commit();

        //update the t2t view
        t2tView = (TextView) findViewById(R.id.time2temp);
        t2tView.setText(t2t);

        //network

        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... args) {
                try {
                    String URLpara = "preferred=" + String.valueOf(settings.getInt("prefTemp", 73));
                    byte[] postData = URLpara.getBytes();
                    int postDataLen = postData.length;
                    URL url = new URL(apiurl);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setDoOutput(true);
                    conn.setInstanceFollowRedirects(false);
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    conn.setRequestProperty("charset", "utf-8");
                    conn.setRequestProperty("Content-Length", Integer.toString(postDataLen));
                    conn.setUseCaches(false);
                    try {
                        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
                        wr.write(postData);
                        return "Good";
                    } catch (IOException e) {
                        return "IO prob";
                    }
                }
                catch (MalformedURLException e){
                    return "bad url";
                }
                catch (ProtocolException e){
                    return "bad protcol";
                }
                catch (IOException e){
                    return "bad input";
                }
            }
            public void onPostExecute() {
                return;
            }

        }.execute();
    }

    public double t2t(int current, int preferred, double k, int helpConst){
        if(preferred>current) {
            double x = Math.exp((double) current / (double) preferred);
            double t = -(helpConst / (x * k)) * Math.log((0.01 * preferred) / (preferred - current));
            return t;
        }
        else if(preferred==current){
            return 0.0;
        }
        else{
            return 0.0;
        }
    }

    public void homeSetting(View view){
        //update the temp in data
        int x = 76;
        settings.edit().putInt("prefTemp", x).commit();
        //update the views
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        prefTemp.setText(String.valueOf(x));
        setFunc(view);
    }

    public void awaySetting(View view){
        int prefT = 68;
        settings.edit().putInt("prefTemp", prefT).commit();
        //update the views
        prefTemp = (TextView) findViewById(R.id.preferred_temp);
        prefTemp.setText(String.valueOf(prefT));
        setFunc(view);
    }

}
