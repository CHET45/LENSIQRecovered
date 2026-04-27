package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class x96<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f97244c;

    /* JADX INFO: renamed from: d */
    public final int f97245d;

    /* JADX INFO: renamed from: e */
    public final e55 f97246e;

    /* JADX INFO: renamed from: x96$a */
    public static /* synthetic */ class C14996a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97247a;

        static {
            int[] iArr = new int[e55.values().length];
            f97247a = iArr;
            try {
                iArr[e55.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97247a[e55.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: x96$b */
    public static abstract class AbstractC14997b<T, R> extends AtomicInteger implements kj6<T>, InterfaceC15001f<R>, fdg {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f97248C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f97249F;

        /* JADX INFO: renamed from: L */
        public volatile boolean f97251L;

        /* JADX INFO: renamed from: M */
        public int f97252M;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends R>> f97254b;

        /* JADX INFO: renamed from: c */
        public final int f97255c;

        /* JADX INFO: renamed from: d */
        public final int f97256d;

        /* JADX INFO: renamed from: e */
        public fdg f97257e;

        /* JADX INFO: renamed from: f */
        public int f97258f;

        /* JADX INFO: renamed from: m */
        public zif<T> f97259m;

        /* JADX INFO: renamed from: a */
        public final C15000e<R> f97253a = new C15000e<>(this);

        /* JADX INFO: renamed from: H */
        public final bc0 f97250H = new bc0();

        public AbstractC14997b(sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch) {
            this.f97254b = mapper;
            this.f97255c = prefetch;
            this.f97256d = prefetch - (prefetch >> 2);
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo25058a();

        /* JADX INFO: renamed from: b */
        public abstract void mo25059b();

        @Override // p000.x96.InterfaceC15001f
        public final void innerComplete() {
            this.f97251L = false;
            mo25058a();
        }

        @Override // p000.ycg
        public final void onComplete() {
            this.f97248C = true;
            mo25058a();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f97252M == 2 || this.f97259m.offer(t)) {
                mo25058a();
            } else {
                this.f97257e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public final void onSubscribe(fdg s) {
            if (ldg.validate(this.f97257e, s)) {
                this.f97257e = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f97252M = iRequestFusion;
                        this.f97259m = bodVar;
                        this.f97248C = true;
                        mo25059b();
                        mo25058a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f97252M = iRequestFusion;
                        this.f97259m = bodVar;
                        mo25059b();
                        s.request(this.f97255c);
                        return;
                    }
                }
                this.f97259m = new ozf(this.f97255c);
                mo25059b();
                s.request(this.f97255c);
            }
        }
    }

    /* JADX INFO: renamed from: x96$c */
    public static final class C14998c<T, R> extends AbstractC14997b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: N */
        public final ycg<? super R> f97260N;

        /* JADX INFO: renamed from: Q */
        public final boolean f97261Q;

        public C14998c(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, boolean veryEnd) {
            super(mapper, prefetch);
            this.f97260N = actual;
            this.f97261Q = veryEnd;
        }

        @Override // p000.x96.AbstractC14997b
        /* JADX INFO: renamed from: a */
        public void mo25058a() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f97249F) {
                    if (!this.f97251L) {
                        boolean z = this.f97248C;
                        if (z && !this.f97261Q && this.f97250H.get() != null) {
                            this.f97250H.tryTerminateConsumer(this.f97260N);
                            return;
                        }
                        try {
                            T tPoll = this.f97259m.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.f97250H.tryTerminateConsumer(this.f97260N);
                                return;
                            }
                            if (!z2) {
                                try {
                                    zjd<? extends R> zjdVarApply = this.f97254b.apply(tPoll);
                                    Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                                    zjd<? extends R> zjdVar = zjdVarApply;
                                    if (this.f97252M != 1) {
                                        int i = this.f97258f + 1;
                                        if (i == this.f97256d) {
                                            this.f97258f = 0;
                                            this.f97257e.request(i);
                                        } else {
                                            this.f97258f = i;
                                        }
                                    }
                                    if (zjdVar instanceof nfg) {
                                        try {
                                            obj = ((nfg) zjdVar).get();
                                        } catch (Throwable th) {
                                            o75.throwIfFatal(th);
                                            this.f97250H.tryAddThrowableOrReport(th);
                                            if (!this.f97261Q) {
                                                this.f97257e.cancel();
                                                this.f97250H.tryTerminateConsumer(this.f97260N);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f97253a.isUnbounded()) {
                                            this.f97260N.onNext(obj);
                                        } else {
                                            this.f97251L = true;
                                            this.f97253a.setSubscription(new C15002g(obj, this.f97253a));
                                        }
                                    } else {
                                        this.f97251L = true;
                                        zjdVar.subscribe(this.f97253a);
                                    }
                                } catch (Throwable th2) {
                                    o75.throwIfFatal(th2);
                                    this.f97257e.cancel();
                                    this.f97250H.tryAddThrowableOrReport(th2);
                                    this.f97250H.tryTerminateConsumer(this.f97260N);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            o75.throwIfFatal(th3);
                            this.f97257e.cancel();
                            this.f97250H.tryAddThrowableOrReport(th3);
                            this.f97250H.tryTerminateConsumer(this.f97260N);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.x96.AbstractC14997b
        /* JADX INFO: renamed from: b */
        public void mo25059b() {
            this.f97260N.onSubscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f97249F) {
                return;
            }
            this.f97249F = true;
            this.f97253a.cancel();
            this.f97257e.cancel();
            this.f97250H.tryTerminateAndReport();
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerError(Throwable e) {
            if (this.f97250H.tryAddThrowableOrReport(e)) {
                if (!this.f97261Q) {
                    this.f97257e.cancel();
                    this.f97248C = true;
                }
                this.f97251L = false;
                mo25058a();
            }
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerNext(R value) {
            this.f97260N.onNext(value);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f97250H.tryAddThrowableOrReport(t)) {
                this.f97248C = true;
                mo25058a();
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f97253a.request(n);
        }
    }

    /* JADX INFO: renamed from: x96$d */
    public static final class C14999d<T, R> extends AbstractC14997b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: N */
        public final ycg<? super R> f97262N;

        /* JADX INFO: renamed from: Q */
        public final AtomicInteger f97263Q;

        public C14999d(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch) {
            super(mapper, prefetch);
            this.f97262N = actual;
            this.f97263Q = new AtomicInteger();
        }

        @Override // p000.x96.AbstractC14997b
        /* JADX INFO: renamed from: a */
        public void mo25058a() {
            if (this.f97263Q.getAndIncrement() == 0) {
                while (!this.f97249F) {
                    if (!this.f97251L) {
                        boolean z = this.f97248C;
                        try {
                            T tPoll = this.f97259m.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.f97262N.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    zjd<? extends R> zjdVarApply = this.f97254b.apply(tPoll);
                                    Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                                    zjd<? extends R> zjdVar = zjdVarApply;
                                    if (this.f97252M != 1) {
                                        int i = this.f97258f + 1;
                                        if (i == this.f97256d) {
                                            this.f97258f = 0;
                                            this.f97257e.request(i);
                                        } else {
                                            this.f97258f = i;
                                        }
                                    }
                                    if (zjdVar instanceof nfg) {
                                        try {
                                            Object obj = ((nfg) zjdVar).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f97253a.isUnbounded()) {
                                                this.f97251L = true;
                                                this.f97253a.setSubscription(new C15002g(obj, this.f97253a));
                                            } else if (!xd7.onNext(this.f97262N, obj, this, this.f97250H)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            o75.throwIfFatal(th);
                                            this.f97257e.cancel();
                                            this.f97250H.tryAddThrowableOrReport(th);
                                            this.f97250H.tryTerminateConsumer(this.f97262N);
                                            return;
                                        }
                                    } else {
                                        this.f97251L = true;
                                        zjdVar.subscribe(this.f97253a);
                                    }
                                } catch (Throwable th2) {
                                    o75.throwIfFatal(th2);
                                    this.f97257e.cancel();
                                    this.f97250H.tryAddThrowableOrReport(th2);
                                    this.f97250H.tryTerminateConsumer(this.f97262N);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            o75.throwIfFatal(th3);
                            this.f97257e.cancel();
                            this.f97250H.tryAddThrowableOrReport(th3);
                            this.f97250H.tryTerminateConsumer(this.f97262N);
                            return;
                        }
                    }
                    if (this.f97263Q.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.x96.AbstractC14997b
        /* JADX INFO: renamed from: b */
        public void mo25059b() {
            this.f97262N.onSubscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f97249F) {
                return;
            }
            this.f97249F = true;
            this.f97253a.cancel();
            this.f97257e.cancel();
            this.f97250H.tryTerminateAndReport();
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerError(Throwable e) {
            this.f97257e.cancel();
            xd7.onError(this.f97262N, e, this, this.f97250H);
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerNext(R value) {
            xd7.onNext(this.f97262N, value, this, this.f97250H);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f97253a.cancel();
            xd7.onError(this.f97262N, t, this, this.f97250H);
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f97253a.request(n);
        }
    }

    /* JADX INFO: renamed from: x96$e */
    public static final class C15000e<R> extends gdg implements kj6<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: F */
        public final InterfaceC15001f<R> f97264F;

        /* JADX INFO: renamed from: H */
        public long f97265H;

        public C15000e(InterfaceC15001f<R> parent) {
            super(false);
            this.f97264F = parent;
        }

        @Override // p000.ycg
        public void onComplete() {
            long j = this.f97265H;
            if (j != 0) {
                this.f97265H = 0L;
                produced(j);
            }
            this.f97264F.innerComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            long j = this.f97265H;
            if (j != 0) {
                this.f97265H = 0L;
                produced(j);
            }
            this.f97264F.innerError(t);
        }

        @Override // p000.ycg
        public void onNext(R t) {
            this.f97265H++;
            this.f97264F.innerNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            setSubscription(s);
        }
    }

    /* JADX INFO: renamed from: x96$f */
    public interface InterfaceC15001f<T> {
        void innerComplete();

        void innerError(Throwable e);

        void innerNext(T value);
    }

    /* JADX INFO: renamed from: x96$g */
    public static final class C15002g<T> extends AtomicBoolean implements fdg {
        private static final long serialVersionUID = -7606889335172043256L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f97266a;

        /* JADX INFO: renamed from: b */
        public final T f97267b;

        public C15002g(T value, ycg<? super T> downstream) {
            this.f97267b = value;
            this.f97266a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
        }

        @Override // p000.fdg
        public void request(long j) {
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            ycg<? super T> ycgVar = this.f97266a;
            ycgVar.onNext(this.f97267b);
            ycgVar.onComplete();
        }
    }

    public x96(l86<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, e55 errorMode) {
        super(source);
        this.f97244c = mapper;
        this.f97245d = prefetch;
        this.f97246e = errorMode;
    }

    public static <T, R> ycg<T> subscribe(ycg<? super R> s, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, e55 errorMode) {
        int i = C14996a.f97247a[errorMode.ordinal()];
        return i != 1 ? i != 2 ? new C14999d(s, mapper, prefetch) : new C14998c(s, mapper, prefetch, true) : new C14998c(s, mapper, prefetch, false);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        if (fi6.tryScalarXMapSubscribe(this.f49321b, s, this.f97244c)) {
            return;
        }
        this.f49321b.subscribe(subscribe(s, this.f97244c, this.f97245d, this.f97246e));
    }
}
