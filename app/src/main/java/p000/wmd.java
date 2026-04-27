package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface wmd<T, U> {
    boolean accept(ycg<? super U> ycgVar, T t);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i);

    long produced(long j);

    long requested();
}
