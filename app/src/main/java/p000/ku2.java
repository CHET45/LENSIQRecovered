package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n68#1:707\n68#1:710\n68#1:713\n68#1:717\n68#1:721\n68#1:724\n68#1:728\n68#1:731\n68#1:735\n685#2:708\n699#2:709\n685#2:711\n699#2:712\n685#2:714\n705#2:715\n693#2:716\n685#2:718\n705#2:719\n693#2:720\n685#2:722\n699#2:723\n685#2:725\n705#2:726\n693#2:727\n685#2:729\n699#2:730\n685#2:732\n705#2:733\n693#2:734\n685#2:736\n699#2:737\n693#2:738\n705#2:739\n37#3,7:740\n37#3,7:747\n37#3,7:754\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n75#1:707\n85#1:710\n95#1:713\n107#1:717\n120#1:721\n130#1:724\n141#1:728\n154#1:731\n170#1:735\n75#1:708\n75#1:709\n85#1:711\n85#1:712\n95#1:714\n96#1:715\n97#1:716\n107#1:718\n108#1:719\n109#1:720\n120#1:722\n120#1:723\n130#1:725\n131#1:726\n132#1:727\n141#1:729\n141#1:730\n154#1:732\n155#1:733\n156#1:734\n170#1:736\n174#1:737\n178#1:738\n179#1:739\n195#1:740,7\n199#1:747,7\n203#1:754,7\n*E\n"})
@vw7
public final class ku2 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C8523a f55323b = new C8523a(null);

    /* JADX INFO: renamed from: c */
    public static final int f55324c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final long f55325a;

    /* JADX INFO: renamed from: ku2$a */
    @dwf({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n37#2,7:707\n37#2,7:714\n37#2,7:721\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n234#1:707,7\n247#1:714,7\n265#1:721,7\n*E\n"})
    public static final class C8523a {
        public /* synthetic */ C8523a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m30770restrictConstraintsxF2OJ5Q$default(C8523a c8523a, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return c8523a.m30776restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        @f0g
        /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m30771fitPrioritizingHeightZbe2FdA(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i3, nu2.f65690q);
            int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, nu2.f65690q);
            int iMaxAllowedForSize = nu2.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return nu2.Constraints(Math.min(iMaxAllowedForSize, i), i2 != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, i2) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @f0g
        /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m30772fitPrioritizingWidthZbe2FdA(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i, nu2.f65690q);
            int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, nu2.f65690q);
            int iMaxAllowedForSize = nu2.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return nu2.Constraints(iMin, iMin2, Math.min(iMaxAllowedForSize, i3), i4 != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, i4) : Integer.MAX_VALUE);
        }

        @f0g
        /* JADX INFO: renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m30773fixedJhjzzOo(int i, int i2) {
            if (!(i >= 0 && i2 >= 0)) {
                h28.throwIllegalArgumentException("width(" + i + ") and height(" + i2 + ") must be >= 0");
            }
            return nu2.createConstraints(i, i, i2, i2);
        }

        @f0g
        /* JADX INFO: renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m30774fixedHeightOenEA2s(int i) {
            if (!(i >= 0)) {
                h28.throwIllegalArgumentException("height(" + i + ") must be >= 0");
            }
            return nu2.createConstraints(0, Integer.MAX_VALUE, i, i);
        }

        @f0g
        /* JADX INFO: renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m30775fixedWidthOenEA2s(int i) {
            if (!(i >= 0)) {
                h28.throwIllegalArgumentException("width(" + i + ") must be >= 0");
            }
            return nu2.createConstraints(i, i, 0, Integer.MAX_VALUE);
        }

        @f0g
        @ug5
        @q64(message = "Replace with fitPrioritizingWidth", replaceWith = @i2e(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m30776restrictConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
            return z ? m30772fitPrioritizingWidthZbe2FdA(i, i2, i3, i4) : m30771fitPrioritizingHeightZbe2FdA(i, i2, i3, i4);
        }

        private C8523a() {
        }
    }

    private /* synthetic */ ku2(long j) {
        this.f55325a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ku2 m30751boximpl(long j) {
        return new ku2(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30752constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m30753copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (!(i3 >= 0 && i >= 0)) {
            h28.throwIllegalArgumentException("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0");
        }
        if (!(i2 >= i)) {
            h28.throwIllegalArgumentException("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')');
        }
        if (!(i4 >= i3)) {
            h28.throwIllegalArgumentException("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')');
        }
        return nu2.createConstraints(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m30754copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m30765getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m30763getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m30764getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m30762getMaxHeightimpl(j);
        }
        return m30753copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30755equalsimpl(long j, Object obj) {
        return (obj instanceof ku2) && j == ((ku2) obj).m30769unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30756equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m30757getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m30758getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m30759getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    @f0g
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m30760getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    @f0g
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m30761getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m30762getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m30763getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m30764getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m30765getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    @yjd
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30766hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    public static /* synthetic */ void isZero$annotations() {
    }

    /* JADX INFO: renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m30767isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0 || (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0;
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30768toStringimpl(long j) {
        int iM30763getMaxWidthimpl = m30763getMaxWidthimpl(j);
        String strValueOf = iM30763getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM30763getMaxWidthimpl);
        int iM30762getMaxHeightimpl = m30762getMaxHeightimpl(j);
        return "Constraints(minWidth = " + m30765getMinWidthimpl(j) + ", maxWidth = " + strValueOf + ", minHeight = " + m30764getMinHeightimpl(j) + ", maxHeight = " + (iM30762getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM30762getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m30755equalsimpl(this.f55325a, obj);
    }

    public int hashCode() {
        return m30766hashCodeimpl(this.f55325a);
    }

    @yfb
    public String toString() {
        return m30768toStringimpl(this.f55325a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30769unboximpl() {
        return this.f55325a;
    }
}
