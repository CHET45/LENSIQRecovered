package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zmf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f105493a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends R> f105494b;

    /* JADX INFO: renamed from: zmf$a */
    public static final class C16188a<T, R> implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f105495a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends R> f105496b;

        public C16188a(hnf<? super R> t, sy6<? super T, ? extends R> mapper) {
            this.f105495a = t;
            this.f105496b = mapper;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f105495a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f105495a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                R rApply = this.f105496b.apply(value);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.f105495a.onSuccess(rApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public zmf(oof<? extends T> source, sy6<? super T, ? extends R> mapper) {
        this.f105493a = source;
        this.f105494b = mapper;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super R> t) {
        this.f105493a.subscribe(new C16188a(t, this.f105494b));
    }
}
