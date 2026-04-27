package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class v86<T> extends ljf<Boolean> implements v07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f90322a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f90323b;

    /* JADX INFO: renamed from: v86$a */
    public static final class C13939a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f90324a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f90325b;

        /* JADX INFO: renamed from: c */
        public fdg f90326c;

        /* JADX INFO: renamed from: d */
        public boolean f90327d;

        public C13939a(inf<? super Boolean> infVar, m8d<? super T> m8dVar) {
            this.f90324a = infVar;
            this.f90325b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f90326c.cancel();
            this.f90326c = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f90326c == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f90327d) {
                return;
            }
            this.f90327d = true;
            this.f90326c = mdg.CANCELLED;
            this.f90324a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f90327d) {
                pfe.onError(th);
                return;
            }
            this.f90327d = true;
            this.f90326c = mdg.CANCELLED;
            this.f90324a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f90327d) {
                return;
            }
            try {
                if (this.f90325b.test(t)) {
                    this.f90327d = true;
                    this.f90326c.cancel();
                    this.f90326c = mdg.CANCELLED;
                    this.f90324a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f90326c.cancel();
                this.f90326c = mdg.CANCELLED;
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f90326c, fdgVar)) {
                this.f90326c = fdgVar;
                this.f90324a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public v86(m86<T> m86Var, m8d<? super T> m8dVar) {
        this.f90322a = m86Var;
        this.f90323b = m8dVar;
    }

    @Override // p000.v07
    public m86<Boolean> fuseToFlowable() {
        return pfe.onAssembly(new t86(this.f90322a, this.f90323b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f90322a.subscribe((lj6) new C13939a(infVar, this.f90323b));
    }
}
