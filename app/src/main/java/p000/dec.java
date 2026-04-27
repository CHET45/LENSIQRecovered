package p000;

import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class dec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f29527a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Stream<? extends R>> f29528b;

    /* JADX INFO: renamed from: c */
    public final int f29529c;

    public dec(eec<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        this.f29527a = source;
        this.f29528b = mapper;
        this.f29529c = prefetch;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f29527a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        if (m9902a(subscribers)) {
            int length = subscribers.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr[i] = dd6.subscribe(subscribers[i], this.f29528b, this.f29529c);
            }
            this.f29527a.subscribe(ycgVarArr);
        }
    }
}
