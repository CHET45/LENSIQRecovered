package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class imb<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f47488a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f47489b;

    /* JADX INFO: renamed from: c */
    public final e55 f47490c;

    /* JADX INFO: renamed from: d */
    public final int f47491d;

    /* JADX INFO: renamed from: imb$a */
    public static final class C7505a<T> extends wo2<T> {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: C */
        public final ch2 f47492C;

        /* JADX INFO: renamed from: F */
        public final sy6<? super T, ? extends ph2> f47493F;

        /* JADX INFO: renamed from: H */
        public final a f47494H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f47495L;

        /* JADX INFO: renamed from: imb$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: a */
            public final C7505a<?> f47496a;

            public a(C7505a<?> parent) {
                this.f47496a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m13191a() {
                zf4.dispose(this);
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f47496a.m13189e();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f47496a.m13190f(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public C7505a(ch2 downstream, sy6<? super T, ? extends ph2> mapper, e55 errorMode, int prefetch) {
            super(prefetch, errorMode);
            this.f47492C = downstream;
            this.f47493F = mapper;
            this.f47494H = new a(this);
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: b */
        public void mo13186b() {
            this.f47494H.m13191a();
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: c */
        public void mo13187c() {
            ph2 ph2Var;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            bc0 bc0Var = this.f94898a;
            e55 e55Var = this.f94900c;
            zif<T> zifVar = this.f94901d;
            while (!this.f94904m) {
                if (bc0Var.get() != null && (e55Var == e55.IMMEDIATE || (e55Var == e55.BOUNDARY && !this.f47495L))) {
                    this.f94904m = true;
                    zifVar.clear();
                    bc0Var.tryTerminateConsumer(this.f47492C);
                    return;
                }
                if (!this.f47495L) {
                    boolean z2 = this.f94903f;
                    try {
                        T tPoll = zifVar.poll();
                        if (tPoll != null) {
                            ph2 ph2VarApply = this.f47493F.apply(tPoll);
                            Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                            ph2Var = ph2VarApply;
                            z = false;
                        } else {
                            ph2Var = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.f94904m = true;
                            bc0Var.tryTerminateConsumer(this.f47492C);
                            return;
                        } else if (!z) {
                            this.f47495L = true;
                            ph2Var.subscribe(this.f47494H);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f94904m = true;
                        zifVar.clear();
                        this.f94902e.dispose();
                        bc0Var.tryAddThrowableOrReport(th);
                        bc0Var.tryTerminateConsumer(this.f47492C);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            zifVar.clear();
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: d */
        public void mo13188d() {
            this.f47492C.onSubscribe(this);
        }

        /* JADX INFO: renamed from: e */
        public void m13189e() {
            this.f47495L = false;
            mo13187c();
        }

        /* JADX INFO: renamed from: f */
        public void m13190f(Throwable ex) {
            if (this.f94898a.tryAddThrowableOrReport(ex)) {
                if (this.f94900c != e55.END) {
                    this.f94902e.dispose();
                }
                this.f47495L = false;
                mo13187c();
            }
        }
    }

    public imb(vkb<T> source, sy6<? super T, ? extends ph2> mapper, e55 errorMode, int prefetch) {
        this.f47488a = source;
        this.f47489b = mapper;
        this.f47490c = errorMode;
        this.f47491d = prefetch;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        if (mme.m17404a(this.f47488a, this.f47489b, observer)) {
            return;
        }
        this.f47488a.subscribe(new C7505a(observer, this.f47489b, this.f47490c, this.f47491d));
    }
}
