package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,172:1\n33#2,7:173\n48#3:180\n54#3:182\n22#4:181\n22#4:183\n71#5,16:184\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n115#1:173,7\n120#1:180\n121#1:182\n120#1:181\n121#1:183\n149#1:184,16\n*E\n"})
@vw7
public final class k93 implements hv4 {

    /* JADX INFO: renamed from: g */
    public static final int f52836g = 0;

    /* JADX INFO: renamed from: a */
    public final float f52837a;

    /* JADX INFO: renamed from: b */
    public final float f52838b;

    /* JADX INFO: renamed from: c */
    public final float f52839c;

    /* JADX INFO: renamed from: d */
    public final float f52840d;

    /* JADX INFO: renamed from: e */
    public final float f52841e;

    /* JADX INFO: renamed from: f */
    public final float f52842f;

    public k93(float f, float f2, float f3, float f4) {
        this.f52837a = f;
        this.f52838b = f2;
        this.f52839c = f3;
        this.f52840d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            c8d.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + a18.f100c);
        }
        long jComputeCubicVerticalBounds = d11.computeCubicVerticalBounds(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.f52841e = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.f52842f = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f52837a + ", " + this.f52838b + ", " + this.f52839c + ", " + this.f52840d + ") has no solution at " + f);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof k93) {
            k93 k93Var = (k93) obj;
            if (this.f52837a == k93Var.f52837a && this.f52838b == k93Var.f52838b && this.f52839c == k93Var.f52839c && this.f52840d == k93Var.f52840d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f52837a) * 31) + Float.hashCode(this.f52838b)) * 31) + Float.hashCode(this.f52839c)) * 31) + Float.hashCode(this.f52840d);
    }

    @yfb
    public String toString() {
        return "CubicBezierEasing(a=" + this.f52837a + ", b=" + this.f52838b + ", c=" + this.f52839c + ", d=" + this.f52840d + ')';
    }

    @Override // p000.hv4
    public float transform(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fFindFirstCubicRoot = d11.findFirstCubicRoot(0.0f - f, this.f52837a - f, this.f52839c - f, 1.0f - f);
        if (Float.isNaN(fFindFirstCubicRoot)) {
            throwNoSolution(f);
        }
        float fEvaluateCubic = d11.evaluateCubic(this.f52838b, this.f52840d, fFindFirstCubicRoot);
        float f2 = this.f52841e;
        float f3 = this.f52842f;
        if (fEvaluateCubic < f2) {
            fEvaluateCubic = f2;
        }
        return fEvaluateCubic > f3 ? f3 : fEvaluateCubic;
    }
}
