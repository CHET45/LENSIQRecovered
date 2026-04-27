package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class m5c {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9148a f59942b = new C9148a(null);

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f59943c = 3;

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f59944a;

    /* JADX INFO: renamed from: m5c$a */
    public static final class C9148a {
        public /* synthetic */ C9148a(jt3 jt3Var) {
            this();
        }

        private C9148a() {
        }
    }

    private /* synthetic */ m5c(int[] iArr) {
        this.f59944a = iArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m5c m30949boximpl(int[] iArr) {
        return new m5c(iArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int[] m30951constructorimpl(int[] iArr) {
        return iArr;
    }

    @yfb
    /* JADX INFO: renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m30952copyOfpSmdads(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i * 3);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        return m30951constructorimpl(iArrCopyOf);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30953equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof m5c) && md8.areEqual(iArr, ((m5c) obj).m30961unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30954equalsimpl0(int[] iArr, int[] iArr2) {
        return md8.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: forEach-impl, reason: not valid java name */
    public static final void m30955forEachimpl(int[] iArr, int i, boolean z, @yfb kz6<? super Integer, ? super Integer, ? super Integer, bth> kz6Var) {
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                kz6Var.invoke(Integer.valueOf(iArr[i3]), Integer.valueOf(iArr[i3 + 1]), Integer.valueOf(iArr[i3 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i4 = i * 3;
            kz6Var.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
        }
    }

    /* JADX INFO: renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m30956forEachimpl$default(int[] iArr, int i, boolean z, kz6 kz6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 3;
                kz6Var.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i5 = i * 3;
            kz6Var.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
        }
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m30957getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30958hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m30959setimpl(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i * 3;
        iArr[i5] = i2;
        iArr[i5 + 1] = i3;
        iArr[i5 + 2] = i4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30960toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m30953equalsimpl(this.f59944a, obj);
    }

    public int hashCode() {
        return m30958hashCodeimpl(this.f59944a);
    }

    public String toString() {
        return m30960toStringimpl(this.f59944a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m30961unboximpl() {
        return this.f59944a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m30950constructorimpl(int i) {
        return m30951constructorimpl(new int[i * 3]);
    }
}
