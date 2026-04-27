package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class uk6<T> extends AbstractC7714j1<T, j1h<T>> {

    /* JADX INFO: renamed from: c */
    public final woe f88227c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f88228d;

    /* JADX INFO: renamed from: uk6$a */
    public static final class C13566a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super j1h<T>> f88229a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f88230b;

        /* JADX INFO: renamed from: c */
        public final woe f88231c;

        /* JADX INFO: renamed from: d */
        public fdg f88232d;

        /* JADX INFO: renamed from: e */
        public long f88233e;

        public C13566a(ycg<? super j1h<T>> actual, TimeUnit unit, woe scheduler) {
            this.f88229a = actual;
            this.f88231c = scheduler;
            this.f88230b = unit;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f88232d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88229a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f88229a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long jNow = this.f88231c.now(this.f88230b);
            long j = this.f88233e;
            this.f88233e = jNow;
            this.f88229a.onNext(new j1h(t, jNow - j, this.f88230b));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f88232d, s)) {
                this.f88233e = this.f88231c.now(this.f88230b);
                this.f88232d = s;
                this.f88229a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f88232d.request(n);
        }
    }

    public uk6(l86<T> source, TimeUnit unit, woe scheduler) {
        super(source);
        this.f88227c = scheduler;
        this.f88228d = unit;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super j1h<T>> s) {
        this.f49321b.subscribe((kj6) new C13566a(s, this.f88228d, this.f88227c));
    }
}
