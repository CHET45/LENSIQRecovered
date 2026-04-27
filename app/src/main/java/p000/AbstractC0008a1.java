package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: a1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0008a1 extends AtomicReference<lf4> implements lf4, ut8 {
    private static final long serialVersionUID = 8924480688481408726L;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<sf4> f90a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f91b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f92c;

    public AbstractC0008a1(sf4 composite, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f91b = onError;
        this.f92c = onComplete;
        this.f90a = new AtomicReference<>(composite);
    }

    /* JADX INFO: renamed from: a */
    public final void m15a() {
        sf4 andSet = this.f90a.getAndSet(null);
        if (andSet != null) {
            andSet.delete(this);
        }
    }

    @Override // p000.lf4
    public final void dispose() {
        zf4.dispose(this);
        m15a();
    }

    @Override // p000.ut8
    public final boolean hasCustomOnError() {
        return this.f91b != r07.f76642f;
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return zf4.isDisposed(get());
    }

    public final void onComplete() {
        lf4 lf4Var = get();
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var != zf4Var) {
            lazySet(zf4Var);
            try {
                this.f92c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
        m15a();
    }

    public final void onError(Throwable t) {
        lf4 lf4Var = get();
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var != zf4Var) {
            lazySet(zf4Var);
            try {
                this.f91b.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(t, th));
            }
        } else {
            ofe.onError(t);
        }
        m15a();
    }

    public final void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }
}
