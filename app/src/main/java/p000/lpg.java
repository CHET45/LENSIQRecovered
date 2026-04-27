package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class lpg<T> extends ju0<T, lpg<T>> implements kj6<T>, fdg {

    /* JADX INFO: renamed from: F */
    public final ycg<? super T> f58431F;

    /* JADX INFO: renamed from: H */
    public volatile boolean f58432H;

    /* JADX INFO: renamed from: L */
    public final AtomicReference<fdg> f58433L;

    /* JADX INFO: renamed from: M */
    public final AtomicLong f58434M;

    /* JADX INFO: renamed from: lpg$a */
    public enum EnumC8935a implements kj6<Object> {
        INSTANCE;

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
        }

        @Override // p000.ycg
        public void onNext(Object t) {
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
        }
    }

    public lpg() {
        this(EnumC8935a.INSTANCE, Long.MAX_VALUE);
    }

    @cfb
    public static <T> lpg<T> create() {
        return new lpg<>();
    }

    @Override // p000.ju0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lpg<T> mo8645a() {
        if (this.f58433L.get() != null) {
            return this;
        }
        throw m14306b("Not subscribed!");
    }

    @Override // p000.fdg
    public final void cancel() {
        if (this.f58432H) {
            return;
        }
        this.f58432H = true;
        ldg.cancel(this.f58433L);
    }

    /* JADX INFO: renamed from: d */
    public void m16313d() {
    }

    @Override // p000.ju0, p000.lf4
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.f58433L.get() != null;
    }

    public final boolean isCancelled() {
        return this.f58432H;
    }

    @Override // p000.ju0, p000.lf4
    public final boolean isDisposed() {
        return this.f58432H;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f58433L.get() == null) {
                this.f51823c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f51825e = Thread.currentThread();
            this.f51824d++;
            this.f58431F.onComplete();
        } finally {
            this.f51821a.countDown();
        }
    }

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f58433L.get() == null) {
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
            this.f58431F.onError(t);
            this.f51821a.countDown();
        } catch (Throwable th) {
            this.f51821a.countDown();
            throw th;
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        if (!this.f51826f) {
            this.f51826f = true;
            if (this.f58433L.get() == null) {
                this.f51823c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f51825e = Thread.currentThread();
        this.f51822b.add(t);
        if (t == null) {
            this.f51823c.add(new NullPointerException("onNext received a null value"));
        }
        this.f58431F.onNext(t);
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(@cfb fdg s) {
        this.f51825e = Thread.currentThread();
        if (s == null) {
            this.f51823c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (v7b.m23844a(this.f58433L, null, s)) {
            this.f58431F.onSubscribe(s);
            long andSet = this.f58434M.getAndSet(0L);
            if (andSet != 0) {
                s.request(andSet);
            }
            m16313d();
            return;
        }
        s.cancel();
        if (this.f58433L.get() != ldg.CANCELLED) {
            this.f51823c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + s));
        }
    }

    @Override // p000.fdg
    public final void request(long n) {
        ldg.deferredRequest(this.f58433L, this.f58434M, n);
    }

    public final lpg<T> requestMore(long n) {
        request(n);
        return this;
    }

    public lpg(long initialRequest) {
        this(EnumC8935a.INSTANCE, initialRequest);
    }

    @cfb
    public static <T> lpg<T> create(long initialRequested) {
        return new lpg<>(initialRequested);
    }

    public lpg(@cfb ycg<? super T> downstream) {
        this(downstream, Long.MAX_VALUE);
    }

    public static <T> lpg<T> create(@cfb ycg<? super T> delegate) {
        return new lpg<>(delegate);
    }

    public lpg(@cfb ycg<? super T> actual, long initialRequest) {
        if (initialRequest >= 0) {
            this.f58431F = actual;
            this.f58433L = new AtomicReference<>();
            this.f58434M = new AtomicLong(initialRequest);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
