package p000;

import p000.df6;

/* JADX INFO: loaded from: classes7.dex */
public final class hf6<T, U> extends l86<U> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f43366b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends U> f43367c;

    public hf6(zjd<T> source, sy6<? super T, ? extends U> mapper) {
        this.f43366b = source;
        this.f43367c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        this.f43366b.subscribe(new df6.C4778b(s, this.f43367c));
    }
}
