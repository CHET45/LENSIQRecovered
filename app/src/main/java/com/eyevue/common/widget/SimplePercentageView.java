package com.eyevue.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.kpd;
import p000.md8;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class SimplePercentageView extends View {

    /* JADX INFO: renamed from: b */
    public static final int f17964b = 8;

    /* JADX INFO: renamed from: a */
    public float f17965a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public SimplePercentageView(@yfb Context context) {
        this(context, null, 0, 6, null);
        md8.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).getMeasuredHeight() > 0) {
                setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), (int) (r0.getMeasuredHeight() * this.f17965a));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setHeightPercentage(float f) {
        this.f17965a = kpd.coerceIn(f, 0.0f, 1.0f);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public SimplePercentageView(@yfb Context context, @gib AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        md8.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SimplePercentageView(Context context, AttributeSet attributeSet, int i, int i2, jt3 jt3Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public SimplePercentageView(@yfb Context context, @gib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md8.checkNotNullParameter(context, "context");
    }
}
