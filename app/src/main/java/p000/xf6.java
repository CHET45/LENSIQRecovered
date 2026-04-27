package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class xf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f97620c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7178i8 f97621d;

    /* JADX INFO: renamed from: e */
    public final wo0 f97622e;

    /* JADX INFO: renamed from: xf6$a */
    public static /* synthetic */ class C15043a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97623a;

        static {
            int[] iArr = new int[wo0.values().length];
            f97623a = iArr;
            try {
                iArr[wo0.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97623a[wo0.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: xf6$b */
    public static final class C15044b<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = 3240706908776709697L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f97624C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f97625F;

        /* JADX INFO: renamed from: H */
        public Throwable f97626H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f97627a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f97628b;

        /* JADX INFO: renamed from: c */
        public final wo0 f97629c;

        /* JADX INFO: renamed from: d */
        public final long f97630d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f97631e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final Deque<T> f97632f = new ArrayDeque();

        /* JADX INFO: renamed from: m */
        public fdg f97633m;

        public C15044b(ycg<? super T> ycgVar, InterfaceC7178i8 interfaceC7178i8, wo0 wo0Var, long j) {
            this.f97627a = ycgVar;
            this.f97628b = interfaceC7178i8;
            this.f97629c = wo0Var;
            this.f97630d = j;
        }

        /* JADX INFO: renamed from: a */
        public void m25111a(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25112b() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f97632f;
            ycg<? super T> ycgVar = this.f97627a;
            int iAddAndGet = 1;
            do {
                long j = this.f97631e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f97624C) {
                        m25111a(deque);
                        return;
                    }
                    boolean z = this.f97625F;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z2 = tPoll == null;
                    if (z) {
                        Throwable th = this.f97626H;
                        if (th != null) {
                            m25111a(deque);
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
                    if (this.f97624C) {
                        m25111a(deque);
                        return;
                    }
                    boolean z3 = this.f97625F;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.f97626H;
                        if (th2 != null) {
                            m25111a(deque);
                            ycgVar.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    so0.produced(this.f97631e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f97624C = true;
            this.f97633m.cancel();
            if (getAndIncrement() == 0) {
                m25111a(this.f97632f);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97625F = true;
            m25112b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f97625F) {
                pfe.onError(th);
                return;
            }
            this.f97626H = th;
            this.f97625F = true;
            m25112b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.f97625F) {
                return;
            }
            Deque<T> deque = this.f97632f;
            synchronized (deque) {
                try {
                    z = false;
                    if (deque.size() == this.f97630d) {
                        int i = C15043a.f97623a[this.f97629c.ordinal()];
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
                    m25112b();
                    return;
                } else {
                    this.f97633m.cancel();
                    onError(new cwa());
                    return;
                }
            }
            InterfaceC7178i8 interfaceC7178i8 = this.f97628b;
            if (interfaceC7178i8 != null) {
                try {
                    interfaceC7178i8.run();
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f97633m.cancel();
                    onError(th2);
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f97633m, fdgVar)) {
                this.f97633m = fdgVar;
                this.f97627a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f97631e, j);
                m25112b();
            }
        }
    }

    public xf6(m86<T> m86Var, long j, InterfaceC7178i8 interfaceC7178i8, wo0 wo0Var) {
        super(m86Var);
        this.f97620c = j;
        this.f97621d = interfaceC7178i8;
        this.f97622e = wo0Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C15044b(ycgVar, this.f97621d, this.f97622e, this.f97620c));
    }
}
