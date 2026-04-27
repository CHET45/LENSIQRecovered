package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ki6<T> extends m86<Boolean> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f54194b;

    /* JADX INFO: renamed from: c */
    public final zjd<? extends T> f54195c;

    /* JADX INFO: renamed from: d */
    public final m11<? super T, ? super T> f54196d;

    /* JADX INFO: renamed from: e */
    public final int f54197e;

    /* JADX INFO: renamed from: ki6$a */
    public static final class C8376a<T> extends k34<Boolean> implements InterfaceC8377b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: L */
        public final m11<? super T, ? super T> f54198L;

        /* JADX INFO: renamed from: M */
        public final C8378c<T> f54199M;

        /* JADX INFO: renamed from: N */
        public final C8378c<T> f54200N;

        /* JADX INFO: renamed from: Q */
        public final cc0 f54201Q;

        /* JADX INFO: renamed from: X */
        public final AtomicInteger f54202X;

        /* JADX INFO: renamed from: Y */
        public T f54203Y;

        /* JADX INFO: renamed from: Z */
        public T f54204Z;

        public C8376a(ycg<? super Boolean> ycgVar, int i, m11<? super T, ? super T> m11Var) {
            super(ycgVar);
            this.f54198L = m11Var;
            this.f54202X = new AtomicInteger();
            this.f54199M = new C8378c<>(this, i);
            this.f54200N = new C8378c<>(this, i);
            this.f54201Q = new cc0();
        }

        /* JADX INFO: renamed from: a */
        public void m14752a() {
            this.f54199M.cancel();
            this.f54199M.m14754a();
            this.f54200N.cancel();
            this.f54200N.m14754a();
        }

        /* JADX INFO: renamed from: b */
        public void m14753b(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
            zjdVar.subscribe(this.f54199M);
            zjdVar2.subscribe(this.f54200N);
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f54199M.cancel();
            this.f54200N.cancel();
            if (this.f54202X.getAndIncrement() == 0) {
                this.f54199M.m14754a();
                this.f54200N.m14754a();
            }
        }

        @Override // p000.ki6.InterfaceC8377b
        public void drain() {
            if (this.f54202X.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                ajf<T> ajfVar = this.f54199M.f54209e;
                ajf<T> ajfVar2 = this.f54200N.f54209e;
                if (ajfVar != null && ajfVar2 != null) {
                    while (!isCancelled()) {
                        if (this.f54201Q.get() != null) {
                            m14752a();
                            this.f52502a.onError(this.f54201Q.terminate());
                            return;
                        }
                        boolean z = this.f54199M.f54210f;
                        T tPoll = this.f54203Y;
                        if (tPoll == null) {
                            try {
                                tPoll = ajfVar.poll();
                                this.f54203Y = tPoll;
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                m14752a();
                                this.f54201Q.addThrowable(th);
                                this.f52502a.onError(this.f54201Q.terminate());
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.f54200N.f54210f;
                        T tPoll2 = this.f54204Z;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = ajfVar2.poll();
                                this.f54204Z = tPoll2;
                            } catch (Throwable th2) {
                                n75.throwIfFatal(th2);
                                m14752a();
                                this.f54201Q.addThrowable(th2);
                                this.f52502a.onError(this.f54201Q.terminate());
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m14752a();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f54198L.test(tPoll, tPoll2)) {
                                    m14752a();
                                    complete(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f54203Y = null;
                                    this.f54204Z = null;
                                    this.f54199M.request();
                                    this.f54200N.request();
                                }
                            } catch (Throwable th3) {
                                n75.throwIfFatal(th3);
                                m14752a();
                                this.f54201Q.addThrowable(th3);
                                this.f52502a.onError(this.f54201Q.terminate());
                                return;
                            }
                        }
                    }
                    this.f54199M.m14754a();
                    this.f54200N.m14754a();
                    return;
                }
                if (isCancelled()) {
                    this.f54199M.m14754a();
                    this.f54200N.m14754a();
                    return;
                } else if (this.f54201Q.get() != null) {
                    m14752a();
                    this.f52502a.onError(this.f54201Q.terminate());
                    return;
                }
                iAddAndGet = this.f54202X.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.ki6.InterfaceC8377b
        public void innerError(Throwable th) {
            if (this.f54201Q.addThrowable(th)) {
                drain();
            } else {
                pfe.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: ki6$b */
    public interface InterfaceC8377b {
        void drain();

        void innerError(Throwable th);
    }

    /* JADX INFO: renamed from: ki6$c */
    public static final class C8378c<T> extends AtomicReference<fdg> implements lj6<T> {
        private static final long serialVersionUID = 4804128302091633067L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC8377b f54205a;

        /* JADX INFO: renamed from: b */
        public final int f54206b;

        /* JADX INFO: renamed from: c */
        public final int f54207c;

        /* JADX INFO: renamed from: d */
        public long f54208d;

        /* JADX INFO: renamed from: e */
        public volatile ajf<T> f54209e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f54210f;

        /* JADX INFO: renamed from: m */
        public int f54211m;

        public C8378c(InterfaceC8377b interfaceC8377b, int i) {
            this.f54205a = interfaceC8377b;
            this.f54207c = i - (i >> 2);
            this.f54206b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14754a() {
            ajf<T> ajfVar = this.f54209e;
            if (ajfVar != null) {
                ajfVar.clear();
            }
        }

        public void cancel() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f54210f = true;
            this.f54205a.drain();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f54205a.innerError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f54211m != 0 || this.f54209e.offer(t)) {
                this.f54205a.drain();
            } else {
                onError(new cwa());
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f54211m = iRequestFusion;
                        this.f54209e = codVar;
                        this.f54210f = true;
                        this.f54205a.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f54211m = iRequestFusion;
                        this.f54209e = codVar;
                        fdgVar.request(this.f54206b);
                        return;
                    }
                }
                this.f54209e = new pzf(this.f54206b);
                fdgVar.request(this.f54206b);
            }
        }

        public void request() {
            if (this.f54211m != 1) {
                long j = this.f54208d + 1;
                if (j < this.f54207c) {
                    this.f54208d = j;
                } else {
                    this.f54208d = 0L;
                    get().request(j);
                }
            }
        }
    }

    public ki6(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, m11<? super T, ? super T> m11Var, int i) {
        this.f54194b = zjdVar;
        this.f54195c = zjdVar2;
        this.f54196d = m11Var;
        this.f54197e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Boolean> ycgVar) {
        C8376a c8376a = new C8376a(ycgVar, this.f54197e, this.f54196d);
        ycgVar.onSubscribe(c8376a);
        c8376a.m14753b(this.f54194b, this.f54195c);
    }
}
