package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n685#1,9:707\n37#2,7:716\n37#2,7:723\n37#2,7:730\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n505#1:707,9\n548#1:716,7\n551#1:723,7\n554#1:730,7\n*E\n"})
public final class nu2 {

    /* JADX INFO: renamed from: a */
    public static final int f65674a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    public static final int f65675b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f65676c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f65677d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f65678e = 0;

    /* JADX INFO: renamed from: f */
    public static final long f65679f = 3;

    /* JADX INFO: renamed from: g */
    public static final int f65680g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f65681h = 32766;

    /* JADX INFO: renamed from: i */
    public static final int f65682i = 65535;

    /* JADX INFO: renamed from: j */
    public static final int f65683j = 15;

    /* JADX INFO: renamed from: k */
    public static final int f65684k = 65534;

    /* JADX INFO: renamed from: l */
    public static final int f65685l = 32767;

    /* JADX INFO: renamed from: m */
    public static final int f65686m = 18;

    /* JADX INFO: renamed from: n */
    public static final int f65687n = 8190;

    /* JADX INFO: renamed from: o */
    public static final int f65688o = 262143;

    /* JADX INFO: renamed from: p */
    public static final int f65689p = 13;

    /* JADX INFO: renamed from: q */
    public static final int f65690q = 262142;

    /* JADX INFO: renamed from: r */
    public static final int f65691r = 8191;

    @f0g
    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (!(i2 >= i)) {
            h28.throwIllegalArgumentException("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')');
        }
        if (!(i4 >= i3)) {
            h28.throwIllegalArgumentException("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')');
        }
        if (i >= 0 && i3 >= 0) {
            z = true;
        }
        if (!z) {
            h28.throwIllegalArgumentException("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : kpd.coerceAtLeast(i + i2, 0);
    }

    private static final int bitsNeedForSizeUnchecked(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    @f0g
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m31224constrain4WqzIAM(long j, long j2) {
        return s78.IntSize(kpd.coerceIn(r78.m32087getWidthimpl(j2), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j)), kpd.coerceIn(r78.m32086getHeightimpl(j2), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m31225constrainN9IONVI(long j, long j2) {
        return Constraints(kpd.coerceIn(ku2.m30765getMinWidthimpl(j2), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j)), kpd.coerceIn(ku2.m30763getMaxWidthimpl(j2), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j)), kpd.coerceIn(ku2.m30764getMinHeightimpl(j2), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j)), kpd.coerceIn(ku2.m30762getMaxHeightimpl(j2), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j)));
    }

    @f0g
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m31226constrainHeightK40F9xA(long j, int i) {
        return kpd.coerceIn(i, ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j));
    }

    @f0g
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m31227constrainWidthK40F9xA(long j, int i) {
        return kpd.coerceIn(i, ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j));
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            invalidConstraint(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i7 & (~(i7 >> 31));
        int i9 = i4 + 1;
        int i10 = i9 & (~(i9 >> 31));
        int i11 = 0;
        if (iBitsNeedForSizeUnchecked2 != 13) {
            if (iBitsNeedForSizeUnchecked2 == 18) {
                i11 = 3;
            } else if (iBitsNeedForSizeUnchecked2 == 15) {
                i11 = 1;
            } else if (iBitsNeedForSizeUnchecked2 == 16) {
                i11 = 2;
            }
        }
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        return ku2.m30752constructorimpl((((long) i8) << 33) | ((long) i11) | (((long) i) << 2) | (((long) i3) << (i12 + 15)) | (((long) i10) << (i12 + 46)));
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return ((i & 1) << 1) + (((i & 2) >> 1) * 3);
    }

    private static final void invalidConstraint(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    private static final Void invalidSize(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    @f0g
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m31228isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
        int iM30763getMaxWidthimpl = ku2.m30763getMaxWidthimpl(j);
        int iM32087getWidthimpl = r78.m32087getWidthimpl(j2);
        if (iM30765getMinWidthimpl <= iM32087getWidthimpl && iM32087getWidthimpl <= iM30763getMaxWidthimpl) {
            int iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
            int iM30762getMaxHeightimpl = ku2.m30762getMaxHeightimpl(j);
            int iM32086getHeightimpl = r78.m32086getHeightimpl(j2);
            if (iM30764getMinHeightimpl <= iM32086getHeightimpl && iM32086getHeightimpl <= iM30762getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxAllowedForSize(int i) {
        if (i < 8191) {
            return f65690q;
        }
        if (i < 32767) {
            return 65534;
        }
        if (i < 65535) {
            return 32766;
        }
        if (i < 262143) {
            return f65687n;
        }
        invalidSize(i);
        throw new us8();
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    @f0g
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m31229offsetNN6EwU(long j, int i, int i2) {
        return Constraints(kpd.coerceAtLeast(ku2.m30765getMinWidthimpl(j) + i, 0), addMaxWithMinimum(ku2.m30763getMaxWidthimpl(j), i), kpd.coerceAtLeast(ku2.m30764getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(ku2.m30762getMaxHeightimpl(j), i2));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m31230offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m31229offsetNN6EwU(j, i, i2);
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }
}
