package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nc6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f63946c;

    /* JADX INFO: renamed from: nc6$a */
    public static final class C9776a<T> extends kv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final m8d<? super T> f63947f;

        public C9776a(cq2<? super T> cq2Var, m8d<? super T> m8dVar) {
            super(cq2Var);
            this.f63947f = m8dVar;
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
            cod<T> codVar = this.f55428c;
            m8d<? super T> m8dVar = this.f63947f;
            while (true) {
                T tPoll = codVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (m8dVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f55430e == 2) {
                    codVar.request(1L);
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
                return this.f55426a.tryOnNext(null);
            }
            try {
                return this.f63947f.test(t) && this.f55426a.tryOnNext((Object) t);
            } catch (Throwable th) {
                m15012c(th);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: nc6$b */
    public static final class C9777b<T> extends ov0<T, T> implements cq2<T> {

        /* JADX INFO: renamed from: f */
        public final m8d<? super T> f63948f;

        public C9777b(ycg<? super T> ycgVar, m8d<? super T> m8dVar) {
            super(ycgVar);
            this.f63948f = m8dVar;
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
            cod<T> codVar = this.f68847c;
            m8d<? super T> m8dVar = this.f63948f;
            while (true) {
                T tPoll = codVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (m8dVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f68849e == 2) {
                    codVar.request(1L);
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
                this.f68845a.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f63948f.test(t);
                if (zTest) {
                    this.f68845a.onNext((Object) t);
                }
                return zTest;
            } catch (Throwable th) {
                m19035c(th);
                return true;
            }
        }
    }

    public nc6(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f63946c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C9776a((cq2) ycgVar, this.f63946c));
        } else {
            this.f52360b.subscribe((lj6) new C9777b(ycgVar, this.f63946c));
        }
    }
}
