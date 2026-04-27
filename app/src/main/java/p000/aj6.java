package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class aj6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f1740c;

    /* JADX INFO: renamed from: aj6$a */
    public static final class C0290a<T> extends ArrayDeque<T> implements kj6<T>, fdg {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f1741a;

        /* JADX INFO: renamed from: b */
        public final int f1742b;

        /* JADX INFO: renamed from: c */
        public fdg f1743c;

        public C0290a(ycg<? super T> actual, int skip) {
            super(skip);
            this.f1741a = actual;
            this.f1742b = skip;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f1743c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f1741a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f1741a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f1742b == size()) {
                this.f1741a.onNext(poll());
            } else {
                this.f1743c.request(1L);
            }
            offer(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f1743c, s)) {
                this.f1743c = s;
                this.f1741a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f1743c.request(n);
        }
    }

    public aj6(l86<T> source, int skip) {
        super(source);
        this.f1740c = skip;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C0290a(s, this.f1740c));
    }
}
