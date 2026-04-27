package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class eob<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final tu2<? super mf4> f33727b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f33728c;

    public eob(Observable<T> observable, tu2<? super mf4> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        super(observable);
        this.f33727b = tu2Var;
        this.f33728c = interfaceC7178i8;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new cg4(oxbVar, this.f33727b, this.f33728c));
    }
}
