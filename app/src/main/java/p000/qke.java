package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qke<T> extends AbstractC7100i1<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<t66<? super T>, zy2<? super bth>, Object> f74764a;

    /* JADX WARN: Multi-variable type inference failed */
    public qke(@yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f74764a = gz6Var;
    }

    @Override // p000.AbstractC7100i1
    @gib
    public Object collectSafely(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        Object objInvoke = this.f74764a.invoke(t66Var, zy2Var);
        return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
    }
}
