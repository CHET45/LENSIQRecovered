package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class bpg<T> extends iu0<T, bpg<T>> implements oxb<T>, mf4, l9a<T>, inf<T>, dh2 {

    /* JADX INFO: renamed from: L */
    public final oxb<? super T> f14417L;

    /* JADX INFO: renamed from: M */
    public final AtomicReference<mf4> f14418M;

    /* JADX INFO: renamed from: N */
    public umd<T> f14419N;

    /* JADX INFO: renamed from: bpg$a */
    public enum EnumC1988a implements oxb<Object> {
        INSTANCE;

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
        }
    }

    public bpg() {
        this(EnumC1988a.INSTANCE);
    }

    public static <T> bpg<T> create() {
        return new bpg<>();
    }

    /* JADX INFO: renamed from: e */
    public static String m3333e(int i) {
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

    public final bpg<T> assertOf(tu2<? super bpg<T>> tu2Var) {
        try {
            tu2Var.accept(this);
            return this;
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final bpg<T> m3334b() {
        if (this.f14419N != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    /* JADX INFO: renamed from: c */
    public final bpg<T> m3335c(int i) {
        int i2 = this.f48264C;
        if (i2 == i) {
            return this;
        }
        if (this.f14419N == null) {
            throw m13418a("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + m3333e(i) + ", actual: " + m3333e(i2));
    }

    public final void cancel() {
        dispose();
    }

    /* JADX INFO: renamed from: d */
    public final bpg<T> m3336d() {
        if (this.f14419N == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // p000.mf4
    public final void dispose() {
        ag4.dispose(this.f14418M);
    }

    /* JADX INFO: renamed from: f */
    public final bpg<T> m3337f(int i) {
        this.f48273m = i;
        return this;
    }

    public final boolean hasSubscription() {
        return this.f14418M.get() != null;
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return ag4.isDisposed(this.f14418M.get());
    }

    @Override // p000.oxb
    public void onComplete() {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f14418M.get() == null) {
                this.f48269c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f48271e = Thread.currentThread();
            this.f48270d++;
            this.f14417L.onComplete();
        } finally {
            this.f48267a.countDown();
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f14418M.get() == null) {
                this.f48269c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f48271e = Thread.currentThread();
            if (th == null) {
                this.f48269c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f48269c.add(th);
            }
            this.f14417L.onError(th);
            this.f48267a.countDown();
        } catch (Throwable th2) {
            this.f48267a.countDown();
            throw th2;
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (!this.f48272f) {
            this.f48272f = true;
            if (this.f14418M.get() == null) {
                this.f48269c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f48271e = Thread.currentThread();
        if (this.f48264C != 2) {
            this.f48268b.add(t);
            if (t == null) {
                this.f48269c.add(new NullPointerException("onNext received a null value"));
            }
            this.f14417L.onNext(t);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f14419N.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f48268b.add(tPoll);
                }
            } catch (Throwable th) {
                this.f48269c.add(th);
                this.f14419N.dispose();
                return;
            }
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        this.f48271e = Thread.currentThread();
        if (mf4Var == null) {
            this.f48269c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!v7b.m23844a(this.f14418M, null, mf4Var)) {
            mf4Var.dispose();
            if (this.f14418M.get() != ag4.DISPOSED) {
                this.f48269c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + mf4Var));
                return;
            }
            return;
        }
        int i = this.f48273m;
        if (i != 0 && (mf4Var instanceof umd)) {
            umd<T> umdVar = (umd) mf4Var;
            this.f14419N = umdVar;
            int iRequestFusion = umdVar.requestFusion(i);
            this.f48264C = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f48272f = true;
                this.f48271e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f14419N.poll();
                        if (tPoll == null) {
                            this.f48270d++;
                            this.f14418M.lazySet(ag4.DISPOSED);
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
        this.f14417L.onSubscribe(mf4Var);
    }

    @Override // p000.l9a
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    public bpg(oxb<? super T> oxbVar) {
        this.f14418M = new AtomicReference<>();
        this.f14417L = oxbVar;
    }

    public static <T> bpg<T> create(oxb<? super T> oxbVar) {
        return new bpg<>(oxbVar);
    }

    @Override // p000.iu0
    public final bpg<T> assertNotSubscribed() {
        if (this.f14418M.get() != null) {
            throw m13418a("Subscribed!");
        }
        if (this.f48269c.isEmpty()) {
            return this;
        }
        throw m13418a("Not subscribed but errors found");
    }

    @Override // p000.iu0
    public final bpg<T> assertSubscribed() {
        if (this.f14418M.get() != null) {
            return this;
        }
        throw m13418a("Not subscribed!");
    }
}
