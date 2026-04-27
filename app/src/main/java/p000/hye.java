package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface hye {
    @gib
    Object acquire(@yfb zy2<? super bth> zy2Var);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
