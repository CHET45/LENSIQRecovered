package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gi6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final j11<T, T, T> f39864c;

    /* JADX INFO: renamed from: gi6$a */
    public static final class C6320a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f39865a;

        /* JADX INFO: renamed from: b */
        public final j11<T, T, T> f39866b;

        /* JADX INFO: renamed from: c */
        public fdg f39867c;

        /* JADX INFO: renamed from: d */
        public T f39868d;

        /* JADX INFO: renamed from: e */
        public boolean f39869e;

        public C6320a(ycg<? super T> ycgVar, j11<T, T, T> j11Var) {
            this.f39865a = ycgVar;
            this.f39866b = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f39867c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f39869e) {
                return;
            }
            this.f39869e = true;
            this.f39865a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f39869e) {
                pfe.onError(th);
            } else {
                this.f39869e = true;
                this.f39865a.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f39869e) {
                return;
            }
            ycg<? super T> ycgVar = this.f39865a;
            T t2 = this.f39868d;
            if (t2 == null) {
                this.f39868d = t;
                ycgVar.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) xjb.requireNonNull(this.f39866b.apply(t2, t), "The value returned by the accumulator is null");
                this.f39868d = r4;
                ycgVar.onNext(r4);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f39867c.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f39867c, fdgVar)) {
                this.f39867c = fdgVar;
                this.f39865a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f39867c.request(j);
        }
    }

    public gi6(m86<T> m86Var, j11<T, T, T> j11Var) {
        super(m86Var);
        this.f39864c = j11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C6320a(ycgVar, this.f39864c));
    }
}
