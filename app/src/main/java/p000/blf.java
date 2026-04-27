package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class blf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f14070a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f14071b;

    /* JADX INFO: renamed from: blf$a */
    public static final class C1939a<T> implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f14072a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super lf4> f14073b;

        /* JADX INFO: renamed from: c */
        public boolean f14074c;

        public C1939a(hnf<? super T> actual, uu2<? super lf4> onSubscribe) {
            this.f14072a = actual;
            this.f14073b = onSubscribe;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            if (this.f14074c) {
                ofe.onError(e);
            } else {
                this.f14072a.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            try {
                this.f14073b.accept(d);
                this.f14072a.onSubscribe(d);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f14074c = true;
                d.dispose();
                b05.error(th, this.f14072a);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            if (this.f14074c) {
                return;
            }
            this.f14072a.onSuccess(value);
        }
    }

    public blf(oof<T> source, uu2<? super lf4> onSubscribe) {
        this.f14070a = source;
        this.f14071b = onSubscribe;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f14070a.subscribe(new C1939a(observer, this.f14071b));
    }
}
