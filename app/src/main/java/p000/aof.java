package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class aof<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f11464a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends oof<? extends T>> f11465b;

    /* JADX INFO: renamed from: aof$a */
    public static final class C1528a<T> extends AtomicReference<lf4> implements hnf<T>, lf4 {
        private static final long serialVersionUID = -5314538511045349925L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f11466a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends oof<? extends T>> f11467b;

        public C1528a(hnf<? super T> actual, sy6<? super Throwable, ? extends oof<? extends T>> nextFunction) {
            this.f11466a = actual;
            this.f11467b = nextFunction;
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
            try {
                oof<? extends T> oofVarApply = this.f11467b.apply(e);
                Objects.requireNonNull(oofVarApply, "The nextFunction returned a null SingleSource.");
                oofVarApply.subscribe(new f8e(this, this.f11466a));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f11466a.onError(new qm2(e, th));
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f11466a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f11466a.onSuccess(value);
        }
    }

    public aof(oof<? extends T> source, sy6<? super Throwable, ? extends oof<? extends T>> nextFunction) {
        this.f11464a = source;
        this.f11465b = nextFunction;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f11464a.subscribe(new C1528a(observer, this.f11465b));
    }
}
