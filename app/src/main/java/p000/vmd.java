package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface vmd<T, U> {
    boolean accept(ycg<? super U> a, T v);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int m);

    long produced(long n);

    long requested();
}
