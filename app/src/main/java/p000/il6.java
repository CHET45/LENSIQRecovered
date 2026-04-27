package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class il6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final woe f47341c;

    /* JADX INFO: renamed from: il6$a */
    public static final class C7329a<T> extends AtomicBoolean implements kj6<T>, fdg {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f47342a;

        /* JADX INFO: renamed from: b */
        public final woe f47343b;

        /* JADX INFO: renamed from: c */
        public fdg f47344c;

        /* JADX INFO: renamed from: il6$a$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C7329a.this.f47344c.cancel();
            }
        }

        public C7329a(ycg<? super T> actual, woe scheduler) {
            this.f47342a = actual;
            this.f47343b = scheduler;
        }

        @Override // p000.fdg
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f47343b.scheduleDirect(new a());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f47342a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (get()) {
                ofe.onError(t);
            } else {
                this.f47342a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f47342a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f47344c, s)) {
                this.f47344c = s;
                this.f47342a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f47344c.request(n);
        }
    }

    public il6(l86<T> source, woe scheduler) {
        super(source);
        this.f47341c = scheduler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C7329a(s, this.f47341c));
    }
}
