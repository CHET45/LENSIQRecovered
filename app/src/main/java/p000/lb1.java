package p000;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class lb1 {

    /* JADX INFO: renamed from: lb1$a */
    public static final class C8753a extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8753a f57029a = new C8753a();

        public C8753a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
        }
    }

    /* JADX INFO: renamed from: lb1$b */
    public static final class C8754b extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ he1 f57030a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f57031b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f57032c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ rp4 f57033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8754b(he1 he1Var, long j, long j2, rp4 rp4Var) {
            super(1);
            this.f57030a = he1Var;
            this.f57031b = j;
            this.f57032c = j2;
            this.f57033d = rp4Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
            ip4.m30247drawRectAsUm42w$default(ov2Var, this.f57030a, this.f57031b, this.f57032c, 0.0f, this.f57033d, null, 0, 104, null);
        }
    }

    @f0g
    @yfb
    public static final InterfaceC0701e border(@yfb InterfaceC0701e interfaceC0701e, @yfb nb1 nb1Var, @yfb m8f m8fVar) {
        return m30857borderziNgDLE(interfaceC0701e, nb1Var.m31146getWidthD9Ej5fM(), nb1Var.getBrush(), m8fVar);
    }

    public static /* synthetic */ InterfaceC0701e border$default(InterfaceC0701e interfaceC0701e, nb1 nb1Var, m8f m8fVar, int i, Object obj) {
        if ((i & 2) != 0) {
            m8fVar = cvd.getRectangleShape();
        }
        return border(interfaceC0701e, nb1Var, m8fVar);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final InterfaceC0701e m30855borderxT4_qwU(@yfb InterfaceC0701e interfaceC0701e, float f, long j, @yfb m8f m8fVar) {
        return m30857borderziNgDLE(interfaceC0701e, f, new bvf(j, null), m8fVar);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m30856borderxT4_qwU$default(InterfaceC0701e interfaceC0701e, float f, long j, m8f m8fVar, int i, Object obj) {
        if ((i & 4) != 0) {
            m8fVar = cvd.getRectangleShape();
        }
        return m30855borderxT4_qwU(interfaceC0701e, f, j, m8fVar);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final InterfaceC0701e m30857borderziNgDLE(@yfb InterfaceC0701e interfaceC0701e, float f, @yfb he1 he1Var, @yfb m8f m8fVar) {
        return interfaceC0701e.then(new BorderModifierNodeElement(f, he1Var, m8fVar, null));
    }

    private static final mbe createInsetRoundedRect(float f, mbe mbeVar) {
        return new mbe(f, f, mbeVar.getWidth() - f, mbeVar.getHeight() - f, m30859shrinkKibmq7A(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs(), f), m30859shrinkKibmq7A(mbeVar.m30994getTopRightCornerRadiuskKHJgLs(), f), m30859shrinkKibmq7A(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs(), f), m30859shrinkKibmq7A(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vic createRoundRectPath(vic vicVar, mbe mbeVar, float f, boolean z) {
        vicVar.reset();
        vic.addRoundRect$default(vicVar, mbeVar, null, 2, null);
        if (!z) {
            vic vicVarPath = C8522ku.Path();
            vic.addRoundRect$default(vicVarPath, createInsetRoundedRect(f, mbeVar), null, 2, null);
            vicVar.mo28699opN5in7k0(vicVar, vicVarPath, tjc.f85067b.m32407getDifferenceb3I0S0c());
        }
        return vicVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hp4 drawContentWithoutBorder(tl1 tl1Var) {
        return tl1Var.onDrawWithContent(C8753a.f57029a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final hp4 m30858drawRectBorderNsqcLGU(tl1 tl1Var, he1 he1Var, long j, long j2, boolean z, float f) {
        return tl1Var.onDrawWithContent(new C8754b(he1Var, z ? izb.f49009b.m30445getZeroF1C5BW0() : j, z ? tl1Var.m32414getSizeNHjbRc() : j2, z ? nu5.f65694a : new eag(f, 0.0f, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m30859shrinkKibmq7A(long j, float f) {
        return v03.CornerRadius(Math.max(0.0f, u03.m32492getXimpl(j) - f), Math.max(0.0f, u03.m32493getYimpl(j) - f));
    }
}
