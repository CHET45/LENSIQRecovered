package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class af6<R, T> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final pg6<? extends R, ? super T> f1302c;

    public af6(m86<T> m86Var, pg6<? extends R, ? super T> pg6Var) {
        super(m86Var);
        this.f1302c = pg6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        try {
            ycg<? super Object> ycgVarApply = this.f1302c.apply(ycgVar);
            if (ycgVarApply != null) {
                this.f52360b.subscribe(ycgVarApply);
                return;
            }
            throw new NullPointerException("Operator " + this.f1302c + " returned a null Subscriber");
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
