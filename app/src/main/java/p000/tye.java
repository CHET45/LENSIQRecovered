package p000;

/* JADX INFO: loaded from: classes7.dex */
@la8
public final class tye<T> implements t66<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final nye<T> f86349a;

    /* JADX WARN: Multi-variable type inference failed */
    public tye(@yfb nye<? super T> nyeVar) {
        this.f86349a = nyeVar;
    }

    @Override // p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        Object objSend = this.f86349a.send(t, zy2Var);
        return objSend == pd8.getCOROUTINE_SUSPENDED() ? objSend : bth.f14751a;
    }
}
