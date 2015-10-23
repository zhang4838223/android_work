package com.example.androidDemo;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by xiaojun.zhang on 2015/10/22.
 */
public class TabsActivities extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_activities);

        //获取资源
        Resources res = getResources();
        TabHost tabHost = getTabHost();//获取TabHost对象

        TabHost.TabSpec tab; //声明一个标签对象
        Intent in; //声明一个跳转对象

        //第一个tab
        in = new Intent(this, DataPickerActivity.class);//初始化第一个intent
        tab = tabHost.newTabSpec("tab1")//初始化第一个tab
                .setIndicator("show1", res.getDrawable(android.R.drawable.ic_media_play))//设置标签的名称及图标
                .setContent(in);//设置标签的内容为Intent
        tabHost.addTab(tab);//将tab添加到tab容器中

        //第二个tab
        in = new Intent(this, TimePickerActivity.class);//初始化第二个intent
        tab = tabHost.newTabSpec("tab2")//初始化第二个tab
                .setIndicator("show2", res.getDrawable(android.R.drawable.ic_menu_edit))//设置标签的名称及图标
                .setContent(in);//设置标签的内容为Intent
        tabHost.addTab(tab);//将tab添加到tab容器中
        //第三个tab
        in = new Intent(this, GridViewActivity.class);//初始化intent
        tab = tabHost.newTabSpec("tab3")//初始化tab
                .setIndicator("show3", res.getDrawable(android.R.drawable.btn_radio))//设置标签的名称及图标
                .setContent(in);//设置标签的内容为Intent
        tabHost.addTab(tab);//将tab添加到tab容器中

        tabHost.setCurrentTab(0);
    }
}
