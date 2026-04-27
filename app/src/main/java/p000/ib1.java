package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,516:1\n1#2:517\n546#3,17:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n413#1:518,17\n*E\n"})
public final class ib1 {

    /* JADX INFO: renamed from: a */
    @gib
    public rs7 f46428a;

    /* JADX INFO: renamed from: b */
    @gib
    public vq1 f46429b;

    /* JADX INFO: renamed from: c */
    @gib
    public nr1 f46430c;

    /* JADX INFO: renamed from: d */
    @gib
    public vic f46431d;

    public ib1() {
        this(null, null, null, null, 15, null);
    }

    private final rs7 component1() {
        return this.f46428a;
    }

    private final vq1 component2() {
        return this.f46429b;
    }

    private final nr1 component3() {
        return this.f46430c;
    }

    private final vic component4() {
        return this.f46431d;
    }

    public static /* synthetic */ ib1 copy$default(ib1 ib1Var, rs7 rs7Var, vq1 vq1Var, nr1 nr1Var, vic vicVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rs7Var = ib1Var.f46428a;
        }
        if ((i & 2) != 0) {
            vq1Var = ib1Var.f46429b;
        }
        if ((i & 4) != 0) {
            nr1Var = ib1Var.f46430c;
        }
        if ((i & 8) != 0) {
            vicVar = ib1Var.f46431d;
        }
        return ib1Var.copy(rs7Var, vq1Var, nr1Var, vicVar);
    }

    @yfb
    public final ib1 copy(@gib rs7 rs7Var, @gib vq1 vq1Var, @gib nr1 nr1Var, @gib vic vicVar) {
        return new ib1(rs7Var, vq1Var, nr1Var, vicVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @p000.yfb
    /* JADX INFO: renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.rs7 m30181drawBorderCacheEMwLDEs(@p000.yfb p000.tl1 r28, long r29, int r31, @p000.yfb p000.qy6<? super p000.ip4, p000.bth> r32) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ib1.m30181drawBorderCacheEMwLDEs(tl1, long, int, qy6):rs7");
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib1)) {
            return false;
        }
        ib1 ib1Var = (ib1) obj;
        return md8.areEqual(this.f46428a, ib1Var.f46428a) && md8.areEqual(this.f46429b, ib1Var.f46429b) && md8.areEqual(this.f46430c, ib1Var.f46430c) && md8.areEqual(this.f46431d, ib1Var.f46431d);
    }

    public int hashCode() {
        rs7 rs7Var = this.f46428a;
        int iHashCode = (rs7Var == null ? 0 : rs7Var.hashCode()) * 31;
        vq1 vq1Var = this.f46429b;
        int iHashCode2 = (iHashCode + (vq1Var == null ? 0 : vq1Var.hashCode())) * 31;
        nr1 nr1Var = this.f46430c;
        int iHashCode3 = (iHashCode2 + (nr1Var == null ? 0 : nr1Var.hashCode())) * 31;
        vic vicVar = this.f46431d;
        return iHashCode3 + (vicVar != null ? vicVar.hashCode() : 0);
    }

    @yfb
    public final vic obtainPath() {
        vic vicVar = this.f46431d;
        if (vicVar != null) {
            return vicVar;
        }
        vic vicVarPath = C8522ku.Path();
        this.f46431d = vicVarPath;
        return vicVarPath;
    }

    @yfb
    public String toString() {
        return "BorderCache(imageBitmap=" + this.f46428a + ", canvas=" + this.f46429b + ", canvasDrawScope=" + this.f46430c + ", borderPath=" + this.f46431d + ')';
    }

    public ib1(@gib rs7 rs7Var, @gib vq1 vq1Var, @gib nr1 nr1Var, @gib vic vicVar) {
        this.f46428a = rs7Var;
        this.f46429b = vq1Var;
        this.f46430c = nr1Var;
        this.f46431d = vicVar;
    }

    public /* synthetic */ ib1(rs7 rs7Var, vq1 vq1Var, nr1 nr1Var, vic vicVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : rs7Var, (i & 2) != 0 ? null : vq1Var, (i & 4) != 0 ? null : nr1Var, (i & 8) != 0 ? null : vicVar);
    }
}
