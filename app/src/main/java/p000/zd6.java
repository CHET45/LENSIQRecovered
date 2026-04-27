package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class zd6<T, S> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final nfg<S> f104829b;

    /* JADX INFO: renamed from: c */
    public final i11<S, qy4<T>, S> f104830c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super S> f104831d;

    /* JADX INFO: renamed from: zd6$a */
    public static final class C16093a<T, S> extends AtomicLong implements qy4<T>, fdg {
        private static final long serialVersionUID = 7565982551505011832L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f104832a;

        /* JADX INFO: renamed from: b */
        public final i11<S, ? super qy4<T>, S> f104833b;

        /* JADX INFO: renamed from: c */
        public final uu2<? super S> f104834c;

        /* JADX INFO: renamed from: d */
        public S f104835d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f104836e;

        /* JADX INFO: renamed from: f */
        public boolean f104837f;

        /* JADX INFO: renamed from: m */
        public boolean f104838m;

        public C16093a(ycg<? super T> actual, i11<S, ? super qy4<T>, S> generator, uu2<? super S> disposeState, S initialState) {
            this.f104832a = actual;
            this.f104833b = generator;
            this.f104834c = disposeState;
            this.f104835d = initialState;
        }

        private void dispose(S s) {
            try {
                this.f104834c.accept(s);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f104836e) {
                return;
            }
            this.f104836e = true;
            if (ro0.add(this, 1L) == 0) {
                S s = this.f104835d;
                this.f104835d = null;
                dispose(s);
            }
        }

        @Override // p000.qy4
        public void onComplete() {
            if (this.f104837f) {
                return;
            }
            this.f104837f = true;
            this.f104832a.onComplete();
        }

        @Override // p000.qy4
        public void onError(Throwable t) {
            if (this.f104837f) {
                ofe.onError(t);
                return;
            }
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            this.f104837f = true;
            this.f104832a.onError(t);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f104837f) {
                return;
            }
            if (this.f104838m) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else {
                this.f104838m = true;
                this.f104832a.onNext(t);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        
            r9.f104835d = r0;
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
                boolean r0 = p000.ldg.validate(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = p000.ro0.add(r9, r10)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L12
                return
            L12:
                S r0 = r9.f104835d
                i11<S, ? super qy4<T>, S> r1 = r9.f104833b
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4d
                boolean r6 = r9.f104836e
                r7 = 0
                if (r6 == 0) goto L26
                r9.f104835d = r7
                r9.dispose(r0)
                return
            L26:
                r6 = 0
                r9.f104838m = r6
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
                boolean r8 = r9.f104837f
                if (r8 == 0) goto L3a
                r9.f104836e = r6
                r9.f104835d = r7
                r9.dispose(r0)
                return
            L3a:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3e:
                r10 = move-exception
                p000.o75.throwIfFatal(r10)
                r9.f104836e = r6
                r9.f104835d = r7
                r9.onError(r10)
                r9.dispose(r0)
                return
            L4d:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.f104835d = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zd6.C16093a.request(long):void");
        }
    }

    public zd6(nfg<S> stateSupplier, i11<S, qy4<T>, S> generator, uu2<? super S> disposeState) {
        this.f104829b = stateSupplier;
        this.f104830c = generator;
        this.f104831d = disposeState;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            s.onSubscribe(new C16093a(s, this.f104830c, this.f104831d, this.f104829b.get()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
