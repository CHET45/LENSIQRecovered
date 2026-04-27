package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class nh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f64512c;

    /* JADX INFO: renamed from: nh6$a */
    public static final class C9876a<T> extends AtomicInteger implements kj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f64513a;

        /* JADX INFO: renamed from: b */
        public final gdg f64514b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f64515c;

        /* JADX INFO: renamed from: d */
        public long f64516d;

        /* JADX INFO: renamed from: e */
        public long f64517e;

        public C9876a(ycg<? super T> actual, long count, gdg sa, zjd<? extends T> source) {
            this.f64513a = actual;
            this.f64514b = sa;
            this.f64515c = source;
            this.f64516d = count;
        }

        /* JADX INFO: renamed from: a */
        public void m17948a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f64514b.isCancelled()) {
                    long j = this.f64517e;
                    if (j != 0) {
                        this.f64517e = 0L;
                        this.f64514b.produced(j);
                    }
                    this.f64515c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            long j = this.f64516d;
            if (j != Long.MAX_VALUE) {
                this.f64516d = j - 1;
            }
            if (j != 0) {
                m17948a();
            } else {
                this.f64513a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f64513a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f64517e++;
            this.f64513a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f64514b.setSubscription(s);
        }
    }

    public nh6(l86<T> source, long count) {
        super(source);
        this.f64512c = count;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        gdg gdgVar = new gdg(false);
        s.onSubscribe(gdgVar);
        long j = this.f64512c;
        new C9876a(s, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, gdgVar, this.f49321b).m17948a();
    }
}
