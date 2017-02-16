package com.xinran.qxdatabinding.activites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.xinran.qxdatabinding.BaseActivity;
import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.beans.Student;
import com.xinran.qxdatabinding.databinding.ActivityIncludeLayoutBinding;

/**
 * Created by houqixin on 17/2/15.
 */
public class IncludeLayoutActvity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityIncludeLayoutBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_include_layout);
        binding.setName("王大拿");
        binding.setIsOk(true);
        binding.setStudent(new Student("jack", "Mack", 19));
        //其中input是布局中的id，evInputName是id是input的布局中的id为ev_input_name的控件id
        //本例中input是布局layout_edit.xml的id，evInputName是layout_edit.xml布局中一个EditText的id
        binding.input.evInputName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                      binding.setName(editable.toString());
            }
        });
    }
}
