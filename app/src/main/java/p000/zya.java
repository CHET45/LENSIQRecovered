package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.jq8;
import p000.uq8;

/* JADX INFO: loaded from: classes.dex */
public class zya implements ymh {

    /* JADX INFO: renamed from: T */
    public static final int f106436T = 0;

    /* JADX INFO: renamed from: U */
    public static final int f106437U = 1;

    /* JADX INFO: renamed from: V */
    public static final int f106438V = 2;

    /* JADX INFO: renamed from: W */
    public static final int f106439W = 3;

    /* JADX INFO: renamed from: X */
    public static final int f106440X = 4;

    /* JADX INFO: renamed from: Y */
    public static final int f106441Y = 5;

    /* JADX INFO: renamed from: Z */
    public static final int f106442Z = 0;

    /* JADX INFO: renamed from: a0 */
    public static final int f106443a0 = 1;

    /* JADX INFO: renamed from: b0 */
    public static final int f106444b0 = 2;

    /* JADX INFO: renamed from: c0 */
    public static final int f106445c0 = 3;

    /* JADX INFO: renamed from: d0 */
    public static final int f106446d0 = 4;

    /* JADX INFO: renamed from: e0 */
    public static final int f106447e0 = 5;

    /* JADX INFO: renamed from: f0 */
    public static final int f106448f0 = 6;

    /* JADX INFO: renamed from: g0 */
    public static final int f106449g0 = 1;

    /* JADX INFO: renamed from: h0 */
    public static final int f106450h0 = 2;

    /* JADX INFO: renamed from: i0 */
    public static final String f106451i0 = "MotionController";

    /* JADX INFO: renamed from: j0 */
    public static final boolean f106452j0 = false;

    /* JADX INFO: renamed from: k0 */
    public static final boolean f106453k0 = false;

    /* JADX INFO: renamed from: l0 */
    public static final int f106454l0 = 0;

    /* JADX INFO: renamed from: m0 */
    public static final int f106455m0 = 1;

    /* JADX INFO: renamed from: n0 */
    public static final int f106456n0 = 2;

    /* JADX INFO: renamed from: o0 */
    public static final int f106457o0 = 3;

    /* JADX INFO: renamed from: p0 */
    public static final int f106458p0 = 4;

    /* JADX INFO: renamed from: q0 */
    public static final int f106459q0 = 5;

    /* JADX INFO: renamed from: r0 */
    public static final int f106460r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public static final int f106461s0 = -2;

    /* JADX INFO: renamed from: t0 */
    public static final int f106462t0 = -3;

    /* JADX INFO: renamed from: A */
    public String[] f106463A;

    /* JADX INFO: renamed from: B */
    public int[] f106464B;

    /* JADX INFO: renamed from: H */
    public HashMap<String, zzg> f106470H;

    /* JADX INFO: renamed from: I */
    public HashMap<String, wyf> f106471I;

    /* JADX INFO: renamed from: J */
    public HashMap<String, jq8> f106472J;

    /* JADX INFO: renamed from: K */
    public tza[] f106473K;

    /* JADX INFO: renamed from: S */
    public String[] f106481S;

    /* JADX INFO: renamed from: i */
    public d0b f106483i;

    /* JADX INFO: renamed from: j */
    public int f106484j;

    /* JADX INFO: renamed from: k */
    public String f106485k;

    /* JADX INFO: renamed from: q */
    public db3[] f106491q;

    /* JADX INFO: renamed from: r */
    public db3 f106492r;

    /* JADX INFO: renamed from: v */
    public float f106496v;

    /* JADX INFO: renamed from: w */
    public float f106497w;

    /* JADX INFO: renamed from: x */
    public int[] f106498x;

    /* JADX INFO: renamed from: y */
    public double[] f106499y;

    /* JADX INFO: renamed from: z */
    public double[] f106500z;

    /* JADX INFO: renamed from: h */
    public sud f106482h = new sud();

    /* JADX INFO: renamed from: l */
    public int f106486l = -1;

    /* JADX INFO: renamed from: m */
    public vza f106487m = new vza();

    /* JADX INFO: renamed from: n */
    public vza f106488n = new vza();

    /* JADX INFO: renamed from: o */
    public cza f106489o = new cza();

    /* JADX INFO: renamed from: p */
    public cza f106490p = new cza();

    /* JADX INFO: renamed from: s */
    public float f106493s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f106494t = 0.0f;

    /* JADX INFO: renamed from: u */
    public float f106495u = 1.0f;

    /* JADX INFO: renamed from: C */
    public int f106465C = 4;

    /* JADX INFO: renamed from: D */
    public float[] f106466D = new float[4];

    /* JADX INFO: renamed from: E */
    public ArrayList<vza> f106467E = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public float[] f106468F = new float[1];

    /* JADX INFO: renamed from: G */
    public ArrayList<oza> f106469G = new ArrayList<>();

    /* JADX INFO: renamed from: L */
    public int f106474L = -1;

    /* JADX INFO: renamed from: M */
    public int f106475M = -1;

    /* JADX INFO: renamed from: N */
    public d0b f106476N = null;

    /* JADX INFO: renamed from: O */
    public int f106477O = -1;

    /* JADX INFO: renamed from: P */
    public float f106478P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public sc4 f106479Q = null;

    /* JADX INFO: renamed from: R */
    public boolean f106480R = false;

    /* JADX INFO: renamed from: zya$a */
    public static class C16315a implements sc4 {

