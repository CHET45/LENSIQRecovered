package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ib6<T, U> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f46441b;

    /* JADX INFO: renamed from: c */
    public final zjd<U> f46442c;

    /* JADX INFO: renamed from: ib6$a */
    public static final class C7224a<T> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = 2259811067697317255L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f46443a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f46444b;

        /* JADX INFO: renamed from: c */
        public final C7224a<T>.a f46445c = new a();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f46446d = new AtomicReference<>();

        /* JADX INFO: renamed from: ib6$a$a */
        public final class a extends AtomicReference<fdg> implements lj6<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                if (get() != mdg.CANCELLED) {
                    C7224a.this.m12886a();
                }
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                if (get() != mdg.CANCELLED) {
                    C7224a.this.f46443a.onError(th);
                } else {
                    pfe.onError(th);
                }
            }

            @Override // p000.ycg
            public void onNext(Object obj) {
                fdg fdgVar = get();
                mdg mdgVar = mdg.CANCELLED;
                if (fdgVar != mdgVar) {
                    lazySet(mdgVar);
                    fdgVar.cancel();
                    C7224a.this.m12886a();
                }
            }

            @Override // p000.lj6, p000.ycg
            public void onSubscribe(fdg fdgVar) {
                if (mdg.setOnce(this, fdgVar)) {
                    fdgVar.request(Long.MAX_VALUE);
                }
            }
        }

        public C7224a(ycg<? super T> ycgVar, zjd<? extends T> zjdVar) {
            this.f46443a = ycgVar;
            this.f46444b = zjdVar;
        }

        /* JADX INFO: renamed from: a */
        public void m12886a() {
            this.f46444b.subscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f46445c);
            mdg.cancel(this.f46446d);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f46443a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f46443a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f46443a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f46446d, this, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                mdg.deferredRequest(this.f46446d, this, j);
            }
        }
    }

    public ib6(zjd<? extends T> zjdVar, zjd<U> zjdVar2) {
        this.f46441b = zjdVar;
        this.f46442c = zjdVar2;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C7224a c7224a = new C7224a(ycgVar, this.f46441b);
        ycgVar.onSubscribe(c7224a);
        this.f46442c.subscribe(c7224a.f46445c);
    }
}
