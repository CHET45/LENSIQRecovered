package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class yd6<T, S> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<S> f101228b;

    /* JADX INFO: renamed from: c */
    public final j11<S, ry4<T>, S> f101229c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super S> f101230d;

    /* JADX INFO: renamed from: yd6$a */
    public static final class C15622a<T, S> extends AtomicLong implements ry4<T>, fdg {
        private static final long serialVersionUID = 7565982551505011832L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101231a;

        /* JADX INFO: renamed from: b */
        public final j11<S, ? super ry4<T>, S> f101232b;

        /* JADX INFO: renamed from: c */
        public final tu2<? super S> f101233c;

        /* JADX INFO: renamed from: d */
        public S f101234d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f101235e;

        /* JADX INFO: renamed from: f */
        public boolean f101236f;

        /* JADX INFO: renamed from: m */
        public boolean f101237m;

        public C15622a(ycg<? super T> ycgVar, j11<S, ? super ry4<T>, S> j11Var, tu2<? super S> tu2Var, S s) {
            this.f101231a = ycgVar;
            this.f101232b = j11Var;
            this.f101233c = tu2Var;
            this.f101234d = s;
        }

        private void dispose(S s) {
            try {
                this.f101233c.accept(s);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f101235e) {
                return;
            }
            this.f101235e = true;
            if (so0.add(this, 1L) == 0) {
                S s = this.f101234d;
                this.f101234d = null;
                dispose(s);
            }
        }

        @Override // p000.ry4
        public void onComplete() {
            if (this.f101236f) {
                return;
            }
            this.f101236f = true;
            this.f101231a.onComplete();
        }

        @Override // p000.ry4
        public void onError(Throwable th) {
            if (this.f101236f) {
                pfe.onError(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f101236f = true;
            this.f101231a.onError(th);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f101236f) {
                return;
            }
            if (this.f101237m) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f101237m = true;
                this.f101231a.onNext(t);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        
            r9.f101234d = r0;
            r10 = addAndGet(-r4);
         */
        @Override // p000.fdg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void request(long r10) {
            /*
                r9 = this;
                boolean r0 = p000.mdg.validate(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = p000.so0.add(r9, r10)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L12
                return
            L12:
                S r0 = r9.f101234d
                j11<S, ? super ry4<T>, S> r1 = r9.f101232b
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4d
                boolean r6 = r9.f101235e
                r7 = 0
                if (r6 == 0) goto L26
                r9.f101234d = r7
                r9.dispose(r0)
                return
            L26:
                r6 = 0
                r9.f101237m = r6
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
                boolean r8 = r9.f101236f
                if (r8 == 0) goto L3a
                r9.f101235e = r6
                r9.f101234d = r7
                r9.dispose(r0)
                return
            L3a:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3e:
                r10 = move-exception
                p000.n75.throwIfFatal(r10)
                r9.f101235e = r6
                r9.f101234d = r7
                r9.onError(r10)
                r9.dispose(r0)
                return
            L4d:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.f101234d = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.yd6.C15622a.request(long):void");
        }
    }

    public yd6(Callable<S> callable, j11<S, ry4<T>, S> j11Var, tu2<? super S> tu2Var) {
        this.f101228b = callable;
        this.f101229c = j11Var;
        this.f101230d = tu2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            ycgVar.onSubscribe(new C15622a(ycgVar, this.f101229c, this.f101230d, this.f101228b.call()));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
