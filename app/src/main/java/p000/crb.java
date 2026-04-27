package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class crb<R, T> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final fsb<? extends R, ? super T> f27134b;

    public crb(xub<T> xubVar, fsb<? extends R, ? super T> fsbVar) {
        super(xubVar);
        this.f27134b = fsbVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        try {
            this.f66354a.subscribe((oxb) xjb.requireNonNull(this.f27134b.apply(oxbVar), "Operator " + this.f27134b + " returned a null Observer"));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
