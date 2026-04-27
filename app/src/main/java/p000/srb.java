package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class srb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final oof<? extends T> f82699b;

    /* JADX INFO: renamed from: srb$a */
    public static final class C12759a<T> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: H */
        public static final int f82700H = 1;

        /* JADX INFO: renamed from: L */
        public static final int f82701L = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f82702C;

        /* JADX INFO: renamed from: F */
        public volatile int f82703F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f82704a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f82705b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f82706c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f82707d = new bc0();

        /* JADX INFO: renamed from: e */
        public volatile tif<T> f82708e;

        /* JADX INFO: renamed from: f */
        public T f82709f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f82710m;

        /* JADX INFO: renamed from: srb$a$a */
        public static final class a<T> extends AtomicReference<lf4> implements hnf<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C12759a<T> f82711a;

            public a(C12759a<T> parent) {
                this.f82711a = parent;
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f82711a.m22203d(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(T t) {
                this.f82711a.m22204e(t);
            }
        }

        public C12759a(pxb<? super T> downstream) {
            this.f82704a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m22200a() {
            if (getAndIncrement() == 0) {
                m22201b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m22201b() {
            pxb<? super T> pxbVar = this.f82704a;
            int iAddAndGet = 1;
            while (!this.f82710m) {
                if (this.f82707d.get() != null) {
                    this.f82709f = null;
                    this.f82708e = null;
                    this.f82707d.tryTerminateConsumer(pxbVar);
                    return;
                }
                int i = this.f82703F;
                if (i == 1) {
                    T t = this.f82709f;
                    this.f82709f = null;
                    this.f82703F = 2;
                    pxbVar.onNext(t);
                    i = 2;
                }
                boolean z = this.f82702C;
                tif<T> tifVar = this.f82708e;
                InterfaceC0000a interfaceC0000aPoll = tifVar != null ? tifVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2 && i == 2) {
                    this.f82708e = null;
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
            this.f82709f = null;
            this.f82708e = null;
        }

        /* JADX INFO: renamed from: c */
        public tif<T> m22202c() {
            tif<T> tifVar = this.f82708e;
            if (tifVar != null) {
                return tifVar;
            }
            qzf qzfVar = new qzf(vkb.bufferSize());
            this.f82708e = qzfVar;
            return qzfVar;
        }

        /* JADX INFO: renamed from: d */
        public void m22203d(Throwable ex) {
            if (this.f82707d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f82705b);
                m22200a();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f82710m = true;
            zf4.dispose(this.f82705b);
            zf4.dispose(this.f82706c);
            this.f82707d.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f82708e = null;
                this.f82709f = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m22204e(T value) {
            if (compareAndSet(0, 1)) {
                this.f82704a.onNext(value);
                this.f82703F = 2;
            } else {
                this.f82709f = value;
                this.f82703F = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m22201b();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f82705b.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f82702C = true;
            m22200a();
        }

        @Override // p000.pxb
        public void onError(Throwable ex) {
            if (this.f82707d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f82706c);
                m22200a();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f82704a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m22202c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m22201b();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f82705b, d);
        }
    }

    public srb(vkb<T> source, oof<? extends T> other) {
        super(source);
        this.f82699b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C12759a c12759a = new C12759a(observer);
        observer.onSubscribe(c12759a);
        this.f63101a.subscribe(c12759a);
        this.f82699b.subscribe(c12759a.f82706c);
    }
}
