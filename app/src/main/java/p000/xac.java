package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n148#3:486\n148#3:487\n148#3:488\n148#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n303#1:486\n305#1:487\n307#1:488\n309#1:489\n*E\n"})
@vw7
public final class xac implements vac {

    /* JADX INFO: renamed from: e */
    public static final int f97364e = 0;

    /* JADX INFO: renamed from: a */
    public final float f97365a;

    /* JADX INFO: renamed from: b */
    public final float f97366b;

    /* JADX INFO: renamed from: c */
    public final float f97367c;

    /* JADX INFO: renamed from: d */
    public final float f97368d;

    public /* synthetic */ xac(float f, float f2, float f3, float f4, jt3 jt3Var) {
        this(f, f2, f3, f4);
    }

    @f0g
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33219getBottomD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33220getEndD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33221getStartD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33222getTopD9Ej5fM$annotations() {
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo32749calculateBottomPaddingD9Ej5fM() {
        return this.f97368d;
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo32750calculateLeftPaddingu2uoSUM(@yfb ov8 ov8Var) {
        return ov8Var == ov8.Ltr ? this.f97365a : this.f97367c;
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo32751calculateRightPaddingu2uoSUM(@yfb ov8 ov8Var) {
        return ov8Var == ov8.Ltr ? this.f97367c : this.f97365a;
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float mo32752calculateTopPaddingD9Ej5fM() {
        return this.f97366b;
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof xac)) {
            return false;
        }
        xac xacVar = (xac) obj;
        return kn4.m30710equalsimpl0(this.f97365a, xacVar.f97365a) && kn4.m30710equalsimpl0(this.f97366b, xacVar.f97366b) && kn4.m30710equalsimpl0(this.f97367c, xacVar.f97367c) && kn4.m30710equalsimpl0(this.f97368d, xacVar.f97368d);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m33223getBottomD9Ej5fM() {
        return this.f97368d;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m33224getEndD9Ej5fM() {
        return this.f97367c;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m33225getStartD9Ej5fM() {
        return this.f97365a;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m33226getTopD9Ej5fM() {
        return this.f97366b;
    }

    public int hashCode() {
        return (((((kn4.m30711hashCodeimpl(this.f97365a) * 31) + kn4.m30711hashCodeimpl(this.f97366b)) * 31) + kn4.m30711hashCodeimpl(this.f97367c)) * 31) + kn4.m30711hashCodeimpl(this.f97368d);
    }

    @yfb
    public String toString() {
        return "PaddingValues(start=" + ((Object) kn4.m30716toStringimpl(this.f97365a)) + ", top=" + ((Object) kn4.m30716toStringimpl(this.f97366b)) + ", end=" + ((Object) kn4.m30716toStringimpl(this.f97367c)) + ", bottom=" + ((Object) kn4.m30716toStringimpl(this.f97368d)) + ')';
    }

    private xac(float f, float f2, float f3, float f4) {
        this.f97365a = f;
        this.f97366b = f2;
        this.f97367c = f3;
        this.f97368d = f4;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public /* synthetic */ xac(float f, float f2, float f3, float f4, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? kn4.m30705constructorimpl(0) : f, (i & 2) != 0 ? kn4.m30705constructorimpl(0) : f2, (i & 4) != 0 ? kn4.m30705constructorimpl(0) : f3, (i & 8) != 0 ? kn4.m30705constructorimpl(0) : f4, null);
    }
}
