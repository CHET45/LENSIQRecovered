package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class uec<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f87816a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f87817b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super T> f87818c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super Throwable> f87819d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f87820e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7178i8 f87821f;

    /* JADX INFO: renamed from: g */
    public final tu2<? super fdg> f87822g;

    /* JADX INFO: renamed from: h */
    public final yk9 f87823h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7178i8 f87824i;

    /* JADX INFO: renamed from: uec$a */
    public static final class C13515a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f87825a;

        /* JADX INFO: renamed from: b */
        public final uec<T> f87826b;

        /* JADX INFO: renamed from: c */
        public fdg f87827c;

        /* JADX INFO: renamed from: d */
        public boolean f87828d;

        public C13515a(ycg<? super T> ycgVar, uec<T> uecVar) {
            this.f87825a = ycgVar;
            this.f87826b = uecVar;
        }

        @Override // p000.fdg
        public void cancel() {
            try {
                this.f87826b.f87824i.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            this.f87827c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f87828d) {
                return;
            }
            this.f87828d = true;
            try {
                this.f87826b.f87820e.run();
                this.f87825a.onComplete();
                try {
                    this.f87826b.f87821f.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f87825a.onError(th2);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f87828d) {
                pfe.onError(th);
                return;
            }
            this.f87828d = true;
            try {
                this.f87826b.f87819d.accept(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f87825a.onError(th);
            try {
                this.f87826b.f87821f.run();
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(th3);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f87828d) {
                return;
            }
            try {
                this.f87826b.f87817b.accept(t);
                this.f87825a.onNext(t);
                try {
                    this.f87826b.f87818c.accept(t);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87827c, fdgVar)) {
                this.f87827c = fdgVar;
                try {
                    this.f87826b.f87822g.accept(fdgVar);
                    this.f87825a.onSubscribe(this);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    fdgVar.cancel();
                    this.f87825a.onSubscribe(x05.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            try {
                this.f87826b.f87823h.accept(j);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            this.f87827c.request(j);
        }
    }

    public uec(fec<T> fecVar, tu2<? super T> tu2Var, tu2<? super T> tu2Var2, tu2<? super Throwable> tu2Var3, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82, tu2<? super fdg> tu2Var4, yk9 yk9Var, InterfaceC7178i8 interfaceC7178i83) {
        this.f87816a = fecVar;
        this.f87817b = (tu2) xjb.requireNonNull(tu2Var, "onNext is null");
        this.f87818c = (tu2) xjb.requireNonNull(tu2Var2, "onAfterNext is null");
        this.f87819d = (tu2) xjb.requireNonNull(tu2Var3, "onError is null");
        this.f87820e = (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        this.f87821f = (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i82, "onAfterTerminated is null");
        this.f87822g = (tu2) xjb.requireNonNull(tu2Var4, "onSubscribe is null");
        this.f87823h = (yk9) xjb.requireNonNull(yk9Var, "onRequest is null");
        this.f87824i = (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i83, "onCancel is null");
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f87816a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr2[i] = new C13515a(ycgVarArr[i], this);
            }
            this.f87816a.subscribe(ycgVarArr2);
        }
    }
}
