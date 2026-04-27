package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vd6<T> extends l86<T> implements nfg<T> {

    /* JADX INFO: renamed from: b */
    public final Runnable f90736b;

    public vd6(Runnable run) {
        this.f90736b = run;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        this.f90736b.run();
        return null;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        nq1 nq1Var = new nq1();
        subscriber.onSubscribe(nq1Var);
        if (nq1Var.isDisposed()) {
            return;
        }
        try {
            this.f90736b.run();
            if (nq1Var.isDisposed()) {
                return;
            }
            subscriber.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (nq1Var.isDisposed()) {
                ofe.onError(th);
            } else {
                subscriber.onError(th);
            }
        }
    }
}
