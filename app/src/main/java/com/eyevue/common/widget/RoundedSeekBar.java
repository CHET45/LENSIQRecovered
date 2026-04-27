package com.eyevue.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
@igg({"AppCompatCustomView"})
public class RoundedSeekBar extends SeekBar {

    /* JADX INFO: renamed from: a */
    public Paint f17961a;

    /* JADX INFO: renamed from: b */
    public RectF f17962b;

    /* JADX INFO: renamed from: c */
    public Paint f17963c;

    public RoundedSeekBar(Context context) {
        super(context);
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.f17961a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f17961a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f17961a.setColor(-16776961);
        Paint paint3 = new Paint(1);
        this.f17963c = paint3;
        paint3.setStyle(style);
        this.f17963c.setColor(-16776961);
        this.f17962b = new RectF();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.clipRect(rectF);
        canvas.drawRoundRect(rectF, 100.0f, 100.0f, this.f17963c);
        canvas.restoreToCount(iSave);
        super.onDraw(canvas);
    }

    public RoundedSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RoundedSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
