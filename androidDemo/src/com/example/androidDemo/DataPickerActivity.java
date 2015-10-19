package com.example.androidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;

public class DataPickerActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private DatePicker dp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_picker);
        setTitle("data picker");

        dp = (DatePicker)findViewById(R.id.data_picker);
        dp.init(2015,10,19,null);
    }
}
