package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class of6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final z9a<? extends T> f67492c;

    /* JADX INFO: renamed from: of6$a */
    public static final class C10357a<T> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: X */
        public static final int f67493X = 1;

        /* JADX INFO: renamed from: Y */
        public static final int f67494Y = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile tif<T> f67495C;

        /* JADX INFO: renamed from: F */
        public T f67496F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f67497H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f67498L;

        /* JADX INFO: renamed from: M */
        public volatile int f67499M;

        /* JADX INFO: renamed from: N */
        public long f67500N;

        /* JADX INFO: renamed from: Q */
        public int f67501Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f67502a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f67503b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f67504c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f67505d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f67506e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final int f67507f;

        /* JADX INFO: renamed from: m */
        public final int f67508m;

        /* JADX INFO: renamed from: of6$a$a */
        public static final class a<T> extends AtomicReference<lf4> implements k9a<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C10357a<T> f67509a;

            public a(C10357a<T> parent) {
                this.f67509a = parent;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f67509a.m18623d();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f67509a.m18624e(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(T t) {
                this.f67509a.m18625f(t);
            }
        }

        public C10357a(ycg<? super T> downstream) {
            this.f67502a = downstream;
            int iBufferSize = l86.bufferSize();
            this.f67507f = iBufferSize;
            this.f67508m = iBufferSize - (iBufferSize >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m18620a() {
            if (getAndIncrement() == 0) {
                m18621b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18621b() {
            ycg<? super T> ycgVar = this.f67502a;
            long j = this.f67500N;
            int i = this.f67501Q;
            int i2 = this.f67508m;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f67506e.get();
                while (j != j2) {
                    if (this.f67497H) {
                        this.f67496F = null;
                        this.f67495C = null;
                        return;
                    }
                    if (this.f67505d.get() != null) {
                        this.f67496F = null;
                        this.f67495C = null;
                        this.f67505d.tryTerminateConsumer(this.f67502a);
                        return;
                    }
                    int i4 = this.f67499M;
                    if (i4 == i3) {
                        T t = this.f67496F;
                        this.f67496F = null;
                        this.f67499M = 2;
                        ycgVar.onNext(t);
                        j++;
                    } else {
                        boolean z = this.f67498L;
                        tif<T> tifVar = this.f67495C;
                        InterfaceC0000a interfaceC0000aPoll = tifVar != null ? tifVar.poll() : null;
                        boolean z2 = interfaceC0000aPoll == null;
                        if (z && z2 && i4 == 2) {
                            this.f67495C = null;
                            ycgVar.onComplete();
                            return;
                        } else {
                            if (z2) {
                                break;
                            }
                            ycgVar.onNext(interfaceC0000aPoll);
                            j++;
                            i++;
                            if (i == i2) {
                                this.f67503b.get().request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f67497H) {
                        this.f67496F = null;
                        this.f67495C = null;
                        return;
                    }
                    if (this.f67505d.get() != null) {
                        this.f67496F = null;
                        this.f67495C = null;
                        this.f67505d.tryTerminateConsumer(this.f67502a);
                        return;
                    }
                    boolean z3 = this.f67498L;
                    tif<T> tifVar2 = this.f67495C;
                    boolean z4 = tifVar2 == null || tifVar2.isEmpty();
                    if (z3 && z4 && this.f67499M == 2) {
                        this.f67495C = null;
                        ycgVar.onComplete();
                        return;
                    }
                }
                this.f67500N = j;
                this.f67501Q = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public tif<T> m18622c() {
            tif<T> tifVar = this.f67495C;
            if (tifVar != null) {
                return tifVar;
            }
            ozf ozfVar = new ozf(l86.bufferSize());
            this.f67495C = ozfVar;
            return ozfVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f67497H = true;
            ldg.cancel(this.f67503b);
            zf4.dispose(this.f67504c);
            this.f67505d.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f67495C = null;
                this.f67496F = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m18623d() {
            this.f67499M = 2;
            m18620a();
        }

        /* JADX INFO: renamed from: e */
        public void m18624e(Throwable ex) {
            if (this.f67505d.tryAddThrowableOrReport(ex)) {
                ldg.cancel(this.f67503b);
                m18620a();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m18625f(T value) {
            if (compareAndSet(0, 1)) {
                long j = this.f67500N;
                if (this.f67506e.get() != j) {
                    this.f67500N = j + 1;
                    this.f67502a.onNext(value);
                    this.f67499M = 2;
                } else {
                    this.f67496F = value;
                    this.f67499M = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f67496F = value;
                this.f67499M = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18621b();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f67498L = true;
            m18620a();
        }

        @Override // p000.ycg
        public void onError(Throwable ex) {
            if (this.f67505d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f67504c);
                m18620a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f67500N;
                if (this.f67506e.get() != j) {
                    tif<T> tifVar = this.f67495C;
                    if (tifVar == null || tifVar.isEmpty()) {
                        this.f67500N = j + 1;
                        this.f67502a.onNext(t);
                        int i = this.f67501Q + 1;
                        if (i == this.f67508m) {
                            this.f67501Q = 0;
                            this.f67503b.get().request(i);
                        } else {
                            this.f67501Q = i;
                        }
                    } else {
                        tifVar.offer(t);
                    }
                } else {
                    m18622c().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m18622c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18621b();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this.f67503b, s, this.f67507f);
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f67506e, n);
            m18620a();
        }
    }

    public of6(l86<T> source, z9a<? extends T> other) {
        super(source);
        this.f67492c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        C10357a c10357a = new C10357a(subscriber);
        subscriber.onSubscribe(c10357a);
        this.f49321b.subscribe((kj6) c10357a);
        this.f67492c.subscribe(c10357a.f67504c);
    }
}
