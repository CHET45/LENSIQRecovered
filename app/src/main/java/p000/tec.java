package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class tec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f84426a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, Optional<? extends R>> f84427b;

    /* JADX INFO: renamed from: c */
    public final i11<? super Long, ? super Throwable, udc> f84428c;

    /* JADX INFO: renamed from: tec$a */
    public static /* synthetic */ class C13000a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84429a;

        static {
            int[] iArr = new int[udc.values().length];
            f84429a = iArr;
            try {
                iArr[udc.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84429a[udc.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84429a[udc.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: tec$b */
    public static final class C13001b<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final bq2<? super R> f84430a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f84431b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f84432c;

        /* JADX INFO: renamed from: d */
        public fdg f84433d;

        /* JADX INFO: renamed from: e */
        public boolean f84434e;

        public C13001b(bq2<? super R> actual, sy6<? super T, Optional<? extends R>> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f84430a = actual;
            this.f84431b = mapper;
            this.f84432c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84433d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84434e) {
                return;
            }
            this.f84434e = true;
            this.f84430a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84434e) {
                ofe.onError(t);
            } else {
                this.f84434e = true;
                this.f84430a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f84434e) {
                return;
            }
            this.f84433d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84433d, s)) {
                this.f84433d = s;
                this.f84430a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f84433d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f84434e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    Optional<? extends R> optionalApply = this.f84431b.apply(t);
                    Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                    Optional<? extends R> optional = optionalApply;
                    return optional.isPresent() && this.f84430a.tryOnNext(optional.get());
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f84432c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C13000a.f84429a[udcVarApply.ordinal()];
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

    /* JADX INFO: renamed from: tec$c */
    public static final class C13002c<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f84435a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f84436b;

        /* JADX INFO: renamed from: c */
        public final i11<? super Long, ? super Throwable, udc> f84437c;

        /* JADX INFO: renamed from: d */
        public fdg f84438d;

        /* JADX INFO: renamed from: e */
        public boolean f84439e;

        public C13002c(ycg<? super R> actual, sy6<? super T, Optional<? extends R>> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
            this.f84435a = actual;
            this.f84436b = mapper;
            this.f84437c = errorHandler;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84438d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84439e) {
                return;
            }
            this.f84439e = true;
            this.f84435a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84439e) {
                ofe.onError(t);
            } else {
                this.f84439e = true;
                this.f84435a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t) || this.f84439e) {
                return;
            }
            this.f84438d.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84438d, s)) {
                this.f84438d = s;
                this.f84435a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f84438d.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            int i;
            if (this.f84439e) {
                return false;
            }
            long j = 0;
            do {
                try {
                    Optional<? extends R> optionalApply = this.f84436b.apply(t);
                    Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                    Optional<? extends R> optional = optionalApply;
                    if (!optional.isPresent()) {
                        return false;
                    }
                    this.f84435a.onNext(optional.get());
                    return true;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    try {
                        j++;
                        udc udcVarApply = this.f84437c.apply(Long.valueOf(j), th);
                        Objects.requireNonNull(udcVarApply, "The errorHandler returned a null ParallelFailureHandling");
                        i = C13000a.f84429a[udcVarApply.ordinal()];
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

    public tec(eec<T> source, sy6<? super T, Optional<? extends R>> mapper, i11<? super Long, ? super Throwable, udc> errorHandler) {
        this.f84426a = source;
        this.f84427b = mapper;
        this.f84428c = errorHandler;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f84426a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        if (m9902a(subscribers)) {
            int length = subscribers.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super R> ycgVar = subscribers[i];
                if (ycgVar instanceof bq2) {
                    ycgVarArr[i] = new C13001b((bq2) ycgVar, this.f84427b, this.f84428c);
                } else {
                    ycgVarArr[i] = new C13002c(ycgVar, this.f84427b, this.f84428c);
                }
            }
            this.f84426a.subscribe(ycgVarArr);
        }
    }
}
