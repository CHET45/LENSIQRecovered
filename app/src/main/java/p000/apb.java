package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class apb<T> extends xd2 implements y07<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f11540a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f11541b;

    /* JADX INFO: renamed from: c */
    public final boolean f11542c;

    /* JADX INFO: renamed from: apb$a */
    public static final class C1547a<T> extends AtomicInteger implements lf4, pxb<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a */
        public final ch2 f11543a;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends ph2> f11545c;

        /* JADX INFO: renamed from: d */
        public final boolean f11546d;

        /* JADX INFO: renamed from: f */
        public lf4 f11548f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f11549m;

        /* JADX INFO: renamed from: b */
        public final bc0 f11544b = new bc0();

        /* JADX INFO: renamed from: e */
        public final mm2 f11547e = new mm2();

        /* JADX INFO: renamed from: apb$a$a */
        public final class a extends AtomicReference<lf4> implements ch2, lf4 {
            private static final long serialVersionUID = 8606673141535671828L;

            public a() {
            }

            @Override // p000.lf4
            public void dispose() {
                zf4.dispose(this);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return zf4.isDisposed(get());
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                C1547a.this.m2524a(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                C1547a.this.m2525b(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C1547a(ch2 observer, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
            this.f11543a = observer;
            this.f11545c = mapper;
            this.f11546d = delayErrors;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m2524a(C1547a<T>.a inner) {
            this.f11547e.delete(inner);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m2525b(C1547a<T>.a inner, Throwable e) {
            this.f11547e.delete(inner);
            onError(e);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f11549m = true;
            this.f11548f.dispose();
            this.f11547e.dispose();
            this.f11544b.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f11548f.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f11544b.tryTerminateConsumer(this.f11543a);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f11544b.tryAddThrowableOrReport(e)) {
                if (this.f11546d) {
                    if (decrementAndGet() == 0) {
                        this.f11544b.tryTerminateConsumer(this.f11543a);
                    }
                } else {
                    this.f11549m = true;
                    this.f11548f.dispose();
                    this.f11547e.dispose();
                    this.f11544b.tryTerminateConsumer(this.f11543a);
                }
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            try {
                ph2 ph2VarApply = this.f11545c.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f11549m || !this.f11547e.add(aVar)) {
                    return;
                }
                ph2Var.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f11548f.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f11548f, d)) {
                this.f11548f = d;
                this.f11543a.onSubscribe(this);
            }
        }
    }

    public apb(wub<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        this.f11540a = source;
        this.f11541b = mapper;
        this.f11542c = delayErrors;
    }

    @Override // p000.y07
    public vkb<T> fuseToObservable() {
        return ofe.onAssembly(new yob(this.f11540a, this.f11541b, this.f11542c));
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f11540a.subscribe(new C1547a(observer, this.f11541b, this.f11542c));
    }
}
