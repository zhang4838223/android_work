package com.example.motionTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MotionActivity extends Activity {

    private static final String TAG = "TEST_MOTION_ACTIVITY";
    private TextView actionView;
    private TextView positionView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        actionView = (TextView)findViewById(R.id.action);
        positionView = (TextView)findViewById(R.id.position);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();
        Log.v(TAG,"action = "+ action);
        Log.v(TAG,"("+x+","+y+")");

        actionView.setText("action = " + action);
        positionView.setText("positon = "+ "("+x+","+y+")");

        return true;
    }
}
