package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class v40 extends db3 {

    /* JADX INFO: renamed from: g */
    public static final int f89860g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f89861h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f89862i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f89863j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f89864k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f89865l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f89866m = 3;

    /* JADX INFO: renamed from: d */
    public final double[] f89867d;

    /* JADX INFO: renamed from: e */
    public C13858a[] f89868e;

    /* JADX INFO: renamed from: f */
    public boolean f89869f = true;

    /* JADX INFO: renamed from: v40$a */
    public static class C13858a {

        /* JADX INFO: renamed from: s */
        public static final String f89870s = "Arc";

        /* JADX INFO: renamed from: t */
        public static double[] f89871t = new double[91];

        /* JADX INFO: renamed from: u */
        public static final double f89872u = 0.001d;

        /* JADX INFO: renamed from: a */
        public double[] f89873a;

        /* JADX INFO: renamed from: b */
        public double f89874b;

        /* JADX INFO: renamed from: c */
        public double f89875c;

        /* JADX INFO: renamed from: d */
        public double f89876d;

        /* JADX INFO: renamed from: e */
        public double f89877e;

        /* JADX INFO: renamed from: f */
        public double f89878f;

        /* JADX INFO: renamed from: g */
        public double f89879g;

        /* JADX INFO: renamed from: h */
        public double f89880h;

        /* JADX INFO: renamed from: i */
        public double f89881i;

        /* JADX INFO: renamed from: j */
        public double f89882j;

        /* JADX INFO: renamed from: k */
        public double f89883k;

        /* JADX INFO: renamed from: l */
        public double f89884l;

        /* JADX INFO: renamed from: m */
        public double f89885m;

        /* JADX INFO: renamed from: n */
        public double f89886n;

        /* JADX INFO: renamed from: o */
        public double f89887o;

        /* JADX INFO: renamed from: p */
        public double f89888p;

        /* JADX INFO: renamed from: q */
        public boolean f89889q;

        /* JADX INFO: renamed from: r */
        public boolean f89890r;

        public C13858a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f89890r = false;
            this.f89889q = i == 1;
            this.f89875c = d;
            this.f89876d = d2;
            this.f89881i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f89890r = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.f89890r && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f89873a = new double[101];
                boolean z = this.f89889q;
                this.f89882j = d7 * ((double) (z ? -1 : 1));
                this.f89883k = d8 * ((double) (z ? 1 : -1));
                this.f89884l = z ? d5 : d3;
                this.f89885m = z ? d4 : d6;
                buildTable(d3, d4, d5, d6);
                this.f89886n = this.f89874b * this.f89881i;
                return;
            }
            this.f89890r = true;
            this.f89877e = d3;
            this.f89878f = d5;
            this.f89879g = d4;
            this.f89880h = d6;
            double dHypot = Math.hypot(d8, d7);
            this.f89874b = dHypot;
            this.f89886n = dHypot * this.f89881i;
            double d9 = this.f89876d;
            double d10 = this.f89875c;
            this.f89884l = d7 / (d9 - d10);
            this.f89885m = d8 / (d9 - d10);
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double dHypot;
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            while (true) {
                if (i >= f89871t.length) {
                    break;
                }
                double d10 = d7;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i > 0) {
                    dHypot = Math.hypot(dSin - d8, dCos - d9) + d10;
                    f89871t[i] = dHypot;
                } else {
                    dHypot = d10;
                }
                i++;
                d9 = dCos;
                d7 = dHypot;
                d8 = dSin;
            }
            double d11 = d7;
            this.f89874b = d11;
            int i2 = 0;
            while (true) {
                double[] dArr = f89871t;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] / d11;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f89873a.length) {
                    return;
                }
                double length = ((double) i3) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f89871t, length);
                if (iBinarySearch >= 0) {
                    this.f89873a[i3] = ((double) iBinarySearch) / ((double) (f89871t.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f89873a[i3] = 0.0d;
                } else {
                    int i4 = -iBinarySearch;
                    int i5 = i4 - 2;
                    double[] dArr2 = f89871t;
                    double d12 = dArr2[i5];
                    this.f89873a[i3] = (((double) i5) + ((length - d12) / (dArr2[i4 - 1] - d12))) / ((double) (dArr2.length - 1));
                }
                i3++;
            }
        }

        /* JADX INFO: renamed from: a */
        public double m23766a() {
            double d = this.f89882j * this.f89888p;
            double dHypot = this.f89886n / Math.hypot(d, (-this.f89883k) * this.f89887o);
            if (this.f89889q) {
                d = -d;
            }
            return d * dHypot;
        }

        /* JADX INFO: renamed from: b */
        public double m23767b() {
            double d = this.f89882j * this.f89888p;
            double d2 = (-this.f89883k) * this.f89887o;
            double dHypot = this.f89886n / Math.hypot(d, d2);
            return this.f89889q ? (-d2) * dHypot : d2 * dHypot;
        }

        /* JADX INFO: renamed from: c */
        public double m23768c() {
            return this.f89884l + (this.f89882j * this.f89887o);
        }

        /* JADX INFO: renamed from: d */
        public double m23769d() {
            return this.f89885m + (this.f89883k * this.f89888p);
        }

        /* JADX INFO: renamed from: e */
        public double m23770e(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f89873a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* JADX INFO: renamed from: f */
        public void m23771f(double d) {
            double dM23770e = m23770e((this.f89889q ? this.f89876d - d : d - this.f89875c) * this.f89881i) * 1.5707963267948966d;
            this.f89887o = Math.sin(dM23770e);
            this.f89888p = Math.cos(dM23770e);
        }

        public double getLinearDX(double d) {
            return this.f89884l;
        }

        public double getLinearDY(double d) {
            return this.f89885m;
        }

        public double getLinearX(double d) {
            double d2 = (d - this.f89875c) * this.f89881i;
            double d3 = this.f89877e;
            return d3 + (d2 * (this.f89878f - d3));
        }

        public double getLinearY(double d) {
            double d2 = (d - this.f89875c) * this.f89881i;
            double d3 = this.f89879g;
            return d3 + (d2 * (this.f89880h - d3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v40(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f89869f = r2
            r0.f89867d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            v40$a[] r3 = new p000.v40.C13858a[r3]
            r0.f89868e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            v40$a[] r7 = r0.f89868e
            int r8 = r7.length
            if (r4 >= r8) goto L51
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L31
            if (r8 == r2) goto L2f
            r10 = 2
            if (r8 == r10) goto L2d
            if (r8 == r9) goto L28
            goto L32
        L28:
            if (r5 != r2) goto L2f
            goto L2d
        L2b:
            r6 = r5
            goto L32
        L2d:
            r5 = r10
            goto L2b
        L2f:
            r5 = r2
            goto L2b
        L31:
            r6 = r9
        L32:
            v40$a r22 = new v40$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v40.<init>(int[], double[], double[][]):void");
    }

    @Override // p000.db3
    public void getPos(double d, double[] dArr) {
        if (this.f89869f) {
            C13858a[] c13858aArr = this.f89868e;
            C13858a c13858a = c13858aArr[0];
            double d2 = c13858a.f89875c;
            if (d < d2) {
                double d3 = d - d2;
                if (c13858a.f89890r) {
                    dArr[0] = c13858a.getLinearX(d2) + (this.f89868e[0].getLinearDX(d2) * d3);
                    dArr[1] = this.f89868e[0].getLinearY(d2) + (d3 * this.f89868e[0].getLinearDY(d2));
                    return;
                } else {
                    c13858a.m23771f(d2);
                    dArr[0] = this.f89868e[0].m23768c() + (this.f89868e[0].m23766a() * d3);
                    dArr[1] = this.f89868e[0].m23769d() + (d3 * this.f89868e[0].m23767b());
                    return;
                }
            }
            if (d > c13858aArr[c13858aArr.length - 1].f89876d) {
                double d4 = c13858aArr[c13858aArr.length - 1].f89876d;
                double d5 = d - d4;
                int length = c13858aArr.length - 1;
                C13858a c13858a2 = c13858aArr[length];
                if (c13858a2.f89890r) {
                    dArr[0] = c13858a2.getLinearX(d4) + (this.f89868e[length].getLinearDX(d4) * d5);
                    dArr[1] = this.f89868e[length].getLinearY(d4) + (d5 * this.f89868e[length].getLinearDY(d4));
                    return;
                } else {
                    c13858a2.m23771f(d);
                    dArr[0] = this.f89868e[length].m23768c() + (this.f89868e[length].m23766a() * d5);
                    dArr[1] = this.f89868e[length].m23769d() + (d5 * this.f89868e[length].m23767b());
                    return;
                }
            }
        } else {
            C13858a[] c13858aArr2 = this.f89868e;
            double d6 = c13858aArr2[0].f89875c;
            if (d < d6) {
                d = d6;
            }
            if (d > c13858aArr2[c13858aArr2.length - 1].f89876d) {
                d = c13858aArr2[c13858aArr2.length - 1].f89876d;
            }
        }
        int i = 0;
        while (true) {
            C13858a[] c13858aArr3 = this.f89868e;
            if (i >= c13858aArr3.length) {
                return;
            }
            C13858a c13858a3 = c13858aArr3[i];
            if (d <= c13858a3.f89876d) {
                if (c13858a3.f89890r) {
                    dArr[0] = c13858a3.getLinearX(d);
                    dArr[1] = this.f89868e[i].getLinearY(d);
                    return;
                } else {
                    c13858a3.m23771f(d);
                    dArr[0] = this.f89868e[i].m23768c();
                    dArr[1] = this.f89868e[i].m23769d();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p000.db3
    public void getSlope(double d, double[] dArr) {
        C13858a[] c13858aArr = this.f89868e;
        double d2 = c13858aArr[0].f89875c;
        if (d < d2) {
            d = d2;
        } else if (d > c13858aArr[c13858aArr.length - 1].f89876d) {
            d = c13858aArr[c13858aArr.length - 1].f89876d;
        }
        int i = 0;
        while (true) {
            C13858a[] c13858aArr2 = this.f89868e;
            if (i >= c13858aArr2.length) {
                return;
            }
            C13858a c13858a = c13858aArr2[i];
            if (d <= c13858a.f89876d) {
                if (c13858a.f89890r) {
                    dArr[0] = c13858a.getLinearDX(d);
                    dArr[1] = this.f89868e[i].getLinearDY(d);
                    return;
                } else {
                    c13858a.m23771f(d);
                    dArr[0] = this.f89868e[i].m23766a();
                    dArr[1] = this.f89868e[i].m23767b();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p000.db3
    public double[] getTimePoints() {
        return this.f89867d;
    }

    @Override // p000.db3
    public double getSlope(double d, int i) {
        C13858a[] c13858aArr = this.f89868e;
        int i2 = 0;
        double d2 = c13858aArr[0].f89875c;
        if (d < d2) {
            d = d2;
        }
        if (d > c13858aArr[c13858aArr.length - 1].f89876d) {
            d = c13858aArr[c13858aArr.length - 1].f89876d;
        }
        while (true) {
            C13858a[] c13858aArr2 = this.f89868e;
            if (i2 >= c13858aArr2.length) {
                return Double.NaN;
            }
            C13858a c13858a = c13858aArr2[i2];
            if (d <= c13858a.f89876d) {
                if (c13858a.f89890r) {
                    if (i == 0) {
                        return c13858a.getLinearDX(d);
                    }
                    return c13858a.getLinearDY(d);
                }
                c13858a.m23771f(d);
                if (i == 0) {
                    return this.f89868e[i2].m23766a();
                }
                return this.f89868e[i2].m23767b();
            }
            i2++;
        }
    }

    @Override // p000.db3
    public void getPos(double d, float[] fArr) {
        if (this.f89869f) {
            C13858a[] c13858aArr = this.f89868e;
            C13858a c13858a = c13858aArr[0];
            double d2 = c13858a.f89875c;
            if (d < d2) {
                double d3 = d - d2;
                if (c13858a.f89890r) {
                    fArr[0] = (float) (c13858a.getLinearX(d2) + (this.f89868e[0].getLinearDX(d2) * d3));
                    fArr[1] = (float) (this.f89868e[0].getLinearY(d2) + (d3 * this.f89868e[0].getLinearDY(d2)));
                    return;
                } else {
                    c13858a.m23771f(d2);
                    fArr[0] = (float) (this.f89868e[0].m23768c() + (this.f89868e[0].m23766a() * d3));
                    fArr[1] = (float) (this.f89868e[0].m23769d() + (d3 * this.f89868e[0].m23767b()));
                    return;
                }
            }
            if (d > c13858aArr[c13858aArr.length - 1].f89876d) {
                double d4 = c13858aArr[c13858aArr.length - 1].f89876d;
                double d5 = d - d4;
                int length = c13858aArr.length - 1;
                C13858a c13858a2 = c13858aArr[length];
                if (c13858a2.f89890r) {
                    fArr[0] = (float) (c13858a2.getLinearX(d4) + (this.f89868e[length].getLinearDX(d4) * d5));
                    fArr[1] = (float) (this.f89868e[length].getLinearY(d4) + (d5 * this.f89868e[length].getLinearDY(d4)));
                    return;
                } else {
                    c13858a2.m23771f(d);
                    fArr[0] = (float) this.f89868e[length].m23768c();
                    fArr[1] = (float) this.f89868e[length].m23769d();
                    return;
                }
            }
        } else {
            C13858a[] c13858aArr2 = this.f89868e;
            double d6 = c13858aArr2[0].f89875c;
            if (d < d6) {
                d = d6;
            } else if (d > c13858aArr2[c13858aArr2.length - 1].f89876d) {
                d = c13858aArr2[c13858aArr2.length - 1].f89876d;
            }
        }
        int i = 0;
        while (true) {
            C13858a[] c13858aArr3 = this.f89868e;
            if (i >= c13858aArr3.length) {
                return;
            }
            C13858a c13858a3 = c13858aArr3[i];
            if (d <= c13858a3.f89876d) {
                if (c13858a3.f89890r) {
                    fArr[0] = (float) c13858a3.getLinearX(d);
                    fArr[1] = (float) this.f89868e[i].getLinearY(d);
                    return;
                } else {
                    c13858a3.m23771f(d);
                    fArr[0] = (float) this.f89868e[i].m23768c();
                    fArr[1] = (float) this.f89868e[i].m23769d();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p000.db3
    public double getPos(double d, int i) {
        double linearY;
        double linearDY;
        double dM23769d;
        double dM23767b;
        double linearY2;
        double linearDY2;
        int i2 = 0;
        if (this.f89869f) {
            C13858a[] c13858aArr = this.f89868e;
            C13858a c13858a = c13858aArr[0];
            double d2 = c13858a.f89875c;
            if (d < d2) {
                double d3 = d - d2;
                if (c13858a.f89890r) {
                    if (i == 0) {
                        linearY2 = c13858a.getLinearX(d2);
                        linearDY2 = this.f89868e[0].getLinearDX(d2);
                    } else {
                        linearY2 = c13858a.getLinearY(d2);
                        linearDY2 = this.f89868e[0].getLinearDY(d2);
                    }
                    return linearY2 + (d3 * linearDY2);
                }
                c13858a.m23771f(d2);
                if (i == 0) {
                    dM23769d = this.f89868e[0].m23768c();
                    dM23767b = this.f89868e[0].m23766a();
                } else {
                    dM23769d = this.f89868e[0].m23769d();
                    dM23767b = this.f89868e[0].m23767b();
                }
                return dM23769d + (d3 * dM23767b);
            }
            if (d > c13858aArr[c13858aArr.length - 1].f89876d) {
                double d4 = c13858aArr[c13858aArr.length - 1].f89876d;
                double d5 = d - d4;
                int length = c13858aArr.length - 1;
                if (i == 0) {
                    linearY = c13858aArr[length].getLinearX(d4);
                    linearDY = this.f89868e[length].getLinearDX(d4);
                } else {
                    linearY = c13858aArr[length].getLinearY(d4);
                    linearDY = this.f89868e[length].getLinearDY(d4);
                }
                return linearY + (d5 * linearDY);
            }
        } else {
            C13858a[] c13858aArr2 = this.f89868e;
            double d6 = c13858aArr2[0].f89875c;
            if (d < d6) {
                d = d6;
            } else if (d > c13858aArr2[c13858aArr2.length - 1].f89876d) {
                d = c13858aArr2[c13858aArr2.length - 1].f89876d;
            }
        }
        while (true) {
            C13858a[] c13858aArr3 = this.f89868e;
            if (i2 >= c13858aArr3.length) {
                return Double.NaN;
            }
            C13858a c13858a2 = c13858aArr3[i2];
            if (d <= c13858a2.f89876d) {
                if (c13858a2.f89890r) {
                    if (i == 0) {
                        return c13858a2.getLinearX(d);
                    }
                    return c13858a2.getLinearY(d);
                }
                c13858a2.m23771f(d);
                if (i == 0) {
                    return this.f89868e[i2].m23768c();
                }
                return this.f89868e[i2].m23769d();
            }
            i2++;
        }
    }
}
