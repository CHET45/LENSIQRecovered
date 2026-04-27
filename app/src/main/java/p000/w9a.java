package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class w9a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final tu2<? super mf4> f93692b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super T> f93693c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super Throwable> f93694d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f93695e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7178i8 f93696f;

    /* JADX INFO: renamed from: m */
    public final InterfaceC7178i8 f93697m;

    /* JADX INFO: renamed from: w9a$a */
    public static final class C14505a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f93698a;

        /* JADX INFO: renamed from: b */
        public final w9a<T> f93699b;

        /* JADX INFO: renamed from: c */
        public mf4 f93700c;

        public C14505a(l9a<? super T> l9aVar, w9a<T> w9aVar) {
            this.f93698a = l9aVar;
            this.f93699b = w9aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m24438a() {
            try {
                this.f93699b.f93696f.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m24439b(Throwable th) {
            try {
                this.f93699b.f93694d.accept(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f93700c = ag4.DISPOSED;
            this.f93698a.onError(th);
            m24438a();
        }

        @Override // p000.mf4
        public void dispose() {
            try {
                this.f93699b.f93697m.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            this.f93700c.dispose();
            this.f93700c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f93700c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            mf4 mf4Var = this.f93700c;
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var) {
                return;
            }
            try {
                this.f93699b.f93695e.run();
                this.f93700c = ag4Var;
                this.f93698a.onComplete();
                m24438a();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                m24439b(th);
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            if (this.f93700c == ag4.DISPOSED) {
                pfe.onError(th);
            } else {
                m24439b(th);
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f93700c, mf4Var)) {
                try {
                    this.f93699b.f93692b.accept(mf4Var);
                    this.f93700c = mf4Var;
                    this.f93698a.onSubscribe(this);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    mf4Var.dispose();
                    this.f93700c = ag4.DISPOSED;
                    c05.error(th, this.f93698a);
                }
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            mf4 mf4Var = this.f93700c;
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var) {
                return;
            }
            try {
                this.f93699b.f93693c.accept(t);
                this.f93700c = ag4Var;
                this.f93698a.onSuccess(t);
                m24438a();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                m24439b(th);
            }
        }
    }

    public w9a(aaa<T> aaaVar, tu2<? super mf4> tu2Var, tu2<? super T> tu2Var2, tu2<? super Throwable> tu2Var3, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82, InterfaceC7178i8 interfaceC7178i83) {
        super(aaaVar);
        this.f93692b = tu2Var;
        this.f93693c = tu2Var2;
        this.f93694d = tu2Var3;
        this.f93695e = interfaceC7178i8;
        this.f93696f = interfaceC7178i82;
        this.f93697m = interfaceC7178i83;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C14505a(l9aVar, this));
    }
}
