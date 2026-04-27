package com.eyevue.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p000.efb;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class ViewPager2RecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public float f18040a;

    /* JADX INFO: renamed from: b */
    public MotionEvent f18041b;

    public ViewPager2RecycleView(@efb Context context) {
        super(context);
        this.f18041b = null;
    }

    private ViewPager2 getViewPager2() {
        ViewParent parent = this;
        do {
            parent = parent.getParent();
            if (parent == null) {
                return null;
            }
        } while (!(parent instanceof ViewPager2));
        return (ViewPager2) parent;
    }

    private void setViewPager2InputEnable(boolean enable) {
        ViewPager2 viewPager2 = getViewPager2();
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(enable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent e) {
        int action = e.getAction();
        if (action == 0) {
            this.f18041b = e;
            this.f18040a = e.getX();
            setViewPager2InputEnable(false);
        } else if (action == 1 || action == 3) {
            setViewPager2InputEnable(true);
            this.f18041b = null;
        } else if (action == 2 && this.f18041b != null) {
            float x = e.getX() - this.f18040a;
            boolean zCanScrollHorizontally = canScrollHorizontally(1);
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            if (x < 0.0f) {
                setViewPager2InputEnable(!zCanScrollHorizontally);
            } else {
                setViewPager2InputEnable(!zCanScrollHorizontally2);
            }
            this.f18041b = null;
        }
        return super.dispatchTouchEvent(e);
    }

    public ViewPager2RecycleView(@efb Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        this.f18041b = null;
    }

    public ViewPager2RecycleView(@efb Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18041b = null;
    }
}
