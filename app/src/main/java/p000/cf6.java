package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cf6<T, U> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends U> f16409c;

    /* JADX INFO: renamed from: cf6$a */
    public static final class C2297a<T, U> extends kv0<T, U> {

        /* JADX INFO: renamed from: f */
        public final py6<? super T, ? extends U> f16410f;

        public C2297a(cq2<? super U> cq2Var, py6<? super T, ? extends U> py6Var) {
            super(cq2Var);
            this.f16410f = py6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f55429d) {
                return;
            }
            if (this.f55430e != 0) {
                this.f55426a.onNext(null);
                return;
            }
            try {
                this.f55426a.onNext((Object) xjb.requireNonNull(this.f16410f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m15012c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public U poll() throws Exception {
            T tPoll = this.f55428c.poll();
            if (tPoll != null) {
                return (U) xjb.requireNonNull(this.f16410f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m15013d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (this.f55429d) {
                return false;
            }
            try {
                return this.f55426a.tryOnNext((Object) xjb.requireNonNull(this.f16410f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m15012c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: cf6$b */
    public static final class C2298b<T, U> extends ov0<T, U> {

        /* JADX INFO: renamed from: f */
        public final py6<? super T, ? extends U> f16411f;

        public C2298b(ycg<? super U> ycgVar, py6<? super T, ? extends U> py6Var) {
            super(ycgVar);
            this.f16411f = py6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f68848d) {
                return;
            }
            if (this.f68849e != 0) {
                this.f68845a.onNext(null);
                return;
            }
            try {
                this.f68845a.onNext((Object) xjb.requireNonNull(this.f16411f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m19035c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public U poll() throws Exception {
            T tPoll = this.f68847c.poll();
            if (tPoll != null) {
                return (U) xjb.requireNonNull(this.f16411f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m19036d(i);
        }
    }

    public cf6(m86<T> m86Var, py6<? super T, ? extends U> py6Var) {
        super(m86Var);
        this.f16409c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C2297a((cq2) ycgVar, this.f16409c));
        } else {
            this.f52360b.subscribe((lj6) new C2298b(ycgVar, this.f16409c));
        }
    }
}
