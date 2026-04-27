package com.eyevue.common.widget.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import p000.hib;
import p000.iza;
import p000.x8i;

/* JADX INFO: loaded from: classes4.dex */
public class BaseRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: e */
    public static final int f18104e = -1;

    /* JADX INFO: renamed from: a */
    public int f18105a;

    /* JADX INFO: renamed from: b */
    public int f18106b;

    /* JADX INFO: renamed from: c */
    public int f18107c;

    /* JADX INFO: renamed from: d */
    public int f18108d;

    public BaseRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        int actionMasked = iza.getActionMasked(e);
        int actionIndex = iza.getActionIndex(e);
        if (actionMasked == 0) {
            this.f18105a = iza.getPointerId(e, 0);
            this.f18106b = (int) (e.getX() + 0.5f);
            this.f18107c = (int) (e.getY() + 0.5f);
            return super.onInterceptTouchEvent(e);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(e);
            }
            this.f18105a = iza.getPointerId(e, actionIndex);
            this.f18106b = (int) (iza.getX(e, actionIndex) + 0.5f);
            this.f18107c = (int) (iza.getY(e, actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(e);
        }
        int iFindPointerIndex = iza.findPointerIndex(e, this.f18105a);
        if (iFindPointerIndex < 0) {
            return false;
        }
        int x = (int) (iza.getX(e, iFindPointerIndex) + 0.5f);
        int y = (int) (iza.getY(e, iFindPointerIndex) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(e);
        }
        int i = x - this.f18106b;
        int i2 = y - this.f18107c;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f18108d && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f18108d && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (slopConstant == 0) {
            this.f18108d = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            this.f18108d = x8i.getScaledPagingTouchSlop(viewConfiguration);
        }
    }

    public BaseRecyclerView(Context context, @hib AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseRecyclerView(Context context, @hib AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f18105a = -1;
        this.f18108d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
