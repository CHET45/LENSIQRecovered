package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class xec<T, R> extends eec<R> {

    /* JADX INFO: renamed from: a */
    public final eec<? extends T> f97599a;

    /* JADX INFO: renamed from: b */
    public final nfg<R> f97600b;

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f97601c;

    /* JADX INFO: renamed from: xec$a */
    public static final class C15040a<T, R> extends h34<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;

        /* JADX INFO: renamed from: N */
        public final i11<R, ? super T, R> f97602N;

        /* JADX INFO: renamed from: Q */
        public R f97603Q;

        /* JADX INFO: renamed from: X */
        public boolean f97604X;

        public C15040a(ycg<? super R> subscriber, R initialValue, i11<R, ? super T, R> reducer) {
            super(subscriber);
            this.f97603Q = initialValue;
            this.f97602N = reducer;
        }

        @Override // p000.h34, p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f42161L.cancel();
        }

        @Override // p000.h34, p000.ycg
        public void onComplete() {
            if (this.f97604X) {
                return;
            }
            this.f97604X = true;
            R r = this.f97603Q;
            this.f97603Q = null;
            complete(r);
        }

        @Override // p000.h34, p000.ycg
        public void onError(Throwable t) {
            if (this.f97604X) {
                ofe.onError(t);
                return;
            }
            this.f97604X = true;
            this.f97603Q = null;
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f97604X) {
                return;
            }
            try {
                R rApply = this.f97602N.apply(this.f97603Q, t);
                Objects.requireNonNull(rApply, "The reducer returned a null value");
                this.f97603Q = rApply;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.h34, p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f42161L, s)) {
                this.f42161L = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public xec(eec<? extends T> source, nfg<R> initialSupplier, i11<R, ? super T, R> reducer) {
        this.f97599a = source;
        this.f97600b = initialSupplier;
        this.f97601c = reducer;
    }

    /* JADX INFO: renamed from: b */
    public void m25109b(ycg<?>[] subscribers, Throwable ex) {
        for (ycg<?> ycgVar : subscribers) {
            w05.error(ex, ycgVar);
        }
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f97599a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super R>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super Object>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                try {
                    R r = this.f97600b.get();
                    Objects.requireNonNull(r, "The initialSupplier returned a null value");
                    ycgVarArr[i] = new C15040a(ycgVarArrOnSubscribe[i], r, this.f97601c);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    m25109b(ycgVarArrOnSubscribe, th);
                    return;
                }
            }
            this.f97599a.subscribe(ycgVarArr);
        }
    }
}
