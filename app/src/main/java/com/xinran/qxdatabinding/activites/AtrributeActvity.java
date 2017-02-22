package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.databinding.ActivityAttributesBinding;

/**
 * Created by houqixin on 17/2/17.
 */
public class AtrributeActvity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAttributesBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_attributes);
    }
}
