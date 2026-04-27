package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xob<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f98798b;

    /* JADX INFO: renamed from: c */
    public final boolean f98799c;

    /* JADX INFO: renamed from: xob$a */
    public static final class C15232a<T> extends qv0<T> implements oxb<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f98800a;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends qh2> f98802c;

        /* JADX INFO: renamed from: d */
        public final boolean f98803d;

        /* JADX INFO: renamed from: f */
        public mf4 f98805f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f98806m;

        /* JADX INFO: renamed from: b */
        public final cc0 f98801b = new cc0();

        /* JADX INFO: renamed from: e */
        public final nm2 f98804e = new nm2();

        /* JADX INFO: renamed from: xob$a$a */
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
                C15232a.this.m25359a(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                C15232a.this.m25360b(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C15232a(oxb<? super T> oxbVar, py6<? super T, ? extends qh2> py6Var, boolean z) {
            this.f98800a = oxbVar;
            this.f98802c = py6Var;
            this.f98803d = z;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m25359a(C15232a<T>.a aVar) {
            this.f98804e.delete(aVar);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m25360b(C15232a<T>.a aVar, Throwable th) {
            this.f98804e.delete(aVar);
            onError(th);
        }

        @Override // p000.ajf
        public void clear() {
        }

        @Override // p000.mf4
        public void dispose() {
            this.f98806m = true;
            this.f98805f.dispose();
            this.f98804e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f98805f.isDisposed();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.f98801b.terminate();
                if (thTerminate != null) {
                    this.f98800a.onError(thTerminate);
                } else {
                    this.f98800a.onComplete();
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f98801b.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f98803d) {
                if (decrementAndGet() == 0) {
                    this.f98800a.onError(this.f98801b.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f98800a.onError(this.f98801b.terminate());
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f98802c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                a aVar = new a();
                if (this.f98806m || !this.f98804e.add(aVar)) {
                    return;
                }
                qh2Var.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f98805f.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f98805f, mf4Var)) {
                this.f98805f = mf4Var;
                this.f98800a.onSubscribe(this);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            return null;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public xob(xub<T> xubVar, py6<? super T, ? extends qh2> py6Var, boolean z) {
        super(xubVar);
        this.f98798b = py6Var;
        this.f98799c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C15232a(oxbVar, this.f98798b, this.f98799c));
    }
}
