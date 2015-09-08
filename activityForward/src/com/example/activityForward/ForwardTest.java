package com.example.activityForward;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForwardTest extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.source);

        button = (Button)findViewById(R.id.source_b);  //获取控件
        button.setOnClickListener(this);               //注册监听
    }


    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        intent.setClass(ForwardTest.this, ForwardTarget.class);//设置活动
        startActivity(intent);
        finish();                 //结束当前活动
    }
}
