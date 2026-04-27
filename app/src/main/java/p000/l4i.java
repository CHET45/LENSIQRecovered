package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n294#1:735,7\n*E\n"})
@e0g(parameters = 0)
public final class l4i {

    /* JADX INFO: renamed from: i */
    public static final int f56158i = 8;

    /* JADX INFO: renamed from: a */
    public final boolean f56159a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final EnumC8613a f56160b;

    /* JADX INFO: renamed from: c */
    public final int f56161c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final yg3[] f56162d;

    /* JADX INFO: renamed from: e */
    public int f56163e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final float[] f56164f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final float[] f56165g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final float[] f56166h;

    /* JADX INFO: renamed from: l4i$a */
    public enum EnumC8613a {
        Lsq2,
        Impulse
    }

    /* JADX INFO: renamed from: l4i$b */
    public /* synthetic */ class C8614b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56170a;

        static {
            int[] iArr = new int[EnumC8613a.values().length];
            try {
                iArr[EnumC8613a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8613a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56170a = iArr;
        }
    }

    public l4i() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i) {
        try {
            return p4i.polyFitLeastSquares(fArr2, fArr, i, 2, this.f56166h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.f56163e + 1) % 20;
        this.f56163e = i;
        p4i.set(this.f56162d, i, j, f);
    }

    public final float calculateVelocity() {
        float fCalculateImpulseVelocity;
        float[] fArr = this.f56164f;
        float[] fArr2 = this.f56165g;
        int i = this.f56163e;
        yg3 yg3Var = this.f56162d[i];
        if (yg3Var == null) {
            return 0.0f;
        }
        int i2 = 0;
        yg3 yg3Var2 = yg3Var;
        while (true) {
            yg3 yg3Var3 = this.f56162d[i];
            if (yg3Var3 == null) {
                break;
            }
            float time = yg3Var.getTime() - yg3Var3.getTime();
            float fAbs = Math.abs(yg3Var3.getTime() - yg3Var2.getTime());
            yg3 yg3Var4 = (this.f56160b == EnumC8613a.Lsq2 || this.f56159a) ? yg3Var3 : yg3Var;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i2] = yg3Var3.getDataPoint();
            fArr2[i2] = -time;
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            yg3Var2 = yg3Var4;
        }
        if (i2 < this.f56161c) {
            return 0.0f;
        }
        int i3 = C8614b.f56170a[this.f56160b.ordinal()];
        if (i3 == 1) {
            fCalculateImpulseVelocity = p4i.calculateImpulseVelocity(fArr, fArr2, i2, this.f56159a);
        } else {
            if (i3 != 2) {
                throw new ceb();
            }
            fCalculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i2);
        }
        return fCalculateImpulseVelocity * 1000;
    }

    public final boolean isDataDifferential() {
        return this.f56159a;
    }

    public final void resetTracking() {
        u70.fill$default(this.f56162d, (Object) null, 0, 0, 6, (Object) null);
        this.f56163e = 0;
    }

    public l4i(boolean z, @yfb EnumC8613a enumC8613a) {
        this.f56159a = z;
        this.f56160b = enumC8613a;
        if (z && enumC8613a.equals(EnumC8613a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = C8614b.f56170a[enumC8613a.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new ceb();
            }
            i2 = 3;
        }
        this.f56161c = i2;
        this.f56162d = new yg3[20];
        this.f56164f = new float[20];
        this.f56165g = new float[20];
        this.f56166h = new float[3];
    }

    public /* synthetic */ l4i(boolean z, EnumC8613a enumC8613a, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EnumC8613a.Lsq2 : enumC8613a);
    }

    public final float calculateVelocity(float f) {
        if (!(f > 0.0f)) {
            g28.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fCalculateVelocity = calculateVelocity();
        if (fCalculateVelocity == 0.0f || Float.isNaN(fCalculateVelocity)) {
            return 0.0f;
        }
        if (fCalculateVelocity > 0.0f) {
            return kpd.coerceAtMost(fCalculateVelocity, f);
        }
        return kpd.coerceAtLeast(fCalculateVelocity, -f);
    }

    public l4i(boolean z) {
        this(z, EnumC8613a.Impulse);
    }
}
