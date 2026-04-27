package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f100497b;

    /* JADX INFO: renamed from: y6a$a */
    public static final class C15505a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f100498a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f100499b;

        /* JADX INFO: renamed from: c */
        public lf4 f100500c;

        public C15505a(k9a<? super T> actual, n8d<? super T> predicate) {
            this.f100498a = actual;
            this.f100499b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f100500c;
            this.f100500c = zf4.DISPOSED;
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f100500c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f100498a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f100498a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f100500c, d)) {
                this.f100500c = d;
                this.f100498a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                if (this.f100499b.test(value)) {
                    this.f100498a.onSuccess(value);
                } else {
                    this.f100498a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f100498a.onError(th);
            }
        }
    }

    public y6a(z9a<T> source, n8d<? super T> predicate) {
        super(source);
        this.f100497b = predicate;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C15505a(observer, this.f100497b));
    }
}
