package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ndc<T, C> extends eec<C> {

    /* JADX INFO: renamed from: a */
    public final eec<? extends T> f64064a;

    /* JADX INFO: renamed from: b */
    public final nfg<? extends C> f64065b;

    /* JADX INFO: renamed from: c */
    public final e11<? super C, ? super T> f64066c;

    /* JADX INFO: renamed from: ndc$a */
    public static final class C9795a<T, C> extends h34<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;

        /* JADX INFO: renamed from: N */
        public final e11<? super C, ? super T> f64067N;

        /* JADX INFO: renamed from: Q */
        public C f64068Q;

        /* JADX INFO: renamed from: X */
        public boolean f64069X;

        public C9795a(ycg<? super C> subscriber, C initialValue, e11<? super C, ? super T> collector) {
            super(subscriber);
            this.f64068Q = initialValue;
            this.f64067N = collector;
        }

        @Override // p000.h34, p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f42161L.cancel();
        }

        @Override // p000.h34, p000.ycg
        public void onComplete() {
            if (this.f64069X) {
                return;
            }
            this.f64069X = true;
            C c = this.f64068Q;
            this.f64068Q = null;
            complete(c);
        }

        @Override // p000.h34, p000.ycg
        public void onError(Throwable t) {
            if (this.f64069X) {
                ofe.onError(t);
                return;
            }
            this.f64069X = true;
            this.f64068Q = null;
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f64069X) {
                return;
            }
            try {
                this.f64067N.accept(this.f64068Q, t);
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

    public ndc(eec<? extends T> source, nfg<? extends C> initialCollection, e11<? super C, ? super T> collector) {
        this.f64064a = source;
        this.f64065b = initialCollection;
        this.f64066c = collector;
    }

    /* JADX INFO: renamed from: b */
    public void m17856b(ycg<?>[] subscribers, Throwable ex) {
        for (ycg<?> ycgVar : subscribers) {
            w05.error(ex, ycgVar);
        }
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f64064a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super C>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super Object>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                try {
                    C c = this.f64065b.get();
                    Objects.requireNonNull(c, "The initialSupplier returned a null value");
                    ycgVarArr[i] = new C9795a(ycgVarArrOnSubscribe[i], c, this.f64066c);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    m17856b(ycgVarArrOnSubscribe, th);
                    return;
                }
            }
            this.f64064a.subscribe(ycgVarArr);
        }
    }
}
