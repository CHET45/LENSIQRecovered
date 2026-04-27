package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class wf6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f94076c;

    /* JADX INFO: renamed from: d */
    public final boolean f94077d;

    /* JADX INFO: renamed from: e */
    public final boolean f94078e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7776j8 f94079f;

    /* JADX INFO: renamed from: wf6$a */
    public static final class C14571a<T> extends rv0<T> implements kj6<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* JADX INFO: renamed from: C */
        public Throwable f94080C;

        /* JADX INFO: renamed from: F */
        public final AtomicLong f94081F = new AtomicLong();

        /* JADX INFO: renamed from: H */
        public boolean f94082H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f94083a;

        /* JADX INFO: renamed from: b */
        public final tif<T> f94084b;

        /* JADX INFO: renamed from: c */
        public final boolean f94085c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7776j8 f94086d;

        /* JADX INFO: renamed from: e */
        public fdg f94087e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f94088f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f94089m;

        public C14571a(ycg<? super T> actual, int bufferSize, boolean unbounded, boolean delayError, InterfaceC7776j8 onOverflow) {
            this.f94083a = actual;
            this.f94086d = onOverflow;
            this.f94085c = delayError;
            this.f94084b = unbounded ? new qzf<>(bufferSize) : new ozf<>(bufferSize);
        }

        /* JADX INFO: renamed from: a */
        public boolean m24493a(boolean d, boolean empty, ycg<? super T> a) {
            if (this.f94088f) {
                this.f94084b.clear();
                return true;
            }
            if (!d) {
                return false;
            }
            if (this.f94085c) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.f94080C;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f94080C;
            if (th2 != null) {
                this.f94084b.clear();
                a.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            a.onComplete();
            return true;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f94088f) {
                return;
            }
            this.f94088f = true;
            this.f94087e.cancel();
            if (this.f94082H || getAndIncrement() != 0) {
                return;
            }
            this.f94084b.clear();
        }

        @Override // p000.zif
        public void clear() {
            this.f94084b.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                tif<T> tifVar = this.f94084b;
                ycg<? super T> ycgVar = this.f94083a;
                int iAddAndGet = 1;
                while (!m24493a(this.f94089m, tifVar.isEmpty(), ycgVar)) {
                    long j = this.f94081F.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f94089m;
                        T tPoll = tifVar.poll();
                        boolean z2 = tPoll == null;
                        if (m24493a(z, z2, ycgVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && m24493a(this.f94089m, tifVar.isEmpty(), ycgVar)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f94081F.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f94084b.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f94089m = true;
            if (this.f94082H) {
                this.f94083a.onComplete();
            } else {
                drain();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f94080C = t;
            this.f94089m = true;
            if (this.f94082H) {
                this.f94083a.onError(t);
            } else {
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f94084b.offer(t)) {
                if (this.f94082H) {
                    this.f94083a.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.f94087e.cancel();
            bwa bwaVar = new bwa("Buffer is full");
            try {
                this.f94086d.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                bwaVar.initCause(th);
            }
            onError(bwaVar);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f94087e, s)) {
                this.f94087e = s;
                this.f94083a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return this.f94084b.poll();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (this.f94082H || !ldg.validate(n)) {
                return;
            }
            ro0.add(this.f94081F, n);
            drain();
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f94082H = true;
            return 2;
        }
    }

    public wf6(l86<T> source, int bufferSize, boolean unbounded, boolean delayError, InterfaceC7776j8 onOverflow) {
        super(source);
        this.f94076c = bufferSize;
        this.f94077d = unbounded;
        this.f94078e = delayError;
        this.f94079f = onOverflow;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C14571a(s, this.f94076c, this.f94077d, this.f94078e, this.f94079f));
    }
}
