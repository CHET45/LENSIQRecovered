package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ku1<T> extends ju1<T, T> {
    public /* synthetic */ ku1(y56 y56Var, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(y56Var, (i2 & 2) != 0 ? a05.f2a : e13Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? gf1.f39657a : gf1Var);
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new ku1(this.f51828d, e13Var, i, gf1Var);
    }

    @Override // p000.fu1
    @yfb
    public y56<T> dropChannelOperators() {
        return (y56<T>) this.f51828d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.ju1
    @gib
    /* JADX INFO: renamed from: g */
    public Object mo14309g(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = this.f51828d.collect((t66<? super S>) t66Var, zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    public ku1(@yfb y56<? extends T> y56Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(y56Var, e13Var, i, gf1Var);
    }
}
