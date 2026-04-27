package com.eyevue.common.widget.recyclerwheelpicker.extra;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p000.c5e;
import p000.hib;
import p000.rab;

/* JADX INFO: loaded from: classes4.dex */
public class LinearLayoutX extends LinearLayout implements rab {
    public LinearLayoutX(Context context) {
        super(context);
        init();
    }

    private void init() {
        setNestedScrollingEnabled(true);
    }

    public LinearLayoutX(Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LinearLayoutX(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @c5e(api = 21)
    public LinearLayoutX(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
}
