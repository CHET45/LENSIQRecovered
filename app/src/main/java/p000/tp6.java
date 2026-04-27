package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tp6<T> extends AtomicReference<fdg> implements lj6<T>, mf4 {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a */
    public final m8d<? super T> f85538a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f85539b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f85540c;

    /* JADX INFO: renamed from: d */
    public boolean f85541d;

    public tp6(m8d<? super T> m8dVar, tu2<? super Throwable> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        this.f85538a = m8dVar;
        this.f85539b = tu2Var;
        this.f85540c = interfaceC7178i8;
    }

    @Override // p000.mf4
    public void dispose() {
        mdg.cancel(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == mdg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f85541d) {
            return;
        }
        this.f85541d = true;
        try {
            this.f85540c.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f85541d) {
            pfe.onError(th);
            return;
        }
        this.f85541d = true;
        try {
            this.f85539b.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f85541d) {
            return;
        }
        try {
            if (this.f85538a.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
    }
}
