package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class ot1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f68632a;

    private /* synthetic */ ot1(int[] iArr) {
        this.f68632a = iArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ot1 m31654boximpl(int[] iArr) {
        return new ot1(iArr);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m31655constructorimpl(@yfb int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31656equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof ot1) && md8.areEqual(iArr, ((ot1) obj).m31663unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31657equalsimpl0(int[] iArr, int[] iArr2) {
        return md8.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final int m31658getimpl(int[] iArr, int i) {
        return iArr[i + m31659getMidimpl(iArr)];
    }

    /* JADX INFO: renamed from: getMid-impl, reason: not valid java name */
    private static final int m31659getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31660hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m31661setimpl(int[] iArr, int i, int i2) {
        iArr[i + m31659getMidimpl(iArr)] = i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31662toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m31656equalsimpl(this.f68632a, obj);
    }

    public int hashCode() {
        return m31660hashCodeimpl(this.f68632a);
    }

    public String toString() {
        return m31662toStringimpl(this.f68632a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m31663unboximpl() {
        return this.f68632a;
    }
}
