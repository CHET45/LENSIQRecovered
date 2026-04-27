package com.eyevue.glassapp.view.photo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import com.eyevue.common.C2531R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p000.bth;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.kpd;
import p000.md8;
import p000.p3a;
import p000.qy6;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nRulerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RulerView.kt\ncom/eyevue/glassapp/view/photo/RulerView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,286:1\n470#2:287\n470#2:288\n470#2:289\n470#2:298\n470#2:299\n470#2:300\n52#3,8:290\n60#3:301\n*S KotlinDebug\n*F\n+ 1 RulerView.kt\ncom/eyevue/glassapp/view/photo/RulerView\n*L\n32#1:287\n33#1:288\n35#1:289\n80#1:298\n82#1:299\n85#1:300\n74#1:290,8\n74#1:301\n*E\n"})
@e0g(parameters = 0)
public final class RulerView extends View {

    /* JADX INFO: renamed from: e2 */
    public static final int f18957e2 = 8;

    /* JADX INFO: renamed from: C */
    public int f18958C;

    /* JADX INFO: renamed from: F */
    public int f18959F;

    /* JADX INFO: renamed from: H */
    public int f18960H;

    /* JADX INFO: renamed from: L */
    public int f18961L;

    /* JADX INFO: renamed from: M */
    public float f18962M;

    /* JADX INFO: renamed from: M1 */
    public float f18963M1;

    /* JADX INFO: renamed from: N */
    public float f18964N;

    /* JADX INFO: renamed from: Q */
    @yfb
    public final Scroller f18965Q;

    /* JADX INFO: renamed from: V1 */
    @gib
    public VelocityTracker f18966V1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f18967Z1;

    /* JADX INFO: renamed from: a */
    public float f18968a;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final Paint f18969a2;

    /* JADX INFO: renamed from: b */
    public float f18970b;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final Paint f18971b2;

    /* JADX INFO: renamed from: c */
    public float f18972c;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public final Paint f18973c2;

    /* JADX INFO: renamed from: d */
    public int f18974d;

    /* JADX INFO: renamed from: d2 */
    @gib
    public qy6<? super Integer, bth> f18975d2;

    /* JADX INFO: renamed from: e */
    public int f18976e;

    /* JADX INFO: renamed from: f */
    public float f18977f;

