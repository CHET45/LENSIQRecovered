package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface mv8 {

    /* JADX INFO: renamed from: mv8$a */
    public static final class C9550a {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(@yfb mv8 mv8Var) {
            return mv8.super.getIntroducesMotionFrameOfReference();
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m31059localPositionOfS_NoaFU(@yfb mv8 mv8Var, @yfb mv8 mv8Var2, long j, boolean z) {
            return mv8.super.mo30035localPositionOfS_NoaFU(mv8Var2, j, z);
        }

        @Deprecated
        /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m31061localToScreenMKHz9U(@yfb mv8 mv8Var, long j) {
            return mv8.super.mo30037localToScreenMKHz9U(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m31062screenToLocalMKHz9U(@yfb mv8 mv8Var, long j) {
            return mv8.super.mo30041screenToLocalMKHz9U(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m31063transformFromEL8BTi8(@yfb mv8 mv8Var, @yfb mv8 mv8Var2, @yfb float[] fArr) {
            mv8.super.mo30044transformFromEL8BTi8(mv8Var2, fArr);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m31064transformToScreen58bKbWc(@yfb mv8 mv8Var, @yfb float[] fArr) {
            mv8.super.mo30045transformToScreen58bKbWc(fArr);
        }
    }

    static /* synthetic */ rud localBoundingBoxOf$default(mv8 mv8Var, mv8 mv8Var2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return mv8Var.localBoundingBoxOf(mv8Var2, z);
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m31058localPositionOfS_NoaFU$default(mv8 mv8Var, mv8 mv8Var2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i & 2) != 0) {
            j = izb.f49009b.m30445getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return mv8Var.mo30035localPositionOfS_NoaFU(mv8Var2, j, z);
    }

    int get(@yfb AbstractC9938nm abstractC9938nm);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    @gib
    mv8 getParentCoordinates();

    @gib
    mv8 getParentLayoutCoordinates();

    @yfb
    Set<AbstractC9938nm> getProvidedAlignmentLines();

    /* JADX INFO: renamed from: getSize-YbymL2g */
    long mo30031getSizeYbymL2g();

    boolean isAttached();

    @yfb
    rud localBoundingBoxOf(@yfb mv8 mv8Var, boolean z);

    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    long mo30034localPositionOfR5De75A(@yfb mv8 mv8Var, long j);

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    default long mo30035localPositionOfS_NoaFU(@yfb mv8 mv8Var, long j, boolean z) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    long mo30036localToRootMKHz9U(long j);

    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    default long mo30037localToScreenMKHz9U(long j) {
        return izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    long mo30038localToWindowMKHz9U(long j);

    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    default long mo30041screenToLocalMKHz9U(long j) {
        return izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    default void mo30044transformFromEL8BTi8(@yfb mv8 mv8Var, @yfb float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    default void mo30045transformToScreen58bKbWc(@yfb float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    long mo30047windowToLocalMKHz9U(long j);
}
