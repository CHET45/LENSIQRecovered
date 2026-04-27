package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class si6<T> extends s4a<T> implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f81916a;

    /* JADX INFO: renamed from: si6$a */
    public static final class C12601a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f81917a;

        /* JADX INFO: renamed from: b */
        public fdg f81918b;

        /* JADX INFO: renamed from: c */
        public boolean f81919c;

        /* JADX INFO: renamed from: d */
        public T f81920d;

        public C12601a(l9a<? super T> l9aVar) {
            this.f81917a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f81918b.cancel();
            this.f81918b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f81918b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81919c) {
                return;
            }
            this.f81919c = true;
            this.f81918b = mdg.CANCELLED;
            T t = this.f81920d;
            this.f81920d = null;
            if (t == null) {
                this.f81917a.onComplete();
            } else {
                this.f81917a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f81919c) {
                pfe.onError(th);
                return;
            }
            this.f81919c = true;
            this.f81918b = mdg.CANCELLED;
            this.f81917a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f81919c) {
                return;
            }
            if (this.f81920d == null) {
                this.f81920d = t;
                return;
            }
            this.f81919c = true;
            this.f81918b.cancel();
            this.f81918b = mdg.CANCELLED;
            this.f81917a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f81918b, fdgVar)) {
                this.f81918b = fdgVar;
                this.f81917a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public si6(m86<T> m86Var) {
        this.f81916a = m86Var;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new qi6(this.f81916a, null, false));
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f81916a.subscribe((lj6) new C12601a(l9aVar));
    }
}
