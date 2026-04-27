package p000;

import java.util.ArrayList;
import java.util.HashMap;
import p000.cu2;
import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class gu2 implements lvd {

    /* JADX INFO: renamed from: a */
    public Object f41154a;

    /* JADX INFO: renamed from: a0 */
    public float f41155a0;

    /* JADX INFO: renamed from: b */
    public final f2g f41156b;

    /* JADX INFO: renamed from: b0 */
    public float f41157b0;

    /* JADX INFO: renamed from: d0 */
    public zc4 f41161d0;

    /* JADX INFO: renamed from: e0 */
    public zc4 f41163e0;

    /* JADX INFO: renamed from: f0 */
    public Object f41165f0;

    /* JADX INFO: renamed from: g0 */
    public iu2 f41167g0;

    /* JADX INFO: renamed from: h0 */
    public HashMap<String, Integer> f41169h0;

    /* JADX INFO: renamed from: i0 */
    public HashMap<String, Float> f41171i0;

    /* JADX INFO: renamed from: c */
    public String f41158c = null;

    /* JADX INFO: renamed from: d */
    public eo5 f41160d = null;

    /* JADX INFO: renamed from: e */
    public int f41162e = 0;

    /* JADX INFO: renamed from: f */
    public int f41164f = 0;

    /* JADX INFO: renamed from: g */
    public float f41166g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f41168h = -1.0f;

    /* JADX INFO: renamed from: i */
    public float f41170i = 0.5f;

    /* JADX INFO: renamed from: j */
    public float f41172j = 0.5f;

    /* JADX INFO: renamed from: k */
    public int f41173k = 0;

    /* JADX INFO: renamed from: l */
    public int f41174l = 0;

    /* JADX INFO: renamed from: m */
    public int f41175m = 0;

    /* JADX INFO: renamed from: n */
    public int f41176n = 0;

    /* JADX INFO: renamed from: o */
    public int f41177o = 0;

    /* JADX INFO: renamed from: p */
    public int f41178p = 0;

    /* JADX INFO: renamed from: q */
    public int f41179q = 0;

    /* JADX INFO: renamed from: r */
    public int f41180r = 0;

    /* JADX INFO: renamed from: s */
    public int f41181s = 0;

    /* JADX INFO: renamed from: t */
    public int f41182t = 0;

    /* JADX INFO: renamed from: u */
    public int f41183u = 0;

    /* JADX INFO: renamed from: v */
    public int f41184v = 0;

    /* JADX INFO: renamed from: w */
    public int f41185w = 0;

    /* JADX INFO: renamed from: x */
    public int f41186x = 0;

    /* JADX INFO: renamed from: y */
    public float f41187y = Float.NaN;

    /* JADX INFO: renamed from: z */
    public float f41188z = Float.NaN;

    /* JADX INFO: renamed from: A */
    public float f41128A = Float.NaN;

    /* JADX INFO: renamed from: B */
    public float f41129B = Float.NaN;

    /* JADX INFO: renamed from: C */
    public float f41130C = Float.NaN;

    /* JADX INFO: renamed from: D */
    public float f41131D = Float.NaN;

    /* JADX INFO: renamed from: E */
    public float f41132E = Float.NaN;

    /* JADX INFO: renamed from: F */
    public float f41133F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public float f41134G = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f41135H = Float.NaN;

    /* JADX INFO: renamed from: I */
    public float f41136I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public int f41137J = 0;

    /* JADX INFO: renamed from: K */
    public Object f41138K = null;

    /* JADX INFO: renamed from: L */
    public Object f41139L = null;

    /* JADX INFO: renamed from: M */
    public Object f41140M = null;

    /* JADX INFO: renamed from: N */
    public Object f41141N = null;

    /* JADX INFO: renamed from: O */
    public Object f41142O = null;

    /* JADX INFO: renamed from: P */
    public Object f41143P = null;

    /* JADX INFO: renamed from: Q */
    public Object f41144Q = null;

    /* JADX INFO: renamed from: R */
    public Object f41145R = null;

    /* JADX INFO: renamed from: S */
    public Object f41146S = null;

    /* JADX INFO: renamed from: T */
    public Object f41147T = null;

    /* JADX INFO: renamed from: U */
    public Object f41148U = null;

    /* JADX INFO: renamed from: V */
    public Object f41149V = null;

    /* JADX INFO: renamed from: W */
    public Object f41150W = null;

    /* JADX INFO: renamed from: X */
    public Object f41151X = null;

    /* JADX INFO: renamed from: Y */
    public Object f41152Y = null;

    /* JADX INFO: renamed from: Z */
    public Object f41153Z = null;

    /* JADX INFO: renamed from: c0 */
    public f2g.EnumC5563c f41159c0 = null;

    /* JADX INFO: renamed from: gu2$a */
    public static /* synthetic */ class C6545a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41189a;

        static {
            int[] iArr = new int[f2g.EnumC5563c.values().length];
            f41189a = iArr;
            try {
                iArr[f2g.EnumC5563c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41189a[f2g.EnumC5563c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41189a[f2g.EnumC5563c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41189a[f2g.EnumC5563c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41189a[f2g.EnumC5563c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41189a[f2g.EnumC5563c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41189a[f2g.EnumC5563c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41189a[f2g.EnumC5563c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41189a[f2g.EnumC5563c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41189a[f2g.EnumC5563c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41189a[f2g.EnumC5563c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41189a[f2g.EnumC5563c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41189a[f2g.EnumC5563c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41189a[f2g.EnumC5563c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41189a[f2g.EnumC5563c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41189a[f2g.EnumC5563c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41189a[f2g.EnumC5563c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41189a[f2g.EnumC5563c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: gu2$b */
    public interface InterfaceC6546b {
        gu2 create(f2g f2gVar);
    }

    /* JADX INFO: renamed from: gu2$c */
    public static class C6547c extends Exception {

        /* JADX INFO: renamed from: a */
        public final ArrayList<String> f41190a;

        public C6547c(ArrayList<String> arrayList) {
            this.f41190a = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.f41190a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f41190a.toString();
        }
    }

    public gu2(f2g f2gVar) {
        Object obj = zc4.f104747j;
        this.f41161d0 = zc4.Fixed(obj);
        this.f41163e0 = zc4.Fixed(obj);
        this.f41169h0 = new HashMap<>();
        this.f41171i0 = new HashMap<>();
        this.f41156b = f2gVar;
    }

    private void applyConnection(iu2 iu2Var, Object obj, f2g.EnumC5563c enumC5563c) {
        iu2 target = getTarget(obj);
        if (target == null) {
        }
        int[] iArr = C6545a.f41189a;
        int i = iArr[enumC5563c.ordinal()];
        switch (iArr[enumC5563c.ordinal()]) {
            case 1:
                cu2.EnumC4503b enumC4503b = cu2.EnumC4503b.LEFT;
                iu2Var.getAnchor(enumC4503b).connect(target.getAnchor(enumC4503b), this.f41173k, this.f41179q, false);
                break;
            case 2:
                iu2Var.getAnchor(cu2.EnumC4503b.LEFT).connect(target.getAnchor(cu2.EnumC4503b.RIGHT), this.f41173k, this.f41179q, false);
                break;
            case 3:
                iu2Var.getAnchor(cu2.EnumC4503b.RIGHT).connect(target.getAnchor(cu2.EnumC4503b.LEFT), this.f41174l, this.f41180r, false);
                break;
            case 4:
                cu2.EnumC4503b enumC4503b2 = cu2.EnumC4503b.RIGHT;
                iu2Var.getAnchor(enumC4503b2).connect(target.getAnchor(enumC4503b2), this.f41174l, this.f41180r, false);
                break;
            case 5:
                cu2.EnumC4503b enumC4503b3 = cu2.EnumC4503b.LEFT;
                iu2Var.getAnchor(enumC4503b3).connect(target.getAnchor(enumC4503b3), this.f41175m, this.f41181s, false);
                break;
            case 6:
                iu2Var.getAnchor(cu2.EnumC4503b.LEFT).connect(target.getAnchor(cu2.EnumC4503b.RIGHT), this.f41175m, this.f41181s, false);
                break;
            case 7:
                iu2Var.getAnchor(cu2.EnumC4503b.RIGHT).connect(target.getAnchor(cu2.EnumC4503b.LEFT), this.f41176n, this.f41182t, false);
                break;
            case 8:
                cu2.EnumC4503b enumC4503b4 = cu2.EnumC4503b.RIGHT;
                iu2Var.getAnchor(enumC4503b4).connect(target.getAnchor(enumC4503b4), this.f41176n, this.f41182t, false);
                break;
            case 9:
                cu2.EnumC4503b enumC4503b5 = cu2.EnumC4503b.TOP;
                iu2Var.getAnchor(enumC4503b5).connect(target.getAnchor(enumC4503b5), this.f41177o, this.f41183u, false);
                break;
            case 10:
                iu2Var.getAnchor(cu2.EnumC4503b.TOP).connect(target.getAnchor(cu2.EnumC4503b.BOTTOM), this.f41177o, this.f41183u, false);
                break;
            case 11:
                iu2Var.getAnchor(cu2.EnumC4503b.BOTTOM).connect(target.getAnchor(cu2.EnumC4503b.TOP), this.f41178p, this.f41184v, false);
                break;
            case 12:
                cu2.EnumC4503b enumC4503b6 = cu2.EnumC4503b.BOTTOM;
                iu2Var.getAnchor(enumC4503b6).connect(target.getAnchor(enumC4503b6), this.f41178p, this.f41184v, false);
                break;
            case 13:
                iu2Var.immediateConnect(cu2.EnumC4503b.BASELINE, target, cu2.EnumC4503b.BOTTOM, this.f41185w, this.f41186x);
                break;
            case 14:
                iu2Var.immediateConnect(cu2.EnumC4503b.BASELINE, target, cu2.EnumC4503b.TOP, this.f41185w, this.f41186x);
                break;
            case 15:
                cu2.EnumC4503b enumC4503b7 = cu2.EnumC4503b.BASELINE;
                iu2Var.immediateConnect(enumC4503b7, target, enumC4503b7, this.f41185w, this.f41186x);
                break;
            case 16:
                iu2Var.connectCircularConstraint(target, this.f41155a0, (int) this.f41157b0);
                break;
        }
    }

    private void dereference() {
        this.f41138K = get(this.f41138K);
        this.f41139L = get(this.f41139L);
        this.f41140M = get(this.f41140M);
        this.f41141N = get(this.f41141N);
        this.f41142O = get(this.f41142O);
        this.f41143P = get(this.f41143P);
        this.f41144Q = get(this.f41144Q);
        this.f41145R = get(this.f41145R);
        this.f41146S = get(this.f41146S);
        this.f41147T = get(this.f41147T);
        this.f41148U = get(this.f41148U);
        this.f41149V = get(this.f41149V);
        this.f41150W = get(this.f41150W);
        this.f41151X = get(this.f41151X);
        this.f41152Y = get(this.f41152Y);
    }

    private Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof gu2) ? this.f41156b.m10485a(obj) : obj;
    }

    private iu2 getTarget(Object obj) {
        if (obj instanceof lvd) {
            return ((lvd) obj).getConstraintWidget();
        }
        return null;
    }

    public void addCustomColor(String str, int i) {
        this.f41169h0.put(str, Integer.valueOf(i));
    }

    public void addCustomFloat(String str, float f) {
        if (this.f41171i0 == null) {
            this.f41171i0 = new HashMap<>();
        }
        this.f41171i0.put(str, Float.valueOf(f));
    }

    public gu2 alpha(float f) {
        this.f41134G = f;
        return this;
    }

    @Override // p000.lvd, p000.eo5
    public void apply() {
        if (this.f41167g0 == null) {
            return;
        }
        eo5 eo5Var = this.f41160d;
        if (eo5Var != null) {
            eo5Var.apply();
        }
        this.f41161d0.apply(this.f41156b, this.f41167g0, 0);
        this.f41163e0.apply(this.f41156b, this.f41167g0, 1);
        dereference();
        applyConnection(this.f41167g0, this.f41138K, f2g.EnumC5563c.LEFT_TO_LEFT);
        applyConnection(this.f41167g0, this.f41139L, f2g.EnumC5563c.LEFT_TO_RIGHT);
        applyConnection(this.f41167g0, this.f41140M, f2g.EnumC5563c.RIGHT_TO_LEFT);
        applyConnection(this.f41167g0, this.f41141N, f2g.EnumC5563c.RIGHT_TO_RIGHT);
        applyConnection(this.f41167g0, this.f41142O, f2g.EnumC5563c.START_TO_START);
        applyConnection(this.f41167g0, this.f41143P, f2g.EnumC5563c.START_TO_END);
        applyConnection(this.f41167g0, this.f41144Q, f2g.EnumC5563c.END_TO_START);
        applyConnection(this.f41167g0, this.f41145R, f2g.EnumC5563c.END_TO_END);
        applyConnection(this.f41167g0, this.f41146S, f2g.EnumC5563c.TOP_TO_TOP);
        applyConnection(this.f41167g0, this.f41147T, f2g.EnumC5563c.TOP_TO_BOTTOM);
        applyConnection(this.f41167g0, this.f41148U, f2g.EnumC5563c.BOTTOM_TO_TOP);
        applyConnection(this.f41167g0, this.f41149V, f2g.EnumC5563c.BOTTOM_TO_BOTTOM);
        applyConnection(this.f41167g0, this.f41150W, f2g.EnumC5563c.BASELINE_TO_BASELINE);
        applyConnection(this.f41167g0, this.f41151X, f2g.EnumC5563c.BASELINE_TO_TOP);
        applyConnection(this.f41167g0, this.f41152Y, f2g.EnumC5563c.BASELINE_TO_BOTTOM);
        applyConnection(this.f41167g0, this.f41153Z, f2g.EnumC5563c.CIRCULAR_CONSTRAINT);
        int i = this.f41162e;
        if (i != 0) {
            this.f41167g0.setHorizontalChainStyle(i);
        }
        int i2 = this.f41164f;
        if (i2 != 0) {
            this.f41167g0.setVerticalChainStyle(i2);
        }
        float f = this.f41166g;
        if (f != -1.0f) {
            this.f41167g0.setHorizontalWeight(f);
        }
        float f2 = this.f41168h;
        if (f2 != -1.0f) {
            this.f41167g0.setVerticalWeight(f2);
        }
        this.f41167g0.setHorizontalBiasPercent(this.f41170i);
        this.f41167g0.setVerticalBiasPercent(this.f41172j);
        iu2 iu2Var = this.f41167g0;
        uki ukiVar = iu2Var.f48400n;
        ukiVar.f88253f = this.f41187y;
        ukiVar.f88254g = this.f41188z;
        ukiVar.f88255h = this.f41128A;
        ukiVar.f88256i = this.f41129B;
        ukiVar.f88257j = this.f41130C;
        ukiVar.f88258k = this.f41131D;
        ukiVar.f88259l = this.f41132E;
        ukiVar.f88260m = this.f41133F;
        ukiVar.f88261n = this.f41135H;
        ukiVar.f88262o = this.f41136I;
        ukiVar.f88263p = this.f41134G;
        int i3 = this.f41137J;
        ukiVar.f88265r = i3;
        iu2Var.setVisibility(i3);
        HashMap<String, Integer> map = this.f41169h0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f41167g0.f48400n.setCustomAttribute(str, 902, this.f41169h0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f41171i0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f41167g0.f48400n.setCustomAttribute(str2, 901, this.f41171i0.get(str2).floatValue());
            }
        }
    }

    public gu2 baseline() {
        this.f41159c0 = f2g.EnumC5563c.BASELINE_TO_BASELINE;
        return this;
    }

    public gu2 baselineToBaseline(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.BASELINE_TO_BASELINE;
        this.f41150W = obj;
        return this;
    }

    public gu2 baselineToBottom(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.BASELINE_TO_BOTTOM;
        this.f41152Y = obj;
        return this;
    }

    public gu2 baselineToTop(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.BASELINE_TO_TOP;
        this.f41151X = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.gu2 bias(float r3) {
        /*
            r2 = this;
            f2g$c r0 = r2.f41159c0
            if (r0 != 0) goto L5
            return r2
        L5:
            int[] r1 = p000.gu2.C6545a.f41189a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 17
            if (r0 == r1) goto L1c
            r1 = 18
            if (r0 == r1) goto L19
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L1c;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L19;
                case 11: goto L19;
                case 12: goto L19;
                default: goto L18;
            }
        L18:
            goto L1e
        L19:
            r2.f41172j = r3
            goto L1e
        L1c:
            r2.f41170i = r3
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gu2.bias(float):gu2");
    }

    public gu2 bottom() {
        if (this.f41148U != null) {
            this.f41159c0 = f2g.EnumC5563c.BOTTOM_TO_TOP;
        } else {
            this.f41159c0 = f2g.EnumC5563c.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public gu2 bottomToBottom(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.BOTTOM_TO_BOTTOM;
        this.f41149V = obj;
        return this;
    }

    public gu2 bottomToTop(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.BOTTOM_TO_TOP;
        this.f41148U = obj;
        return this;
    }

    public gu2 centerHorizontally(Object obj) {
        Object obj2 = get(obj);
        this.f41142O = obj2;
        this.f41145R = obj2;
        this.f41159c0 = f2g.EnumC5563c.CENTER_HORIZONTALLY;
        this.f41170i = 0.5f;
        return this;
    }

    public gu2 centerVertically(Object obj) {
        Object obj2 = get(obj);
        this.f41146S = obj2;
        this.f41149V = obj2;
        this.f41159c0 = f2g.EnumC5563c.CENTER_VERTICALLY;
        this.f41172j = 0.5f;
        return this;
    }

    public gu2 circularConstraint(Object obj, float f, float f2) {
        this.f41153Z = get(obj);
        this.f41155a0 = f;
        this.f41157b0 = f2;
        this.f41159c0 = f2g.EnumC5563c.CIRCULAR_CONSTRAINT;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public gu2 clear() {
        f2g.EnumC5563c enumC5563c = this.f41159c0;
        if (enumC5563c != null) {
            switch (C6545a.f41189a[enumC5563c.ordinal()]) {
                case 1:
                case 2:
                    this.f41138K = null;
                    this.f41139L = null;
                    this.f41173k = 0;
                    this.f41179q = 0;
                    break;
                case 3:
                case 4:
                    this.f41140M = null;
                    this.f41141N = null;
                    this.f41174l = 0;
                    this.f41180r = 0;
                    break;
                case 5:
                case 6:
                    this.f41142O = null;
                    this.f41143P = null;
                    this.f41175m = 0;
                    this.f41181s = 0;
                    break;
                case 7:
                case 8:
                    this.f41144Q = null;
                    this.f41145R = null;
                    this.f41176n = 0;
                    this.f41182t = 0;
                    break;
                case 9:
                case 10:
                    this.f41146S = null;
                    this.f41147T = null;
                    this.f41177o = 0;
                    this.f41183u = 0;
                    break;
                case 11:
                case 12:
                    this.f41148U = null;
                    this.f41149V = null;
                    this.f41178p = 0;
                    this.f41184v = 0;
                    break;
                case 15:
                    this.f41150W = null;
                    break;
                case 16:
                    this.f41153Z = null;
                    break;
            }
        } else {
            this.f41138K = null;
            this.f41139L = null;
            this.f41173k = 0;
            this.f41140M = null;
            this.f41141N = null;
            this.f41174l = 0;
            this.f41142O = null;
            this.f41143P = null;
            this.f41175m = 0;
            this.f41144Q = null;
            this.f41145R = null;
            this.f41176n = 0;
            this.f41146S = null;
            this.f41147T = null;
            this.f41177o = 0;
            this.f41148U = null;
            this.f41149V = null;
            this.f41178p = 0;
            this.f41150W = null;
            this.f41153Z = null;
            this.f41170i = 0.5f;
            this.f41172j = 0.5f;
            this.f41179q = 0;
            this.f41180r = 0;
            this.f41181s = 0;
            this.f41182t = 0;
            this.f41183u = 0;
            this.f41184v = 0;
        }
        return this;
    }

    public gu2 clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public gu2 clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public iu2 createConstraintWidget() {
        return new iu2(getWidth().m26653a(), getHeight().m26653a());
    }

    public gu2 end() {
        if (this.f41144Q != null) {
            this.f41159c0 = f2g.EnumC5563c.END_TO_START;
        } else {
            this.f41159c0 = f2g.EnumC5563c.END_TO_END;
        }
        return this;
    }

    public gu2 endToEnd(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.END_TO_END;
        this.f41145R = obj;
        return this;
    }

    public gu2 endToStart(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.END_TO_START;
        this.f41144Q = obj;
        return this;
    }

    public float getAlpha() {
        return this.f41134G;
    }

    @Override // p000.lvd
    public iu2 getConstraintWidget() {
        if (this.f41167g0 == null) {
            iu2 iu2VarCreateConstraintWidget = createConstraintWidget();
            this.f41167g0 = iu2VarCreateConstraintWidget;
            iu2VarCreateConstraintWidget.setCompanionWidget(this.f41165f0);
        }
        return this.f41167g0;
    }

    @Override // p000.lvd
    public eo5 getFacade() {
        return this.f41160d;
    }

    public zc4 getHeight() {
        return this.f41163e0;
    }

    public int getHorizontalChainStyle() {
        return this.f41162e;
    }

    public float getHorizontalChainWeight() {
        return this.f41166g;
    }

    @Override // p000.lvd
    public Object getKey() {
        return this.f41154a;
    }

    public float getPivotX() {
        return this.f41187y;
    }

    public float getPivotY() {
        return this.f41188z;
    }

    public float getRotationX() {
        return this.f41128A;
    }

    public float getRotationY() {
        return this.f41129B;
    }

    public float getRotationZ() {
        return this.f41130C;
    }

    public float getScaleX() {
        return this.f41135H;
    }

    public float getScaleY() {
        return this.f41136I;
    }

    public String getTag() {
        return this.f41158c;
    }

    public float getTranslationX() {
        return this.f41131D;
    }

    public float getTranslationY() {
        return this.f41132E;
    }

    public float getTranslationZ() {
        return this.f41133F;
    }

    public int getVerticalChainStyle(int i) {
        return this.f41164f;
    }

    public float getVerticalChainWeight() {
        return this.f41168h;
    }

    public Object getView() {
        return this.f41165f0;
    }

    public zc4 getWidth() {
        return this.f41161d0;
    }

    public gu2 height(zc4 zc4Var) {
        return setHeight(zc4Var);
    }

    public gu2 horizontalBias(float f) {
        this.f41170i = f;
        return this;
    }

    public gu2 left() {
        if (this.f41138K != null) {
            this.f41159c0 = f2g.EnumC5563c.LEFT_TO_LEFT;
        } else {
            this.f41159c0 = f2g.EnumC5563c.LEFT_TO_RIGHT;
        }
        return this;
    }

    public gu2 leftToLeft(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.LEFT_TO_LEFT;
        this.f41138K = obj;
        return this;
    }

    public gu2 leftToRight(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.LEFT_TO_RIGHT;
        this.f41139L = obj;
        return this;
    }

    public gu2 margin(Object obj) {
        return margin(this.f41156b.convertDimension(obj));
    }

    public gu2 marginGone(Object obj) {
        return marginGone(this.f41156b.convertDimension(obj));
    }

    public gu2 pivotX(float f) {
        this.f41187y = f;
        return this;
    }

    public gu2 pivotY(float f) {
        this.f41188z = f;
        return this;
    }

    public gu2 right() {
        if (this.f41140M != null) {
            this.f41159c0 = f2g.EnumC5563c.RIGHT_TO_LEFT;
        } else {
            this.f41159c0 = f2g.EnumC5563c.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public gu2 rightToLeft(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.RIGHT_TO_LEFT;
        this.f41140M = obj;
        return this;
    }

    public gu2 rightToRight(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.RIGHT_TO_RIGHT;
        this.f41141N = obj;
        return this;
    }

    public gu2 rotationX(float f) {
        this.f41128A = f;
        return this;
    }

    public gu2 rotationY(float f) {
        this.f41129B = f;
        return this;
    }

    public gu2 rotationZ(float f) {
        this.f41130C = f;
        return this;
    }

    public gu2 scaleX(float f) {
        this.f41135H = f;
        return this;
    }

    public gu2 scaleY(float f) {
        this.f41136I = f;
        return this;
    }

    @Override // p000.lvd
    public void setConstraintWidget(iu2 iu2Var) {
        if (iu2Var == null) {
            return;
        }
        this.f41167g0 = iu2Var;
        iu2Var.setCompanionWidget(this.f41165f0);
    }

    public void setFacade(eo5 eo5Var) {
        this.f41160d = eo5Var;
        if (eo5Var != null) {
            setConstraintWidget(eo5Var.getConstraintWidget());
        }
    }

    public gu2 setHeight(zc4 zc4Var) {
        this.f41163e0 = zc4Var;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        this.f41162e = i;
    }

    public void setHorizontalChainWeight(float f) {
        this.f41166g = f;
    }

    @Override // p000.lvd
    public void setKey(Object obj) {
        this.f41154a = obj;
    }

    public void setTag(String str) {
        this.f41158c = str;
    }

    public void setVerticalChainStyle(int i) {
        this.f41164f = i;
    }

    public void setVerticalChainWeight(float f) {
        this.f41168h = f;
    }

    public void setView(Object obj) {
        this.f41165f0 = obj;
        iu2 iu2Var = this.f41167g0;
        if (iu2Var != null) {
            iu2Var.setCompanionWidget(obj);
        }
    }

    public gu2 setWidth(zc4 zc4Var) {
        this.f41161d0 = zc4Var;
        return this;
    }

    public gu2 start() {
        if (this.f41142O != null) {
            this.f41159c0 = f2g.EnumC5563c.START_TO_START;
        } else {
            this.f41159c0 = f2g.EnumC5563c.START_TO_END;
        }
        return this;
    }

    public gu2 startToEnd(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.START_TO_END;
        this.f41143P = obj;
        return this;
    }

    public gu2 startToStart(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.START_TO_START;
        this.f41142O = obj;
        return this;
    }

    public gu2 top() {
        if (this.f41146S != null) {
            this.f41159c0 = f2g.EnumC5563c.TOP_TO_TOP;
        } else {
            this.f41159c0 = f2g.EnumC5563c.TOP_TO_BOTTOM;
        }
        return this;
    }

    public gu2 topToBottom(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.TOP_TO_BOTTOM;
        this.f41147T = obj;
        return this;
    }

    public gu2 topToTop(Object obj) {
        this.f41159c0 = f2g.EnumC5563c.TOP_TO_TOP;
        this.f41146S = obj;
        return this;
    }

    public gu2 translationX(float f) {
        this.f41131D = f;
        return this;
    }

    public gu2 translationY(float f) {
        this.f41132E = f;
        return this;
    }

    public gu2 translationZ(float f) {
        this.f41133F = f;
        return this;
    }

    public void validate() throws C6547c {
        ArrayList arrayList = new ArrayList();
        if (this.f41138K != null && this.f41139L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f41140M != null && this.f41141N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f41142O != null && this.f41143P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f41144Q != null && this.f41145R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f41138K != null || this.f41139L != null || this.f41140M != null || this.f41141N != null) && (this.f41142O != null || this.f41143P != null || this.f41144Q != null || this.f41145R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new C6547c(arrayList);
        }
    }

    public gu2 verticalBias(float f) {
        this.f41172j = f;
        return this;
    }

    public gu2 visibility(int i) {
        this.f41137J = i;
        return this;
    }

    public gu2 width(zc4 zc4Var) {
        return setWidth(zc4Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public gu2 margin(int i) {
        f2g.EnumC5563c enumC5563c = this.f41159c0;
        if (enumC5563c != null) {
            switch (C6545a.f41189a[enumC5563c.ordinal()]) {
                case 1:
                case 2:
                    this.f41173k = i;
                    break;
                case 3:
                case 4:
                    this.f41174l = i;
                    break;
                case 5:
                case 6:
                    this.f41175m = i;
                    break;
                case 7:
                case 8:
                    this.f41176n = i;
                    break;
                case 9:
                case 10:
                    this.f41177o = i;
                    break;
                case 11:
                case 12:
                    this.f41178p = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f41185w = i;
                    break;
                case 16:
                    this.f41157b0 = i;
                    break;
            }
        } else {
            this.f41173k = i;
            this.f41174l = i;
            this.f41175m = i;
            this.f41176n = i;
            this.f41177o = i;
            this.f41178p = i;
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public gu2 marginGone(int i) {
        f2g.EnumC5563c enumC5563c = this.f41159c0;
        if (enumC5563c != null) {
            switch (C6545a.f41189a[enumC5563c.ordinal()]) {
                case 1:
                case 2:
                    this.f41179q = i;
                    break;
                case 3:
                case 4:
                    this.f41180r = i;
                    break;
                case 5:
                case 6:
                    this.f41181s = i;
                    break;
                case 7:
                case 8:
                    this.f41182t = i;
                    break;
                case 9:
                case 10:
                    this.f41183u = i;
                    break;
                case 11:
                case 12:
                    this.f41184v = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f41186x = i;
                    break;
            }
        } else {
            this.f41179q = i;
            this.f41180r = i;
            this.f41181s = i;
            this.f41182t = i;
            this.f41183u = i;
            this.f41184v = i;
        }
        return this;
    }
}
