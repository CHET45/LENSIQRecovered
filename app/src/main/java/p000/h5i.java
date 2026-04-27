package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n32#2:1156\n39#2:1157\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n992#1:1156\n995#1:1157\n*E\n"})
public final class h5i {

    /* JADX INFO: renamed from: a */
    public final long f42432a;

    private /* synthetic */ h5i(long j) {
        this.f42432a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h5i m29916boximpl(long j) {
        return new h5i(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m29917constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29918equalsimpl(long j, Object obj) {
        return (obj instanceof h5i) && j == ((h5i) obj).m29924unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29919equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m29920getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m29921getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29922hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29923toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m29918equalsimpl(this.f42432a, obj);
    }

    public int hashCode() {
        return m29922hashCodeimpl(this.f42432a);
    }

    public String toString() {
        return m29923toStringimpl(this.f42432a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m29924unboximpl() {
        return this.f42432a;
    }
}
