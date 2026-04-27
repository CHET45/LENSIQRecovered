package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class rg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2[] f78194a;

    /* JADX INFO: renamed from: rg2$a */
    public static final class C12072a extends AtomicInteger implements ch2, lf4 {
        private static final long serialVersionUID = -8360547806504310570L;

        /* JADX INFO: renamed from: a */
        public final ch2 f78195a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f78196b;

        /* JADX INFO: renamed from: c */
        public final mm2 f78197c;

        public C12072a(ch2 actual, AtomicBoolean once, mm2 set, int n) {
            this.f78195a = actual;
            this.f78196b = once;
            this.f78197c = set;
            lazySet(n);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f78197c.dispose();
            this.f78196b.set(true);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f78197c.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f78195a.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f78197c.dispose();
            if (this.f78196b.compareAndSet(false, true)) {
                this.f78195a.onError(e);
            } else {
                ofe.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f78197c.add(d);
        }
    }

    public rg2(ph2[] sources) {
        this.f78194a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        mm2 mm2Var = new mm2();
        C12072a c12072a = new C12072a(observer, new AtomicBoolean(), mm2Var, this.f78194a.length + 1);
        observer.onSubscribe(c12072a);
        for (ph2 ph2Var : this.f78194a) {
            if (mm2Var.isDisposed()) {
                return;
            }
            if (ph2Var == null) {
                mm2Var.dispose();
                c12072a.onError(new NullPointerException("A completable source is null"));
                return;
            }
            ph2Var.subscribe(c12072a);
        }
        c12072a.onComplete();
    }
}
