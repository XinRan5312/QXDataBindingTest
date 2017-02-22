package com.xinran.qxdatabinding.holders;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xinran.qxdatabinding.beans.Student;
import com.xinran.qxdatabinding.databinding.ItemStudentAdapterBinding;

/**
 * Created by houqixin on 17/2/17.
 */
public class StudentHolder extends RecyclerView.ViewHolder{
    private ItemStudentAdapterBinding binding;
    public StudentHolder(View itemView) {
        super(itemView);
        //在ViewHolder中使itemView跟相应的binding进行关联
        binding= DataBindingUtil.bind(itemView);
    }
    public void bindData(Student stu){
        //关联后就可以为他设值
        binding.setStu(stu);

    }
}
