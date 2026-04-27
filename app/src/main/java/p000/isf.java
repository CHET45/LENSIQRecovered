package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class isf {

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f48144a;

    private /* synthetic */ isf(int[] iArr) {
        this.f48144a = iArr;
    }

    /* JADX INFO: renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m30375addDiagonalToStackimpl(int[] iArr, @yfb u78 u78Var) {
        if (!m30383getHasAdditionOrRemovalimpl(iArr)) {
            u78Var.pushDiagonal(m30385getStartXimpl(iArr), m30386getStartYimpl(iArr), m30381getEndXimpl(iArr) - m30385getStartXimpl(iArr));
            return;
        }
        if (m30384getReverseimpl(iArr)) {
            u78Var.pushDiagonal(m30385getStartXimpl(iArr), m30386getStartYimpl(iArr), m30380getDiagonalSizeimpl(iArr));
        } else if (m30388isAdditionimpl(iArr)) {
            u78Var.pushDiagonal(m30385getStartXimpl(iArr), m30386getStartYimpl(iArr) + 1, m30380getDiagonalSizeimpl(iArr));
        } else {
            u78Var.pushDiagonal(m30385getStartXimpl(iArr) + 1, m30386getStartYimpl(iArr), m30380getDiagonalSizeimpl(iArr));
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ isf m30376boximpl(int[] iArr) {
        return new isf(iArr);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m30377constructorimpl(@yfb int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30378equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof isf) && md8.areEqual(iArr, ((isf) obj).m30390unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30379equalsimpl0(int[] iArr, int[] iArr2) {
        return md8.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m30380getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m30381getEndXimpl(iArr) - m30385getStartXimpl(iArr), m30382getEndYimpl(iArr) - m30386getStartYimpl(iArr));
    }

    /* JADX INFO: renamed from: getEndX-impl, reason: not valid java name */
    public static final int m30381getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* JADX INFO: renamed from: getEndY-impl, reason: not valid java name */
    public static final int m30382getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* JADX INFO: renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m30383getHasAdditionOrRemovalimpl(int[] iArr) {
        return m30382getEndYimpl(iArr) - m30386getStartYimpl(iArr) != m30381getEndXimpl(iArr) - m30385getStartXimpl(iArr);
    }

    /* JADX INFO: renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m30384getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* JADX INFO: renamed from: getStartX-impl, reason: not valid java name */
    public static final int m30385getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* JADX INFO: renamed from: getStartY-impl, reason: not valid java name */
    public static final int m30386getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30387hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m30388isAdditionimpl(int[] iArr) {
        return m30382getEndYimpl(iArr) - m30386getStartYimpl(iArr) > m30381getEndXimpl(iArr) - m30385getStartXimpl(iArr);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30389toStringimpl(int[] iArr) {
        return "Snake(" + m30385getStartXimpl(iArr) + C4584d2.f28238g + m30386getStartYimpl(iArr) + C4584d2.f28238g + m30381getEndXimpl(iArr) + C4584d2.f28238g + m30382getEndYimpl(iArr) + C4584d2.f28238g + m30384getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m30378equalsimpl(this.f48144a, obj);
    }

    @yfb
    public final int[] getData() {
        return this.f48144a;
    }

    public int hashCode() {
        return m30387hashCodeimpl(this.f48144a);
    }

    @yfb
    public String toString() {
        return m30389toStringimpl(this.f48144a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m30390unboximpl() {
        return this.f48144a;
    }
}
