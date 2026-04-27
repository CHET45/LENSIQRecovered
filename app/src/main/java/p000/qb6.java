package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qb6<T, K> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, K> f73804c;

    /* JADX INFO: renamed from: d */
    public final m11<? super K, ? super K> f73805d;

    /* JADX INFO: renamed from: qb6$a */
    public static final class C11404a<T, K> extends kv0<T, T> {

        /* JADX INFO: renamed from: C */
        public K f73806C;

        /* JADX INFO: renamed from: F */
        public boolean f73807F;

        /* JADX INFO: renamed from: f */
        public final py6<? super T, K> f73808f;

        /* JADX INFO: renamed from: m */
        public final m11<? super K, ? super K> f73809m;

        public C11404a(cq2<? super T> cq2Var, py6<? super T, K> py6Var, m11<? super K, ? super K> m11Var) {
            super(cq2Var);
            this.f73808f = py6Var;
            this.f73809m = m11Var;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f55427b.request(1L);
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f55428c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f73808f.apply(tPoll);
                if (!this.f73807F) {
                    this.f73807F = true;
                    this.f73806C = kApply;
                    return tPoll;
                }
                if (!this.f73809m.test(this.f73806C, kApply)) {
                    this.f73806C = kApply;
                    return tPoll;
                }
                this.f73806C = kApply;
                if (this.f55430e != 1) {
                    this.f55427b.request(1L);
                }
            }
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
            if (this.f55430e != 0) {
                return this.f55426a.tryOnNext((Object) t);
            }
            try {
                K kApply = this.f73808f.apply(t);
                if (this.f73807F) {
                    boolean zTest = this.f73809m.test(this.f73806C, kApply);
                    this.f73806C = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f73807F = true;
                    this.f73806C = kApply;
                }
                this.f55426a.onNext((Object) t);
                return true;
            } catch (Throwable th) {
                m15012c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: qb6$b */
    public static final class C11405b<T, K> extends ov0<T, T> implements cq2<T> {

        /* JADX INFO: renamed from: C */
        public K f73810C;

        /* JADX INFO: renamed from: F */
        public boolean f73811F;

        /* JADX INFO: renamed from: f */
        public final py6<? super T, K> f73812f;

        /* JADX INFO: renamed from: m */
        public final m11<? super K, ? super K> f73813m;

        public C11405b(ycg<? super T> ycgVar, py6<? super T, K> py6Var, m11<? super K, ? super K> m11Var) {
            super(ycgVar);
            this.f73812f = py6Var;
            this.f73813m = m11Var;
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f68846b.request(1L);
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f68847c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f73812f.apply(tPoll);
                if (!this.f73811F) {
                    this.f73811F = true;
                    this.f73810C = kApply;
                    return tPoll;
                }
                if (!this.f73813m.test(this.f73810C, kApply)) {
                    this.f73810C = kApply;
                    return tPoll;
                }
                this.f73810C = kApply;
                if (this.f68849e != 1) {
                    this.f68846b.request(1L);
                }
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m19036d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (this.f68848d) {
                return false;
            }
            if (this.f68849e != 0) {
                this.f68845a.onNext((Object) t);
                return true;
            }
            try {
                K kApply = this.f73812f.apply(t);
                if (this.f73811F) {
                    boolean zTest = this.f73813m.test(this.f73810C, kApply);
                    this.f73810C = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f73811F = true;
                    this.f73810C = kApply;
                }
                this.f68845a.onNext((Object) t);
                return true;
            } catch (Throwable th) {
                m19035c(th);
                return true;
            }
        }
    }

    public qb6(m86<T> m86Var, py6<? super T, K> py6Var, m11<? super K, ? super K> m11Var) {
        super(m86Var);
        this.f73804c = py6Var;
        this.f73805d = m11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C11404a((cq2) ycgVar, this.f73804c, this.f73805d));
        } else {
            this.f52360b.subscribe((lj6) new C11405b(ycgVar, this.f73804c, this.f73805d));
        }
    }
}
