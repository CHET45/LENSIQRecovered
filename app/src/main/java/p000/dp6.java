package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,68:1\n54#2,7:69\n*S KotlinDebug\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n*L\n59#1:69,7\n*E\n"})
@vw7
public interface dp6 {

    /* JADX INFO: renamed from: dp6$a */
    public static final class C4899a {
        @f0g
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m28664toDpGaN1DYA(@yfb dp6 dp6Var, long j) {
            return dp6.super.mo27168toDpGaN1DYA(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m28665toSp0xMU5do(@yfb dp6 dp6Var, float f) {
            return dp6.super.mo27175toSp0xMU5do(f);
        }
    }

    float getFontScale();

    @f0g
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo27168toDpGaN1DYA(long j) {
        if (!lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA())) {
            h28.throwIllegalStateException("Only Sp can convert to Px");
        }
        bp6 bp6Var = bp6.f14373a;
        if (!bp6Var.isNonLinearFontScalingActive(getFontScale())) {
            return kn4.m30705constructorimpl(jwg.m30613getValueimpl(j) * getFontScale());
        }
        ap6 ap6VarForScale = bp6Var.forScale(getFontScale());
        float fM30613getValueimpl = jwg.m30613getValueimpl(j);
        return kn4.m30705constructorimpl(ap6VarForScale == null ? fM30613getValueimpl * getFontScale() : ap6VarForScale.convertSpToDp(fM30613getValueimpl));
    }

    @f0g
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo27175toSp0xMU5do(float f) {
        bp6 bp6Var = bp6.f14373a;
        if (!bp6Var.isNonLinearFontScalingActive(getFontScale())) {
            return kwg.getSp(f / getFontScale());
        }
        ap6 ap6VarForScale = bp6Var.forScale(getFontScale());
        return kwg.getSp(ap6VarForScale != null ? ap6VarForScale.convertDpToSp(f) : f / getFontScale());
    }
}
