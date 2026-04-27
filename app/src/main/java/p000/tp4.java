package p000;

/* JADX INFO: loaded from: classes.dex */
@kp4
public interface tp4 {

    /* JADX INFO: renamed from: tp4$a */
    public static final class C13159a {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m32433getCenterF1C5BW0(@yfb tp4 tp4Var) {
            return tp4.super.mo31599getCenterF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m32427clipPathmtrdDE$default(tp4 tp4Var, vic vicVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        tp4Var.mo31597clipPathmtrdDE(vicVar, i);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m32428clipRectN_I0leg$default(tp4 tp4Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = wpf.m33069getWidthimpl(tp4Var.mo31600getSizeNHjbRc());
        }
        if ((i2 & 8) != 0) {
            f4 = wpf.m33066getHeightimpl(tp4Var.mo31600getSizeNHjbRc());
        }
        if ((i2 & 16) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        tp4Var.mo31598clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m32429rotateUv8p0NA$default(tp4 tp4Var, float f, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = tp4Var.mo31599getCenterF1C5BW0();
        }
        tp4Var.mo31601rotateUv8p0NA(f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m32430scale0AR0LA0$default(tp4 tp4Var, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i & 4) != 0) {
            j = tp4Var.mo31599getCenterF1C5BW0();
        }
        tp4Var.mo31602scale0AR0LA0(f, f2, j);
    }

    static /* synthetic */ void translate$default(tp4 tp4Var, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        tp4Var.translate(f, f2);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo31597clipPathmtrdDE(@yfb vic vicVar, int i);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo31598clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo31599getCenterF1C5BW0() {
        float f = 2;
        return mzb.Offset(wpf.m33069getWidthimpl(mo31600getSizeNHjbRc()) / f, wpf.m33066getHeightimpl(mo31600getSizeNHjbRc()) / f);
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo31600getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo31601rotateUv8p0NA(float f, long j);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo31602scale0AR0LA0(float f, float f2, long j);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo31603transform58bKbWc(@yfb float[] fArr);

    void translate(float f, float f2);
}
