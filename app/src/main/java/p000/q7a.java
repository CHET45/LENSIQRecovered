package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class q7a<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f73438a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends R>> f73439b;

    /* JADX INFO: renamed from: q7a$a */
    public static final class C11340a<T, R> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 4827726964688405508L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f73440a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends oof<? extends R>> f73441b;

        public C11340a(k9a<? super R> actual, sy6<? super T, ? extends oof<? extends R>> mapper) {
            this.f73440a = actual;
            this.f73441b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f73440a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f73440a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f73440a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                oof<? extends R> oofVarApply = this.f73441b.apply(value);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                if (isDisposed()) {
                    return;
                }
                oofVar.subscribe(new C11341b(this, this.f73440a));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: q7a$b */
    public static final class C11341b<R> implements hnf<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<lf4> f73442a;

        /* JADX INFO: renamed from: b */
        public final k9a<? super R> f73443b;

        public C11341b(AtomicReference<lf4> parent, k9a<? super R> downstream) {
            this.f73442a = parent;
            this.f73443b = downstream;
        }

        @Override // p000.hnf
        public void onError(final Throwable e) {
            this.f73443b.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(final lf4 d) {
            zf4.replace(this.f73442a, d);
        }

        @Override // p000.hnf
        public void onSuccess(final R value) {
            this.f73443b.onSuccess(value);
        }
    }

    public q7a(z9a<T> source, sy6<? super T, ? extends oof<? extends R>> mapper) {
        this.f73438a = source;
        this.f73439b = mapper;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> downstream) {
        this.f73438a.subscribe(new C11340a(downstream, this.f73439b));
    }
}
