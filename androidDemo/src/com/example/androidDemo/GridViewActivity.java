package com.example.androidDemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class GridViewActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);
        setTitle("grid view");

        init();
    }

    private void init() {
        GridView gv = (GridView) findViewById(R.id.grid_view);
        gv.setAdapter(new MyAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "pic position is " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

class MyAdapter extends BaseAdapter {

    private Context mContext;

    private int[] imgIds = {R.drawable.zhoutao_s, R.drawable.zhangfei_s, R.drawable.xiaoqiao,
            R.drawable.lvbu, R.drawable.lidian_s, R.drawable.s1, R.drawable.s2,
            R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6};

    public MyAdapter() {
    }

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imgIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv;

        if (convertView == null) {
            iv = new ImageView(mContext);
            iv.setAdjustViewBounds(false);//边界对齐
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);//设置刻度类型
            iv.setLayoutParams(new GridView.LayoutParams(75, 75));//设置对应布局参数
            iv.setPaddingRelative(8, 8, 8, 8);//设置边界
        } else {
            iv = (ImageView) convertView;
        }

        iv.setImageResource(imgIds[position]);

        return iv;
    }
}