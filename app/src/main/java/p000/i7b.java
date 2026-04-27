package p000;

/* JADX INFO: loaded from: classes.dex */
@hh5
@dwf({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n83#1:749\n83#1:750,2\n*E\n"})
@e0g(parameters = 1)
public final class i7b implements vli {

    /* JADX INFO: renamed from: c */
    public static final int f45924c = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f45925b;

    public i7b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return getInsets().getBottom(c64Var);
    }

    @yfb
    public final vli getInsets() {
        return (vli) this.f45925b.getValue();
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getInsets().getLeft(c64Var, ov8Var);
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return getInsets().getRight(c64Var, ov8Var);
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return getInsets().getTop(c64Var);
    }

    public final void setInsets(@yfb vli vliVar) {
        this.f45925b.setValue(vliVar);
    }

    public i7b(@yfb vli vliVar) {
        this.f45925b = xtf.mutableStateOf$default(vliVar, null, 2, null);
    }

    public /* synthetic */ i7b(vli vliVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? goi.WindowInsets(0, 0, 0, 0) : vliVar);
    }
}
