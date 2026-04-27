package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4551#2,7:290\n4551#2,7:297\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,7\n286#1:297,7\n*E\n"})
@e0g(parameters = 0)
public final class jzb<N> implements p40<N> {

    /* JADX INFO: renamed from: d */
    public static final int f52279d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final p40<N> f52280a;

    /* JADX INFO: renamed from: b */
    public final int f52281b;

    /* JADX INFO: renamed from: c */
    public int f52282c;

    public jzb(@yfb p40<N> p40Var, int i) {
        this.f52280a = p40Var;
        this.f52281b = i;
    }

    @Override // p000.p40
    public void clear() {
        gm2.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // p000.p40
    public void down(N n) {
        this.f52282c++;
        this.f52280a.down(n);
    }

    @Override // p000.p40
    public N getCurrent() {
        return this.f52280a.getCurrent();
    }

    @Override // p000.p40
    public void insertBottomUp(int i, N n) {
        this.f52280a.insertBottomUp(i + (this.f52282c == 0 ? this.f52281b : 0), n);
    }

    @Override // p000.p40
    public void insertTopDown(int i, N n) {
        this.f52280a.insertTopDown(i + (this.f52282c == 0 ? this.f52281b : 0), n);
    }

    @Override // p000.p40
    public void move(int i, int i2, int i3) {
        int i4 = this.f52282c == 0 ? this.f52281b : 0;
        this.f52280a.move(i + i4, i2 + i4, i3);
    }

    @Override // p000.p40
    public void remove(int i, int i2) {
        this.f52280a.remove(i + (this.f52282c == 0 ? this.f52281b : 0), i2);
    }

    @Override // p000.p40
    /* JADX INFO: renamed from: up */
    public void mo14389up() {
        if (!(this.f52282c > 0)) {
            gm2.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.f52282c--;
        this.f52280a.mo14389up();
    }
}
