package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fi7<V extends View> extends pai<V> {

    /* JADX INFO: renamed from: p */
    public static final int f36793p = -1;

    /* JADX INFO: renamed from: i */
    @hib
    public Runnable f36794i;

    /* JADX INFO: renamed from: j */
    public OverScroller f36795j;

    /* JADX INFO: renamed from: k */
    public boolean f36796k;

    /* JADX INFO: renamed from: l */
    public int f36797l;

    /* JADX INFO: renamed from: m */
    public int f36798m;

    /* JADX INFO: renamed from: n */
    public int f36799n;

    /* JADX INFO: renamed from: o */
    @hib
    public VelocityTracker f36800o;

    /* JADX INFO: renamed from: fi7$a */
    public class RunnableC5842a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CoordinatorLayout f36801a;

        /* JADX INFO: renamed from: b */
        public final V f36802b;

        public RunnableC5842a(CoordinatorLayout coordinatorLayout, V v) {
            this.f36801a = coordinatorLayout;
            this.f36802b = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f36802b == null || (overScroller = fi7.this.f36795j) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                fi7.this.mo5822g(this.f36801a, this.f36802b);
                return;
            }
            fi7 fi7Var = fi7.this;
            fi7Var.m10928i(this.f36801a, this.f36802b, fi7Var.f36795j.getCurrY());
            o8i.postOnAnimation(this.f36802b, this);
        }
    }

    public fi7() {
        this.f36797l = -1;
        this.f36799n = -1;
    }

    private void ensureVelocityTracker() {
        if (this.f36800o == null) {
            this.f36800o = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo5818b(V v) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10926c(CoordinatorLayout coordinatorLayout, @efb V v, int i, int i2, float f) {
        Runnable runnable = this.f36794i;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f36794i = null;
        }
        if (this.f36795j == null) {
            this.f36795j = new OverScroller(v.getContext());
        }
        this.f36795j.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f36795j.computeScrollOffset()) {
            mo5822g(coordinatorLayout, v);
            return false;
        }
        RunnableC5842a runnableC5842a = new RunnableC5842a(coordinatorLayout, v);
        this.f36794i = runnableC5842a;
        o8i.postOnAnimation(v, runnableC5842a);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public int mo5819d(@efb V v) {
        return -v.getHeight();
    }

    /* JADX INFO: renamed from: e */
    public int mo5820e(@efb V v) {
        return v.getHeight();
    }

    /* JADX INFO: renamed from: f */
    public int mo5821f() {
        return getTopAndBottomOffset();
    }

    /* JADX INFO: renamed from: g */
    public void mo5822g(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: renamed from: h */
    public final int m10927h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo5823j(coordinatorLayout, v, mo5821f() - i, i2, i3);
    }

    /* JADX INFO: renamed from: i */
    public int m10928i(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo5823j(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: j */
    public int mo5823j(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (iClamp = r3a.clamp(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0908c
    public boolean onInterceptTouchEvent(@efb CoordinatorLayout coordinatorLayout, @efb V v, @efb MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f36799n < 0) {
            this.f36799n = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f36796k) {
            int i = this.f36797l;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f36798m) > this.f36799n) {
                this.f36798m = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f36797l = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo5818b(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.f36796k = z;
            if (z) {
                this.f36798m = y2;
                this.f36797l = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.f36795j;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f36795j.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f36800o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0908c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@p000.efb androidx.coordinatorlayout.widget.CoordinatorLayout r12, @p000.efb V r13, @p000.efb android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f36797l = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f36798m = r12
            goto L4c
        L2d:
            int r0 = r11.f36797l
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f36798m
            int r7 = r1 - r0
            r11.f36798m = r0
            int r8 = r11.mo5819d(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m10927h(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f36800o
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f36800o
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f36800o
            int r4 = r11.f36797l
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo5820e(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m10926c(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f36796k = r3
            r11.f36797l = r1
            android.view.VelocityTracker r13 = r11.f36800o
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f36800o = r13
        L81:
            android.view.VelocityTracker r13 = r11.f36800o
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f36796k
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi7.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public fi7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36797l = -1;
        this.f36799n = -1;
    }
}
