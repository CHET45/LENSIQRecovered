package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface pxb<T> {
    void onComplete();

    void onError(@cfb Throwable e);

    void onNext(@cfb T t);

    void onSubscribe(@cfb lf4 d);
}
