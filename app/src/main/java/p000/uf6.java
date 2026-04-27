package p000;

import java.util.concurrent.atomic.AtomicLong;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class uf6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final woe f87857c;

    /* JADX INFO: renamed from: d */
    public final boolean f87858d;

    /* JADX INFO: renamed from: e */
    public final int f87859e;

    /* JADX INFO: renamed from: uf6$a */
    public static abstract class AbstractRunnableC13525a<T> extends rv0<T> implements kj6<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f87860C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f87861F;

        /* JADX INFO: renamed from: H */
        public Throwable f87862H;

        /* JADX INFO: renamed from: L */
        public int f87863L;

        /* JADX INFO: renamed from: M */
        public long f87864M;

        /* JADX INFO: renamed from: N */
        public boolean f87865N;

        /* JADX INFO: renamed from: a */
        public final woe.AbstractC14729c f87866a;

        /* JADX INFO: renamed from: b */
        public final boolean f87867b;

        /* JADX INFO: renamed from: c */
        public final int f87868c;

        /* JADX INFO: renamed from: d */
        public final int f87869d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f87870e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public fdg f87871f;

        /* JADX INFO: renamed from: m */
        public zif<T> f87872m;

        public AbstractRunnableC13525a(woe.AbstractC14729c worker, boolean delayError, int prefetch) {
            this.f87866a = worker;
            this.f87867b = delayError;
            this.f87868c = prefetch;
            this.f87869d = prefetch - (prefetch >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23286a(boolean d, boolean empty, ycg<?> a) {
            if (this.f87860C) {
                clear();
                return true;
            }
            if (!d) {
                return false;
            }
            if (this.f87867b) {
                if (!empty) {
                    return false;
                }
                this.f87860C = true;
                Throwable th = this.f87862H;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                this.f87866a.dispose();
                return true;
            }
            Throwable th2 = this.f87862H;
            if (th2 != null) {
                this.f87860C = true;
                clear();
                a.onError(th2);
                this.f87866a.dispose();
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f87860C = true;
            a.onComplete();
            this.f87866a.dispose();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo23287b();

        /* JADX INFO: renamed from: c */
        public abstract void mo23288c();

        @Override // p000.fdg
        public final void cancel() {
            if (this.f87860C) {
                return;
            }
            this.f87860C = true;
            this.f87871f.cancel();
            this.f87866a.dispose();
            if (this.f87865N || getAndIncrement() != 0) {
                return;
            }
            this.f87872m.clear();
        }

        @Override // p000.zif
        public final void clear() {
            this.f87872m.clear();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo23289d();

        /* JADX INFO: renamed from: e */
        public final void m23290e() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f87866a.schedule(this);
        }

        @Override // p000.zif
        public final boolean isEmpty() {
            return this.f87872m.isEmpty();
        }

        @Override // p000.ycg
        public final void onComplete() {
            if (this.f87861F) {
                return;
            }
            this.f87861F = true;
            m23290e();
        }

        @Override // p000.ycg
        public final void onError(Throwable t) {
            if (this.f87861F) {
                ofe.onError(t);
                return;
            }
            this.f87862H = t;
            this.f87861F = true;
            m23290e();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f87861F) {
                return;
            }
            if (this.f87863L == 2) {
                m23290e();
                return;
            }
            if (!this.f87872m.offer(t)) {
                this.f87871f.cancel();
                this.f87862H = new bwa("Queue is full?!");
                this.f87861F = true;
            }
            m23290e();
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f87870e, n);
                m23290e();
            }
        }

        @Override // p000.vnd
        public final int requestFusion(int requestedMode) {
            if ((requestedMode & 2) == 0) {
                return 0;
            }
            this.f87865N = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f87865N) {
                mo23288c();
            } else if (this.f87863L == 1) {
                mo23289d();
            } else {
                mo23287b();
            }
        }
    }

    /* JADX INFO: renamed from: uf6$b */
    public static final class C13526b<T> extends AbstractRunnableC13525a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* JADX INFO: renamed from: Q */
        public final bq2<? super T> f87873Q;

        /* JADX INFO: renamed from: X */
        public long f87874X;

        public C13526b(bq2<? super T> actual, woe.AbstractC14729c worker, boolean delayError, int prefetch) {
            super(worker, delayError, prefetch);
            this.f87873Q = actual;
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: b */
        public void mo23287b() {
            bq2<? super T> bq2Var = this.f87873Q;
            zif<T> zifVar = this.f87872m;
            long j = this.f87864M;
            long j2 = this.f87874X;
            int iAddAndGet = 1;
            do {
                long j3 = this.f87870e.get();
                while (j != j3) {
                    boolean z = this.f87861F;
                    try {
                        T tPoll = zifVar.poll();
                        boolean z2 = tPoll == null;
                        if (m23286a(z, z2, bq2Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (bq2Var.tryOnNext(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f87869d) {
                            this.f87871f.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f87860C = true;
                        this.f87871f.cancel();
                        zifVar.clear();
                        bq2Var.onError(th);
                        this.f87866a.dispose();
                        return;
                    }
                }
                if (j == j3 && m23286a(this.f87861F, zifVar.isEmpty(), bq2Var)) {
                    return;
                }
                this.f87864M = j;
                this.f87874X = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: c */
        public void mo23288c() {
            int iAddAndGet = 1;
            while (!this.f87860C) {
                boolean z = this.f87861F;
                this.f87873Q.onNext(null);
                if (z) {
                    this.f87860C = true;
                    Throwable th = this.f87862H;
                    if (th != null) {
                        this.f87873Q.onError(th);
                    } else {
                        this.f87873Q.onComplete();
                    }
                    this.f87866a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: d */
        public void mo23289d() {
            bq2<? super T> bq2Var = this.f87873Q;
            zif<T> zifVar = this.f87872m;
            long j = this.f87864M;
            int iAddAndGet = 1;
            do {
                long j2 = this.f87870e.get();
                while (j != j2) {
                    try {
                        T tPoll = zifVar.poll();
                        if (this.f87860C) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f87860C = true;
                            bq2Var.onComplete();
                            this.f87866a.dispose();
                            return;
                        } else if (bq2Var.tryOnNext(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f87860C = true;
                        this.f87871f.cancel();
                        bq2Var.onError(th);
                        this.f87866a.dispose();
                        return;
                    }
                }
                if (this.f87860C) {
                    return;
                }
                if (zifVar.isEmpty()) {
                    this.f87860C = true;
                    bq2Var.onComplete();
                    this.f87866a.dispose();
                    return;
                }
                this.f87864M = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f87871f, s)) {
                this.f87871f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f87863L = 1;
                        this.f87872m = bodVar;
                        this.f87861F = true;
                        this.f87873Q.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f87863L = 2;
                        this.f87872m = bodVar;
                        this.f87873Q.onSubscribe(this);
                        s.request(this.f87868c);
                        return;
                    }
                }
                this.f87872m = new ozf(this.f87868c);
                this.f87873Q.onSubscribe(this);
                s.request(this.f87868c);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f87872m.poll();
            if (tPoll != null && this.f87863L != 1) {
                long j = this.f87874X + 1;
                if (j == this.f87869d) {
                    this.f87874X = 0L;
                    this.f87871f.request(j);
                } else {
                    this.f87874X = j;
                }
            }
            return tPoll;
        }
    }

    /* JADX INFO: renamed from: uf6$c */
    public static final class C13527c<T> extends AbstractRunnableC13525a<T> implements kj6<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* JADX INFO: renamed from: Q */
        public final ycg<? super T> f87875Q;

        public C13527c(ycg<? super T> actual, woe.AbstractC14729c worker, boolean delayError, int prefetch) {
            super(worker, delayError, prefetch);
            this.f87875Q = actual;
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: b */
        public void mo23287b() {
            ycg<? super T> ycgVar = this.f87875Q;
            zif<T> zifVar = this.f87872m;
            long j = this.f87864M;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f87870e.get();
                while (j != jAddAndGet) {
                    boolean z = this.f87861F;
                    try {
                        T tPoll = zifVar.poll();
                        boolean z2 = tPoll == null;
                        if (m23286a(z, z2, ycgVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j++;
                        if (j == this.f87869d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f87870e.addAndGet(-j);
                            }
                            this.f87871f.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f87860C = true;
                        this.f87871f.cancel();
                        zifVar.clear();
                        ycgVar.onError(th);
                        this.f87866a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && m23286a(this.f87861F, zifVar.isEmpty(), ycgVar)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f87864M = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: c */
        public void mo23288c() {
            int iAddAndGet = 1;
            while (!this.f87860C) {
                boolean z = this.f87861F;
                this.f87875Q.onNext(null);
                if (z) {
                    this.f87860C = true;
                    Throwable th = this.f87862H;
                    if (th != null) {
                        this.f87875Q.onError(th);
                    } else {
                        this.f87875Q.onComplete();
                    }
                    this.f87866a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.uf6.AbstractRunnableC13525a
        /* JADX INFO: renamed from: d */
        public void mo23289d() {
            ycg<? super T> ycgVar = this.f87875Q;
            zif<T> zifVar = this.f87872m;
            long j = this.f87864M;
            int iAddAndGet = 1;
            do {
                long j2 = this.f87870e.get();
                while (j != j2) {
                    try {
                        T tPoll = zifVar.poll();
                        if (this.f87860C) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f87860C = true;
                            ycgVar.onComplete();
                            this.f87866a.dispose();
                            return;
                        }
                        ycgVar.onNext(tPoll);
                        j++;
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f87860C = true;
                        this.f87871f.cancel();
                        ycgVar.onError(th);
                        this.f87866a.dispose();
                        return;
                    }
                }
                if (this.f87860C) {
                    return;
                }
                if (zifVar.isEmpty()) {
                    this.f87860C = true;
                    ycgVar.onComplete();
                    this.f87866a.dispose();
                    return;
                }
                this.f87864M = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f87871f, s)) {
                this.f87871f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f87863L = 1;
                        this.f87872m = bodVar;
                        this.f87861F = true;
                        this.f87875Q.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f87863L = 2;
                        this.f87872m = bodVar;
                        this.f87875Q.onSubscribe(this);
                        s.request(this.f87868c);
                        return;
                    }
                }
                this.f87872m = new ozf(this.f87868c);
                this.f87875Q.onSubscribe(this);
                s.request(this.f87868c);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll = this.f87872m.poll();
            if (tPoll != null && this.f87863L != 1) {
                long j = this.f87864M + 1;
                if (j == this.f87869d) {
                    this.f87864M = 0L;
                    this.f87871f.request(j);
                } else {
                    this.f87864M = j;
                }
            }
            return tPoll;
        }
    }

    public uf6(l86<T> source, woe scheduler, boolean delayError, int prefetch) {
        super(source);
        this.f87857c = scheduler;
        this.f87858d = delayError;
        this.f87859e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        woe.AbstractC14729c abstractC14729cCreateWorker = this.f87857c.createWorker();
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C13526b((bq2) s, abstractC14729cCreateWorker, this.f87858d, this.f87859e));
        } else {
            this.f49321b.subscribe((kj6) new C13527c(s, abstractC14729cCreateWorker, this.f87858d, this.f87859e));
        }
    }
}
