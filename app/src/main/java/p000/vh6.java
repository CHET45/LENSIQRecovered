package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class vh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final l11<? super Integer, ? super Throwable> f91192c;

    /* JADX INFO: renamed from: vh6$a */
    public static final class C14074a<T> extends AtomicInteger implements kj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f91193a;

        /* JADX INFO: renamed from: b */
        public final gdg f91194b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f91195c;

        /* JADX INFO: renamed from: d */
        public final l11<? super Integer, ? super Throwable> f91196d;

        /* JADX INFO: renamed from: e */
        public int f91197e;

        /* JADX INFO: renamed from: f */
        public long f91198f;

        public C14074a(ycg<? super T> actual, l11<? super Integer, ? super Throwable> predicate, gdg sa, zjd<? extends T> source) {
            this.f91193a = actual;
            this.f91194b = sa;
            this.f91195c = source;
            this.f91196d = predicate;
        }

        /* JADX INFO: renamed from: a */
        public void m23964a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f91194b.isCancelled()) {
                    long j = this.f91198f;
                    if (j != 0) {
                        this.f91198f = 0L;
                        this.f91194b.produced(j);
                    }
                    this.f91195c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f91193a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            try {
                l11<? super Integer, ? super Throwable> l11Var = this.f91196d;
                int i = this.f91197e + 1;
                this.f91197e = i;
                if (l11Var.test(Integer.valueOf(i), t)) {
                    m23964a();
                } else {
                    this.f91193a.onError(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f91193a.onError(new qm2(t, th));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f91198f++;
            this.f91193a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            this.f91194b.setSubscription(s);
        }
    }

    public vh6(l86<T> source, l11<? super Integer, ? super Throwable> predicate) {
        super(source);
        this.f91192c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        gdg gdgVar = new gdg(false);
        s.onSubscribe(gdgVar);
        new C14074a(s, this.f91192c, gdgVar, this.f49321b).m23964a();
    }
}
