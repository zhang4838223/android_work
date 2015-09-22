package com.example.BMI_Test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        setViews();

        setEvents();
    }

    private void setEvents() {
        cal_btn.setOnClickListener(MyActivity.this);
    }

    private void setViews() {
        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        result = (TextView)findViewById(R.id.result);
        suggest = (TextView)findViewById(R.id.suggestion);
        cal_btn = (Button)findViewById(R.id.calculate_btn);
    }

    @Override
    public void onClick(View v) {

        try {
            DecimalFormat df = new DecimalFormat("0.00");
            Double h = Double.valueOf(height.getText().toString()) / 100;
            Double w = Double.valueOf(weight.getText().toString());
            double value = w / (h * h);
            Log.v("BMI value: ",value+"");

            result.setText("your BMI value is : " + df.format(value));

            if (value > 25) {
                suggest.setText(R.string.advice_heavy);
            } else if (value < 20) {
                suggest.setText(R.string.advice_light);
            } else {
                suggest.setText(R.string.advice_average);

            }
        }catch (Exception e){
            Toast.makeText(MyActivity.this,Toast.LENGTH_SHORT,R.string.toast_error).show();
        }
        openDialogView();

    }

    /**
     * 弹出对话框
     */
    private void openDialogView() {
        new AlertDialog.Builder(MyActivity.this)
                .setTitle(R.string.dialog_title)
                .setMessage(R.string.dialog_message)
                .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MyActivity.this,Toast.LENGTH_SHORT,R.string.toast_error).show();
                    }
                })
                .setNegativeButton(R.string.dialog_homepage, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //跳转，访问网址
                        Uri uri = Uri.parse("http://www.baidu.com/");
                        Intent in = new Intent(Intent.ACTION_VIEW,uri);
                        startActivity(in);
                    }
                })
                .show();
    }
}