        /* JADX INFO: renamed from: a */
        public float f106501a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gv4 f106502b;

        public C16315a(gv4 gv4Var) {
            this.f106502b = gv4Var;
        }

        @Override // p000.sc4
        public float getInterpolation(float f) {
            this.f106501a = f;
            return (float) this.f106502b.get(f);
        }

        @Override // p000.sc4
        public float getVelocity() {
            return (float) this.f106502b.getDiff(this.f106501a);
        }
    }

    public zya(d0b d0bVar) {
        setView(d0bVar);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f106495u;
            if (f3 != 1.0d) {
                float f4 = this.f106494t;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        gv4 gv4Var = this.f106487m.f92941a;
        float f5 = Float.NaN;
        for (vza vzaVar : this.f106467E) {
            gv4 gv4Var2 = vzaVar.f92941a;
            if (gv4Var2 != null) {
                float f6 = vzaVar.f92943c;
                if (f6 < f) {
                    gv4Var = gv4Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = vzaVar.f92943c;
                }
            }
        }
        if (gv4Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) gv4Var.get(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) gv4Var.getDiff(d);
            }
        }
        return f;
    }

    private static sc4 getInterpolator(int i, String str, int i2) {
        if (i != -1) {
            return null;
        }
        return new C16315a(gv4.getInterpolator(str));
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
            gv4 gv4Var = this.f106487m.f92941a;
            float f4 = Float.NaN;
            float f5 = 0.0f;
            for (vza vzaVar : this.f106467E) {
                gv4 gv4Var2 = vzaVar.f92941a;
                if (gv4Var2 != null) {
                    float f6 = vzaVar.f92943c;
                    if (f6 < f3) {
                        gv4Var = gv4Var2;
                        f5 = f6;
                    } else if (Float.isNaN(f4)) {
                        f4 = vzaVar.f92943c;
                    }
                }
            }
            if (gv4Var != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) gv4Var.get((f3 - f5) / r17)) * (f4 - f5)) + f5;
            }
            this.f106491q[0].getPos(d3, this.f106499y);
            float f7 = f2;
            int i2 = i;
            this.f106487m.m24268d(d3, this.f106498x, this.f106499y, fArr, 0);
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

    private void insertKey(vza vzaVar) {
        vza vzaVar2 = null;
        for (vza vzaVar3 : this.f106467E) {
            if (vzaVar.f92944d == vzaVar3.f92944d) {
                vzaVar2 = vzaVar3;
            }
        }
        if (vzaVar2 != null) {
            this.f106467E.remove(vzaVar2);
        }
        if (Collections.binarySearch(this.f106467E, vzaVar) == 0) {
            d1i.loge("MotionController", " KeyPath position \"" + vzaVar.f92944d + "\" outside of range");
        }
        this.f106467E.add((-r0) - 1, vzaVar);
    }

    private void readView(vza vzaVar) {
        vzaVar.m24279o(this.f106483i.getX(), this.f106483i.getY(), this.f106483i.getWidth(), this.f106483i.getHeight());
    }

    /* JADX INFO: renamed from: a */
    public void m27135a(ArrayList<oza> arrayList) {
        this.f106469G.addAll(arrayList);
    }

    public void addKey(oza ozaVar) {
        this.f106469G.add(ozaVar);
    }

    /* JADX INFO: renamed from: b */
    public void m27136b(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        HashMap<String, wyf> map = this.f106471I;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, wyf> map2 = this.f106471I;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, jq8> map3 = this.f106472J;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, jq8> map4 = this.f106472J;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float fMin = i2 * f;
            float f2 = this.f106495u;
            float f3 = 0.0f;
            if (f2 != 1.0f) {
                float f4 = this.f106494t;
                if (fMin < f4) {
                    fMin = 0.0f;
                }
                if (fMin > f4 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f4) * f2, 1.0f);
                }
            }
            double d = fMin;
            gv4 gv4Var = this.f106487m.f92941a;
            float f5 = Float.NaN;
            for (vza vzaVar : this.f106467E) {
                gv4 gv4Var2 = vzaVar.f92941a;
                if (gv4Var2 != null) {
                    float f6 = vzaVar.f92943c;
                    if (f6 < fMin) {
                        gv4Var = gv4Var2;
                        f3 = f6;
                    } else if (Float.isNaN(f5)) {
                        f5 = vzaVar.f92943c;
                    }
                }
            }
            if (gv4Var != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d = (((float) gv4Var.get((fMin - f3) / r12)) * (f5 - f3)) + f3;
            }
            this.f106491q[0].getPos(d, this.f106499y);
            db3 db3Var = this.f106492r;
            if (db3Var != null) {
                double[] dArr = this.f106499y;
                if (dArr.length > 0) {
                    db3Var.getPos(d, dArr);
                }
            }
            this.f106487m.m24267c(this.f106498x, this.f106499y, fArr, i2 * 2);
        }
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f106491q[0].getTimePoints();
        if (iArr != null) {
            Iterator<vza> it = this.f106467E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f92939Y;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator<vza> it2 = this.f106467E.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().f92944d * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < timePoints.length; i4++) {
            this.f106491q[0].getPos(timePoints[i4], this.f106499y);
            this.f106487m.m24268d(timePoints[i4], this.f106498x, this.f106499y, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void buildPath(float[] fArr, int i) {
        double d;
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        HashMap<String, wyf> map = this.f106471I;
        wyf wyfVar = map == null ? null : map.get("translationX");
        HashMap<String, wyf> map2 = this.f106471I;
        wyf wyfVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, jq8> map3 = this.f106472J;
        jq8 jq8Var = map3 == null ? null : map3.get("translationX");
        HashMap<String, jq8> map4 = this.f106472J;
        jq8 jq8Var2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float fMin = i2 * f2;
            float f3 = this.f106495u;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.f106494t;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double d2 = f6;
            gv4 gv4Var = this.f106487m.f92941a;
            float f7 = Float.NaN;
            for (vza vzaVar : this.f106467E) {
                gv4 gv4Var2 = vzaVar.f92941a;
                double d3 = d2;
                if (gv4Var2 != null) {
                    float f8 = vzaVar.f92943c;
                    if (f8 < f6) {
                        f4 = f8;
                        gv4Var = gv4Var2;
                    } else if (Float.isNaN(f7)) {
                        f7 = vzaVar.f92943c;
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
            this.f106491q[0].getPos(d, this.f106499y);
            db3 db3Var = this.f106492r;
            if (db3Var != null) {
                double[] dArr = this.f106499y;
                if (dArr.length > 0) {
                    db3Var.getPos(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f106487m.m24268d(d, this.f106498x, this.f106499y, fArr, i3);
            if (jq8Var != null) {
                fArr[i3] = fArr[i3] + jq8Var.get(f6);
            } else if (wyfVar != null) {
                fArr[i3] = fArr[i3] + wyfVar.get(f6);
            }
            if (jq8Var2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + jq8Var2.get(f6);
            } else if (wyfVar2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + wyfVar2.get(f6);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.f106491q[0].getPos(getAdjustedPosition(f, null), this.f106499y);
        this.f106487m.m24273i(this.f106498x, this.f106499y, fArr, i);
    }

    /* JADX INFO: renamed from: c */
    public int m27137c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f106491q[0].getTimePoints();
        if (iArr != null) {
            Iterator<vza> it = this.f106467E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f92939Y;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.f106491q[0].getPos(d, this.f106499y);
            this.f106487m.m24267c(this.f106498x, this.f106499y, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: d */
    public void m27138d(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.f106491q[0].getPos(getAdjustedPosition(i2 * f, null), this.f106499y);
            this.f106487m.m24273i(this.f106498x, this.f106499y, fArr, i2 * 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m27139e(boolean z) {
    }

    /* JADX INFO: renamed from: f */
    public int m27140f(String str, float[] fArr, int i) {
        wyf wyfVar = this.f106471I.get(str);
        if (wyfVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = wyfVar.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    /* JADX INFO: renamed from: g */
    public void m27141g(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.f106468F);
        db3[] db3VarArr = this.f106491q;
        int i = 0;
        if (db3VarArr == null) {
            vza vzaVar = this.f106488n;
            float f4 = vzaVar.f92945e;
            vza vzaVar2 = this.f106487m;
            float f5 = f4 - vzaVar2.f92945e;
            float f6 = vzaVar.f92946f - vzaVar2.f92946f;
            float f7 = (vzaVar.f92947m - vzaVar2.f92947m) + f5;
            float f8 = (vzaVar.f92929C - vzaVar2.f92929C) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = adjustedPosition;
        db3VarArr[0].getSlope(d, this.f106500z);
        this.f106491q[0].getPos(d, this.f106499y);
        float f9 = this.f106468F[0];
        while (true) {
            dArr = this.f106500z;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        db3 db3Var = this.f106492r;
        if (db3Var == null) {
            this.f106487m.m24280p(f2, f3, fArr, this.f106498x, dArr, this.f106499y);
            return;
        }
        double[] dArr2 = this.f106499y;
        if (dArr2.length > 0) {
            db3Var.getPos(d, dArr2);
            this.f106492r.getSlope(d, this.f106500z);
            this.f106487m.m24280p(f2, f3, fArr, this.f106498x, this.f106500z, this.f106499y);
        }
    }

    public int getAnimateRelativeTo() {
        return this.f106487m.f92933M;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f106491q[0].getPos(d, dArr);
        this.f106491q[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f106487m.m24269e(d, this.f106498x, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.f106496v;
    }

    public float getCenterY() {
        return this.f106497w;
    }

    public int getDrawPath() {
        int iMax = this.f106487m.f92942b;
        Iterator<vza> it = this.f106467E.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f92942b);
        }
        return Math.max(iMax, this.f106488n.f92942b);
    }

    public float getFinalHeight() {
        return this.f106488n.f92929C;
    }

    public float getFinalWidth() {
        return this.f106488n.f92947m;
    }

    public float getFinalX() {
        return this.f106488n.f92945e;
    }

    public float getFinalY() {
        return this.f106488n.f92946f;
    }

    @Override // p000.ymh
    public int getId(String str) {
        return 0;
    }

    public vza getKeyFrame(int i) {
        return this.f106467E.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (oza ozaVar : this.f106469G) {
            int i4 = ozaVar.f69277k;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = ozaVar.f69274h;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.f106491q[0].getPos(d, this.f106499y);
                this.f106487m.m24268d(d, this.f106498x, this.f106499y, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (ozaVar instanceof rza) {
                    rza rzaVar = (rza) ozaVar;
                    iArr[i3 + 5] = rzaVar.f80199I;
                    iArr[i3 + 6] = Float.floatToIntBits(rzaVar.f80195E);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(rzaVar.f80196F);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = 0;
        for (oza ozaVar : this.f106469G) {
            int i3 = ozaVar.f69274h;
            iArr[i] = (ozaVar.f69277k * 1000) + i3;
            double d = i3 / 100.0f;
            this.f106491q[0].getPos(d, this.f106499y);
            this.f106487m.m24268d(d, this.f106498x, this.f106499y, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public float getStartHeight() {
        return this.f106487m.f92929C;
    }

    public float getStartWidth() {
        return this.f106487m.f92947m;
    }

    public float getStartX() {
        return this.f106487m.f92945e;
    }

    public float getStartY() {
        return this.f106487m.f92946f;
    }

    public int getTransformPivotTarget() {
        return this.f106475M;
    }

    public d0b getView() {
        return this.f106483i;
    }

    /* JADX INFO: renamed from: h */
    public float m27142h(int i, float f, float f2) {
        vza vzaVar = this.f106488n;
        float f3 = vzaVar.f92945e;
        vza vzaVar2 = this.f106487m;
        float f4 = vzaVar2.f92945e;
        float f5 = f3 - f4;
        float f6 = vzaVar.f92946f;
        float f7 = vzaVar2.f92946f;
        float f8 = f6 - f7;
        float f9 = f4 + (vzaVar2.f92947m / 2.0f);
        float f10 = f7 + (vzaVar2.f92929C / 2.0f);
        float fHypot = (float) Math.hypot(f5, f8);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / fHypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f13 * f13));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* JADX INFO: renamed from: i */
    public double[] m27143i(double d) {
        this.f106491q[0].getPos(d, this.f106499y);
        db3 db3Var = this.f106492r;
        if (db3Var != null) {
            double[] dArr = this.f106499y;
            if (dArr.length > 0) {
                db3Var.getPos(d, dArr);
            }
        }
        return this.f106499y;
    }

    public boolean interpolate(d0b d0bVar, float f, long j, gq8 gq8Var) {
        double d;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.f106477O;
        if (i != -1) {
            float f2 = 1.0f / i;
            float fFloor = ((float) Math.floor(adjustedPosition / f2)) * f2;
            float f3 = (adjustedPosition % f2) / f2;
            if (!Float.isNaN(this.f106478P)) {
                f3 = (f3 + this.f106478P) % 1.0f;
            }
            sc4 sc4Var = this.f106479Q;
            adjustedPosition = ((sc4Var != null ? sc4Var.getInterpolation(f3) : ((double) f3) > 0.5d ? 1.0f : 0.0f) * f2) + fFloor;
        }
        float f4 = adjustedPosition;
        HashMap<String, wyf> map = this.f106471I;
        if (map != null) {
            Iterator<wyf> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(d0bVar, f4);
            }
        }
        db3[] db3VarArr = this.f106491q;
        if (db3VarArr != null) {
            double d2 = f4;
            db3VarArr[0].getPos(d2, this.f106499y);
            this.f106491q[0].getSlope(d2, this.f106500z);
            db3 db3Var = this.f106492r;
            if (db3Var != null) {
                double[] dArr = this.f106499y;
                if (dArr.length > 0) {
                    db3Var.getPos(d2, dArr);
                    this.f106492r.getSlope(d2, this.f106500z);
                }
            }
            if (this.f106480R) {
                d = d2;
            } else {
                d = d2;
                this.f106487m.m24281q(f4, d0bVar, this.f106498x, this.f106499y, this.f106500z, null);
            }
            if (this.f106475M != -1) {
                if (this.f106476N == null) {
                    this.f106476N = d0bVar.getParent().findViewById(this.f106475M);
                }
                if (this.f106476N != null) {
                    float top = (r1.getTop() + this.f106476N.getBottom()) / 2.0f;
                    float left = (this.f106476N.getLeft() + this.f106476N.getRight()) / 2.0f;
                    if (d0bVar.getRight() - d0bVar.getLeft() > 0 && d0bVar.getBottom() - d0bVar.getTop() > 0) {
                        d0bVar.setPivotX(left - d0bVar.getLeft());
                        d0bVar.setPivotY(top - d0bVar.getTop());
                    }
                }
            }
            int i2 = 1;
            while (true) {
                db3[] db3VarArr2 = this.f106491q;
                if (i2 >= db3VarArr2.length) {
                    break;
                }
                db3VarArr2[i2].getPos(d, this.f106466D);
                this.f106487m.f92938X.get(this.f106463A[i2 - 1]).setInterpolatedValue(d0bVar, this.f106466D);
                i2++;
            }
            cza czaVar = this.f106489o;
            if (czaVar.f28096b == 0) {
                if (f4 <= 0.0f) {
                    d0bVar.setVisibility(czaVar.f28098c);
                } else if (f4 >= 1.0f) {
                    d0bVar.setVisibility(this.f106490p.f28098c);
                } else if (this.f106490p.f28098c != czaVar.f28098c) {
                    d0bVar.setVisibility(4);
                }
            }
            if (this.f106473K != null) {
                int i3 = 0;
                while (true) {
                    tza[] tzaVarArr = this.f106473K;
                    if (i3 >= tzaVarArr.length) {
                        break;
                    }
                    tzaVarArr[i3].conditionallyFire(f4, d0bVar);
                    i3++;
                }
            }
        } else {
            vza vzaVar = this.f106487m;
            float f5 = vzaVar.f92945e;
            vza vzaVar2 = this.f106488n;
            float f6 = f5 + ((vzaVar2.f92945e - f5) * f4);
            float f7 = vzaVar.f92946f;
            float f8 = f7 + ((vzaVar2.f92946f - f7) * f4);
            float f9 = vzaVar.f92947m;
            float f10 = f9 + ((vzaVar2.f92947m - f9) * f4);
            float f11 = vzaVar.f92929C;
            float f12 = f6 + 0.5f;
            float f13 = f8 + 0.5f;
            d0bVar.layout((int) f12, (int) f13, (int) (f12 + f10), (int) (f13 + f11 + ((vzaVar2.f92929C - f11) * f4)));
        }
        HashMap<String, jq8> map2 = this.f106472J;
        if (map2 == null) {
            return false;
        }
        for (jq8 jq8Var : map2.values()) {
            if (jq8Var instanceof jq8.C8017f) {
                double[] dArr2 = this.f106500z;
                ((jq8.C8017f) jq8Var).setPathRotate(d0bVar, f4, dArr2[0], dArr2[1]);
            } else {
                jq8Var.setProperty(d0bVar, f4);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public rza m27144j(int i, int i2, float f, float f2) {
        z46 z46Var = new z46();
        vza vzaVar = this.f106487m;
        float f3 = vzaVar.f92945e;
        z46Var.f104042b = f3;
        float f4 = vzaVar.f92946f;
        z46Var.f104044d = f4;
        z46Var.f104043c = f3 + vzaVar.f92947m;
        z46Var.f104041a = f4 + vzaVar.f92929C;
        z46 z46Var2 = new z46();
        vza vzaVar2 = this.f106488n;
        float f5 = vzaVar2.f92945e;
        z46Var2.f104042b = f5;
        float f6 = vzaVar2.f92946f;
        z46Var2.f104044d = f6;
        z46Var2.f104043c = f5 + vzaVar2.f92947m;
        z46Var2.f104041a = f6 + vzaVar2.f92929C;
        for (oza ozaVar : this.f106469G) {
            if (ozaVar instanceof rza) {
                rza rzaVar = (rza) ozaVar;
                if (rzaVar.intersects(i, i2, z46Var, z46Var2, f, f2)) {
                    return rzaVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m27145k(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.f106468F);
        HashMap<String, wyf> map = this.f106471I;
        wyf wyfVar = map == null ? null : map.get("translationX");
        HashMap<String, wyf> map2 = this.f106471I;
        wyf wyfVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, wyf> map3 = this.f106471I;
        wyf wyfVar3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, wyf> map4 = this.f106471I;
        wyf wyfVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, wyf> map5 = this.f106471I;
        wyf wyfVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, jq8> map6 = this.f106472J;
        jq8 jq8Var = map6 == null ? null : map6.get("translationX");
        HashMap<String, jq8> map7 = this.f106472J;
        jq8 jq8Var2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, jq8> map8 = this.f106472J;
        jq8 jq8Var3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, jq8> map9 = this.f106472J;
        jq8 jq8Var4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, jq8> map10 = this.f106472J;
        jq8 jq8Var5 = map10 != null ? map10.get("scaleY") : null;
        k4i k4iVar = new k4i();
        k4iVar.clear();
        k4iVar.setRotationVelocity(wyfVar3, adjustedPosition);
        k4iVar.setTranslationVelocity(wyfVar, wyfVar2, adjustedPosition);
        k4iVar.setScaleVelocity(wyfVar4, wyfVar5, adjustedPosition);
        k4iVar.setRotationVelocity(jq8Var3, adjustedPosition);
        k4iVar.setTranslationVelocity(jq8Var, jq8Var2, adjustedPosition);
        k4iVar.setScaleVelocity(jq8Var4, jq8Var5, adjustedPosition);
        db3 db3Var = this.f106492r;
        if (db3Var != null) {
            double[] dArr = this.f106499y;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                db3Var.getPos(d, dArr);
                this.f106492r.getSlope(d, this.f106500z);
                this.f106487m.m24280p(f2, f3, fArr, this.f106498x, this.f106500z, this.f106499y);
            }
            k4iVar.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f106491q == null) {
            vza vzaVar = this.f106488n;
            float f4 = vzaVar.f92945e;
            vza vzaVar2 = this.f106487m;
            float f5 = f4 - vzaVar2.f92945e;
            jq8 jq8Var6 = jq8Var5;
            float f6 = vzaVar.f92946f - vzaVar2.f92946f;
            jq8 jq8Var7 = jq8Var4;
            float f7 = (vzaVar.f92947m - vzaVar2.f92947m) + f5;
            float f8 = (vzaVar.f92929C - vzaVar2.f92929C) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            k4iVar.clear();
            k4iVar.setRotationVelocity(wyfVar3, adjustedPosition);
            k4iVar.setTranslationVelocity(wyfVar, wyfVar2, adjustedPosition);
            k4iVar.setScaleVelocity(wyfVar4, wyfVar5, adjustedPosition);
            k4iVar.setRotationVelocity(jq8Var3, adjustedPosition);
            k4iVar.setTranslationVelocity(jq8Var, jq8Var2, adjustedPosition);
            k4iVar.setScaleVelocity(jq8Var7, jq8Var6, adjustedPosition);
            k4iVar.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.f106468F);
        this.f106491q[0].getSlope(adjustedPosition2, this.f106500z);
        this.f106491q[0].getPos(adjustedPosition2, this.f106499y);
        float f9 = this.f106468F[0];
        while (true) {
            double[] dArr2 = this.f106500z;
            if (i3 >= dArr2.length) {
                this.f106487m.m24280p(f2, f3, fArr, this.f106498x, dArr2, this.f106499y);
                k4iVar.applyTransform(f2, f3, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * ((double) f9);
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public String m27146l() {
        return this.f106483i.getName();
    }

    /* JADX INFO: renamed from: m */
    public void m27147m(d0b d0bVar, rza rzaVar, float f, float f2, String[] strArr, float[] fArr) {
        z46 z46Var = new z46();
        vza vzaVar = this.f106487m;
        float f3 = vzaVar.f92945e;
        z46Var.f104042b = f3;
        float f4 = vzaVar.f92946f;
        z46Var.f104044d = f4;
        z46Var.f104043c = f3 + vzaVar.f92947m;
        z46Var.f104041a = f4 + vzaVar.f92929C;
        z46 z46Var2 = new z46();
        vza vzaVar2 = this.f106488n;
        float f5 = vzaVar2.f92945e;
        z46Var2.f104042b = f5;
        float f6 = vzaVar2.f92946f;
        z46Var2.f104044d = f6;
        z46Var2.f104043c = f5 + vzaVar2.f92947m;
        z46Var2.f104041a = f6 + vzaVar2.f92929C;
        rzaVar.positionAttributes(d0bVar, z46Var, z46Var2, f, f2, strArr, fArr);
    }

    /* JADX INFO: renamed from: n */
    public void m27148n(sud sudVar, sud sudVar2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = sudVar.f82927b + sudVar.f82928c;
            sudVar2.f82927b = ((sudVar.f82929d + sudVar.f82926a) - sudVar.width()) / 2;
            sudVar2.f82929d = i3 - ((i4 + sudVar.height()) / 2);
            sudVar2.f82928c = sudVar2.f82927b + sudVar.width();
            sudVar2.f82926a = sudVar2.f82929d + sudVar.height();
            return;
        }
        if (i == 2) {
            int i5 = sudVar.f82927b + sudVar.f82928c;
            sudVar2.f82927b = i2 - (((sudVar.f82929d + sudVar.f82926a) + sudVar.width()) / 2);
            sudVar2.f82929d = (i5 - sudVar.height()) / 2;
            sudVar2.f82928c = sudVar2.f82927b + sudVar.width();
            sudVar2.f82926a = sudVar2.f82929d + sudVar.height();
            return;
        }
        if (i == 3) {
            int i6 = sudVar.f82927b + sudVar.f82928c;
            sudVar2.f82927b = ((sudVar.height() / 2) + sudVar.f82929d) - (i6 / 2);
            sudVar2.f82929d = i3 - ((i6 + sudVar.height()) / 2);
            sudVar2.f82928c = sudVar2.f82927b + sudVar.width();
            sudVar2.f82926a = sudVar2.f82929d + sudVar.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = sudVar.f82927b + sudVar.f82928c;
        sudVar2.f82927b = i2 - (((sudVar.f82926a + sudVar.f82929d) + sudVar.width()) / 2);
        sudVar2.f82929d = (i7 - sudVar.height()) / 2;
        sudVar2.f82928c = sudVar2.f82927b + sudVar.width();
        sudVar2.f82926a = sudVar2.f82929d + sudVar.height();
    }

    /* JADX INFO: renamed from: o */
    public void m27149o(d0b d0bVar) {
        vza vzaVar = this.f106487m;
        vzaVar.f92943c = 0.0f;
        vzaVar.f92944d = 0.0f;
        this.f106480R = true;
        vzaVar.m24279o(d0bVar.getX(), d0bVar.getY(), d0bVar.getWidth(), d0bVar.getHeight());
        this.f106488n.m24279o(d0bVar.getX(), d0bVar.getY(), d0bVar.getWidth(), d0bVar.getHeight());
        this.f106489o.setState(d0bVar);
        this.f106490p.setState(d0bVar);
    }

    public void setDrawPath(int i) {
        this.f106487m.f92942b = i;
    }

    public void setEnd(d0b d0bVar) {
        vza vzaVar = this.f106488n;
        vzaVar.f92943c = 1.0f;
        vzaVar.f92944d = 1.0f;
        readView(vzaVar);
        this.f106488n.m24279o(d0bVar.getLeft(), d0bVar.getTop(), d0bVar.getWidth(), d0bVar.getHeight());
        this.f106488n.applyParameters(d0bVar);
        this.f106490p.setState(d0bVar);
    }

    public void setPathMotionArc(int i) {
        this.f106474L = i;
    }

    public void setStart(d0b d0bVar) {
        vza vzaVar = this.f106487m;
        vzaVar.f92943c = 0.0f;
        vzaVar.f92944d = 0.0f;
        vzaVar.m24279o(d0bVar.getX(), d0bVar.getY(), d0bVar.getWidth(), d0bVar.getHeight());
        this.f106487m.applyParameters(d0bVar);
        this.f106489o.setState(d0bVar);
    }

    public void setStartState(obi obiVar, d0b d0bVar, int i, int i2, int i3) {
        vza vzaVar = this.f106487m;
        vzaVar.f92943c = 0.0f;
        vzaVar.f92944d = 0.0f;
        sud sudVar = new sud();
        if (i == 1) {
            int i4 = obiVar.f67109b + obiVar.f67111d;
            sudVar.f82927b = ((obiVar.f67110c + obiVar.f67112e) - obiVar.width()) / 2;
            sudVar.f82929d = i2 - ((i4 + obiVar.height()) / 2);
            sudVar.f82928c = sudVar.f82927b + obiVar.width();
            sudVar.f82926a = sudVar.f82929d + obiVar.height();
        } else if (i == 2) {
            int i5 = obiVar.f67109b + obiVar.f67111d;
            sudVar.f82927b = i3 - (((obiVar.f67110c + obiVar.f67112e) + obiVar.width()) / 2);
            sudVar.f82929d = (i5 - obiVar.height()) / 2;
            sudVar.f82928c = sudVar.f82927b + obiVar.width();
            sudVar.f82926a = sudVar.f82929d + obiVar.height();
        }
        this.f106487m.m24279o(sudVar.f82927b, sudVar.f82929d, sudVar.width(), sudVar.height());
        this.f106489o.setState(sudVar, d0bVar, i, obiVar.f67108a);
    }

    public void setTransformPivotTarget(int i) {
        this.f106475M = i;
        this.f106476N = null;
    }

    @Override // p000.ymh
    public boolean setValue(int i, int i2) {
        if (i != 509) {
            return i == 704;
        }
        setPathMotionArc(i2);
        return true;
    }

    public void setView(d0b d0bVar) {
        this.f106483i = d0bVar;
    }

    public void setup(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        int i3;
        int i4;
        ge3 ge3Var;
        wyf wyfVarMakeSpline;
        ge3 ge3Var2;
        Integer num;
        wyf wyfVarMakeSpline2;
        ge3 ge3Var3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i5 = this.f106474L;
        if (i5 != -1) {
            this.f106487m.f92932L = i5;
        }
        this.f106489o.m8798a(this.f106490p, hashSet2);
        ArrayList<oza> arrayList2 = this.f106469G;
        if (arrayList2 != null) {
            arrayList = null;
            for (oza ozaVar : arrayList2) {
                if (ozaVar instanceof rza) {
                    rza rzaVar = (rza) ozaVar;
                    insertKey(new vza(i, i2, rzaVar, this.f106487m, this.f106488n));
                    int i6 = rzaVar.f80202y;
                    if (i6 != -1) {
                        this.f106486l = i6;
                    }
                } else if (ozaVar instanceof qza) {
                    ozaVar.getAttributeNames(hashSet3);
                } else if (ozaVar instanceof sza) {
                    ozaVar.getAttributeNames(hashSet);
                } else if (ozaVar instanceof tza) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((tza) ozaVar);
                } else {
                    ozaVar.setInterpolation(map);
                    ozaVar.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f106473K = (tza[]) arrayList.toArray(new tza[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f106471I = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    uq8.C13650b c13650b = new uq8.C13650b();
                    String str2 = str.split(",")[c];
                    for (oza ozaVar2 : this.f106469G) {
                        HashMap<String, ge3> map2 = ozaVar2.f69278l;
                        if (map2 != null && (ge3Var3 = map2.get(str2)) != null) {
                            c13650b.append(ozaVar2.f69274h, ge3Var3);
                        }
                    }
                    wyfVarMakeSpline2 = wyf.makeCustomSplineSet(str, c13650b);
                } else {
                    wyfVarMakeSpline2 = wyf.makeSpline(str, j);
                }
                if (wyfVarMakeSpline2 != null) {
                    wyfVarMakeSpline2.setType(str);
                    this.f106471I.put(str, wyfVarMakeSpline2);
                }
                c = 1;
            }
            ArrayList<oza> arrayList3 = this.f106469G;
            if (arrayList3 != null) {
                for (oza ozaVar3 : arrayList3) {
                    if (ozaVar3 instanceof pza) {
                        ozaVar3.addValues(this.f106471I);
                    }
                }
            }
            this.f106489o.addValues(this.f106471I, 0);
            this.f106490p.addValues(this.f106471I, 100);
            for (String str3 : this.f106471I.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                wyf wyfVar = this.f106471I.get(str3);
                if (wyfVar != null) {
                    wyfVar.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f106470H == null) {
                this.f106470H = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f106470H.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        uq8.C13650b c13650b2 = new uq8.C13650b();
                        String str5 = str4.split(",")[1];
                        for (oza ozaVar4 : this.f106469G) {
                            HashMap<String, ge3> map3 = ozaVar4.f69278l;
                            if (map3 != null && (ge3Var2 = map3.get(str5)) != null) {
                                c13650b2.append(ozaVar4.f69274h, ge3Var2);
                            }
                        }
                        wyfVarMakeSpline = wyf.makeCustomSplineSet(str4, c13650b2);
                    } else {
                        wyfVarMakeSpline = wyf.makeSpline(str4, j);
                    }
                    if (wyfVarMakeSpline != null) {
                        wyfVarMakeSpline.setType(str4);
                    }
                }
            }
            ArrayList<oza> arrayList4 = this.f106469G;
            if (arrayList4 != null) {
                for (oza ozaVar5 : arrayList4) {
                    if (ozaVar5 instanceof sza) {
                        ((sza) ozaVar5).addTimeValues(this.f106470H);
                    }
                }
            }
            for (String str6 : this.f106470H.keySet()) {
                this.f106470H.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f106467E.size();
        int i7 = size + 2;
        vza[] vzaVarArr = new vza[i7];
        vzaVarArr[0] = this.f106487m;
        vzaVarArr[size + 1] = this.f106488n;
        if (this.f106467E.size() > 0 && this.f106486l == oza.f69262m) {
            this.f106486l = 0;
        }
        Iterator<vza> it = this.f106467E.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            vzaVarArr[i8] = it.next();
            i8++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f106488n.f92938X.keySet()) {
            if (this.f106487m.f92938X.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f106463A = strArr2;
        this.f106464B = new int[strArr2.length];
        int i9 = 0;
        while (true) {
            strArr = this.f106463A;
            if (i9 >= strArr.length) {
                break;
            }
            String str8 = strArr[i9];
            this.f106464B[i9] = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    break;
                }
                if (vzaVarArr[i10].f92938X.containsKey(str8) && (ge3Var = vzaVarArr[i10].f92938X.get(str8)) != null) {
                    int[] iArr = this.f106464B;
                    iArr[i9] = iArr[i9] + ge3Var.numberOfInterpolatedValues();
                    break;
                }
                i10++;
            }
            i9++;
        }
        boolean z = vzaVarArr[0].f92932L != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 1; i11 < i7; i11++) {
            vzaVarArr[i11].m24265a(vzaVarArr[i11 - 1], zArr, this.f106463A, z);
        }
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                i12++;
            }
        }
        this.f106498x = new int[i12];
        int i14 = 2;
        int iMax = Math.max(2, i12);
        this.f106499y = new double[iMax];
        this.f106500z = new double[iMax];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f106498x[i15] = i16;
                i15++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, this.f106498x.length);
        double[] dArr2 = new double[i7];
        for (int i17 = 0; i17 < i7; i17++) {
            vzaVarArr[i17].m24266b(dArr[i17], this.f106498x);
            dArr2[i17] = vzaVarArr[i17].f92943c;
        }
        int i18 = 0;
        while (true) {
            int[] iArr2 = this.f106498x;
            if (i18 >= iArr2.length) {
                break;
            }
            if (iArr2[i18] < vza.f92928l2.length) {
                String str9 = vza.f92928l2[this.f106498x[i18]] + " [";
                for (int i19 = 0; i19 < i7; i19++) {
                    str9 = str9 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f106491q = new db3[this.f106463A.length + 1];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f106463A;
            if (i20 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i20];
            int i21 = 0;
            int i22 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < i7) {
                if (vzaVarArr[i21].m24274j(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i7];
                        int[] iArr3 = new int[i14];
                        iArr3[1] = vzaVarArr[i21].m24272h(str10);
                        i4 = 0;
                        iArr3[0] = i7;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i4 = 0;
                    }
                    vza vzaVar = vzaVarArr[i21];
                    i3 = i7;
                    dArr3[i22] = vzaVar.f92943c;
                    vzaVar.m24271g(str10, dArr4[i22], i4);
                    i22++;
                } else {
                    i3 = i7;
                }
                i21++;
                i7 = i3;
                i14 = 2;
            }
            i20++;
            this.f106491q[i20] = db3.get(this.f106486l, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i7 = i7;
            i14 = 2;
        }
        int i23 = i7;
        this.f106491q[0] = db3.get(this.f106486l, dArr2, dArr);
        if (vzaVarArr[0].f92932L != -1) {
            int[] iArr4 = new int[i23];
            double[] dArr5 = new double[i23];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i23, 2);
            for (int i24 = 0; i24 < i23; i24++) {
                iArr4[i24] = vzaVarArr[i24].f92932L;
                dArr5[i24] = r7.f92943c;
                double[] dArr7 = dArr6[i24];
                dArr7[0] = r7.f92945e;
                dArr7[1] = r7.f92946f;
            }
            this.f106492r = db3.getArc(iArr4, dArr5, dArr6);
        }
        this.f106472J = new HashMap<>();
        if (this.f106469G != null) {
            float preCycleDistance = Float.NaN;
            for (String str11 : hashSet3) {
                jq8 jq8VarMakeWidgetCycle = jq8.makeWidgetCycle(str11);
                if (jq8VarMakeWidgetCycle != null) {
                    if (jq8VarMakeWidgetCycle.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    jq8VarMakeWidgetCycle.setType(str11);
                    this.f106472J.put(str11, jq8VarMakeWidgetCycle);
                }
            }
            for (oza ozaVar6 : this.f106469G) {
                if (ozaVar6 instanceof qza) {
                    ((qza) ozaVar6).addCycleValues(this.f106472J);
                }
            }
            Iterator<jq8> it2 = this.f106472J.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public void setupRelative(zya zyaVar) {
        this.f106487m.setupRelative(zyaVar, zyaVar.f106487m);
        this.f106488n.setupRelative(zyaVar, zyaVar.f106488n);
    }

    public String toString() {
        return " start: x: " + this.f106487m.f92945e + " y: " + this.f106487m.f92946f + " end: x: " + this.f106488n.f92945e + " y: " + this.f106488n.f92946f;
    }

    @Override // p000.ymh
    public boolean setValue(int i, float f) {
        return false;
    }

    @Override // p000.ymh
    public boolean setValue(int i, String str) {
        if (705 == i) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.f106479Q = getInterpolator(-1, str, 0);
        }
        return false;
    }

    @Override // p000.ymh
    public boolean setValue(int i, boolean z) {
        return false;
    }
}
