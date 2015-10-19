package com.example.androidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class TimePickerActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private TimePicker timePicker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker);
        setTitle("time picker");

        timePicker = (TimePicker)findViewById(R.id.time_picker);
        timePicker.setIs24HourView(true);

    }
}
