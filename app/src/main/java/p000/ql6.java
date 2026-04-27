package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ql6<T, B, V> extends AbstractC7714j1<T, l86<T>> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f74790c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super B, ? extends zjd<V>> f74791d;

    /* JADX INFO: renamed from: e */
    public final int f74792e;

    /* JADX INFO: renamed from: ql6$a */
    public static final class RunnableC11527a<T, B, V> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;

        /* JADX INFO: renamed from: M */
        public long f74797M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f74798N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f74799Q;

        /* JADX INFO: renamed from: X */
        public volatile boolean f74800X;

        /* JADX INFO: renamed from: Z */
        public fdg f74802Z;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f74803a;

        /* JADX INFO: renamed from: b */
        public final zjd<B> f74804b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super B, ? extends zjd<V>> f74805c;

        /* JADX INFO: renamed from: d */
        public final int f74806d;

        /* JADX INFO: renamed from: C */
        public final tif<Object> f74793C = new t1b();

        /* JADX INFO: renamed from: e */
        public final mm2 f74807e = new mm2();

        /* JADX INFO: renamed from: m */
        public final List<nsh<T>> f74809m = new ArrayList();

        /* JADX INFO: renamed from: F */
        public final AtomicLong f74794F = new AtomicLong(1);

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f74795H = new AtomicBoolean();

        /* JADX INFO: renamed from: Y */
        public final bc0 f74801Y = new bc0();

        /* JADX INFO: renamed from: f */
        public final c<B> f74808f = new c<>(this);

        /* JADX INFO: renamed from: L */
        public final AtomicLong f74796L = new AtomicLong();

        /* JADX INFO: renamed from: ql6$a$a */
        public static final class a<T, V> extends l86<T> implements kj6<V>, lf4 {

            /* JADX INFO: renamed from: b */
            public final RunnableC11527a<T, ?, V> f74810b;

            /* JADX INFO: renamed from: c */
            public final nsh<T> f74811c;

            /* JADX INFO: renamed from: d */
            public final AtomicReference<fdg> f74812d = new AtomicReference<>();

            /* JADX INFO: renamed from: e */
            public final AtomicBoolean f74813e = new AtomicBoolean();

            public a(RunnableC11527a<T, ?, V> parent, nsh<T> window) {
                this.f74810b = parent;
                this.f74811c = window;
            }

            /* JADX INFO: renamed from: b */
            public boolean m20428b() {
                return !this.f74813e.get() && this.f74813e.compareAndSet(false, true);
            }

            @Override // p000.lf4
            public void dispose() {
                ldg.cancel(this.f74812d);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return this.f74812d.get() == ldg.CANCELLED;
            }

            @Override // p000.ycg
            public void onComplete() {
                this.f74810b.m20421a(this);
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                if (isDisposed()) {
                    ofe.onError(t);
                } else {
                    this.f74810b.m20422b(t);
                }
            }

            @Override // p000.ycg
            public void onNext(V t) {
                if (ldg.cancel(this.f74812d)) {
                    this.f74810b.m20421a(this);
                }
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                if (ldg.setOnce(this.f74812d, s)) {
                    s.request(Long.MAX_VALUE);
                }
            }

            @Override // p000.l86
            public void subscribeActual(ycg<? super T> s) {
                this.f74811c.subscribe(s);
                this.f74813e.set(true);
            }
        }

        /* JADX INFO: renamed from: ql6$a$b */
        public static final class b<B> {

            /* JADX INFO: renamed from: a */
            public final B f74814a;

            public b(B item) {
                this.f74814a = item;
            }
        }

        /* JADX INFO: renamed from: ql6$a$c */
        public static final class c<B> extends AtomicReference<fdg> implements kj6<B> {
            private static final long serialVersionUID = -3326496781427702834L;

            /* JADX INFO: renamed from: a */
            public final RunnableC11527a<?, B, ?> f74815a;

            public c(RunnableC11527a<?, B, ?> parent) {
                this.f74815a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m20429a() {
                ldg.cancel(this);
            }

            @Override // p000.ycg
            public void onComplete() {
                this.f74815a.m20425e();
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                this.f74815a.m20426f(t);
            }

            @Override // p000.ycg
            public void onNext(B t) {
                this.f74815a.m20424d(t);
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                if (ldg.setOnce(this, s)) {
                    s.request(Long.MAX_VALUE);
                }
            }
        }

        public RunnableC11527a(ycg<? super l86<T>> actual, zjd<B> open, sy6<? super B, ? extends zjd<V>> closingIndicator, int bufferSize) {
            this.f74803a = actual;
            this.f74804b = open;
            this.f74805c = closingIndicator;
            this.f74806d = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public void m20421a(a<T, V> what) {
            this.f74793C.offer(what);
            m20423c();
        }

        /* JADX INFO: renamed from: b */
        public void m20422b(Throwable t) {
            this.f74802Z.cancel();
            this.f74808f.m20429a();
            this.f74807e.dispose();
            if (this.f74801Y.tryAddThrowableOrReport(t)) {
                this.f74799Q = true;
                m20423c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public void m20423c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super l86<T>> ycgVar = this.f74803a;
            tif<Object> tifVar = this.f74793C;
            List<nsh<T>> list = this.f74809m;
            int iAddAndGet = 1;
            while (true) {
                if (this.f74798N) {
                    tifVar.clear();
                    list.clear();
                } else {
                    boolean z = this.f74799Q;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && (z2 || this.f74801Y.get() != null)) {
                        m20427g(ycgVar);
                        this.f74798N = true;
                    } else if (z2) {
                        if (this.f74800X && list.size() == 0) {
                            this.f74802Z.cancel();
                            this.f74808f.m20429a();
                            this.f74807e.dispose();
                            m20427g(ycgVar);
                            this.f74798N = true;
                        }
                    } else if (objPoll instanceof b) {
                        if (!this.f74795H.get()) {
                            long j = this.f74797M;
                            if (this.f74796L.get() != j) {
                                this.f74797M = j + 1;
                                try {
                                    zjd<V> zjdVarApply = this.f74805c.apply(((b) objPoll).f74814a);
                                    Objects.requireNonNull(zjdVarApply, "The closingIndicator returned a null Publisher");
                                    zjd<V> zjdVar = zjdVarApply;
                                    this.f74794F.getAndIncrement();
                                    nsh<T> nshVarCreate = nsh.create(this.f74806d, this);
                                    a aVar = new a(this, nshVarCreate);
                                    ycgVar.onNext(aVar);
                                    if (aVar.m20428b()) {
                                        nshVarCreate.onComplete();
                                    } else {
                                        list.add(nshVarCreate);
                                        this.f74807e.add(aVar);
                                        zjdVar.subscribe(aVar);
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    this.f74802Z.cancel();
                                    this.f74808f.m20429a();
                                    this.f74807e.dispose();
                                    o75.throwIfFatal(th);
                                    this.f74801Y.tryAddThrowableOrReport(th);
                                    this.f74799Q = true;
                                }
                            } else {
                                this.f74802Z.cancel();
                                this.f74808f.m20429a();
                                this.f74807e.dispose();
                                this.f74801Y.tryAddThrowableOrReport(new bwa(ul6.m23410b(j)));
                                this.f74799Q = true;
                            }
                        }
                    } else if (objPoll instanceof a) {
                        nsh<T> nshVar = ((a) objPoll).f74811c;
                        list.remove(nshVar);
                        this.f74807e.delete((lf4) objPoll);
                        nshVar.onComplete();
                    } else {
                        Iterator<nsh<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f74795H.compareAndSet(false, true)) {
                if (this.f74794F.decrementAndGet() != 0) {
                    this.f74808f.m20429a();
                    return;
                }
                this.f74802Z.cancel();
                this.f74808f.m20429a();
                this.f74807e.dispose();
                this.f74801Y.tryTerminateAndReport();
                this.f74798N = true;
                m20423c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m20424d(B startValue) {
            this.f74793C.offer(new b(startValue));
            m20423c();
        }

        /* JADX INFO: renamed from: e */
        public void m20425e() {
            this.f74800X = true;
            m20423c();
        }

        /* JADX INFO: renamed from: f */
        public void m20426f(Throwable t) {
            this.f74802Z.cancel();
            this.f74807e.dispose();
            if (this.f74801Y.tryAddThrowableOrReport(t)) {
                this.f74799Q = true;
                m20423c();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m20427g(ycg<?> downstream) {
            Throwable thTerminate = this.f74801Y.terminate();
            if (thTerminate == null) {
                Iterator<nsh<T>> it = this.f74809m.iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                downstream.onComplete();
                return;
            }
            if (thTerminate != k75.f52721a) {
                Iterator<nsh<T>> it2 = this.f74809m.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(thTerminate);
                }
                downstream.onError(thTerminate);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f74808f.m20429a();
            this.f74807e.dispose();
            this.f74799Q = true;
            m20423c();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f74808f.m20429a();
            this.f74807e.dispose();
            if (this.f74801Y.tryAddThrowableOrReport(t)) {
                this.f74799Q = true;
                m20423c();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f74793C.offer(t);
            m20423c();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f74802Z, s)) {
                this.f74802Z = s;
                this.f74803a.onSubscribe(this);
                this.f74804b.subscribe(this.f74808f);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f74796L, n);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f74794F.decrementAndGet() == 0) {
                this.f74802Z.cancel();
                this.f74808f.m20429a();
                this.f74807e.dispose();
                this.f74801Y.tryTerminateAndReport();
                this.f74798N = true;
                m20423c();
            }
        }
    }

    public ql6(l86<T> source, zjd<B> open, sy6<? super B, ? extends zjd<V>> closingIndicator, int bufferSize) {
        super(source);
        this.f74790c = open;
        this.f74791d = closingIndicator;
        this.f74792e = bufferSize;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super l86<T>> s) {
        this.f49321b.subscribe((kj6) new RunnableC11527a(s, this.f74790c, this.f74791d, this.f74792e));
    }
}
