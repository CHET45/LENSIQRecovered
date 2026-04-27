package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class w96<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f93648c;

    /* JADX INFO: renamed from: d */
    public final int f93649d;

    /* JADX INFO: renamed from: e */
    public final f55 f93650e;

    /* JADX INFO: renamed from: w96$a */
    public static /* synthetic */ class C14487a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93651a;

        static {
            int[] iArr = new int[f55.values().length];
            f93651a = iArr;
            try {
                iArr[f55.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93651a[f55.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: w96$b */
    public static abstract class AbstractC14488b<T, R> extends AtomicInteger implements lj6<T>, InterfaceC14492f<R>, fdg {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f93652C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f93653F;

        /* JADX INFO: renamed from: L */
        public volatile boolean f93655L;

        /* JADX INFO: renamed from: M */
        public int f93656M;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends R>> f93658b;

        /* JADX INFO: renamed from: c */
        public final int f93659c;

        /* JADX INFO: renamed from: d */
        public final int f93660d;

        /* JADX INFO: renamed from: e */
        public fdg f93661e;

        /* JADX INFO: renamed from: f */
        public int f93662f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f93663m;

        /* JADX INFO: renamed from: a */
        public final C14491e<R> f93657a = new C14491e<>(this);

        /* JADX INFO: renamed from: H */
        public final cc0 f93654H = new cc0();

        public AbstractC14488b(py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
            this.f93658b = py6Var;
            this.f93659c = i;
            this.f93660d = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo24430a();

        /* JADX INFO: renamed from: b */
        public abstract void mo24431b();

        @Override // p000.w96.InterfaceC14492f
        public final void innerComplete() {
            this.f93655L = false;
            mo24430a();
        }

        @Override // p000.ycg
        public final void onComplete() {
            this.f93652C = true;
            mo24430a();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f93656M == 2 || this.f93663m.offer(t)) {
                mo24430a();
            } else {
                this.f93661e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public final void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f93661e, fdgVar)) {
                this.f93661e = fdgVar;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f93656M = iRequestFusion;
                        this.f93663m = codVar;
                        this.f93652C = true;
                        mo24431b();
                        mo24430a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f93656M = iRequestFusion;
                        this.f93663m = codVar;
                        mo24431b();
                        fdgVar.request(this.f93659c);
                        return;
                    }
                }
                this.f93663m = new pzf(this.f93659c);
                mo24431b();
                fdgVar.request(this.f93659c);
            }
        }
    }

    /* JADX INFO: renamed from: w96$c */
    public static final class C14489c<T, R> extends AbstractC14488b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: N */
        public final ycg<? super R> f93664N;

        /* JADX INFO: renamed from: Q */
        public final boolean f93665Q;

        public C14489c(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
            super(py6Var, i);
            this.f93664N = ycgVar;
            this.f93665Q = z;
        }

        @Override // p000.w96.AbstractC14488b
        /* JADX INFO: renamed from: a */
        public void mo24430a() {
            Object objCall;
            if (getAndIncrement() == 0) {
                while (!this.f93653F) {
                    if (!this.f93655L) {
                        boolean z = this.f93652C;
                        if (z && !this.f93665Q && this.f93654H.get() != null) {
                            this.f93664N.onError(this.f93654H.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.f93663m.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                Throwable thTerminate = this.f93654H.terminate();
                                if (thTerminate != null) {
                                    this.f93664N.onError(thTerminate);
                                    return;
                                } else {
                                    this.f93664N.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    zjd zjdVar = (zjd) xjb.requireNonNull(this.f93658b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f93656M != 1) {
                                        int i = this.f93662f + 1;
                                        if (i == this.f93660d) {
                                            this.f93662f = 0;
                                            this.f93661e.request(i);
                                        } else {
                                            this.f93662f = i;
                                        }
                                    }
                                    if (zjdVar instanceof Callable) {
                                        try {
                                            objCall = ((Callable) zjdVar).call();
                                        } catch (Throwable th) {
                                            n75.throwIfFatal(th);
                                            this.f93654H.addThrowable(th);
                                            if (!this.f93665Q) {
                                                this.f93661e.cancel();
                                                this.f93664N.onError(this.f93654H.terminate());
                                                return;
                                            }
                                            objCall = null;
                                        }
                                        if (objCall == null) {
                                            continue;
                                        } else if (this.f93657a.isUnbounded()) {
                                            this.f93664N.onNext(objCall);
                                        } else {
                                            this.f93655L = true;
                                            this.f93657a.setSubscription(new C14493g(objCall, this.f93657a));
                                        }
                                    } else {
                                        this.f93655L = true;
                                        zjdVar.subscribe(this.f93657a);
                                    }
                                } catch (Throwable th2) {
                                    n75.throwIfFatal(th2);
                                    this.f93661e.cancel();
                                    this.f93654H.addThrowable(th2);
                                    this.f93664N.onError(this.f93654H.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            n75.throwIfFatal(th3);
                            this.f93661e.cancel();
                            this.f93654H.addThrowable(th3);
                            this.f93664N.onError(this.f93654H.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.w96.AbstractC14488b
        /* JADX INFO: renamed from: b */
        public void mo24431b() {
            this.f93664N.onSubscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f93653F) {
                return;
            }
            this.f93653F = true;
            this.f93657a.cancel();
            this.f93661e.cancel();
        }

        @Override // p000.w96.InterfaceC14492f
        public void innerError(Throwable th) {
            if (!this.f93654H.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f93665Q) {
                this.f93661e.cancel();
                this.f93652C = true;
            }
            this.f93655L = false;
            mo24430a();
        }

        @Override // p000.w96.InterfaceC14492f
        public void innerNext(R r) {
            this.f93664N.onNext(r);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f93654H.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f93652C = true;
                mo24430a();
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f93657a.request(j);
        }
    }

    /* JADX INFO: renamed from: w96$d */
    public static final class C14490d<T, R> extends AbstractC14488b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: N */
        public final ycg<? super R> f93666N;

        /* JADX INFO: renamed from: Q */
        public final AtomicInteger f93667Q;

        public C14490d(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
            super(py6Var, i);
            this.f93666N = ycgVar;
            this.f93667Q = new AtomicInteger();
        }

        @Override // p000.w96.AbstractC14488b
        /* JADX INFO: renamed from: a */
        public void mo24430a() {
            if (this.f93667Q.getAndIncrement() == 0) {
                while (!this.f93653F) {
                    if (!this.f93655L) {
                        boolean z = this.f93652C;
                        try {
                            T tPoll = this.f93663m.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.f93666N.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    zjd zjdVar = (zjd) xjb.requireNonNull(this.f93658b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f93656M != 1) {
                                        int i = this.f93662f + 1;
                                        if (i == this.f93660d) {
                                            this.f93662f = 0;
                                            this.f93661e.request(i);
                                        } else {
                                            this.f93662f = i;
                                        }
                                    }
                                    if (zjdVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) zjdVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.f93657a.isUnbounded()) {
                                                this.f93655L = true;
                                                this.f93657a.setSubscription(new C14493g(objCall, this.f93657a));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f93666N.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f93666N.onError(this.f93654H.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            n75.throwIfFatal(th);
                                            this.f93661e.cancel();
                                            this.f93654H.addThrowable(th);
                                            this.f93666N.onError(this.f93654H.terminate());
                                            return;
                                        }
                                    } else {
                                        this.f93655L = true;
                                        zjdVar.subscribe(this.f93657a);
                                    }
                                } catch (Throwable th2) {
                                    n75.throwIfFatal(th2);
                                    this.f93661e.cancel();
                                    this.f93654H.addThrowable(th2);
                                    this.f93666N.onError(this.f93654H.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            n75.throwIfFatal(th3);
                            this.f93661e.cancel();
                            this.f93654H.addThrowable(th3);
                            this.f93666N.onError(this.f93654H.terminate());
                            return;
                        }
                    }
                    if (this.f93667Q.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.w96.AbstractC14488b
        /* JADX INFO: renamed from: b */
        public void mo24431b() {
            this.f93666N.onSubscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f93653F) {
                return;
            }
            this.f93653F = true;
            this.f93657a.cancel();
            this.f93661e.cancel();
        }

        @Override // p000.w96.InterfaceC14492f
        public void innerError(Throwable th) {
            if (!this.f93654H.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f93661e.cancel();
            if (getAndIncrement() == 0) {
                this.f93666N.onError(this.f93654H.terminate());
            }
        }

        @Override // p000.w96.InterfaceC14492f
        public void innerNext(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f93666N.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f93666N.onError(this.f93654H.terminate());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f93654H.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f93657a.cancel();
            if (getAndIncrement() == 0) {
                this.f93666N.onError(this.f93654H.terminate());
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f93657a.request(j);
        }
    }

    /* JADX INFO: renamed from: w96$e */
    public static final class C14491e<R> extends hdg implements lj6<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: F */
        public final InterfaceC14492f<R> f93668F;

        /* JADX INFO: renamed from: H */
        public long f93669H;

        public C14491e(InterfaceC14492f<R> interfaceC14492f) {
            super(false);
            this.f93668F = interfaceC14492f;
        }

        @Override // p000.ycg
        public void onComplete() {
            long j = this.f93669H;
            if (j != 0) {
                this.f93669H = 0L;
                produced(j);
            }
            this.f93668F.innerComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            long j = this.f93669H;
            if (j != 0) {
                this.f93669H = 0L;
                produced(j);
            }
            this.f93668F.innerError(th);
        }

        @Override // p000.ycg
        public void onNext(R r) {
            this.f93669H++;
            this.f93668F.innerNext(r);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            setSubscription(fdgVar);
        }
    }

    /* JADX INFO: renamed from: w96$f */
    public interface InterfaceC14492f<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    /* JADX INFO: renamed from: w96$g */
    public static final class C14493g<T> extends AtomicBoolean implements fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f93670a;

        /* JADX INFO: renamed from: b */
        public final T f93671b;

        public C14493g(T t, ycg<? super T> ycgVar) {
            this.f93671b = t;
            this.f93670a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
        }

        @Override // p000.fdg
        public void request(long j) {
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            ycg<? super T> ycgVar = this.f93670a;
            ycgVar.onNext(this.f93671b);
            ycgVar.onComplete();
        }
    }

    public w96(m86<T> m86Var, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, f55 f55Var) {
        super(m86Var);
        this.f93648c = py6Var;
        this.f93649d = i;
        this.f93650e = f55Var;
    }

    public static <T, R> ycg<T> subscribe(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, f55 f55Var) {
        int i2 = C14487a.f93651a[f55Var.ordinal()];
        return i2 != 1 ? i2 != 2 ? new C14490d(ycgVar, py6Var, i) : new C14489c(ycgVar, py6Var, i, true) : new C14489c(ycgVar, py6Var, i, false);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        if (ei6.tryScalarXMapSubscribe(this.f52360b, ycgVar, this.f93648c)) {
            return;
        }
        this.f52360b.subscribe(subscribe(ycgVar, this.f93648c, this.f93649d, this.f93650e));
    }
}
