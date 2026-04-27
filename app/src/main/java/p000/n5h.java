package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class n5h {

    /* JADX INFO: renamed from: a */
    public static final int f63362a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f63363b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f63364c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f63365d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f63366e = 8;

    /* JADX INFO: renamed from: n5h$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9705a {
    }

    /* JADX INFO: renamed from: n5h$b */
    public static abstract class AbstractViewOnTouchListenerC9706b implements View.OnTouchListener {

        /* JADX INFO: renamed from: L */
        public static final int f63367L = 0;

        /* JADX INFO: renamed from: M */
        public static final int f63368M = 1;

        /* JADX INFO: renamed from: N */
        public static final int f63369N = 2;

        /* JADX INFO: renamed from: Q */
        public static final int f63370Q = 1000;

        /* JADX INFO: renamed from: C */
        public VelocityTracker f63371C;

        /* JADX INFO: renamed from: F */
        public int f63372F;

        /* JADX INFO: renamed from: H */
        public int f63373H;

        /* JADX INFO: renamed from: a */
        public int f63374a;

        /* JADX INFO: renamed from: b */
        public int f63375b;

        /* JADX INFO: renamed from: c */
        public int f63376c;

        /* JADX INFO: renamed from: d */
        public int f63377d;

        /* JADX INFO: renamed from: e */
        public int f63378e;

        /* JADX INFO: renamed from: f */
        public int f63379f;

        /* JADX INFO: renamed from: m */
        public int f63380m;

        public AbstractViewOnTouchListenerC9706b() {
            resetTouch(-1, -1);
        }

        private void resetTouch(int i, int i2) {
            this.f63375b = i;
            this.f63376c = i2;
            this.f63377d = i;
            this.f63378e = i2;
            this.f63379f = 0;
            this.f63380m = 0;
            VelocityTracker velocityTracker = this.f63371C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        public abstract boolean onDown(View view, int i, int i2, MotionEvent motionEvent);

        public abstract boolean onMove(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent);

        public abstract boolean onStop(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent);

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f63374a == 0) {
                this.f63374a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            }
            if (this.f63372F == 0) {
                this.f63372F = ViewConfiguration.get(view.getContext()).getScaledMaximumFlingVelocity();
            }
            if (this.f63373H == 0) {
                this.f63373H = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
            }
            if (this.f63371C == null) {
                this.f63371C = VelocityTracker.obtain();
            }
            this.f63371C.addMovement(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                return onUtilsDown(view, motionEvent);
            }
            if (action != 1) {
                if (action == 2) {
                    return onUtilsMove(view, motionEvent);
                }
                if (action != 3) {
                    return false;
                }
            }
            return onUtilsStop(view, motionEvent);
        }

        public boolean onUtilsDown(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            resetTouch(rawX, rawY);
            view.setPressed(true);
            return onDown(view, rawX, rawY, motionEvent);
        }

        public boolean onUtilsMove(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (this.f63375b == -1) {
                resetTouch(rawX, rawY);
                view.setPressed(true);
            }
            if (this.f63379f != 1) {
                if (Math.abs(rawX - this.f63377d) < this.f63374a && Math.abs(rawY - this.f63378e) < this.f63374a) {
                    return true;
                }
                this.f63379f = 1;
                if (Math.abs(rawX - this.f63377d) >= Math.abs(rawY - this.f63378e)) {
                    if (rawX - this.f63377d < 0) {
                        this.f63380m = 1;
                    } else {
                        this.f63380m = 4;
                    }
                } else if (rawY - this.f63378e < 0) {
                    this.f63380m = 2;
                } else {
                    this.f63380m = 8;
                }
            }
            boolean zOnMove = onMove(view, this.f63380m, rawX, rawY, rawX - this.f63377d, rawY - this.f63378e, rawX - this.f63375b, rawY - this.f63376c, motionEvent);
            this.f63377d = rawX;
            this.f63378e = rawY;
            return zOnMove;
        }

        public boolean onUtilsStop(View view, MotionEvent motionEvent) {
            int i;
            int i2;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            VelocityTracker velocityTracker = this.f63371C;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.f63372F);
                int xVelocity = (int) this.f63371C.getXVelocity();
                int yVelocity = (int) this.f63371C.getYVelocity();
                this.f63371C.recycle();
                if (Math.abs(xVelocity) < this.f63373H) {
                    xVelocity = 0;
                }
                if (Math.abs(yVelocity) < this.f63373H) {
                    yVelocity = 0;
                }
                this.f63371C = null;
                i = xVelocity;
                i2 = yVelocity;
            } else {
                i = 0;
                i2 = 0;
            }
            view.setPressed(false);
            boolean zOnStop = onStop(view, this.f63380m, rawX, rawY, rawX - this.f63375b, rawY - this.f63376c, i, i2, motionEvent);
            if (motionEvent.getAction() == 1 && this.f63379f == 0) {
                if (motionEvent.getEventTime() - motionEvent.getDownTime() <= 1000) {
                    view.performClick();
                } else {
                    view.performLongClick();
                }
            }
            resetTouch(-1, -1);
            return zOnStop;
        }
    }

    private n5h() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void setOnTouchListener(View view, AbstractViewOnTouchListenerC9706b abstractViewOnTouchListenerC9706b) {
        if (view == null || abstractViewOnTouchListenerC9706b == null) {
            return;
        }
        view.setOnTouchListener(abstractViewOnTouchListenerC9706b);
    }
}
