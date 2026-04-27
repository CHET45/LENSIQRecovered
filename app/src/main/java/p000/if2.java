package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface if2 {
    boolean isDisposed();

    void onComplete();

    void onError(@cfb Throwable t);

    void setCancellable(@dib bq1 c);

    void setDisposable(@dib lf4 d);

    boolean tryOnError(@cfb Throwable t);
}
