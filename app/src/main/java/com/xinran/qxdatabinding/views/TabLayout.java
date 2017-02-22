package com.xinran.qxdatabinding.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xinran.qxdatabinding.R;

/**
 * Created by houqixin on 17/2/17.
 */
public class TabLayout extends LinearLayout {

    private float textSize;

    private TextView tv1;
    private TextView tv2;
    private ImageView imageView;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TabLayout);
        textSize = typedArray.getDimension(R.styleable.TabLayout_tvSize, 12f);
        if (typedArray != null) {
            typedArray.recycle();
        }
        init();
    }

    private void init() {
        inflate(this.getContext(), R.layout.layout_custom, this);
        tv1 = (TextView) findViewById(R.id.first);
        tv2 = (TextView) findViewById(R.id.second);
        tv1.setTextSize(textSize);

    }

    //set方法名字的后缀名字 布局中app：后面的属性名字一致，DataBinding就会自动根据
    //app:后面的属性名字找自定义布局中对应的方法调用的，并把值传过来,就不用声明declare-stylable属性了
    //效果是一样的
    public void setTvFirst(String firstTabName) {
        tv1.setText(firstTabName);
    }

   public void setTvColor(int color){
       tv1.setTextColor(color);
   }
    public void setTvSecond(String firstTabName) {
        tv2.setText(firstTabName);
    }
    public void setImgIcon(int resid){
        imageView.setImageResource(resid);
    }

}
