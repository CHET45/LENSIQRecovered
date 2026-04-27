package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class m5b implements l5b {

    /* JADX INFO: renamed from: a */
    @yfb
    public final v6b<p98> f59941a = s9f.MutableSharedFlow$default(0, 16, gf1.f39658b, 1, null);

    @Override // p000.l5b
    @gib
    public Object emit(@yfb p98 p98Var, @yfb zy2<? super bth> zy2Var) {
        Object objEmit = getInteractions().emit(p98Var, zy2Var);
        return objEmit == pd8.getCOROUTINE_SUSPENDED() ? objEmit : bth.f14751a;
    }

    @Override // p000.l5b
    public boolean tryEmit(@yfb p98 p98Var) {
        return getInteractions().tryEmit(p98Var);
    }

    @Override // p000.q98
    @yfb
    public v6b<p98> getInteractions() {
        return this.f59941a;
    }
}
