package com.eyevue.common.widget.recyclerwheelpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000.c5e;
import p000.h50;
import p000.hib;
import p000.hvd;
import p000.mki;

/* JADX INFO: loaded from: classes4.dex */
public class RecyclerWheelPicker<T> extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public hvd<T> f18140a;

    /* JADX INFO: renamed from: com.eyevue.common.widget.recyclerwheelpicker.RecyclerWheelPicker$a */
    public class RunnableC2547a implements Runnable {
        public RunnableC2547a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerWheelPicker.this.f18140a.f44967F = RecyclerWheelPicker.this.getMeasuredWidth();
            RecyclerWheelPicker recyclerWheelPicker = RecyclerWheelPicker.this;
            recyclerWheelPicker.addView(recyclerWheelPicker.f18140a);
        }
    }

    public RecyclerWheelPicker(Context context) {
        super(context);
        initRoot();
    }

    private final void initRoot() {
        this.f18140a = new hvd<>(getContext());
        post(new RunnableC2547a());
    }

    private final void setCoreViewLayoutParams(ViewGroup.LayoutParams params) {
        if (params == null) {
            params = new ViewGroup.LayoutParams(-1, -2);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(params);
        layoutParams.width = -1;
        this.f18140a.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        setCoreViewLayoutParams(params);
    }

    public mki<T> getAdapter() {
        return this.f18140a.f44971a;
    }

    public T getSelected() {
        return this.f18140a.getSelected();
    }

    public int getSelectedIndex() {
        return this.f18140a.getSelectedIndex();
    }

    public void scrollToPosition(int position) {
        this.f18140a.scrollToPosition(position);
    }

    public void setAdapter(mki<T> adapter) {
        this.f18140a.setAdapter((mki) adapter);
    }

    public void setDefaultValue(T t) {
        if (getAdapter() == null) {
            throw new RuntimeException("ERROR:\nsetDefaultValue()必须在设置setAdapter()之后调用\n'adapter' is Null,please use setAdapter() before.");
        }
        this.f18140a.setDefaultValue(t);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        setCoreViewLayoutParams(params);
    }

    public void setMaxShowSize(int maxShowSize) {
        this.f18140a.setMaxShowSize(maxShowSize);
    }

    public void setSelectedAreaDrawer(h50 selectedAreaDrawer) {
        this.f18140a.setSelectedAreaDrawer(selectedAreaDrawer);
    }

    public void setSelectedAreaHeight(int selectedAreaHeight) {
        this.f18140a.setSelectedAreaHeight(selectedAreaHeight);
    }

    public void setSelectedBottomAreaDrawer(h50 selectedBottomAreaDrawer) {
        this.f18140a.setSelectedBottomAreaDrawer(selectedBottomAreaDrawer);
    }

    public void setSelectedTopAreaDrawer(h50 selectedTopAreaDrawer) {
        this.f18140a.setSelectedTopAreaDrawer(selectedTopAreaDrawer);
    }

    public RecyclerWheelPicker(Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        initRoot();
    }

    public RecyclerWheelPicker(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initRoot();
    }

    @c5e(api = 21)
    public RecyclerWheelPicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initRoot();
    }
}
