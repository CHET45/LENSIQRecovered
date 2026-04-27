package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,169:1\n310#2:170\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n128#1:170\n*E\n"})
@e0g(parameters = 1)
public final class be7 implements x4d {

    /* JADX INFO: renamed from: d */
    public static final int f13544d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC9407mm f13545a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qzb f13546b;

    /* JADX INFO: renamed from: c */
    public long f13547c = izb.f49009b.m30445getZeroF1C5BW0();

    public be7(@yfb InterfaceC9407mm interfaceC9407mm, @yfb qzb qzbVar) {
        this.f13545a = interfaceC9407mm;
        this.f13546b = qzbVar;
    }

    @Override // p000.x4d
    /* JADX INFO: renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo27992calculatePositionllwVHH4(@yfb l78 l78Var, long j, @yfb ov8 ov8Var, long j2) {
        long jMo29872provideF1C5BW0 = this.f13546b.mo29872provideF1C5BW0();
        if (!mzb.m31100isSpecifiedk4lQ0M(jMo29872provideF1C5BW0)) {
            jMo29872provideF1C5BW0 = this.f13547c;
        }
        this.f13547c = jMo29872provideF1C5BW0;
        return a78.m27205plusqkQi6aY(a78.m27205plusqkQi6aY(l78Var.m30828getTopLeftnOccac(), b78.m27960roundk4lQ0M(jMo29872provideF1C5BW0)), this.f13545a.mo30996alignKFBX0sM(j2, r78.f77324b.m32092getZeroYbymL2g(), ov8Var));
    }
}
