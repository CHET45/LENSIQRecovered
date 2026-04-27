package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class slf<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final oof<T> f82192a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f82193b;

    /* JADX INFO: renamed from: slf$a */
    public static final class C12652a<T> extends AtomicReference<lf4> implements hnf<T>, ch2, lf4 {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: a */
        public final ch2 f82194a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends ph2> f82195b;

        public C12652a(ch2 actual, sy6<? super T, ? extends ph2> mapper) {
            this.f82194a = actual;
            this.f82195b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f82194a.onComplete();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f82194a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                ph2 ph2VarApply = this.f82195b.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                if (isDisposed()) {
                    return;
                }
                ph2Var.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public slf(oof<T> source, sy6<? super T, ? extends ph2> mapper) {
        this.f82192a = source;
        this.f82193b = mapper;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C12652a c12652a = new C12652a(observer, this.f82193b);
        observer.onSubscribe(c12652a);
        this.f82192a.subscribe(c12652a);
    }
}
