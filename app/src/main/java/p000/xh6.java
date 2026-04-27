package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class xh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super Throwable> f97822c;

    /* JADX INFO: renamed from: d */
    public final long f97823d;

    /* JADX INFO: renamed from: xh6$a */
    public static final class C15072a<T> extends AtomicInteger implements kj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f97824a;

        /* JADX INFO: renamed from: b */
        public final gdg f97825b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f97826c;

        /* JADX INFO: renamed from: d */
        public final n8d<? super Throwable> f97827d;

        /* JADX INFO: renamed from: e */
        public long f97828e;

        /* JADX INFO: renamed from: f */
        public long f97829f;

        public C15072a(ycg<? super T> actual, long count, n8d<? super Throwable> predicate, gdg sa, zjd<? extends T> source) {
            this.f97824a = actual;
            this.f97825b = sa;
            this.f97826c = source;
            this.f97827d = predicate;
            this.f97828e = count;
        }

        /* JADX INFO: renamed from: a */
        public void m25139a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f97825b.isCancelled()) {
                    long j = this.f97829f;
                    if (j != 0) {
                        this.f97829f = 0L;
                        this.f97825b.produced(j);
                    }
                    this.f97826c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97824a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            long j = this.f97828e;
            if (j != Long.MAX_VALUE) {
                this.f97828e = j - 1;
            }
            if (j == 0) {
                this.f97824a.onError(t);
                return;
            }
            try {
                if (this.f97827d.test(t)) {
                    m25139a();
                } else {
                    this.f97824a.onError(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f97824a.onError(new qm2(t, th));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f97829f++;
            this.f97824a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f97825b.setSubscription(s);
        }
    }

    public xh6(l86<T> source, long count, n8d<? super Throwable> predicate) {
        super(source);
        this.f97822c = predicate;
        this.f97823d = count;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        gdg gdgVar = new gdg(false);
        s.onSubscribe(gdgVar);
        new C15072a(s, this.f97823d, this.f97822c, gdgVar, this.f49321b).m25139a();
    }
}
