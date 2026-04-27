package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zdc<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f104852a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f104853b;

    /* JADX INFO: renamed from: c */
    public final i11<? super Long, ? super Throwable, udc> f104854c;

    /* JADX INFO: renamed from: zdc$a */
    public static /* synthetic */ class C16095a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104855a;

        static {
            int[] iArr = new int[udc.values().length];
            f104855a = iArr;
            try {
                iArr[udc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104855a[udc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104855a[udc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: zdc$b */
    public static abstract class AbstractC16096b<T> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final n8d<? super T> f104856a;

        /* JADX INFO: renamed from: b */
        public final i11<? super Long, ? super Throwable, udc> f104857b;

        /* JADX INFO: renamed from: c */
        public fdg f104858c;

        /* JADX INFO: renamed from: d */
        public boolean f104859d;

        public AbstractC16096b(n8d<? super T> predicate, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f104856a = predicate;
            this.f104857b = errorHandler;
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f104858c.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (tryOnNext(t) || this.f104859d) {
                return;
            }
            this.f104858c.request(1L);
        }

        @Override // p000.fdg
        public final void request(long n) {
            this.f104858c.request(n);
        }
    }

    /* JADX INFO: renamed from: zdc$c */
    public static final class C16097c<T> extends AbstractC16096b<T> {

        /* JADX INFO: renamed from: e */
        public final bq2<? super T> f104860e;

        public C16097c(bq2<? super T> actual, n8d<? super T> predicate, i11<? super Long, ? super Throwable, udc> errorHandler) {
            super(predicate, errorHandler);
            this.f104860e = actual;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f104859d) {
                return;
            }
            this.f104859d = true;
            this.f104860e.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f104859d) {
                ofe.onError(t);
            } else {
                this.f104859d = true;
                this.f104860e.onError(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f104858c, s)) {
                this.f104858c = s;
                this.f104860e.onSubscribe(this);
            }
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (!this.f104859d) {
                long j = 0;
                do {
                    try {
                        return this.f104856a.test(t) && this.f104860e.tryOnNext(t);
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        try {
                            j++;
                            udc udcVarApply = this.f104857b.apply(Long.valueOf(j), th);
                            Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                            i = C16095a.f104855a[udcVarApply.ordinal()];
                        } catch (Throwable th2) {
                            o75.throwIfFatal(th2);
                            cancel();
                            onError(new qm2(th, th2));
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

    /* JADX INFO: renamed from: zdc$d */
    public static final class C16098d<T> extends AbstractC16096b<T> {

        /* JADX INFO: renamed from: e */
        public final ycg<? super T> f104861e;

        public C16098d(ycg<? super T> actual, n8d<? super T> predicate, i11<? super Long, ? super Throwable, udc> errorHandler) {
            super(predicate, errorHandler);
            this.f104861e = actual;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f104859d) {
                return;
            }
            this.f104859d = true;
            this.f104861e.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f104859d) {
                ofe.onError(t);
            } else {
                this.f104859d = true;
                this.f104861e.onError(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f104858c, s)) {
                this.f104858c = s;
                this.f104861e.onSubscribe(this);
            }
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (!this.f104859d) {
                long j = 0;
                do {
                    try {
                        if (!this.f104856a.test(t)) {
                            return false;
                        }
                        this.f104861e.onNext(t);
                        return true;
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        try {
                            j++;
                            udc udcVarApply = this.f104857b.apply(Long.valueOf(j), th);
                            Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                            i = C16095a.f104855a[udcVarApply.ordinal()];
                        } catch (Throwable th2) {
                            o75.throwIfFatal(th2);
                            cancel();
                            onError(new qm2(th, th2));
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

    public zdc(eec<T> source, n8d<? super T> predicate, i11<? super Long, ? super Throwable, udc> errorHandler) {
        this.f104852a = source;
        this.f104853b = predicate;
        this.f104854c = errorHandler;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f104852a.parallelism();
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
                    ycgVarArr[i] = new C16097c((bq2) ycgVar, this.f104853b, this.f104854c);
                } else {
                    ycgVarArr[i] = new C16098d(ycgVar, this.f104853b, this.f104854c);
                }
            }
            this.f104852a.subscribe(ycgVarArr);
        }
    }
}
