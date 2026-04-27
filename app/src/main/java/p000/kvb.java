package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kvb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f55444a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends R>> f55445b;

    /* JADX INFO: renamed from: c */
    public final boolean f55446c;

    /* JADX INFO: renamed from: kvb$a */
    public static final class C8533a<T, R> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: F */
        public static final a<Object> f55447F = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f55448C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f55449a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends oof<? extends R>> f55450b;

        /* JADX INFO: renamed from: c */
        public final boolean f55451c;

        /* JADX INFO: renamed from: d */
        public final bc0 f55452d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a<R>> f55453e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public lf4 f55454f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f55455m;

        /* JADX INFO: renamed from: kvb$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements hnf<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C8533a<?, R> f55456a;

            /* JADX INFO: renamed from: b */
            public volatile R f55457b;

            public a(C8533a<?, R> parent) {
                this.f55456a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m15024a() {
                zf4.dispose(this);
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f55456a.m15023c(this, e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R t) {
                this.f55457b = t;
                this.f55456a.m15022b();
            }
        }

        public C8533a(pxb<? super R> downstream, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
            this.f55449a = downstream;
            this.f55450b = mapper;
            this.f55451c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m15021a() {
            AtomicReference<a<R>> atomicReference = this.f55453e;
            a<Object> aVar = f55447F;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m15024a();
        }

        /* JADX INFO: renamed from: b */
        public void m15022b() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super R> pxbVar = this.f55449a;
            bc0 bc0Var = this.f55452d;
            AtomicReference<a<R>> atomicReference = this.f55453e;
            int iAddAndGet = 1;
            while (!this.f55448C) {
                if (bc0Var.get() != null && !this.f55451c) {
                    bc0Var.tryTerminateConsumer(pxbVar);
                    return;
                }
                boolean z = this.f55455m;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    bc0Var.tryTerminateConsumer(pxbVar);
                    return;
                } else if (z2 || aVar.f55457b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    pxbVar.onNext(aVar.f55457b);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m15023c(a<R> sender, Throwable ex) {
            if (!v7b.m23844a(this.f55453e, sender, null)) {
                ofe.onError(ex);
            } else if (this.f55452d.tryAddThrowableOrReport(ex)) {
                if (!this.f55451c) {
                    this.f55454f.dispose();
                    m15021a();
                }
                m15022b();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f55448C = true;
            this.f55454f.dispose();
            m15021a();
            this.f55452d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f55448C;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f55455m = true;
            m15022b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f55452d.tryAddThrowableOrReport(t)) {
                if (!this.f55451c) {
                    m15021a();
                }
                this.f55455m = true;
                m15022b();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f55453e.get();
            if (aVar2 != null) {
                aVar2.m15024a();
            }
            try {
                oof<? extends R> oofVarApply = this.f55450b.apply(t);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                a aVar3 = new a(this);
                do {
                    aVar = this.f55453e.get();
                    if (aVar == f55447F) {
                        return;
                    }
                } while (!v7b.m23844a(this.f55453e, aVar, aVar3));
                oofVar.subscribe(aVar3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f55454f.dispose();
                this.f55453e.getAndSet((a<R>) f55447F);
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f55454f, d)) {
                this.f55454f = d;
                this.f55449a.onSubscribe(this);
            }
        }
    }

    public kvb(vkb<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
        this.f55444a = source;
        this.f55445b = mapper;
        this.f55446c = delayErrors;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        if (mme.m17406c(this.f55444a, this.f55445b, observer)) {
            return;
        }
        this.f55444a.subscribe(new C8533a(observer, this.f55445b, this.f55446c));
    }
}
