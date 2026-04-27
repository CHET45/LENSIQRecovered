package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ub6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f87368c;

    /* JADX INFO: renamed from: ub6$a */
    public static final class C13442a<T> extends sv0<T> implements cq2<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final cq2<? super T> f87369a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f87370b;

        /* JADX INFO: renamed from: c */
        public fdg f87371c;

        /* JADX INFO: renamed from: d */
        public cod<T> f87372d;

        /* JADX INFO: renamed from: e */
        public boolean f87373e;

        public C13442a(cq2<? super T> cq2Var, InterfaceC7178i8 interfaceC7178i8) {
            this.f87369a = cq2Var;
            this.f87370b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m23172a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f87370b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f87371c.cancel();
            m23172a();
        }

        @Override // p000.ajf
        public void clear() {
            this.f87372d.clear();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f87372d.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f87369a.onComplete();
            m23172a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f87369a.onError(th);
            m23172a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f87369a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87371c, fdgVar)) {
                this.f87371c = fdgVar;
                if (fdgVar instanceof cod) {
                    this.f87372d = (cod) fdgVar;
                }
                this.f87369a.onSubscribe(this);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f87372d.poll();
            if (tPoll == null && this.f87373e) {
                m23172a();
            }
            return tPoll;
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f87371c.request(j);
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            cod<T> codVar = this.f87372d;
            if (codVar == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = codVar.requestFusion(i);
            if (iRequestFusion != 0) {
                this.f87373e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            return this.f87369a.tryOnNext(t);
        }
    }

    /* JADX INFO: renamed from: ub6$b */
    public static final class C13443b<T> extends sv0<T> implements lj6<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f87374a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f87375b;

        /* JADX INFO: renamed from: c */
        public fdg f87376c;

        /* JADX INFO: renamed from: d */
        public cod<T> f87377d;

        /* JADX INFO: renamed from: e */
        public boolean f87378e;

        public C13443b(ycg<? super T> ycgVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f87374a = ycgVar;
            this.f87375b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m23173a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f87375b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f87376c.cancel();
            m23173a();
        }

        @Override // p000.ajf
        public void clear() {
            this.f87377d.clear();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f87377d.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f87374a.onComplete();
            m23173a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f87374a.onError(th);
            m23173a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f87374a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87376c, fdgVar)) {
                this.f87376c = fdgVar;
                if (fdgVar instanceof cod) {
                    this.f87377d = (cod) fdgVar;
                }
                this.f87374a.onSubscribe(this);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f87377d.poll();
            if (tPoll == null && this.f87378e) {
                m23173a();
            }
            return tPoll;
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f87376c.request(j);
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            cod<T> codVar = this.f87377d;
            if (codVar == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = codVar.requestFusion(i);
            if (iRequestFusion != 0) {
                this.f87378e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ub6(m86<T> m86Var, InterfaceC7178i8 interfaceC7178i8) {
        super(m86Var);
        this.f87368c = interfaceC7178i8;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C13442a((cq2) ycgVar, this.f87368c));
        } else {
            this.f52360b.subscribe((lj6) new C13443b(ycgVar, this.f87368c));
        }
    }
}
