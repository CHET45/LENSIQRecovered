package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface jlf<T> {
    boolean isDisposed();

    void onError(@bfb Throwable th);

    void onSuccess(@bfb T t);

    void setCancellable(@cib aq1 aq1Var);

    void setDisposable(@cib mf4 mf4Var);

    boolean tryOnError(@bfb Throwable th);
}
