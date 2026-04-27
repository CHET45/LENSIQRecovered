package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class z8i {

    /* JADX INFO: renamed from: A */
    public static final int f104385A = 1;

    /* JADX INFO: renamed from: B */
    public static final int f104386B = 2;

    /* JADX INFO: renamed from: C */
    public static final int f104387C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f104388D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f104389E = 4;

    /* JADX INFO: renamed from: F */
    public static final int f104390F = 8;

    /* JADX INFO: renamed from: G */
    public static final int f104391G = 15;

    /* JADX INFO: renamed from: H */
    public static final int f104392H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f104393I = 2;

    /* JADX INFO: renamed from: J */
    public static final int f104394J = 3;

    /* JADX INFO: renamed from: K */
    public static final int f104395K = 20;

    /* JADX INFO: renamed from: L */
    public static final int f104396L = 256;

    /* JADX INFO: renamed from: M */
    public static final int f104397M = 600;

    /* JADX INFO: renamed from: N */
    public static final Interpolator f104398N = new InterpolatorC16035a();

    /* JADX INFO: renamed from: x */
    public static final String f104399x = "ViewDragHelper";

    /* JADX INFO: renamed from: y */
    public static final int f104400y = -1;

    /* JADX INFO: renamed from: z */
    public static final int f104401z = 0;

    /* JADX INFO: renamed from: a */
    public int f104402a;

    /* JADX INFO: renamed from: b */
    public int f104403b;

    /* JADX INFO: renamed from: d */
    public float[] f104405d;

    /* JADX INFO: renamed from: e */
    public float[] f104406e;

    /* JADX INFO: renamed from: f */
    public float[] f104407f;

    /* JADX INFO: renamed from: g */
    public float[] f104408g;

    /* JADX INFO: renamed from: h */
    public int[] f104409h;

    /* JADX INFO: renamed from: i */
    public int[] f104410i;

    /* JADX INFO: renamed from: j */
    public int[] f104411j;

    /* JADX INFO: renamed from: k */
    public int f104412k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f104413l;

    /* JADX INFO: renamed from: m */
    public float f104414m;

    /* JADX INFO: renamed from: n */
    public float f104415n;

    /* JADX INFO: renamed from: o */
    public int f104416o;

    /* JADX INFO: renamed from: p */
    public final int f104417p;

    /* JADX INFO: renamed from: q */
    public int f104418q;

    /* JADX INFO: renamed from: r */
    public OverScroller f104419r;

    /* JADX INFO: renamed from: s */
    public final AbstractC16037c f104420s;

    /* JADX INFO: renamed from: t */
    public View f104421t;

    /* JADX INFO: renamed from: u */
    public boolean f104422u;

    /* JADX INFO: renamed from: v */
    public final ViewGroup f104423v;

    /* JADX INFO: renamed from: c */
    public int f104404c = -1;

    /* JADX INFO: renamed from: w */
    public final Runnable f104424w = new RunnableC16036b();

    /* JADX INFO: renamed from: z8i$a */
    public class InterpolatorC16035a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: z8i$b */
    public class RunnableC16036b implements Runnable {
        public RunnableC16036b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z8i.this.m26612b(0);
        }
    }

    /* JADX INFO: renamed from: z8i$c */
    public static abstract class AbstractC16037c {
        public int clampViewPositionHorizontal(@efb View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@efb View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@efb View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@efb View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@efb View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@efb View view, int i, int i2, @fkd int i3, @fkd int i4) {
        }

        public void onViewReleased(@efb View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@efb View view, int i);
    }

    private z8i(@efb Context context, @efb ViewGroup viewGroup, @efb AbstractC16037c abstractC16037c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC16037c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f104423v = viewGroup;
        this.f104420s = abstractC16037c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f104417p = i;
        this.f104416o = i;
        this.f104403b = viewConfiguration.getScaledTouchSlop();
        this.f104414m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f104415n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f104419r = new OverScroller(context, f104398N);
    }

    private boolean checkNewEdgeDrag(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f104409h[i] & i2) != i2 || (this.f104418q & i2) == 0 || (this.f104411j[i] & i2) == i2 || (this.f104410i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f104403b;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f104420s.onEdgeLock(i2)) {
            return (this.f104410i[i] & i2) == 0 && fAbs > ((float) this.f104403b);
        }
        int[] iArr = this.f104411j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f104420s.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f104420s.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f104403b) : z2 && Math.abs(f2) > ((float) this.f104403b);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f104403b;
        return f3 > ((float) (i * i));
    }

    private int clampMag(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private void clearMotionHistory() {
        float[] fArr = this.f104405d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f104406e, 0.0f);
        Arrays.fill(this.f104407f, 0.0f);
        Arrays.fill(this.f104408g, 0.0f);
        Arrays.fill(this.f104409h, 0);
        Arrays.fill(this.f104410i, 0);
        Arrays.fill(this.f104411j, 0);
        this.f104412k = 0;
    }

    private int computeAxisDuration(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f104423v.getWidth();
        float f = width / 2;
        float fDistanceInfluenceForSnapDuration = f + (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iClampMag = clampMag(i3, (int) this.f104415n, (int) this.f104414m);
        int iClampMag2 = clampMag(i4, (int) this.f104415n, (int) this.f104414m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iClampMag);
        int iAbs4 = Math.abs(iClampMag2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iClampMag != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iClampMag2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((computeAxisDuration(i, iClampMag, this.f104420s.getViewHorizontalDragRange(view)) * f5) + (computeAxisDuration(i2, iClampMag2, this.f104420s.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    public static z8i create(@efb ViewGroup viewGroup, @efb AbstractC16037c abstractC16037c) {
        return new z8i(viewGroup.getContext(), viewGroup, abstractC16037c);
    }

    private void dispatchViewReleased(float f, float f2) {
        this.f104422u = true;
        this.f104420s.onViewReleased(this.f104421t, f, f2);
        this.f104422u = false;
        if (this.f104402a == 1) {
            m26612b(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        int left = this.f104421t.getLeft();
        int top = this.f104421t.getTop();
        if (i3 != 0) {
            i = this.f104420s.clampViewPositionHorizontal(this.f104421t, i, i3);
            o8i.offsetLeftAndRight(this.f104421t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f104420s.clampViewPositionVertical(this.f104421t, i2, i4);
            o8i.offsetTopAndBottom(this.f104421t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f104420s.onViewPositionChanged(this.f104421t, i5, i6, i5 - left, i6 - top);
    }

    private void ensureMotionHistorySizeForId(int i) {
        float[] fArr = this.f104405d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f104406e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f104407f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f104408g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f104409h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f104410i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f104411j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f104405d = fArr2;
            this.f104406e = fArr3;
            this.f104407f = fArr4;
            this.f104408g = fArr5;
            this.f104409h = iArr;
            this.f104410i = iArr2;
            this.f104411j = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        int left = this.f104421t.getLeft();
        int top = this.f104421t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f104419r.abortAnimation();
            m26612b(0);
            return false;
        }
        this.f104419r.startScroll(left, top, i5, i6, computeSettleDuration(this.f104421t, i5, i6, i3, i4));
        m26612b(2);
        return true;
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = i < this.f104423v.getLeft() + this.f104416o ? 1 : 0;
        if (i2 < this.f104423v.getTop() + this.f104416o) {
            i3 |= 4;
        }
        if (i > this.f104423v.getRight() - this.f104416o) {
            i3 |= 2;
        }
        return i2 > this.f104423v.getBottom() - this.f104416o ? i3 | 8 : i3;
    }

    private boolean isValidPointerForActionMove(int i) {
        if (isPointerDown(i)) {
            return true;
        }
        Log.e(f104399x, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void releaseViewForPointerUp() {
        this.f104413l.computeCurrentVelocity(1000, this.f104414m);
        dispatchViewReleased(clampMag(this.f104413l.getXVelocity(this.f104404c), this.f104415n, this.f104414m), clampMag(this.f104413l.getYVelocity(this.f104404c), this.f104415n, this.f104414m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [z8i$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void reportNewEdgeDrags(float f, float f2, int i) {
        boolean zCheckNewEdgeDrag = checkNewEdgeDrag(f, f2, i, 1);
        ?? r0 = zCheckNewEdgeDrag;
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            r0 = (zCheckNewEdgeDrag ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f104410i;
            iArr[i] = iArr[i] | r03;
            this.f104420s.onEdgeDragStarted(r03, i);
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.f104405d;
        this.f104407f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f104406e;
        this.f104408g[i] = f2;
        fArr2[i] = f2;
        this.f104409h[i] = getEdgesTouched((int) f, (int) f2);
        this.f104412k |= 1 << i;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f104407f[pointerId] = x;
                this.f104408g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m26611a(@efb View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m26611a(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2));
    }

    public void abort() {
        cancel();
        if (this.f104402a == 2) {
            int currX = this.f104419r.getCurrX();
            int currY = this.f104419r.getCurrY();
            this.f104419r.abortAnimation();
            int currX2 = this.f104419r.getCurrX();
            int currY2 = this.f104419r.getCurrY();
            this.f104420s.onViewPositionChanged(this.f104421t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m26612b(0);
    }

    /* JADX INFO: renamed from: b */
    public void m26612b(int i) {
        this.f104423v.removeCallbacks(this.f104424w);
        if (this.f104402a != i) {
            this.f104402a = i;
            this.f104420s.onViewDragStateChanged(i);
            if (this.f104402a == 0) {
                this.f104421t = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m26613c(View view, int i) {
        if (view == this.f104421t && this.f104404c == i) {
            return true;
        }
        if (view == null || !this.f104420s.tryCaptureView(view, i)) {
            return false;
        }
        this.f104404c = i;
        captureChildView(view, i);
        return true;
    }

    public void cancel() {
        this.f104404c = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.f104413l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f104413l = null;
        }
    }

    public void captureChildView(@efb View view, int i) {
        if (view.getParent() == this.f104423v) {
            this.f104421t = view;
            this.f104404c = i;
            this.f104420s.onViewCaptured(view, i);
            m26612b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f104423v + c0b.f15434d);
    }

    public boolean continueSettling(boolean z) {
        if (this.f104402a == 2) {
            boolean zComputeScrollOffset = this.f104419r.computeScrollOffset();
            int currX = this.f104419r.getCurrX();
            int currY = this.f104419r.getCurrY();
            int left = currX - this.f104421t.getLeft();
            int top = currY - this.f104421t.getTop();
            if (left != 0) {
                o8i.offsetLeftAndRight(this.f104421t, left);
            }
            if (top != 0) {
                o8i.offsetTopAndBottom(this.f104421t, top);
            }
            if (left != 0 || top != 0) {
                this.f104420s.onViewPositionChanged(this.f104421t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f104419r.getFinalX() && currY == this.f104419r.getFinalY()) {
                this.f104419r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f104423v.post(this.f104424w);
                } else {
                    m26612b(0);
                }
            }
        }
        return this.f104402a == 2;
    }

    @hib
    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.f104423v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f104423v.getChildAt(this.f104420s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (!this.f104422u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f104419r.fling(this.f104421t.getLeft(), this.f104421t.getTop(), (int) this.f104413l.getXVelocity(this.f104404c), (int) this.f104413l.getYVelocity(this.f104404c), i, i3, i2, i4);
        m26612b(2);
    }

    public int getActivePointerId() {
        return this.f104404c;
    }

    @hib
    public View getCapturedView() {
        return this.f104421t;
    }

    @fkd
    public int getDefaultEdgeSize() {
        return this.f104417p;
    }

    @fkd
    public int getEdgeSize() {
        return this.f104416o;
    }

    public float getMinVelocity() {
        return this.f104415n;
    }

    @fkd
    public int getTouchSlop() {
        return this.f104403b;
    }

    public int getViewDragState() {
        return this.f104402a;
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.f104421t, i, i2);
    }

    public boolean isEdgeTouched(int i) {
        int length = this.f104409h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i) {
        return ((1 << i) & this.f104412k) != 0;
    }

    public boolean isViewUnder(@hib View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public void processTouchEvent(@efb MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f104413l == null) {
            this.f104413l = VelocityTracker.obtain();
        }
        this.f104413l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x, (int) y);
            saveInitialMotion(x, y, pointerId);
            m26613c(viewFindTopChildUnder, pointerId);
            int i3 = this.f104409h[pointerId];
            int i4 = this.f104418q;
            if ((i3 & i4) != 0) {
                this.f104420s.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f104402a == 1) {
                releaseViewForPointerUp();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.f104402a == 1) {
                if (isValidPointerForActionMove(this.f104404c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f104404c);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f104407f;
                    int i5 = this.f104404c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f104408g[i5]);
                    dragTo(this.f104421t.getLeft() + i6, this.f104421t.getTop() + i7, i6, i7);
                    saveLastMotion(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (isValidPointerForActionMove(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f104405d[pointerId2];
                    float f2 = y3 - this.f104406e[pointerId2];
                    reportNewEdgeDrags(f, f2, pointerId2);
                    if (this.f104402a != 1) {
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x3, (int) y3);
                        if (checkTouchSlop(viewFindTopChildUnder2, f, f2) && m26613c(viewFindTopChildUnder2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            saveLastMotion(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f104402a == 1) {
                dispatchViewReleased(0.0f, 0.0f);
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            saveInitialMotion(x4, y4, pointerId3);
            if (this.f104402a != 0) {
                if (isCapturedViewUnder((int) x4, (int) y4)) {
                    m26613c(this.f104421t, pointerId3);
                    return;
                }
                return;
            } else {
                m26613c(findTopChildUnder((int) x4, (int) y4), pointerId3);
                int i8 = this.f104409h[pointerId3];
                int i9 = this.f104418q;
                if ((i8 & i9) != 0) {
                    this.f104420s.onEdgeTouched(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f104402a == 1 && pointerId4 == this.f104404c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f104404c) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f104421t;
                    if (viewFindTopChildUnder3 == view && m26613c(view, pointerId5)) {
                        i = this.f104404c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                releaseViewForPointerUp();
            }
        }
        clearMotionHistory(pointerId4);
    }

    public void setEdgeSize(@h78(from = 0) @fkd int i) {
        this.f104416o = i;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.f104418q = i;
    }

    public void setMinVelocity(float f) {
        this.f104415n = f;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.f104422u) {
            return forceSettleCapturedViewAt(i, i2, (int) this.f104413l.getXVelocity(this.f104404c), (int) this.f104413l.getYVelocity(this.f104404c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldInterceptTouchEvent(@p000.efb android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z8i.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(@efb View view, int i, int i2) {
        this.f104421t = view;
        this.f104404c = -1;
        boolean zForceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        if (!zForceSettleCapturedViewAt && this.f104402a == 0 && this.f104421t != null) {
            this.f104421t = null;
        }
        return zForceSettleCapturedViewAt;
    }

    private float clampMag(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public static z8i create(@efb ViewGroup viewGroup, float f, @efb AbstractC16037c abstractC16037c) {
        z8i z8iVarCreate = create(viewGroup, abstractC16037c);
        z8iVarCreate.f104403b = (int) (z8iVarCreate.f104403b * (1.0f / f));
        return z8iVarCreate;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (i & this.f104409h[i2]) != 0;
    }

    public boolean checkTouchSlop(int i) {
        int length = this.f104405d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        if (!isPointerDown(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f104407f[i2] - this.f104405d[i2];
        float f2 = this.f104408g[i2] - this.f104406e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f104403b) : z2 && Math.abs(f2) > ((float) this.f104403b);
        }
        float f3 = (f * f) + (f2 * f2);
        int i3 = this.f104403b;
        return f3 > ((float) (i3 * i3));
    }

    private void clearMotionHistory(int i) {
        if (this.f104405d == null || !isPointerDown(i)) {
            return;
        }
        this.f104405d[i] = 0.0f;
        this.f104406e[i] = 0.0f;
        this.f104407f[i] = 0.0f;
        this.f104408g[i] = 0.0f;
        this.f104409h[i] = 0;
        this.f104410i[i] = 0;
        this.f104411j[i] = 0;
        this.f104412k = (~(1 << i)) & this.f104412k;
    }
}
