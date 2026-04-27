package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C0898a;
import androidx.constraintlayout.widget.C0901d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.mbi;
import p000.rai;
import p000.ubi;

/* JADX INFO: loaded from: classes.dex */
public class eza {

    /* JADX INFO: renamed from: N */
    public static final int f34543N = 0;

    /* JADX INFO: renamed from: O */
    public static final int f34544O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f34545P = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f34546Q = 3;

    /* JADX INFO: renamed from: R */
    public static final int f34547R = 4;

    /* JADX INFO: renamed from: S */
    public static final int f34548S = 5;

    /* JADX INFO: renamed from: T */
    public static final int f34549T = 0;

    /* JADX INFO: renamed from: U */
    public static final int f34550U = 1;

    /* JADX INFO: renamed from: V */
    public static final int f34551V = 2;

    /* JADX INFO: renamed from: W */
    public static final int f34552W = 3;

    /* JADX INFO: renamed from: X */
    public static final int f34553X = 4;

    /* JADX INFO: renamed from: Y */
    public static final int f34554Y = 5;

    /* JADX INFO: renamed from: Z */
    public static final int f34555Z = 6;

    /* JADX INFO: renamed from: a0 */
    public static final int f34556a0 = 1;

    /* JADX INFO: renamed from: b0 */
    public static final int f34557b0 = 2;

    /* JADX INFO: renamed from: c0 */
    public static final String f34558c0 = "MotionController";

    /* JADX INFO: renamed from: d0 */
    public static final boolean f34559d0 = false;

    /* JADX INFO: renamed from: e0 */
    public static final boolean f34560e0 = false;

    /* JADX INFO: renamed from: f0 */
    public static final int f34561f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public static final int f34562g0 = 1;

    /* JADX INFO: renamed from: h0 */
    public static final int f34563h0 = 2;

    /* JADX INFO: renamed from: i0 */
    public static final int f34564i0 = 3;

    /* JADX INFO: renamed from: j0 */
    public static final int f34565j0 = 4;

    /* JADX INFO: renamed from: k0 */
    public static final int f34566k0 = 5;

    /* JADX INFO: renamed from: l0 */
    public static final int f34567l0 = -1;

    /* JADX INFO: renamed from: m0 */
    public static final int f34568m0 = -2;

    /* JADX INFO: renamed from: n0 */
    public static final int f34569n0 = -3;

    /* JADX INFO: renamed from: B */
    public HashMap<String, ubi> f34571B;

    /* JADX INFO: renamed from: C */
    public HashMap<String, mbi> f34572C;

    /* JADX INFO: renamed from: D */
    public HashMap<String, rai> f34573D;

    /* JADX INFO: renamed from: E */
    public mr8[] f34574E;

    /* JADX INFO: renamed from: F */
    public int f34575F;

    /* JADX INFO: renamed from: G */
    public int f34576G;

    /* JADX INFO: renamed from: H */
    public View f34577H;

    /* JADX INFO: renamed from: I */
    public int f34578I;

    /* JADX INFO: renamed from: J */
    public float f34579J;

    /* JADX INFO: renamed from: K */
    public Interpolator f34580K;

    /* JADX INFO: renamed from: L */
    public boolean f34581L;

    /* JADX INFO: renamed from: M */
    public String[] f34582M;

    /* JADX INFO: renamed from: b */
    public View f34584b;

    /* JADX INFO: renamed from: c */
    public int f34585c;

    /* JADX INFO: renamed from: e */
    public String f34587e;

    /* JADX INFO: renamed from: k */
    public db3[] f34593k;

    /* JADX INFO: renamed from: l */
    public db3 f34594l;

    /* JADX INFO: renamed from: p */
    public float f34598p;

    /* JADX INFO: renamed from: q */
    public float f34599q;

    /* JADX INFO: renamed from: r */
    public int[] f34600r;

    /* JADX INFO: renamed from: s */
    public double[] f34601s;

    /* JADX INFO: renamed from: t */
    public double[] f34602t;

    /* JADX INFO: renamed from: u */
    public String[] f34603u;

    /* JADX INFO: renamed from: v */
    public int[] f34604v;

    /* JADX INFO: renamed from: a */
    public Rect f34583a = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f34586d = false;

    /* JADX INFO: renamed from: f */
    public int f34588f = -1;

    /* JADX INFO: renamed from: g */
    public uza f34589g = new uza();

    /* JADX INFO: renamed from: h */
    public uza f34590h = new uza();

    /* JADX INFO: renamed from: i */
    public bza f34591i = new bza();

    /* JADX INFO: renamed from: j */
    public bza f34592j = new bza();

    /* JADX INFO: renamed from: m */
    public float f34595m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f34596n = 0.0f;

    /* JADX INFO: renamed from: o */
    public float f34597o = 1.0f;

    /* JADX INFO: renamed from: w */
    public int f34605w = 4;

    /* JADX INFO: renamed from: x */
    public float[] f34606x = new float[4];

    /* JADX INFO: renamed from: y */
    public ArrayList<uza> f34607y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    public float[] f34608z = new float[1];

    /* JADX INFO: renamed from: A */
    public ArrayList<dq8> f34570A = new ArrayList<>();

    /* JADX INFO: renamed from: eza$a */
    public class InterpolatorC5535a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gv4 f34609a;

