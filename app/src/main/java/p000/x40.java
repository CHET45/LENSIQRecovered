package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@jg5
public final class x40 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C14914b f96224c = new C14914b(null);

    /* JADX INFO: renamed from: d */
    public static final int f96225d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f96226e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f96227f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f96228g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f96229h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f96230i = 5;

    /* JADX INFO: renamed from: j */
    public static final int f96231j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f96232k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f96233l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f96234m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f96235n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f96236o = 5;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C14913a[][] f96237a;

    /* JADX INFO: renamed from: b */
    public final boolean f96238b = true;

    /* JADX INFO: renamed from: x40$a */
    @e0g(parameters = 0)
    public static final class C14913a {

        /* JADX INFO: renamed from: s */
        @yfb
        public static final a f96239s = new a(null);

        /* JADX INFO: renamed from: t */
        public static final int f96240t = 8;

        /* JADX INFO: renamed from: u */
        @gib
        public static float[] f96241u = null;

        /* JADX INFO: renamed from: v */
        public static final float f96242v = 0.001f;

        /* JADX INFO: renamed from: a */
        public final float f96243a;

        /* JADX INFO: renamed from: b */
        public final float f96244b;

        /* JADX INFO: renamed from: c */
        public final float f96245c;

        /* JADX INFO: renamed from: d */
        public final float f96246d;

        /* JADX INFO: renamed from: e */
        public final float f96247e;

        /* JADX INFO: renamed from: f */
        public final float f96248f;

        /* JADX INFO: renamed from: g */
        public float f96249g;

        /* JADX INFO: renamed from: h */
        public float f96250h;

        /* JADX INFO: renamed from: i */
        public float f96251i;

        /* JADX INFO: renamed from: j */
        @yfb
        public final float[] f96252j;

        /* JADX INFO: renamed from: k */
        public final float f96253k;

        /* JADX INFO: renamed from: l */
        public final float f96254l;

        /* JADX INFO: renamed from: m */
        public final float f96255m;

        /* JADX INFO: renamed from: n */
        public final float f96256n;

        /* JADX INFO: renamed from: o */
        public final float f96257o;

        /* JADX INFO: renamed from: p */
        public final float f96258p;

        /* JADX INFO: renamed from: q */
        public final boolean f96259q;

        /* JADX INFO: renamed from: r */
        public final boolean f96260r;

        /* JADX INFO: renamed from: x40$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] getOurPercent() {
                if (C14913a.f96241u != null) {
                    float[] fArr = C14913a.f96241u;
                    md8.checkNotNull(fArr);
                    return fArr;
                }
                C14913a.f96241u = new float[91];
                float[] fArr2 = C14913a.f96241u;
                md8.checkNotNull(fArr2);
                return fArr2;
            }

            private a() {
            }
        }

        public C14913a(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.f96243a = f;
            this.f96244b = f2;
            this.f96245c = f3;
            this.f96246d = f4;
            this.f96247e = f5;
            this.f96248f = f6;
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            boolean z = true;
            boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
            this.f96259q = z2;
            float f9 = 1 / (f2 - f);
            this.f96253k = f9;
            boolean z3 = 3 == i;
            if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
                float fHypot = (float) Math.hypot(f8, f7);
                this.f96249g = fHypot;
                this.f96258p = fHypot * f9;
                this.f96256n = f7 / (f2 - f);
                this.f96257o = f8 / (f2 - f);
                this.f96252j = new float[101];
                this.f96254l = Float.NaN;
                this.f96255m = Float.NaN;
            } else {
                this.f96252j = new float[101];
                this.f96254l = f7 * (z2 ? -1 : 1);
                this.f96255m = f8 * (z2 ? 1 : -1);
                this.f96256n = z2 ? f5 : f3;
                this.f96257o = z2 ? f4 : f6;
                buildTable(f3, f4, f5, f6);
                this.f96258p = this.f96249g * f9;
                z = z3;
            }
            this.f96260r = z;
        }

        private final void buildTable(float f, float f2, float f3, float f4) {
            float f5 = f3 - f;
            float f6 = f2 - f4;
            int length = f96239s.getOurPercent().length;
            float fHypot = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            int i = 0;
            while (i < length) {
                a aVar = f96239s;
                double radians = (float) Math.toRadians((((double) i) * 90.0d) / ((double) (aVar.getOurPercent().length - 1)));
                float fSin = ((float) Math.sin(radians)) * f5;
                float fCos = ((float) Math.cos(radians)) * f6;
                if (i > 0) {
                    fHypot += (float) Math.hypot(fSin - f7, fCos - f8);
                    aVar.getOurPercent()[i] = fHypot;
                }
                i++;
                f8 = fCos;
                f7 = fSin;
            }
            this.f96249g = fHypot;
            int length2 = f96239s.getOurPercent().length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] ourPercent = f96239s.getOurPercent();
                ourPercent[i2] = ourPercent[i2] / fHypot;
            }
            int length3 = this.f96252j.length;
            for (int i3 = 0; i3 < length3; i3++) {
                float length4 = i3 / (this.f96252j.length - 1);
                a aVar2 = f96239s;
                int iBinarySearch$default = u70.binarySearch$default(aVar2.getOurPercent(), length4, 0, 0, 6, (Object) null);
                if (iBinarySearch$default >= 0) {
                    this.f96252j[i3] = iBinarySearch$default / (aVar2.getOurPercent().length - 1);
                } else if (iBinarySearch$default == -1) {
                    this.f96252j[i3] = 0.0f;
                } else {
                    int i4 = -iBinarySearch$default;
                    int i5 = i4 - 2;
                    this.f96252j[i3] = (i5 + ((length4 - aVar2.getOurPercent()[i5]) / (aVar2.getOurPercent()[i4 - 1] - aVar2.getOurPercent()[i5]))) / (aVar2.getOurPercent().length - 1);
                }
            }
        }

        private final float lookup(float f) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f96252j;
            float length = f * (fArr.length - 1);
            int i = (int) length;
            float f2 = length - i;
            float f3 = fArr[i];
            return f3 + (f2 * (fArr[i + 1] - f3));
        }

        public final float calcDX() {
            float f = this.f96254l * this.f96251i;
            float fHypot = this.f96258p / ((float) Math.hypot(f, (-this.f96255m) * this.f96250h));
            if (this.f96259q) {
                f = -f;
            }
            return f * fHypot;
        }

        public final float calcDY() {
            float f = this.f96254l * this.f96251i;
            float f2 = (-this.f96255m) * this.f96250h;
            float fHypot = this.f96258p / ((float) Math.hypot(f, f2));
            return this.f96259q ? (-f2) * fHypot : f2 * fHypot;
        }

        public final float calcX() {
            return this.f96256n + (this.f96254l * this.f96250h);
        }

        public final float calcY() {
            return this.f96257o + (this.f96255m * this.f96251i);
        }

        public final float getLinearDX() {
            return this.f96256n;
        }

        public final float getLinearDY() {
            return this.f96257o;
        }

        public final float getLinearX(float f) {
            float f2 = (f - this.f96243a) * this.f96253k;
            float f3 = this.f96245c;
            return f3 + (f2 * (this.f96247e - f3));
        }

        public final float getLinearY(float f) {
            float f2 = (f - this.f96243a) * this.f96253k;
            float f3 = this.f96246d;
            return f3 + (f2 * (this.f96248f - f3));
        }

        public final float getTime1() {
            return this.f96243a;
        }

        public final float getTime2() {
            return this.f96244b;
        }

        public final boolean isLinear() {
            return this.f96260r;
        }

        public final void setPoint(float f) {
            double dLookup = lookup((this.f96259q ? this.f96244b - f : f - this.f96243a) * this.f96253k) * 1.5707964f;
            this.f96250h = (float) Math.sin(dLookup);
            this.f96251i = (float) Math.cos(dLookup);
        }
    }

    /* JADX INFO: renamed from: x40$b */
    public static final class C14914b {
        public /* synthetic */ C14914b(jt3 jt3Var) {
            this();
        }

        private C14914b() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[PHI: r10
  0x0027: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x40(@p000.yfb int[] r24, @p000.yfb float[] r25, @p000.yfb float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.f96238b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            x40$a[][] r4 = new p000.x40.C14913a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L27
            if (r9 == r2) goto L30
            if (r9 == r11) goto L2e
            if (r9 == r10) goto L29
            r10 = 4
            if (r9 == r10) goto L27
            r10 = 5
            if (r9 == r10) goto L27
            goto L32
        L27:
            r8 = r10
            goto L32
        L29:
            if (r7 != r2) goto L30
            goto L2e
        L2c:
            r8 = r7
            goto L32
        L2e:
            r7 = r11
            goto L2c
        L30:
            r7 = r2
            goto L2c
        L32:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            x40$a[] r9 = new p000.x40.C14913a[r10]
            r11 = r5
        L3c:
            if (r11 >= r10) goto L69
            int r12 = r11 * 2
            x40$a r20 = new x40$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L3c
        L69:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L12
        L6e:
            r0.f96237a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x40.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].getTime2()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getPos(float r9, @p000.yfb float[] r10) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x40.getPos(float, float[]):void");
    }

    public final void getSlope(float f, @yfb float[] fArr) {
        if (f < this.f96237a[0][0].getTime1()) {
            f = this.f96237a[0][0].getTime1();
        } else {
            C14913a[][] c14913aArr = this.f96237a;
            if (f > c14913aArr[c14913aArr.length - 1][0].getTime2()) {
                C14913a[][] c14913aArr2 = this.f96237a;
                f = c14913aArr2[c14913aArr2.length - 1][0].getTime2();
            }
        }
        int length = this.f96237a.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < fArr.length) {
                if (f <= this.f96237a[i][i3].getTime2()) {
                    if (this.f96237a[i][i3].isLinear()) {
                        fArr[i2] = this.f96237a[i][i3].getLinearDX();
                        fArr[i2 + 1] = this.f96237a[i][i3].getLinearDY();
                    } else {
                        this.f96237a[i][i3].setPoint(f);
                        fArr[i2] = this.f96237a[i][i3].calcDX();
                        fArr[i2 + 1] = this.f96237a[i][i3].calcDY();
                    }
                    z = true;
                }
                i2 += 2;
                i3++;
            }
            if (z) {
                return;
            }
        }
    }
}
