package p000;

import java.util.stream.Stream;
import p000.v7a;

/* JADX INFO: loaded from: classes7.dex */
public final class fmf<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f37139a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Stream<? extends R>> f37140b;

    public fmf(kjf<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper) {
        this.f37139a = source;
        this.f37140b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(@cfb pxb<? super R> s) {
        this.f37139a.subscribe(new v7a.C13926a(s, this.f37140b));
    }
}
