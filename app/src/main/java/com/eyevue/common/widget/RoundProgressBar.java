package com.eyevue.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.eyevue.common.C2531R;
import com.watchfun.transphoto.C4282R;

/* JADX INFO: loaded from: classes4.dex */
public class RoundProgressBar extends View {

    /* JADX INFO: renamed from: C */
    public int f17950C;

    /* JADX INFO: renamed from: F */
    public int f17951F;

    /* JADX INFO: renamed from: H */
    public final RectF f17952H;

    /* JADX INFO: renamed from: L */
    public final RectF f17953L;

    /* JADX INFO: renamed from: a */
    public Paint f17954a;

    /* JADX INFO: renamed from: b */
    public Paint f17955b;

    /* JADX INFO: renamed from: c */
    public Paint f17956c;

    /* JADX INFO: renamed from: d */
    public float f17957d;

    /* JADX INFO: renamed from: e */
    public int f17958e;

    /* JADX INFO: renamed from: f */
    public int f17959f;

    /* JADX INFO: renamed from: m */
    public float f17960m;

    public RoundProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17950C = 100;
        this.f17951F = 0;
        this.f17952H = new RectF();
        this.f17953L = new RectF();
        initAttrs(context, attrs);
        initPaint();
    }

    private int dp2px(float dp) {
        return (int) ((dp * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.RoundProgressBar);
        this.f17958e = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.RoundProgressBar_rpbColor, -3355444);
        this.f17959f = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.RoundProgressBar_rpbBgColor, -16776961);
        this.f17960m = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.RoundProgressBar_rpbRadius, dp2px(4.0f));
        this.f17950C = typedArrayObtainStyledAttributes.getInteger(C2531R.styleable.RoundProgressBar_rpbMax, 100);
        this.f17951F = typedArrayObtainStyledAttributes.getInteger(C2531R.styleable.RoundProgressBar_rpbProgress, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initPaint() {
        Paint paint = new Paint(1);
        this.f17954a = paint;
        paint.setColor(this.f17958e);
        Paint paint2 = this.f17954a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f17955b = paint3;
        paint3.setColor(this.f17959f);
        this.f17955b.setStyle(style);
        Paint paint4 = new Paint();
        this.f17956c = paint4;
        paint4.setColor(getResources().getColor(C4282R.color.gray_666666, null));
        this.f17956c.setFlags(1);
        this.f17956c.setTextAlign(Paint.Align.CENTER);
        float dimensionPixelSize = getResources().getDimensionPixelSize(C2531R.dimen.sp_12);
        this.f17957d = dimensionPixelSize;
        this.f17956c.setTextSize(dimensionPixelSize);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f17952H;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f17952H.bottom = getHeight();
        RectF rectF2 = this.f17952H;
        float f = this.f17960m;
        canvas.drawRoundRect(rectF2, f, f, this.f17954a);
        RectF rectF3 = this.f17953L;
        rectF3.left = 0.0f;
        rectF3.top = 0.0f;
        rectF3.right = ((this.f17951F * 1.0f) / this.f17950C) * getWidth();
        rectF3.bottom = getHeight();
        RectF rectF4 = this.f17953L;
        float f2 = this.f17960m;
        canvas.drawRoundRect(rectF4, f2, f2, this.f17955b);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE) {
            size = dp2px(8.0f);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), size);
    }

    public void setProgress(int progress) {
        this.f17951F = Math.min(progress, this.f17950C);
        invalidate();
    }
}
