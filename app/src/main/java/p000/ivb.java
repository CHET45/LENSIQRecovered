package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ivb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f48553a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f48554b;

    /* JADX INFO: renamed from: c */
    public final boolean f48555c;

    /* JADX INFO: renamed from: ivb$a */
    public static final class C7632a<T, R> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: F */
        public static final a<Object> f48556F = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f48557C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f48558a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends z9a<? extends R>> f48559b;

        /* JADX INFO: renamed from: c */
        public final boolean f48560c;

        /* JADX INFO: renamed from: d */
        public final bc0 f48561d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a<R>> f48562e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public lf4 f48563f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f48564m;

        /* JADX INFO: renamed from: ivb$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements k9a<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C7632a<?, R> f48565a;

            /* JADX INFO: renamed from: b */
            public volatile R f48566b;

            public a(C7632a<?, R> parent) {
                this.f48565a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m13445a() {
                zf4.dispose(this);
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f48565a.m13443c(this);
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f48565a.m13444d(this, e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R t) {
                this.f48566b = t;
                this.f48565a.m13442b();
            }
        }

        public C7632a(pxb<? super R> downstream, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
            this.f48558a = downstream;
            this.f48559b = mapper;
            this.f48560c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m13441a() {
            AtomicReference<a<R>> atomicReference = this.f48562e;
            a<Object> aVar = f48556F;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m13445a();
        }

        /* JADX INFO: renamed from: b */
        public void m13442b() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super R> pxbVar = this.f48558a;
            bc0 bc0Var = this.f48561d;
            AtomicReference<a<R>> atomicReference = this.f48562e;
            int iAddAndGet = 1;
            while (!this.f48557C) {
                if (bc0Var.get() != null && !this.f48560c) {
                    bc0Var.tryTerminateConsumer(pxbVar);
                    return;
                }
                boolean z = this.f48564m;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    bc0Var.tryTerminateConsumer(pxbVar);
                    return;
                } else if (z2 || aVar.f48566b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    pxbVar.onNext(aVar.f48566b);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m13443c(a<R> sender) {
            if (v7b.m23844a(this.f48562e, sender, null)) {
                m13442b();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13444d(a<R> sender, Throwable ex) {
            if (!v7b.m23844a(this.f48562e, sender, null)) {
                ofe.onError(ex);
            } else if (this.f48561d.tryAddThrowableOrReport(ex)) {
                if (!this.f48560c) {
                    this.f48563f.dispose();
                    m13441a();
                }
                m13442b();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f48557C = true;
            this.f48563f.dispose();
            m13441a();
            this.f48561d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f48557C;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f48564m = true;
            m13442b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f48561d.tryAddThrowableOrReport(t)) {
                if (!this.f48560c) {
                    m13441a();
                }
                this.f48564m = true;
                m13442b();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f48562e.get();
            if (aVar2 != null) {
                aVar2.m13445a();
            }
            try {
                z9a<? extends R> z9aVarApply = this.f48559b.apply(t);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                a aVar3 = new a(this);
                do {
                    aVar = this.f48562e.get();
                    if (aVar == f48556F) {
                        return;
                    }
                } while (!v7b.m23844a(this.f48562e, aVar, aVar3));
                z9aVar.subscribe(aVar3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f48563f.dispose();
                this.f48562e.getAndSet((a<R>) f48556F);
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f48563f, d)) {
                this.f48563f = d;
                this.f48558a.onSubscribe(this);
            }
        }
    }

    public ivb(vkb<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
        this.f48553a = source;
        this.f48554b = mapper;
        this.f48555c = delayErrors;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        if (mme.m17405b(this.f48553a, this.f48554b, observer)) {
            return;
        }
        this.f48553a.subscribe(new C7632a(observer, this.f48554b, this.f48555c));
    }
}
