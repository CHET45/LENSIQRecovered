package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gg6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f39759c;

    /* JADX INFO: renamed from: d */
    public final nfg<R> f39760d;

    /* JADX INFO: renamed from: gg6$a */
    public static final class C6302a<T, R> extends AbstractC15905z<T, R> {
        private static final long serialVersionUID = 8255923705960622424L;

        /* JADX INFO: renamed from: C */
        public final i11<R, ? super T, R> f39761C;

        /* JADX INFO: renamed from: F */
        public final nfg<R> f39762F;

        public C6302a(@cfb ycg<? super R> downstream, @cfb nfg<R> supplier, @cfb i11<R, ? super T, R> reducer) {
            super(downstream);
            this.f39761C = reducer;
            this.f39762F = supplier;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.AbstractC15905z, p000.ycg
        public void onNext(T t) {
            R andSet = this.f103579m.get();
            if (andSet != null) {
                andSet = this.f103579m.getAndSet(null);
            }
            try {
                if (andSet == null) {
                    AtomicReference<R> atomicReference = this.f103579m;
                    i11<R, ? super T, R> i11Var = this.f39761C;
                    R r = this.f39762F.get();
                    Objects.requireNonNull(r, "The supplier returned a null value");
                    R rApply = i11Var.apply(r, (Object) t);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    atomicReference.lazySet(rApply);
                } else {
                    AtomicReference<R> atomicReference2 = this.f103579m;
                    R rApply2 = this.f39761C.apply(andSet, (Object) t);
                    Objects.requireNonNull(rApply2, "The reducer returned a null value");
                    atomicReference2.lazySet(rApply2);
                }
                m26430b();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f103574b.cancel();
                onError(th);
            }
        }
    }

    public gg6(@cfb l86<T> source, @cfb nfg<R> supplier, @cfb i11<R, ? super T, R> reducer) {
        super(source);
        this.f39759c = reducer;
        this.f39760d = supplier;
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super R> s) {
        this.f49321b.subscribe((kj6) new C6302a(s, this.f39760d, this.f39759c));
    }
}
