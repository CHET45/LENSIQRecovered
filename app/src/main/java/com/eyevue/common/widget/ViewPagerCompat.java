package com.eyevue.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public class ViewPagerCompat extends ViewPager {

    /* JADX INFO: renamed from: a */
    public boolean f18042a;

    /* JADX INFO: renamed from: b */
    public boolean f18043b;

    public ViewPagerCompat(Context context) {
        super(context);
        this.f18042a = false;
        this.f18043b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean arrowScroll(int direction) {
        if (this.f18043b) {
            return false;
        }
        if (direction == 17 || direction == 66) {
            return super.arrowScroll(direction);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.f18043b) {
            return false;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        try {
            return super.onTouchEvent(event);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, this.f18042a);
    }

    public void setScroll(boolean scroll) {
        this.f18042a = scroll;
    }

    public void setViewTouchMode(boolean b) {
        if (b && !isFakeDragging()) {
            beginFakeDrag();
        } else if (!b && isFakeDragging()) {
            endFakeDrag();
        }
        this.f18043b = b;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, this.f18042a);
    }

    public ViewPagerCompat(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f18042a = false;
        this.f18043b = false;
    }
}
