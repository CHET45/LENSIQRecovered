package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface n6a<T> {
    boolean isDisposed();

    void onComplete();

    void onError(@cfb Throwable t);

    void onSuccess(@cfb T t);

    void setCancellable(@dib bq1 c);

    void setDisposable(@dib lf4 d);

    boolean tryOnError(@cfb Throwable t);
}
