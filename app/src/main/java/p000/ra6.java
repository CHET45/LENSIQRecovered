package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ra6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final oof<? extends T> f77577c;

    /* JADX INFO: renamed from: ra6$a */
    public static final class C11964a<T> extends unf<T, T> implements hnf<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: C */
        public oof<? extends T> f77578C;

        /* JADX INFO: renamed from: m */
        public final AtomicReference<lf4> f77579m;

        public C11964a(ycg<? super T> actual, oof<? extends T> other) {
            super(actual);
            this.f77578C = other;
            this.f77579m = new AtomicReference<>();
        }

        @Override // p000.unf, p000.fdg
        public void cancel() {
            super.cancel();
            zf4.dispose(this.f77579m);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88629b = ldg.CANCELLED;
            oof<? extends T> oofVar = this.f77578C;
            this.f77578C = null;
            oofVar.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f88628a.onError(t);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f88631d++;
            this.f88628a.onNext((Object) t);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f77579m, d);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            m23463a(t);
        }
    }

    public ra6(l86<T> source, oof<? extends T> other) {
        super(source);
        this.f77577c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C11964a(s, this.f77577c));
    }
}
