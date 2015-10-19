package com.example.androidDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private Button dataPickerBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("Android demo");
        init();

    }

    private void init() {
        //点击跳转到DataPickerActivity
        dataPickerBtn = (Button)findViewById(R.id.data_picker_btn);
        dataPickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,DataPickerActivity.class);
                startActivity(intent);
            }
        });

        //点击跳转到TimePickerActivity
        Button timeBtn = (Button)findViewById(R.id.time_picker_btn);
        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,TimePickerActivity.class);
                startActivity(intent);
            }
        });
    }
}
