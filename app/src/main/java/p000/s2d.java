package p000;

/* JADX INFO: loaded from: classes.dex */
public interface s2d extends c64 {

    /* JADX INFO: renamed from: s2d$a */
    public static final class C12409a {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m32269getExtendedTouchPaddingNHjbRc(@yfb s2d s2dVar) {
            return s2d.super.mo27781getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@yfb s2d s2dVar) {
            return s2d.super.getInterceptOutOfBoundsChildEvents();
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m32270roundToPxR2X_6o(@yfb s2d s2dVar, long j) {
            return s2d.super.mo27166roundToPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m32271roundToPx0680j_4(@yfb s2d s2dVar, float f) {
            return s2d.super.mo27167roundToPx0680j_4(f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@yfb s2d s2dVar, boolean z) {
            s2d.super.setInterceptOutOfBoundsChildEvents(z);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m32272toDpGaN1DYA(@yfb s2d s2dVar, long j) {
            return s2d.super.mo27168toDpGaN1DYA(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32273toDpu2uoSUM(@yfb s2d s2dVar, float f) {
            return s2d.super.mo27169toDpu2uoSUM(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m32275toDpSizekrfVVM(@yfb s2d s2dVar, long j) {
            return s2d.super.mo27171toDpSizekrfVVM(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m32276toPxR2X_6o(@yfb s2d s2dVar, long j) {
            return s2d.super.mo27172toPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m32277toPx0680j_4(@yfb s2d s2dVar, float f) {
            return s2d.super.mo27173toPx0680j_4(f);
        }

        @f0g
        @yfb
        @Deprecated
        public static rud toRect(@yfb s2d s2dVar, @yfb on4 on4Var) {
            return s2d.super.toRect(on4Var);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m32278toSizeXkaWNTQ(@yfb s2d s2dVar, long j) {
            return s2d.super.mo27174toSizeXkaWNTQ(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m32279toSp0xMU5do(@yfb s2d s2dVar, float f) {
            return s2d.super.mo27175toSp0xMU5do(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32280toSpkPz2Gy4(@yfb s2d s2dVar, float f) {
            return s2d.super.mo27176toSpkPz2Gy4(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32274toDpu2uoSUM(@yfb s2d s2dVar, int i) {
            return s2d.super.mo27170toDpu2uoSUM(i);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32281toSpkPz2Gy4(@yfb s2d s2dVar, int i) {
            return s2d.super.mo27177toSpkPz2Gy4(i);
        }
    }

    @gib
    <R> Object awaitPointerEventScope(@yfb gz6<? super gn0, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var);

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo27781getExtendedTouchPaddingNHjbRc() {
        return wpf.f95046b.m33078getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g */
    long mo27782getSizeYbymL2g();

    @yfb
    u8i getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}