        public InterpolatorC5535a(final gv4 val$easing) {
            this.f34609a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v) {
            return (float) this.f34609a.get(v);
        }
    }

    public eza(View view) {
        int i = dq8.f30366f;
        this.f34575F = i;
        this.f34576G = i;
        this.f34577H = null;
        this.f34578I = i;
        this.f34579J = Float.NaN;
        this.f34580K = null;
        this.f34581L = false;
        setView(view);
    }

    private float getAdjustedPosition(float position, float[] velocity) {
        float f = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f2 = this.f34597o;
            if (f2 != 1.0d) {
                float f3 = this.f34596n;
                if (position < f3) {
                    position = 0.0f;
                }
                if (position > f3 && position < 1.0d) {
                    position = Math.min((position - f3) * f2, 1.0f);
                }
            }
        }
        gv4 gv4Var = this.f34589g.f89582a;
        float f4 = Float.NaN;
        for (uza uzaVar : this.f34607y) {
            gv4 gv4Var2 = uzaVar.f89582a;
            if (gv4Var2 != null) {
                float f5 = uzaVar.f89584c;
                if (f5 < position) {
                    gv4Var = gv4Var2;
                    f = f5;
                } else if (Float.isNaN(f4)) {
                    f4 = uzaVar.f89584c;
                }
            }
        }
        if (gv4Var != null) {
            float f6 = (Float.isNaN(f4) ? 1.0f : f4) - f;
            double d = (position - f) / f6;
            position = (((float) gv4Var.get(d)) * f6) + f;
            if (velocity != null) {
                velocity[0] = (float) gv4Var.getDiff(d);
            }
        }
        return position;
    }

    private static Interpolator getInterpolator(Context context, int type, String interpolatorString, int id) {
        if (type == -2) {
            return AnimationUtils.loadInterpolator(context, id);
        }
        if (type == -1) {
            return new InterpolatorC5535a(gv4.getInterpolator(interpolatorString));
        }
        if (type == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new AccelerateInterpolator();
        }
        if (type == 2) {
            return new DecelerateInterpolator();
        }
        if (type == 4) {
            return new BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float getPreCycleDistance() {
        char c;
        float fHypot;
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f3 = i * f;
            double d3 = f3;
            gv4 gv4Var = this.f34589g.f89582a;
            float f4 = Float.NaN;
            float f5 = 0.0f;
            for (uza uzaVar : this.f34607y) {
                gv4 gv4Var2 = uzaVar.f89582a;
                if (gv4Var2 != null) {
                    float f6 = uzaVar.f89584c;
                    if (f6 < f3) {
                        gv4Var = gv4Var2;
                        f5 = f6;
                    } else if (Float.isNaN(f4)) {
                        f4 = uzaVar.f89584c;
                    }
                }
            }
            if (gv4Var != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) gv4Var.get((f3 - f5) / r17)) * (f4 - f5)) + f5;
            }
            this.f34593k[0].getPos(d3, this.f34601s);
            float f7 = f2;
            int i2 = i;
            this.f34589g.m23646d(d3, this.f34600r, this.f34601s, fArr, 0);
            if (i2 > 0) {
                c = 0;
                fHypot = (float) (((double) f7) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                fHypot = f7;
            }
            d = fArr[c];
            i = i2 + 1;
            f2 = fHypot;
            d2 = fArr[1];
        }
        return f2;
    }

    private void insertKey(uza point) {
        if (Collections.binarySearch(this.f34607y, point) == 0) {
            Log.e("MotionController", " KeyPath position \"" + point.f89585d + "\" outside of range");
        }
        this.f34607y.add((-r0) - 1, point);
    }

    private void readView(uza motionPaths) {
        motionPaths.m23657o((int) this.f34584b.getX(), (int) this.f34584b.getY(), this.f34584b.getWidth(), this.f34584b.getHeight());
    }

    /* JADX INFO: renamed from: a */
    public void m10379a(ArrayList<dq8> list) {
        this.f34570A.addAll(list);
    }

    public void addKey(dq8 key) {
        this.f34570A.add(key);
    }

    /* JADX INFO: renamed from: b */
    public void m10380b(float[] bounds, int pointCount) {
        float f = 1.0f / (pointCount - 1);
        HashMap<String, mbi> map = this.f34572C;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, mbi> map2 = this.f34572C;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, rai> map3 = this.f34573D;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, rai> map4 = this.f34573D;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i = 0; i < pointCount; i++) {
            float fMin = i * f;
            float f2 = this.f34597o;
            float f3 = 0.0f;
            if (f2 != 1.0f) {
                float f4 = this.f34596n;
                if (fMin < f4) {
                    fMin = 0.0f;
                }
                if (fMin > f4 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f4) * f2, 1.0f);
                }
            }
            double d = fMin;
            gv4 gv4Var = this.f34589g.f89582a;
            float f5 = Float.NaN;
            for (uza uzaVar : this.f34607y) {
                gv4 gv4Var2 = uzaVar.f89582a;
                if (gv4Var2 != null) {
                    float f6 = uzaVar.f89584c;
                    if (f6 < fMin) {
                        gv4Var = gv4Var2;
                        f3 = f6;
                    } else if (Float.isNaN(f5)) {
                        f5 = uzaVar.f89584c;
                    }
                }
            }
            if (gv4Var != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d = (((float) gv4Var.get((fMin - f3) / r12)) * (f5 - f3)) + f3;
            }
            this.f34593k[0].getPos(d, this.f34601s);
            db3 db3Var = this.f34594l;
            if (db3Var != null) {
                double[] dArr = this.f34601s;
                if (dArr.length > 0) {
                    db3Var.getPos(d, dArr);
                }
            }
            this.f34589g.m23645c(this.f34600r, this.f34601s, bounds, i * 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m10381c(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] timePoints = this.f34593k[0].getTimePoints();
        if (mode != null) {
            Iterator<uza> it = this.f34607y.iterator();
            int i = 0;
            while (it.hasNext()) {
                mode[i] = it.next().f89580Y;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.f34593k[0].getPos(d, this.f34601s);
            this.f34589g.m23645c(this.f34600r, this.f34601s, keyBounds, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m10382d(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] timePoints = this.f34593k[0].getTimePoints();
        if (mode != null) {
            Iterator<uza> it = this.f34607y.iterator();
            int i = 0;
            while (it.hasNext()) {
                mode[i] = it.next().f89580Y;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.f34593k[0].getPos(timePoints[i3], this.f34601s);
            this.f34589g.m23646d(timePoints[i3], this.f34600r, this.f34601s, keyFrames, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: e */
    public void m10383e(float[] points, int pointCount) {
        double d;
        float f = 1.0f;
        float f2 = 1.0f / (pointCount - 1);
        HashMap<String, mbi> map = this.f34572C;
        mbi mbiVar = map == null ? null : map.get("translationX");
        HashMap<String, mbi> map2 = this.f34572C;
        mbi mbiVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, rai> map3 = this.f34573D;
        rai raiVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, rai> map4 = this.f34573D;
        rai raiVar2 = map4 != null ? map4.get("translationY") : null;
        int i = 0;
        while (i < pointCount) {
            float fMin = i * f2;
            float f3 = this.f34597o;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.f34596n;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double d2 = f6;
            gv4 gv4Var = this.f34589g.f89582a;
            float f7 = Float.NaN;
            for (uza uzaVar : this.f34607y) {
                gv4 gv4Var2 = uzaVar.f89582a;
                double d3 = d2;
                if (gv4Var2 != null) {
                    float f8 = uzaVar.f89584c;
                    if (f8 < f6) {
                        f4 = f8;
                        gv4Var = gv4Var2;
                    } else if (Float.isNaN(f7)) {
                        f7 = uzaVar.f89584c;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (gv4Var != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) gv4Var.get((f6 - f4) / r16)) * (f7 - f4)) + f4;
            } else {
                d = d4;
            }
            this.f34593k[0].getPos(d, this.f34601s);
            db3 db3Var = this.f34594l;
            if (db3Var != null) {
                double[] dArr = this.f34601s;
                if (dArr.length > 0) {
                    db3Var.getPos(d, dArr);
                }
            }
            int i2 = i * 2;
            int i3 = i;
            this.f34589g.m23646d(d, this.f34600r, this.f34601s, points, i2);
            if (raiVar != null) {
                points[i2] = points[i2] + raiVar.get(f6);
            } else if (mbiVar != null) {
                points[i2] = points[i2] + mbiVar.get(f6);
            }
            if (raiVar2 != null) {
                int i4 = i2 + 1;
                points[i4] = points[i4] + raiVar2.get(f6);
            } else if (mbiVar2 != null) {
                int i5 = i2 + 1;
                points[i5] = points[i5] + mbiVar2.get(f6);
            }
            i = i3 + 1;
            f = 1.0f;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10384f(float p, float[] path, int offset) {
        this.f34593k[0].getPos(getAdjustedPosition(p, null), this.f34601s);
        this.f34589g.m23651i(this.f34600r, this.f34601s, path, offset);
    }

    /* JADX INFO: renamed from: g */
    public void m10385g(float[] path, int pointCount) {
        float f = 1.0f / (pointCount - 1);
        for (int i = 0; i < pointCount; i++) {
            this.f34593k[0].getPos(getAdjustedPosition(i * f, null), this.f34601s);
            this.f34589g.m23651i(this.f34600r, this.f34601s, path, i * 8);
        }
    }

    public int getAnimateRelativeTo() {
        return this.f34589g.f89574M;
    }

    public void getCenter(double p, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f34593k[0].getPos(p, dArr);
        this.f34593k[0].getSlope(p, dArr2);
        Arrays.fill(vel, 0.0f);
        this.f34589g.m23647e(p, this.f34600r, dArr, pos, dArr2, vel);
    }

    public float getCenterX() {
        return this.f34598p;
    }

    public float getCenterY() {
        return this.f34599q;
    }

    public int getDrawPath() {
        int iMax = this.f34589g.f89583b;
        Iterator<uza> it = this.f34607y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f89583b);
        }
        return Math.max(iMax, this.f34590h.f89583b);
    }

    public float getFinalHeight() {
        return this.f34590h.f89570C;
    }

    public float getFinalWidth() {
        return this.f34590h.f89588m;
    }

    public float getFinalX() {
        return this.f34590h.f89586e;
    }

    public float getFinalY() {
        return this.f34590h.f89587f;
    }

    public int getKeyFrameInfo(int type, int[] info) {
        float[] fArr = new float[2];
        int i = 0;
        int i2 = 0;
        for (dq8 dq8Var : this.f34570A) {
            int i3 = dq8Var.f30390d;
            if (i3 == type || type != -1) {
                info[i2] = 0;
                info[i2 + 1] = i3;
                int i4 = dq8Var.f30387a;
                info[i2 + 2] = i4;
                double d = i4 / 100.0f;
                this.f34593k[0].getPos(d, this.f34601s);
                this.f34589g.m23646d(d, this.f34600r, this.f34601s, fArr, 0);
                info[i2 + 3] = Float.floatToIntBits(fArr[0]);
                int i5 = i2 + 4;
                info[i5] = Float.floatToIntBits(fArr[1]);
                if (dq8Var instanceof ir8) {
                    ir8 ir8Var = (ir8) dq8Var;
                    info[i2 + 5] = ir8Var.f48067O;
                    info[i2 + 6] = Float.floatToIntBits(ir8Var.f48063K);
                    i5 = i2 + 7;
                    info[i5] = Float.floatToIntBits(ir8Var.f48064L);
                }
                int i6 = i5 + 1;
                info[i2] = i6 - i2;
                i++;
                i2 = i6;
            }
        }
        return i;
    }

    public int getKeyFramePositions(int[] type, float[] pos) {
        int i = 0;
        int i2 = 0;
        for (dq8 dq8Var : this.f34570A) {
            int i3 = dq8Var.f30387a;
            type[i] = (dq8Var.f30390d * 1000) + i3;
            double d = i3 / 100.0f;
            this.f34593k[0].getPos(d, this.f34601s);
            this.f34589g.m23646d(d, this.f34600r, this.f34601s, pos, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public float getStartHeight() {
        return this.f34589g.f89570C;
    }

    public float getStartWidth() {
        return this.f34589g.f89588m;
    }

    public float getStartX() {
        return this.f34589g.f89586e;
    }

    public float getStartY() {
        return this.f34589g.f89587f;
    }

    public int getTransformPivotTarget() {
        return this.f34576G;
    }

    public View getView() {
        return this.f34584b;
    }

    /* JADX INFO: renamed from: h */
    public void m10386h(boolean start) {
        if (!"button".equals(vj3.getName(this.f34584b)) || this.f34574E == null) {
            return;
        }
        int i = 0;
        while (true) {
            mr8[] mr8VarArr = this.f34574E;
            if (i >= mr8VarArr.length) {
                return;
            }
            mr8VarArr[i].conditionallyFire(start ? -100.0f : 100.0f, this.f34584b);
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m10387i(String attributeType, float[] points, int pointCount) {
        mbi mbiVar = this.f34572C.get(attributeType);
        if (mbiVar == null) {
            return -1;
        }
        for (int i = 0; i < points.length; i++) {
            points[i] = mbiVar.get(i / (points.length - 1));
        }
        return points.length;
    }

    /* JADX INFO: renamed from: j */
    public void m10388j(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(position, this.f34608z);
        db3[] db3VarArr = this.f34593k;
        int i = 0;
        if (db3VarArr == null) {
            uza uzaVar = this.f34590h;
            float f = uzaVar.f89586e;
            uza uzaVar2 = this.f34589g;
            float f2 = f - uzaVar2.f89586e;
            float f3 = uzaVar.f89587f - uzaVar2.f89587f;
            float f4 = (uzaVar.f89588m - uzaVar2.f89588m) + f2;
            float f5 = (uzaVar.f89570C - uzaVar2.f89570C) + f3;
            mAnchorDpDt[0] = (f2 * (1.0f - locationX)) + (f4 * locationX);
            mAnchorDpDt[1] = (f3 * (1.0f - locationY)) + (f5 * locationY);
            return;
        }
        double d = adjustedPosition;
        db3VarArr[0].getSlope(d, this.f34602t);
        this.f34593k[0].getPos(d, this.f34601s);
        float f6 = this.f34608z[0];
        while (true) {
            dArr = this.f34602t;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f6);
            i++;
        }
        db3 db3Var = this.f34594l;
        if (db3Var == null) {
            this.f34589g.m23658p(locationX, locationY, mAnchorDpDt, this.f34600r, dArr, this.f34601s);
            return;
        }
        double[] dArr2 = this.f34601s;
        if (dArr2.length > 0) {
            db3Var.getPos(d, dArr2);
            this.f34594l.getSlope(d, this.f34602t);
            this.f34589g.m23658p(locationX, locationY, mAnchorDpDt, this.f34600r, this.f34602t, this.f34601s);
        }
    }

    /* JADX INFO: renamed from: k */
    public uza m10389k(int i) {
        return this.f34607y.get(i);
    }

    /* JADX INFO: renamed from: l */
    public float m10390l(int type, float x, float y) {
        uza uzaVar = this.f34590h;
        float f = uzaVar.f89586e;
        uza uzaVar2 = this.f34589g;
        float f2 = uzaVar2.f89586e;
        float f3 = f - f2;
        float f4 = uzaVar.f89587f;
        float f5 = uzaVar2.f89587f;
        float f6 = f4 - f5;
        float f7 = f2 + (uzaVar2.f89588m / 2.0f);
        float f8 = f5 + (uzaVar2.f89570C / 2.0f);
        float fHypot = (float) Math.hypot(f3, f6);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f9 = x - f7;
        float f10 = y - f8;
        if (((float) Math.hypot(f9, f10)) == 0.0f) {
            return 0.0f;
        }
        float f11 = (f9 * f3) + (f10 * f6);
        if (type == 0) {
            return f11 / fHypot;
        }
        if (type == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f11 * f11));
        }
        if (type == 2) {
            return f9 / f3;
        }
        if (type == 3) {
            return f10 / f3;
        }
        if (type == 4) {
            return f9 / f6;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f10 / f6;
    }

    /* JADX INFO: renamed from: m */
    public double[] m10391m(double position) {
        this.f34593k[0].getPos(position, this.f34601s);
        db3 db3Var = this.f34594l;
        if (db3Var != null) {
            double[] dArr = this.f34601s;
            if (dArr.length > 0) {
                db3Var.getPos(position, dArr);
            }
        }
        return this.f34601s;
    }

    /* JADX INFO: renamed from: n */
    public jr8 m10392n(int layoutWidth, int layoutHeight, float x, float y) {
        RectF rectF = new RectF();
        uza uzaVar = this.f34589g;
        float f = uzaVar.f89586e;
        rectF.left = f;
        float f2 = uzaVar.f89587f;
        rectF.top = f2;
        rectF.right = f + uzaVar.f89588m;
        rectF.bottom = f2 + uzaVar.f89570C;
        RectF rectF2 = new RectF();
        uza uzaVar2 = this.f34590h;
        float f3 = uzaVar2.f89586e;
        rectF2.left = f3;
        float f4 = uzaVar2.f89587f;
        rectF2.top = f4;
        rectF2.right = f3 + uzaVar2.f89588m;
        rectF2.bottom = f4 + uzaVar2.f89570C;
        for (dq8 dq8Var : this.f34570A) {
            if (dq8Var instanceof jr8) {
                jr8 jr8Var = (jr8) dq8Var;
                if (jr8Var.intersects(layoutWidth, layoutHeight, rectF, rectF2, x, y)) {
                    return jr8Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m10393o(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float adjustedPosition = getAdjustedPosition(position, this.f34608z);
        HashMap<String, mbi> map = this.f34572C;
        mbi mbiVar = map == null ? null : map.get("translationX");
        HashMap<String, mbi> map2 = this.f34572C;
        mbi mbiVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, mbi> map3 = this.f34572C;
        mbi mbiVar3 = map3 == null ? null : map3.get(dq8.f30369i);
        HashMap<String, mbi> map4 = this.f34572C;
        mbi mbiVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, mbi> map5 = this.f34572C;
        mbi mbiVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, rai> map6 = this.f34573D;
        rai raiVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, rai> map7 = this.f34573D;
        rai raiVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, rai> map8 = this.f34573D;
        rai raiVar3 = map8 == null ? null : map8.get(dq8.f30369i);
        HashMap<String, rai> map9 = this.f34573D;
        rai raiVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, rai> map10 = this.f34573D;
        rai raiVar5 = map10 != null ? map10.get("scaleY") : null;
        k4i k4iVar = new k4i();
        k4iVar.clear();
        k4iVar.setRotationVelocity(mbiVar3, adjustedPosition);
        k4iVar.setTranslationVelocity(mbiVar, mbiVar2, adjustedPosition);
        k4iVar.setScaleVelocity(mbiVar4, mbiVar5, adjustedPosition);
        k4iVar.setRotationVelocity(raiVar3, adjustedPosition);
        k4iVar.setTranslationVelocity(raiVar, raiVar2, adjustedPosition);
        k4iVar.setScaleVelocity(raiVar4, raiVar5, adjustedPosition);
        db3 db3Var = this.f34594l;
        if (db3Var != null) {
            double[] dArr = this.f34601s;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                db3Var.getPos(d, dArr);
                this.f34594l.getSlope(d, this.f34602t);
                this.f34589g.m23658p(locationX, locationY, mAnchorDpDt, this.f34600r, this.f34602t, this.f34601s);
            }
            k4iVar.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i = 0;
        if (this.f34593k == null) {
            uza uzaVar = this.f34590h;
            float f = uzaVar.f89586e;
            uza uzaVar2 = this.f34589g;
            float f2 = f - uzaVar2.f89586e;
            rai raiVar6 = raiVar5;
            float f3 = uzaVar.f89587f - uzaVar2.f89587f;
            rai raiVar7 = raiVar4;
            float f4 = (uzaVar.f89588m - uzaVar2.f89588m) + f2;
            float f5 = (uzaVar.f89570C - uzaVar2.f89570C) + f3;
            mAnchorDpDt[0] = (f2 * (1.0f - locationX)) + (f4 * locationX);
            mAnchorDpDt[1] = (f3 * (1.0f - locationY)) + (f5 * locationY);
            k4iVar.clear();
            k4iVar.setRotationVelocity(mbiVar3, adjustedPosition);
            k4iVar.setTranslationVelocity(mbiVar, mbiVar2, adjustedPosition);
            k4iVar.setScaleVelocity(mbiVar4, mbiVar5, adjustedPosition);
            k4iVar.setRotationVelocity(raiVar3, adjustedPosition);
            k4iVar.setTranslationVelocity(raiVar, raiVar2, adjustedPosition);
            k4iVar.setScaleVelocity(raiVar7, raiVar6, adjustedPosition);
            k4iVar.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.f34608z);
        this.f34593k[0].getSlope(adjustedPosition2, this.f34602t);
        this.f34593k[0].getPos(adjustedPosition2, this.f34601s);
        float f6 = this.f34608z[0];
        while (true) {
            double[] dArr2 = this.f34602t;
            if (i >= dArr2.length) {
                this.f34589g.m23658p(locationX, locationY, mAnchorDpDt, this.f34600r, dArr2, this.f34601s);
                k4iVar.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
                return;
            } else {
                dArr2[i] = dArr2[i] * ((double) f6);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m10394p(View child, float global_position, long time, gq8 keyCache) {
        ubi.C13468d c13468d;
        boolean pathRotate;
        int i;
        double d;
        float adjustedPosition = getAdjustedPosition(global_position, null);
        int i2 = this.f34578I;
        if (i2 != dq8.f30366f) {
            float f = 1.0f / i2;
            float fFloor = ((float) Math.floor(adjustedPosition / f)) * f;
            float f2 = (adjustedPosition % f) / f;
            if (!Float.isNaN(this.f34579J)) {
                f2 = (f2 + this.f34579J) % 1.0f;
            }
            Interpolator interpolator = this.f34580K;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f2) : ((double) f2) > 0.5d ? 1.0f : 0.0f) * f) + fFloor;
        }
        float f3 = adjustedPosition;
        HashMap<String, mbi> map = this.f34572C;
        if (map != null) {
            Iterator<mbi> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(child, f3);
            }
        }
        HashMap<String, ubi> map2 = this.f34571B;
        if (map2 != null) {
            ubi.C13468d c13468d2 = null;
            boolean property = false;
            for (ubi ubiVar : map2.values()) {
                if (ubiVar instanceof ubi.C13468d) {
                    c13468d2 = (ubi.C13468d) ubiVar;
                } else {
                    property |= ubiVar.setProperty(child, f3, time, keyCache);
                }
            }
            pathRotate = property;
            c13468d = c13468d2;
        } else {
            c13468d = null;
            pathRotate = false;
        }
        db3[] db3VarArr = this.f34593k;
        if (db3VarArr != null) {
            double d2 = f3;
            db3VarArr[0].getPos(d2, this.f34601s);
            this.f34593k[0].getSlope(d2, this.f34602t);
            db3 db3Var = this.f34594l;
            if (db3Var != null) {
                double[] dArr = this.f34601s;
                if (dArr.length > 0) {
                    db3Var.getPos(d2, dArr);
                    this.f34594l.getSlope(d2, this.f34602t);
                }
            }
            if (this.f34581L) {
                d = d2;
            } else {
                d = d2;
                this.f34589g.m23659q(f3, child, this.f34600r, this.f34601s, this.f34602t, null, this.f34586d);
                this.f34586d = false;
            }
            if (this.f34576G != dq8.f30366f) {
                if (this.f34577H == null) {
                    this.f34577H = ((View) child.getParent()).findViewById(this.f34576G);
                }
                if (this.f34577H != null) {
                    float top = (r1.getTop() + this.f34577H.getBottom()) / 2.0f;
                    float left = (this.f34577H.getLeft() + this.f34577H.getRight()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        child.setPivotX(left - child.getLeft());
                        child.setPivotY(top - child.getTop());
                    }
                }
            }
            HashMap<String, mbi> map3 = this.f34572C;
            if (map3 != null) {
                for (mbi mbiVar : map3.values()) {
                    if (mbiVar instanceof mbi.C9266d) {
                        double[] dArr2 = this.f34602t;
                        if (dArr2.length > 1) {
                            ((mbi.C9266d) mbiVar).setPathRotate(child, f3, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (c13468d != null) {
                double[] dArr3 = this.f34602t;
                i = 1;
                pathRotate |= c13468d.setPathRotate(child, keyCache, f3, time, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                db3[] db3VarArr2 = this.f34593k;
                if (i3 >= db3VarArr2.length) {
                    break;
                }
                db3VarArr2[i3].getPos(d, this.f34606x);
                md3.setInterpolatedValue(this.f34589g.f89579X.get(this.f34603u[i3 - 1]), child, this.f34606x);
                i3++;
            }
            bza bzaVar = this.f34591i;
            if (bzaVar.f15259b == 0) {
                if (f3 <= 0.0f) {
                    child.setVisibility(bzaVar.f15261c);
                } else if (f3 >= 1.0f) {
                    child.setVisibility(this.f34592j.f15261c);
                } else if (this.f34592j.f15261c != bzaVar.f15261c) {
                    child.setVisibility(0);
                }
            }
            if (this.f34574E != null) {
                int i4 = 0;
                while (true) {
                    mr8[] mr8VarArr = this.f34574E;
                    if (i4 >= mr8VarArr.length) {
                        break;
                    }
                    mr8VarArr[i4].conditionallyFire(f3, child);
                    i4++;
                }
            }
        } else {
            i = 1;
            uza uzaVar = this.f34589g;
            float f4 = uzaVar.f89586e;
            uza uzaVar2 = this.f34590h;
            float f5 = f4 + ((uzaVar2.f89586e - f4) * f3);
            float f6 = uzaVar.f89587f;
            float f7 = f6 + ((uzaVar2.f89587f - f6) * f3);
            float f8 = uzaVar.f89588m;
            float f9 = uzaVar2.f89588m;
            float f10 = uzaVar.f89570C;
            float f11 = uzaVar2.f89570C;
            float f12 = f5 + 0.5f;
            int i5 = (int) f12;
            float f13 = f7 + 0.5f;
            int i6 = (int) f13;
            int i7 = (int) (f12 + ((f9 - f8) * f3) + f8);
            int i8 = (int) (f13 + ((f11 - f10) * f3) + f10);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f9 != f8 || f11 != f10 || this.f34586d) {
                child.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.f34586d = false;
            }
            child.layout(i5, i6, i7, i8);
        }
        HashMap<String, rai> map4 = this.f34573D;
        if (map4 != null) {
            for (rai raiVar : map4.values()) {
                if (raiVar instanceof rai.C11977d) {
                    double[] dArr4 = this.f34602t;
                    ((rai.C11977d) raiVar).setPathRotate(child, f3, dArr4[0], dArr4[i]);
                } else {
                    raiVar.setProperty(child, f3);
                }
            }
        }
        return pathRotate;
    }

    /* JADX INFO: renamed from: q */
    public String m10395q() {
        return this.f34584b.getContext().getResources().getResourceEntryName(this.f34584b.getId());
    }

    /* JADX INFO: renamed from: r */
    public void m10396r(View view, jr8 key, float x, float y, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        uza uzaVar = this.f34589g;
        float f = uzaVar.f89586e;
        rectF.left = f;
        float f2 = uzaVar.f89587f;
        rectF.top = f2;
        rectF.right = f + uzaVar.f89588m;
        rectF.bottom = f2 + uzaVar.f89570C;
        RectF rectF2 = new RectF();
        uza uzaVar2 = this.f34590h;
        float f3 = uzaVar2.f89586e;
        rectF2.left = f3;
        float f4 = uzaVar2.f89587f;
        rectF2.top = f4;
        rectF2.right = f3 + uzaVar2.f89588m;
        rectF2.bottom = f4 + uzaVar2.f89570C;
        key.positionAttributes(view, rectF, rectF2, x, y, attribute, value);
    }

    public void remeasure() {
        this.f34586d = true;
    }

    /* JADX INFO: renamed from: s */
    public void m10397s(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((i + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 2) {
            int i2 = rect.left + rect.right;
            out.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            out.top = (i2 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 3) {
            int i3 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i3 / 2);
            out.top = preWidth - ((i3 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation != 4) {
            return;
        }
        int i4 = rect.left + rect.right;
        out.left = preHeight - (((rect.bottom + rect.top) + rect.width()) / 2);
        out.top = (i4 - rect.height()) / 2;
        out.right = out.left + rect.width();
        out.bottom = out.top + rect.height();
    }

    public void setDrawPath(int debugMode) {
        this.f34589g.f89583b = debugMode;
    }

    public void setPathMotionArc(int arc) {
        this.f34575F = arc;
    }

    public void setStartState(nbi rect, View v, int rotation, int preWidth, int preHeight) {
        uza uzaVar = this.f34589g;
        uzaVar.f89584c = 0.0f;
        uzaVar.f89585d = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i = rect.f63938b + rect.f63940d;
            rect2.left = ((rect.f63939c + rect.f63941e) - rect.width()) / 2;
            rect2.top = preWidth - ((i + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (rotation == 2) {
            int i2 = rect.f63938b + rect.f63940d;
            rect2.left = preHeight - (((rect.f63939c + rect.f63941e) + rect.width()) / 2);
            rect2.top = (i2 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
        this.f34589g.m23657o(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.f34591i.setState(rect2, v, rotation, rect.f63937a);
    }

    public void setTransformPivotTarget(int transformPivotTarget) {
        this.f34576G = transformPivotTarget;
        this.f34577H = null;
    }

    public void setView(View view) {
        this.f34584b = view;
        this.f34585c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0894b) {
            this.f34587e = ((ConstraintLayout.C0894b) layoutParams).getConstraintTag();
        }
    }

    public void setup(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        String[] strArr;
        double[][] dArr;
        C0898a c0898a;
        ubi ubiVarMakeSpline;
        C0898a c0898a2;
        Integer num;
        mbi mbiVarMakeSpline;
        C0898a c0898a3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i = this.f34575F;
        if (i != dq8.f30366f) {
            this.f34589g.f89573L = i;
        }
        this.f34591i.m3497a(this.f34592j, hashSet2);
        ArrayList<dq8> arrayList2 = this.f34570A;
        if (arrayList2 != null) {
            arrayList = null;
            for (dq8 dq8Var : arrayList2) {
                if (dq8Var instanceof ir8) {
                    ir8 ir8Var = (ir8) dq8Var;
                    insertKey(new uza(parentWidth, parentHeight, ir8Var, this.f34589g, this.f34590h));
                    int i2 = ir8Var.f51604D;
                    if (i2 != dq8.f30366f) {
                        this.f34588f = i2;
                    }
                } else if (dq8Var instanceof iq8) {
                    dq8Var.getAttributeNames(hashSet3);
                } else if (dq8Var instanceof kr8) {
                    dq8Var.getAttributeNames(hashSet);
                } else if (dq8Var instanceof mr8) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((mr8) dq8Var);
                } else {
                    dq8Var.setInterpolation(map);
                    dq8Var.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f34574E = (mr8[]) arrayList.toArray(new mr8[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f34572C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (dq8 dq8Var2 : this.f34570A) {
                        HashMap<String, C0898a> map2 = dq8Var2.f30391e;
                        if (map2 != null && (c0898a3 = map2.get(str2)) != null) {
                            sparseArray.append(dq8Var2.f30387a, c0898a3);
                        }
                    }
                    mbiVarMakeSpline = mbi.makeCustomSpline(str, (SparseArray<C0898a>) sparseArray);
                } else {
                    mbiVarMakeSpline = mbi.makeSpline(str);
                }
                if (mbiVarMakeSpline != null) {
                    mbiVarMakeSpline.setType(str);
                    this.f34572C.put(str, mbiVarMakeSpline);
                }
            }
            ArrayList<dq8> arrayList3 = this.f34570A;
            if (arrayList3 != null) {
                for (dq8 dq8Var3 : arrayList3) {
                    if (dq8Var3 instanceof fq8) {
                        dq8Var3.addValues(this.f34572C);
                    }
                }
            }
            this.f34591i.addValues(this.f34572C, 0);
            this.f34592j.addValues(this.f34572C, 100);
            for (String str3 : this.f34572C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                mbi mbiVar = this.f34572C.get(str3);
                if (mbiVar != null) {
                    mbiVar.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f34571B == null) {
                this.f34571B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f34571B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (dq8 dq8Var4 : this.f34570A) {
                            HashMap<String, C0898a> map3 = dq8Var4.f30391e;
                            if (map3 != null && (c0898a2 = map3.get(str5)) != null) {
                                sparseArray2.append(dq8Var4.f30387a, c0898a2);
                            }
                        }
                        ubiVarMakeSpline = ubi.makeCustomSpline(str4, sparseArray2);
                    } else {
                        ubiVarMakeSpline = ubi.makeSpline(str4, currentTime);
                    }
                    if (ubiVarMakeSpline != null) {
                        ubiVarMakeSpline.setType(str4);
                        this.f34571B.put(str4, ubiVarMakeSpline);
                    }
                }
            }
            ArrayList<dq8> arrayList4 = this.f34570A;
            if (arrayList4 != null) {
                for (dq8 dq8Var5 : arrayList4) {
                    if (dq8Var5 instanceof kr8) {
                        ((kr8) dq8Var5).addTimeValues(this.f34571B);
                    }
                }
            }
            for (String str6 : this.f34571B.keySet()) {
                this.f34571B.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f34607y.size();
        int i3 = size + 2;
        uza[] uzaVarArr = new uza[i3];
        uzaVarArr[0] = this.f34589g;
        uzaVarArr[size + 1] = this.f34590h;
        if (this.f34607y.size() > 0 && this.f34588f == -1) {
            this.f34588f = 0;
        }
        Iterator<uza> it = this.f34607y.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            uzaVarArr[i4] = it.next();
            i4++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f34590h.f89579X.keySet()) {
            if (this.f34589g.f89579X.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f34603u = strArr2;
        this.f34604v = new int[strArr2.length];
        int i5 = 0;
        while (true) {
            strArr = this.f34603u;
            if (i5 >= strArr.length) {
                break;
            }
            String str8 = strArr[i5];
            this.f34604v[i5] = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= i3) {
                    break;
                }
                if (uzaVarArr[i6].f89579X.containsKey(str8) && (c0898a = uzaVarArr[i6].f89579X.get(str8)) != null) {
                    int[] iArr = this.f34604v;
                    iArr[i5] = iArr[i5] + c0898a.numberOfInterpolatedValues();
                    break;
                }
                i6++;
            }
            i5++;
        }
        boolean z = uzaVarArr[0].f89573L != dq8.f30366f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 1; i7 < i3; i7++) {
            uzaVarArr[i7].m23643a(uzaVarArr[i7 - 1], zArr, this.f34603u, z);
        }
        int i8 = 0;
        for (int i9 = 1; i9 < length; i9++) {
            if (zArr[i9]) {
                i8++;
            }
        }
        this.f34600r = new int[i8];
        int i10 = 2;
        int iMax = Math.max(2, i8);
        this.f34601s = new double[iMax];
        this.f34602t = new double[iMax];
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                this.f34600r[i11] = i12;
                i11++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, this.f34600r.length);
        double[] dArr3 = new double[i3];
        for (int i13 = 0; i13 < i3; i13++) {
            uzaVarArr[i13].m23644b(dArr2[i13], this.f34600r);
            dArr3[i13] = uzaVarArr[i13].f89584c;
        }
        int i14 = 0;
        while (true) {
            int[] iArr2 = this.f34600r;
            if (i14 >= iArr2.length) {
                break;
            }
            if (iArr2[i14] < uza.f89569l2.length) {
                String str9 = uza.f89569l2[this.f34600r[i14]] + " [";
                for (int i15 = 0; i15 < i3; i15++) {
                    str9 = str9 + dArr2[i15][i14];
                }
            }
            i14++;
        }
        this.f34593k = new db3[this.f34603u.length + 1];
        int i16 = 0;
        while (true) {
            String[] strArr3 = this.f34603u;
            if (i16 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i16];
            int i17 = 0;
            int i18 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i17 < i3) {
                if (uzaVarArr[i17].m23652j(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i3];
                        int[] iArr3 = new int[i10];
                        iArr3[c] = uzaVarArr[i17].m23650h(str10);
                        iArr3[0] = i3;
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    uza uzaVar = uzaVarArr[i17];
                    dArr = dArr2;
                    dArr4[i18] = uzaVar.f89584c;
                    uzaVar.m23649g(str10, dArr5[i18], 0);
                    i18++;
                } else {
                    dArr = dArr2;
                }
                i17++;
                dArr2 = dArr;
                i10 = 2;
                c = 1;
            }
            i16++;
            this.f34593k[i16] = db3.get(this.f34588f, Arrays.copyOf(dArr4, i18), (double[][]) Arrays.copyOf(dArr5, i18));
            dArr2 = dArr2;
            i10 = 2;
            c = 1;
        }
        this.f34593k[0] = db3.get(this.f34588f, dArr3, dArr2);
        if (uzaVarArr[0].f89573L != dq8.f30366f) {
            int[] iArr4 = new int[i3];
            double[] dArr6 = new double[i3];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, 2);
            for (int i19 = 0; i19 < i3; i19++) {
                iArr4[i19] = uzaVarArr[i19].f89573L;
                dArr6[i19] = r9.f89584c;
                double[] dArr8 = dArr7[i19];
                dArr8[0] = r9.f89586e;
                dArr8[1] = r9.f89587f;
            }
            this.f34594l = db3.getArc(iArr4, dArr6, dArr7);
        }
        this.f34573D = new HashMap<>();
        if (this.f34570A != null) {
            float preCycleDistance = Float.NaN;
            for (String str11 : hashSet3) {
                rai raiVarMakeSpline = rai.makeSpline(str11);
                if (raiVarMakeSpline != null) {
                    if (raiVarMakeSpline.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    raiVarMakeSpline.setType(str11);
                    this.f34573D.put(str11, raiVarMakeSpline);
                }
            }
            for (dq8 dq8Var6 : this.f34570A) {
                if (dq8Var6 instanceof iq8) {
                    ((iq8) dq8Var6).addCycleValues(this.f34573D);
                }
            }
            Iterator<rai> it2 = this.f34573D.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public void setupRelative(eza motionController) {
        this.f34589g.setupRelative(motionController, motionController.f34589g);
        this.f34590h.setupRelative(motionController, motionController.f34590h);
    }

    /* JADX INFO: renamed from: t */
    public void m10398t(View v) {
        uza uzaVar = this.f34589g;
        uzaVar.f89584c = 0.0f;
        uzaVar.f89585d = 0.0f;
        this.f34581L = true;
        uzaVar.m23657o(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.f34590h.m23657o(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.f34591i.setState(v);
        this.f34592j.setState(v);
    }

    public String toString() {
        return " start: x: " + this.f34589g.f89586e + " y: " + this.f34589g.f89587f + " end: x: " + this.f34590h.f89586e + " y: " + this.f34590h.f89587f;
    }

    /* JADX INFO: renamed from: u */
    public void m10399u(Rect cw, C0901d constraintSet, int parentWidth, int parentHeight) {
        int i = constraintSet.f7058d;
        if (i != 0) {
            m10397s(cw, this.f34583a, i, parentWidth, parentHeight);
            cw = this.f34583a;
        }
        uza uzaVar = this.f34590h;
        uzaVar.f89584c = 1.0f;
        uzaVar.f89585d = 1.0f;
        readView(uzaVar);
        this.f34590h.m23657o(cw.left, cw.top, cw.width(), cw.height());
        this.f34590h.applyParameters(constraintSet.getParameters(this.f34585c));
        this.f34592j.setState(cw, constraintSet, i, this.f34585c);
    }

    /* JADX INFO: renamed from: v */
    public void m10400v(View v) {
        uza uzaVar = this.f34589g;
        uzaVar.f89584c = 0.0f;
        uzaVar.f89585d = 0.0f;
        uzaVar.m23657o(v.getX(), v.getY(), v.getWidth(), v.getHeight());
        this.f34591i.setState(v);
    }

    /* JADX INFO: renamed from: w */
    public void m10401w(Rect cw, C0901d constraintSet, int parentWidth, int parentHeight) {
        int i = constraintSet.f7058d;
        if (i != 0) {
            m10397s(cw, this.f34583a, i, parentWidth, parentHeight);
        }
        uza uzaVar = this.f34589g;
        uzaVar.f89584c = 0.0f;
        uzaVar.f89585d = 0.0f;
        readView(uzaVar);
        this.f34589g.m23657o(cw.left, cw.top, cw.width(), cw.height());
        C0901d.a parameters = constraintSet.getParameters(this.f34585c);
        this.f34589g.applyParameters(parameters);
        this.f34595m = parameters.f7065d.f7246g;
        this.f34591i.setState(cw, constraintSet, i, this.f34585c);
        this.f34576G = parameters.f7067f.f7280i;
        C0901d.c cVar = parameters.f7065d;
        this.f34578I = cVar.f7250k;
        this.f34579J = cVar.f7249j;
        Context context = this.f34584b.getContext();
        C0901d.c cVar2 = parameters.f7065d;
        this.f34580K = getInterpolator(context, cVar2.f7252m, cVar2.f7251l, cVar2.f7253n);
    }
}
