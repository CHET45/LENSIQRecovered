package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,722:1\n228#1:723\n229#1:724\n231#1:725\n230#1:726\n231#1:727\n228#1,4:728\n230#1,2:732\n228#1,2:734\n229#1:736\n231#1:737\n231#1:738\n229#1:739\n228#1:740\n229#1:741\n230#1:742\n231#1:743\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n256#1:723\n257#1:724\n258#1:725\n258#1:726\n259#1:727\n265#1:728,4\n267#1:732,2\n267#1:734,2\n273#1:736\n275#1:737\n281#1:738\n283#1:739\n287#1:740\n288#1:741\n289#1:742\n290#1:743\n*E\n"})
public final class u7c {

    /* JADX INFO: renamed from: a */
    public final long f87000a;

    private /* synthetic */ u7c(long j) {
        this.f87000a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u7c m32540boximpl(long j) {
        return new u7c(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m32542constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m32544copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m32541constructorimpl(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m32545copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = ku2.m30765getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = ku2.m30763getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = ku2.m30764getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = ku2.m30762getMaxHeightimpl(j);
        }
        return m32544copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32546equalsimpl(long j, Object obj) {
        return (obj instanceof u7c) && ku2.m30756equalsimpl0(j, ((u7c) obj).m32558unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32547equalsimpl0(long j, long j2) {
        return ku2.m30756equalsimpl0(j, j2);
    }

    /* JADX INFO: renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m32548getCrossAxisMaximpl(long j) {
        return ku2.m30762getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m32549getCrossAxisMinimpl(long j) {
        return ku2.m30764getMinHeightimpl(j);
    }

    /* JADX INFO: renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m32550getMainAxisMaximpl(long j) {
        return ku2.m30763getMaxWidthimpl(j);
    }

    /* JADX INFO: renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m32551getMainAxisMinimpl(long j) {
        return ku2.m30765getMinWidthimpl(j);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32552hashCodeimpl(long j) {
        return ku2.m30766hashCodeimpl(j);
    }

    /* JADX INFO: renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m32553maxHeightimpl(long j, @yfb sw8 sw8Var) {
        return sw8Var == sw8.Horizontal ? ku2.m30762getMaxHeightimpl(j) : ku2.m30763getMaxWidthimpl(j);
    }

    /* JADX INFO: renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m32554maxWidthimpl(long j, @yfb sw8 sw8Var) {
        return sw8Var == sw8.Horizontal ? ku2.m30763getMaxWidthimpl(j) : ku2.m30762getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m32555stretchCrossAxisq4ezo7Y(long j) {
        return m32541constructorimpl(ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j), ku2.m30762getMaxHeightimpl(j) != Integer.MAX_VALUE ? ku2.m30762getMaxHeightimpl(j) : ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j));
    }

    /* JADX INFO: renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m32556toBoxConstraintsOenEA2s(long j, @yfb sw8 sw8Var) {
        return sw8Var == sw8.Horizontal ? nu2.Constraints(ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j)) : nu2.Constraints(ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32557toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) ku2.m30768toStringimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m32546equalsimpl(this.f87000a, obj);
    }

    public int hashCode() {
        return m32552hashCodeimpl(this.f87000a);
    }

    public String toString() {
        return m32557toStringimpl(this.f87000a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32558unboximpl() {
        return this.f87000a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32541constructorimpl(int i, int i2, int i3, int i4) {
        return m32542constructorimpl(nu2.Constraints(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32543constructorimpl(long j, @yfb sw8 sw8Var) {
        sw8 sw8Var2 = sw8.Horizontal;
        return m32541constructorimpl(sw8Var == sw8Var2 ? ku2.m30765getMinWidthimpl(j) : ku2.m30764getMinHeightimpl(j), sw8Var == sw8Var2 ? ku2.m30763getMaxWidthimpl(j) : ku2.m30762getMaxHeightimpl(j), sw8Var == sw8Var2 ? ku2.m30764getMinHeightimpl(j) : ku2.m30765getMinWidthimpl(j), sw8Var == sw8Var2 ? ku2.m30762getMaxHeightimpl(j) : ku2.m30763getMaxWidthimpl(j));
    }
}
