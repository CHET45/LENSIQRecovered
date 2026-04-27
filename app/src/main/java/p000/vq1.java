package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface vq1 {

    /* JADX INFO: renamed from: vq1$a */
    public static final class C14214a {
        @Deprecated
        /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m32786clipRectmtrdDE(@yfb vq1 vq1Var, @yfb rud rudVar, int i) {
            vq1.super.m32783clipRectmtrdDE(rudVar, i);
        }

        @Deprecated
        public static void drawArc(@yfb vq1 vq1Var, @yfb rud rudVar, float f, float f2, boolean z, @yfb icc iccVar) {
            vq1.super.drawArc(rudVar, f, f2, z, iccVar);
        }

        @Deprecated
        public static void drawArcRad(@yfb vq1 vq1Var, @yfb rud rudVar, float f, float f2, boolean z, @yfb icc iccVar) {
            vq1.super.drawArcRad(rudVar, f, f2, z, iccVar);
        }

        @Deprecated
        public static void drawOval(@yfb vq1 vq1Var, @yfb rud rudVar, @yfb icc iccVar) {
            vq1.super.drawOval(rudVar, iccVar);
        }

        @Deprecated
        public static void drawRect(@yfb vq1 vq1Var, @yfb rud rudVar, @yfb icc iccVar) {
            vq1.super.drawRect(rudVar, iccVar);
        }

        @Deprecated
        public static void skewRad(@yfb vq1 vq1Var, float f, float f2) {
            vq1.super.skewRad(f, f2);
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m32779clipPathmtrdDE$default(vq1 vq1Var, vic vicVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        vq1Var.mo28666clipPathmtrdDE(vicVar, i);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m32780clipRectN_I0leg$default(vq1 vq1Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        vq1Var.mo28667clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m32781clipRectmtrdDE$default(vq1 vq1Var, rud rudVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        vq1Var.m32783clipRectmtrdDE(rudVar, i);
    }

    /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m32782drawImageRectHPBpro0$default(vq1 vq1Var, rs7 rs7Var, long j, long j2, long j3, long j4, icc iccVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM27211getZeronOccac = (i & 2) != 0 ? a78.f545b.m27211getZeronOccac() : j;
        long jIntSize = (i & 4) != 0 ? s78.IntSize(rs7Var.getWidth(), rs7Var.getHeight()) : j2;
        vq1Var.mo28671drawImageRectHPBpro0(rs7Var, jM27211getZeronOccac, jIntSize, (i & 8) != 0 ? a78.f545b.m27211getZeronOccac() : j3, (i & 16) != 0 ? jIntSize : j4, iccVar);
    }

    static /* synthetic */ void scale$default(vq1 vq1Var, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i & 2) != 0) {
            f2 = f;
        }
        vq1Var.scale(f, f2);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo28666clipPathmtrdDE(@yfb vic vicVar, int i);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo28667clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m32783clipRectmtrdDE(@yfb rud rudVar, int i) {
        mo28667clipRectN_I0leg(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), i);
    }

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo28668concat58bKbWc(@yfb float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @yfb icc iccVar);

    default void drawArc(@yfb rud rudVar, float f, float f2, boolean z, @yfb icc iccVar) {
        drawArc(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), f, f2, z, iccVar);
    }

    default void drawArcRad(@yfb rud rudVar, float f, float f2, boolean z, @yfb icc iccVar) {
        drawArc(rudVar, n34.degrees(f), n34.degrees(f2), z, iccVar);
    }

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo28669drawCircle9KIMszo(long j, float f, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo28670drawImaged4ec7I(@yfb rs7 rs7Var, long j, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo28671drawImageRectHPBpro0(@yfb rs7 rs7Var, long j, long j2, long j3, long j4, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo28672drawLineWko1d7g(long j, long j2, @yfb icc iccVar);

    void drawOval(float f, float f2, float f3, float f4, @yfb icc iccVar);

    default void drawOval(@yfb rud rudVar, @yfb icc iccVar) {
        drawOval(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), iccVar);
    }

    void drawPath(@yfb vic vicVar, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo28673drawPointsO7TthRY(int i, @yfb List<izb> list, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo28674drawRawPointsO7TthRY(int i, @yfb float[] fArr, @yfb icc iccVar);

    void drawRect(float f, float f2, float f3, float f4, @yfb icc iccVar);

    default void drawRect(@yfb rud rudVar, @yfb icc iccVar) {
        drawRect(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), iccVar);
    }

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @yfb icc iccVar);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo28675drawVerticesTPEHhCM(@yfb l5i l5iVar, int i, @yfb icc iccVar);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(@yfb rud rudVar, @yfb icc iccVar);

    void scale(float f, float f2);

    void skew(float f, float f2);

    default void skewRad(float f, float f2) {
        skew(n34.degrees(f), n34.degrees(f2));
    }

    void translate(float f, float f2);
}
