package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zt8<T> extends AtomicReference<fdg> implements lj6<T>, fdg, mf4, vt8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super T> f106064a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f106065b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f106066c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super fdg> f106067d;

    public zt8(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, tu2<? super fdg> tu2Var3) {
        this.f106064a = tu2Var;
        this.f106065b = tu2Var2;
        this.f106066c = interfaceC7178i8;
        this.f106067d = tu2Var3;
    }

    @Override // p000.fdg
    public void cancel() {
        mdg.cancel(this);
    }

    @Override // p000.mf4
    public void dispose() {
        cancel();
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return this.f106065b != q07.f72644f;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == mdg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        fdg fdgVar = get();
        mdg mdgVar = mdg.CANCELLED;
        if (fdgVar != mdgVar) {
            lazySet(mdgVar);
            try {
                this.f106066c.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        fdg fdgVar = get();
        mdg mdgVar = mdg.CANCELLED;
        if (fdgVar == mdgVar) {
            pfe.onError(th);
            return;
        }
        lazySet(mdgVar);
        try {
            this.f106065b.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f106064a.accept(t);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.setOnce(this, fdgVar)) {
            try {
                this.f106067d.accept(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                fdgVar.cancel();
                onError(th);
            }
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        get().request(j);
    }
}
