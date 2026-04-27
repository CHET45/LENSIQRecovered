package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ji2<R> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Callable<R> f50630a;

    /* JADX INFO: renamed from: b */
    public final py6<? super R, ? extends qh2> f50631b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super R> f50632c;

    /* JADX INFO: renamed from: d */
    public final boolean f50633d;

    /* JADX INFO: renamed from: ji2$a */
    public static final class C7910a<R> extends AtomicReference<Object> implements dh2, mf4 {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: a */
        public final dh2 f50634a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super R> f50635b;

        /* JADX INFO: renamed from: c */
        public final boolean f50636c;

        /* JADX INFO: renamed from: d */
        public mf4 f50637d;

        public C7910a(dh2 dh2Var, R r, tu2<? super R> tu2Var, boolean z) {
            super(r);
            this.f50634a = dh2Var;
            this.f50635b = tu2Var;
            this.f50636c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m14101a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f50635b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f50637d.dispose();
            this.f50637d = ag4.DISPOSED;
            m14101a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f50637d.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f50637d = ag4.DISPOSED;
            if (this.f50636c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f50635b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f50634a.onError(th);
                    return;
                }
            }
            this.f50634a.onComplete();
            if (this.f50636c) {
                return;
            }
            m14101a();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f50637d = ag4.DISPOSED;
            if (this.f50636c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f50635b.accept(andSet);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    th = new pm2(th, th2);
                }
            }
            this.f50634a.onError(th);
            if (this.f50636c) {
                return;
            }
            m14101a();
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f50637d, mf4Var)) {
                this.f50637d = mf4Var;
                this.f50634a.onSubscribe(this);
            }
        }
    }

    public ji2(Callable<R> callable, py6<? super R, ? extends qh2> py6Var, tu2<? super R> tu2Var, boolean z) {
        this.f50630a = callable;
        this.f50631b = py6Var;
        this.f50632c = tu2Var;
        this.f50633d = z;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        try {
            R rCall = this.f50630a.call();
            try {
                ((qh2) xjb.requireNonNull(this.f50631b.apply(rCall), "The completableFunction returned a null CompletableSource")).subscribe(new C7910a(dh2Var, rCall, this.f50632c, this.f50633d));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                if (this.f50633d) {
                    try {
                        this.f50632c.accept(rCall);
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        c05.error(new pm2(th, th2), dh2Var);
                        return;
                    }
                }
                c05.error(th, dh2Var);
                if (this.f50633d) {
                    return;
                }
                try {
                    this.f50632c.accept(rCall);
                } catch (Throwable th3) {
                    n75.throwIfFatal(th3);
                    pfe.onError(th3);
                }
            }
        } catch (Throwable th4) {
            n75.throwIfFatal(th4);
            c05.error(th4, dh2Var);
        }
    }
}
