package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qrb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T> f75386b;

    /* JADX INFO: renamed from: qrb$a */
    public static final class C11635a<T> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: H */
        public static final int f75387H = 1;

        /* JADX INFO: renamed from: L */
        public static final int f75388L = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f75389C;

        /* JADX INFO: renamed from: F */
        public volatile int f75390F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f75391a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f75392b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f75393c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f75394d = new bc0();

        /* JADX INFO: renamed from: e */
        public volatile tif<T> f75395e;

        /* JADX INFO: renamed from: f */
        public T f75396f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f75397m;

        /* JADX INFO: renamed from: qrb$a$a */
        public static final class a<T> extends AtomicReference<lf4> implements k9a<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C11635a<T> f75398a;

            public a(C11635a<T> parent) {
                this.f75398a = parent;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f75398a.m20618d();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f75398a.m20619e(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(T t) {
                this.f75398a.m20620f(t);
            }
        }

        public C11635a(pxb<? super T> downstream) {
            this.f75391a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m20615a() {
            if (getAndIncrement() == 0) {
                m20616b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20616b() {
            pxb<? super T> pxbVar = this.f75391a;
            int iAddAndGet = 1;
            while (!this.f75397m) {
                if (this.f75394d.get() != null) {
                    this.f75396f = null;
                    this.f75395e = null;
                    this.f75394d.tryTerminateConsumer(pxbVar);
                    return;
                }
                int i = this.f75390F;
                if (i == 1) {
                    T t = this.f75396f;
                    this.f75396f = null;
                    this.f75390F = 2;
                    pxbVar.onNext(t);
                    i = 2;
                }
                boolean z = this.f75389C;
                tif<T> tifVar = this.f75395e;
                InterfaceC0000a interfaceC0000aPoll = tifVar != null ? tifVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2 && i == 2) {
                    this.f75395e = null;
                    pxbVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    pxbVar.onNext(interfaceC0000aPoll);
                }
            }
            this.f75396f = null;
            this.f75395e = null;
        }

        /* JADX INFO: renamed from: c */
        public tif<T> m20617c() {
            tif<T> tifVar = this.f75395e;
            if (tifVar != null) {
                return tifVar;
            }
            qzf qzfVar = new qzf(vkb.bufferSize());
            this.f75395e = qzfVar;
            return qzfVar;
        }

        /* JADX INFO: renamed from: d */
        public void m20618d() {
            this.f75390F = 2;
            m20615a();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f75397m = true;
            zf4.dispose(this.f75392b);
            zf4.dispose(this.f75393c);
            this.f75394d.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f75395e = null;
                this.f75396f = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m20619e(Throwable ex) {
            if (this.f75394d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f75392b);
                m20615a();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m20620f(T value) {
            if (compareAndSet(0, 1)) {
                this.f75391a.onNext(value);
                this.f75390F = 2;
            } else {
                this.f75396f = value;
                this.f75390F = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m20616b();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f75392b.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f75389C = true;
            m20615a();
        }

        @Override // p000.pxb
        public void onError(Throwable ex) {
            if (this.f75394d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f75393c);
                m20615a();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f75391a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m20617c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m20616b();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f75392b, d);
        }
    }

    public qrb(vkb<T> source, z9a<? extends T> other) {
        super(source);
        this.f75386b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C11635a c11635a = new C11635a(observer);
        observer.onSubscribe(c11635a);
        this.f63101a.subscribe(c11635a);
        this.f75386b.subscribe(c11635a.f75393c);
    }
}
