package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cpf<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final oof<? extends T> f26738b;

    /* JADX INFO: renamed from: cpf$a */
    public static final class C4451a<T> extends j34<T> implements hnf<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* JADX INFO: renamed from: L */
        public lf4 f26739L;

        public C4451a(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f26739L.dispose();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f49483a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f26739L, d)) {
                this.f26739L = d;
                this.f49483a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            complete(value);
        }
    }

    public cpf(oof<? extends T> source) {
        this.f26738b = source;
    }

    @Override // p000.l86
    public void subscribeActual(final ycg<? super T> s) {
        this.f26738b.subscribe(new C4451a(s));
    }
}
