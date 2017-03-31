package comrusegroup12.github.smarthomesystem.data;


import android.provider.BaseColumns;

public final class HVACContract {

    private HVACContract(){}

    public static final class HVACEntry implements BaseColumns {

        public final static String TABLE_NAME = "hvac";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_KEY = "key";
        public final static String COLUMN_VALUE = "value";




    }

}
