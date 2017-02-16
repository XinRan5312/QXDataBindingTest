package com.xinran.qxdatabinding.beans;

import android.databinding.BaseObservable;

import com.xinran.qxdatabinding.BR;

/**
 * Created by houqixin on 17/2/16.
 */
public class ObservableStudent extends BaseObservable {

    private String name;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
