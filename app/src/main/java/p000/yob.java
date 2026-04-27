package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class yob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f102415b;

    /* JADX INFO: renamed from: c */
    public final boolean f102416c;

    /* JADX INFO: renamed from: yob$a */
    public static final class C15745a<T> extends pv0<T> implements pxb<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f102417a;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends ph2> f102419c;

        /* JADX INFO: renamed from: d */
        public final boolean f102420d;

        /* JADX INFO: renamed from: f */
        public lf4 f102422f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f102423m;

        /* JADX INFO: renamed from: b */
        public final bc0 f102418b = new bc0();

        /* JADX INFO: renamed from: e */
        public final mm2 f102421e = new mm2();

        /* JADX INFO: renamed from: yob$a$a */
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
                C15745a.this.m26257a(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                C15745a.this.m26258b(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C15745a(pxb<? super T> observer, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
            this.f102417a = observer;
            this.f102419c = mapper;
            this.f102420d = delayErrors;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m26257a(C15745a<T>.a inner) {
            this.f102421e.delete(inner);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m26258b(C15745a<T>.a inner, Throwable e) {
            this.f102421e.delete(inner);
            onError(e);
        }

        @Override // p000.zif
        public void clear() {
        }

        @Override // p000.lf4
        public void dispose() {
            this.f102423m = true;
            this.f102422f.dispose();
            this.f102421e.dispose();
            this.f102418b.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f102422f.isDisposed();
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f102418b.tryTerminateConsumer(this.f102417a);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f102418b.tryAddThrowableOrReport(e)) {
                if (this.f102420d) {
                    if (decrementAndGet() == 0) {
                        this.f102418b.tryTerminateConsumer(this.f102417a);
                    }
                } else {
                    this.f102423m = true;
                    this.f102422f.dispose();
                    this.f102421e.dispose();
                    this.f102418b.tryTerminateConsumer(this.f102417a);
                }
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            try {
                ph2 ph2VarApply = this.f102419c.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f102423m || !this.f102421e.add(aVar)) {
                    return;
                }
                ph2Var.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f102422f.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f102422f, d)) {
                this.f102422f = d;
                this.f102417a.onSubscribe(this);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return null;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return mode & 2;
        }
    }

    public yob(wub<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        super(source);
        this.f102415b = mapper;
        this.f102416c = delayErrors;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C15745a(observer, this.f102415b, this.f102416c));
    }
}
