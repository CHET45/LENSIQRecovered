package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class znb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f105513b;

    /* JADX INFO: renamed from: znb$a */
    public static final class C16190a<T> extends qv0<T> implements oxb<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f105514a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f105515b;

        /* JADX INFO: renamed from: c */
        public mf4 f105516c;

        /* JADX INFO: renamed from: d */
        public umd<T> f105517d;

        /* JADX INFO: renamed from: e */
        public boolean f105518e;

        public C16190a(oxb<? super T> oxbVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f105514a = oxbVar;
            this.f105515b = interfaceC7178i8;
        }

        /* JADX INFO: renamed from: a */
        public void m26904a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f105515b.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.ajf
        public void clear() {
            this.f105517d.clear();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f105516c.dispose();
            m26904a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f105516c.isDisposed();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f105517d.isEmpty();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f105514a.onComplete();
            m26904a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f105514a.onError(th);
            m26904a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f105514a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f105516c, mf4Var)) {
                this.f105516c = mf4Var;
                if (mf4Var instanceof umd) {
                    this.f105517d = (umd) mf4Var;
                }
                this.f105514a.onSubscribe(this);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f105517d.poll();
            if (tPoll == null && this.f105518e) {
                m26904a();
            }
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            umd<T> umdVar = this.f105517d;
            if (umdVar == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = umdVar.requestFusion(i);
            if (iRequestFusion != 0) {
                this.f105518e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public znb(xub<T> xubVar, InterfaceC7178i8 interfaceC7178i8) {
        super(xubVar);
        this.f105513b = interfaceC7178i8;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C16190a(oxbVar, this.f105513b));
    }
}
