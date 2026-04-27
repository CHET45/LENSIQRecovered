package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sdc<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f81473a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f81474b;

    /* JADX INFO: renamed from: c */
    public final j11<? super Long, ? super Throwable, vdc> f81475c;

    /* JADX INFO: renamed from: sdc$a */
    public static /* synthetic */ class C12537a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81476a;

        static {
            int[] iArr = new int[vdc.values().length];
            f81476a = iArr;
            try {
                iArr[vdc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81476a[vdc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81476a[vdc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: sdc$b */
    public static final class C12538b<T> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final cq2<? super T> f81477a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f81478b;

        /* JADX INFO: renamed from: c */
        public final j11<? super Long, ? super Throwable, vdc> f81479c;

        /* JADX INFO: renamed from: d */
        public fdg f81480d;

        /* JADX INFO: renamed from: e */
        public boolean f81481e;

        public C12538b(cq2<? super T> cq2Var, tu2<? super T> tu2Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
            this.f81477a = cq2Var;
            this.f81478b = tu2Var;
            this.f81479c = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81480d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81481e) {
                return;
            }
            this.f81481e = true;
            this.f81477a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f81481e) {
                pfe.onError(th);
            } else {
                this.f81481e = true;
                this.f81477a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f81481e) {
                return;
            }
            this.f81480d.request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f81480d, fdgVar)) {
                this.f81480d = fdgVar;
                this.f81477a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f81480d.request(j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f81481e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.f81478b.accept(t);
                    return this.f81477a.tryOnNext(t);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    try {
                        j++;
                        i = C12537a.f81476a[((vdc) xjb.requireNonNull(this.f81479c.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        cancel();
                        onError(new pm2(th, th2));
                        return false;
                    }
                }
            } while (i == 1);
            if (i != 2) {
                if (i != 3) {
                    cancel();
                    onError(th);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: sdc$c */
    public static final class C12539c<T> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f81482a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f81483b;

        /* JADX INFO: renamed from: c */
        public final j11<? super Long, ? super Throwable, vdc> f81484c;

        /* JADX INFO: renamed from: d */
        public fdg f81485d;

        /* JADX INFO: renamed from: e */
        public boolean f81486e;

        public C12539c(ycg<? super T> ycgVar, tu2<? super T> tu2Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
            this.f81482a = ycgVar;
            this.f81483b = tu2Var;
            this.f81484c = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81485d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81486e) {
                return;
            }
            this.f81486e = true;
            this.f81482a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f81486e) {
                pfe.onError(th);
            } else {
                this.f81486e = true;
                this.f81482a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f81485d.request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f81485d, fdgVar)) {
                this.f81485d = fdgVar;
                this.f81482a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f81485d.request(j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f81486e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.f81483b.accept(t);
                    this.f81482a.onNext(t);
                    return true;
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    try {
                        j++;
                        i = C12537a.f81476a[((vdc) xjb.requireNonNull(this.f81484c.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        cancel();
                        onError(new pm2(th, th2));
                        return false;
                    }
                }
            } while (i == 1);
            if (i != 2) {
                if (i != 3) {
                    cancel();
                    onError(th);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    public sdc(fec<T> fecVar, tu2<? super T> tu2Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
        this.f81473a = fecVar;
        this.f81474b = tu2Var;
        this.f81475c = j11Var;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f81473a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super T> ycgVar = ycgVarArr[i];
                if (ycgVar instanceof cq2) {
                    ycgVarArr2[i] = new C12538b((cq2) ycgVar, this.f81474b, this.f81475c);
                } else {
                    ycgVarArr2[i] = new C12539c(ycgVar, this.f81474b, this.f81475c);
                }
            }
            this.f81473a.subscribe(ycgVarArr2);
        }
    }
}
