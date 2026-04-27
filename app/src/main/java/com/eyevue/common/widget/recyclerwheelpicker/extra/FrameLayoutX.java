package com.eyevue.common.widget.recyclerwheelpicker.extra;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.c5e;
import p000.hib;
import p000.rab;

/* JADX INFO: loaded from: classes4.dex */
public class FrameLayoutX extends FrameLayout implements rab {
    public FrameLayoutX(Context context) {
        super(context);
        init();
    }

    private void init() {
        setNestedScrollingEnabled(true);
    }

    public FrameLayoutX(Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FrameLayoutX(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @c5e(api = 21)
    public FrameLayoutX(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
}
