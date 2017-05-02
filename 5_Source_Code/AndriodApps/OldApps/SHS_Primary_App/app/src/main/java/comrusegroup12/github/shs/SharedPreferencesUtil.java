package comrusegroup12.github.shs;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by tp on 4/15/17.
 */

public class SharedPreferencesUtil {

    private SharedPreferences sharedPreferences;
    private Context context;
    public SharedPreferencesUtil(Context ctx) {
        context = ctx;
        sharedPreferences = ctx.getSharedPreferences("comrusegroup12.github.shs", Context.MODE_PRIVATE);
    }

    public void putTemp(int temp) {
        sharedPreferences.edit().putInt("temp",temp).commit();
    }


}
