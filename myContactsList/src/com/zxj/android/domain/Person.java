package com.zxj.android.domain;

/**
 * Created by xiaojun.zhang on 2015/10/19.
 */
public class Person {

    private String name;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String address;

    public Person() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
