package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class naa<T> extends r4a<j1h<T>> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f63800a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f63801b;

    /* JADX INFO: renamed from: c */
    public final woe f63802c;

    /* JADX INFO: renamed from: d */
    public final boolean f63803d;

    /* JADX INFO: renamed from: naa$a */
    public static final class C9766a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super j1h<T>> f63804a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f63805b;

        /* JADX INFO: renamed from: c */
        public final woe f63806c;

        /* JADX INFO: renamed from: d */
        public final long f63807d;

        /* JADX INFO: renamed from: e */
        public lf4 f63808e;

        public C9766a(k9a<? super j1h<T>> downstream, TimeUnit unit, woe scheduler, boolean start) {
            this.f63804a = downstream;
            this.f63805b = unit;
            this.f63806c = scheduler;
            this.f63807d = start ? scheduler.now(unit) : 0L;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f63808e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f63808e.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f63804a.onComplete();
        }

        @Override // p000.k9a
        public void onError(@cfb Throwable e) {
            this.f63804a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f63808e, d)) {
                this.f63808e = d;
                this.f63804a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(@cfb T t) {
            this.f63804a.onSuccess(new j1h(t, this.f63806c.now(this.f63805b) - this.f63807d, this.f63805b));
        }
    }

    public naa(z9a<T> source, TimeUnit unit, woe scheduler, boolean start) {
        this.f63800a = source;
        this.f63801b = unit;
        this.f63802c = scheduler;
        this.f63803d = start;
    }

    @Override // p000.r4a
    public void subscribeActual(@cfb k9a<? super j1h<T>> observer) {
        this.f63800a.subscribe(new C9766a(observer, this.f63801b, this.f63802c, this.f63803d));
    }
}
