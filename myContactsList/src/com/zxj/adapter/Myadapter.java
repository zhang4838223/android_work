package com.zxj.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.myContactsList.R;
import com.zxj.android.domain.Person;

import java.util.List;

/**
 * Created by xiaojun.zhang on 2015/10/19.
 */
public class Myadapter extends BaseAdapter {

    private List<Person> personList;
    private Context mContext;

    public Myadapter() {
    }

    public Myadapter(List<Person> personList, Context mContext) {
        this.personList = personList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *该方法会返回指定位置对应的视图数据
     * @param position 下拉列表的位置索引
     * @param convertView 指定位置所对应的视图
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        //通过LayoutInflater获取main对应的视图
        convertView = layoutInflater.inflate(R.layout.main, null);

        if (convertView != null){//获取main视图中的控件
            TextView addr = (TextView)convertView.findViewById(R.id.address);
            TextView name = (TextView)convertView.findViewById(R.id.name);

            addr.setText(personList.get(position).getAddress());
            name.setText(personList.get(position).getName());
        }
        //返回视图用于显示
        return convertView;
    }
}
