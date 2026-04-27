package p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class fxb<T> extends AbstractC9666n3<T, vkb<T>> {

    /* JADX INFO: renamed from: C */
    public final boolean f37945C;

    /* JADX INFO: renamed from: b */
    public final long f37946b;

    /* JADX INFO: renamed from: c */
    public final long f37947c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f37948d;

    /* JADX INFO: renamed from: e */
    public final woe f37949e;

    /* JADX INFO: renamed from: f */
    public final long f37950f;

    /* JADX INFO: renamed from: m */
    public final int f37951m;

    /* JADX INFO: renamed from: fxb$a */
    public static abstract class AbstractC6027a<T> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 5724293814035355511L;

        /* JADX INFO: renamed from: C */
        public Throwable f37952C;

        /* JADX INFO: renamed from: F */
        public lf4 f37953F;

        /* JADX INFO: renamed from: L */
        public volatile boolean f37955L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super vkb<T>> f37957a;

        /* JADX INFO: renamed from: c */
        public final long f37959c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f37960d;

        /* JADX INFO: renamed from: e */
        public final int f37961e;

        /* JADX INFO: renamed from: f */
        public long f37962f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f37963m;

        /* JADX INFO: renamed from: b */
        public final tif<Object> f37958b = new t1b();

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f37954H = new AtomicBoolean();

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f37956M = new AtomicInteger(1);

        public AbstractC6027a(pxb<? super vkb<T>> downstream, long timespan, TimeUnit unit, int bufferSize) {
            this.f37957a = downstream;
            this.f37959c = timespan;
            this.f37960d = unit;
            this.f37961e = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo11219a();

        /* JADX INFO: renamed from: b */
        public abstract void mo11220b();

        /* JADX INFO: renamed from: c */
        public abstract void mo11221c();

        /* JADX INFO: renamed from: d */
        public final void m11222d() {
            if (this.f37956M.decrementAndGet() == 0) {
                mo11219a();
                this.f37953F.dispose();
                this.f37955L = true;
                mo11221c();
            }
        }

        @Override // p000.lf4
        public final void dispose() {
            if (this.f37954H.compareAndSet(false, true)) {
                m11222d();
            }
        }

        @Override // p000.lf4
        public final boolean isDisposed() {
            return this.f37954H.get();
        }

        @Override // p000.pxb
        public final void onComplete() {
            this.f37963m = true;
            mo11221c();
        }

        @Override // p000.pxb
        public final void onError(Throwable t) {
            this.f37952C = t;
            this.f37963m = true;
            mo11221c();
        }

        @Override // p000.pxb
        public final void onNext(T t) {
            this.f37958b.offer(t);
            mo11221c();
        }

        @Override // p000.pxb
        public final void onSubscribe(lf4 d) {
            if (zf4.validate(this.f37953F, d)) {
                this.f37953F = d;
                this.f37957a.onSubscribe(this);
                mo11220b();
            }
        }
    }

    /* JADX INFO: renamed from: fxb$b */
    public static final class RunnableC6028b<T> extends AbstractC6027a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;

        /* JADX INFO: renamed from: M1 */
        public osh<T> f37964M1;

        /* JADX INFO: renamed from: N */
        public final woe f37965N;

        /* JADX INFO: renamed from: Q */
        public final boolean f37966Q;

        /* JADX INFO: renamed from: V1 */
        public final a0f f37967V1;

        /* JADX INFO: renamed from: X */
        public final long f37968X;

        /* JADX INFO: renamed from: Y */
        public final woe.AbstractC14729c f37969Y;

        /* JADX INFO: renamed from: Z */
        public long f37970Z;

        /* JADX INFO: renamed from: fxb$b$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final RunnableC6028b<?> f37971a;

            /* JADX INFO: renamed from: b */
            public final long f37972b;

            public a(RunnableC6028b<?> parent, long index) {
                this.f37971a = parent;
                this.f37972b = index;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37971a.m11223e(this);
            }
        }

        public RunnableC6028b(pxb<? super vkb<T>> actual, long timespan, TimeUnit unit, woe scheduler, int bufferSize, long maxSize, boolean restartTimerOnMaxSize) {
            super(actual, timespan, unit, bufferSize);
            this.f37965N = scheduler;
            this.f37968X = maxSize;
            this.f37966Q = restartTimerOnMaxSize;
            if (restartTimerOnMaxSize) {
                this.f37969Y = scheduler.createWorker();
            } else {
                this.f37969Y = null;
            }
            this.f37967V1 = new a0f();
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: a */
        public void mo11219a() {
            this.f37967V1.dispose();
            woe.AbstractC14729c abstractC14729c = this.f37969Y;
            if (abstractC14729c != null) {
                abstractC14729c.dispose();
            }
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: b */
        public void mo11220b() {
            if (this.f37954H.get()) {
                return;
            }
            this.f37962f = 1L;
            this.f37956M.getAndIncrement();
            osh<T> oshVarCreate = osh.create(this.f37961e, this);
            this.f37964M1 = oshVarCreate;
            dxb dxbVar = new dxb(oshVarCreate);
            this.f37957a.onNext(dxbVar);
            a aVar = new a(this, 1L);
            if (this.f37966Q) {
                a0f a0fVar = this.f37967V1;
                woe.AbstractC14729c abstractC14729c = this.f37969Y;
                long j = this.f37959c;
                a0fVar.replace(abstractC14729c.schedulePeriodically(aVar, j, j, this.f37960d));
            } else {
                a0f a0fVar2 = this.f37967V1;
                woe woeVar = this.f37965N;
                long j2 = this.f37959c;
                a0fVar2.replace(woeVar.schedulePeriodicallyDirect(aVar, j2, j2, this.f37960d));
            }
            if (dxbVar.m9520a()) {
                this.f37964M1.onComplete();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: c */
        public void mo11221c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f37958b;
            pxb<? super vkb<T>> pxbVar = this.f37957a;
            osh<T> oshVarM11224f = this.f37964M1;
            int iAddAndGet = 1;
            while (true) {
                if (this.f37955L) {
                    tifVar.clear();
                    oshVarM11224f = 0;
                    this.f37964M1 = null;
                } else {
                    boolean z = this.f37963m;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f37952C;
                        if (th != null) {
                            if (oshVarM11224f != 0) {
                                oshVarM11224f.onError(th);
                            }
                            pxbVar.onError(th);
                        } else {
                            if (oshVarM11224f != 0) {
                                oshVarM11224f.onComplete();
                            }
                            pxbVar.onComplete();
                        }
                        mo11219a();
                        this.f37955L = true;
                    } else if (!z2) {
                        if (objPoll instanceof a) {
                            if (((a) objPoll).f37972b == this.f37962f || !this.f37966Q) {
                                this.f37970Z = 0L;
                                oshVarM11224f = m11224f(oshVarM11224f);
                            }
                        } else if (oshVarM11224f != 0) {
                            oshVarM11224f.onNext(objPoll);
                            long j = this.f37970Z + 1;
                            if (j == this.f37968X) {
                                this.f37970Z = 0L;
                                oshVarM11224f = m11224f(oshVarM11224f);
                            } else {
                                this.f37970Z = j;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m11223e(a sender) {
            this.f37958b.offer(sender);
            mo11221c();
        }

        /* JADX INFO: renamed from: f */
        public osh<T> m11224f(osh<T> window) {
            if (window != null) {
                window.onComplete();
                window = null;
            }
            if (this.f37954H.get()) {
                mo11219a();
            } else {
                long j = this.f37962f + 1;
                this.f37962f = j;
                this.f37956M.getAndIncrement();
                window = osh.create(this.f37961e, this);
                this.f37964M1 = window;
                dxb dxbVar = new dxb(window);
                this.f37957a.onNext(dxbVar);
                if (this.f37966Q) {
                    a0f a0fVar = this.f37967V1;
                    woe.AbstractC14729c abstractC14729c = this.f37969Y;
                    a aVar = new a(this, j);
                    long j2 = this.f37959c;
                    a0fVar.update(abstractC14729c.schedulePeriodically(aVar, j2, j2, this.f37960d));
                }
                if (dxbVar.m9520a()) {
                    window.onComplete();
                }
            }
            return window;
        }

        @Override // java.lang.Runnable
        public void run() {
            m11222d();
        }
    }

    /* JADX INFO: renamed from: fxb$c */
    public static final class RunnableC6029c<T> extends AbstractC6027a<T> implements Runnable {

        /* JADX INFO: renamed from: Z */
        public static final Object f37973Z = new Object();
        private static final long serialVersionUID = 1155822639622580836L;

        /* JADX INFO: renamed from: N */
        public final woe f37974N;

        /* JADX INFO: renamed from: Q */
        public osh<T> f37975Q;

        /* JADX INFO: renamed from: X */
        public final a0f f37976X;

        /* JADX INFO: renamed from: Y */
        public final Runnable f37977Y;

        /* JADX INFO: renamed from: fxb$c$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC6029c.this.m11222d();
            }
        }

        public RunnableC6029c(pxb<? super vkb<T>> actual, long timespan, TimeUnit unit, woe scheduler, int bufferSize) {
            super(actual, timespan, unit, bufferSize);
            this.f37974N = scheduler;
            this.f37976X = new a0f();
            this.f37977Y = new a();
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: a */
        public void mo11219a() {
            this.f37976X.dispose();
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: b */
        public void mo11220b() {
            if (this.f37954H.get()) {
                return;
            }
            this.f37956M.getAndIncrement();
            osh<T> oshVarCreate = osh.create(this.f37961e, this.f37977Y);
            this.f37975Q = oshVarCreate;
            this.f37962f = 1L;
            dxb dxbVar = new dxb(oshVarCreate);
            this.f37957a.onNext(dxbVar);
            a0f a0fVar = this.f37976X;
            woe woeVar = this.f37974N;
            long j = this.f37959c;
            a0fVar.replace(woeVar.schedulePeriodicallyDirect(this, j, j, this.f37960d));
            if (dxbVar.m9520a()) {
                this.f37975Q.onComplete();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [osh] */
        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: c */
        public void mo11221c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f37958b;
            pxb<? super vkb<T>> pxbVar = this.f37957a;
            osh oshVar = (osh<T>) this.f37975Q;
            int iAddAndGet = 1;
            while (true) {
                if (this.f37955L) {
                    tifVar.clear();
                    this.f37975Q = null;
                    oshVar = (osh<T>) null;
                } else {
                    boolean z = this.f37963m;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f37952C;
                        if (th != null) {
                            if (oshVar != null) {
                                oshVar.onError(th);
                            }
                            pxbVar.onError(th);
                        } else {
                            if (oshVar != null) {
                                oshVar.onComplete();
                            }
                            pxbVar.onComplete();
                        }
                        mo11219a();
                        this.f37955L = true;
                    } else if (!z2) {
                        if (objPoll == f37973Z) {
                            if (oshVar != null) {
                                oshVar.onComplete();
                                this.f37975Q = null;
                                oshVar = (osh<T>) null;
                            }
                            if (this.f37954H.get()) {
                                this.f37976X.dispose();
                            } else {
                                this.f37962f++;
                                this.f37956M.getAndIncrement();
                                oshVar = (osh<T>) osh.create(this.f37961e, this.f37977Y);
                                this.f37975Q = oshVar;
                                dxb dxbVar = new dxb(oshVar);
                                pxbVar.onNext(dxbVar);
                                if (dxbVar.m9520a()) {
                                    oshVar.onComplete();
                                }
                            }
                        } else if (oshVar != null) {
                            oshVar.onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37958b.offer(f37973Z);
            mo11221c();
        }
    }

    /* JADX INFO: renamed from: fxb$d */
    public static final class RunnableC6030d<T> extends AbstractC6027a<T> implements Runnable {

        /* JADX INFO: renamed from: Y */
        public static final Object f37979Y = new Object();

        /* JADX INFO: renamed from: Z */
        public static final Object f37980Z = new Object();
        private static final long serialVersionUID = -7852870764194095894L;

        /* JADX INFO: renamed from: N */
        public final long f37981N;

        /* JADX INFO: renamed from: Q */
        public final woe.AbstractC14729c f37982Q;

        /* JADX INFO: renamed from: X */
        public final List<osh<T>> f37983X;

        /* JADX INFO: renamed from: fxb$d$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final RunnableC6030d<?> f37984a;

            /* JADX INFO: renamed from: b */
            public final boolean f37985b;

            public a(RunnableC6030d<?> parent, boolean isOpen) {
                this.f37984a = parent;
                this.f37985b = isOpen;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37984a.m11225e(this.f37985b);
            }
        }

        public RunnableC6030d(pxb<? super vkb<T>> actual, long timespan, long timeskip, TimeUnit unit, woe.AbstractC14729c worker, int bufferSize) {
            super(actual, timespan, unit, bufferSize);
            this.f37981N = timeskip;
            this.f37982Q = worker;
            this.f37983X = new LinkedList();
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: a */
        public void mo11219a() {
            this.f37982Q.dispose();
        }

        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: b */
        public void mo11220b() {
            if (this.f37954H.get()) {
                return;
            }
            this.f37962f = 1L;
            this.f37956M.getAndIncrement();
            osh<T> oshVarCreate = osh.create(this.f37961e, this);
            this.f37983X.add(oshVarCreate);
            dxb dxbVar = new dxb(oshVarCreate);
            this.f37957a.onNext(dxbVar);
            this.f37982Q.schedule(new a(this, false), this.f37959c, this.f37960d);
            woe.AbstractC14729c abstractC14729c = this.f37982Q;
            a aVar = new a(this, true);
            long j = this.f37981N;
            abstractC14729c.schedulePeriodically(aVar, j, j, this.f37960d);
            if (dxbVar.m9520a()) {
                oshVarCreate.onComplete();
                this.f37983X.remove(oshVarCreate);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.fxb.AbstractC6027a
        /* JADX INFO: renamed from: c */
        public void mo11221c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f37958b;
            pxb<? super vkb<T>> pxbVar = this.f37957a;
            List<osh<T>> list = this.f37983X;
            int iAddAndGet = 1;
            while (true) {
                if (this.f37955L) {
                    tifVar.clear();
                    list.clear();
                } else {
                    boolean z = this.f37963m;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f37952C;
                        if (th != null) {
                            Iterator<osh<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onError(th);
                            }
                            pxbVar.onError(th);
                        } else {
                            Iterator<osh<T>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onComplete();
                            }
                            pxbVar.onComplete();
                        }
                        mo11219a();
                        this.f37955L = true;
                    } else if (!z2) {
                        if (objPoll == f37979Y) {
                            if (!this.f37954H.get()) {
                                this.f37962f++;
                                this.f37956M.getAndIncrement();
                                osh<T> oshVarCreate = osh.create(this.f37961e, this);
                                list.add(oshVarCreate);
                                dxb dxbVar = new dxb(oshVarCreate);
                                pxbVar.onNext(dxbVar);
                                this.f37982Q.schedule(new a(this, false), this.f37959c, this.f37960d);
                                if (dxbVar.m9520a()) {
                                    oshVarCreate.onComplete();
                                }
                            }
                        } else if (objPoll != f37980Z) {
                            Iterator<osh<T>> it3 = list.iterator();
                            while (it3.hasNext()) {
                                it3.next().onNext(objPoll);
                            }
                        } else if (!list.isEmpty()) {
                            list.remove(0).onComplete();
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m11225e(boolean isOpen) {
            this.f37958b.offer(isOpen ? f37979Y : f37980Z);
            mo11221c();
        }

        @Override // java.lang.Runnable
        public void run() {
            m11222d();
        }
    }

    public fxb(vkb<T> source, long timespan, long timeskip, TimeUnit unit, woe scheduler, long maxSize, int bufferSize, boolean restartTimerOnMaxSize) {
        super(source);
        this.f37946b = timespan;
        this.f37947c = timeskip;
        this.f37948d = unit;
        this.f37949e = scheduler;
        this.f37950f = maxSize;
        this.f37951m = bufferSize;
        this.f37945C = restartTimerOnMaxSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super vkb<T>> downstream) {
        if (this.f37946b != this.f37947c) {
            this.f63101a.subscribe(new RunnableC6030d(downstream, this.f37946b, this.f37947c, this.f37948d, this.f37949e.createWorker(), this.f37951m));
        } else if (this.f37950f == Long.MAX_VALUE) {
            this.f63101a.subscribe(new RunnableC6029c(downstream, this.f37946b, this.f37948d, this.f37949e, this.f37951m));
        } else {
            this.f63101a.subscribe(new RunnableC6028b(downstream, this.f37946b, this.f37948d, this.f37949e, this.f37951m, this.f37950f, this.f37945C));
        }
    }
}
