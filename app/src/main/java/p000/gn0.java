package p000;

/* JADX INFO: loaded from: classes.dex */
@u7e
public interface gn0 extends c64 {

    /* JADX INFO: renamed from: gn0$a */
    public static final class C6431a {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m29766getExtendedTouchPaddingNHjbRc(@yfb gn0 gn0Var) {
            return gn0.super.mo29764getExtendedTouchPaddingNHjbRc();
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m29767roundToPxR2X_6o(@yfb gn0 gn0Var, long j) {
            return gn0.super.mo27166roundToPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m29768roundToPx0680j_4(@yfb gn0 gn0Var, float f) {
            return gn0.super.mo27167roundToPx0680j_4(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m29769toDpGaN1DYA(@yfb gn0 gn0Var, long j) {
            return gn0.super.mo27168toDpGaN1DYA(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m29770toDpu2uoSUM(@yfb gn0 gn0Var, float f) {
            return gn0.super.mo27169toDpu2uoSUM(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m29772toDpSizekrfVVM(@yfb gn0 gn0Var, long j) {
            return gn0.super.mo27171toDpSizekrfVVM(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m29773toPxR2X_6o(@yfb gn0 gn0Var, long j) {
            return gn0.super.mo27172toPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m29774toPx0680j_4(@yfb gn0 gn0Var, float f) {
            return gn0.super.mo27173toPx0680j_4(f);
        }

        @f0g
        @yfb
        @Deprecated
        public static rud toRect(@yfb gn0 gn0Var, @yfb on4 on4Var) {
            return gn0.super.toRect(on4Var);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m29775toSizeXkaWNTQ(@yfb gn0 gn0Var, long j) {
            return gn0.super.mo27174toSizeXkaWNTQ(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m29776toSp0xMU5do(@yfb gn0 gn0Var, float f) {
            return gn0.super.mo27175toSp0xMU5do(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m29777toSpkPz2Gy4(@yfb gn0 gn0Var, float f) {
            return gn0.super.mo27176toSpkPz2Gy4(f);
        }

        @gib
        @Deprecated
        public static <T> Object withTimeout(@yfb gn0 gn0Var, long j, @yfb gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
            return gn0.super.withTimeout(j, gz6Var, zy2Var);
        }

        @gib
        @Deprecated
        public static <T> Object withTimeoutOrNull(@yfb gn0 gn0Var, long j, @yfb gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
            return gn0.super.withTimeoutOrNull(j, gz6Var, zy2Var);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m29771toDpu2uoSUM(@yfb gn0 gn0Var, int i) {
            return gn0.super.mo27170toDpu2uoSUM(i);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m29778toSpkPz2Gy4(@yfb gn0 gn0Var, int i) {
            return gn0.super.mo27177toSpkPz2Gy4(i);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(gn0 gn0Var, v1d v1dVar, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            v1dVar = v1d.Main;
        }
        return gn0Var.awaitPointerEvent(v1dVar, zy2Var);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(gn0 gn0Var, long j, gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super T> zy2Var) {
        return gz6Var.invoke(gn0Var, zy2Var);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(gn0 gn0Var, long j, gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super T> zy2Var) {
        return gz6Var.invoke(gn0Var, zy2Var);
    }

    @gib
    Object awaitPointerEvent(@yfb v1d v1dVar, @yfb zy2<? super t1d> zy2Var);

    @yfb
    t1d getCurrentEvent();

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo29764getExtendedTouchPaddingNHjbRc() {
        return wpf.f95046b.m33078getZeroNHjbRc();
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo29765getSizeYbymL2g();

    @yfb
    u8i getViewConfiguration();

    @gib
    default <T> Object withTimeout(long j, @yfb gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return withTimeout$suspendImpl(this, j, gz6Var, zy2Var);
    }

    @gib
    default <T> Object withTimeoutOrNull(long j, @yfb gz6<? super gn0, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return withTimeoutOrNull$suspendImpl(this, j, gz6Var, zy2Var);
    }
}
