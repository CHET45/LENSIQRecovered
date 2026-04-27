package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,335:1\n26#2:336\n26#2:337\n26#2:338\n26#2:339\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n330#1:336\n331#1:337\n332#1:338\n333#1:339\n*E\n"})
public final class m78 {
    @f0g
    @yfb
    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final l78 m30966IntRectE1MhUcY(long j, long j2) {
        return new l78(a78.m27201getXimpl(j), a78.m27202getYimpl(j), a78.m27201getXimpl(j2), a78.m27202getYimpl(j2));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final l78 m30967IntRectVbeCjmY(long j, long j2) {
        return new l78(a78.m27201getXimpl(j), a78.m27202getYimpl(j), a78.m27201getXimpl(j) + r78.m32087getWidthimpl(j2), a78.m27202getYimpl(j) + r78.m32086getHeightimpl(j2));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final l78 m30968IntRectar5cAso(long j, int i) {
        return new l78(a78.m27201getXimpl(j) - i, a78.m27202getYimpl(j) - i, a78.m27201getXimpl(j) + i, a78.m27202getYimpl(j) + i);
    }

    @f0g
    @yfb
    public static final l78 lerp(@yfb l78 l78Var, @yfb l78 l78Var2, float f) {
        return new l78(m3a.lerp(l78Var.getLeft(), l78Var2.getLeft(), f), m3a.lerp(l78Var.getTop(), l78Var2.getTop(), f), m3a.lerp(l78Var.getRight(), l78Var2.getRight(), f), m3a.lerp(l78Var.getBottom(), l78Var2.getBottom(), f));
    }

    @f0g
    @yfb
    public static final l78 roundToIntRect(@yfb rud rudVar) {
        return new l78(Math.round(rudVar.getLeft()), Math.round(rudVar.getTop()), Math.round(rudVar.getRight()), Math.round(rudVar.getBottom()));
    }

    @f0g
    @yfb
    public static final rud toRect(@yfb l78 l78Var) {
        return new rud(l78Var.getLeft(), l78Var.getTop(), l78Var.getRight(), l78Var.getBottom());
    }
}
