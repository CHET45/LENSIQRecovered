package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sc6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends qh2> f81194c;

    /* JADX INFO: renamed from: d */
    public final int f81195d;

    /* JADX INFO: renamed from: e */
    public final boolean f81196e;

    /* JADX INFO: renamed from: sc6$a */
    public static final class C12517a<T> extends sv0<T> implements lj6<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f81197C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f81198a;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends qh2> f81200c;

        /* JADX INFO: renamed from: d */
        public final boolean f81201d;

        /* JADX INFO: renamed from: f */
        public final int f81203f;

        /* JADX INFO: renamed from: m */
        public fdg f81204m;

        /* JADX INFO: renamed from: b */
        public final cc0 f81199b = new cc0();

        /* JADX INFO: renamed from: e */
        public final nm2 f81202e = new nm2();

        /* JADX INFO: renamed from: sc6$a$a */
        public final class a extends AtomicReference<mf4> implements dh2, mf4 {
            private static final long serialVersionUID = 8606673141535671828L;

            public a() {
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return ag4.isDisposed(get());
            }

            @Override // p000.dh2
            public void onComplete() {
                C12517a.this.m21818a(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                C12517a.this.m21819b(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C12517a(ycg<? super T> ycgVar, py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
            this.f81198a = ycgVar;
            this.f81200c = py6Var;
            this.f81201d = z;
            this.f81203f = i;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m21818a(C12517a<T>.a aVar) {
            this.f81202e.delete(aVar);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m21819b(C12517a<T>.a aVar, Throwable th) {
            this.f81202e.delete(aVar);
            onError(th);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81197C = true;
            this.f81204m.cancel();
            this.f81202e.dispose();
        }

        @Override // p000.ajf
        public void clear() {
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f81203f != Integer.MAX_VALUE) {
                    this.f81204m.request(1L);
                }
            } else {
                Throwable thTerminate = this.f81199b.terminate();
                if (thTerminate != null) {
                    this.f81198a.onError(thTerminate);
                } else {
                    this.f81198a.onComplete();
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f81199b.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f81201d) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f81198a.onError(this.f81199b.terminate());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f81198a.onError(this.f81199b.terminate());
            } else if (this.f81203f != Integer.MAX_VALUE) {
                this.f81204m.request(1L);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f81200c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                a aVar = new a();
                if (this.f81197C || !this.f81202e.add(aVar)) {
                    return;
                }
                qh2Var.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f81204m.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f81204m, fdgVar)) {
                this.f81204m = fdgVar;
                this.f81198a.onSubscribe(this);
                int i = this.f81203f;
                if (i == Integer.MAX_VALUE) {
                    fdgVar.request(Long.MAX_VALUE);
                } else {
                    fdgVar.request(i);
                }
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            return null;
        }

        @Override // p000.fdg
        public void request(long j) {
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public sc6(m86<T> m86Var, py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
        super(m86Var);
        this.f81194c = py6Var;
        this.f81196e = z;
        this.f81195d = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C12517a(ycgVar, this.f81194c, this.f81196e, this.f81195d));
    }
}
