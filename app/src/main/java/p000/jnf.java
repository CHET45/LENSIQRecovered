package p000;

import p000.n9a;

/* JADX INFO: loaded from: classes7.dex */
public final class jnf<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f51312a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super Throwable> f51313b;

    public jnf(kjf<T> source, n8d<? super Throwable> predicate) {
        this.f51312a = source;
        this.f51313b = predicate;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f51312a.subscribe(new n9a.C9755a(observer, this.f51313b));
    }
}
