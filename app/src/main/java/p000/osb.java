package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface osb<T, U> {
    void accept(oxb<? super U> oxbVar, T t);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i);
}
