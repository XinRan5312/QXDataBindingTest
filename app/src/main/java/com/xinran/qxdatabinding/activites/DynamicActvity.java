package com.xinran.qxdatabinding.activites;

import android.annotation.TargetApi;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.adapters.StudentAdapter;
import com.xinran.qxdatabinding.beans.Student;
import com.xinran.qxdatabinding.databinding.ActivityDynamicBinding;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by houqixin on 17/2/17.
 */
public class DynamicActvity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDynamicBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_dynamic);
        //根据布局控件的id直接通过binding的点语法，得到相应的控件（因为DataBinding根据布局id生成了final属性变量）
        binding.recycerView.setLayoutManager(new LinearLayoutManager(this));
//        binding.recycerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
//                Log.e("eeee:", "onScroll");
//            }
//        });
        binding.recycerView.setAdapter(new StudentAdapter(mockData()));

    }
    private List<Student> mockData(){
        List<Student> list=new ArrayList<>();
        Student stu=null;
        for(int i=0;i<10;i++){
            stu=new Student("Yang"+i,"mack"+i,i);
            list.add(stu);
        }

        return list;

    }
}
