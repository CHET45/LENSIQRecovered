package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class a6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: a6a$a */
    public static final class C0075a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public k9a<? super T> f505a;

        /* JADX INFO: renamed from: b */
        public lf4 f506b;

        public C0075a(k9a<? super T> downstream) {
            this.f505a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f505a = null;
            this.f506b.dispose();
            this.f506b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f506b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f506b = zf4.DISPOSED;
            k9a<? super T> k9aVar = this.f505a;
            if (k9aVar != null) {
                this.f505a = null;
                k9aVar.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f506b = zf4.DISPOSED;
            k9a<? super T> k9aVar = this.f505a;
            if (k9aVar != null) {
                this.f505a = null;
                k9aVar.onError(e);
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f506b, d)) {
                this.f506b = d;
                this.f505a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f506b = zf4.DISPOSED;
            k9a<? super T> k9aVar = this.f505a;
            if (k9aVar != null) {
                this.f505a = null;
                k9aVar.onSuccess(value);
            }
        }
    }

    public a6a(z9a<T> source) {
        super(source);
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C0075a(observer));
    }
}
