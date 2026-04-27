package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class sec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f81602a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends R> f81603b;

    /* JADX INFO: renamed from: c */
    public final i11<? super Long, ? super Throwable, udc> f81604c;

    /* JADX INFO: renamed from: sec$a */
    public static /* synthetic */ class C12548a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81605a;

        static {
            int[] iArr = new int[udc.values().length];
            f81605a = iArr;
            try {
                iArr[udc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81605a[udc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81605a[udc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: sec$b */
    public static final class C12549b<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final bq2<? super R> f81606a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f81607b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f81608c;

        /* JADX INFO: renamed from: d */
        public fdg f81609d;

        /* JADX INFO: renamed from: e */
        public boolean f81610e;

        public C12549b(bq2<? super R> actual, sy6<? super T, ? extends R> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f81606a = actual;
            this.f81607b = mapper;
            this.f81608c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81609d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81610e) {
                return;
            }
            this.f81610e = true;
            this.f81606a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f81610e) {
                ofe.onError(t);
            } else {
                this.f81610e = true;
                this.f81606a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f81610e) {
                return;
            }
            this.f81609d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f81609d, s)) {
                this.f81609d = s;
                this.f81606a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f81609d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f81610e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    R rApply = this.f81607b.apply(t);
                    Objects.requireNonNull(rApply, "The mapper returned a null value");
                    return this.f81606a.tryOnNext(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f81608c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C12548a.f81605a[udcVarApply.ordinal()];
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        cancel();
                        onError(new qm2(th, th2));
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

    /* JADX INFO: renamed from: sec$c */
    public static final class C12550c<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f81611a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f81612b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f81613c;

        /* JADX INFO: renamed from: d */
        public fdg f81614d;

        /* JADX INFO: renamed from: e */
        public boolean f81615e;

        public C12550c(ycg<? super R> actual, sy6<? super T, ? extends R> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f81611a = actual;
            this.f81612b = mapper;
            this.f81613c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f81614d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81615e) {
                return;
            }
            this.f81615e = true;
            this.f81611a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f81615e) {
                ofe.onError(t);
            } else {
                this.f81615e = true;
                this.f81611a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f81615e) {
                return;
            }
            this.f81614d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f81614d, s)) {
                this.f81614d = s;
                this.f81611a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f81614d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f81615e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    R rApply = this.f81612b.apply(t);
                    Objects.requireNonNull(rApply, "The mapper returned a null value");
                    this.f81611a.onNext(rApply);
                    return true;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f81613c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C12548a.f81605a[udcVarApply.ordinal()];
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        cancel();
                        onError(new qm2(th, th2));
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

    public sec(eec<T> source, sy6<? super T, ? extends R> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
        this.f81602a = source;
        this.f81603b = mapper;
        this.f81604c = errorHandler;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f81602a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<?> ycgVar = ycgVarArrOnSubscribe[i];
                if (ycgVar instanceof bq2) {
                    ycgVarArr[i] = new C12549b((bq2) ycgVar, this.f81603b, this.f81604c);
                } else {
                    ycgVarArr[i] = new C12550c(ycgVar, this.f81603b, this.f81604c);
                }
            }
            this.f81602a.subscribe(ycgVarArr);
        }
    }
}
