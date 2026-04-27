package com.watchfun.voicenotes.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public class CustomSeekBar extends View {

    /* JADX INFO: renamed from: C */
    public Paint f26461C;

    /* JADX INFO: renamed from: F */
    public float f26462F;

    /* JADX INFO: renamed from: H */
    public InterfaceC4363a f26463H;

    /* JADX INFO: renamed from: a */
    public float f26464a;

    /* JADX INFO: renamed from: b */
    public int f26465b;

    /* JADX INFO: renamed from: c */
    public int f26466c;

    /* JADX INFO: renamed from: d */
    public int f26467d;

    /* JADX INFO: renamed from: e */
    public float f26468e;

    /* JADX INFO: renamed from: f */
    public float f26469f;

    /* JADX INFO: renamed from: m */
    public Paint f26470m;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.CustomSeekBar$a */
    public interface InterfaceC4363a {
        void onProgressChanged(float f);
    }

    public CustomSeekBar(Context context) {
        super(context);
        this.f26464a = 0.0f;
        this.f26465b = Color.parseColor("#EED99F");
        this.f26466c = Color.parseColor("#E3BD7F");
        this.f26467d = Color.parseColor("#F1F1F1");
        this.f26468e = 0.0f;
        this.f26469f = 0.0f;
        init();
    }

    private int dp2px(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void init() {
        Paint paint = new Paint(1);
        this.f26470m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26470m.setColor(this.f26466c);
        Paint paint2 = new Paint(1);
        this.f26461C = paint2;
        paint2.setColor(this.f26465b);
    }

    private void initAttrs(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4297R.styleable.CustomSeekBar);
        this.f26465b = typedArrayObtainStyledAttributes.getColor(C4297R.styleable.CustomSeekBar_ballColor, this.f26465b);
        this.f26468e = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4297R.styleable.CustomSeekBar_ballSize, (int) this.f26468e);
        this.f26466c = typedArrayObtainStyledAttributes.getColor(C4297R.styleable.CustomSeekBar_progressColor, this.f26466c);
        this.f26467d = typedArrayObtainStyledAttributes.getColor(C4297R.styleable.CustomSeekBar_progressBgColor, this.f26467d);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f26462F = this.f26464a * (getWidth() - this.f26468e);
        getWidth();
        this.f26470m.setColor(this.f26467d);
        float f = (this.f26468e / 2.0f) + 0.0f;
        float height = (getHeight() - this.f26469f) / 2.0f;
        float width = getWidth() - (this.f26468e / 2.0f);
        float height2 = getHeight();
        float f2 = this.f26469f;
        canvas.drawRoundRect(f, height, width, (height2 + f2) / 2.0f, f2 / 2.0f, f2 / 2.0f, this.f26470m);
        this.f26470m.setColor(this.f26466c);
        float f3 = (this.f26468e / 2.0f) + 0.0f;
        float height3 = (getHeight() - this.f26469f) / 2.0f;
        float f4 = this.f26462F + (this.f26468e / 2.0f);
        float height4 = getHeight();
        float f5 = this.f26469f;
        canvas.drawRoundRect(f3, height3, f4, (height4 + f5) / 2.0f, f5 / 2.0f, f5 / 2.0f, this.f26470m);
        float width2 = getWidth();
        float f6 = this.f26468e;
        float f7 = width2 - (f6 / 2.0f);
        float f8 = this.f26462F + (f6 / 2.0f);
        if (f8 < f7) {
            f7 = f8;
        }
        canvas.drawCircle(f7, getHeight() / 2.0f, this.f26468e / 2.0f, this.f26461C);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC4363a interfaceC4363a = this.f26463H;
                if (interfaceC4363a != null) {
                    interfaceC4363a.onProgressChanged(this.f26464a);
                }
                return true;
            }
            if (action != 2) {
                return super.onTouchEvent(motionEvent);
            }
        }
        float x = motionEvent.getX();
        if (x < 0.0f) {
            x = 0.0f;
        }
        if (x > getWidth() - this.f26468e) {
            x = getWidth() - this.f26468e;
        }
        this.f26464a = ((this.f26468e / 2.0f) + x) / (getWidth() - this.f26468e);
        this.f26462F = x;
        invalidate();
        return true;
    }

    public void setBallColor(int i) {
        this.f26465b = i;
        this.f26461C.setColor(i);
        invalidate();
    }

    public void setBallSize(int i) {
        this.f26468e = i;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangeListener(InterfaceC4363a interfaceC4363a) {
        this.f26463H = interfaceC4363a;
    }

    public void setProgress(float f) {
        this.f26464a = f;
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f26466c = i;
        this.f26470m.setColor(i);
        invalidate();
    }

    public void setSize(int i, int i2) {
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        requestLayout();
    }

    public CustomSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26464a = 0.0f;
        this.f26465b = Color.parseColor("#EED99F");
        this.f26466c = Color.parseColor("#E3BD7F");
        this.f26467d = Color.parseColor("#F1F1F1");
        this.f26468e = 0.0f;
        this.f26469f = 0.0f;
        this.f26468e = dp2px(context, 16);
        this.f26469f = dp2px(context, 10);
        initAttrs(attributeSet);
        init();
    }
}
