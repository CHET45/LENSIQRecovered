package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface oxb<T> {
    void onComplete();

    void onError(@bfb Throwable th);

    void onNext(@bfb T t);

    void onSubscribe(@bfb mf4 mf4Var);
}
