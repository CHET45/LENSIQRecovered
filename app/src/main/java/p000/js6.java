package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class js6 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C */
    public int f51683C;

    /* JADX INFO: renamed from: F */
    public final int[] f51684F = new int[2];

    /* JADX INFO: renamed from: a */
    public final float f51685a;

    /* JADX INFO: renamed from: b */
    public final int f51686b;

    /* JADX INFO: renamed from: c */
    public final int f51687c;

    /* JADX INFO: renamed from: d */
    public final View f51688d;

    /* JADX INFO: renamed from: e */
    public Runnable f51689e;

    /* JADX INFO: renamed from: f */
    public Runnable f51690f;

    /* JADX INFO: renamed from: m */
    public boolean f51691m;

    /* JADX INFO: renamed from: js6$a */
    public class RunnableC8050a implements Runnable {
        public RunnableC8050a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = js6.this.f51688d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: js6$b */
    public class RunnableC8051b implements Runnable {
        public RunnableC8051b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            js6.this.m14275a();
        }
    }

    public js6(View view) {
        this.f51688d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f51685a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f51686b = tapTimeout;
        this.f51687c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void clearCallbacks() {
        Runnable runnable = this.f51690f;
        if (runnable != null) {
            this.f51688d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f51689e;
        if (runnable2 != null) {
            this.f51688d.removeCallbacks(runnable2);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        ur4 ur4Var;
        View view = this.f51688d;
        qbf popup = getPopup();
        if (popup == null || !popup.isShowing() || (ur4Var = (ur4) popup.getListView()) == null || !ur4Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, motionEventObtainNoHistory);
        toLocalMotionEvent(ur4Var, motionEventObtainNoHistory);
        boolean zOnForwardedEvent = ur4Var.onForwardedEvent(motionEventObtainNoHistory, this.f51683C);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zOnForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onTouchObserved(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f51688d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f51683C
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f51685a
            boolean r6 = pointInView(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.clearCallbacks()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.clearCallbacks()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f51683C = r6
            java.lang.Runnable r6 = r5.f51689e
            if (r6 != 0) goto L52
            js6$a r6 = new js6$a
            r6.<init>()
            r5.f51689e = r6
        L52:
            java.lang.Runnable r6 = r5.f51689e
            int r1 = r5.f51686b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f51690f
            if (r6 != 0) goto L65
            js6$b r6 = new js6$b
            r6.<init>()
            r5.f51690f = r6
        L65:
            java.lang.Runnable r6 = r5.f51690f
            int r1 = r5.f51687c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.js6.onTouchObserved(android.view.MotionEvent):boolean");
    }

    private static boolean pointInView(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f51684F);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f51684F);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m14275a() {
        clearCallbacks();
        View view = this.f51688d;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f51691m = true;
        }
    }

    public abstract qbf getPopup();

    public boolean onForwardingStarted() {
        qbf popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    public boolean onForwardingStopped() {
        qbf popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f51691m;
        if (z2) {
            z = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f51688d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f51691m = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f51691m = false;
        this.f51683C = -1;
        Runnable runnable = this.f51689e;
        if (runnable != null) {
            this.f51688d.removeCallbacks(runnable);
        }
    }
}
