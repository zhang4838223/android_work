package com.example.spinerTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{
    /**
     * Called when the activity is first created.
     */
    private Spinner citiesSpinner;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle(R.string.spinner_title);

        initViews();

        //通过ArrayAdapter准备下拉显示资源
        String[] cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerActivity.this,android.R.layout.simple_spinner_item,cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        citiesSpinner.setAdapter(adapter);


    }

    private void initViews() {
        citiesSpinner = (Spinner)findViewById(R.id.spinner_1);
        //设置选择事件
        citiesSpinner.setOnItemSelectedListener(SpinnerActivity.this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String city = parent.getItemAtPosition(position).toString();//获取选择文案
        Toast.makeText(SpinnerActivity.this,"you have selected city: "+city,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
