package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class vf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f90855c;

    /* JADX INFO: renamed from: d */
    public final boolean f90856d;

    /* JADX INFO: renamed from: e */
    public final boolean f90857e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7178i8 f90858f;

    /* JADX INFO: renamed from: vf6$a */
    public static final class C14034a<T> extends sv0<T> implements lj6<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* JADX INFO: renamed from: C */
        public Throwable f90859C;

        /* JADX INFO: renamed from: F */
        public final AtomicLong f90860F = new AtomicLong();

        /* JADX INFO: renamed from: H */
        public boolean f90861H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f90862a;

        /* JADX INFO: renamed from: b */
        public final uif<T> f90863b;

        /* JADX INFO: renamed from: c */
        public final boolean f90864c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7178i8 f90865d;

        /* JADX INFO: renamed from: e */
        public fdg f90866e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f90867f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f90868m;

        public C14034a(ycg<? super T> ycgVar, int i, boolean z, boolean z2, InterfaceC7178i8 interfaceC7178i8) {
            this.f90862a = ycgVar;
            this.f90865d = interfaceC7178i8;
            this.f90864c = z2;
            this.f90863b = z ? new rzf<>(i) : new pzf<>(i);
        }

        /* JADX INFO: renamed from: a */
        public boolean m23929a(boolean z, boolean z2, ycg<? super T> ycgVar) {
            if (this.f90867f) {
                this.f90863b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f90864c) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f90859C;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f90859C;
            if (th2 != null) {
                this.f90863b.clear();
                ycgVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f90867f) {
                return;
            }
            this.f90867f = true;
            this.f90866e.cancel();
            if (this.f90861H || getAndIncrement() != 0) {
                return;
            }
            this.f90863b.clear();
        }

        @Override // p000.ajf
        public void clear() {
            this.f90863b.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                uif<T> uifVar = this.f90863b;
                ycg<? super T> ycgVar = this.f90862a;
                int iAddAndGet = 1;
                while (!m23929a(this.f90868m, uifVar.isEmpty(), ycgVar)) {
                    long j = this.f90860F.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f90868m;
                        T tPoll = uifVar.poll();
                        boolean z2 = tPoll == null;
                        if (m23929a(z, z2, ycgVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && m23929a(this.f90868m, uifVar.isEmpty(), ycgVar)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f90860F.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f90863b.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f90868m = true;
            if (this.f90861H) {
                this.f90862a.onComplete();
            } else {
                drain();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f90859C = th;
            this.f90868m = true;
            if (this.f90861H) {
                this.f90862a.onError(th);
            } else {
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f90863b.offer(t)) {
                if (this.f90861H) {
                    this.f90862a.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.f90866e.cancel();
            cwa cwaVar = new cwa("Buffer is full");
            try {
                this.f90865d.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cwaVar.initCause(th);
            }
            onError(cwaVar);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f90866e, fdgVar)) {
                this.f90866e = fdgVar;
                this.f90862a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            return this.f90863b.poll();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (this.f90861H || !mdg.validate(j)) {
                return;
            }
            so0.add(this.f90860F, j);
            drain();
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f90861H = true;
            return 2;
        }
    }

    public vf6(m86<T> m86Var, int i, boolean z, boolean z2, InterfaceC7178i8 interfaceC7178i8) {
        super(m86Var);
        this.f90855c = i;
        this.f90856d = z;
        this.f90857e = z2;
        this.f90858f = interfaceC7178i8;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C14034a(ycgVar, this.f90855c, this.f90856d, this.f90857e, this.f90858f));
    }
}
