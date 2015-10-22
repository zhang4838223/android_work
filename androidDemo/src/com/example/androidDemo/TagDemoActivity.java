package com.example.androidDemo;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

/**
 * Created by xiaojun.zhang on 2015/10/22.
 * 使用tab组建的步骤：
 * 1.在布局文件中使用FrameLayout列出Tab组件以及Tab中的内容组件
 * <p/>
 * 2.Activity要继承TabActivity
 * <p/>
 * 3.调用TabActivity的getTabHost( )方法来获得TabHost对象
 * <p/>
 * 4.通过TabHost创建Tab选项
 */
public class TagDemoActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("tab activity");
        //获取TabHost对象
        TabHost tabHost = getTabHost();
        //from(this)获取当前活动的LayoutInflater对象
        //将指定布局文件解析为一个新的view视图
        //通过TabHost获取存放tab标签页内容的布局FrameLayout
        //是否将inflate加到根布局元素上
        LayoutInflater.from(TagDemoActivity.this).
                inflate(R.layout.tab, tabHost.getTabContentView(), true);

        //设置标签页的文案tab1，设置标签指示器，设置标签对应显示的内容
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("pic1").setContent(R.id.text_view01));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("pic2").setContent(R.id.text_view02));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("pic3").setContent(R.id.text_view03));
    }
}
