package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gvb<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f41468a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f41469b;

    /* JADX INFO: renamed from: c */
    public final boolean f41470c;

    /* JADX INFO: renamed from: gvb$a */
    public static final class C6594a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: C */
        public static final a f41471C = new a(null);

        /* JADX INFO: renamed from: a */
        public final ch2 f41472a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends ph2> f41473b;

        /* JADX INFO: renamed from: c */
        public final boolean f41474c;

        /* JADX INFO: renamed from: d */
        public final bc0 f41475d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a> f41476e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public volatile boolean f41477f;

        /* JADX INFO: renamed from: m */
        public lf4 f41478m;

        /* JADX INFO: renamed from: gvb$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: a */
            public final C6594a<?> f41479a;

            public a(C6594a<?> parent) {
                this.f41479a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m12003a() {
                zf4.dispose(this);
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f41479a.m12001b(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f41479a.m12002c(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C6594a(ch2 downstream, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
            this.f41472a = downstream;
            this.f41473b = mapper;
            this.f41474c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m12000a() {
            AtomicReference<a> atomicReference = this.f41476e;
            a aVar = f41471C;
            a andSet = atomicReference.getAndSet(aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m12003a();
        }

        /* JADX INFO: renamed from: b */
        public void m12001b(a sender) {
            if (v7b.m23844a(this.f41476e, sender, null) && this.f41477f) {
                this.f41475d.tryTerminateConsumer(this.f41472a);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m12002c(a sender, Throwable error) {
            if (!v7b.m23844a(this.f41476e, sender, null)) {
                ofe.onError(error);
                return;
            }
            if (this.f41475d.tryAddThrowableOrReport(error)) {
                if (this.f41474c) {
                    if (this.f41477f) {
                        this.f41475d.tryTerminateConsumer(this.f41472a);
                    }
                } else {
                    this.f41478m.dispose();
                    m12000a();
                    this.f41475d.tryTerminateConsumer(this.f41472a);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f41478m.dispose();
            m12000a();
            this.f41475d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f41476e.get() == f41471C;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f41477f = true;
            if (this.f41476e.get() == null) {
                this.f41475d.tryTerminateConsumer(this.f41472a);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f41475d.tryAddThrowableOrReport(t)) {
                if (this.f41474c) {
                    onComplete();
                } else {
                    m12000a();
                    this.f41475d.tryTerminateConsumer(this.f41472a);
                }
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            a aVar;
            try {
                ph2 ph2VarApply = this.f41473b.apply(t);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                a aVar2 = new a(this);
                do {
                    aVar = this.f41476e.get();
                    if (aVar == f41471C) {
                        return;
                    }
                } while (!v7b.m23844a(this.f41476e, aVar, aVar2));
                if (aVar != null) {
                    aVar.m12003a();
                }
                ph2Var.subscribe(aVar2);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f41478m.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f41478m, d)) {
                this.f41478m = d;
                this.f41472a.onSubscribe(this);
            }
        }
    }

    public gvb(vkb<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        this.f41468a = source;
        this.f41469b = mapper;
        this.f41470c = delayErrors;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        if (mme.m17404a(this.f41468a, this.f41469b, observer)) {
            return;
        }
        this.f41468a.subscribe(new C6594a(observer, this.f41469b, this.f41470c));
    }
}
