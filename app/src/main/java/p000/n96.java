package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class n96<T, U> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final nfg<? extends U> f63745c;

    /* JADX INFO: renamed from: d */
    public final e11<? super U, ? super T> f63746d;

    /* JADX INFO: renamed from: n96$a */
    public static final class C9754a<T, U> extends j34<U> implements kj6<T> {
        private static final long serialVersionUID = -3589550218733891694L;

        /* JADX INFO: renamed from: L */
        public final e11<? super U, ? super T> f63747L;

        /* JADX INFO: renamed from: M */
        public final U f63748M;

        /* JADX INFO: renamed from: N */
        public fdg f63749N;

        /* JADX INFO: renamed from: Q */
        public boolean f63750Q;

        public C9754a(ycg<? super U> actual, U u, e11<? super U, ? super T> collector) {
            super(actual);
            this.f63747L = collector;
            this.f63748M = u;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f63749N.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f63750Q) {
                return;
            }
            this.f63750Q = true;
            complete(this.f63748M);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f63750Q) {
                ofe.onError(t);
            } else {
                this.f63750Q = true;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f63750Q) {
                return;
            }
            try {
                this.f63747L.accept(this.f63748M, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f63749N.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f63749N, s)) {
                this.f63749N = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public n96(l86<T> source, nfg<? extends U> initialSupplier, e11<? super U, ? super T> collector) {
        super(source);
        this.f63745c = initialSupplier;
        this.f63746d = collector;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        try {
            U u = this.f63745c.get();
            Objects.requireNonNull(u, "The initial value supplied is null");
            this.f49321b.subscribe((kj6) new C9754a(s, u, this.f63746d));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
