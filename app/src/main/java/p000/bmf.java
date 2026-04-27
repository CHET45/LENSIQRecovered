package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bmf<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f14150a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends R>> f14151b;

    /* JADX INFO: renamed from: bmf$a */
    public static final class C1950a<T, R> extends AtomicReference<lf4> implements pxb<R>, hnf<T>, lf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f14152a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f14153b;

        public C1950a(pxb<? super R> downstream, sy6<? super T, ? extends wub<? extends R>> mapper) {
            this.f14152a = downstream;
            this.f14153b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f14152a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f14152a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(R t) {
            this.f14152a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            try {
                wub<? extends R> wubVarApply = this.f14153b.apply(t);
                Objects.requireNonNull(wubVarApply, "The mapper returned a null Publisher");
                wub<? extends R> wubVar = wubVarApply;
                if (isDisposed()) {
                    return;
                }
                wubVar.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f14152a.onError(th);
            }
        }
    }

    public bmf(oof<T> source, sy6<? super T, ? extends wub<? extends R>> mapper) {
        this.f14150a = source;
        this.f14151b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        C1950a c1950a = new C1950a(observer, this.f14151b);
        observer.onSubscribe(c1950a);
        this.f14150a.subscribe(c1950a);
    }
}
