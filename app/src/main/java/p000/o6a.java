package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface o6a<T> {
    boolean isDisposed();

    void onComplete();

    void onError(@bfb Throwable th);

    void onSuccess(@bfb T t);

    void setCancellable(@cib aq1 aq1Var);

    void setDisposable(@cib mf4 mf4Var);

    boolean tryOnError(@bfb Throwable th);
}
