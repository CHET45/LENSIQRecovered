package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kc1<T> extends AtomicReference<fdg> implements lj6<T>, fdg, mf4, vt8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super T> f53566a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f53567b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f53568c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super fdg> f53569d;

    /* JADX INFO: renamed from: e */
    public final int f53570e;

    /* JADX INFO: renamed from: f */
    public int f53571f;

    /* JADX INFO: renamed from: m */
    public final int f53572m;

    public kc1(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, tu2<? super fdg> tu2Var3, int i) {
        this.f53566a = tu2Var;
        this.f53567b = tu2Var2;
        this.f53568c = interfaceC7178i8;
        this.f53569d = tu2Var3;
        this.f53570e = i;
        this.f53572m = i - (i >> 2);
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
        return this.f53567b != q07.f72644f;
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
                this.f53568c.run();
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
            this.f53567b.accept(th);
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
            this.f53566a.accept(t);
            int i = this.f53571f + 1;
            if (i == this.f53572m) {
                this.f53571f = 0;
                get().request(this.f53572m);
            } else {
                this.f53571f = i;
            }
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
                this.f53569d.accept(this);
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
