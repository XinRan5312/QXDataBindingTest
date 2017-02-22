package com.xinran.qxdatabinding.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinran.qxdatabinding.R;
import com.xinran.qxdatabinding.beans.Student;
import com.xinran.qxdatabinding.holders.StudentHolder;

import java.util.List;

/**
 * Created by houqixin on 17/2/17.
 */
public class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {
    private List<Student> list;
    public StudentAdapter(List<Student> list){
        this.list=list;
    }

    @Override
    public StudentHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_student_adapter,viewGroup,false);

        return new StudentHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentHolder studentHolder, int i) {
        //因为在StudentHolder中已经把itemVie布局跟binding绑定关联，所以这里设置的数据可以到布局中
            studentHolder.bindData(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
