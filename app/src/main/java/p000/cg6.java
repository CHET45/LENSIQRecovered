package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class cg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: cg6$a */
    public static final class C2304a<T> extends AtomicLong implements kj6<T>, fdg {
        private static final long serialVersionUID = -3176480756392482682L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16465a;

        /* JADX INFO: renamed from: b */
        public fdg f16466b;

        /* JADX INFO: renamed from: c */
        public boolean f16467c;

        public C2304a(ycg<? super T> downstream) {
            this.f16465a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16466b.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16467c) {
                return;
            }
            this.f16467c = true;
            this.f16465a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f16467c) {
                ofe.onError(t);
            } else {
                this.f16467c = true;
                this.f16465a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16467c) {
                return;
            }
            if (get() != 0) {
                this.f16465a.onNext(t);
                ro0.produced(this, 1L);
            } else {
                this.f16466b.cancel();
                onError(new bwa("could not emit value due to lack of requests"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16466b, s)) {
                this.f16466b = s;
                this.f16465a.onSubscribe(this);
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

    public cg6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C2304a(s));
    }
}
