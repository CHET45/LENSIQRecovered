package p000;

import java.util.concurrent.atomic.AtomicLong;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class tf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final voe f84505c;

    /* JADX INFO: renamed from: d */
    public final boolean f84506d;

    /* JADX INFO: renamed from: e */
    public final int f84507e;

    /* JADX INFO: renamed from: tf6$a */
    public static abstract class AbstractRunnableC13010a<T> extends sv0<T> implements lj6<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f84508C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f84509F;

        /* JADX INFO: renamed from: H */
        public Throwable f84510H;

        /* JADX INFO: renamed from: L */
        public int f84511L;

        /* JADX INFO: renamed from: M */
        public long f84512M;

        /* JADX INFO: renamed from: N */
        public boolean f84513N;

        /* JADX INFO: renamed from: a */
        public final voe.AbstractC14185c f84514a;

        /* JADX INFO: renamed from: b */
        public final boolean f84515b;

        /* JADX INFO: renamed from: c */
        public final int f84516c;

        /* JADX INFO: renamed from: d */
        public final int f84517d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f84518e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public fdg f84519f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f84520m;

        public AbstractRunnableC13010a(voe.AbstractC14185c abstractC14185c, boolean z, int i) {
            this.f84514a = abstractC14185c;
            this.f84515b = z;
            this.f84516c = i;
            this.f84517d = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m22485a(boolean z, boolean z2, ycg<?> ycgVar) {
            if (this.f84508C) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f84515b) {
                if (!z2) {
                    return false;
                }
                this.f84508C = true;
                Throwable th = this.f84510H;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                this.f84514a.dispose();
                return true;
            }
            Throwable th2 = this.f84510H;
            if (th2 != null) {
                this.f84508C = true;
                clear();
                ycgVar.onError(th2);
                this.f84514a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f84508C = true;
            ycgVar.onComplete();
            this.f84514a.dispose();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo22486b();

        /* JADX INFO: renamed from: c */
        public abstract void mo22487c();

        @Override // p000.fdg
        public final void cancel() {
            if (this.f84508C) {
                return;
            }
            this.f84508C = true;
            this.f84519f.cancel();
            this.f84514a.dispose();
            if (this.f84513N || getAndIncrement() != 0) {
                return;
            }
            this.f84520m.clear();
        }

        @Override // p000.ajf
        public final void clear() {
            this.f84520m.clear();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo22488d();

        /* JADX INFO: renamed from: e */
        public final void m22489e() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f84514a.schedule(this);
        }

        @Override // p000.ajf
        public final boolean isEmpty() {
            return this.f84520m.isEmpty();
        }

        @Override // p000.ycg
        public final void onComplete() {
            if (this.f84509F) {
                return;
            }
            this.f84509F = true;
            m22489e();
        }

        @Override // p000.ycg
        public final void onError(Throwable th) {
            if (this.f84509F) {
                pfe.onError(th);
                return;
            }
            this.f84510H = th;
            this.f84509F = true;
            m22489e();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f84509F) {
                return;
            }
            if (this.f84511L == 2) {
                m22489e();
                return;
            }
            if (!this.f84520m.offer(t)) {
                this.f84519f.cancel();
                this.f84510H = new cwa("Queue is full?!");
                this.f84509F = true;
            }
            m22489e();
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f84518e, j);
                m22489e();
            }
        }

        @Override // p000.wnd
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f84513N = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f84513N) {
                mo22487c();
            } else if (this.f84511L == 1) {
                mo22488d();
            } else {
                mo22486b();
            }
        }
    }

    /* JADX INFO: renamed from: tf6$b */
    public static final class C13011b<T> extends AbstractRunnableC13010a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* JADX INFO: renamed from: Q */
        public final cq2<? super T> f84521Q;

        /* JADX INFO: renamed from: X */
        public long f84522X;

        public C13011b(cq2<? super T> cq2Var, voe.AbstractC14185c abstractC14185c, boolean z, int i) {
            super(abstractC14185c, z, i);
            this.f84521Q = cq2Var;
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: b */
        public void mo22486b() {
            cq2<? super T> cq2Var = this.f84521Q;
            ajf<T> ajfVar = this.f84520m;
            long j = this.f84512M;
            long j2 = this.f84522X;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.f84518e.get();
                while (j != j3) {
                    boolean z = this.f84509F;
                    try {
                        T tPoll = ajfVar.poll();
                        boolean z2 = tPoll == null;
                        if (m22485a(z, z2, cq2Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (cq2Var.tryOnNext(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f84517d) {
                            this.f84519f.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f84508C = true;
                        this.f84519f.cancel();
                        ajfVar.clear();
                        cq2Var.onError(th);
                        this.f84514a.dispose();
                        return;
                    }
                }
                if (j == j3 && m22485a(this.f84509F, ajfVar.isEmpty(), cq2Var)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f84512M = j;
                    this.f84522X = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: c */
        public void mo22487c() {
            int iAddAndGet = 1;
            while (!this.f84508C) {
                boolean z = this.f84509F;
                this.f84521Q.onNext(null);
                if (z) {
                    this.f84508C = true;
                    Throwable th = this.f84510H;
                    if (th != null) {
                        this.f84521Q.onError(th);
                    } else {
                        this.f84521Q.onComplete();
                    }
                    this.f84514a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: d */
        public void mo22488d() {
            cq2<? super T> cq2Var = this.f84521Q;
            ajf<T> ajfVar = this.f84520m;
            long j = this.f84512M;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f84518e.get();
                while (j != j2) {
                    try {
                        T tPoll = ajfVar.poll();
                        if (this.f84508C) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f84508C = true;
                            cq2Var.onComplete();
                            this.f84514a.dispose();
                            return;
                        } else if (cq2Var.tryOnNext(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f84508C = true;
                        this.f84519f.cancel();
                        cq2Var.onError(th);
                        this.f84514a.dispose();
                        return;
                    }
                }
                if (this.f84508C) {
                    return;
                }
                if (ajfVar.isEmpty()) {
                    this.f84508C = true;
                    cq2Var.onComplete();
                    this.f84514a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.f84512M = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f84519f, fdgVar)) {
                this.f84519f = fdgVar;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f84511L = 1;
                        this.f84520m = codVar;
                        this.f84509F = true;
                        this.f84521Q.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f84511L = 2;
                        this.f84520m = codVar;
                        this.f84521Q.onSubscribe(this);
                        fdgVar.request(this.f84516c);
                        return;
                    }
                }
                this.f84520m = new pzf(this.f84516c);
                this.f84521Q.onSubscribe(this);
                fdgVar.request(this.f84516c);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f84520m.poll();
            if (tPoll != null && this.f84511L != 1) {
                long j = this.f84522X + 1;
                if (j == this.f84517d) {
                    this.f84522X = 0L;
                    this.f84519f.request(j);
                } else {
                    this.f84522X = j;
                }
            }
            return tPoll;
        }
    }

    /* JADX INFO: renamed from: tf6$c */
    public static final class C13012c<T> extends AbstractRunnableC13010a<T> implements lj6<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* JADX INFO: renamed from: Q */
        public final ycg<? super T> f84523Q;

        public C13012c(ycg<? super T> ycgVar, voe.AbstractC14185c abstractC14185c, boolean z, int i) {
            super(abstractC14185c, z, i);
            this.f84523Q = ycgVar;
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: b */
        public void mo22486b() {
            ycg<? super T> ycgVar = this.f84523Q;
            ajf<T> ajfVar = this.f84520m;
            long j = this.f84512M;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f84518e.get();
                while (j != jAddAndGet) {
                    boolean z = this.f84509F;
                    try {
                        T tPoll = ajfVar.poll();
                        boolean z2 = tPoll == null;
                        if (m22485a(z, z2, ycgVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j++;
                        if (j == this.f84517d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f84518e.addAndGet(-j);
                            }
                            this.f84519f.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f84508C = true;
                        this.f84519f.cancel();
                        ajfVar.clear();
                        ycgVar.onError(th);
                        this.f84514a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && m22485a(this.f84509F, ajfVar.isEmpty(), ycgVar)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f84512M = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: c */
        public void mo22487c() {
            int iAddAndGet = 1;
            while (!this.f84508C) {
                boolean z = this.f84509F;
                this.f84523Q.onNext(null);
                if (z) {
                    this.f84508C = true;
                    Throwable th = this.f84510H;
                    if (th != null) {
                        this.f84523Q.onError(th);
                    } else {
                        this.f84523Q.onComplete();
                    }
                    this.f84514a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.tf6.AbstractRunnableC13010a
        /* JADX INFO: renamed from: d */
        public void mo22488d() {
            ycg<? super T> ycgVar = this.f84523Q;
            ajf<T> ajfVar = this.f84520m;
            long j = this.f84512M;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f84518e.get();
                while (j != j2) {
                    try {
                        T tPoll = ajfVar.poll();
                        if (this.f84508C) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f84508C = true;
                            ycgVar.onComplete();
                            this.f84514a.dispose();
                            return;
                        }
                        ycgVar.onNext(tPoll);
                        j++;
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f84508C = true;
                        this.f84519f.cancel();
                        ycgVar.onError(th);
                        this.f84514a.dispose();
                        return;
                    }
                }
                if (this.f84508C) {
                    return;
                }
                if (ajfVar.isEmpty()) {
                    this.f84508C = true;
                    ycgVar.onComplete();
                    this.f84514a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.f84512M = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f84519f, fdgVar)) {
                this.f84519f = fdgVar;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f84511L = 1;
                        this.f84520m = codVar;
                        this.f84509F = true;
                        this.f84523Q.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f84511L = 2;
                        this.f84520m = codVar;
                        this.f84523Q.onSubscribe(this);
                        fdgVar.request(this.f84516c);
                        return;
                    }
                }
                this.f84520m = new pzf(this.f84516c);
                this.f84523Q.onSubscribe(this);
                fdgVar.request(this.f84516c);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f84520m.poll();
            if (tPoll != null && this.f84511L != 1) {
                long j = this.f84512M + 1;
                if (j == this.f84517d) {
                    this.f84512M = 0L;
                    this.f84519f.request(j);
                } else {
                    this.f84512M = j;
                }
            }
            return tPoll;
        }
    }

    public tf6(m86<T> m86Var, voe voeVar, boolean z, int i) {
        super(m86Var);
        this.f84505c = voeVar;
        this.f84506d = z;
        this.f84507e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        voe.AbstractC14185c abstractC14185cCreateWorker = this.f84505c.createWorker();
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C13011b((cq2) ycgVar, abstractC14185cCreateWorker, this.f84506d, this.f84507e));
        } else {
            this.f52360b.subscribe((lj6) new C13012c(ycgVar, abstractC14185cCreateWorker, this.f84506d, this.f84507e));
        }
    }
}
