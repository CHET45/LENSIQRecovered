package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,564:1\n148#2:565\n148#2:566\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n544#1:565\n545#1:566\n*E\n"})
@e0g(parameters = 0)
public final class a86 {

    /* JADX INFO: renamed from: e */
    public static final int f607e = 8;

    /* JADX INFO: renamed from: a */
    public int f608a;

    /* JADX INFO: renamed from: b */
    public int f609b;

    /* JADX INFO: renamed from: c */
    public float f610c;

    /* JADX INFO: renamed from: d */
    public float f611d;

    public /* synthetic */ a86(int i, int i2, float f, float f2, jt3 jt3Var) {
        this(i, i2, f, f2);
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.f608a;
    }

    /* JADX INFO: renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m27212getMaxCrossAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.f611d;
    }

    /* JADX INFO: renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m27213getMaxMainAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.f610c;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.f609b;
    }

    public final void setLineIndex$foundation_layout_release(int i) {
        this.f608a = i;
    }

    /* JADX INFO: renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m27214setMaxCrossAxisSize0680j_4$foundation_layout_release(float f) {
        this.f611d = f;
    }

    /* JADX INFO: renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m27215setMaxMainAxisSize0680j_4$foundation_layout_release(float f) {
        this.f610c = f;
    }

    public final void setPositionInLine$foundation_layout_release(int i) {
        this.f609b = i;
    }

    /* JADX INFO: renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m27216update4j6BHR0$foundation_layout_release(int i, int i2, float f, float f2) {
        this.f608a = i;
        this.f609b = i2;
        this.f610c = f;
        this.f611d = f2;
    }

    private a86(int i, int i2, float f, float f2) {
        this.f608a = i;
        this.f609b = i2;
        this.f610c = f;
        this.f611d = f2;
    }

    public /* synthetic */ a86(int i, int i2, float f, float f2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? kn4.m30705constructorimpl(0) : f, (i3 & 8) != 0 ? kn4.m30705constructorimpl(0) : f2, null);
    }
}
