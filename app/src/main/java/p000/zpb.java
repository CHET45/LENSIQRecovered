package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class zpb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f105711a;

    public zpb(xub<T> xubVar) {
        this.f105711a = xubVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f105711a.subscribe(oxbVar);
    }
}
