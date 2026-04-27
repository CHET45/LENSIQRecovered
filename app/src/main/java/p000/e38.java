package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface e38<T> {
    void drain();

    void innerComplete(c38<T> inner);

    void innerError(c38<T> inner, Throwable e);

    void innerNext(c38<T> inner, T value);
}
