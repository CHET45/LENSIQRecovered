package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class r8a<T> extends AbstractC15397y2<T, Boolean> {

    /* JADX INFO: renamed from: r8a$a */
    public static final class C11944a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super Boolean> f77395a;

        /* JADX INFO: renamed from: b */
        public lf4 f77396b;

        public C11944a(k9a<? super Boolean> downstream) {
            this.f77395a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f77396b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f77396b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f77395a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f77395a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f77396b, d)) {
                this.f77396b = d;
                this.f77395a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f77395a.onSuccess(Boolean.FALSE);
        }
    }

    public r8a(z9a<T> source) {
        super(source);
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super Boolean> observer) {
        this.f100099a.subscribe(new C11944a(observer));
    }
}
