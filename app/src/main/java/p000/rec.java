package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rec<T, R> extends fec<R> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f78100a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends R> f78101b;

    /* JADX INFO: renamed from: c */
    public final j11<? super Long, ? super Throwable, vdc> f78102c;

    /* JADX INFO: renamed from: rec$a */
    public static /* synthetic */ class C12043a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78103a;

        static {
            int[] iArr = new int[vdc.values().length];
            f78103a = iArr;
            try {
                iArr[vdc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78103a[vdc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78103a[vdc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: rec$b */
    public static final class C12044b<T, R> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final cq2<? super R> f78104a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f78105b;

        /* JADX INFO: renamed from: c */
        public final j11<? super Long, ? super Throwable, vdc> f78106c;

        /* JADX INFO: renamed from: d */
        public fdg f78107d;

        /* JADX INFO: renamed from: e */
        public boolean f78108e;

        public C12044b(cq2<? super R> cq2Var, py6<? super T, ? extends R> py6Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
            this.f78104a = cq2Var;
            this.f78105b = py6Var;
            this.f78106c = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f78107d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f78108e) {
                return;
            }
            this.f78108e = true;
            this.f78104a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f78108e) {
                pfe.onError(th);
            } else {
                this.f78108e = true;
                this.f78104a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f78108e) {
                return;
            }
            this.f78107d.request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f78107d, fdgVar)) {
                this.f78107d = fdgVar;
                this.f78104a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f78107d.request(j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f78108e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    return this.f78104a.tryOnNext(xjb.requireNonNull(this.f78105b.apply(t), "The mapper returned a null value"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    try {
                        j++;
                        i = C12043a.f78103a[((vdc) xjb.requireNonNull(this.f78106c.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
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

    /* JADX INFO: renamed from: rec$c */
    public static final class C12045c<T, R> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f78109a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f78110b;

        /* JADX INFO: renamed from: c */
        public final j11<? super Long, ? super Throwable, vdc> f78111c;

        /* JADX INFO: renamed from: d */
        public fdg f78112d;

        /* JADX INFO: renamed from: e */
        public boolean f78113e;

        public C12045c(ycg<? super R> ycgVar, py6<? super T, ? extends R> py6Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
            this.f78109a = ycgVar;
            this.f78110b = py6Var;
            this.f78111c = j11Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f78112d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f78113e) {
                return;
            }
            this.f78113e = true;
            this.f78109a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f78113e) {
                pfe.onError(th);
            } else {
                this.f78113e = true;
                this.f78109a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f78113e) {
                return;
            }
            this.f78112d.request(1L);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f78112d, fdgVar)) {
                this.f78112d = fdgVar;
                this.f78109a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f78112d.request(j);
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f78113e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.f78109a.onNext(xjb.requireNonNull(this.f78110b.apply(t), "The mapper returned a null value"));
                    return true;
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    try {
                        j++;
                        i = C12043a.f78103a[((vdc) xjb.requireNonNull(this.f78111c.apply(Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
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

    public rec(fec<T> fecVar, py6<? super T, ? extends R> py6Var, j11<? super Long, ? super Throwable, vdc> j11Var) {
        this.f78100a = fecVar;
        this.f78101b = py6Var;
        this.f78102c = j11Var;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f78100a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super R>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super R> ycgVar = ycgVarArr[i];
                if (ycgVar instanceof cq2) {
                    ycgVarArr2[i] = new C12044b((cq2) ycgVar, this.f78101b, this.f78102c);
                } else {
                    ycgVarArr2[i] = new C12045c(ycgVar, this.f78101b, this.f78102c);
                }
            }
            this.f78100a.subscribe(ycgVarArr2);
        }
    }
}
