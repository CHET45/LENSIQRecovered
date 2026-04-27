package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cc6<T> extends s4a<T> implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f16225a;

    /* JADX INFO: renamed from: b */
    public final long f16226b;

    /* JADX INFO: renamed from: cc6$a */
    public static final class C2264a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f16227a;

        /* JADX INFO: renamed from: b */
        public final long f16228b;

        /* JADX INFO: renamed from: c */
        public fdg f16229c;

        /* JADX INFO: renamed from: d */
        public long f16230d;

        /* JADX INFO: renamed from: e */
        public boolean f16231e;

        public C2264a(l9a<? super T> l9aVar, long j) {
            this.f16227a = l9aVar;
            this.f16228b = j;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f16229c.cancel();
            this.f16229c = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f16229c == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16229c = mdg.CANCELLED;
            if (this.f16231e) {
                return;
            }
            this.f16231e = true;
            this.f16227a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f16231e) {
                pfe.onError(th);
                return;
            }
            this.f16231e = true;
            this.f16229c = mdg.CANCELLED;
            this.f16227a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16231e) {
                return;
            }
            long j = this.f16230d;
            if (j != this.f16228b) {
                this.f16230d = j + 1;
                return;
            }
            this.f16231e = true;
            this.f16229c.cancel();
            this.f16229c = mdg.CANCELLED;
            this.f16227a.onSuccess(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f16229c, fdgVar)) {
                this.f16229c = fdgVar;
                this.f16227a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public cc6(m86<T> m86Var, long j) {
        this.f16225a = m86Var;
        this.f16226b = j;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new ac6(this.f16225a, this.f16226b, null, false));
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f16225a.subscribe((lj6) new C2264a(l9aVar, this.f16226b));
    }
}
