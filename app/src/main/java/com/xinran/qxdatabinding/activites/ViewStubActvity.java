package com.xinran.qxdatabinding.activites;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.adapters.ViewStubBindingAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.databinding.ActivityViewStubBinding;
import com.xinran.qxdatabinding.databinding.LayoutAsimpleBinding;

/**
 * Created by houqixin on 17/2/16.
 */
public class ViewStubActvity extends BaseActivity {
    private ActivityViewStubBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub viewStub, View view) {
                LayoutAsimpleBinding inFlateBinding=DataBindingUtil.bind(view);
                inFlateBinding.setDiscript("Vie-vie-Stub");
            }
        });
    }

    public void inflatViewStub(View view){
      if(!binding.viewStub.isInflated()){
          binding.viewStub.getViewStub().inflate();
      }
    }
}
