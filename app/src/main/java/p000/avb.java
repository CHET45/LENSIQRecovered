package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class avb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f11927b;

    /* JADX INFO: renamed from: avb$a */
    public static final class C1617a<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f11928a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f11929b = new AtomicReference<>();

        public C1617a(pxb<? super T> downstream) {
            this.f11928a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m2701a(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f11929b);
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f11928a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f11928a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f11928a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f11929b, d);
        }
    }

    /* JADX INFO: renamed from: avb$b */
    public final class RunnableC1618b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C1617a<T> f11930a;

        public RunnableC1618b(C1617a<T> parent) {
            this.f11930a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            avb.this.f63101a.subscribe(this.f11930a);
        }
    }

    public avb(wub<T> source, woe scheduler) {
        super(source);
        this.f11927b = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(final pxb<? super T> observer) {
        C1617a c1617a = new C1617a(observer);
        observer.onSubscribe(c1617a);
        c1617a.m2701a(this.f11927b.scheduleDirect(new RunnableC1618b(c1617a)));
    }
}
