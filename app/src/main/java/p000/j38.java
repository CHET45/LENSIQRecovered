package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface j38<T> {
    void drain();

    void innerComplete(h38<T> h38Var);

    void innerError(h38<T> h38Var, Throwable th);

    void innerNext(h38<T> h38Var, T t);
}
