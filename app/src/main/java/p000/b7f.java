package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class b7f {

    /* JADX INFO: renamed from: e */
    public static final int f12911e = 65536;

    /* JADX INFO: renamed from: f */
    public static final int f12912f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f12913g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f12914h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f12915i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f12916j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f12917k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f12918l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f12919m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f12920n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f12921o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f12922p = 5;

    /* JADX INFO: renamed from: q */
    public static final int f12923q = 6;

    /* JADX INFO: renamed from: r */
    public static final int f12924r = 6;

    /* JADX INFO: renamed from: s */
    public static final int f12925s = 7;

    /* JADX INFO: renamed from: t */
    public static final int f12926t = 8;

    /* JADX INFO: renamed from: u */
    public static final int f12927u = 10;

    /* JADX INFO: renamed from: v */
    public static final int f12928v = 10;

    /* JADX INFO: renamed from: w */
    public static final int f12929w = 1;

    /* JADX INFO: renamed from: a */
    public int f12930a;

    /* JADX INFO: renamed from: b */
    public int f12931b;

    /* JADX INFO: renamed from: c */
    public int f12932c;

    /* JADX INFO: renamed from: d */
    public final int[] f12933d = new int[10];

    /* JADX INFO: renamed from: a */
    public void m2971a() {
        this.f12932c = 0;
        this.f12931b = 0;
        this.f12930a = 0;
        Arrays.fill(this.f12933d, 0);
    }

    /* JADX INFO: renamed from: b */
    public int m2972b(int i) {
        int i2 = m2986p(i) ? 2 : 0;
        return m2988r(i) ? i2 | 1 : i2;
    }

    /* JADX INFO: renamed from: c */
    public int m2973c(int i) {
        return (this.f12930a & 256) != 0 ? this.f12933d[8] : i;
    }

    /* JADX INFO: renamed from: d */
    public int m2974d(int i) {
        return (this.f12930a & 32) != 0 ? this.f12933d[5] : i;
    }

    /* JADX INFO: renamed from: e */
    public int m2975e(int i) {
        return (this.f12930a & 4) != 0 ? this.f12933d[2] : i;
    }

    /* JADX INFO: renamed from: f */
    public int m2976f(int i) {
        return (this.f12930a & 64) != 0 ? this.f12933d[6] : i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m2977g(boolean z) {
        return ((this.f12930a & 4) != 0 ? this.f12933d[2] : z ? 1 : 0) == 1;
    }

    public int get(int i) {
        return this.f12933d[i];
    }

    /* JADX INFO: renamed from: h */
    public int m2978h() {
        if ((this.f12930a & 2) != 0) {
            return this.f12933d[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public int m2979i(int i) {
        return (this.f12930a & 128) != 0 ? this.f12933d[7] : i;
    }

    public boolean isSet(int i) {
        return ((1 << i) & this.f12930a) != 0;
    }

    /* JADX INFO: renamed from: j */
    public int m2980j(int i) {
        return (this.f12930a & 16) != 0 ? this.f12933d[4] : i;
    }

    /* JADX INFO: renamed from: k */
    public int m2981k(int i) {
        return (this.f12930a & 32) != 0 ? this.f12933d[5] : i;
    }

    /* JADX INFO: renamed from: l */
    public int m2982l(int i) {
        return (this.f12930a & 64) != 0 ? this.f12933d[6] : i;
    }

    /* JADX INFO: renamed from: m */
    public int m2983m(int i) {
        return (this.f12930a & 8) != 0 ? this.f12933d[3] : i;
    }

    /* JADX INFO: renamed from: n */
    public int m2984n(int i) {
        return (this.f12930a & 2) != 0 ? this.f12933d[1] : i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m2985o() {
        return (((this.f12930a & 1024) != 0 ? this.f12933d[10] : 0) & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m2986p(int i) {
        return ((1 << i) & this.f12932c) != 0;
    }

    /* JADX INFO: renamed from: q */
    public void m2987q(b7f b7fVar) {
        for (int i = 0; i < 10; i++) {
            if (b7fVar.isSet(i)) {
                set(i, b7fVar.m2972b(i), b7fVar.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m2988r(int i) {
        return ((1 << i) & this.f12931b) != 0;
    }

    /* JADX INFO: renamed from: s */
    public int m2989s() {
        return Integer.bitCount(this.f12930a);
    }

    public b7f set(int i, int i2, int i3) {
        int[] iArr = this.f12933d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f12930a |= i4;
        if ((i2 & 1) != 0) {
            this.f12931b |= i4;
        } else {
            this.f12931b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f12932c |= i4;
        } else {
            this.f12932c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }
}
