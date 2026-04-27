package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ewb<T> extends AbstractC9666n3<T, j1h<T>> {

    /* JADX INFO: renamed from: b */
    public final woe f34309b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f34310c;

    /* JADX INFO: renamed from: ewb$a */
    public static final class C5502a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super j1h<T>> f34311a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f34312b;

        /* JADX INFO: renamed from: c */
        public final woe f34313c;

        /* JADX INFO: renamed from: d */
        public long f34314d;

        /* JADX INFO: renamed from: e */
        public lf4 f34315e;

        public C5502a(pxb<? super j1h<T>> actual, TimeUnit unit, woe scheduler) {
            this.f34311a = actual;
            this.f34313c = scheduler;
            this.f34312b = unit;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f34315e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f34315e.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f34311a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f34311a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long jNow = this.f34313c.now(this.f34312b);
            long j = this.f34314d;
            this.f34314d = jNow;
            this.f34311a.onNext(new j1h(t, jNow - j, this.f34312b));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f34315e, d)) {
                this.f34315e = d;
                this.f34314d = this.f34313c.now(this.f34312b);
                this.f34311a.onSubscribe(this);
            }
        }
    }

    public ewb(wub<T> source, TimeUnit unit, woe scheduler) {
        super(source);
        this.f34309b = scheduler;
        this.f34310c = unit;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super j1h<T>> t) {
        this.f63101a.subscribe(new C5502a(t, this.f34310c, this.f34309b));
    }
}
