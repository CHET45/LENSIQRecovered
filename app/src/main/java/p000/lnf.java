package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lnf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f58327a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends T> f58328b;

    /* JADX INFO: renamed from: c */
    public final T f58329c;

    /* JADX INFO: renamed from: lnf$a */
    public final class C8907a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f58330a;

        public C8907a(hnf<? super T> observer) {
            this.f58330a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            T tApply;
            lnf lnfVar = lnf.this;
            sy6<? super Throwable, ? extends T> sy6Var = lnfVar.f58328b;
            if (sy6Var != null) {
                try {
                    tApply = sy6Var.apply(e);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f58330a.onError(new qm2(e, th));
                    return;
                }
            } else {
                tApply = lnfVar.f58329c;
            }
            if (tApply != null) {
                this.f58330a.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(e);
            this.f58330a.onError(nullPointerException);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f58330a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f58330a.onSuccess(value);
        }
    }

    public lnf(oof<? extends T> source, sy6<? super Throwable, ? extends T> valueSupplier, T value) {
        this.f58327a = source;
        this.f58328b = valueSupplier;
        this.f58329c = value;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f58327a.subscribe(new C8907a(observer));
    }
}
