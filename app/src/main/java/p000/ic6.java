package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface ic6<T> extends ry4<T> {
    boolean isCancelled();

    long requested();

    @bfb
    ic6<T> serialize();

    void setCancellable(@cib aq1 aq1Var);

    void setDisposable(@cib mf4 mf4Var);

    boolean tryOnError(@bfb Throwable th);
}
