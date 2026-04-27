package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rj6<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final l86<T> f78433a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f78434b;

    /* JADX INFO: renamed from: c */
    public final boolean f78435c;

    /* JADX INFO: renamed from: rj6$a */
    public static final class C12118a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: C */
        public static final a f78436C = new a(null);

        /* JADX INFO: renamed from: a */
        public final ch2 f78437a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends ph2> f78438b;

        /* JADX INFO: renamed from: c */
        public final boolean f78439c;

        /* JADX INFO: renamed from: d */
        public final bc0 f78440d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a> f78441e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public volatile boolean f78442f;

        /* JADX INFO: renamed from: m */
        public fdg f78443m;

        /* JADX INFO: renamed from: rj6$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: a */
            public final C12118a<?> f78444a;

            public a(C12118a<?> parent) {
                this.f78444a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m21387a() {
                zf4.dispose(this);
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f78444a.m21385b(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f78444a.m21386c(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C12118a(ch2 downstream, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
            this.f78437a = downstream;
            this.f78438b = mapper;
            this.f78439c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m21384a() {
            AtomicReference<a> atomicReference = this.f78441e;
            a aVar = f78436C;
            a andSet = atomicReference.getAndSet(aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m21387a();
        }

        /* JADX INFO: renamed from: b */
        public void m21385b(a sender) {
            if (v7b.m23844a(this.f78441e, sender, null) && this.f78442f) {
                this.f78440d.tryTerminateConsumer(this.f78437a);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m21386c(a sender, Throwable error) {
            if (!v7b.m23844a(this.f78441e, sender, null)) {
                ofe.onError(error);
                return;
            }
            if (this.f78440d.tryAddThrowableOrReport(error)) {
                if (this.f78439c) {
                    if (this.f78442f) {
                        this.f78440d.tryTerminateConsumer(this.f78437a);
                    }
                } else {
                    this.f78443m.cancel();
                    m21384a();
                    this.f78440d.tryTerminateConsumer(this.f78437a);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f78443m.cancel();
            m21384a();
            this.f78440d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f78441e.get() == f78436C;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f78442f = true;
            if (this.f78441e.get() == null) {
                this.f78440d.tryTerminateConsumer(this.f78437a);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f78440d.tryAddThrowableOrReport(t)) {
                if (this.f78439c) {
                    onComplete();
                } else {
                    m21384a();
                    this.f78440d.tryTerminateConsumer(this.f78437a);
                }
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a aVar;
            try {
                ph2 ph2VarApply = this.f78438b.apply(t);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                a aVar2 = new a(this);
                do {
                    aVar = this.f78441e.get();
                    if (aVar == f78436C) {
                        return;
                    }
                } while (!v7b.m23844a(this.f78441e, aVar, aVar2));
                if (aVar != null) {
                    aVar.m21387a();
                }
                ph2Var.subscribe(aVar2);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f78443m.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f78443m, s)) {
                this.f78443m = s;
                this.f78437a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public rj6(l86<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        this.f78433a = source;
        this.f78434b = mapper;
        this.f78435c = delayErrors;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f78433a.subscribe((kj6) new C12118a(observer, this.f78434b, this.f78435c));
    }
}
