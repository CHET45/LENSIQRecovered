package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ag6<T> extends AbstractC7714j1<T, T> implements uu2<T> {

    /* JADX INFO: renamed from: c */
    public final uu2<? super T> f1392c;

    /* JADX INFO: renamed from: ag6$a */
    public static final class C0218a<T> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = -6246093802440953054L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f1393a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f1394b;

        /* JADX INFO: renamed from: c */
        public fdg f1395c;

        /* JADX INFO: renamed from: d */
        public boolean f1396d;

        public C0218a(ycg<? super T> actual, uu2<? super T> onDrop) {
            this.f1393a = actual;
            this.f1394b = onDrop;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f1395c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f1396d) {
                return;
            }
            this.f1396d = true;
            this.f1393a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f1396d) {
                ofe.onError(t);
            } else {
                this.f1396d = true;
                this.f1393a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f1396d) {
                return;
            }
            if (get() != 0) {
                this.f1393a.onNext(t);
                ro0.produced(this, 1L);
                return;
            }
            try {
                this.f1394b.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f1395c, s)) {
                this.f1395c = s;
                this.f1393a.onSubscribe(this);
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

    public ag6(l86<T> source) {
        super(source);
        this.f1392c = this;
    }

    @Override // p000.uu2
    public void accept(T t) {
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C0218a(s, this.f1392c));
    }

    public ag6(l86<T> source, uu2<? super T> onDrop) {
        super(source);
        this.f1392c = onDrop;
    }
}
