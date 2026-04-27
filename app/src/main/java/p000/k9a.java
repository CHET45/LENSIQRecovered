package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface k9a<T> {
    void onComplete();

    void onError(@cfb Throwable e);

    void onSubscribe(@cfb lf4 d);

    void onSuccess(@cfb T t);
}
