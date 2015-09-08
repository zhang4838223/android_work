package com.example.testMotionEvent;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static final String TAG = "TEST_MOTION_EVENT" ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TestMotionView(this));
    }

    public class TestMotionView extends View {

        private Paint paint = new Paint();
        private int action ;
        private float x ;
        private float y ;


        public TestMotionView(Context context) {
            super(context);
            action = MotionEvent.ACTION_UP;
            x=0;
            y=0;
        }

        @Override
        protected void onDraw(Canvas canvas) {

            canvas.drawColor(Color.WHITE);
            if(MotionEvent.ACTION_MOVE == action){
                paint.setColor(Color.RED);
            }else if(MotionEvent.ACTION_UP == action){
                paint.setColor(Color.GREEN);
            }else if(MotionEvent.ACTION_DOWN == action){
                paint.setColor(Color.BLUE);
            }
            canvas.drawCircle(x, y, 10, paint);
            setTitle("A = " + action + " (" + x + "," + y + ")");
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            action = event.getAction();
            x = event.getX();
            y = event.getY();

            Log.v(TAG, "action = " + action);
            Log.v(TAG, "("+x+","+y+")");

            invalidate();
            return true;
        }
    }
}
