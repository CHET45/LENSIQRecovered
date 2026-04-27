package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface l9a<T> {
    void onComplete();

    void onError(@bfb Throwable th);

    void onSubscribe(@bfb mf4 mf4Var);

    void onSuccess(@bfb T t);
}
