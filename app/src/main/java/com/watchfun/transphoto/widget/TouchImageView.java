package com.watchfun.transphoto.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p000.efb;

/* JADX INFO: loaded from: classes7.dex */
public class TouchImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: d2 */
    public static final int f26135d2 = 0;

    /* JADX INFO: renamed from: e2 */
    public static final int f26136e2 = 1;

    /* JADX INFO: renamed from: f2 */
    public static final int f26137f2 = 2;

    /* JADX INFO: renamed from: g2 */
    public static final int f26138g2 = 3;

    /* JADX INFO: renamed from: C */
    public float[] f26139C;

    /* JADX INFO: renamed from: F */
    public float f26140F;

    /* JADX INFO: renamed from: H */
    public GestureDetector f26141H;

    /* JADX INFO: renamed from: L */
    public int f26142L;

    /* JADX INFO: renamed from: M */
    public int f26143M;

    /* JADX INFO: renamed from: M1 */
    public float f26144M1;

    /* JADX INFO: renamed from: N */
    public float f26145N;

    /* JADX INFO: renamed from: Q */
    public float f26146Q;

    /* JADX INFO: renamed from: V1 */
    public int f26147V1;

    /* JADX INFO: renamed from: Z1 */
    public int f26148Z1;

    /* JADX INFO: renamed from: a */
    public Matrix f26149a;

    /* JADX INFO: renamed from: a2 */
    public ScaleGestureDetector f26150a2;

    /* JADX INFO: renamed from: b */
    public int f26151b;

    /* JADX INFO: renamed from: b2 */
    public Context f26152b2;

    /* JADX INFO: renamed from: c */
    public PointF f26153c;

    /* JADX INFO: renamed from: c2 */
    public InterfaceC4285c f26154c2;

    /* JADX INFO: renamed from: d */
    public PointF f26155d;

    /* JADX INFO: renamed from: e */
    public float f26156e;

    /* JADX INFO: renamed from: f */
    public float f26157f;

    /* JADX INFO: renamed from: com.watchfun.transphoto.widget.TouchImageView$a */
    public class ViewOnTouchListenerC4283a implements View.OnTouchListener {
        public ViewOnTouchListenerC4283a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RectF matrixRectf = TouchImageView.this.getMatrixRectf();
            TouchImageView.this.f26150a2.onTouchEvent(motionEvent);
            TouchImageView.this.f26141H.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            if (action == 0) {
                if (matrixRectf.width() - TouchImageView.this.getWidth() > 10.0f || matrixRectf.height() - TouchImageView.this.getHeight() > 10.0f) {
                    TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
                TouchImageView.this.f26153c.set(pointF);
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.f26155d.set(touchImageView.f26153c);
                TouchImageView.this.f26151b = 1;
            } else if (action == 1) {
                TouchImageView touchImageView2 = TouchImageView.this;
                touchImageView2.f26151b = 0;
                int iAbs = (int) Math.abs(pointF.x - touchImageView2.f26155d.x);
                int iAbs2 = (int) Math.abs(pointF.y - TouchImageView.this.f26155d.y);
                if (iAbs < 3 && iAbs2 < 3) {
                    TouchImageView.this.performClick();
                }
            } else if (action == 2) {
                if (motionEvent.getPointerCount() == 2) {
                    TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
                TouchImageView touchImageView3 = TouchImageView.this;
                if (touchImageView3.f26151b == 1) {
                    float f = pointF.x;
                    PointF pointF2 = touchImageView3.f26153c;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    float fixDragTrans = touchImageView3.getFixDragTrans(f2, touchImageView3.f26142L, touchImageView3.f26146Q * touchImageView3.f26145N);
                    TouchImageView touchImageView4 = TouchImageView.this;
                    TouchImageView.this.f26149a.postTranslate(fixDragTrans, touchImageView4.getFixDragTrans(f3, touchImageView4.f26143M, touchImageView4.f26144M1 * touchImageView4.f26145N));
                    TouchImageView.this.fixTrans();
                    TouchImageView.this.f26153c.set(pointF.x, pointF.y);
                }
            } else if (action == 6) {
                TouchImageView.this.f26151b = 0;
            }
            TouchImageView touchImageView5 = TouchImageView.this;
            touchImageView5.setImageMatrix(touchImageView5.f26149a);
            TouchImageView.this.invalidate();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.widget.TouchImageView$b */
    public class C4284b extends GestureDetector.SimpleOnGestureListener {
        private C4284b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TouchImageView touchImageView = TouchImageView.this;
            float f = touchImageView.f26145N;
            float f2 = touchImageView.f26157f;
            if (f >= f2) {
                touchImageView.f26145N = touchImageView.f26156e;
            } else {
                touchImageView.f26145N = f2;
            }
            float f3 = touchImageView.f26145N;
            if (f3 == touchImageView.f26156e) {
                touchImageView.resetToDefault();
            } else {
                touchImageView.f26149a.postScale(f3 / f, f3 / f, motionEvent.getX(), motionEvent.getY());
            }
            TouchImageView.this.fixTrans();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@efb MotionEvent motionEvent) {
            if (TouchImageView.this.f26154c2 == null) {
                return true;
            }
            TouchImageView.this.f26154c2.onClick();
            return true;
        }

        public /* synthetic */ C4284b(TouchImageView touchImageView, ViewOnTouchListenerC4283a viewOnTouchListenerC4283a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.widget.TouchImageView$c */
    public interface InterfaceC4285c {
        void onClick();
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.widget.TouchImageView$d */
    public class C4286d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C4286d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onScale(android.view.ScaleGestureDetector r7) {
            /*
                r6 = this;
                float r0 = r7.getScaleFactor()
                com.watchfun.transphoto.widget.TouchImageView r1 = com.watchfun.transphoto.widget.TouchImageView.this
                float r2 = r1.f26145N
                float r3 = r2 * r0
                r1.f26145N = r3
                float r4 = r1.f26157f
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 <= 0) goto L17
                r1.f26145N = r4
            L14:
                float r0 = r4 / r2
                goto L20
            L17:
                float r4 = r1.f26156e
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L20
                r1.f26145N = r4
                goto L14
            L20:
                float r2 = r1.f26146Q
                float r3 = r1.f26145N
                float r2 = r2 * r3
                int r4 = r1.f26142L
                float r5 = (float) r4
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 <= 0) goto L45
                float r2 = r1.f26144M1
                float r2 = r2 * r3
                int r3 = r1.f26143M
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L37
                goto L45
            L37:
                android.graphics.Matrix r1 = r1.f26149a
                float r2 = r7.getFocusX()
                float r7 = r7.getFocusY()
                r1.postScale(r0, r0, r2, r7)
                goto L52
            L45:
                android.graphics.Matrix r7 = r1.f26149a
                int r4 = r4 / 2
                float r2 = (float) r4
                int r1 = r1.f26143M
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.postScale(r0, r0, r2, r1)
            L52:
                com.watchfun.transphoto.widget.TouchImageView r7 = com.watchfun.transphoto.widget.TouchImageView.this
                r7.fixTrans()
                r7 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.watchfun.transphoto.widget.TouchImageView.C4286d.onScale(android.view.ScaleGestureDetector):boolean");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.f26151b = 2;
            return true;
        }

        public /* synthetic */ C4286d(TouchImageView touchImageView, ViewOnTouchListenerC4283a viewOnTouchListenerC4283a) {
            this();
        }
    }

    public TouchImageView(Context context) {
        super(context);
        this.f26151b = 0;
        this.f26153c = new PointF();
        this.f26155d = new PointF();
        this.f26156e = 1.0f;
        this.f26157f = 2.0f;
        this.f26145N = 1.0f;
        sharedConstructing(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getMatrixRectf() {
        Matrix matrix = this.f26149a;
        Drawable drawable = getDrawable();
        RectF rectF = new RectF();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    private float getScale() {
        float[] fArr = new float[9];
        this.f26149a.getValues(fArr);
        return fArr[0];
    }

    private void sharedConstructing(Context context) {
        super.setClickable(true);
        this.f26152b2 = context;
        ViewOnTouchListenerC4283a viewOnTouchListenerC4283a = null;
        this.f26150a2 = new ScaleGestureDetector(context, new C4286d(this, viewOnTouchListenerC4283a));
        this.f26141H = new GestureDetector(context, new C4284b(this, viewOnTouchListenerC4283a));
        Matrix matrix = new Matrix();
        this.f26149a = matrix;
        this.f26139C = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new ViewOnTouchListenerC4283a());
    }

    public void fixTrans() {
        this.f26149a.getValues(this.f26139C);
        float[] fArr = this.f26139C;
        float f = fArr[2];
        float f2 = fArr[5];
        float fixTrans = getFixTrans(f, this.f26142L, this.f26146Q * this.f26145N);
        float fixTrans2 = getFixTrans(f2, this.f26143M, this.f26144M1 * this.f26145N);
        if (fixTrans == 0.0f && fixTrans2 == 0.0f) {
            return;
        }
        this.f26149a.postTranslate(fixTrans, fixTrans2);
    }

    public float getFixDragTrans(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    public float getFixTrans(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f5 = f2 - f3;
            f4 = 0.0f;
        } else {
            f4 = f2 - f3;
            f5 = 0.0f;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    public boolean isScale() {
        return this.f26140F < getScale();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26142L = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f26143M = size;
        int i3 = this.f26148Z1;
        int i4 = this.f26142L;
        if ((i3 == i4 && i3 == size) || i4 == 0 || size == 0) {
            return;
        }
        this.f26148Z1 = size;
        this.f26147V1 = i4;
        if (this.f26145N == 1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("bmWidth: ");
            sb.append(intrinsicWidth);
            sb.append(" bmHeight : ");
            sb.append(intrinsicHeight);
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            float fMin = Math.min(this.f26142L / f, this.f26143M / f2);
            this.f26149a.setScale(fMin, fMin);
            this.f26140F = fMin;
            float f3 = (this.f26143M - (f2 * fMin)) / 2.0f;
            float f4 = (this.f26142L - (fMin * f)) / 2.0f;
            this.f26149a.postTranslate(f4, f3);
            this.f26146Q = this.f26142L - (f4 * 2.0f);
            this.f26144M1 = this.f26143M - (f3 * 2.0f);
            setImageMatrix(this.f26149a);
        }
        fixTrans();
    }

    public void resetToDefault() {
        Drawable drawable;
        this.f26142L = getWidth();
        int height = getHeight();
        this.f26143M = height;
        if (this.f26142L == 0 || height == 0 || (drawable = getDrawable()) == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(this.f26142L / intrinsicWidth, this.f26143M / intrinsicHeight);
        this.f26149a.reset();
        this.f26149a.setScale(fMin, fMin);
        float f = (this.f26143M - (intrinsicHeight * fMin)) / 2.0f;
        float f2 = (this.f26142L - (intrinsicWidth * fMin)) / 2.0f;
        this.f26149a.postTranslate(f2, f);
        this.f26145N = 1.0f;
        this.f26140F = fMin;
        this.f26146Q = this.f26142L - (f2 * 2.0f);
        this.f26144M1 = this.f26143M - (f * 2.0f);
        fixTrans();
        setImageMatrix(this.f26149a);
        invalidate();
        this.f26151b = 0;
    }

    public void setMaxZoom(float f) {
        this.f26157f = f;
    }

    public void setOnClickListener(InterfaceC4285c interfaceC4285c) {
        this.f26154c2 = interfaceC4285c;
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26151b = 0;
        this.f26153c = new PointF();
        this.f26155d = new PointF();
        this.f26156e = 1.0f;
        this.f26157f = 2.0f;
        this.f26145N = 1.0f;
        sharedConstructing(context);
    }
}
