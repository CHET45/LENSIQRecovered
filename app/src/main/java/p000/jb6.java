package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jb6<T, U> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f50224b;

    /* JADX INFO: renamed from: c */
    public final zjd<U> f50225c;

    /* JADX INFO: renamed from: jb6$a */
    public static final class C7841a<T> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = 2259811067697317255L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f50226a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f50227b;

        /* JADX INFO: renamed from: c */
        public final C7841a<T>.a f50228c = new a();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f50229d = new AtomicReference<>();

        /* JADX INFO: renamed from: jb6$a$a */
        public final class a extends AtomicReference<fdg> implements kj6<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public a() {
            }

            @Override // p000.ycg
            public void onComplete() {
                if (get() != ldg.CANCELLED) {
                    C7841a.this.m13932a();
                }
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                if (get() != ldg.CANCELLED) {
                    C7841a.this.f50226a.onError(t);
                } else {
                    ofe.onError(t);
                }
            }

            @Override // p000.ycg
            public void onNext(Object t) {
                fdg fdgVar = get();
                ldg ldgVar = ldg.CANCELLED;
                if (fdgVar != ldgVar) {
                    lazySet(ldgVar);
                    fdgVar.cancel();
                    C7841a.this.m13932a();
                }
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                if (ldg.setOnce(this, s)) {
                    s.request(Long.MAX_VALUE);
                }
            }
        }

        public C7841a(ycg<? super T> downstream, zjd<? extends T> main) {
            this.f50226a = downstream;
            this.f50227b = main;
        }

        /* JADX INFO: renamed from: a */
        public void m13932a() {
            this.f50227b.subscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f50228c);
            ldg.cancel(this.f50229d);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f50226a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f50226a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f50226a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f50229d, this, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ldg.deferredRequest(this.f50229d, this, n);
            }
        }
    }

    public jb6(zjd<? extends T> main, zjd<U> other) {
        this.f50224b = main;
        this.f50225c = other;
    }

    @Override // p000.l86
    public void subscribeActual(final ycg<? super T> child) {
        C7841a c7841a = new C7841a(child, this.f50224b);
        child.onSubscribe(c7841a);
        this.f50225c.subscribe(c7841a.f50228c);
    }
}
