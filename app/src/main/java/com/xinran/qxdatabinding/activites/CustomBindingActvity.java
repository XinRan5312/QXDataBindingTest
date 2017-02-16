package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.view.View;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.CustomBinding;
import com.xinran.qxdatabinding.R;

/**
 * Created by houqixin on 17/2/15.
 */
public class CustomBindingActvity extends BaseActivity {
    private CustomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_custom);
        binding.setName("Join");
        binding.setAge("20");
    }
    public void toChange(View view){
        binding.setName("Mack");
        binding.setAge("16");
    }
}
