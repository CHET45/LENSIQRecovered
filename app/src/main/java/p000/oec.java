package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class oec<T, R> extends fec<R> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f67425a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends R> f67426b;

    /* JADX INFO: renamed from: oec$a */
    public static final class C10351a<T, R> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final cq2<? super R> f67427a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f67428b;

        /* JADX INFO: renamed from: c */
        public fdg f67429c;

        /* JADX INFO: renamed from: d */
        public boolean f67430d;

        public C10351a(cq2<? super R> cq2Var, py6<? super T, ? extends R> py6Var) {
            this.f67427a = cq2Var;
            this.f67428b = py6Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f67429c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f67430d) {
                return;
            }
            this.f67430d = true;
            this.f67427a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f67430d) {
                pfe.onError(th);
            } else {
                this.f67430d = true;
                this.f67427a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f67430d) {
                return;
            }
            try {
                this.f67427a.onNext(xjb.requireNonNull(this.f67428b.apply(t), "The mapper returned a null value"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f67429c, fdgVar)) {
                this.f67429c = fdgVar;
                this.f67427a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f67429c.request(j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (this.f67430d) {
                return false;
            }
            try {
                return this.f67427a.tryOnNext(xjb.requireNonNull(this.f67428b.apply(t), "The mapper returned a null value"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: oec$b */
    public static final class C10352b<T, R> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f67431a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f67432b;

        /* JADX INFO: renamed from: c */
        public fdg f67433c;

        /* JADX INFO: renamed from: d */
        public boolean f67434d;

        public C10352b(ycg<? super R> ycgVar, py6<? super T, ? extends R> py6Var) {
            this.f67431a = ycgVar;
            this.f67432b = py6Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f67433c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f67434d) {
                return;
            }
            this.f67434d = true;
            this.f67431a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f67434d) {
                pfe.onError(th);
            } else {
                this.f67434d = true;
                this.f67431a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f67434d) {
                return;
            }
            try {
                this.f67431a.onNext(xjb.requireNonNull(this.f67432b.apply(t), "The mapper returned a null value"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f67433c, fdgVar)) {
                this.f67433c = fdgVar;
                this.f67431a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f67433c.request(j);
        }
    }

    public oec(fec<T> fecVar, py6<? super T, ? extends R> py6Var) {
        this.f67425a = fecVar;
        this.f67426b = py6Var;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f67425a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super R>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super R> ycgVar = ycgVarArr[i];
                if (ycgVar instanceof cq2) {
                    ycgVarArr2[i] = new C10351a((cq2) ycgVar, this.f67426b);
                } else {
                    ycgVarArr2[i] = new C10352b(ycgVar, this.f67426b);
                }
            }
            this.f67425a.subscribe(ycgVarArr2);
        }
    }
}
