package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tc6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends ph2> f84241c;

    /* JADX INFO: renamed from: d */
    public final int f84242d;

    /* JADX INFO: renamed from: e */
    public final boolean f84243e;

    /* JADX INFO: renamed from: tc6$a */
    public static final class C12976a<T> extends rv0<T> implements kj6<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f84244C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f84245a;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends ph2> f84247c;

        /* JADX INFO: renamed from: d */
        public final boolean f84248d;

        /* JADX INFO: renamed from: f */
        public final int f84250f;

        /* JADX INFO: renamed from: m */
        public fdg f84251m;

        /* JADX INFO: renamed from: b */
        public final bc0 f84246b = new bc0();

        /* JADX INFO: renamed from: e */
        public final mm2 f84249e = new mm2();

        /* JADX INFO: renamed from: tc6$a$a */
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
                C12976a.this.m22459a(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                C12976a.this.m22460b(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C12976a(ycg<? super T> subscriber, sy6<? super T, ? extends ph2> mapper, boolean delayErrors, int maxConcurrency) {
            this.f84245a = subscriber;
            this.f84247c = mapper;
            this.f84248d = delayErrors;
            this.f84250f = maxConcurrency;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m22459a(C12976a<T>.a inner) {
            this.f84249e.delete(inner);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m22460b(C12976a<T>.a inner, Throwable e) {
            this.f84249e.delete(inner);
            onError(e);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84244C = true;
            this.f84251m.cancel();
            this.f84249e.dispose();
            this.f84246b.tryTerminateAndReport();
        }

        @Override // p000.zif
        public void clear() {
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f84246b.tryTerminateConsumer(this.f84245a);
            } else if (this.f84250f != Integer.MAX_VALUE) {
                this.f84251m.request(1L);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            if (this.f84246b.tryAddThrowableOrReport(e)) {
                if (!this.f84248d) {
                    this.f84244C = true;
                    this.f84251m.cancel();
                    this.f84249e.dispose();
                    this.f84246b.tryTerminateConsumer(this.f84245a);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f84246b.tryTerminateConsumer(this.f84245a);
                } else if (this.f84250f != Integer.MAX_VALUE) {
                    this.f84251m.request(1L);
                }
            }
        }

        @Override // p000.ycg
        public void onNext(T value) {
            try {
                ph2 ph2VarApply = this.f84247c.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f84244C || !this.f84249e.add(aVar)) {
                    return;
                }
                ph2Var.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f84251m.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84251m, s)) {
                this.f84251m = s;
                this.f84245a.onSubscribe(this);
                int i = this.f84250f;
                if (i == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
                } else {
                    s.request(i);
                }
            }
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return null;
        }

        @Override // p000.fdg
        public void request(long n) {
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return mode & 2;
        }
    }

    public tc6(l86<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors, int maxConcurrency) {
        super(source);
        this.f84241c = mapper;
        this.f84243e = delayErrors;
        this.f84242d = maxConcurrency;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        this.f49321b.subscribe((kj6) new C12976a(subscriber, this.f84241c, this.f84243e, this.f84242d));
    }
}
