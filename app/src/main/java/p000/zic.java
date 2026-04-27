package p000;

import p000.bkc;
import p000.ijc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,120:1\n66#2,8:121\n54#2,7:129\n33#2,7:136\n33#2,7:146\n48#3:143\n54#3:145\n22#4:144\n*S KotlinDebug\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n*L\n72#1:121,8\n77#1:129,7\n101#1:136,7\n113#1:146,7\n108#1:143\n108#1:145\n108#1:144\n*E\n"})
@vw7
public final class zic implements hv4 {

    /* JADX INFO: renamed from: c */
    public static final int f105188c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final vic f105189a;

    /* JADX INFO: renamed from: b */
    public yc8<bkc> f105190b;

    public zic(@yfb vic vicVar) {
        this.f105189a = vicVar;
    }

    private final void initializeEasing() {
        float[] fArr = new float[5];
        yc8<bkc> yc8Var = new yc8<>();
        ijc it = this.f105189a.iterator(ijc.EnumC7321a.AsQuadratics, 2.0E-4f);
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bkc next = it.next();
            if (!(next.getType() != bkc.EnumC1929a.Close)) {
                c8d.throwIllegalArgumentException("The path cannot contain a close() command.");
            }
            if (next.getType() != bkc.EnumC1929a.Move && next.getType() != bkc.EnumC1929a.Done) {
                long jComputeHorizontalBounds$default = d11.computeHorizontalBounds$default(next, fArr, 0, 4, null);
                yc8Var.addInterval(Float.intBitsToFloat((int) (jComputeHorizontalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeHorizontalBounds$default & 4294967295L)), next);
            }
        }
        if (!(yc8Var.contains(0.0f) && yc8Var.contains(1.0f))) {
            c8d.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.f105190b = yc8Var;
    }

    @Override // p000.hv4
    public float transform(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (this.f105190b == null) {
            initializeEasing();
        }
        yc8<bkc> yc8Var = this.f105190b;
        if (yc8Var == null) {
            md8.throwUninitializedPropertyAccessException("intervals");
            yc8Var = null;
        }
        Object data = yc8.findFirstOverlap$default(yc8Var, f, 0.0f, 2, null).getData();
        if (data == null) {
            c8d.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
            throw new us8();
        }
        bkc bkcVar = (bkc) data;
        float fFindFirstRoot = d11.findFirstRoot(bkcVar, f);
        if (Float.isNaN(fFindFirstRoot)) {
            c8d.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
        }
        return d11.evaluateY(bkcVar, fFindFirstRoot);
    }
}
