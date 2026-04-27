package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class plf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f71351a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends R>> f71352b;

    /* JADX INFO: renamed from: plf$a */
    public static final class C11019a<T, R> extends AtomicReference<lf4> implements hnf<T>, lf4 {
        private static final long serialVersionUID = 3258103020495908596L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f71353a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends oof<? extends R>> f71354b;

        /* JADX INFO: renamed from: plf$a$a */
        public static final class a<R> implements hnf<R> {

            /* JADX INFO: renamed from: a */
            public final AtomicReference<lf4> f71355a;

            /* JADX INFO: renamed from: b */
            public final hnf<? super R> f71356b;

            public a(AtomicReference<lf4> parent, hnf<? super R> downstream) {
                this.f71355a = parent;
                this.f71356b = downstream;
            }

            @Override // p000.hnf
            public void onError(final Throwable e) {
                this.f71356b.onError(e);
            }

            @Override // p000.hnf
            public void onSubscribe(final lf4 d) {
                zf4.replace(this.f71355a, d);
            }

            @Override // p000.hnf
            public void onSuccess(final R value) {
                this.f71356b.onSuccess(value);
            }
        }

        public C11019a(hnf<? super R> actual, sy6<? super T, ? extends oof<? extends R>> mapper) {
            this.f71353a = actual;
            this.f71354b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f71353a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f71353a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                oof<? extends R> oofVarApply = this.f71354b.apply(value);
                Objects.requireNonNull(oofVarApply, "The single returned by the mapper is null");
                oof<? extends R> oofVar = oofVarApply;
                if (isDisposed()) {
                    return;
                }
                oofVar.subscribe(new a(this, this.f71353a));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f71353a.onError(th);
            }
        }
    }

    public plf(oof<? extends T> source, sy6<? super T, ? extends oof<? extends R>> mapper) {
        this.f71352b = mapper;
        this.f71351a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> downstream) {
        this.f71351a.subscribe(new C11019a(downstream, this.f71352b));
    }
}
