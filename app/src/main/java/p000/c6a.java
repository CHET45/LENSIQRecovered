package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class c6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f15846b;

    /* JADX INFO: renamed from: c6a$a */
    public static final class C2212a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f15847a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f15848b;

        /* JADX INFO: renamed from: c */
        public lf4 f15849c;

        public C2212a(k9a<? super T> actual, uu2<? super T> onAfterSuccess) {
            this.f15847a = actual;
            this.f15848b = onAfterSuccess;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f15849c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f15849c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f15847a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f15847a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f15849c, d)) {
                this.f15849c = d;
                this.f15847a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            this.f15847a.onSuccess(t);
            try {
                this.f15848b.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
    }

    public c6a(z9a<T> source, uu2<? super T> onAfterSuccess) {
        super(source);
        this.f15846b = onAfterSuccess;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C2212a(observer, this.f15846b));
    }
}
