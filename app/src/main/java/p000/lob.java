package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface lob<T> extends qy4<T> {
    boolean isDisposed();

    @cfb
    lob<T> serialize();

    void setCancellable(@dib bq1 c);

    void setDisposable(@dib lf4 d);

    boolean tryOnError(@cfb Throwable t);
}
