package comrusegroup12.github.shs;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static comrusegroup12.github.shs.R.id.action_settings;
import static comrusegroup12.github.shs.R.id.preferedTemp;

/**
 * Created by tp on 3/27/17.
 */

public class Fragment_HVAC extends Fragment {

    private Button hvacInc;
    SharedPreferences settings;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hvac, container, false);
        hvacInc = (Button)rootView.findViewById(R.id.hvacInc);
        hvacInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hvacIncrement();
            }
        });

        settings = this.getActivity().getSharedPreferences("comrusegroup12.github.shs", Context.MODE_PRIVATE);

        return rootView;
    }

    public void hvacIncrement() {

        settings.edit().getInt();

    }


}
