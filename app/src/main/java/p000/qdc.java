package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class qdc<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f74083a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends zjd<? extends R>> f74084b;

    /* JADX INFO: renamed from: c */
    public final int f74085c;

    /* JADX INFO: renamed from: d */
    public final e55 f74086d;

    public qdc(eec<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, e55 errorMode) {
        this.f74083a = source;
        Objects.requireNonNull(mapper, "mapper");
        this.f74084b = mapper;
        this.f74085c = prefetch;
        Objects.requireNonNull(errorMode, "errorMode");
        this.f74086d = errorMode;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f74083a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr[i] = x96.subscribe(ycgVarArrOnSubscribe[i], this.f74084b, this.f74085c, this.f74086d);
            }
            this.f74083a.subscribe(ycgVarArr);
        }
    }
}
