package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class eh6<T> extends s4a<T> implements eh7<T>, v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f33023a;

    /* JADX INFO: renamed from: b */
    public final j11<T, T, T> f33024b;

    /* JADX INFO: renamed from: eh6$a */
    public static final class C5308a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f33025a;

        /* JADX INFO: renamed from: b */
        public final j11<T, T, T> f33026b;

        /* JADX INFO: renamed from: c */
        public T f33027c;

        /* JADX INFO: renamed from: d */
        public fdg f33028d;

        /* JADX INFO: renamed from: e */
        public boolean f33029e;

        public C5308a(l9a<? super T> l9aVar, j11<T, T, T> j11Var) {
            this.f33025a = l9aVar;
            this.f33026b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f33028d.cancel();
            this.f33029e = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f33029e;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f33029e) {
                return;
            }
            this.f33029e = true;
            T t = this.f33027c;
            if (t != null) {
                this.f33025a.onSuccess(t);
            } else {
                this.f33025a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f33029e) {
                pfe.onError(th);
            } else {
                this.f33029e = true;
                this.f33025a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f33029e) {
                return;
            }
            T t2 = this.f33027c;
            if (t2 == null) {
                this.f33027c = t;
                return;
            }
            try {
                this.f33027c = (T) xjb.requireNonNull(this.f33026b.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f33028d.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f33028d, fdgVar)) {
                this.f33028d = fdgVar;
                this.f33025a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public eh6(m86<T> m86Var, j11<T, T, T> j11Var) {
        this.f33023a = m86Var;
        this.f33024b = j11Var;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new ch6(this.f33023a, this.f33024b));
    }

    @Override // p000.eh7
    public zjd<T> source() {
        return this.f33023a;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f33023a.subscribe((lj6) new C5308a(l9aVar, this.f33024b));
    }
}
