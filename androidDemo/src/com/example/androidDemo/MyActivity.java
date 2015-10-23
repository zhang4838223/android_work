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
        //点击跳转到ScrollViewActivity
        Button scrollViewBtn = (Button)findViewById(R.id.scrollview_btn);
        scrollViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,ScrollViewActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到ProgressBarActivity
        Button progressBarBtn = (Button)findViewById(R.id.progress_btn);
        progressBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,ProgressBarActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到SeekBarActivity
        Button seekBarBtn = (Button)findViewById(R.id.seekbar_btn);
        seekBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,SeekBarActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到RatingBarActivity
        Button ratingBarBtn = (Button)findViewById(R.id.ratingbar_btn);
        ratingBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,RatingBarActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到ImageShowActivity
        Button imageSwithcBtn = (Button)findViewById(R.id.imageswitch_btn);
        imageSwithcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,ImageShowActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到GridViewActivity
        Button gridViewBtn = (Button) findViewById(R.id.grid_view_btn);
        gridViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到TabDemoActivity
        Button tabBtn = (Button) findViewById(R.id.tab_btn);
        tabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this, TagDemoActivity.class);
                startActivity(intent);
            }
        });
        //点击跳转到TabsActivities
        Button tabActivitiesBtn = (Button) findViewById(R.id.tab_activities_btn);
        tabActivitiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyActivity.this, TabsActivities.class);
                startActivity(intent);
            }
        });
    }
}
