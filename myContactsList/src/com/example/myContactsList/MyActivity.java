package com.example.myContactsList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import com.zxj.adapter.Myadapter;
import com.zxj.android.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private Spinner spinner;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        setTitle("my personList");

        init();
    }

    private void init() {
        spinner = (Spinner)findViewById(R.id.spinner_1);

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("lisi","上海"));
        list.add(new Person("zhangsan","上海"));
        list.add(new Person("wangwu","上海"));
        list.add(new Person("zhaoliu","上海"));

        Myadapter myadapter = new Myadapter(list,MyActivity.this);
        spinner.setAdapter(myadapter);
    }
}
