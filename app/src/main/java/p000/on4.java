package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n50#2:577\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n554#1:577\n*E\n"})
@vw7
public final class on4 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C10475a f68172e = new C10475a(null);

    /* JADX INFO: renamed from: f */
    public static final int f68173f = 0;

    /* JADX INFO: renamed from: a */
    public final float f68174a;

    /* JADX INFO: renamed from: b */
    public final float f68175b;

    /* JADX INFO: renamed from: c */
    public final float f68176c;

    /* JADX INFO: renamed from: d */
    public final float f68177d;

    /* JADX INFO: renamed from: on4$a */
    public static final class C10475a {
        public /* synthetic */ C10475a(jt3 jt3Var) {
            this();
        }

        private C10475a() {
        }
    }

    public /* synthetic */ on4(float f, float f2, float f3, float f4, jt3 jt3Var) {
        this(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ on4 m31496copya9UjIt4$default(on4 on4Var, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = on4Var.f68174a;
        }
        if ((i & 2) != 0) {
            f2 = on4Var.f68175b;
        }
        if ((i & 4) != 0) {
            f3 = on4Var.f68176c;
        }
        if ((i & 8) != 0) {
            f4 = on4Var.f68177d;
        }
        return on4Var.m31505copya9UjIt4(f, f2, f3, f4);
    }

    @f0g
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31497getBottomD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31498getLeftD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31499getRightD9Ej5fM$annotations() {
    }

    @f0g
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31500getTopD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m31501component1D9Ej5fM() {
        return this.f68174a;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m31502component2D9Ej5fM() {
        return this.f68175b;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m31503component3D9Ej5fM() {
        return this.f68176c;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m31504component4D9Ej5fM() {
        return this.f68177d;
    }

    @yfb
    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final on4 m31505copya9UjIt4(float f, float f2, float f3, float f4) {
        return new on4(f, f2, f3, f4, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on4)) {
            return false;
        }
        on4 on4Var = (on4) obj;
        return kn4.m30710equalsimpl0(this.f68174a, on4Var.f68174a) && kn4.m30710equalsimpl0(this.f68175b, on4Var.f68175b) && kn4.m30710equalsimpl0(this.f68176c, on4Var.f68176c) && kn4.m30710equalsimpl0(this.f68177d, on4Var.f68177d);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m31506getBottomD9Ej5fM() {
        return this.f68177d;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m31507getLeftD9Ej5fM() {
        return this.f68174a;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m31508getRightD9Ej5fM() {
        return this.f68176c;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m31509getTopD9Ej5fM() {
        return this.f68175b;
    }

    public int hashCode() {
        return (((((kn4.m30711hashCodeimpl(this.f68174a) * 31) + kn4.m30711hashCodeimpl(this.f68175b)) * 31) + kn4.m30711hashCodeimpl(this.f68176c)) * 31) + kn4.m30711hashCodeimpl(this.f68177d);
    }

    @yfb
    public String toString() {
        return "DpRect(left=" + ((Object) kn4.m30716toStringimpl(this.f68174a)) + ", top=" + ((Object) kn4.m30716toStringimpl(this.f68175b)) + ", right=" + ((Object) kn4.m30716toStringimpl(this.f68176c)) + ", bottom=" + ((Object) kn4.m30716toStringimpl(this.f68177d)) + ')';
    }

    public /* synthetic */ on4(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    private on4(float f, float f2, float f3, float f4) {
        this.f68174a = f;
        this.f68175b = f2;
        this.f68176c = f3;
        this.f68177d = f4;
    }

    private on4(long j, long j2) {
        this(nn4.m31166getXD9Ej5fM(j), nn4.m31168getYD9Ej5fM(j), kn4.m30705constructorimpl(nn4.m31166getXD9Ej5fM(j) + pn4.m31815getWidthD9Ej5fM(j2)), kn4.m30705constructorimpl(nn4.m31168getYD9Ej5fM(j) + pn4.m31813getHeightD9Ej5fM(j2)), null);
    }
}
