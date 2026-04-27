package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class oh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final eb1 f67635c;

    /* JADX INFO: renamed from: oh6$a */
    public static final class C10377a<T> extends AtomicInteger implements lj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f67636a;

        /* JADX INFO: renamed from: b */
        public final hdg f67637b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f67638c;

        /* JADX INFO: renamed from: d */
        public final eb1 f67639d;

        /* JADX INFO: renamed from: e */
        public long f67640e;

        public C10377a(ycg<? super T> ycgVar, eb1 eb1Var, hdg hdgVar, zjd<? extends T> zjdVar) {
            this.f67636a = ycgVar;
            this.f67637b = hdgVar;
            this.f67638c = zjdVar;
            this.f67639d = eb1Var;
        }

        /* JADX INFO: renamed from: a */
        public void m18675a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f67637b.isCancelled()) {
                    long j = this.f67640e;
                    if (j != 0) {
                        this.f67640e = 0L;
                        this.f67637b.produced(j);
                    }
                    this.f67638c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            try {
                if (this.f67639d.getAsBoolean()) {
                    this.f67636a.onComplete();
                } else {
                    m18675a();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f67636a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f67636a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f67640e++;
            this.f67636a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f67637b.setSubscription(fdgVar);
        }
    }

    public oh6(m86<T> m86Var, eb1 eb1Var) {
        super(m86Var);
        this.f67635c = eb1Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        hdg hdgVar = new hdg(false);
        ycgVar.onSubscribe(hdgVar);
        new C10377a(ycgVar, this.f67635c, hdgVar, this.f52360b).m18675a();
    }
}
