package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class g6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final e11<? super T, ? super Throwable> f38892b;

    /* JADX INFO: renamed from: g6a$a */
    public static final class C6150a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f38893a;

        /* JADX INFO: renamed from: b */
        public final e11<? super T, ? super Throwable> f38894b;

        /* JADX INFO: renamed from: c */
        public lf4 f38895c;

        public C6150a(k9a<? super T> actual, e11<? super T, ? super Throwable> onEvent) {
            this.f38893a = actual;
            this.f38894b = onEvent;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f38895c.dispose();
            this.f38895c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f38895c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f38895c = zf4.DISPOSED;
            try {
                this.f38894b.accept(null, null);
                this.f38893a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f38893a.onError(th);
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f38895c = zf4.DISPOSED;
            try {
                this.f38894b.accept(null, e);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f38893a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f38895c, d)) {
                this.f38895c = d;
                this.f38893a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f38895c = zf4.DISPOSED;
            try {
                this.f38894b.accept(value, null);
                this.f38893a.onSuccess(value);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f38893a.onError(th);
            }
        }
    }

    public g6a(z9a<T> source, e11<? super T, ? super Throwable> onEvent) {
        super(source);
        this.f38892b = onEvent;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C6150a(observer, this.f38892b));
    }
}
