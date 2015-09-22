package com.example.BMI_Test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */

    private EditText height;
    private EditText weight;
    private TextView result;
    private TextView suggest;
    private Button  cal_btn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        result = (TextView)findViewById(R.id.result);
        suggest = (TextView)findViewById(R.id.suggestion);
        cal_btn = (Button)findViewById(R.id.calculate_btn);

        cal_btn.setOnClickListener(MyActivity.this);
    }

    @Override
    public void onClick(View v) {

        DecimalFormat df = new DecimalFormat("0.00");
        Double h = Double.valueOf(height.getText().toString())/100;
        Double w = Double.valueOf(weight.getText().toString());
        double value = w / (h*h);

        result.setText("your BMI value is : "+ df.format(value));

        if(value > 25){
            suggest.setText(R.string.advice_heavy);
        }else if(value<20){
            suggest.setText(R.string.advice_light);
        }else {
            suggest.setText(R.string.advice_average);

        }

    }
}
