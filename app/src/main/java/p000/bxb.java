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
public final class bxb<T, B, V> extends AbstractC9666n3<T, vkb<T>> {

    /* JADX INFO: renamed from: b */
    public final wub<B> f15144b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super B, ? extends wub<V>> f15145c;

    /* JADX INFO: renamed from: d */
    public final int f15146d;

    /* JADX INFO: renamed from: bxb$a */
    public static final class RunnableC2096a<T, B, V> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;

        /* JADX INFO: renamed from: M */
        public long f15151M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f15152N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f15153Q;

        /* JADX INFO: renamed from: X */
        public volatile boolean f15154X;

        /* JADX INFO: renamed from: Z */
        public lf4 f15156Z;

        /* JADX INFO: renamed from: a */
        public final pxb<? super vkb<T>> f15157a;

        /* JADX INFO: renamed from: b */
        public final wub<B> f15158b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super B, ? extends wub<V>> f15159c;

        /* JADX INFO: renamed from: d */
        public final int f15160d;

        /* JADX INFO: renamed from: C */
        public final tif<Object> f15147C = new t1b();

        /* JADX INFO: renamed from: e */
        public final mm2 f15161e = new mm2();

        /* JADX INFO: renamed from: m */
        public final List<osh<T>> f15163m = new ArrayList();

        /* JADX INFO: renamed from: F */
        public final AtomicLong f15148F = new AtomicLong(1);

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f15149H = new AtomicBoolean();

        /* JADX INFO: renamed from: Y */
        public final bc0 f15155Y = new bc0();

        /* JADX INFO: renamed from: f */
        public final c<B> f15162f = new c<>(this);

        /* JADX INFO: renamed from: L */
        public final AtomicLong f15150L = new AtomicLong();

        /* JADX INFO: renamed from: bxb$a$a */
        public static final class a<T, V> extends vkb<T> implements pxb<V>, lf4 {

            /* JADX INFO: renamed from: a */
            public final RunnableC2096a<T, ?, V> f15164a;

            /* JADX INFO: renamed from: b */
            public final osh<T> f15165b;

            /* JADX INFO: renamed from: c */
            public final AtomicReference<lf4> f15166c = new AtomicReference<>();

            /* JADX INFO: renamed from: d */
            public final AtomicBoolean f15167d = new AtomicBoolean();

            public a(RunnableC2096a<T, ?, V> parent, osh<T> window) {
                this.f15164a = parent;
                this.f15165b = window;
            }

            /* JADX INFO: renamed from: a */
            public boolean m3481a() {
                return !this.f15167d.get() && this.f15167d.compareAndSet(false, true);
            }

            @Override // p000.lf4
            public void dispose() {
                zf4.dispose(this.f15166c);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return this.f15166c.get() == zf4.DISPOSED;
            }

            @Override // p000.pxb
            public void onComplete() {
                this.f15164a.m3474a(this);
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                if (isDisposed()) {
                    ofe.onError(t);
                } else {
                    this.f15164a.m3475b(t);
                }
            }

            @Override // p000.pxb
            public void onNext(V t) {
                if (zf4.dispose(this.f15166c)) {
                    this.f15164a.m3474a(this);
                }
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this.f15166c, d);
            }

