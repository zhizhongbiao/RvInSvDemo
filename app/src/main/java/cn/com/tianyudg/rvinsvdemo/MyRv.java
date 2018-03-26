package cn.com.tianyudg.rvinsvdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Author : WaterFlower.
 * Created on 2018/3/26.
 * Desc :
 */

public class MyRv extends RecyclerView {
    public MyRv(Context context) {
        super(context);
    }

    public MyRv(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRv(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        if (ev.getAction()==MotionEvent.ACTION_MOVE||ev.getAction()==MotionEvent.ACTION_DOWN)
        {
            return false;
        }

        return super.dispatchTouchEvent(ev);
    }
}
