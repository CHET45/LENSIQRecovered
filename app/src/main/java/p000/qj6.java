package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qj6<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final m86<T> f74584a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f74585b;

    /* JADX INFO: renamed from: c */
    public final boolean f74586c;

    /* JADX INFO: renamed from: qj6$a */
    public static final class C11494a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: C */
        public static final a f74587C = new a(null);

        /* JADX INFO: renamed from: a */
        public final dh2 f74588a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f74589b;

        /* JADX INFO: renamed from: c */
        public final boolean f74590c;

        /* JADX INFO: renamed from: d */
        public final cc0 f74591d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a> f74592e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public volatile boolean f74593f;

        /* JADX INFO: renamed from: m */
        public fdg f74594m;

        /* JADX INFO: renamed from: qj6$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: a */
            public final C11494a<?> f74595a;

            public a(C11494a<?> c11494a) {
                this.f74595a = c11494a;
            }

            /* JADX INFO: renamed from: a */
            public void m20384a() {
                ag4.dispose(this);
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f74595a.m20382b(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f74595a.m20383c(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C11494a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, boolean z) {
            this.f74588a = dh2Var;
            this.f74589b = py6Var;
            this.f74590c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m20381a() {
            AtomicReference<a> atomicReference = this.f74592e;
            a aVar = f74587C;
            a andSet = atomicReference.getAndSet(aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m20384a();
        }

        /* JADX INFO: renamed from: b */
        public void m20382b(a aVar) {
            if (v7b.m23844a(this.f74592e, aVar, null) && this.f74593f) {
                Throwable thTerminate = this.f74591d.terminate();
                if (thTerminate == null) {
                    this.f74588a.onComplete();
                } else {
                    this.f74588a.onError(thTerminate);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m20383c(a aVar, Throwable th) {
            if (!v7b.m23844a(this.f74592e, aVar, null) || !this.f74591d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f74590c) {
                if (this.f74593f) {
                    this.f74588a.onError(this.f74591d.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.f74591d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f74588a.onError(thTerminate);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f74594m.cancel();
            m20381a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f74592e.get() == f74587C;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f74593f = true;
            if (this.f74592e.get() == null) {
                Throwable thTerminate = this.f74591d.terminate();
                if (thTerminate == null) {
                    this.f74588a.onComplete();
                } else {
                    this.f74588a.onError(thTerminate);
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f74591d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f74590c) {
                onComplete();
                return;
            }
            m20381a();
            Throwable thTerminate = this.f74591d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f74588a.onError(thTerminate);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a aVar;
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f74589b.apply(t), "The mapper returned a null CompletableSource");
                a aVar2 = new a(this);
                do {
                    aVar = this.f74592e.get();
                    if (aVar == f74587C) {
                        return;
                    }
                } while (!v7b.m23844a(this.f74592e, aVar, aVar2));
                if (aVar != null) {
                    aVar.m20384a();
                }
                qh2Var.subscribe(aVar2);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f74594m.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f74594m, fdgVar)) {
                this.f74594m = fdgVar;
                this.f74588a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public qj6(m86<T> m86Var, py6<? super T, ? extends qh2> py6Var, boolean z) {
        this.f74584a = m86Var;
        this.f74585b = py6Var;
        this.f74586c = z;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f74584a.subscribe((lj6) new C11494a(dh2Var, this.f74585b, this.f74586c));
    }
}
