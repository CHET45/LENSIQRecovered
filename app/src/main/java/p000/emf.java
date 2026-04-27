package p000;

import java.util.stream.Stream;
import p000.u7a;

/* JADX INFO: loaded from: classes7.dex */
public final class emf<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final kjf<T> f33559b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Stream<? extends R>> f33560c;

    public emf(kjf<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper) {
        this.f33559b = source;
        this.f33560c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super R> s) {
        this.f33559b.subscribe(new u7a.C13394a(s, this.f33560c));
    }
}
