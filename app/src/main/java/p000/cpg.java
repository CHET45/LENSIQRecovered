package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class cpg<T> extends ju0<T, cpg<T>> implements pxb<T>, lf4, k9a<T>, hnf<T>, ch2 {

    /* JADX INFO: renamed from: F */
    public final pxb<? super T> f26740F;

    /* JADX INFO: renamed from: H */
    public final AtomicReference<lf4> f26741H;

    /* JADX INFO: renamed from: cpg$a */
    public enum EnumC4452a implements pxb<Object> {
        INSTANCE;

        @Override // p000.pxb
        public void onComplete() {
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
        }

        @Override // p000.pxb
        public void onNext(Object t) {
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
        }
    }

    public cpg() {
        this(EnumC4452a.INSTANCE);
    }

    @cfb
    public static <T> cpg<T> create() {
        return new cpg<>();
    }

    @Override // p000.ju0
    @cfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cpg<T> mo8645a() {
        if (this.f26741H.get() != null) {
            return this;
        }
        throw m14306b("Not subscribed!");
    }

    @Override // p000.ju0, p000.lf4
    public final void dispose() {
        zf4.dispose(this.f26741H);
    }

    public final boolean hasSubscription() {
        return this.f26741H.get() != null;
    }

    @Override // p000.ju0, p000.lf4
    public final boolean isDisposed() {
        return zf4.isDisposed(this.f26741H.get());
    }

    @Override // p000.pxb
    public void onComplete() {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f26741H.get() == null) {
                this.f51823c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f51825e = Thread.currentThread();
            this.f51824d++;
            this.f26740F.onComplete();
        } finally {
            this.f51821a.countDown();
        }
    }

    @Override // p000.pxb
    public void onError(@cfb Throwable t) {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f26741H.get() == null) {
                this.f51823c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f51825e = Thread.currentThread();
            if (t == null) {
                this.f51823c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f51823c.add(t);
            }
            this.f26740F.onError(t);
            this.f51821a.countDown();
        } catch (Throwable th) {
            this.f51821a.countDown();
            throw th;
        }
    }

    @Override // p000.pxb
    public void onNext(@cfb T t) {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f26741H.get() == null) {
                this.f51823c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f51825e = Thread.currentThread();
        this.f51822b.add(t);
        if (t == null) {
            this.f51823c.add(new NullPointerException("onNext received a null value"));
        }
        this.f26740F.onNext(t);
    }

    @Override // p000.pxb
    public void onSubscribe(@cfb lf4 d) {
        this.f51825e = Thread.currentThread();
        if (d == null) {
            this.f51823c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (v7b.m23844a(this.f26741H, null, d)) {
            this.f26740F.onSubscribe(d);
            return;
        }
        d.dispose();
        if (this.f26741H.get() != zf4.DISPOSED) {
            this.f51823c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + d));
        }
    }

    @Override // p000.k9a
    public void onSuccess(@cfb T value) {
        onNext(value);
        onComplete();
    }

    public cpg(@cfb pxb<? super T> downstream) {
        this.f26741H = new AtomicReference<>();
        this.f26740F = downstream;
    }

    @cfb
    public static <T> cpg<T> create(@cfb pxb<? super T> delegate) {
        return new cpg<>(delegate);
    }
}