            @Override // p000.vkb
            public void subscribeActual(pxb<? super T> o) {
                this.f15165b.subscribe(o);
                this.f15167d.set(true);
            }
        }

        /* JADX INFO: renamed from: bxb$a$b */
        public static final class b<B> {

            /* JADX INFO: renamed from: a */
            public final B f15168a;

            public b(B item) {
                this.f15168a = item;
            }
        }

        /* JADX INFO: renamed from: bxb$a$c */
        public static final class c<B> extends AtomicReference<lf4> implements pxb<B> {
            private static final long serialVersionUID = -3326496781427702834L;

            /* JADX INFO: renamed from: a */
            public final RunnableC2096a<?, B, ?> f15169a;

            public c(RunnableC2096a<?, B, ?> parent) {
                this.f15169a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m3482a() {
                zf4.dispose(this);
            }

            @Override // p000.pxb
            public void onComplete() {
                this.f15169a.m3478e();
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                this.f15169a.m3479f(t);
            }

            @Override // p000.pxb
            public void onNext(B t) {
                this.f15169a.m3477d(t);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public RunnableC2096a(pxb<? super vkb<T>> downstream, wub<B> open, sy6<? super B, ? extends wub<V>> closingIndicator, int bufferSize) {
            this.f15157a = downstream;
            this.f15158b = open;
            this.f15159c = closingIndicator;
            this.f15160d = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public void m3474a(a<T, V> what) {
            this.f15147C.offer(what);
            m3476c();
        }

        /* JADX INFO: renamed from: b */
        public void m3475b(Throwable t) {
            this.f15156Z.dispose();
            this.f15162f.m3482a();
            this.f15161e.dispose();
            if (this.f15155Y.tryAddThrowableOrReport(t)) {
                this.f15153Q = true;
                m3476c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public void m3476c() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super vkb<T>> pxbVar = this.f15157a;
            tif<Object> tifVar = this.f15147C;
            List<osh<T>> list = this.f15163m;
            int iAddAndGet = 1;
            while (true) {
                if (this.f15152N) {
                    tifVar.clear();
                    list.clear();
                } else {
                    boolean z = this.f15153Q;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && (z2 || this.f15155Y.get() != null)) {
                        m3480g(pxbVar);
                        this.f15152N = true;
                    } else if (z2) {
                        if (this.f15154X && list.size() == 0) {
                            this.f15156Z.dispose();
                            this.f15162f.m3482a();
                            this.f15161e.dispose();
                            m3480g(pxbVar);
                            this.f15152N = true;
                        }
                    } else if (objPoll instanceof b) {
                        if (!this.f15149H.get()) {
                            try {
                                wub<V> wubVarApply = this.f15159c.apply(((b) objPoll).f15168a);
                                Objects.requireNonNull(wubVarApply, "The closingIndicator returned a null ObservableSource");
                                wub<V> wubVar = wubVarApply;
                                this.f15148F.getAndIncrement();
                                osh<T> oshVarCreate = osh.create(this.f15160d, this);
                                a aVar = new a(this, oshVarCreate);
                                pxbVar.onNext(aVar);
                                if (aVar.m3481a()) {
                                    oshVarCreate.onComplete();
                                } else {
                                    list.add(oshVarCreate);
                                    this.f15161e.add(aVar);
                                    wubVar.subscribe(aVar);
                                }
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                this.f15156Z.dispose();
                                this.f15162f.m3482a();
                                this.f15161e.dispose();
                                o75.throwIfFatal(th);
                                this.f15155Y.tryAddThrowableOrReport(th);
                                this.f15153Q = true;
                            }
                        }
                    } else if (objPoll instanceof a) {
                        osh<T> oshVar = ((a) objPoll).f15165b;
                        list.remove(oshVar);
                        this.f15161e.delete((lf4) objPoll);
                        oshVar.onComplete();
                    } else {
                        Iterator<osh<T>> it = list.iterator();
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

        /* JADX INFO: renamed from: d */
        public void m3477d(B startValue) {
            this.f15147C.offer(new b(startValue));
            m3476c();
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f15149H.compareAndSet(false, true)) {
                if (this.f15148F.decrementAndGet() != 0) {
                    this.f15162f.m3482a();
                    return;
                }
                this.f15156Z.dispose();
                this.f15162f.m3482a();
                this.f15161e.dispose();
                this.f15155Y.tryTerminateAndReport();
                this.f15152N = true;
                m3476c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3478e() {
            this.f15154X = true;
            m3476c();
        }

        /* JADX INFO: renamed from: f */
        public void m3479f(Throwable t) {
            this.f15156Z.dispose();
            this.f15161e.dispose();
            if (this.f15155Y.tryAddThrowableOrReport(t)) {
                this.f15153Q = true;
                m3476c();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3480g(pxb<?> downstream) {
            Throwable thTerminate = this.f15155Y.terminate();
            if (thTerminate == null) {
                Iterator<osh<T>> it = this.f15163m.iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                downstream.onComplete();
                return;
            }
            if (thTerminate != k75.f52721a) {
                Iterator<osh<T>> it2 = this.f15163m.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(thTerminate);
                }
                downstream.onError(thTerminate);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f15149H.get();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f15162f.m3482a();
            this.f15161e.dispose();
            this.f15153Q = true;
            m3476c();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f15162f.m3482a();
            this.f15161e.dispose();
            if (this.f15155Y.tryAddThrowableOrReport(t)) {
                this.f15153Q = true;
                m3476c();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f15147C.offer(t);
            m3476c();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f15156Z, d)) {
                this.f15156Z = d;
                this.f15157a.onSubscribe(this);
                this.f15158b.subscribe(this.f15162f);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15148F.decrementAndGet() == 0) {
                this.f15156Z.dispose();
                this.f15162f.m3482a();
                this.f15161e.dispose();
                this.f15155Y.tryTerminateAndReport();
                this.f15152N = true;
                m3476c();
            }
        }
    }

    public bxb(wub<T> source, wub<B> open, sy6<? super B, ? extends wub<V>> closingIndicator, int bufferSize) {
        super(source);
        this.f15144b = open;
        this.f15145c = closingIndicator;
        this.f15146d = bufferSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super vkb<T>> t) {
        this.f63101a.subscribe(new RunnableC2096a(t, this.f15144b, this.f15145c, this.f15146d));
    }
}
