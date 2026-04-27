package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.ape;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class afc<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final fec<? extends T> f1336a;

    /* JADX INFO: renamed from: b */
    public final voe f1337b;

    /* JADX INFO: renamed from: c */
    public final int f1338c;

    /* JADX INFO: renamed from: afc$a */
    public static abstract class AbstractRunnableC0209a<T> extends AtomicInteger implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f1339C = new AtomicLong();

        /* JADX INFO: renamed from: F */
        public volatile boolean f1340F;

        /* JADX INFO: renamed from: H */
        public int f1341H;

        /* JADX INFO: renamed from: a */
        public final int f1342a;

        /* JADX INFO: renamed from: b */
        public final int f1343b;

        /* JADX INFO: renamed from: c */
        public final pzf<T> f1344c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f1345d;

        /* JADX INFO: renamed from: e */
        public fdg f1346e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f1347f;

        /* JADX INFO: renamed from: m */
        public Throwable f1348m;

        public AbstractRunnableC0209a(int i, pzf<T> pzfVar, voe.AbstractC14185c abstractC14185c) {
            this.f1342a = i;
            this.f1344c = pzfVar;
            this.f1343b = i - (i >> 2);
            this.f1345d = abstractC14185c;
        }

        /* JADX INFO: renamed from: a */
        public final void m493a() {
            if (getAndIncrement() == 0) {
                this.f1345d.schedule(this);
            }
        }

        @Override // p000.fdg
        public final void cancel() {
            if (this.f1340F) {
                return;
            }
            this.f1340F = true;
            this.f1346e.cancel();
            this.f1345d.dispose();
            if (getAndIncrement() == 0) {
                this.f1344c.clear();
            }
        }

        @Override // p000.ycg
        public final void onComplete() {
            if (this.f1347f) {
                return;
            }
            this.f1347f = true;
            m493a();
        }

        @Override // p000.ycg
        public final void onError(Throwable th) {
            if (this.f1347f) {
                pfe.onError(th);
                return;
            }
            this.f1348m = th;
            this.f1347f = true;
            m493a();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f1347f) {
                return;
            }
            if (this.f1344c.offer(t)) {
                m493a();
            } else {
                this.f1346e.cancel();
                onError(new cwa("Queue is full?!"));
            }
        }

        @Override // p000.fdg
        public final void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f1339C, j);
                m493a();
            }
        }
    }

    /* JADX INFO: renamed from: afc$b */
    public final class C0210b implements ape.InterfaceC1551a {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T>[] f1349a;

        /* JADX INFO: renamed from: b */
        public final ycg<T>[] f1350b;

        public C0210b(ycg<? super T>[] ycgVarArr, ycg<T>[] ycgVarArr2) {
            this.f1349a = ycgVarArr;
            this.f1350b = ycgVarArr2;
        }

        @Override // p000.ape.InterfaceC1551a
        public void onWorker(int i, voe.AbstractC14185c abstractC14185c) {
            afc.this.m492b(i, this.f1349a, this.f1350b, abstractC14185c);
        }
    }

    /* JADX INFO: renamed from: afc$c */
    public static final class C0211c<T> extends AbstractRunnableC0209a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: L */
        public final cq2<? super T> f1352L;

        public C0211c(cq2<? super T> cq2Var, int i, pzf<T> pzfVar, voe.AbstractC14185c abstractC14185c) {
            super(i, pzfVar, abstractC14185c);
            this.f1352L = cq2Var;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1346e, fdgVar)) {
                this.f1346e = fdgVar;
                this.f1352L.onSubscribe(this);
                fdgVar.request(this.f1342a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i = this.f1341H;
            pzf<T> pzfVar = this.f1344c;
            cq2<? super T> cq2Var = this.f1352L;
            int i2 = this.f1343b;
            int iAddAndGet = 1;
            while (true) {
                long j = this.f1339C.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f1340F) {
                        pzfVar.clear();
                        return;
                    }
                    boolean z = this.f1347f;
                    if (z && (th = this.f1348m) != null) {
                        pzfVar.clear();
                        cq2Var.onError(th);
                        this.f1345d.dispose();
                        return;
                    }
                    T tPoll = pzfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        cq2Var.onComplete();
                        this.f1345d.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        if (cq2Var.tryOnNext(tPoll)) {
                            j2++;
                        }
                        i++;
                        if (i == i2) {
                            this.f1346e.request(i);
                            i = 0;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.f1340F) {
                        pzfVar.clear();
                        return;
                    }
                    if (this.f1347f) {
                        Throwable th2 = this.f1348m;
                        if (th2 != null) {
                            pzfVar.clear();
                            cq2Var.onError(th2);
                            this.f1345d.dispose();
                            return;
                        } else if (pzfVar.isEmpty()) {
                            cq2Var.onComplete();
                            this.f1345d.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f1339C.addAndGet(-j2);
                }
                int i3 = get();
                if (i3 == iAddAndGet) {
                    this.f1341H = i;
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

    /* JADX INFO: renamed from: afc$d */
    public static final class C0212d<T> extends AbstractRunnableC0209a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* JADX INFO: renamed from: L */
        public final ycg<? super T> f1353L;

        public C0212d(ycg<? super T> ycgVar, int i, pzf<T> pzfVar, voe.AbstractC14185c abstractC14185c) {
            super(i, pzfVar, abstractC14185c);
            this.f1353L = ycgVar;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1346e, fdgVar)) {
                this.f1346e = fdgVar;
                this.f1353L.onSubscribe(this);
                fdgVar.request(this.f1342a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i = this.f1341H;
            pzf<T> pzfVar = this.f1344c;
            ycg<? super T> ycgVar = this.f1353L;
            int i2 = this.f1343b;
            int iAddAndGet = 1;
            while (true) {
                long j = this.f1339C.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f1340F) {
                        pzfVar.clear();
                        return;
                    }
                    boolean z = this.f1347f;
                    if (z && (th = this.f1348m) != null) {
                        pzfVar.clear();
                        ycgVar.onError(th);
                        this.f1345d.dispose();
                        return;
                    }
                    T tPoll = pzfVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        ycgVar.onComplete();
                        this.f1345d.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j2++;
                        i++;
                        if (i == i2) {
                            this.f1346e.request(i);
                            i = 0;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.f1340F) {
                        pzfVar.clear();
                        return;
                    }
                    if (this.f1347f) {
                        Throwable th2 = this.f1348m;
                        if (th2 != null) {
                            pzfVar.clear();
                            ycgVar.onError(th2);
                            this.f1345d.dispose();
                            return;
                        } else if (pzfVar.isEmpty()) {
                            ycgVar.onComplete();
                            this.f1345d.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f1339C.addAndGet(-j2);
                }
                int i3 = get();
                if (i3 == iAddAndGet) {
                    this.f1341H = i;
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

    public afc(fec<? extends T> fecVar, voe voeVar, int i) {
        this.f1336a = fecVar;
        this.f1337b = voeVar;
        this.f1338c = i;
    }

    /* JADX INFO: renamed from: b */
    public void m492b(int i, ycg<? super T>[] ycgVarArr, ycg<T>[] ycgVarArr2, voe.AbstractC14185c abstractC14185c) {
        ycg<? super T> ycgVar = ycgVarArr[i];
        pzf pzfVar = new pzf(this.f1338c);
        if (ycgVar instanceof cq2) {
            ycgVarArr2[i] = new C0211c((cq2) ycgVar, this.f1338c, pzfVar, abstractC14185c);
        } else {
            ycgVarArr2[i] = new C0212d(ycgVar, this.f1338c, pzfVar, abstractC14185c);
        }
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f1336a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<T>[] ycgVarArr2 = new ycg[length];
            Object obj = this.f1337b;
            if (obj instanceof ape) {
                ((ape) obj).createWorkers(length, new C0210b(ycgVarArr, ycgVarArr2));
            } else {
                for (int i = 0; i < length; i++) {
                    m492b(i, ycgVarArr, ycgVarArr2, this.f1337b.createWorker());
                }
            }
            this.f1336a.subscribe(ycgVarArr2);
        }
    }
}
