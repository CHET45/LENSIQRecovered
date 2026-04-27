package p000;

/* JADX INFO: loaded from: classes.dex */
public final class obc extends qz8<kbc> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final oz6<ubc, Integer, zl2, Integer, bth> f67072b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qy6<Integer, Object> f67073c;

    /* JADX INFO: renamed from: d */
    public final int f67074d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final wc8<kbc> f67075e;

    /* JADX WARN: Multi-variable type inference failed */
    public obc(@yfb oz6<? super ubc, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var, @gib qy6<? super Integer, ? extends Object> qy6Var, int i) {
        this.f67072b = oz6Var;
        this.f67073c = qy6Var;
        this.f67074d = i;
        n5b n5bVar = new n5b();
        n5bVar.addInterval(i, new kbc(qy6Var, oz6Var));
        this.f67075e = n5bVar;
    }

    @Override // p000.qz8
    @yfb
    public wc8<kbc> getIntervals() {
        return this.f67075e;
    }

    @gib
    public final qy6<Integer, Object> getKey() {
        return this.f67073c;
    }

    @yfb
    public final oz6<ubc, Integer, zl2, Integer, bth> getPageContent() {
        return this.f67072b;
    }

    public final int getPageCount() {
        return this.f67074d;
    }
}
