package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final i11<T, T, T> f36510c;

    /* JADX INFO: renamed from: fg6$a */
    public static final class C5797a<T> extends AbstractC15905z<T, T> {
        private static final long serialVersionUID = 821363947659780367L;

        /* JADX INFO: renamed from: C */
        public final i11<T, T, T> f36511C;

        public C5797a(@cfb ycg<? super T> downstream, @cfb i11<T, T, T> reducer) {
            super(downstream);
            this.f36511C = reducer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.AbstractC15905z, p000.ycg
        public void onNext(T t) {
            Object andSet = this.f103579m.get();
            if (andSet != null) {
                andSet = this.f103579m.getAndSet(null);
            }
            if (andSet == null) {
                this.f103579m.lazySet((R) t);
            } else {
                try {
                    AtomicReference<R> atomicReference = this.f103579m;
                    T tApply = this.f36511C.apply((T) andSet, t);
                    Objects.requireNonNull(tApply, "The reducer returned a null value");
                    atomicReference.lazySet((R) tApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f103574b.cancel();
                    onError(th);
                    return;
                }
            }
            m26430b();
        }
    }

    public fg6(@cfb l86<T> source, @cfb i11<T, T, T> reducer) {
        super(source);
        this.f36510c = reducer;
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C5797a(s, this.f36510c));
    }
}
