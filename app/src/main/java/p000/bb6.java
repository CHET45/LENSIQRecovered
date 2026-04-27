package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bb6<T, U> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<U>> f13229c;

    /* JADX INFO: renamed from: bb6$a */
    public static final class C1821a<T, U> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = 6725975399620862591L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13230a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<U>> f13231b;

        /* JADX INFO: renamed from: c */
        public fdg f13232c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f13233d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public volatile long f13234e;

        /* JADX INFO: renamed from: f */
        public boolean f13235f;

        /* JADX INFO: renamed from: bb6$a$a */
        public static final class a<T, U> extends ng4<U> {

            /* JADX INFO: renamed from: b */
            public final C1821a<T, U> f13236b;

            /* JADX INFO: renamed from: c */
            public final long f13237c;

            /* JADX INFO: renamed from: d */
            public final T f13238d;

            /* JADX INFO: renamed from: e */
            public boolean f13239e;

            /* JADX INFO: renamed from: f */
            public final AtomicBoolean f13240f = new AtomicBoolean();

            public a(C1821a<T, U> parent, long index, T value) {
                this.f13236b = parent;
                this.f13237c = index;
                this.f13238d = value;
            }

            /* JADX INFO: renamed from: d */
            public void m3028d() {
                if (this.f13240f.compareAndSet(false, true)) {
                    this.f13236b.m3027a(this.f13237c, this.f13238d);
                }
            }

            @Override // p000.ycg
            public void onComplete() {
                if (this.f13239e) {
                    return;
                }
                this.f13239e = true;
                m3028d();
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                if (this.f13239e) {
                    ofe.onError(t);
                } else {
                    this.f13239e = true;
                    this.f13236b.onError(t);
                }
            }

            @Override // p000.ycg
            public void onNext(U t) {
                if (this.f13239e) {
                    return;
                }
                this.f13239e = true;
                m17930a();
                m3028d();
            }
        }

        public C1821a(ycg<? super T> actual, sy6<? super T, ? extends zjd<U>> debounceSelector) {
            this.f13230a = actual;
            this.f13231b = debounceSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m3027a(long idx, T value) {
            if (idx == this.f13234e) {
                if (get() != 0) {
                    this.f13230a.onNext(value);
                    ro0.produced(this, 1L);
                } else {
                    cancel();
                    this.f13230a.onError(new bwa("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13232c.cancel();
            zf4.dispose(this.f13233d);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13235f) {
                return;
            }
            this.f13235f = true;
            lf4 lf4Var = this.f13233d.get();
            if (zf4.isDisposed(lf4Var)) {
                return;
            }
            a aVar = (a) lf4Var;
            if (aVar != null) {
                aVar.m3028d();
            }
            zf4.dispose(this.f13233d);
            this.f13230a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            zf4.dispose(this.f13233d);
            this.f13230a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13235f) {
                return;
            }
            long j = this.f13234e + 1;
            this.f13234e = j;
            lf4 lf4Var = this.f13233d.get();
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            try {
                zjd<U> zjdVarApply = this.f13231b.apply(t);
                Objects.requireNonNull(zjdVarApply, "The publisher supplied is null");
                zjd<U> zjdVar = zjdVarApply;
                a aVar = new a(this, j, t);
                if (v7b.m23844a(this.f13233d, lf4Var, aVar)) {
                    zjdVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                this.f13230a.onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13232c, s)) {
                this.f13232c = s;
                this.f13230a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }
    }

    public bb6(l86<T> source, sy6<? super T, ? extends zjd<U>> debounceSelector) {
        super(source);
        this.f13229c = debounceSelector;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C1821a(new u1f(s), this.f13229c));
    }
}
