package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class urb extends Observable<Object> {

    /* JADX INFO: renamed from: a */
    public static final Observable<Object> f88863a = new urb();

    private urb() {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Object> oxbVar) {
        oxbVar.onSubscribe(c05.NEVER);
    }
}
