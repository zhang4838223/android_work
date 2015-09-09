package com.example.forwardWithResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiaojun.zhang on 2015/9/9.
 */
public class Sender extends Activity {

    /**
     * Called when the activity is first created.
     */

    private Button corky_btn;       //发送响应按钮1
    private Button violet_btn;      //发送响应按钮2

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sender);

        //获取相应view对象
        corky_btn = (Button)findViewById(R.id.send_button1);
        violet_btn = (Button)findViewById(R.id.send_button2);

        corky_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置响应结果，用Intent的setAction设置响应信息
                String text = (String)corky_btn.getText();
                Log.v("corky_btn value","corky_btn value: "+text);
                setResult(RESULT_OK, (new Intent()).setAction(text));
                finish();//终止该活动
            }
        });

        violet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置响应结果，用Intent的setAction设置响应信息
                String text = (String)violet_btn.getText();
                Log.v("violet_btn value","violet_btn value: "+text);
                setResult(RESULT_OK, (new Intent()).setAction(text));
                finish();//终止该活动
            }
        });
    }
}
