package p000;

import java.util.concurrent.atomic.AtomicInteger;
import p000.li6;

/* JADX INFO: loaded from: classes7.dex */
public final class ni6<T> extends kjf<Boolean> implements u07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f64657a;

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f64658b;

    /* JADX INFO: renamed from: c */
    public final l11<? super T, ? super T> f64659c;

    /* JADX INFO: renamed from: d */
    public final int f64660d;

    /* JADX INFO: renamed from: ni6$a */
    public static final class C9891a<T> extends AtomicInteger implements lf4, li6.InterfaceC8825b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f64661a;

        /* JADX INFO: renamed from: b */
        public final l11<? super T, ? super T> f64662b;

        /* JADX INFO: renamed from: c */
        public final li6.C8826c<T> f64663c;

        /* JADX INFO: renamed from: d */
        public final li6.C8826c<T> f64664d;

        /* JADX INFO: renamed from: e */
        public final bc0 f64665e = new bc0();

        /* JADX INFO: renamed from: f */
        public T f64666f;

        /* JADX INFO: renamed from: m */
        public T f64667m;

        public C9891a(hnf<? super Boolean> actual, int prefetch, l11<? super T, ? super T> comparer) {
            this.f64661a = actual;
            this.f64662b = comparer;
            this.f64663c = new li6.C8826c<>(this, prefetch);
            this.f64664d = new li6.C8826c<>(this, prefetch);
        }

        /* JADX INFO: renamed from: a */
        public void m17963a() {
            this.f64663c.cancel();
            this.f64663c.m16158a();
            this.f64664d.cancel();
            this.f64664d.m16158a();
        }

        /* JADX INFO: renamed from: b */
        public void m17964b(zjd<? extends T> source1, zjd<? extends T> source2) {
            source1.subscribe(this.f64663c);
            source2.subscribe(this.f64664d);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f64663c.cancel();
            this.f64664d.cancel();
            this.f64665e.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f64663c.m16158a();
                this.f64664d.m16158a();
            }
        }

        @Override // p000.li6.InterfaceC8825b
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                zif<T> zifVar = this.f64663c.f57692e;
                zif<T> zifVar2 = this.f64664d.f57692e;
                if (zifVar != null && zifVar2 != null) {
                    while (!isDisposed()) {
                        if (this.f64665e.get() != null) {
                            m17963a();
                            this.f64665e.tryTerminateConsumer(this.f64661a);
                            return;
                        }
                        boolean z = this.f64663c.f57693f;
                        T tPoll = this.f64666f;
                        if (tPoll == null) {
                            try {
                                tPoll = zifVar.poll();
                                this.f64666f = tPoll;
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                m17963a();
                                this.f64665e.tryAddThrowableOrReport(th);
                                this.f64665e.tryTerminateConsumer(this.f64661a);
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.f64664d.f57693f;
                        T tPoll2 = this.f64667m;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = zifVar2.poll();
                                this.f64667m = tPoll2;
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                m17963a();
                                this.f64665e.tryAddThrowableOrReport(th2);
                                this.f64665e.tryTerminateConsumer(this.f64661a);
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            this.f64661a.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m17963a();
                            this.f64661a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f64662b.test(tPoll, tPoll2)) {
                                    m17963a();
                                    this.f64661a.onSuccess(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f64666f = null;
                                    this.f64667m = null;
                                    this.f64663c.request();
                                    this.f64664d.request();
                                }
                            } catch (Throwable th3) {
                                o75.throwIfFatal(th3);
                                m17963a();
                                this.f64665e.tryAddThrowableOrReport(th3);
                                this.f64665e.tryTerminateConsumer(this.f64661a);
                                return;
                            }
                        }
                    }
                    this.f64663c.m16158a();
                    this.f64664d.m16158a();
                    return;
                }
                if (isDisposed()) {
                    this.f64663c.m16158a();
                    this.f64664d.m16158a();
                    return;
                } else if (this.f64665e.get() != null) {
                    m17963a();
                    this.f64665e.tryTerminateConsumer(this.f64661a);
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.li6.InterfaceC8825b
        public void innerError(Throwable t) {
            if (this.f64665e.tryAddThrowableOrReport(t)) {
                drain();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f64663c.get() == ldg.CANCELLED;
        }
    }

    public ni6(zjd<? extends T> first, zjd<? extends T> second, l11<? super T, ? super T> comparer, int prefetch) {
        this.f64657a = first;
        this.f64658b = second;
        this.f64659c = comparer;
        this.f64660d = prefetch;
    }

    @Override // p000.u07
    public l86<Boolean> fuseToFlowable() {
        return ofe.onAssembly(new li6(this.f64657a, this.f64658b, this.f64659c, this.f64660d));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        C9891a c9891a = new C9891a(observer, this.f64660d, this.f64659c);
        observer.onSubscribe(c9891a);
        c9891a.m17964b(this.f64657a, this.f64658b);
    }
}
