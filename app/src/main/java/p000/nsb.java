package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface nsb<T, U> {
    void accept(pxb<? super U> a, T v);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int m);
}
