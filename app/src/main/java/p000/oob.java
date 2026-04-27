package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class oob extends Observable<Object> implements ime<Object> {

    /* JADX INFO: renamed from: a */
    public static final Observable<Object> f68240a = new oob();

    private oob() {
    }

    @Override // p000.ime, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Object> oxbVar) {
        c05.complete(oxbVar);
    }
}
