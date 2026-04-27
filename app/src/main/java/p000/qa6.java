package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qa6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final pof<? extends T> f73740c;

    /* JADX INFO: renamed from: qa6$a */
    public static final class C11396a<T> extends vnf<T, T> implements inf<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: C */
        public pof<? extends T> f73741C;

        /* JADX INFO: renamed from: m */
        public final AtomicReference<mf4> f73742m;

        public C11396a(ycg<? super T> ycgVar, pof<? extends T> pofVar) {
            super(ycgVar);
            this.f73741C = pofVar;
            this.f73742m = new AtomicReference<>();
        }

        @Override // p000.vnf, p000.fdg
        public void cancel() {
            super.cancel();
            ag4.dispose(this.f73742m);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f91811b = mdg.CANCELLED;
            pof<? extends T> pofVar = this.f73741C;
            this.f73741C = null;
            pofVar.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f91810a.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f91813d++;
            this.f91810a.onNext((Object) t);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f73742m, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            m24079a(t);
        }
    }

    public qa6(m86<T> m86Var, pof<? extends T> pofVar) {
        super(m86Var);
        this.f73740c = pofVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C11396a(ycgVar, this.f73740c));
    }
}
