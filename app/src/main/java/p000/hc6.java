package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface hc6<T> extends qy4<T> {
    boolean isCancelled();

    long requested();

    @cfb
    hc6<T> serialize();

    void setCancellable(@dib bq1 c);

    void setDisposable(@dib lf4 d);

    boolean tryOnError(@cfb Throwable t);
}
