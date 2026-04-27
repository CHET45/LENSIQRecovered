package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface i38<T> {
    void drain();

    void innerComplete(g38<T> inner);

    void innerError(g38<T> inner, Throwable e);

    void innerNext(g38<T> inner, T value);
}
