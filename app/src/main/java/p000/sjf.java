package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sjf<T> extends kjf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f82044a;

    /* JADX INFO: renamed from: b */
    public final Object f82045b;

    /* JADX INFO: renamed from: c */
    public final l11<Object, Object> f82046c;

    /* JADX INFO: renamed from: sjf$a */
    public final class C12629a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f82047a;

        public C12629a(hnf<? super Boolean> observer) {
            this.f82047a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f82047a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f82047a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T v) {
            try {
                sjf sjfVar = sjf.this;
                this.f82047a.onSuccess(Boolean.valueOf(sjfVar.f82046c.test(v, sjfVar.f82045b)));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f82047a.onError(th);
            }
        }
    }

    public sjf(oof<T> source, Object value, l11<Object, Object> comparer) {
        this.f82044a = source;
        this.f82045b = value;
        this.f82046c = comparer;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super Boolean> observer) {
        this.f82044a.subscribe(new C12629a(observer));
    }
}
