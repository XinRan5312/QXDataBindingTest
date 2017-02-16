package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.beans.ObservableStudent;
import com.xinran.qxdatabinding.beans.ObservableStudentOther;
import com.xinran.qxdatabinding.databinding.ActivityObservableBinding;

/**
 * Created by houqixin on 17/2/16.
 *
 *
 * DataBinding本来只支持单向绑定，如果需要双向绑定，就要用系统各种相应的ObsevableXXX类，比如ObservableArrayList
 * ObservableInt，ObservableField<T>等
 *
 * 或者自己自定义
 * 一个类继承BaseObservable，在每个属性的set方法里调用   notifyPropertyChanged(BR.属性名字);
 * 比如ObservableStudent
 *
 * 或者是自己的实体类中的属性都用ObservableXX来定义，比如ObservableStudentOther
 */
public class ObservableActvity  extends BaseActivity{
    private ObservableArrayList<String> list=new ObservableArrayList<>();
    private ObservableArrayMap<String,String> map=new ObservableArrayMap<>();
    private ObservableStudent observableStudent=new ObservableStudent();
    private ObservableStudentOther observableStudentOther=new ObservableStudentOther();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_observable);
        initData();
        binding.setList(list);
        binding.setMap(map);
        binding.setStuOne(observableStudent);
        binding.setStuoTo(observableStudentOther);

    }
    public void changeName(View view){
        changeData();
    }
    public void initData(){
        list.add("mack");
        list.add("jack");
        map.put("1", "fhkg");
        map.put("2", "mjs");
        observableStudent.setName("Join");
        observableStudent.setAge("18");
        observableStudentOther.name.set("Frank");
        observableStudentOther.age.set("25");
    }

    public void changeData(){
        list.add("mack2");
        list.add("jack2");
        map.put("1", "fhkg2");
        map.put("2", "mjs2");
        observableStudent.setName("Join2");
        observableStudent.setAge("18");
        observableStudentOther.name.set("Frank2");
        observableStudentOther.age.set("25");
    }
}
