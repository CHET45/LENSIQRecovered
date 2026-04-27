package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class z96<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final l86<T> f104454a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f104455b;

    /* JADX INFO: renamed from: c */
    public final e55 f104456c;

    /* JADX INFO: renamed from: d */
    public final int f104457d;

    /* JADX INFO: renamed from: z96$a */
    public static final class C16040a<T> extends xo2<T> implements lf4 {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: F */
        public final ch2 f104458F;

        /* JADX INFO: renamed from: H */
        public final sy6<? super T, ? extends ph2> f104459H;

        /* JADX INFO: renamed from: L */
        public final a f104460L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f104461M;

        /* JADX INFO: renamed from: N */
        public int f104462N;

        /* JADX INFO: renamed from: z96$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: a */
            public final C16040a<?> f104463a;

            public a(C16040a<?> parent) {
                this.f104463a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m26619a() {
                zf4.dispose(this);
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f104463a.m26617f();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f104463a.m26618g(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public C16040a(ch2 downstream, sy6<? super T, ? extends ph2> mapper, e55 errorMode, int prefetch) {
            super(prefetch, errorMode);
            this.f104458F = downstream;
            this.f104459H = mapper;
            this.f104460L = new a(this);
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: b */
        public void mo10763b() {
            this.f104460L.m26619a();
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: c */
        public void mo10764c() {
            if (getAndIncrement() != 0) {
                return;
            }
            e55 e55Var = this.f98772c;
            zif<T> zifVar = this.f98773d;
            bc0 bc0Var = this.f98770a;
            boolean z = this.f98769C;
            while (!this.f98776m) {
                if (bc0Var.get() != null && (e55Var == e55.IMMEDIATE || (e55Var == e55.BOUNDARY && !this.f104461M))) {
                    zifVar.clear();
                    bc0Var.tryTerminateConsumer(this.f104458F);
                    return;
                }
                if (!this.f104461M) {
                    boolean z2 = this.f98775f;
                    try {
                        T tPoll = zifVar.poll();
                        boolean z3 = tPoll == null;
                        if (z2 && z3) {
                            bc0Var.tryTerminateConsumer(this.f104458F);
                            return;
                        }
                        if (!z3) {
                            int i = this.f98771b;
                            int i2 = i - (i >> 1);
                            if (!z) {
                                int i3 = this.f104462N + 1;
                                if (i3 == i2) {
                                    this.f104462N = 0;
                                    this.f98774e.request(i2);
                                } else {
                                    this.f104462N = i3;
                                }
                            }
                            try {
                                ph2 ph2VarApply = this.f104459H.apply(tPoll);
                                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                                ph2 ph2Var = ph2VarApply;
                                this.f104461M = true;
                                ph2Var.subscribe(this.f104460L);
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                zifVar.clear();
                                this.f98774e.cancel();
                                bc0Var.tryAddThrowableOrReport(th);
                                bc0Var.tryTerminateConsumer(this.f104458F);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        this.f98774e.cancel();
                        bc0Var.tryAddThrowableOrReport(th2);
                        bc0Var.tryTerminateConsumer(this.f104458F);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            zifVar.clear();
        }

        @Override // p000.xo2
        /* JADX INFO: renamed from: d */
        public void mo10765d() {
            this.f104458F.onSubscribe(this);
        }

        @Override // p000.lf4
        public void dispose() {
            m25357e();
        }

        /* JADX INFO: renamed from: f */
        public void m26617f() {
            this.f104461M = false;
            mo10764c();
        }

        /* JADX INFO: renamed from: g */
        public void m26618g(Throwable ex) {
            if (this.f98770a.tryAddThrowableOrReport(ex)) {
                if (this.f98772c != e55.IMMEDIATE) {
                    this.f104461M = false;
                    mo10764c();
                    return;
                }
                this.f98774e.cancel();
                this.f98770a.tryTerminateConsumer(this.f104458F);
                if (getAndIncrement() == 0) {
                    this.f98773d.clear();
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f98776m;
        }
    }

    public z96(l86<T> source, sy6<? super T, ? extends ph2> mapper, e55 errorMode, int prefetch) {
        this.f104454a = source;
        this.f104455b = mapper;
        this.f104456c = errorMode;
        this.f104457d = prefetch;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f104454a.subscribe((kj6) new C16040a(observer, this.f104455b, this.f104456c, this.f104457d));
    }
}
