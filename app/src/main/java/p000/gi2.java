package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gi2<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final ph2 f39856a;

    /* JADX INFO: renamed from: b */
    public final nfg<? extends T> f39857b;

    /* JADX INFO: renamed from: c */
    public final T f39858c;

    /* JADX INFO: renamed from: gi2$a */
    public final class C6319a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f39859a;

        public C6319a(hnf<? super T> observer) {
            this.f39859a = observer;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            T t;
            gi2 gi2Var = gi2.this;
            nfg<? extends T> nfgVar = gi2Var.f39857b;
            if (nfgVar != null) {
                try {
                    t = nfgVar.get();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f39859a.onError(th);
                    return;
                }
            } else {
                t = gi2Var.f39858c;
            }
            if (t == null) {
                this.f39859a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f39859a.onSuccess(t);
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f39859a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f39859a.onSubscribe(d);
        }
    }

    public gi2(ph2 source, nfg<? extends T> completionValueSupplier, T completionValue) {
        this.f39856a = source;
        this.f39858c = completionValue;
        this.f39857b = completionValueSupplier;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f39856a.subscribe(new C6319a(observer));
    }
}
