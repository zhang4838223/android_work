package com.example.androidDemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.*;

public class ImageShowActivity extends Activity implements ViewSwitcher.ViewFactory,AdapterView.OnItemSelectedListener {
    /**
     * Called when the activity is first created.
     */
    //处理图片显示
    private ImageSwitcher mSwitcher;
    private int[] mThumbIds = {R.drawable.lidian_s,R.drawable.lvbu,R.drawable.xiaoqiao,
            R.drawable.zhangfei_s,R.drawable.zhoutao_s};
    private int[] mImageIds = {R.drawable.lidian_s,R.drawable.lvbu,R.drawable.xiaoqiao,
            R.drawable.zhangfei_s,R.drawable.zhoutao_s};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //需要在setContentView()之前调用
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.image_show);
        setTitle("image show");

        mSwitcher = (ImageSwitcher)findViewById(R.id.switcher);
        mSwitcher.setFactory(this);
        mSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        mSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        //下方的小图片列表区域
        Gallery g = (Gallery) findViewById(R.id.gallery);
        //适配装载图片列表资源
        g.setAdapter(new ImageAdapter(this));
        g.setOnItemSelectedListener(this);

    }

    @Override
    public View makeView() {
        ImageView iv = new ImageView(this);
        iv.setBackgroundColor(0xFF000000);
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iv.setLayoutParams(
                new ImageSwitcher.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT)
        );
        return iv;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSwitcher.setImageResource(mImageIds[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    class ImageAdapter extends BaseAdapter{

        private Context mContext;

        public ImageAdapter() {
        }

        public ImageAdapter(Context mContext) {
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return mThumbIds.length;
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

            ImageView iv = new ImageView(mContext);
            //设置列表各个位置的图片资源
            iv.setImageResource(mThumbIds[position]);
            iv.setAdjustViewBounds(true);
            iv.setLayoutParams(new Gallery.LayoutParams(Gallery.LayoutParams.WRAP_CONTENT, Gallery.LayoutParams.WRAP_CONTENT));
            iv.setBackgroundResource(R.drawable.bc);

            return iv;
        }
    }

}
