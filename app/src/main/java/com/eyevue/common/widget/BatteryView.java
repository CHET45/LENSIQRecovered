package com.eyevue.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.eyevue.common.C2531R;
import p000.h78;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class BatteryView extends View {

    /* JADX INFO: renamed from: C */
    public boolean f17910C;

    /* JADX INFO: renamed from: F */
    public boolean f17911F;

    /* JADX INFO: renamed from: H */
    public Paint f17912H;

    /* JADX INFO: renamed from: L */
    public Context f17913L;

    /* JADX INFO: renamed from: a */
    public int f17914a;

    /* JADX INFO: renamed from: b */
    public int f17915b;

    /* JADX INFO: renamed from: c */
    public int f17916c;

    /* JADX INFO: renamed from: d */
    public int f17917d;

    /* JADX INFO: renamed from: e */
    public int f17918e;

    /* JADX INFO: renamed from: f */
    public float f17919f;

    /* JADX INFO: renamed from: m */
    public float f17920m;

    public BatteryView(Context context) {
        super(context);
        this.f17914a = 100;
        this.f17917d = 1;
        this.f17918e = 5;
        this.f17919f = 6.0f;
        this.f17920m = 5.0f;
        this.f17910C = false;
    }

    public int getPower() {
        return this.f17914a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17912H.setColor(this.f17913L.getResources().getColor(C2531R.color.black_333));
        float f = this.f17915b / 15.0f;
        this.f17912H.setStyle(Paint.Style.STROKE);
        this.f17912H.setStrokeWidth(this.f17918e);
        int i = this.f17918e;
        RectF rectF = new RectF(i / 2, i / 2, (this.f17915b - f) - (i / 2), this.f17916c - (i / 2));
        float f2 = this.f17919f;
        canvas.drawRoundRect(rectF, f2, f2, this.f17912H);
        this.f17912H.setStyle(Paint.Style.FILL);
        this.f17912H.setStrokeWidth(2.0f);
        int i2 = this.f17915b;
        int i3 = this.f17916c;
        canvas.drawRect(new RectF((i2 - f) - (this.f17918e / 2), i3 * 0.25f, i2, i3 * 0.65f), this.f17912H);
        if (!this.f17910C && this.f17914a < 20) {
            this.f17912H.setColor(this.f17913L.getResources().getColor(C2531R.color.base_common_red));
        } else {
            this.f17912H.setColor(this.f17913L.getResources().getColor(C2531R.color.color_battery));
        }
        int i4 = this.f17918e;
        int i5 = this.f17917d;
        RectF rectF2 = new RectF(i4 + i5, i4 + i5, ((((this.f17915b - f) - this.f17918e) - this.f17917d) * this.f17914a) / 100.0f, (this.f17916c - i4) - i5);
        float f3 = this.f17920m;
        canvas.drawRoundRect(rectF2, f3, f3, this.f17912H);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f17915b = getMeasuredWidth();
        this.f17916c = getMeasuredHeight();
    }

    public void setPower(@h78(from = 1, m12174to = 100) int mPower) {
        this.f17914a = mPower;
        if (mPower < 0) {
            this.f17914a = 0;
        }
        if (this.f17914a > 100) {
            this.f17914a = 100;
        }
        postInvalidate();
    }

    public BatteryView(Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        this.f17914a = 100;
        this.f17917d = 1;
        this.f17918e = 5;
        this.f17919f = 6.0f;
        this.f17920m = 5.0f;
        this.f17910C = false;
        this.f17913L = context;
        this.f17915b = getMeasuredWidth();
        this.f17916c = getMeasuredHeight();
        Paint paint = new Paint();
        this.f17912H = paint;
        paint.setAntiAlias(true);
    }
}
