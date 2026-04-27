package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.bpe;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class bfc<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final eec<? extends T> f13629a;

    /* JADX INFO: renamed from: b */
    public final woe f13630b;

    /* JADX INFO: renamed from: c */
    public final int f13631c;

    /* JADX INFO: renamed from: bfc$a */
    public static abstract class AbstractRunnableC1877a<T> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f13632C = new AtomicLong();

        /* JADX INFO: renamed from: F */
        public volatile boolean f13633F;

        /* JADX INFO: renamed from: H */
        public int f13634H;

        /* JADX INFO: renamed from: a */
        public final int f13635a;

        /* JADX INFO: renamed from: b */
        public final int f13636b;

        /* JADX INFO: renamed from: c */
        public final ozf<T> f13637c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f13638d;

        /* JADX INFO: renamed from: e */
        public fdg f13639e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f13640f;

        /* JADX INFO: renamed from: m */
        public Throwable f13641m;

        public AbstractRunnableC1877a(int prefetch, ozf<T> queue, woe.AbstractC14729c worker) {
            this.f13635a = prefetch;
            this.f13637c = queue;
            this.f13636b = prefetch - (prefetch >> 2);
            this.f13638d = worker;
        }

        /* JADX INFO: renamed from: a */
        public final void m3159a() {
            if (getAndIncrement() == 0) {
                this.f13638d.schedule(this);
            }
        }

        @Override // p000.fdg
        public final void cancel() {
            if (this.f13633F) {
                return;
            }
            this.f13633F = true;
            this.f13639e.cancel();
            this.f13638d.dispose();
            if (getAndIncrement() == 0) {
                this.f13637c.clear();
            }
        }

        @Override // p000.ycg
        public final void onComplete() {
            if (this.f13640f) {
                return;
            }
            this.f13640f = true;
            m3159a();
        }

        @Override // p000.ycg
        public final void onError(Throwable t) {
            if (this.f13640f) {
                ofe.onError(t);
                return;
            }
            this.f13641m = t;
            this.f13640f = true;
            m3159a();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f13640f) {
                return;
            }
            if (this.f13637c.offer(t)) {
                m3159a();
            } else {
                this.f13639e.cancel();
                onError(new bwa("Queue is full?!"));
            }
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f13632C, n);
                m3159a();
            }
        }
    }

    /* JADX INFO: renamed from: bfc$b */
    public final class C1878b implements bpe.InterfaceC1986a {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T>[] f13642a;

        /* JADX INFO: renamed from: b */
        public final ycg<T>[] f13643b;

        public C1878b(ycg<? super T>[] subscribers, ycg<T>[] parents) {
            this.f13642a = subscribers;
            this.f13643b = parents;
        }

        @Override // p000.bpe.InterfaceC1986a
        public void onWorker(int i, woe.AbstractC14729c w) {
            bfc.this.m3158b(i, this.f13642a, this.f13643b, w);
        }
    }

    /* JADX INFO: renamed from: bfc$c */
    public static final class C1879c<T> extends AbstractRunnableC1877a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: L */
        public final bq2<? super T> f13645L;

        public C1879c(bq2<? super T> actual, int prefetch, ozf<T> queue, woe.AbstractC14729c worker) {
            super(prefetch, queue, worker);
            this.f13645L = actual;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13639e, s)) {
                this.f13639e = s;
                this.f13645L.onSubscribe(this);
                s.request(this.f13635a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i = this.f13634H;
            ozf<T> ozfVar = this.f13637c;
            bq2<? super T> bq2Var = this.f13645L;
            int i2 = this.f13636b;
            int iAddAndGet = 1;
            do {
                long j = this.f13632C.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f13633F) {
                        ozfVar.clear();
                        return;
                    }
                    boolean z = this.f13640f;
                    if (z && (th = this.f13641m) != null) {
                        ozfVar.clear();
                        bq2Var.onError(th);
                        this.f13638d.dispose();
                        return;
                    }
                    T tPoll = ozfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        bq2Var.onComplete();
                        this.f13638d.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        if (bq2Var.tryOnNext(tPoll)) {
                            j2++;
                        }
                        i++;
                        if (i == i2) {
                            this.f13639e.request(i);
                            i = 0;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.f13633F) {
                        ozfVar.clear();
                        return;
                    }
                    if (this.f13640f) {
                        Throwable th2 = this.f13641m;
                        if (th2 != null) {
                            ozfVar.clear();
                            bq2Var.onError(th2);
                            this.f13638d.dispose();
                            return;
                        } else if (ozfVar.isEmpty()) {
                            bq2Var.onComplete();
                            this.f13638d.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this.f13632C, j2);
                }
                this.f13634H = i;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    /* JADX INFO: renamed from: bfc$d */
    public static final class C1880d<T> extends AbstractRunnableC1877a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: L */
        public final ycg<? super T> f13646L;

        public C1880d(ycg<? super T> actual, int prefetch, ozf<T> queue, woe.AbstractC14729c worker) {
            super(prefetch, queue, worker);
            this.f13646L = actual;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13639e, s)) {
                this.f13639e = s;
                this.f13646L.onSubscribe(this);
                s.request(this.f13635a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i = this.f13634H;
            ozf<T> ozfVar = this.f13637c;
            ycg<? super T> ycgVar = this.f13646L;
            int i2 = this.f13636b;
            int iAddAndGet = 1;
            while (true) {
                long j = this.f13632C.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f13633F) {
                        ozfVar.clear();
                        return;
                    }
                    boolean z = this.f13640f;
                    if (z && (th = this.f13641m) != null) {
                        ozfVar.clear();
                        ycgVar.onError(th);
                        this.f13638d.dispose();
                        return;
                    }
                    T tPoll = ozfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        ycgVar.onComplete();
                        this.f13638d.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j2++;
                        i++;
                        if (i == i2) {
                            this.f13639e.request(i);
                            i = 0;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.f13633F) {
                        ozfVar.clear();
                        return;
                    }
                    if (this.f13640f) {
                        Throwable th2 = this.f13641m;
                        if (th2 != null) {
                            ozfVar.clear();
                            ycgVar.onError(th2);
                            this.f13638d.dispose();
                            return;
                        } else if (ozfVar.isEmpty()) {
                            ycgVar.onComplete();
                            this.f13638d.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f13632C.addAndGet(-j2);
                }
                int i3 = get();
                if (i3 == iAddAndGet) {
                    this.f13634H = i;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i3;
                }
            }
        }
    }

    public bfc(eec<? extends T> parent, woe scheduler, int prefetch) {
        this.f13629a = parent;
        this.f13630b = scheduler;
        this.f13631c = prefetch;
    }

    /* JADX INFO: renamed from: b */
    public void m3158b(int i, ycg<? super T>[] subscribers, ycg<T>[] parents, woe.AbstractC14729c worker) {
        ycg<? super T> ycgVar = subscribers[i];
        ozf ozfVar = new ozf(this.f13631c);
        if (ycgVar instanceof bq2) {
            parents[i] = new C1879c((bq2) ycgVar, this.f13631c, ozfVar, worker);
        } else {
            parents[i] = new C1880d(ycgVar, this.f13631c, ozfVar, worker);
        }
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f13629a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<? super T>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<T>[] ycgVarArr = new ycg[length];
            Object obj = this.f13630b;
            if (obj instanceof bpe) {
                ((bpe) obj).createWorkers(length, new C1878b(ycgVarArrOnSubscribe, ycgVarArr));
            } else {
                for (int i = 0; i < length; i++) {
                    m3158b(i, ycgVarArrOnSubscribe, ycgVarArr, this.f13630b.createWorker());
                }
            }
            this.f13629a.subscribe(ycgVarArr);
        }
    }
}