    /* JADX INFO: renamed from: m */
    public int f18978m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public RulerView(@yfb Context context) {
        this(context, null, 0, 6, null);
        md8.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5116b(RulerView rulerView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rulerView.updateCenterPosition(z);
    }

    private final float calculateScrollXForPosition(int i) {
        return i * (this.f18968a + this.f18972c);
    }

    private final float dpToPx(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private final void drawIndicator(Canvas canvas) {
        float height = getHeight() - this.f18977f;
        float height2 = getHeight();
        float f = this.f18964N;
        float f2 = this.f18968a;
        canvas.drawRect(f - f2, height, f + f2, height2, this.f18971b2);
    }

    private final void drawLines(Canvas canvas) {
        float height = getHeight() - this.f18970b;
        float f = (-this.f18962M) + this.f18964N;
        int totalLines = getTotalLines();
        for (int i = 0; i < totalLines; i++) {
            float f2 = this.f18968a;
            float f3 = f + (i * (this.f18972c + f2));
            if (f2 + f3 >= 0.0f && f3 <= getWidth()) {
                this.f18969a2.setColor((this.f18959F + i) % this.f18958C == 0 ? this.f18976e : this.f18974d);
                canvas.drawRect(f3, height, f3 + this.f18968a, height + this.f18970b, this.f18969a2);
            }
        }
    }

    private final int getTotalLines() {
        return (this.f18960H - this.f18959F) + 1;
    }

    private final float getTotalWidth() {
        return ((this.f18968a + this.f18972c) * getTotalLines()) - this.f18972c;
    }

    private final void initAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = getContext();
            md8.checkNotNullExpressionValue(context, "getContext(...)");
            int[] iArr = C2531R.styleable.RulerView;
            md8.checkNotNullExpressionValue(iArr, "RulerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.f18968a = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.RulerView_lineWidth, dpToPx(1.0f));
            this.f18970b = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.RulerView_lineHeight, dpToPx(8.0f));
            this.f18972c = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.RulerView_lineSpacing, dpToPx(8.0f));
            this.f18974d = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.RulerView_normalLineColor, Color.parseColor("#818588"));
            this.f18976e = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.RulerView_specialLineColor, Color.parseColor("#ECF3F3"));
            this.f18977f = typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.RulerView_indicatorHeight, dpToPx(24.0f));
            this.f18978m = typedArrayObtainStyledAttributes.getColor(C2531R.styleable.RulerView_indicatorColor, Color.parseColor("#FFD100"));
            this.f18959F = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.RulerView_minValue, -100);
            int i = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.RulerView_maxValue, 100);
            this.f18960H = i;
            this.f18961L = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.RulerView_defaultValue, (this.f18959F + i) / 2);
            this.f18958C = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.RulerView_specialLineInterval, 10);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void setDefaultPosition() {
        this.f18962M = calculateScrollXForPosition(this.f18961L - this.f18959F);
        post(new Runnable() { // from class: sce
            @Override // java.lang.Runnable
            public final void run() {
                this.f81221a.updateCenterPosition(true);
            }
        });
    }

    private final void setupPaints() {
        Paint paint = this.f18969a2;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f18971b2.setStyle(style);
        this.f18971b2.setColor(this.f18978m);
    }

    private final void snapToNearestLine() {
        float fCalculateScrollXForPosition = calculateScrollXForPosition(kpd.coerceIn(p3a.roundToInt(this.f18962M / (this.f18968a + this.f18972c)), 0, getTotalLines() - 1));
        Scroller scroller = this.f18965Q;
        float f = this.f18962M;
        scroller.startScroll((int) f, 0, (int) (fCalculateScrollXForPosition - f), 0, 300);
        invalidate();
        updateCenterPosition(true);
    }

    private final void startFling(int i) {
        this.f18965Q.fling((int) this.f18962M, 0, -i, 0, 0, (int) getTotalWidth(), 0, 0);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCenterPosition(boolean z) {
        qy6<? super Integer, bth> qy6Var;
        int iCoerceIn = this.f18959F + kpd.coerceIn(p3a.roundToInt(this.f18962M / (this.f18968a + this.f18972c)), 0, getTotalLines() - 1);
        if (z && this.f18967Z1 && (qy6Var = this.f18975d2) != null) {
            qy6Var.invoke(Integer.valueOf(iCoerceIn));
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f18965Q.computeScrollOffset()) {
            this.f18962M = this.f18965Q.getCurrX();
            invalidate();
            if (this.f18967Z1) {
                updateCenterPosition(true);
            }
            if (!this.f18965Q.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                snapToNearestLine();
                this.f18967Z1 = false;
            }
        }
    }

    public final int getCurrentValue() {
        return this.f18959F + kpd.coerceIn(p3a.roundToInt(this.f18962M / (this.f18968a + this.f18972c)), 0, getTotalLines() - 1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f18966V1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f18966V1 = null;
    }

    @Override // android.view.View
    public void onDraw(@yfb Canvas canvas) {
        md8.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawLines(canvas);
        drawIndicator(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18964N = i / 2.0f;
        setDefaultPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@p000.yfb android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p000.md8.checkNotNullParameter(r6, r0)
            android.view.VelocityTracker r0 = r5.f18966V1
            if (r0 != 0) goto Lf
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.f18966V1 = r0
        Lf:
            android.view.VelocityTracker r0 = r5.f18966V1
            if (r0 == 0) goto L16
            r0.addMovement(r6)
        L16:
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == 0) goto L7d
            if (r0 == r1) goto L50
            r2 = 2
            if (r0 == r2) goto L26
            r6 = 3
            if (r0 == r6) goto L50
            goto L99
        L26:
            float r0 = r6.getX()
            float r2 = r5.f18963M1
            float r0 = r0 - r2
            float r2 = r5.f18962M
            float r2 = r2 - r0
            r5.f18962M = r2
            float r0 = r5.getTotalWidth()
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            float r3 = r5.f18962M
            float r0 = p000.kpd.coerceIn(r3, r2, r0)
            r5.f18962M = r0
            float r6 = r6.getX()
            r5.f18963M1 = r6
            r5.invalidate()
            r5.updateCenterPosition(r1)
            goto L99
        L50:
            android.view.VelocityTracker r6 = r5.f18966V1
            r0 = 0
            if (r6 == 0) goto L75
            r2 = 1000(0x3e8, float:1.401E-42)
            r6.computeCurrentVelocity(r2)
            float r2 = r6.getXVelocity()
            float r3 = java.lang.Math.abs(r2)
            r4 = 1112014848(0x42480000, float:50.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L6d
            int r2 = (int) r2
            r5.startFling(r2)
            goto L72
        L6d:
            r5.snapToNearestLine()
            r5.f18967Z1 = r0
        L72:
            r6.clear()
        L75:
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r0)
            goto L99
        L7d:
            r5.f18967Z1 = r1
            android.widget.Scroller r0 = r5.f18965Q
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L8c
            android.widget.Scroller r0 = r5.f18965Q
            r0.abortAnimation()
        L8c:
            float r6 = r6.getX()
            r5.f18963M1 = r6
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r1)
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.RulerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrentValue(int i) {
        int iCoerceIn = kpd.coerceIn(i, this.f18959F, this.f18960H);
        float fCalculateScrollXForPosition = calculateScrollXForPosition(iCoerceIn - this.f18959F);
        Scroller scroller = this.f18965Q;
        float f = this.f18962M;
        scroller.startScroll((int) f, 0, (int) (fCalculateScrollXForPosition - f), 0, 300);
        invalidate();
        qy6<? super Integer, bth> qy6Var = this.f18975d2;
        if (qy6Var != null) {
            qy6Var.invoke(Integer.valueOf(iCoerceIn));
        }
    }

    public final void setOnValueChangeListener(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f18975d2 = qy6Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public RulerView(@yfb Context context, @gib AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        md8.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RulerView(Context context, AttributeSet attributeSet, int i, int i2, jt3 jt3Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public RulerView(@yfb Context context, @gib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md8.checkNotNullParameter(context, "context");
        this.f18968a = dpToPx(1.0f);
        this.f18970b = dpToPx(8.0f);
        this.f18972c = dpToPx(8.0f);
        this.f18974d = Color.parseColor("#818588");
        this.f18976e = Color.parseColor("#ECF3F3");
        this.f18977f = dpToPx(24.0f);
        this.f18978m = Color.parseColor("#FFD100");
        this.f18958C = 10;
        this.f18959F = -100;
        this.f18960H = 100;
        this.f18965Q = new Scroller(context);
        this.f18969a2 = new Paint(1);
        this.f18971b2 = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(this.f18978m);
        paint.setStrokeWidth(this.f18968a);
        this.f18973c2 = paint;
        initAttributes(attributeSet);
        setupPaints();
        setDefaultPosition();
    }
}
