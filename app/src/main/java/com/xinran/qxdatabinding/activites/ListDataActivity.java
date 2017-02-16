package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.ArrayMap;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.databinding.ActivityListBinding;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by houqixin on 17/2/15.
 */
public class ListDataActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_list);
        String[] literals = new String[]{"jack", "mack","join"};

        List<String> list = new ArrayList<>();

        for (int i = 0; i < literals.length; i++) {
            list.add(literals[i]);

        }
        Map<String,String> map=new HashMap<>();
        map.put("1","apple");
        map.put("2","banana");
        binding.setIndex(2);
        binding.setList(list);
        binding.setKey("1");
        binding.setMap(map);

    }
}
