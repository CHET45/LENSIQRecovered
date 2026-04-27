package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class aec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f1258a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends zjd<? extends R>> f1259b;

    /* JADX INFO: renamed from: c */
    public final boolean f1260c;

    /* JADX INFO: renamed from: d */
    public final int f1261d;

    /* JADX INFO: renamed from: e */
    public final int f1262e;

    public aec(eec<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayError, int maxConcurrency, int prefetch) {
        this.f1258a = source;
        this.f1259b = mapper;
        this.f1260c = delayError;
        this.f1261d = maxConcurrency;
        this.f1262e = prefetch;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f1258a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr[i] = rc6.subscribe(ycgVarArrOnSubscribe[i], this.f1259b, this.f1260c, this.f1261d, this.f1262e);
            }
            this.f1258a.subscribe(ycgVarArr);
        }
    }
}
