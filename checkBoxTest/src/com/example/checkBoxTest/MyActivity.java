package com.example.checkBoxTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MyActivity extends Activity{
    /**
     * Called when the activity is first created.
     */

    private EditText usernameT;
    private Button registerT;
    private RadioButton genderBtn;
    private RadioGroup genderT;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initComponents();

        registerT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registEvent();
            }
        });
    }

    private void registEvent() {
        String username = usernameT.getText().toString();

        Log.v("username:", username);
        genderBtn = (RadioButton)findViewById(genderT.getCheckedRadioButtonId());
        Log.v("sex:", genderBtn.getText().toString());
        if(username==null||username.length()==0){
            Toast.makeText(MyActivity.this,"用户名不能为空！",Toast.LENGTH_SHORT).show();
        }else if(username.length()>6){
            Toast.makeText(MyActivity.this,"用户名长度不能超过6！",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent();
            intent.setClass(MyActivity.this, RegisterSuccActivity.class);
            startActivity(intent);
        }
    }

    private void initComponents() {

        usernameT = (EditText)findViewById(R.id.username);
        registerT = (Button)findViewById(R.id.register);

        genderT = (RadioGroup)findViewById(R.id.gender_group);
    }

}
