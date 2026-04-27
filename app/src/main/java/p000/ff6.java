package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ff6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends R> f36358c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super Throwable, ? extends R> f36359d;

    /* JADX INFO: renamed from: e */
    public final nfg<? extends R> f36360e;

    /* JADX INFO: renamed from: ff6$a */
    public static final class C5765a<T, R> extends unf<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super Throwable, ? extends R> f36361C;

        /* JADX INFO: renamed from: F */
        public final nfg<? extends R> f36362F;

        /* JADX INFO: renamed from: m */
        public final sy6<? super T, ? extends R> f36363m;

        public C5765a(ycg<? super R> actual, sy6<? super T, ? extends R> onNextMapper, sy6<? super Throwable, ? extends R> onErrorMapper, nfg<? extends R> onCompleteSupplier) {
            super(actual);
            this.f36363m = onNextMapper;
            this.f36361C = onErrorMapper;
            this.f36362F = onCompleteSupplier;
        }

        @Override // p000.ycg
        public void onComplete() {
            try {
                R r = this.f36362F.get();
                Objects.requireNonNull(r, "The onComplete publisher returned is null");
                m23463a(r);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88628a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            try {
                R rApply = this.f36361C.apply(t);
                Objects.requireNonNull(rApply, "The onError publisher returned is null");
                m23463a(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88628a.onError(new qm2(t, th));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                R rApply = this.f36363m.apply(t);
                Objects.requireNonNull(rApply, "The onNext publisher returned is null");
                this.f88631d++;
                this.f88628a.onNext(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88628a.onError(th);
            }
        }
    }

    public ff6(l86<T> source, sy6<? super T, ? extends R> onNextMapper, sy6<? super Throwable, ? extends R> onErrorMapper, nfg<? extends R> onCompleteSupplier) {
        super(source);
        this.f36358c = onNextMapper;
        this.f36359d = onErrorMapper;
        this.f36360e = onCompleteSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f49321b.subscribe((kj6) new C5765a(s, this.f36358c, this.f36359d, this.f36360e));
    }
}
