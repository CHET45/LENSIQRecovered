package com.eyevue.common.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.eyevue.common.C2531R;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class CircleProgressView extends View {

    /* JADX INFO: renamed from: C */
    public ValueAnimator f17928C;

    /* JADX INFO: renamed from: F */
    public int f17929F;

    /* JADX INFO: renamed from: H */
    public InterfaceC2533b f17930H;

    /* JADX INFO: renamed from: a */
    public int f17931a;

    /* JADX INFO: renamed from: b */
    public Paint f17932b;

    /* JADX INFO: renamed from: c */
    public Paint f17933c;

    /* JADX INFO: renamed from: d */
    public float f17934d;

    /* JADX INFO: renamed from: e */
    public int f17935e;

    /* JADX INFO: renamed from: f */
    public int f17936f;

    /* JADX INFO: renamed from: m */
    public float f17937m;

    /* JADX INFO: renamed from: com.eyevue.common.widget.CircleProgressView$a */
    public class C2532a implements ValueAnimator.AnimatorUpdateListener {
        public C2532a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            int iIntValue = ((Integer) animation.getAnimatedValue()).intValue();
            if (CircleProgressView.this.f17929F != iIntValue) {
                CircleProgressView.this.f17929F = iIntValue;
                CircleProgressView.this.setCurrent(iIntValue);
                if (CircleProgressView.this.f17930H != null) {
                    CircleProgressView.this.f17930H.valueUpdate(iIntValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.CircleProgressView$b */
    public interface InterfaceC2533b {
        void valueUpdate(int progress);
    }

    public CircleProgressView(Context context) {
        this(context, null);
    }

    public static int dp2px(Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.CircleProgressView);
        this.f17936f = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.CircleProgressView_location_start, 1);
        this.f17934d = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.CircleProgressView_progress_width, dp2px(context, 4.0f));
        this.f17935e = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.CircleProgressView_progress_color, this.f17935e);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17932b = paint;
        paint.setAntiAlias(true);
        this.f17932b.setStrokeWidth(this.f17934d);
        Paint paint2 = this.f17932b;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f17932b.setColor(Color.parseColor("#818588"));
        Paint paint3 = this.f17932b;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f17933c = paint4;
        paint4.setAntiAlias(true);
        this.f17933c.setStyle(style);
        this.f17933c.setStrokeWidth(this.f17934d);
        this.f17933c.setColor(this.f17935e);
        this.f17933c.setStrokeCap(cap);
        int i = this.f17936f;
        if (i == 1) {
            this.f17937m = -180.0f;
            return;
        }
        if (i == 2) {
            this.f17937m = -90.0f;
        } else if (i == 3) {
            this.f17937m = 0.0f;
        } else if (i == 4) {
            this.f17937m = 90.0f;
        }
    }

    public void destroy() {
        ValueAnimator valueAnimator = this.f17928C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public int getCurrent() {
        return this.f17931a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f17934d;
        RectF rectF = new RectF(f / 2.0f, f / 2.0f, getWidth() - (this.f17934d / 2.0f), getHeight() - (this.f17934d / 2.0f));
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f17932b);
        canvas.drawArc(rectF, this.f17937m, (this.f17931a * 360) / 100, false, this.f17933c);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (size >= size2) {
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    public void setCurrent(int current) {
        this.f17931a = current;
        invalidate();
    }

    public void setOnAnimProgressListener(InterfaceC2533b onAnimProgressListener) {
        this.f17930H = onAnimProgressListener;
    }

    public void startAnimProgress(int current, int duration) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, current);
        this.f17928C = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(duration);
        this.f17928C.setInterpolator(new LinearInterpolator());
        this.f17928C.addUpdateListener(new C2532a());
        this.f17928C.start();
    }

    public CircleProgressView(Context context, @hib AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleProgressView(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17935e = -65536;
        this.f17929F = -1;
        init(context, attrs);
    }
}
