package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nsh<T> extends qg6<T> {

    /* JADX INFO: renamed from: C */
    public volatile boolean f65536C;

    /* JADX INFO: renamed from: M */
    public boolean f65540M;

    /* JADX INFO: renamed from: b */
    public final qzf<T> f65541b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Runnable> f65542c;

    /* JADX INFO: renamed from: d */
    public final boolean f65543d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f65544e;

    /* JADX INFO: renamed from: f */
    public Throwable f65545f;

    /* JADX INFO: renamed from: m */
    public final AtomicReference<ycg<? super T>> f65546m = new AtomicReference<>();

    /* JADX INFO: renamed from: F */
    public final AtomicBoolean f65537F = new AtomicBoolean();

    /* JADX INFO: renamed from: H */
    public final rv0<T> f65538H = new C10048a();

    /* JADX INFO: renamed from: L */
    public final AtomicLong f65539L = new AtomicLong();

    /* JADX INFO: renamed from: nsh$a */
    public final class C10048a extends rv0<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public C10048a() {
        }

        @Override // p000.fdg
        public void cancel() {
            if (nsh.this.f65536C) {
                return;
            }
            nsh.this.f65536C = true;
            nsh.this.m18116c();
            nsh.this.f65546m.lazySet(null);
            if (nsh.this.f65538H.getAndIncrement() == 0) {
                nsh.this.f65546m.lazySet(null);
                nsh nshVar = nsh.this;
                if (nshVar.f65540M) {
                    return;
                }
                nshVar.f65541b.clear();
            }
        }

        @Override // p000.zif
        public void clear() {
            nsh.this.f65541b.clear();
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return nsh.this.f65541b.isEmpty();
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return nsh.this.f65541b.poll();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(nsh.this.f65539L, n);
                nsh.this.m18117d();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int requestedMode) {
            if ((requestedMode & 2) == 0) {
                return 0;
            }
            nsh.this.f65540M = true;
            return 2;
        }
    }

    public nsh(int capacityHint, Runnable onTerminate, boolean delayError) {
        this.f65541b = new qzf<>(capacityHint);
        this.f65542c = new AtomicReference<>(onTerminate);
        this.f65543d = delayError;
    }

    @cfb
    @cy1
    public static <T> nsh<T> create() {
        return new nsh<>(l86.bufferSize(), null, true);
    }

    /* JADX INFO: renamed from: b */
    public boolean m18115b(boolean failFast, boolean d, boolean empty, ycg<? super T> a, qzf<T> q) {
        if (this.f65536C) {
            q.clear();
            this.f65546m.lazySet(null);
            return true;
        }
        if (!d) {
            return false;
        }
        if (failFast && this.f65545f != null) {
            q.clear();
            this.f65546m.lazySet(null);
            a.onError(this.f65545f);
            return true;
        }
        if (!empty) {
            return false;
        }
        Throwable th = this.f65545f;
        this.f65546m.lazySet(null);
        if (th != null) {
            a.onError(th);
        } else {
            a.onComplete();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m18116c() {
        Runnable andSet = this.f65542c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m18117d() {
        if (this.f65538H.getAndIncrement() != 0) {
            return;
        }
        ycg<? super T> ycgVar = this.f65546m.get();
        int iAddAndGet = 1;
        while (ycgVar == null) {
            iAddAndGet = this.f65538H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                ycgVar = this.f65546m.get();
            }
        }
        if (this.f65540M) {
            m18118e(ycgVar);
        } else {
            m18119f(ycgVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18118e(ycg<? super T> a) {
        qzf<T> qzfVar = this.f65541b;
        boolean z = this.f65543d;
        int iAddAndGet = 1;
        while (!this.f65536C) {
            boolean z2 = this.f65544e;
            if (!z && z2 && this.f65545f != null) {
                qzfVar.clear();
                this.f65546m.lazySet(null);
                a.onError(this.f65545f);
                return;
            }
            a.onNext(null);
            if (z2) {
                this.f65546m.lazySet(null);
                Throwable th = this.f65545f;
                if (th != null) {
                    a.onError(th);
                    return;
                } else {
                    a.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f65538H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.f65546m.lazySet(null);
    }

    /* JADX INFO: renamed from: f */
    public void m18119f(ycg<? super T> a) {
        long j;
        qzf<T> qzfVar = this.f65541b;
        boolean z = true;
        boolean z2 = !this.f65543d;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.f65539L.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.f65544e;
                T tPoll = qzfVar.poll();
                boolean z4 = tPoll == null ? z : false;
                j = j3;
                if (m18115b(z2, z3, z4, a, qzfVar)) {
                    return;
                }
                if (z4) {
                    break;
                }
                a.onNext(tPoll);
                j3 = 1 + j;
                z = true;
            }
            if (j2 == j3 && m18115b(z2, this.f65544e, qzfVar.isEmpty(), a, qzfVar)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.f65539L.addAndGet(-j);
            }
            iAddAndGet = this.f65538H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z = true;
            }
        }
    }

    @Override // p000.qg6
    @dib
    @cy1
    public Throwable getThrowable() {
        if (this.f65544e) {
            return this.f65545f;
        }
        return null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        return this.f65544e && this.f65545f == null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f65546m.get() != null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        return this.f65544e && this.f65545f != null;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f65544e || this.f65536C) {
            return;
        }
        this.f65544e = true;
        m18116c();
        m18117d();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (this.f65544e || this.f65536C) {
            ofe.onError(t);
            return;
        }
        this.f65545f = t;
        this.f65544e = true;
        m18116c();
        m18117d();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f65544e || this.f65536C) {
            return;
        }
        this.f65541b.offer(t);
        m18117d();
    }

    @Override // p000.ycg
    public void onSubscribe(fdg s) {
        if (this.f65544e || this.f65536C) {
            s.cancel();
        } else {
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (this.f65537F.get() || !this.f65537F.compareAndSet(false, true)) {
            w05.error(new IllegalStateException("This processor allows only a single Subscriber"), s);
            return;
        }
        s.onSubscribe(this.f65538H);
        this.f65546m.set(s);
        if (this.f65536C) {
            this.f65546m.lazySet(null);
        } else {
            m18117d();
        }
    }

    @cfb
    @cy1
    public static <T> nsh<T> create(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new nsh<>(capacityHint, null, true);
    }

    @cfb
    @cy1
    public static <T> nsh<T> create(boolean delayError) {
        return new nsh<>(l86.bufferSize(), null, delayError);
    }

    @cfb
    @cy1
    public static <T> nsh<T> create(int capacityHint, @cfb Runnable onTerminate) {
        return create(capacityHint, onTerminate, true);
    }

    @cfb
    @cy1
    public static <T> nsh<T> create(int capacityHint, @cfb Runnable onTerminate, boolean delayError) {
        Objects.requireNonNull(onTerminate, "onTerminate");
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new nsh<>(capacityHint, onTerminate, delayError);
    }
}
