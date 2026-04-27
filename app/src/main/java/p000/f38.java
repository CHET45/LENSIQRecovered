package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface f38<T> {
    void drain();

    void innerComplete(d38<T> d38Var);

    void innerError(d38<T> d38Var, Throwable th);

    void innerNext(d38<T> d38Var, T t);
}
