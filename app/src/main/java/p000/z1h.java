package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z1h<U, T extends U> extends uqe<T> implements Runnable {

    /* JADX INFO: renamed from: e */
    @un8
    public final long f103680e;

    public z1h(long j, @yfb zy2<? super U> zy2Var) {
        super(zy2Var.getContext(), zy2Var);
        this.f103680e = j;
    }

    @Override // p000.AbstractC12833t0, p000.sj8
    @yfb
    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core() + "(timeMillis=" + this.f103680e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        cancelCoroutine(c2h.TimeoutCancellationException(this.f103680e, p34.getDelay(getContext()), this));
    }
}
