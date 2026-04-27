package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class wof<T> extends kjf<j1h<T>> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f94986a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f94987b;

    /* JADX INFO: renamed from: c */
    public final woe f94988c;

    /* JADX INFO: renamed from: d */
    public final boolean f94989d;

    /* JADX INFO: renamed from: wof$a */
    public static final class C14730a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super j1h<T>> f94990a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f94991b;

        /* JADX INFO: renamed from: c */
        public final woe f94992c;

        /* JADX INFO: renamed from: d */
        public final long f94993d;

        /* JADX INFO: renamed from: e */
        public lf4 f94994e;

        public C14730a(hnf<? super j1h<T>> downstream, TimeUnit unit, woe scheduler, boolean start) {
            this.f94990a = downstream;
            this.f94991b = unit;
            this.f94992c = scheduler;
            this.f94993d = start ? scheduler.now(unit) : 0L;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f94994e.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94994e.isDisposed();
        }

        @Override // p000.hnf
        public void onError(@cfb Throwable e) {
            this.f94990a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f94994e, d)) {
                this.f94994e = d;
                this.f94990a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(@cfb T t) {
            this.f94990a.onSuccess(new j1h(t, this.f94992c.now(this.f94991b) - this.f94993d, this.f94991b));
        }
    }

    public wof(oof<T> source, TimeUnit unit, woe scheduler, boolean start) {
        this.f94986a = source;
        this.f94987b = unit;
        this.f94988c = scheduler;
        this.f94989d = start;
    }

    @Override // p000.kjf
    public void subscribeActual(@cfb hnf<? super j1h<T>> observer) {
        this.f94986a.subscribe(new C14730a(observer, this.f94987b, this.f94988c, this.f94989d));
    }
}
