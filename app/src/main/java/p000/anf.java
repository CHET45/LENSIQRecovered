package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class anf<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f11417a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, Optional<? extends R>> f11418b;

    /* JADX INFO: renamed from: anf$a */
    public static final class C1523a<T, R> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f11419a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, Optional<? extends R>> f11420b;

        /* JADX INFO: renamed from: c */
        public lf4 f11421c;

        public C1523a(k9a<? super R> downstream, sy6<? super T, Optional<? extends R>> mapper) {
            this.f11419a = downstream;
            this.f11420b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f11421c;
            this.f11421c = zf4.DISPOSED;
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f11421c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f11419a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f11421c, d)) {
                this.f11421c = d;
                this.f11419a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            try {
                Optional<? extends R> optionalApply = this.f11420b.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null item");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    this.f11419a.onSuccess(optional.get());
                } else {
                    this.f11419a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f11419a.onError(th);
            }
        }
    }

    public anf(kjf<T> source, sy6<? super T, Optional<? extends R>> mapper) {
        this.f11417a = source;
        this.f11418b = mapper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f11417a.subscribe(new C1523a(observer, this.f11418b));
    }
}
