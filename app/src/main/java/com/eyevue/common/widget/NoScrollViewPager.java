package com.eyevue.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class NoScrollViewPager extends ViewPager {

    /* JADX INFO: renamed from: com.eyevue.common.widget.NoScrollViewPager$a */
    public static class C2537a extends Scroller {
        public C2537a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        @Override // android.widget.Scroller
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            super.startScroll(startX, startY, dx, dy, 350);
        }
    }

    public NoScrollViewPager(Context context) {
        super(context);
        setMyScroller();
    }

    private void setMyScroller() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C2537a(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        setMyScroller();
    }
}
