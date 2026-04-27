package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class li6<T> extends l86<Boolean> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f57677b;

    /* JADX INFO: renamed from: c */
    public final zjd<? extends T> f57678c;

    /* JADX INFO: renamed from: d */
    public final l11<? super T, ? super T> f57679d;

    /* JADX INFO: renamed from: e */
    public final int f57680e;

    /* JADX INFO: renamed from: li6$a */
    public static final class C8824a<T> extends j34<Boolean> implements InterfaceC8825b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: L */
        public final l11<? super T, ? super T> f57681L;

        /* JADX INFO: renamed from: M */
        public final C8826c<T> f57682M;

        /* JADX INFO: renamed from: N */
        public final C8826c<T> f57683N;

        /* JADX INFO: renamed from: Q */
        public final bc0 f57684Q;

        /* JADX INFO: renamed from: X */
        public final AtomicInteger f57685X;

        /* JADX INFO: renamed from: Y */
        public T f57686Y;

        /* JADX INFO: renamed from: Z */
        public T f57687Z;

        public C8824a(ycg<? super Boolean> actual, int prefetch, l11<? super T, ? super T> comparer) {
            super(actual);
            this.f57681L = comparer;
            this.f57685X = new AtomicInteger();
            this.f57682M = new C8826c<>(this, prefetch);
            this.f57683N = new C8826c<>(this, prefetch);
            this.f57684Q = new bc0();
        }

        /* JADX INFO: renamed from: a */
        public void m16156a() {
            this.f57682M.cancel();
            this.f57682M.m16158a();
            this.f57683N.cancel();
            this.f57683N.m16158a();
        }

        /* JADX INFO: renamed from: b */
        public void m16157b(zjd<? extends T> source1, zjd<? extends T> source2) {
            source1.subscribe(this.f57682M);
            source2.subscribe(this.f57683N);
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f57682M.cancel();
            this.f57683N.cancel();
            this.f57684Q.tryTerminateAndReport();
            if (this.f57685X.getAndIncrement() == 0) {
                this.f57682M.m16158a();
                this.f57683N.m16158a();
            }
        }

        @Override // p000.li6.InterfaceC8825b
        public void drain() {
            if (this.f57685X.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                zif<T> zifVar = this.f57682M.f57692e;
                zif<T> zifVar2 = this.f57683N.f57692e;
                if (zifVar != null && zifVar2 != null) {
                    while (!isCancelled()) {
                        if (this.f57684Q.get() != null) {
                            m16156a();
                            this.f57684Q.tryTerminateConsumer(this.f49483a);
                            return;
                        }
                        boolean z = this.f57682M.f57693f;
                        T tPoll = this.f57686Y;
                        if (tPoll == null) {
                            try {
                                tPoll = zifVar.poll();
                                this.f57686Y = tPoll;
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                m16156a();
                                this.f57684Q.tryAddThrowableOrReport(th);
                                this.f57684Q.tryTerminateConsumer(this.f49483a);
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.f57683N.f57693f;
                        T tPoll2 = this.f57687Z;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = zifVar2.poll();
                                this.f57687Z = tPoll2;
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                m16156a();
                                this.f57684Q.tryAddThrowableOrReport(th2);
                                this.f57684Q.tryTerminateConsumer(this.f49483a);
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m16156a();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f57681L.test(tPoll, tPoll2)) {
                                    m16156a();
                                    complete(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f57686Y = null;
                                    this.f57687Z = null;
                                    this.f57682M.request();
                                    this.f57683N.request();
                                }
                            } catch (Throwable th3) {
                                o75.throwIfFatal(th3);
                                m16156a();
                                this.f57684Q.tryAddThrowableOrReport(th3);
                                this.f57684Q.tryTerminateConsumer(this.f49483a);
                                return;
                            }
                        }
                    }
                    this.f57682M.m16158a();
                    this.f57683N.m16158a();
                    return;
                }
                if (isCancelled()) {
                    this.f57682M.m16158a();
                    this.f57683N.m16158a();
                    return;
                } else if (this.f57684Q.get() != null) {
                    m16156a();
                    this.f57684Q.tryTerminateConsumer(this.f49483a);
                    return;
                }
                iAddAndGet = this.f57685X.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.li6.InterfaceC8825b
        public void innerError(Throwable t) {
            if (this.f57684Q.tryAddThrowableOrReport(t)) {
                drain();
            }
        }
    }

    /* JADX INFO: renamed from: li6$b */
    public interface InterfaceC8825b {
        void drain();

        void innerError(Throwable ex);
    }

    /* JADX INFO: renamed from: li6$c */
    public static final class C8826c<T> extends AtomicReference<fdg> implements kj6<T> {
        private static final long serialVersionUID = 4804128302091633067L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC8825b f57688a;

        /* JADX INFO: renamed from: b */
        public final int f57689b;

        /* JADX INFO: renamed from: c */
        public final int f57690c;

        /* JADX INFO: renamed from: d */
        public long f57691d;

        /* JADX INFO: renamed from: e */
        public volatile zif<T> f57692e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f57693f;

        /* JADX INFO: renamed from: m */
        public int f57694m;

        public C8826c(InterfaceC8825b parent, int prefetch) {
            this.f57688a = parent;
            this.f57690c = prefetch - (prefetch >> 2);
            this.f57689b = prefetch;
        }

        /* JADX INFO: renamed from: a */
        public void m16158a() {
            zif<T> zifVar = this.f57692e;
            if (zifVar != null) {
                zifVar.clear();
            }
        }

        public void cancel() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f57693f = true;
            this.f57688a.drain();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f57688a.innerError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f57694m != 0 || this.f57692e.offer(t)) {
                this.f57688a.drain();
            } else {
                onError(new bwa());
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f57694m = iRequestFusion;
                        this.f57692e = bodVar;
                        this.f57693f = true;
                        this.f57688a.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f57694m = iRequestFusion;
                        this.f57692e = bodVar;
                        s.request(this.f57689b);
                        return;
                    }
                }
                this.f57692e = new ozf(this.f57689b);
                s.request(this.f57689b);
            }
        }

        public void request() {
            if (this.f57694m != 1) {
                long j = this.f57691d + 1;
                if (j < this.f57690c) {
                    this.f57691d = j;
                } else {
                    this.f57691d = 0L;
                    get().request(j);
                }
            }
        }
    }

    public li6(zjd<? extends T> first, zjd<? extends T> second, l11<? super T, ? super T> comparer, int prefetch) {
        this.f57677b = first;
        this.f57678c = second;
        this.f57679d = comparer;
        this.f57680e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Boolean> s) {
        C8824a c8824a = new C8824a(s, this.f57680e, this.f57679d);
        s.onSubscribe(c8824a);
        c8824a.m16157b(this.f57677b, this.f57678c);
    }
}
