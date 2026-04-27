package p000;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dj0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: M1 */
    public static final float f29729M1 = 0.0f;

    /* JADX INFO: renamed from: V1 */
    public static final float f29730V1 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: Z1 */
    public static final float f29731Z1 = 0.0f;

    /* JADX INFO: renamed from: a2 */
    public static final int f29732a2 = 0;

    /* JADX INFO: renamed from: b2 */
    public static final int f29733b2 = 1;

    /* JADX INFO: renamed from: c2 */
    public static final int f29734c2 = 2;

    /* JADX INFO: renamed from: d2 */
    public static final int f29735d2 = 0;

    /* JADX INFO: renamed from: e2 */
    public static final int f29736e2 = 1;

    /* JADX INFO: renamed from: f2 */
    public static final int f29737f2 = 1;

    /* JADX INFO: renamed from: g2 */
    public static final int f29738g2 = 315;

    /* JADX INFO: renamed from: h2 */
    public static final int f29739h2 = 1575;

    /* JADX INFO: renamed from: i2 */
    public static final float f29740i2 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: j2 */
    public static final float f29741j2 = 0.2f;

    /* JADX INFO: renamed from: k2 */
    public static final float f29742k2 = 1.0f;

    /* JADX INFO: renamed from: l2 */
    public static final int f29743l2 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: m2 */
    public static final int f29744m2 = 500;

    /* JADX INFO: renamed from: n2 */
    public static final int f29745n2 = 500;

    /* JADX INFO: renamed from: C */
    public int f29746C;

    /* JADX INFO: renamed from: M */
    public boolean f29750M;

    /* JADX INFO: renamed from: N */
    public boolean f29751N;

    /* JADX INFO: renamed from: Q */
    public boolean f29752Q;

    /* JADX INFO: renamed from: X */
    public boolean f29753X;

    /* JADX INFO: renamed from: Y */
    public boolean f29754Y;

    /* JADX INFO: renamed from: Z */
    public boolean f29755Z;

    /* JADX INFO: renamed from: c */
    public final View f29758c;

    /* JADX INFO: renamed from: d */
    public Runnable f29759d;

    /* JADX INFO: renamed from: m */
    public int f29762m;

    /* JADX INFO: renamed from: a */
    public final C4799a f29756a = new C4799a();

    /* JADX INFO: renamed from: b */
    public final Interpolator f29757b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public float[] f29760e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    public float[] f29761f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: F */
    public float[] f29747F = {0.0f, 0.0f};

    /* JADX INFO: renamed from: H */
    public float[] f29748H = {0.0f, 0.0f};

    /* JADX INFO: renamed from: L */
    public float[] f29749L = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: dj0$a */
    public static class C4799a {

        /* JADX INFO: renamed from: a */
        public int f29763a;

        /* JADX INFO: renamed from: b */
        public int f29764b;

        /* JADX INFO: renamed from: c */
        public float f29765c;

        /* JADX INFO: renamed from: d */
        public float f29766d;

        /* JADX INFO: renamed from: j */
        public float f29772j;

        /* JADX INFO: renamed from: k */
        public int f29773k;

        /* JADX INFO: renamed from: e */
        public long f29767e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f29771i = -1;

        /* JADX INFO: renamed from: f */
        public long f29768f = 0;

        /* JADX INFO: renamed from: g */
        public int f29769g = 0;

        /* JADX INFO: renamed from: h */
        public int f29770h = 0;

        private float getValueAt(long j) {
            if (j < this.f29767e) {
                return 0.0f;
            }
            long j2 = this.f29771i;
            if (j2 < 0 || j < j2) {
                return dj0.m9184b((j - r0) / this.f29763a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f29772j;
            return (1.0f - f) + (f * dj0.m9184b((j - j2) / this.f29773k, 0.0f, 1.0f));
        }

        private float interpolateValue(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void computeScrollDelta() {
            if (this.f29768f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fInterpolateValue = interpolateValue(getValueAt(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f29768f;
            this.f29768f = jCurrentAnimationTimeMillis;
            float f = j * fInterpolateValue;
            this.f29769g = (int) (this.f29765c * f);
            this.f29770h = (int) (f * this.f29766d);
        }

        public int getDeltaX() {
            return this.f29769g;
        }

        public int getDeltaY() {
            return this.f29770h;
        }

        public int getHorizontalDirection() {
            float f = this.f29765c;
            return (int) (f / Math.abs(f));
        }

        public int getVerticalDirection() {
            float f = this.f29766d;
            return (int) (f / Math.abs(f));
        }

        public boolean isFinished() {
            return this.f29771i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f29771i + ((long) this.f29773k);
        }

        public void requestStop() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f29773k = dj0.m9185c((int) (jCurrentAnimationTimeMillis - this.f29767e), 0, this.f29764b);
            this.f29772j = getValueAt(jCurrentAnimationTimeMillis);
            this.f29771i = jCurrentAnimationTimeMillis;
        }

        public void setRampDownDuration(int i) {
            this.f29764b = i;
        }

        public void setRampUpDuration(int i) {
            this.f29763a = i;
        }

        public void setTargetVelocity(float f, float f2) {
            this.f29765c = f;
            this.f29766d = f2;
        }

        public void start() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f29767e = jCurrentAnimationTimeMillis;
            this.f29771i = -1L;
            this.f29768f = jCurrentAnimationTimeMillis;
            this.f29772j = 0.5f;
            this.f29769g = 0;
            this.f29770h = 0;
        }
    }

    /* JADX INFO: renamed from: dj0$b */
    public class RunnableC4800b implements Runnable {
        public RunnableC4800b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dj0 dj0Var = dj0.this;
            if (dj0Var.f29753X) {
                if (dj0Var.f29751N) {
                    dj0Var.f29751N = false;
                    dj0Var.f29756a.start();
                }
                C4799a c4799a = dj0.this.f29756a;
                if (c4799a.isFinished() || !dj0.this.m9187d()) {
                    dj0.this.f29753X = false;
                    return;
                }
                dj0 dj0Var2 = dj0.this;
                if (dj0Var2.f29752Q) {
                    dj0Var2.f29752Q = false;
                    dj0Var2.m9186a();
                }
                c4799a.computeScrollDelta();
                dj0.this.scrollTargetBy(c4799a.getDeltaX(), c4799a.getDeltaY());
                o8i.postOnAnimation(dj0.this.f29758c, this);
            }
        }
    }

    public dj0(@efb View view) {
        this.f29758c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        setMaximumVelocity(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(f29743l2);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    /* JADX INFO: renamed from: b */
    public static float m9184b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: c */
    public static int m9185c(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private float computeTargetVelocity(int i, float f, float f2, float f3) {
        float edgeValue = getEdgeValue(this.f29760e[i], f2, this.f29761f[i], f);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f29747F[i];
        float f5 = this.f29748H[i];
        float f6 = this.f29749L[i];
        float f7 = f4 * f3;
        return edgeValue > 0.0f ? m9184b(edgeValue * f7, f5, f6) : -m9184b((-edgeValue) * f7, f5, f6);
    }

    private float constrainEdgeValue(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f29762m;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f29753X && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float getEdgeValue(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM9184b = m9184b(f * f2, 0.0f, f3);
        float fConstrainEdgeValue = constrainEdgeValue(f2 - f4, fM9184b) - constrainEdgeValue(f4, fM9184b);
        if (fConstrainEdgeValue < 0.0f) {
            interpolation = -this.f29757b.getInterpolation(-fConstrainEdgeValue);
        } else {
            if (fConstrainEdgeValue <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f29757b.getInterpolation(fConstrainEdgeValue);
        }
        return m9184b(interpolation, -1.0f, 1.0f);
    }

    private void requestStop() {
        if (this.f29751N) {
            this.f29753X = false;
        } else {
            this.f29756a.requestStop();
        }
    }

    private void startAnimating() {
        int i;
        if (this.f29759d == null) {
            this.f29759d = new RunnableC4800b();
        }
        this.f29753X = true;
        this.f29751N = true;
        if (this.f29750M || (i = this.f29746C) <= 0) {
            this.f29759d.run();
        } else {
            o8i.postOnAnimationDelayed(this.f29758c, this.f29759d, i);
        }
        this.f29750M = true;
    }

    /* JADX INFO: renamed from: a */
    public void m9186a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f29758c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    /* JADX INFO: renamed from: d */
    public boolean m9187d() {
        C4799a c4799a = this.f29756a;
        int verticalDirection = c4799a.getVerticalDirection();
        int horizontalDirection = c4799a.getHorizontalDirection();
        return (verticalDirection != 0 && canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection));
    }

    public boolean isEnabled() {
        return this.f29754Y;
    }

    public boolean isExclusive() {
        return this.f29755Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f29754Y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.requestStop()
            goto L58
        L1a:
            r5.f29752Q = r2
            r5.f29750M = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f29758c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.computeTargetVelocity(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f29758c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.computeTargetVelocity(r2, r7, r6, r3)
            dj0$a r7 = r5.f29756a
            r7.setTargetVelocity(r0, r6)
            boolean r6 = r5.f29753X
            if (r6 != 0) goto L58
            boolean r6 = r5.m9187d()
            if (r6 == 0) goto L58
            r5.startAnimating()
        L58:
            boolean r6 = r5.f29755Z
            if (r6 == 0) goto L61
            boolean r6 = r5.f29753X
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dj0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i, int i2);

    @efb
    public dj0 setActivationDelay(int i) {
        this.f29746C = i;
        return this;
    }

    @efb
    public dj0 setEdgeType(int i) {
        this.f29762m = i;
        return this;
    }

    public dj0 setEnabled(boolean z) {
        if (this.f29754Y && !z) {
            requestStop();
        }
        this.f29754Y = z;
        return this;
    }

    public dj0 setExclusive(boolean z) {
        this.f29755Z = z;
        return this;
    }

    @efb
    public dj0 setMaximumEdges(float f, float f2) {
        float[] fArr = this.f29761f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @efb
    public dj0 setMaximumVelocity(float f, float f2) {
        float[] fArr = this.f29749L;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @efb
    public dj0 setMinimumVelocity(float f, float f2) {
        float[] fArr = this.f29748H;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @efb
    public dj0 setRampDownDuration(int i) {
        this.f29756a.setRampDownDuration(i);
        return this;
    }

    @efb
    public dj0 setRampUpDuration(int i) {
        this.f29756a.setRampUpDuration(i);
        return this;
    }

    @efb
    public dj0 setRelativeEdges(float f, float f2) {
        float[] fArr = this.f29760e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @efb
    public dj0 setRelativeVelocity(float f, float f2) {
        float[] fArr = this.f29747F;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }
}
