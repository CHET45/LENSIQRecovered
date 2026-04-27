package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ze6<R, T> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final og6<? extends R, ? super T> f104899c;

    public ze6(l86<T> source, og6<? extends R, ? super T> operator) {
        super(source);
        this.f104899c = operator;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        try {
            ycg<? super Object> ycgVarApply = this.f104899c.apply(s);
            if (ycgVarApply != null) {
                this.f49321b.subscribe(ycgVarApply);
                return;
            }
            throw new NullPointerException("Operator " + this.f104899c + " returned a null Subscriber");
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
