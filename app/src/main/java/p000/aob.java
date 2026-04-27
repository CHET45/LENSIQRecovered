package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class aob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f11450b;

    /* JADX INFO: renamed from: aob$a */
    public static final class C1526a<T> extends pv0<T> implements pxb<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f11451a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f11452b;

        /* JADX INFO: renamed from: c */
        public lf4 f11453c;

        /* JADX INFO: renamed from: d */
        public tmd<T> f11454d;

        /* JADX INFO: renamed from: e */
        public boolean f11455e;

        public C1526a(pxb<? super T> actual, InterfaceC7776j8 onFinally) {
            this.f11451a = actual;
            this.f11452b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m2496a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f11452b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.zif
        public void clear() {
            this.f11454d.clear();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f11453c.dispose();
            m2496a();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f11453c.isDisposed();
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f11454d.isEmpty();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f11451a.onComplete();
            m2496a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f11451a.onError(t);
            m2496a();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f11451a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f11453c, d)) {
                this.f11453c = d;
                if (d instanceof tmd) {
                    this.f11454d = (tmd) d;
                }
                this.f11451a.onSubscribe(this);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f11454d.poll();
            if (tPoll == null && this.f11455e) {
                m2496a();
            }
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            tmd<T> tmdVar = this.f11454d;
            if (tmdVar == null || (mode & 4) != 0) {
                return 0;
            }
            int iRequestFusion = tmdVar.requestFusion(mode);
            if (iRequestFusion != 0) {
                this.f11455e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public aob(wub<T> source, InterfaceC7776j8 onFinally) {
        super(source);
        this.f11450b = onFinally;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C1526a(observer, this.f11450b));
    }
}
