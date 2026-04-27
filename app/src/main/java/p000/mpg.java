package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class mpg<T> extends iu0<T, mpg<T>> implements lj6<T>, fdg, mf4 {

    /* JADX INFO: renamed from: L */
    public final ycg<? super T> f61723L;

    /* JADX INFO: renamed from: M */
    public volatile boolean f61724M;

    /* JADX INFO: renamed from: N */
    public final AtomicReference<fdg> f61725N;

    /* JADX INFO: renamed from: Q */
    public final AtomicLong f61726Q;

    /* JADX INFO: renamed from: X */
    public cod<T> f61727X;

    /* JADX INFO: renamed from: mpg$a */
    public enum EnumC9467a implements lj6<Object> {
        INSTANCE;

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
        }
    }

    public mpg() {
        this(EnumC9467a.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> mpg<T> create() {
        return new mpg<>();
    }

    /* JADX INFO: renamed from: e */
    public static String m17508e(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SYNC";
        }
        if (i == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i + c0b.f15434d;
    }

    public final mpg<T> assertOf(tu2<? super mpg<T>> tu2Var) {
        try {
            tu2Var.accept(this);
            return this;
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final mpg<T> m17509b() {
        if (this.f61727X != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    /* JADX INFO: renamed from: c */
    public final mpg<T> m17510c(int i) {
        int i2 = this.f48264C;
        if (i2 == i) {
            return this;
        }
        if (this.f61727X == null) {
            throw m13418a("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + m17508e(i) + ", actual: " + m17508e(i2));
    }

    @Override // p000.fdg
    public final void cancel() {
        if (this.f61724M) {
            return;
        }
        this.f61724M = true;
        mdg.cancel(this.f61725N);
    }

    /* JADX INFO: renamed from: d */
    public final mpg<T> m17511d() {
        if (this.f61727X == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // p000.mf4
    public final void dispose() {
        cancel();
    }

    /* JADX INFO: renamed from: f */
    public void m17512f() {
    }

    /* JADX INFO: renamed from: g */
    public final mpg<T> m17513g(int i) {
        this.f48273m = i;
        return this;
    }

    public final boolean hasSubscription() {
        return this.f61725N.get() != null;
    }

    public final boolean isCancelled() {
        return this.f61724M;
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f61724M;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f61725N.get() == null) {
                this.f48269c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f48271e = Thread.currentThread();
            this.f48270d++;
            this.f61723L.onComplete();
        } finally {
            this.f48267a.countDown();
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f61725N.get() == null) {
                this.f48269c.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f48271e = Thread.currentThread();
            this.f48269c.add(th);
            if (th == null) {
                this.f48269c.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f61723L.onError(th);
            this.f48267a.countDown();
        } catch (Throwable th2) {
            this.f48267a.countDown();
            throw th2;
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f61725N.get() == null) {
                this.f48269c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f48271e = Thread.currentThread();
        if (this.f48264C != 2) {
            this.f48268b.add(t);
            if (t == null) {
                this.f48269c.add(new NullPointerException("onNext received a null value"));
            }
            this.f61723L.onNext(t);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f61727X.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f48268b.add(tPoll);
                }
            } catch (Throwable th) {
                this.f48269c.add(th);
                this.f61727X.cancel();
                return;
            }
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        this.f48271e = Thread.currentThread();
        if (fdgVar == null) {
            this.f48269c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!v7b.m23844a(this.f61725N, null, fdgVar)) {
            fdgVar.cancel();
            if (this.f61725N.get() != mdg.CANCELLED) {
                this.f48269c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + fdgVar));
                return;
            }
            return;
        }
        int i = this.f48273m;
        if (i != 0 && (fdgVar instanceof cod)) {
            cod<T> codVar = (cod) fdgVar;
            this.f61727X = codVar;
            int iRequestFusion = codVar.requestFusion(i);
            this.f48264C = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f48272f = true;
                this.f48271e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f61727X.poll();
                        if (tPoll == null) {
                            this.f48270d++;
                            return;
                        }
                        this.f48268b.add(tPoll);
                    } catch (Throwable th) {
                        this.f48269c.add(th);
                        return;
                    }
                }
            }
        }
        this.f61723L.onSubscribe(fdgVar);
        long andSet = this.f61726Q.getAndSet(0L);
        if (andSet != 0) {
            fdgVar.request(andSet);
        }
        m17512f();
    }

    @Override // p000.fdg
    public final void request(long j) {
        mdg.deferredRequest(this.f61725N, this.f61726Q, j);
    }

    public final mpg<T> requestMore(long j) {
        request(j);
        return this;
    }

    public mpg(long j) {
        this(EnumC9467a.INSTANCE, j);
    }

    public static <T> mpg<T> create(long j) {
        return new mpg<>(j);
    }

    @Override // p000.iu0
    public final mpg<T> assertNotSubscribed() {
        if (this.f61725N.get() != null) {
            throw m13418a("Subscribed!");
        }
        if (this.f48269c.isEmpty()) {
            return this;
        }
        throw m13418a("Not subscribed but errors found");
    }

    @Override // p000.iu0
    public final mpg<T> assertSubscribed() {
        if (this.f61725N.get() != null) {
            return this;
        }
        throw m13418a("Not subscribed!");
    }

    public mpg(ycg<? super T> ycgVar) {
        this(ycgVar, Long.MAX_VALUE);
    }

    public static <T> mpg<T> create(ycg<? super T> ycgVar) {
        return new mpg<>(ycgVar);
    }

    public mpg(ycg<? super T> ycgVar, long j) {
        if (j >= 0) {
            this.f61723L = ycgVar;
            this.f61725N = new AtomicReference<>();
            this.f61726Q = new AtomicLong(j);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
