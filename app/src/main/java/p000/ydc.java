package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ydc<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f101246a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f101247b;

    /* JADX INFO: renamed from: c */
    public final j11<? super Long, ? super Throwable, vdc> f101248c;

    /* JADX INFO: renamed from: ydc$a */
    public static /* synthetic */ class C15623a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101249a;

        static {
            int[] iArr = new int[vdc.values().length];
            f101249a = iArr;
            try {
                iArr[vdc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101249a[vdc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101249a[vdc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: ydc$b */
    public static abstract class AbstractC15624b<T> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final m8d<? super T> f101250a;

        /* JADX INFO: renamed from: b */
        public final j11<? super Long, ? super Throwable, vdc> f101251b;

        /* JADX INFO: renamed from: c */
        public fdg f101252c;

        /* JADX INFO: renamed from: d */
        public boolean f101253d;

        public AbstractC15624b(m8d<? super T> m8dVar, j11<? super Long, ? super Throwable, vdc> j11Var) {
            this.f101250a = m8dVar;
            this.f101251b = j11Var;
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f101252c.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (tryOnNext(t) || this.f101253d) {
                return;
            }
            this.f101252c.request(1L);
        }

        @Override // p000.fdg
        public final void request(long j) {
            this.f101252c.request(j);
        }
    }

    /* JADX INFO: renamed from: ydc$c */
    public static final class C15625c<T> extends AbstractC15624b<T> {

        /* JADX INFO: renamed from: e */
        public final cq2<? super T> f101254e;

        public C15625c(cq2<? super T> cq2Var, m8d<? super T> m8dVar, j11<? super Long, ? super Throwable, vdc> j11Var) {
            super(m8dVar, j11Var);
            this.f101254e = cq2Var;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101253d) {
                return;
            }
            this.f101253d = true;
            this.f101254e.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f101253d) {
                pfe.onError(th);
            } else {
                this.f101253d = true;
                this.f101254e.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f101252c, fdgVar)) {
                this.f101252c = fdgVar;
                this.f101254e.onSubscribe(this);
            }
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (!this.f101253d) {
                long j = 0;
                do {
                    try {
                        return this.f101250a.test(t) && this.f101254e.tryOnNext(t);
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        try {
                            j++;
                            i = C15623a.f101249a[((vdc) xjb.requireNonNull(this.f101251b.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            cancel();
                            onError(new pm2(th, th2));
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
            return false;
        }
    }

    /* JADX INFO: renamed from: ydc$d */
    public static final class C15626d<T> extends AbstractC15624b<T> {

        /* JADX INFO: renamed from: e */
        public final ycg<? super T> f101255e;

        public C15626d(ycg<? super T> ycgVar, m8d<? super T> m8dVar, j11<? super Long, ? super Throwable, vdc> j11Var) {
            super(m8dVar, j11Var);
            this.f101255e = ycgVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101253d) {
                return;
            }
            this.f101253d = true;
            this.f101255e.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f101253d) {
                pfe.onError(th);
            } else {
                this.f101253d = true;
                this.f101255e.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f101252c, fdgVar)) {
                this.f101252c = fdgVar;
                this.f101255e.onSubscribe(this);
            }
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (!this.f101253d) {
                long j = 0;
                do {
                    try {
                        if (!this.f101250a.test(t)) {
                            return false;
                        }
                        this.f101255e.onNext(t);
                        return true;
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        try {
                            j++;
                            i = C15623a.f101249a[((vdc) xjb.requireNonNull(this.f101251b.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            cancel();
                            onError(new pm2(th, th2));
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
            return false;
        }
    }

    public ydc(fec<T> fecVar, m8d<? super T> m8dVar, j11<? super Long, ? super Throwable, vdc> j11Var) {
        this.f101246a = fecVar;
        this.f101247b = m8dVar;
        this.f101248c = j11Var;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f101246a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super T> ycgVar = ycgVarArr[i];
                if (ycgVar instanceof cq2) {
                    ycgVarArr2[i] = new C15625c((cq2) ycgVar, this.f101247b, this.f101248c);
                } else {
                    ycgVarArr2[i] = new C15626d(ycgVar, this.f101247b, this.f101248c);
                }
            }
            this.f101246a.subscribe(ycgVarArr2);
        }
    }
}
