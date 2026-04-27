package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zwb<T, B> extends AbstractC9666n3<T, vkb<T>> {

    /* JADX INFO: renamed from: b */
    public final wub<B> f106194b;

    /* JADX INFO: renamed from: c */
    public final int f106195c;

    /* JADX INFO: renamed from: zwb$a */
    public static final class C16267a<T, B> extends fg4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC16268b<T, B> f106196b;

        /* JADX INFO: renamed from: c */
        public boolean f106197c;

        public C16267a(RunnableC16268b<T, B> parent) {
            this.f106196b = parent;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f106197c) {
                return;
            }
            this.f106197c = true;
            this.f106196b.m27107b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f106197c) {
                ofe.onError(t);
            } else {
                this.f106197c = true;
                this.f106196b.m27108c(t);
            }
        }

        @Override // p000.pxb
        public void onNext(B t) {
            if (this.f106197c) {
                return;
            }
            this.f106196b.m27109d();
        }
    }

    /* JADX INFO: renamed from: zwb$b */
    public static final class RunnableC16268b<T, B> extends AtomicInteger implements pxb<T>, lf4, Runnable {

        /* JADX INFO: renamed from: L */
        public static final Object f106198L = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: F */
        public volatile boolean f106200F;

        /* JADX INFO: renamed from: H */
        public osh<T> f106201H;

        /* JADX INFO: renamed from: a */
        public final pxb<? super vkb<T>> f106202a;

        /* JADX INFO: renamed from: b */
        public final int f106203b;

        /* JADX INFO: renamed from: c */
        public final C16267a<T, B> f106204c = new C16267a<>(this);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f106205d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f106206e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final t1b<Object> f106207f = new t1b<>();

        /* JADX INFO: renamed from: m */
        public final bc0 f106208m = new bc0();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f106199C = new AtomicBoolean();

        public RunnableC16268b(pxb<? super vkb<T>> downstream, int capacityHint) {
            this.f106202a = downstream;
            this.f106203b = capacityHint;
        }

        /* JADX INFO: renamed from: a */
        public void m27106a() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super vkb<T>> pxbVar = this.f106202a;
            t1b<Object> t1bVar = this.f106207f;
            bc0 bc0Var = this.f106208m;
            int iAddAndGet = 1;
            while (this.f106206e.get() != 0) {
                osh<T> oshVar = this.f106201H;
                boolean z = this.f106200F;
                if (z && bc0Var.get() != null) {
                    t1bVar.clear();
                    Throwable thTerminate = bc0Var.terminate();
                    if (oshVar != null) {
                        this.f106201H = null;
                        oshVar.onError(thTerminate);
                    }
                    pxbVar.onError(thTerminate);
                    return;
                }
                Object objPoll = t1bVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = bc0Var.terminate();
                    if (thTerminate2 == null) {
                        if (oshVar != null) {
                            this.f106201H = null;
                            oshVar.onComplete();
                        }
                        pxbVar.onComplete();
                        return;
                    }
                    if (oshVar != null) {
                        this.f106201H = null;
                        oshVar.onError(thTerminate2);
                    }
                    pxbVar.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f106198L) {
                    oshVar.onNext((T) objPoll);
                } else {
                    if (oshVar != null) {
                        this.f106201H = null;
                        oshVar.onComplete();
                    }
                    if (!this.f106199C.get()) {
                        osh<T> oshVarCreate = osh.create(this.f106203b, this);
                        this.f106201H = oshVarCreate;
                        this.f106206e.getAndIncrement();
                        dxb dxbVar = new dxb(oshVarCreate);
                        pxbVar.onNext(dxbVar);
                        if (dxbVar.m9520a()) {
                            oshVarCreate.onComplete();
                        }
                    }
                }
            }
            t1bVar.clear();
            this.f106201H = null;
        }

        /* JADX INFO: renamed from: b */
        public void m27107b() {
            zf4.dispose(this.f106205d);
            this.f106200F = true;
            m27106a();
        }

        /* JADX INFO: renamed from: c */
        public void m27108c(Throwable e) {
            zf4.dispose(this.f106205d);
            if (this.f106208m.tryAddThrowableOrReport(e)) {
                this.f106200F = true;
                m27106a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m27109d() {
            this.f106207f.offer(f106198L);
            m27106a();
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f106199C.compareAndSet(false, true)) {
                this.f106204c.dispose();
                if (this.f106206e.decrementAndGet() == 0) {
                    zf4.dispose(this.f106205d);
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f106199C.get();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f106204c.dispose();
            this.f106200F = true;
            m27106a();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f106204c.dispose();
            if (this.f106208m.tryAddThrowableOrReport(e)) {
                this.f106200F = true;
                m27106a();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f106207f.offer(t);
            m27106a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this.f106205d, d)) {
                m27109d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f106206e.decrementAndGet() == 0) {
                zf4.dispose(this.f106205d);
            }
        }
    }

    public zwb(wub<T> source, wub<B> other, int capacityHint) {
        super(source);
        this.f106194b = other;
        this.f106195c = capacityHint;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super vkb<T>> observer) {
        RunnableC16268b runnableC16268b = new RunnableC16268b(observer, this.f106195c);
        observer.onSubscribe(runnableC16268b);
        this.f106194b.subscribe(runnableC16268b.f106204c);
        this.f63101a.subscribe(runnableC16268b);
    }
}
