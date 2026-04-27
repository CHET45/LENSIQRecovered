package com.watchfun.transcommon.widget;

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

/* JADX INFO: loaded from: classes6.dex */
public class TouchImageView extends AppCompatImageView {
    static final int CLICK = 3;
    static final int DRAG = 1;
    static final int NONE = 0;
    static final int ZOOM = 2;
    Context context;
    float initScale;
    PointF last;

    /* JADX INFO: renamed from: m */
    float[] f25977m;
    private GestureDetector mGestureDetector;
    ScaleGestureDetector mScaleDetector;
    Matrix matrix;
    float maxScale;
    float minScale;
    int mode;
    int oldMeasuredHeight;
    int oldMeasuredWidth;
    private OnClickListener onClickListener;
    protected float origHeight;
    protected float origWidth;
    float saveScale;
    PointF start;
    int viewHeight;
    int viewWidth;

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TouchImageView touchImageView = TouchImageView.this;
            float f = touchImageView.saveScale;
            float f2 = touchImageView.maxScale;
            if (f >= f2) {
                touchImageView.saveScale = touchImageView.minScale;
            } else {
                touchImageView.saveScale = f2;
            }
            float f3 = touchImageView.saveScale;
            if (f3 == touchImageView.minScale) {
                touchImageView.resetToDefault();
            } else {
                touchImageView.matrix.postScale(f3 / f, f3 / f, motionEvent.getX(), motionEvent.getY());
            }
            TouchImageView.this.fixTrans();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@efb MotionEvent motionEvent) {
            if (TouchImageView.this.onClickListener == null) {
                return true;
            }
            TouchImageView.this.onClickListener.onClick();
            return true;
        }
    }

    public interface OnClickListener {
        void onClick();
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
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
                com.watchfun.transcommon.widget.TouchImageView r1 = com.watchfun.transcommon.widget.TouchImageView.this
                float r2 = r1.saveScale
                float r3 = r2 * r0
                r1.saveScale = r3
                float r4 = r1.maxScale
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 <= 0) goto L17
                r1.saveScale = r4
            L14:
                float r0 = r4 / r2
                goto L20
            L17:
                float r4 = r1.minScale
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L20
                r1.saveScale = r4
                goto L14
            L20:
                float r2 = r1.origWidth
                float r3 = r1.saveScale
                float r2 = r2 * r3
                int r4 = r1.viewWidth
                float r5 = (float) r4
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 <= 0) goto L45
                float r2 = r1.origHeight
                float r2 = r2 * r3
                int r3 = r1.viewHeight
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L37
                goto L45
            L37:
                android.graphics.Matrix r1 = r1.matrix
                float r2 = r7.getFocusX()
                float r7 = r7.getFocusY()
                r1.postScale(r0, r0, r2, r7)
                goto L52
            L45:
                android.graphics.Matrix r7 = r1.matrix
                int r4 = r4 / 2
                float r2 = (float) r4
                int r1 = r1.viewHeight
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.postScale(r0, r0, r2, r1)
            L52:
                com.watchfun.transcommon.widget.TouchImageView r7 = com.watchfun.transcommon.widget.TouchImageView.this
                r7.fixTrans()
                r7 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.watchfun.transcommon.widget.TouchImageView.ScaleListener.onScale(android.view.ScaleGestureDetector):boolean");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.mode = 2;
            return true;
        }
    }

    public TouchImageView(Context context) {
        super(context);
        this.mode = 0;
        this.last = new PointF();
        this.start = new PointF();
        this.minScale = 1.0f;
        this.maxScale = 2.0f;
        this.saveScale = 1.0f;
        sharedConstructing(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getMatrixRectf() {
        Matrix matrix = this.matrix;
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
        this.matrix.getValues(fArr);
        return fArr[0];
    }

    private void sharedConstructing(Context context) {
        super.setClickable(true);
        this.context = context;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.mGestureDetector = new GestureDetector(context, new GestureListener());
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        this.f25977m = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.watchfun.transcommon.widget.TouchImageView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                RectF matrixRectf = TouchImageView.this.getMatrixRectf();
                TouchImageView.this.mScaleDetector.onTouchEvent(motionEvent);
                TouchImageView.this.mGestureDetector.onTouchEvent(motionEvent);
                PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (matrixRectf.width() - TouchImageView.this.getWidth() > 10.0f || matrixRectf.height() - TouchImageView.this.getHeight() > 10.0f) {
                        TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    TouchImageView.this.last.set(pointF);
                    TouchImageView touchImageView = TouchImageView.this;
                    touchImageView.start.set(touchImageView.last);
                    TouchImageView.this.mode = 1;
                } else if (action == 1) {
                    TouchImageView touchImageView2 = TouchImageView.this;
                    touchImageView2.mode = 0;
                    int iAbs = (int) Math.abs(pointF.x - touchImageView2.start.x);
                    int iAbs2 = (int) Math.abs(pointF.y - TouchImageView.this.start.y);
                    if (iAbs < 3 && iAbs2 < 3) {
                        TouchImageView.this.performClick();
                    }
                } else if (action == 2) {
                    if (motionEvent.getPointerCount() == 2) {
                        TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    TouchImageView touchImageView3 = TouchImageView.this;
                    if (touchImageView3.mode == 1) {
                        float f = pointF.x;
                        PointF pointF2 = touchImageView3.last;
                        float f2 = f - pointF2.x;
                        float f3 = pointF.y - pointF2.y;
                        float fixDragTrans = touchImageView3.getFixDragTrans(f2, touchImageView3.viewWidth, touchImageView3.origWidth * touchImageView3.saveScale);
                        TouchImageView touchImageView4 = TouchImageView.this;
                        TouchImageView.this.matrix.postTranslate(fixDragTrans, touchImageView4.getFixDragTrans(f3, touchImageView4.viewHeight, touchImageView4.origHeight * touchImageView4.saveScale));
                        TouchImageView.this.fixTrans();
                        TouchImageView.this.last.set(pointF.x, pointF.y);
                    }
                } else if (action == 6) {
                    TouchImageView.this.mode = 0;
                }
                TouchImageView touchImageView5 = TouchImageView.this;
                touchImageView5.setImageMatrix(touchImageView5.matrix);
                TouchImageView.this.invalidate();
                return true;
            }
        });
    }

    public void fixTrans() {
        this.matrix.getValues(this.f25977m);
        float[] fArr = this.f25977m;
        float f = fArr[2];
        float f2 = fArr[5];
        float fixTrans = getFixTrans(f, this.viewWidth, this.origWidth * this.saveScale);
        float fixTrans2 = getFixTrans(f2, this.viewHeight, this.origHeight * this.saveScale);
        if (fixTrans == 0.0f && fixTrans2 == 0.0f) {
            return;
        }
        this.matrix.postTranslate(fixTrans, fixTrans2);
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
        return this.initScale < getScale();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.viewWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.viewHeight = size;
        int i3 = this.oldMeasuredHeight;
        int i4 = this.viewWidth;
        if ((i3 == i4 && i3 == size) || i4 == 0 || size == 0) {
            return;
        }
        this.oldMeasuredHeight = size;
        this.oldMeasuredWidth = i4;
        if (this.saveScale == 1.0f) {
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
            float fMin = Math.min(this.viewWidth / f, this.viewHeight / f2);
            this.matrix.setScale(fMin, fMin);
            this.initScale = fMin;
            float f3 = (this.viewHeight - (f2 * fMin)) / 2.0f;
            float f4 = (this.viewWidth - (fMin * f)) / 2.0f;
            this.matrix.postTranslate(f4, f3);
            this.origWidth = this.viewWidth - (f4 * 2.0f);
            this.origHeight = this.viewHeight - (f3 * 2.0f);
            setImageMatrix(this.matrix);
        }
        fixTrans();
    }

    public void resetToDefault() {
        Drawable drawable;
        this.viewWidth = getWidth();
        int height = getHeight();
        this.viewHeight = height;
        if (this.viewWidth == 0 || height == 0 || (drawable = getDrawable()) == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(this.viewWidth / intrinsicWidth, this.viewHeight / intrinsicHeight);
        this.matrix.reset();
        this.matrix.setScale(fMin, fMin);
        float f = (this.viewHeight - (intrinsicHeight * fMin)) / 2.0f;
        float f2 = (this.viewWidth - (intrinsicWidth * fMin)) / 2.0f;
        this.matrix.postTranslate(f2, f);
        this.saveScale = 1.0f;
        this.initScale = fMin;
        this.origWidth = this.viewWidth - (f2 * 2.0f);
        this.origHeight = this.viewHeight - (f * 2.0f);
        fixTrans();
        setImageMatrix(this.matrix);
        invalidate();
        this.mode = 0;
    }

    public void setMaxZoom(float f) {
        this.maxScale = f;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mode = 0;
        this.last = new PointF();
        this.start = new PointF();
        this.minScale = 1.0f;
        this.maxScale = 2.0f;
        this.saveScale = 1.0f;
        sharedConstructing(context);
    }
}
