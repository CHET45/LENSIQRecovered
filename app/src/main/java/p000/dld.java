package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class dld implements ykd {

    /* JADX INFO: renamed from: g */
    public static final int f29959g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f29960h = 33;

    /* JADX INFO: renamed from: i */
    public static final int f29961i = 35937;

    /* JADX INFO: renamed from: a */
    public int[] f29962a;

    /* JADX INFO: renamed from: b */
    public int[] f29963b;

    /* JADX INFO: renamed from: c */
    public int[] f29964c;

    /* JADX INFO: renamed from: d */
    public int[] f29965d;

    /* JADX INFO: renamed from: e */
    public double[] f29966e;

    /* JADX INFO: renamed from: f */
    public C4849b[] f29967f;

    /* JADX INFO: renamed from: dld$a */
    public static /* synthetic */ class C4848a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29968a;

        static {
            int[] iArr = new int[EnumC4851d.values().length];
            f29968a = iArr;
            try {
                iArr[EnumC4851d.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29968a[EnumC4851d.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29968a[EnumC4851d.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: dld$c */
    public static final class C4850c {

        /* JADX INFO: renamed from: a */
        public int f29976a;

        public C4850c(int i, int i2) {
            this.f29976a = i2;
        }
    }

    /* JADX INFO: renamed from: dld$d */
    public enum EnumC4851d {
        RED,
        GREEN,
        BLUE
    }

    /* JADX INFO: renamed from: dld$e */
    public static final class C4852e {

        /* JADX INFO: renamed from: a */
        public int f29981a;

        /* JADX INFO: renamed from: b */
        public double f29982b;

        public C4852e(int i, double d) {
            this.f29981a = i;
            this.f29982b = d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9222a(C4849b c4849b, EnumC4851d enumC4851d, int[] iArr) {
        int i;
        int i2;
        int i3 = C4848a.f29968a[enumC4851d.ordinal()];
        if (i3 == 1) {
            i = (-iArr[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29974f)]) + iArr[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29973e)] + iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29974f)];
            i2 = iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29973e)];
        } else if (i3 == 2) {
            i = (-iArr[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29974f)]) + iArr[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29973e)] + iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29974f)];
            i2 = iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29973e)];
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException("unexpected direction " + enumC4851d);
            }
            i = (-iArr[m9223g(c4849b.f29970b, c4849b.f29972d, c4849b.f29973e)]) + iArr[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29973e)] + iArr[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29973e)];
            i2 = iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29973e)];
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m9223g(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    /* JADX INFO: renamed from: i */
    public static int m9224i(C4849b c4849b, EnumC4851d enumC4851d, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = C4848a.f29968a[enumC4851d.ordinal()];
        if (i4 == 1) {
            i2 = (iArr[m9223g(i, c4849b.f29972d, c4849b.f29974f)] - iArr[m9223g(i, c4849b.f29972d, c4849b.f29973e)]) - iArr[m9223g(i, c4849b.f29971c, c4849b.f29974f)];
            i3 = iArr[m9223g(i, c4849b.f29971c, c4849b.f29973e)];
        } else if (i4 == 2) {
            i2 = (iArr[m9223g(c4849b.f29970b, i, c4849b.f29974f)] - iArr[m9223g(c4849b.f29970b, i, c4849b.f29973e)]) - iArr[m9223g(c4849b.f29969a, i, c4849b.f29974f)];
            i3 = iArr[m9223g(c4849b.f29969a, i, c4849b.f29973e)];
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException("unexpected direction " + enumC4851d);
            }
            i2 = (iArr[m9223g(c4849b.f29970b, c4849b.f29972d, i)] - iArr[m9223g(c4849b.f29970b, c4849b.f29971c, i)]) - iArr[m9223g(c4849b.f29969a, c4849b.f29972d, i)];
            i3 = iArr[m9223g(c4849b.f29969a, c4849b.f29971c, i)];
        }
        return i2 + i3;
    }

    /* JADX INFO: renamed from: k */
    public static int m9225k(C4849b c4849b, int[] iArr) {
        return ((((((iArr[m9223g(c4849b.f29970b, c4849b.f29972d, c4849b.f29974f)] - iArr[m9223g(c4849b.f29970b, c4849b.f29972d, c4849b.f29973e)]) - iArr[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29974f)]) + iArr[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29973e)]) - iArr[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29974f)]) + iArr[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29973e)]) + iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29974f)]) - iArr[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29973e)];
    }

    /* JADX INFO: renamed from: b */
    public void m9226b(Map<Integer, Integer> map) {
        this.f29962a = new int[f29961i];
        this.f29963b = new int[f29961i];
        this.f29964c = new int[f29961i];
        this.f29965d = new int[f29961i];
        this.f29966e = new double[f29961i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = xa2.redFromArgb(iIntValue);
            int iGreenFromArgb = xa2.greenFromArgb(iIntValue);
            int iBlueFromArgb = xa2.blueFromArgb(iIntValue);
            int iM9223g = m9223g((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.f29962a;
            iArr[iM9223g] = iArr[iM9223g] + iIntValue2;
            int[] iArr2 = this.f29963b;
            iArr2[iM9223g] = iArr2[iM9223g] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.f29964c;
            iArr3[iM9223g] = iArr3[iM9223g] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.f29965d;
            iArr4[iM9223g] = iArr4[iM9223g] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.f29966e;
            dArr[iM9223g] = dArr[iM9223g] + ((double) (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb))));
        }
    }

    /* JADX INFO: renamed from: c */
    public C4850c m9227c(int i) {
        int i2;
        this.f29967f = new C4849b[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f29967f[i3] = new C4849b(null);
        }
        double[] dArr = new double[i];
        C4849b c4849b = this.f29967f[0];
        c4849b.f29970b = 32;
        c4849b.f29972d = 32;
        c4849b.f29974f = 32;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i5 >= i) {
                i2 = i;
                break;
            }
            C4849b[] c4849bArr = this.f29967f;
            if (m9230f(c4849bArr[i4], c4849bArr[i5]).booleanValue()) {
                C4849b c4849b2 = this.f29967f[i4];
                dArr[i4] = c4849b2.f29975g > 1 ? m9232j(c4849b2) : 0.0d;
                C4849b c4849b3 = this.f29967f[i5];
                dArr[i5] = c4849b3.f29975g > 1 ? m9232j(c4849b3) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= 0.0d) {
                i2 = i5 + 1;
                break;
            }
            i5++;
            i4 = i6;
        }
        return new C4850c(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m9228d() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int iM9223g = m9223g(i, i3, i6);
                    int i9 = i4 + this.f29962a[iM9223g];
                    i7 += this.f29963b[iM9223g];
                    i8 += this.f29964c[iM9223g];
                    i5 += this.f29965d[iM9223g];
                    d += this.f29966e[iM9223g];
                    iArr[i6] = iArr[i6] + i9;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int iM9223g2 = m9223g(i - 1, i3, i6);
                    int[] iArr5 = this.f29962a;
                    iArr5[iM9223g] = iArr5[iM9223g2] + iArr[i6];
                    int[] iArr6 = this.f29963b;
                    iArr6[iM9223g] = iArr6[iM9223g2] + iArr2[i6];
                    int[] iArr7 = this.f29964c;
                    iArr7[iM9223g] = iArr7[iM9223g2] + iArr3[i6];
                    int[] iArr8 = this.f29965d;
                    iArr8[iM9223g] = iArr8[iM9223g2] + iArr4[i6];
                    double[] dArr2 = this.f29966e;
                    dArr2[iM9223g] = dArr2[iM9223g2] + dArr[i6];
                    i6++;
                    i4 = i9;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public List<Integer> m9229e(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C4849b c4849b = this.f29967f[i2];
            int iM9225k = m9225k(c4849b, this.f29962a);
            if (iM9225k > 0) {
                int iM9225k2 = m9225k(c4849b, this.f29963b) / iM9225k;
                int iM9225k3 = m9225k(c4849b, this.f29964c) / iM9225k;
                arrayList.add(Integer.valueOf(((m9225k(c4849b, this.f29965d) / iM9225k) & 255) | ((iM9225k2 & 255) << 16) | (-16777216) | ((iM9225k3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public Boolean m9230f(C4849b c4849b, C4849b c4849b2) {
        int iM9225k = m9225k(c4849b, this.f29963b);
        int iM9225k2 = m9225k(c4849b, this.f29964c);
        int iM9225k3 = m9225k(c4849b, this.f29965d);
        int iM9225k4 = m9225k(c4849b, this.f29962a);
        EnumC4851d enumC4851d = EnumC4851d.RED;
        C4852e c4852eM9231h = m9231h(c4849b, enumC4851d, c4849b.f29969a + 1, c4849b.f29970b, iM9225k, iM9225k2, iM9225k3, iM9225k4);
        EnumC4851d enumC4851d2 = EnumC4851d.GREEN;
        C4852e c4852eM9231h2 = m9231h(c4849b, enumC4851d2, c4849b.f29971c + 1, c4849b.f29972d, iM9225k, iM9225k2, iM9225k3, iM9225k4);
        EnumC4851d enumC4851d3 = EnumC4851d.BLUE;
        C4852e c4852eM9231h3 = m9231h(c4849b, enumC4851d3, c4849b.f29973e + 1, c4849b.f29974f, iM9225k, iM9225k2, iM9225k3, iM9225k4);
        double d = c4852eM9231h.f29982b;
        double d2 = c4852eM9231h2.f29982b;
        double d3 = c4852eM9231h3.f29982b;
        if (d < d2 || d < d3) {
            enumC4851d = (d2 < d || d2 < d3) ? enumC4851d3 : enumC4851d2;
        } else if (c4852eM9231h.f29981a < 0) {
            return Boolean.FALSE;
        }
        c4849b2.f29970b = c4849b.f29970b;
        c4849b2.f29972d = c4849b.f29972d;
        c4849b2.f29974f = c4849b.f29974f;
        int i = C4848a.f29968a[enumC4851d.ordinal()];
        if (i == 1) {
            int i2 = c4852eM9231h.f29981a;
            c4849b.f29970b = i2;
            c4849b2.f29969a = i2;
            c4849b2.f29971c = c4849b.f29971c;
            c4849b2.f29973e = c4849b.f29973e;
        } else if (i == 2) {
            int i3 = c4852eM9231h2.f29981a;
            c4849b.f29972d = i3;
            c4849b2.f29969a = c4849b.f29969a;
            c4849b2.f29971c = i3;
            c4849b2.f29973e = c4849b.f29973e;
        } else if (i == 3) {
            int i4 = c4852eM9231h3.f29981a;
            c4849b.f29974f = i4;
            c4849b2.f29969a = c4849b.f29969a;
            c4849b2.f29971c = c4849b.f29971c;
            c4849b2.f29973e = i4;
        }
        c4849b.f29975g = (c4849b.f29970b - c4849b.f29969a) * (c4849b.f29972d - c4849b.f29971c) * (c4849b.f29974f - c4849b.f29973e);
        c4849b2.f29975g = (c4849b2.f29970b - c4849b2.f29969a) * (c4849b2.f29972d - c4849b2.f29971c) * (c4849b2.f29974f - c4849b2.f29973e);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: h */
    public C4852e m9231h(C4849b c4849b, EnumC4851d enumC4851d, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        dld dldVar = this;
        C4849b c4849b2 = c4849b;
        EnumC4851d enumC4851d2 = enumC4851d;
        int iM9222a = m9222a(c4849b2, enumC4851d2, dldVar.f29963b);
        int iM9222a2 = m9222a(c4849b2, enumC4851d2, dldVar.f29964c);
        int iM9222a3 = m9222a(c4849b2, enumC4851d2, dldVar.f29965d);
        int iM9222a4 = m9222a(c4849b2, enumC4851d2, dldVar.f29962a);
        int i8 = -1;
        double d = 0.0d;
        int i9 = i;
        while (i9 < i2) {
            int iM9224i = m9224i(c4849b2, enumC4851d2, i9, dldVar.f29963b) + iM9222a;
            int iM9224i2 = m9224i(c4849b2, enumC4851d2, i9, dldVar.f29964c) + iM9222a2;
            int iM9224i3 = m9224i(c4849b2, enumC4851d2, i9, dldVar.f29965d) + iM9222a3;
            int iM9224i4 = m9224i(c4849b2, enumC4851d2, i9, dldVar.f29962a) + iM9222a4;
            if (iM9224i4 == 0) {
                i7 = iM9222a;
            } else {
                i7 = iM9222a;
                double d2 = ((double) (((iM9224i * iM9224i) + (iM9224i2 * iM9224i2)) + (iM9224i3 * iM9224i3))) / ((double) iM9224i4);
                int i10 = i3 - iM9224i;
                int i11 = i4 - iM9224i2;
                int i12 = i5 - iM9224i3;
                int i13 = i6 - iM9224i4;
                if (i13 != 0) {
                    double d3 = d2 + (((double) (((i10 * i10) + (i11 * i11)) + (i12 * i12))) / ((double) i13));
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            dldVar = this;
            c4849b2 = c4849b;
            enumC4851d2 = enumC4851d;
            iM9222a = i7;
        }
        return new C4852e(i8, d);
    }

    /* JADX INFO: renamed from: j */
    public double m9232j(C4849b c4849b) {
        int iM9225k = m9225k(c4849b, this.f29963b);
        int iM9225k2 = m9225k(c4849b, this.f29964c);
        int iM9225k3 = m9225k(c4849b, this.f29965d);
        return (((((((this.f29966e[m9223g(c4849b.f29970b, c4849b.f29972d, c4849b.f29974f)] - this.f29966e[m9223g(c4849b.f29970b, c4849b.f29972d, c4849b.f29973e)]) - this.f29966e[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29974f)]) + this.f29966e[m9223g(c4849b.f29970b, c4849b.f29971c, c4849b.f29973e)]) - this.f29966e[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29974f)]) + this.f29966e[m9223g(c4849b.f29969a, c4849b.f29972d, c4849b.f29973e)]) + this.f29966e[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29974f)]) - this.f29966e[m9223g(c4849b.f29969a, c4849b.f29971c, c4849b.f29973e)]) - (((double) (((iM9225k * iM9225k) + (iM9225k2 * iM9225k2)) + (iM9225k3 * iM9225k3))) / ((double) m9225k(c4849b, this.f29962a)));
    }

    @Override // p000.ykd
    public bld quantize(int[] iArr, int i) {
        m9226b(new ald().quantize(iArr, i).f14066a);
        m9228d();
        List<Integer> listM9229e = m9229e(m9227c(i).f29976a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listM9229e) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new bld(linkedHashMap);
    }

    /* JADX INFO: renamed from: dld$b */
    public static final class C4849b {

        /* JADX INFO: renamed from: a */
        public int f29969a;

        /* JADX INFO: renamed from: b */
        public int f29970b;

        /* JADX INFO: renamed from: c */
        public int f29971c;

        /* JADX INFO: renamed from: d */
        public int f29972d;

        /* JADX INFO: renamed from: e */
        public int f29973e;

        /* JADX INFO: renamed from: f */
        public int f29974f;

        /* JADX INFO: renamed from: g */
        public int f29975g;

        private C4849b() {
            this.f29969a = 0;
            this.f29970b = 0;
            this.f29971c = 0;
            this.f29972d = 0;
            this.f29973e = 0;
            this.f29974f = 0;
            this.f29975g = 0;
        }

        public /* synthetic */ C4849b(C4848a c4848a) {
            this();
        }
    }
}
