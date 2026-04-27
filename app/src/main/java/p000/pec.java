package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class pec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f70560a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends R> f70561b;

    /* JADX INFO: renamed from: pec$a */
    public static final class C10932a<T, R> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final bq2<? super R> f70562a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f70563b;

        /* JADX INFO: renamed from: c */
        public fdg f70564c;

        /* JADX INFO: renamed from: d */
        public boolean f70565d;

        public C10932a(bq2<? super R> actual, sy6<? super T, ? extends R> mapper) {
            this.f70562a = actual;
            this.f70563b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f70564c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f70565d) {
                return;
            }
            this.f70565d = true;
            this.f70562a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f70565d) {
                ofe.onError(t);
            } else {
                this.f70565d = true;
                this.f70562a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f70565d) {
                return;
            }
            try {
                R rApply = this.f70563b.apply(t);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                this.f70562a.onNext(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f70564c, s)) {
                this.f70564c = s;
                this.f70562a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f70564c.request(n);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f70565d) {
                return false;
            }
            try {
                R rApply = this.f70563b.apply(t);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                return this.f70562a.tryOnNext(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: pec$b */
    public static final class C10933b<T, R> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f70566a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f70567b;

        /* JADX INFO: renamed from: c */
        public fdg f70568c;

        /* JADX INFO: renamed from: d */
        public boolean f70569d;

        public C10933b(ycg<? super R> actual, sy6<? super T, ? extends R> mapper) {
            this.f70566a = actual;
            this.f70567b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f70568c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f70569d) {
                return;
            }
            this.f70569d = true;
            this.f70566a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f70569d) {
                ofe.onError(t);
            } else {
                this.f70569d = true;
                this.f70566a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f70569d) {
                return;
            }
            try {
                R rApply = this.f70567b.apply(t);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                this.f70566a.onNext(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f70568c, s)) {
                this.f70568c = s;
                this.f70566a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f70568c.request(n);
        }
    }

    public pec(eec<T> source, sy6<? super T, ? extends R> mapper) {
        this.f70560a = source;
        this.f70561b = mapper;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f70560a.parallelism();
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
                    ycgVarArr[i] = new C10932a((bq2) ycgVar, this.f70561b);
                } else {
                    ycgVarArr[i] = new C10933b(ycgVar, this.f70561b);
                }
            }
            this.f70560a.subscribe(ycgVarArr);
        }
    }
}
