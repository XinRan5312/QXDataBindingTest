package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.databinding.ActivityViewWithIdBinding;

/**
 * Created by houqixin on 17/2/16.
 */
public class ViewWithIdActvity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DataBindingUtil.setContentView(this, R.layout.activity_view_with_id)这句代码把布局跟Actvity和DataBinding
        //给关联上了，如想知道具体细节可以看DataBindingUtil.setContentView()源码细节

        final ActivityViewWithIdBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_view_with_id);
        //DataBinding会根据布局每个控件中的id名字自动生成对应的属性名字，并且一一对应，所以我们可以直接引用

        binding.tvName.setText("Mack");
        binding.tvAge.setText("22");
        binding.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvAge.setText("点击了TvName");
            }
        });
    }
}
