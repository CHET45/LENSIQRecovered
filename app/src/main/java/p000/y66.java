package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y66<T> extends uqe<T> {
    public y66(@yfb e13 e13Var, @yfb zy2<? super T> zy2Var) {
        super(e13Var, zy2Var);
    }

    @Override // p000.sj8
    public boolean childCancelled(@yfb Throwable th) {
        if (th instanceof uy1) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
