package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
public final class up4 {
    public static final void inset(@yfb tp4 tp4Var, float f, float f2) {
        tp4Var.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(tp4 tp4Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        tp4Var.inset(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m32638rotateRad0AR0LA0(@yfb tp4 tp4Var, float f, long j) {
        tp4Var.mo31601rotateUv8p0NA(n34.degrees(f), j);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m32639rotateRad0AR0LA0$default(tp4 tp4Var, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = tp4Var.mo31599getCenterF1C5BW0();
        }
        tp4Var.mo31601rotateUv8p0NA(n34.degrees(f), j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m32640scale0AR0LA0(@yfb tp4 tp4Var, float f, long j) {
        tp4Var.mo31602scale0AR0LA0(f, f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m32641scale0AR0LA0$default(tp4 tp4Var, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = tp4Var.mo31599getCenterF1C5BW0();
        }
        tp4Var.mo31602scale0AR0LA0(f, f, j);
    }

    public static final void inset(@yfb tp4 tp4Var, float f) {
        tp4Var.inset(f, f, f, f);
    }
}
