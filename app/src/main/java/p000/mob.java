package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface mob<T> extends ry4<T> {
    boolean isDisposed();

    @bfb
    mob<T> serialize();

    void setCancellable(@cib aq1 aq1Var);

    void setDisposable(@cib mf4 mf4Var);

    boolean tryOnError(@bfb Throwable th);
}
