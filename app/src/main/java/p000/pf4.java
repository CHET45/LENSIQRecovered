package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pf4<T> extends AtomicReference<fdg> implements kj6<T>, lf4, ut8 {
    private static final long serialVersionUID = 8924480688481408726L;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<sf4> f70589a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f70590b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super Throwable> f70591c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7776j8 f70592d;

    public pf4(sf4 composite, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f70590b = onNext;
        this.f70591c = onError;
        this.f70592d = onComplete;
        this.f70589a = new AtomicReference<>(composite);
    }

    /* JADX INFO: renamed from: a */
    public void m19457a() {
        sf4 andSet = this.f70589a.getAndSet(null);
        if (andSet != null) {
            andSet.delete(this);
        }
    }

    @Override // p000.lf4
    public void dispose() {
        ldg.cancel(this);
        m19457a();
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f70591c != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return ldg.CANCELLED == get();
    }

    @Override // p000.ycg
    public void onComplete() {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar != ldgVar) {
            lazySet(ldgVar);
            try {
                this.f70592d.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
        m19457a();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar != ldgVar) {
            lazySet(ldgVar);
            try {
                this.f70591c.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(t, th));
            }
        } else {
            ofe.onError(t);
        }
        m19457a();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (get() != ldg.CANCELLED) {
            try {
                this.f70590b.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this, s)) {
            s.request(Long.MAX_VALUE);
        }
    }
}
