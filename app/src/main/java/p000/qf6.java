package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qf6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final oof<? extends T> f74288c;

    /* JADX INFO: renamed from: qf6$a */
    public static final class C11465a<T> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: X */
        public static final int f74289X = 1;

        /* JADX INFO: renamed from: Y */
        public static final int f74290Y = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile tif<T> f74291C;

        /* JADX INFO: renamed from: F */
        public T f74292F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f74293H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f74294L;

        /* JADX INFO: renamed from: M */
        public volatile int f74295M;

        /* JADX INFO: renamed from: N */
        public long f74296N;

        /* JADX INFO: renamed from: Q */
        public int f74297Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f74298a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f74299b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f74300c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final bc0 f74301d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f74302e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final int f74303f;

        /* JADX INFO: renamed from: m */
        public final int f74304m;

        /* JADX INFO: renamed from: qf6$a$a */
        public static final class a<T> extends AtomicReference<lf4> implements hnf<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C11465a<T> f74305a;

            public a(C11465a<T> parent) {
                this.f74305a = parent;
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f74305a.m20320d(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(T t) {
                this.f74305a.m20321e(t);
            }
        }

        public C11465a(ycg<? super T> downstream) {
            this.f74298a = downstream;
            int iBufferSize = l86.bufferSize();
            this.f74303f = iBufferSize;
            this.f74304m = iBufferSize - (iBufferSize >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m20317a() {
            if (getAndIncrement() == 0) {
                m20318b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20318b() {
            ycg<? super T> ycgVar = this.f74298a;
            long j = this.f74296N;
            int i = this.f74297Q;
            int i2 = this.f74304m;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f74302e.get();
                while (j != j2) {
                    if (this.f74293H) {
                        this.f74292F = null;
                        this.f74291C = null;
                        return;
                    }
                    if (this.f74301d.get() != null) {
                        this.f74292F = null;
                        this.f74291C = null;
                        this.f74301d.tryTerminateConsumer(this.f74298a);
                        return;
                    }
                    int i4 = this.f74295M;
                    if (i4 == i3) {
                        T t = this.f74292F;
                        this.f74292F = null;
                        this.f74295M = 2;
                        ycgVar.onNext(t);
                        j++;
                    } else {
                        boolean z = this.f74294L;
                        tif<T> tifVar = this.f74291C;
                        InterfaceC0000a interfaceC0000aPoll = tifVar != null ? tifVar.poll() : null;
                        boolean z2 = interfaceC0000aPoll == null;
                        if (z && z2 && i4 == 2) {
                            this.f74291C = null;
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
                                this.f74299b.get().request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f74293H) {
                        this.f74292F = null;
                        this.f74291C = null;
                        return;
                    }
                    if (this.f74301d.get() != null) {
                        this.f74292F = null;
                        this.f74291C = null;
                        this.f74301d.tryTerminateConsumer(this.f74298a);
                        return;
                    }
                    boolean z3 = this.f74294L;
                    tif<T> tifVar2 = this.f74291C;
                    boolean z4 = tifVar2 == null || tifVar2.isEmpty();
                    if (z3 && z4 && this.f74295M == 2) {
                        this.f74291C = null;
                        ycgVar.onComplete();
                        return;
                    }
                }
                this.f74296N = j;
                this.f74297Q = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public tif<T> m20319c() {
            tif<T> tifVar = this.f74291C;
            if (tifVar != null) {
                return tifVar;
            }
            ozf ozfVar = new ozf(l86.bufferSize());
            this.f74291C = ozfVar;
            return ozfVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f74293H = true;
            ldg.cancel(this.f74299b);
            zf4.dispose(this.f74300c);
            this.f74301d.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f74291C = null;
                this.f74292F = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m20320d(Throwable ex) {
            if (this.f74301d.tryAddThrowableOrReport(ex)) {
                ldg.cancel(this.f74299b);
                m20317a();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m20321e(T value) {
            if (compareAndSet(0, 1)) {
                long j = this.f74296N;
                if (this.f74302e.get() != j) {
                    this.f74296N = j + 1;
                    this.f74298a.onNext(value);
                    this.f74295M = 2;
                } else {
                    this.f74292F = value;
                    this.f74295M = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f74292F = value;
                this.f74295M = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m20318b();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f74294L = true;
            m20317a();
        }

        @Override // p000.ycg
        public void onError(Throwable ex) {
            if (this.f74301d.tryAddThrowableOrReport(ex)) {
                zf4.dispose(this.f74300c);
                m20317a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f74296N;
                if (this.f74302e.get() != j) {
                    tif<T> tifVar = this.f74291C;
                    if (tifVar == null || tifVar.isEmpty()) {
                        this.f74296N = j + 1;
                        this.f74298a.onNext(t);
                        int i = this.f74297Q + 1;
                        if (i == this.f74304m) {
                            this.f74297Q = 0;
                            this.f74299b.get().request(i);
                        } else {
                            this.f74297Q = i;
                        }
                    } else {
                        tifVar.offer(t);
                    }
                } else {
                    m20319c().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m20319c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m20318b();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this.f74299b, s, this.f74303f);
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f74302e, n);
            m20317a();
        }
    }

    public qf6(l86<T> source, oof<? extends T> other) {
        super(source);
        this.f74288c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        C11465a c11465a = new C11465a(subscriber);
        subscriber.onSubscribe(c11465a);
        this.f49321b.subscribe((kj6) c11465a);
        this.f74288c.subscribe(c11465a.f74300c);
    }
}
