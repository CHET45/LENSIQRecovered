package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n63#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
public final class v03 {
    @f0g
    public static final long CornerRadius(float f, float f2) {
        return u03.m32486constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return CornerRadius(f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m32678lerp3Ry4LBc(long j, long j2, float f) {
        return CornerRadius(m3a.lerp(u03.m32492getXimpl(j), u03.m32492getXimpl(j2), f), m3a.lerp(u03.m32493getYimpl(j), u03.m32493getYimpl(j2), f));
    }
}
