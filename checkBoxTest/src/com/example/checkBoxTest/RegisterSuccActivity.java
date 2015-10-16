package com.example.checkBoxTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiaojun.zhang on 2015/10/16.
 */
public class RegisterSuccActivity extends Activity {

    private Button finishT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        finishT = (Button)findViewById(R.id.finish);
        finishT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK,new Intent());
                finish();
            }
        });

    }
}
