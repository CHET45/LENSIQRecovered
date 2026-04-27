package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f16383a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Iterable<? extends R>> f16384b;

    /* JADX INFO: renamed from: c */
    public final int f16385c;

    public cec(eec<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        this.f16383a = source;
        this.f16384b = mapper;
        this.f16385c = prefetch;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f16383a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr[i] = fd6.subscribe(ycgVarArrOnSubscribe[i], this.f16384b, this.f16385c);
            }
            this.f16383a.subscribe(ycgVarArr);
        }
    }
}
