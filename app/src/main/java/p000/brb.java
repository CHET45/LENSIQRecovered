package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class brb<R, T> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final esb<? extends R, ? super T> f14601b;

    public brb(wub<T> source, esb<? extends R, ? super T> operator) {
        super(source);
        this.f14601b = operator;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        try {
            pxb<? super Object> pxbVarApply = this.f14601b.apply(observer);
            Objects.requireNonNull(pxbVarApply, "Operator " + this.f14601b + " returned a null Observer");
            this.f63101a.subscribe(pxbVarApply);
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
