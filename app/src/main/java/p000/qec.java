package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class qec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f74250a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, Optional<? extends R>> f74251b;

    /* JADX INFO: renamed from: qec$a */
    public static final class C11459a<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final bq2<? super R> f74252a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f74253b;

        /* JADX INFO: renamed from: c */
        public fdg f74254c;

        /* JADX INFO: renamed from: d */
        public boolean f74255d;

        public C11459a(bq2<? super R> actual, sy6<? super T, Optional<? extends R>> mapper) {
            this.f74252a = actual;
            this.f74253b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f74254c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f74255d) {
                return;
            }
            this.f74255d = true;
            this.f74252a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f74255d) {
                ofe.onError(t);
            } else {
                this.f74255d = true;
                this.f74252a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f74254c.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f74254c, s)) {
                this.f74254c = s;
                this.f74252a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f74254c.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f74255d) {
                return false;
            }
            try {
                Optional<? extends R> optionalApply = this.f74253b.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null value");
                Optional<? extends R> optional = optionalApply;
                return optional.isPresent() && this.f74252a.tryOnNext(optional.get());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: qec$b */
    public static final class C11460b<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f74256a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f74257b;

        /* JADX INFO: renamed from: c */
        public fdg f74258c;

        /* JADX INFO: renamed from: d */
        public boolean f74259d;

        public C11460b(ycg<? super R> actual, sy6<? super T, Optional<? extends R>> mapper) {
            this.f74256a = actual;
            this.f74257b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f74258c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f74259d) {
                return;
            }
            this.f74259d = true;
            this.f74256a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f74259d) {
                ofe.onError(t);
            } else {
                this.f74259d = true;
                this.f74256a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f74258c.request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f74258c, s)) {
                this.f74258c = s;
                this.f74256a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f74258c.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f74259d) {
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f74257b.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (!optional.isPresent()) {
                    return false;
                }
                this.f74256a.onNext(optional.get());
                return true;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
                return true;
            }
        }
    }

    public qec(eec<T> source, sy6<? super T, Optional<? extends R>> mapper) {
        this.f74250a = source;
        this.f74251b = mapper;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f74250a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        if (m9902a(subscribers)) {
            int length = subscribers.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super R> ycgVar = subscribers[i];
                if (ycgVar instanceof bq2) {
                    ycgVarArr[i] = new C11459a((bq2) ycgVar, this.f74251b);
                } else {
                    ycgVarArr[i] = new C11460b(ycgVar, this.f74251b);
                }
            }
            this.f74250a.subscribe(ycgVarArr);
        }
    }
}
