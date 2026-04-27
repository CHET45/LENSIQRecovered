package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class mbe {

    /* JADX INFO: renamed from: k */
    public static final int f60481k = 0;

    /* JADX INFO: renamed from: a */
    public final float f60483a;

    /* JADX INFO: renamed from: b */
    public final float f60484b;

    /* JADX INFO: renamed from: c */
    public final float f60485c;

    /* JADX INFO: renamed from: d */
    public final float f60486d;

    /* JADX INFO: renamed from: e */
    public final long f60487e;

    /* JADX INFO: renamed from: f */
    public final long f60488f;

    /* JADX INFO: renamed from: g */
    public final long f60489g;

    /* JADX INFO: renamed from: h */
    public final long f60490h;

    /* JADX INFO: renamed from: i */
    @gib
    public mbe f60491i;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C9259a f60480j = new C9259a(null);

    /* JADX INFO: renamed from: l */
    @yfb
    public static final mbe f60482l = pbe.m31775RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, u03.f86459b.m32502getZerokKHJgLs());

    /* JADX INFO: renamed from: mbe$a */
    public static final class C9259a {
        public /* synthetic */ C9259a(jt3 jt3Var) {
            this();
        }

        @do8
        public static /* synthetic */ void getZero$annotations() {
        }

        @yfb
        public final mbe getZero() {
            return mbe.f60482l;
        }

        private C9259a() {
        }
    }

    public /* synthetic */ mbe(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, jt3 jt3Var) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    @yfb
    public static final mbe getZero() {
        return f60480j.getZero();
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        return (f5 <= f4 || f5 == 0.0f) ? f : Math.min(f, f4 / f5);
    }

    private final mbe scaledRadiiRect() {
        mbe mbeVar = this.f60491i;
        if (mbeVar != null) {
            return mbeVar;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, u03.m32493getYimpl(this.f60490h), u03.m32493getYimpl(this.f60487e), getHeight()), u03.m32492getXimpl(this.f60487e), u03.m32492getXimpl(this.f60488f), getWidth()), u03.m32493getYimpl(this.f60488f), u03.m32493getYimpl(this.f60489g), getHeight()), u03.m32492getXimpl(this.f60489g), u03.m32492getXimpl(this.f60490h), getWidth());
        mbe mbeVar2 = new mbe(this.f60483a * fMinRadius, this.f60484b * fMinRadius, this.f60485c * fMinRadius, this.f60486d * fMinRadius, v03.CornerRadius(u03.m32492getXimpl(this.f60487e) * fMinRadius, u03.m32493getYimpl(this.f60487e) * fMinRadius), v03.CornerRadius(u03.m32492getXimpl(this.f60488f) * fMinRadius, u03.m32493getYimpl(this.f60488f) * fMinRadius), v03.CornerRadius(u03.m32492getXimpl(this.f60489g) * fMinRadius, u03.m32493getYimpl(this.f60489g) * fMinRadius), v03.CornerRadius(u03.m32492getXimpl(this.f60490h) * fMinRadius, u03.m32493getYimpl(this.f60490h) * fMinRadius), null);
        this.f60491i = mbeVar2;
        return mbeVar2;
    }

    public final float component1() {
        return this.f60483a;
    }

    public final float component2() {
        return this.f60484b;
    }

    public final float component3() {
        return this.f60485c;
    }

    public final float component4() {
        return this.f60486d;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m30985component5kKHJgLs() {
        return this.f60487e;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m30986component6kKHJgLs() {
        return this.f60488f;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m30987component7kKHJgLs() {
        return this.f60489g;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m30988component8kKHJgLs() {
        return this.f60490h;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m30989containsk4lQ0M(long j) {
        float fM30429getXimpl;
        float fM30430getYimpl;
        float fM32492getXimpl;
        float fM32493getYimpl;
        if (izb.m30429getXimpl(j) < this.f60483a || izb.m30429getXimpl(j) >= this.f60485c || izb.m30430getYimpl(j) < this.f60484b || izb.m30430getYimpl(j) >= this.f60486d) {
            return false;
        }
        mbe mbeVarScaledRadiiRect = scaledRadiiRect();
        if (izb.m30429getXimpl(j) < this.f60483a + u03.m32492getXimpl(mbeVarScaledRadiiRect.f60487e) && izb.m30430getYimpl(j) < this.f60484b + u03.m32493getYimpl(mbeVarScaledRadiiRect.f60487e)) {
            fM30429getXimpl = (izb.m30429getXimpl(j) - this.f60483a) - u03.m32492getXimpl(mbeVarScaledRadiiRect.f60487e);
            fM30430getYimpl = (izb.m30430getYimpl(j) - this.f60484b) - u03.m32493getYimpl(mbeVarScaledRadiiRect.f60487e);
            fM32492getXimpl = u03.m32492getXimpl(mbeVarScaledRadiiRect.f60487e);
            fM32493getYimpl = u03.m32493getYimpl(mbeVarScaledRadiiRect.f60487e);
        } else if (izb.m30429getXimpl(j) > this.f60485c - u03.m32492getXimpl(mbeVarScaledRadiiRect.f60488f) && izb.m30430getYimpl(j) < this.f60484b + u03.m32493getYimpl(mbeVarScaledRadiiRect.f60488f)) {
            fM30429getXimpl = (izb.m30429getXimpl(j) - this.f60485c) + u03.m32492getXimpl(mbeVarScaledRadiiRect.f60488f);
            fM30430getYimpl = (izb.m30430getYimpl(j) - this.f60484b) - u03.m32493getYimpl(mbeVarScaledRadiiRect.f60488f);
            fM32492getXimpl = u03.m32492getXimpl(mbeVarScaledRadiiRect.f60488f);
            fM32493getYimpl = u03.m32493getYimpl(mbeVarScaledRadiiRect.f60488f);
        } else if (izb.m30429getXimpl(j) > this.f60485c - u03.m32492getXimpl(mbeVarScaledRadiiRect.f60489g) && izb.m30430getYimpl(j) > this.f60486d - u03.m32493getYimpl(mbeVarScaledRadiiRect.f60489g)) {
            fM30429getXimpl = (izb.m30429getXimpl(j) - this.f60485c) + u03.m32492getXimpl(mbeVarScaledRadiiRect.f60489g);
            fM30430getYimpl = (izb.m30430getYimpl(j) - this.f60486d) + u03.m32493getYimpl(mbeVarScaledRadiiRect.f60489g);
            fM32492getXimpl = u03.m32492getXimpl(mbeVarScaledRadiiRect.f60489g);
            fM32493getYimpl = u03.m32493getYimpl(mbeVarScaledRadiiRect.f60489g);
        } else {
            if (izb.m30429getXimpl(j) >= this.f60483a + u03.m32492getXimpl(mbeVarScaledRadiiRect.f60490h) || izb.m30430getYimpl(j) <= this.f60486d - u03.m32493getYimpl(mbeVarScaledRadiiRect.f60490h)) {
                return true;
            }
            fM30429getXimpl = (izb.m30429getXimpl(j) - this.f60483a) - u03.m32492getXimpl(mbeVarScaledRadiiRect.f60490h);
            fM30430getYimpl = (izb.m30430getYimpl(j) - this.f60486d) + u03.m32493getYimpl(mbeVarScaledRadiiRect.f60490h);
            fM32492getXimpl = u03.m32492getXimpl(mbeVarScaledRadiiRect.f60490h);
            fM32493getYimpl = u03.m32493getYimpl(mbeVarScaledRadiiRect.f60490h);
        }
        float f = fM30429getXimpl / fM32492getXimpl;
        float f2 = fM30430getYimpl / fM32493getYimpl;
        return (f * f) + (f2 * f2) <= 1.0f;
    }

    @yfb
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final mbe m30990copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new mbe(f, f2, f3, f4, j, j2, j3, j4, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe)) {
            return false;
        }
        mbe mbeVar = (mbe) obj;
        return Float.compare(this.f60483a, mbeVar.f60483a) == 0 && Float.compare(this.f60484b, mbeVar.f60484b) == 0 && Float.compare(this.f60485c, mbeVar.f60485c) == 0 && Float.compare(this.f60486d, mbeVar.f60486d) == 0 && u03.m32491equalsimpl0(this.f60487e, mbeVar.f60487e) && u03.m32491equalsimpl0(this.f60488f, mbeVar.f60488f) && u03.m32491equalsimpl0(this.f60489g, mbeVar.f60489g) && u03.m32491equalsimpl0(this.f60490h, mbeVar.f60490h);
    }

    public final float getBottom() {
        return this.f60486d;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m30991getBottomLeftCornerRadiuskKHJgLs() {
        return this.f60490h;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m30992getBottomRightCornerRadiuskKHJgLs() {
        return this.f60489g;
    }

    public final float getHeight() {
        return this.f60486d - this.f60484b;
    }

    public final float getLeft() {
        return this.f60483a;
    }

    public final float getRight() {
        return this.f60485c;
    }

    public final float getTop() {
        return this.f60484b;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m30993getTopLeftCornerRadiuskKHJgLs() {
        return this.f60487e;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m30994getTopRightCornerRadiuskKHJgLs() {
        return this.f60488f;
    }

    public final float getWidth() {
        return this.f60485c - this.f60483a;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f60483a) * 31) + Float.hashCode(this.f60484b)) * 31) + Float.hashCode(this.f60485c)) * 31) + Float.hashCode(this.f60486d)) * 31) + u03.m32494hashCodeimpl(this.f60487e)) * 31) + u03.m32494hashCodeimpl(this.f60488f)) * 31) + u03.m32494hashCodeimpl(this.f60489g)) * 31) + u03.m32494hashCodeimpl(this.f60490h);
    }

    @yfb
    public String toString() {
        long j = this.f60487e;
        long j2 = this.f60488f;
        long j3 = this.f60489g;
        long j4 = this.f60490h;
        String str = f37.toStringAsFixed(this.f60483a, 1) + ", " + f37.toStringAsFixed(this.f60484b, 1) + ", " + f37.toStringAsFixed(this.f60485c, 1) + ", " + f37.toStringAsFixed(this.f60486d, 1);
        if (!u03.m32491equalsimpl0(j, j2) || !u03.m32491equalsimpl0(j2, j3) || !u03.m32491equalsimpl0(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) u03.m32498toStringimpl(j)) + ", topRight=" + ((Object) u03.m32498toStringimpl(j2)) + ", bottomRight=" + ((Object) u03.m32498toStringimpl(j3)) + ", bottomLeft=" + ((Object) u03.m32498toStringimpl(j4)) + ')';
        }
        if (u03.m32492getXimpl(j) == u03.m32493getYimpl(j)) {
            return "RoundRect(rect=" + str + ", radius=" + f37.toStringAsFixed(u03.m32492getXimpl(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + f37.toStringAsFixed(u03.m32492getXimpl(j), 1) + ", y=" + f37.toStringAsFixed(u03.m32493getYimpl(j), 1) + ')';
    }

    private mbe(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f60483a = f;
        this.f60484b = f2;
        this.f60485c = f3;
        this.f60486d = f4;
        this.f60487e = j;
        this.f60488f = j2;
        this.f60489g = j3;
        this.f60490h = j4;
    }

    public /* synthetic */ mbe(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, jt3 jt3Var) {
        this(f, f2, f3, f4, (i & 16) != 0 ? u03.f86459b.m32502getZerokKHJgLs() : j, (i & 32) != 0 ? u03.f86459b.m32502getZerokKHJgLs() : j2, (i & 64) != 0 ? u03.f86459b.m32502getZerokKHJgLs() : j3, (i & 128) != 0 ? u03.f86459b.m32502getZerokKHJgLs() : j4, null);
    }
}
