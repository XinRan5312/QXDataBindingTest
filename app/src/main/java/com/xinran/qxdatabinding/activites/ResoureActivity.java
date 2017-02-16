package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.databinding.ActivityResourceBinding;

/**
 * Created by houqixin on 17/2/16.
 */
public class ResoureActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityResourceBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_resource);
        binding.setBananaCount(3);
        binding.setFirstName("Hou");
        binding.setLastName("SS");
        binding.setOrangeCount(6);
        binding.setIsBig(true);
    }
}
