package com.example.forwardWithResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReceiveResult extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */

    private Button receiveButton;         //发送按钮
    private EditText mResult;             //接收消息显示的文本框
    private static final int GET_CODE = 0;//请求约定的code
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive);

        mResult = (EditText)findViewById(R.id.received_result);         //获取文本框
        receiveButton = (Button)findViewById(R.id.receive_button);      //获取按钮
        receiveButton.setOnClickListener(this);                         //按钮注册点击事件
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ReceiveResult.this, Sender.class);    //点击时从receive跳转到sender
        startActivityForResult(intent, GET_CODE);                        //以获取返回信息的方式开启活动，并使用约定指定的请求码
    }

    /**
     * 对活动的返回结果进行处理
     * @param requestCode  使用startActivityForResult()开启活动时约定的请求码
     * @param resultCode   响应码
     * @param data         活动交互间的附属信息
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.v("ReceiveResult", "requestCode = "+ requestCode+" , resultCode= "+ resultCode+", text= "+data.getAction());
        if(requestCode == GET_CODE) {                       //判断请求码
            Editable text = (Editable) mResult.getText();   //获取文本框的编辑文本对象，可编辑响应文本到页面显示
            if (resultCode == RESULT_CANCELED){             //判断响应码
                text.append("(cancelled)");
            }else{
                text.append("(okay");
                text.append(Integer.toString(resultCode));
                text.append(")");

                if(data != null){
                    text.append(data.getAction());          //获取活动中交互信息
                }
            }
            text.append("\n");
        }
    }
}
