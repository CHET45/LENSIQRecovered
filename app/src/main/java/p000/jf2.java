package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface jf2 {
    boolean isDisposed();

    void onComplete();

    void onError(@bfb Throwable th);

    void setCancellable(@cib aq1 aq1Var);

    void setDisposable(@cib mf4 mf4Var);

    boolean tryOnError(@bfb Throwable th);
}
