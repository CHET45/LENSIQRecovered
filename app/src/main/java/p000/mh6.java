package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class mh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f61006c;

    /* JADX INFO: renamed from: mh6$a */
    public static final class C9354a<T> extends AtomicInteger implements lj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f61007a;

        /* JADX INFO: renamed from: b */
        public final hdg f61008b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f61009c;

        /* JADX INFO: renamed from: d */
        public long f61010d;

        /* JADX INFO: renamed from: e */
        public long f61011e;

        public C9354a(ycg<? super T> ycgVar, long j, hdg hdgVar, zjd<? extends T> zjdVar) {
            this.f61007a = ycgVar;
            this.f61008b = hdgVar;
            this.f61009c = zjdVar;
            this.f61010d = j;
        }

        /* JADX INFO: renamed from: a */
        public void m17313a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f61008b.isCancelled()) {
                    long j = this.f61011e;
                    if (j != 0) {
                        this.f61011e = 0L;
                        this.f61008b.produced(j);
                    }
                    this.f61009c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            long j = this.f61010d;
            if (j != Long.MAX_VALUE) {
                this.f61010d = j - 1;
            }
            if (j != 0) {
                m17313a();
            } else {
                this.f61007a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f61007a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f61011e++;
            this.f61007a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f61008b.setSubscription(fdgVar);
        }
    }

    public mh6(m86<T> m86Var, long j) {
        super(m86Var);
        this.f61006c = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        hdg hdgVar = new hdg(false);
        ycgVar.onSubscribe(hdgVar);
        long j = this.f61006c;
        new C9354a(ycgVar, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, hdgVar, this.f52360b).m17313a();
    }
}
