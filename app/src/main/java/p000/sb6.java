package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final tu2<? super T> f81115c;

    /* JADX INFO: renamed from: sb6$a */
    public static final class C12504a<T> extends kv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final tu2<? super T> f81116f;

        public C12504a(cq2<? super T> cq2Var, tu2<? super T> tu2Var) {
            super(cq2Var);
            this.f81116f = tu2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f55426a.onNext((Object) t);
            if (this.f55430e == 0) {
                try {
                    this.f81116f.accept(t);
                } catch (Throwable th) {
                    m15012c(th);
                }
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f55428c.poll();
            if (tPoll != null) {
                this.f81116f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m15013d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            boolean zTryOnNext = this.f55426a.tryOnNext((Object) t);
            try {
                this.f81116f.accept(t);
            } catch (Throwable th) {
                m15012c(th);
            }
            return zTryOnNext;
        }
    }

    /* JADX INFO: renamed from: sb6$b */
    public static final class C12505b<T> extends ov0<T, T> {

        /* JADX INFO: renamed from: f */
        public final tu2<? super T> f81117f;

        public C12505b(ycg<? super T> ycgVar, tu2<? super T> tu2Var) {
            super(ycgVar);
            this.f81117f = tu2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f68848d) {
                return;
            }
            this.f68845a.onNext((Object) t);
            if (this.f68849e == 0) {
                try {
                    this.f81117f.accept(t);
                } catch (Throwable th) {
                    m19035c(th);
                }
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f68847c.poll();
            if (tPoll != null) {
                this.f81117f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m19036d(i);
        }
    }

    public sb6(m86<T> m86Var, tu2<? super T> tu2Var) {
        super(m86Var);
        this.f81115c = tu2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C12504a((cq2) ycgVar, this.f81115c));
        } else {
            this.f52360b.subscribe((lj6) new C12505b(ycgVar, this.f81115c));
        }
    }
}
