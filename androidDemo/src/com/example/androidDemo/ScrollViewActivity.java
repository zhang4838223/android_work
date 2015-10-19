package com.example.androidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;

public class ScrollViewActivity extends Activity {
    /**
     * Called when the activity is first created.
     */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);
        setTitle("scroll view");

    }
}
