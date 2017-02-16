package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.beans.Student;
import com.xinran.qxdatabinding.databinding.ActivityAsimpleBinding;

/**
 * Created by houqixin on 17/2/15.
 */
public class ASimpleActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAsimpleBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_asimple);
        binding.setIsQx(true);
        binding.setStu(new Student("jack","mack",19));

    }
}
