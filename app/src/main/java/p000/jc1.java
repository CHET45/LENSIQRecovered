package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jc1<T> extends AtomicReference<fdg> implements kj6<T>, fdg, lf4, ut8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super T> f50278a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f50279b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f50280c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super fdg> f50281d;

    /* JADX INFO: renamed from: e */
    public final int f50282e;

    /* JADX INFO: renamed from: f */
    public int f50283f;

    /* JADX INFO: renamed from: m */
    public final int f50284m;

    public jc1(uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, uu2<? super fdg> onSubscribe, int bufferSize) {
        this.f50278a = onNext;
        this.f50279b = onError;
        this.f50280c = onComplete;
        this.f50281d = onSubscribe;
        this.f50282e = bufferSize;
        this.f50284m = bufferSize - (bufferSize >> 2);
    }

    @Override // p000.fdg
    public void cancel() {
        ldg.cancel(this);
    }

    @Override // p000.lf4
    public void dispose() {
        cancel();
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f50279b != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == ldg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar != ldgVar) {
            lazySet(ldgVar);
            try {
                this.f50280c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar == ldgVar) {
            ofe.onError(t);
            return;
        }
        lazySet(ldgVar);
        try {
            this.f50279b.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(t, th));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f50278a.accept(t);
            int i = this.f50283f + 1;
            if (i == this.f50284m) {
                this.f50283f = 0;
                get().request(this.f50284m);
            } else {
                this.f50283f = i;
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this, s)) {
            try {
                this.f50281d.accept(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                s.cancel();
                onError(th);
            }
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        get().request(n);
    }
}
