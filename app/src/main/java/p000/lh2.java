package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f57560a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super mf4> f57561b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super Throwable> f57562c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7178i8 f57563d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f57564e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7178i8 f57565f;

    /* JADX INFO: renamed from: m */
    public final InterfaceC7178i8 f57566m;

    /* JADX INFO: renamed from: lh2$a */
    public final class C8815a implements dh2, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f57567a;

        /* JADX INFO: renamed from: b */
        public mf4 f57568b;

        public C8815a(dh2 dh2Var) {
            this.f57567a = dh2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m16132a() {
            try {
                lh2.this.f57565f.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            try {
                lh2.this.f57566m.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            this.f57568b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f57568b.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f57568b == ag4.DISPOSED) {
                return;
            }
            try {
                lh2.this.f57563d.run();
                lh2.this.f57564e.run();
                this.f57567a.onComplete();
                m16132a();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f57567a.onError(th);
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (this.f57568b == ag4.DISPOSED) {
                pfe.onError(th);
                return;
            }
            try {
                lh2.this.f57562c.accept(th);
                lh2.this.f57564e.run();
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f57567a.onError(th);
            m16132a();
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            try {
                lh2.this.f57561b.accept(mf4Var);
                if (ag4.validate(this.f57568b, mf4Var)) {
                    this.f57568b = mf4Var;
                    this.f57567a.onSubscribe(this);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                mf4Var.dispose();
                this.f57568b = ag4.DISPOSED;
                c05.error(th, this.f57567a);
            }
        }
    }

    public lh2(qh2 qh2Var, tu2<? super mf4> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82, InterfaceC7178i8 interfaceC7178i83, InterfaceC7178i8 interfaceC7178i84) {
        this.f57560a = qh2Var;
        this.f57561b = tu2Var;
        this.f57562c = tu2Var2;
        this.f57563d = interfaceC7178i8;
        this.f57564e = interfaceC7178i82;
        this.f57565f = interfaceC7178i83;
        this.f57566m = interfaceC7178i84;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f57560a.subscribe(new C8815a(dh2Var));
    }
}
