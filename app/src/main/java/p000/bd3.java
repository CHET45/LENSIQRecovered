package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class bd3 {

    /* JADX INFO: renamed from: k */
    public static final int f13391k = -1;

    /* JADX INFO: renamed from: a */
    public int f13392a = -1;

    /* JADX INFO: renamed from: b */
    public int f13393b = 0;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f13394c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f13395d;

    /* JADX INFO: renamed from: e */
    public boolean f13396e;

    /* JADX INFO: renamed from: f */
    public float f13397f;

    /* JADX INFO: renamed from: g */
    public float f13398g;

    /* JADX INFO: renamed from: h */
    public final float f13399h;

    /* JADX INFO: renamed from: i */
    public final float f13400i;

    /* JADX INFO: renamed from: j */
    public w2c f13401j;

    /* JADX INFO: renamed from: bd3$a */
    public class ScaleGestureDetectorOnScaleGestureListenerC1840a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC1840a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            bd3.this.f13401j.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public bd3(Context context, w2c w2cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13400i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13399h = viewConfiguration.getScaledTouchSlop();
        this.f13401j = w2cVar;
        this.f13394c = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC1840a());
    }

    private float getActiveX(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f13393b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float getActiveY(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f13393b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f13392a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f13395d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f13397f = getActiveX(motionEvent);
            this.f13398g = getActiveY(motionEvent);
            this.f13396e = false;
        } else if (action == 1) {
            this.f13392a = -1;
            if (this.f13396e && this.f13395d != null) {
                this.f13397f = getActiveX(motionEvent);
                this.f13398g = getActiveY(motionEvent);
                this.f13395d.addMovement(motionEvent);
                this.f13395d.computeCurrentVelocity(1000);
                float xVelocity = this.f13395d.getXVelocity();
                float yVelocity = this.f13395d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f13400i) {
                    this.f13401j.onFling(this.f13397f, this.f13398g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f13395d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f13395d = null;
            }
        } else if (action == 2) {
            float activeX = getActiveX(motionEvent);
            float activeY = getActiveY(motionEvent);
            float f = activeX - this.f13397f;
            float f2 = activeY - this.f13398g;
            if (!this.f13396e) {
                this.f13396e = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f13399h);
            }
            if (this.f13396e) {
                this.f13401j.onDrag(f, f2);
                this.f13397f = activeX;
                this.f13398g = activeY;
                VelocityTracker velocityTracker2 = this.f13395d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f13392a = -1;
            VelocityTracker velocityTracker3 = this.f13395d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f13395d = null;
            }
        } else if (action == 6) {
            int iM24310b = w0i.m24310b(motionEvent.getAction());
            if (motionEvent.getPointerId(iM24310b) == this.f13392a) {
                int i = iM24310b == 0 ? 1 : 0;
                this.f13392a = motionEvent.getPointerId(i);
                this.f13397f = motionEvent.getX(i);
                this.f13398g = motionEvent.getY(i);
            }
        }
        int i2 = this.f13392a;
        this.f13393b = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        return true;
    }

    public boolean isDragging() {
        return this.f13396e;
    }

    public boolean isScaling() {
        return this.f13394c.isInProgress();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f13394c.onTouchEvent(motionEvent);
            return processTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
