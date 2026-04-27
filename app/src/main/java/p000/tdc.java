package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class tdc<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f84352a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f84353b;

    /* JADX INFO: renamed from: c */
    public final i11<? super Long, ? super Throwable, udc> f84354c;

    /* JADX INFO: renamed from: tdc$a */
    public static /* synthetic */ class C12995a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84355a;

        static {
            int[] iArr = new int[udc.values().length];
            f84355a = iArr;
            try {
                iArr[udc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84355a[udc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84355a[udc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: tdc$b */
    public static final class C12996b<T> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final bq2<? super T> f84356a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f84357b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f84358c;

        /* JADX INFO: renamed from: d */
        public fdg f84359d;

        /* JADX INFO: renamed from: e */
        public boolean f84360e;

        public C12996b(bq2<? super T> actual, uu2<? super T> onNext, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f84356a = actual;
            this.f84357b = onNext;
            this.f84358c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84359d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84360e) {
                return;
            }
            this.f84360e = true;
            this.f84356a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84360e) {
                ofe.onError(t);
            } else {
                this.f84360e = true;
                this.f84356a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f84360e) {
                return;
            }
            this.f84359d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84359d, s)) {
                this.f84359d = s;
                this.f84356a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f84359d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f84360e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.f84357b.accept(t);
                    return this.f84356a.tryOnNext(t);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f84358c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C12995a.f84355a[udcVarApply.ordinal()];
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

    /* JADX INFO: renamed from: tdc$c */
    public static final class C12997c<T> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f84361a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f84362b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f84363c;

        /* JADX INFO: renamed from: d */
        public fdg f84364d;

        /* JADX INFO: renamed from: e */
        public boolean f84365e;

        public C12997c(ycg<? super T> actual, uu2<? super T> onNext, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f84361a = actual;
            this.f84362b = onNext;
            this.f84363c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84364d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84365e) {
                return;
            }
            this.f84365e = true;
            this.f84361a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84365e) {
                ofe.onError(t);
            } else {
                this.f84365e = true;
                this.f84361a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f84364d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84364d, s)) {
                this.f84364d = s;
                this.f84361a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f84364d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f84365e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.f84362b.accept(t);
                    this.f84361a.onNext(t);
                    return true;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f84363c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C12995a.f84355a[udcVarApply.ordinal()];
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

    public tdc(eec<T> source, uu2<? super T> onNext, i11<? super Long, ? super Throwable, udc> errorHandler) {
        this.f84352a = source;
        this.f84353b = onNext;
        this.f84354c = errorHandler;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f84352a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<?> ycgVar = ycgVarArrOnSubscribe[i];
                if (ycgVar instanceof bq2) {
                    ycgVarArr[i] = new C12996b((bq2) ycgVar, this.f84353b, this.f84354c);
                } else {
                    ycgVarArr[i] = new C12997c(ycgVar, this.f84353b, this.f84354c);
                }
            }
            this.f84352a.subscribe(ycgVarArr);
        }
    }
}
