package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f90547c;

    /* JADX INFO: renamed from: vb6$a */
    public static final class C13985a<T> extends rv0<T> implements bq2<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final bq2<? super T> f90548a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f90549b;

        /* JADX INFO: renamed from: c */
        public fdg f90550c;

        /* JADX INFO: renamed from: d */
        public bod<T> f90551d;

        /* JADX INFO: renamed from: e */
        public boolean f90552e;

        public C13985a(bq2<? super T> actual, InterfaceC7776j8 onFinally) {
            this.f90548a = actual;
            this.f90549b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m23902a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f90549b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f90550c.cancel();
            m23902a();
        }

        @Override // p000.zif
        public void clear() {
            this.f90551d.clear();
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f90551d.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f90548a.onComplete();
            m23902a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f90548a.onError(t);
            m23902a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f90548a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90550c, s)) {
                this.f90550c = s;
                if (s instanceof bod) {
                    this.f90551d = (bod) s;
                }
                this.f90548a.onSubscribe(this);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f90551d.poll();
            if (tPoll == null && this.f90552e) {
                m23902a();
            }
            return tPoll;
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f90550c.request(n);
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            bod<T> bodVar = this.f90551d;
            if (bodVar == null || (mode & 4) != 0) {
                return 0;
            }
            int iRequestFusion = bodVar.requestFusion(mode);
            if (iRequestFusion != 0) {
                this.f90552e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            return this.f90548a.tryOnNext(t);
        }
    }

    /* JADX INFO: renamed from: vb6$b */
    public static final class C13986b<T> extends rv0<T> implements kj6<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f90553a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f90554b;

        /* JADX INFO: renamed from: c */
        public fdg f90555c;

        /* JADX INFO: renamed from: d */
        public bod<T> f90556d;

        /* JADX INFO: renamed from: e */
        public boolean f90557e;

        public C13986b(ycg<? super T> actual, InterfaceC7776j8 onFinally) {
            this.f90553a = actual;
            this.f90554b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m23903a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f90554b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f90555c.cancel();
            m23903a();
        }

        @Override // p000.zif
        public void clear() {
            this.f90556d.clear();
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f90556d.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f90553a.onComplete();
            m23903a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f90553a.onError(t);
            m23903a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f90553a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90555c, s)) {
                this.f90555c = s;
                if (s instanceof bod) {
                    this.f90556d = (bod) s;
                }
                this.f90553a.onSubscribe(this);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f90556d.poll();
            if (tPoll == null && this.f90557e) {
                m23903a();
            }
            return tPoll;
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f90555c.request(n);
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            bod<T> bodVar = this.f90556d;
            if (bodVar == null || (mode & 4) != 0) {
                return 0;
            }
            int iRequestFusion = bodVar.requestFusion(mode);
            if (iRequestFusion != 0) {
                this.f90557e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public vb6(l86<T> source, InterfaceC7776j8 onFinally) {
        super(source);
        this.f90547c = onFinally;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C13985a((bq2) s, this.f90547c));
        } else {
            this.f49321b.subscribe((kj6) new C13986b(s, this.f90547c));
        }
    }
}
