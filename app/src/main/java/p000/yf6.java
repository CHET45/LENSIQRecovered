package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class yf6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f101387c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7776j8 f101388d;

    /* JADX INFO: renamed from: e */
    public final vo0 f101389e;

    /* JADX INFO: renamed from: yf6$a */
    public static /* synthetic */ class C15645a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101390a;

        static {
            int[] iArr = new int[vo0.values().length];
            f101390a = iArr;
            try {
                iArr[vo0.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101390a[vo0.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: yf6$b */
    public static final class C15646b<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = 3240706908776709697L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f101391C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f101392F;

        /* JADX INFO: renamed from: H */
        public Throwable f101393H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101394a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f101395b;

        /* JADX INFO: renamed from: c */
        public final vo0 f101396c;

        /* JADX INFO: renamed from: d */
        public final long f101397d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f101398e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final Deque<T> f101399f = new ArrayDeque();

        /* JADX INFO: renamed from: m */
        public fdg f101400m;

        public C15646b(ycg<? super T> actual, InterfaceC7776j8 onOverflow, vo0 strategy, long bufferSize) {
            this.f101394a = actual;
            this.f101395b = onOverflow;
            this.f101396c = strategy;
            this.f101397d = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public void m25889a(Deque<T> dq) {
            synchronized (dq) {
                dq.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25890b() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f101399f;
            ycg<? super T> ycgVar = this.f101394a;
            int iAddAndGet = 1;
            do {
                long j = this.f101398e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f101391C) {
                        m25889a(deque);
                        return;
                    }
                    boolean z = this.f101392F;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z2 = tPoll == null;
                    if (z) {
                        Throwable th = this.f101393H;
                        if (th != null) {
                            m25889a(deque);
                            ycgVar.onError(th);
                            return;
                        } else if (z2) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f101391C) {
                        m25889a(deque);
                        return;
                    }
                    boolean z3 = this.f101392F;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.f101393H;
                        if (th2 != null) {
                            m25889a(deque);
                            ycgVar.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this.f101398e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f101391C = true;
            this.f101400m.cancel();
            if (getAndIncrement() == 0) {
                m25889a(this.f101399f);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f101392F = true;
            m25890b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f101392F) {
                ofe.onError(t);
                return;
            }
            this.f101393H = t;
            this.f101392F = true;
            m25890b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.f101392F) {
                return;
            }
            Deque<T> deque = this.f101399f;
            synchronized (deque) {
                try {
                    z = false;
                    if (deque.size() == this.f101397d) {
                        int i = C15645a.f101390a[this.f101396c.ordinal()];
                        z2 = true;
                        if (i == 1) {
                            deque.pollLast();
                            deque.offer(t);
                        } else if (i == 2) {
                            deque.poll();
                            deque.offer(t);
                        }
                        z2 = false;
                        z = true;
                    } else {
                        deque.offer(t);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                if (!z2) {
                    m25890b();
                    return;
                } else {
                    this.f101400m.cancel();
                    onError(new bwa());
                    return;
                }
            }
            InterfaceC7776j8 interfaceC7776j8 = this.f101395b;
            if (interfaceC7776j8 != null) {
                try {
                    interfaceC7776j8.run();
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    this.f101400m.cancel();
                    onError(th2);
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f101400m, s)) {
                this.f101400m = s;
                this.f101394a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f101398e, n);
                m25890b();
            }
        }
    }

    public yf6(l86<T> source, long bufferSize, InterfaceC7776j8 onOverflow, vo0 strategy) {
        super(source);
        this.f101387c = bufferSize;
        this.f101388d = onOverflow;
        this.f101389e = strategy;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C15646b(s, this.f101388d, this.f101389e, this.f101387c));
    }
}
