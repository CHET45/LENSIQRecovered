package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class uh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m11<? super Integer, ? super Throwable> f88005c;

    /* JADX INFO: renamed from: uh6$a */
    public static final class C13542a<T> extends AtomicInteger implements lj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f88006a;

        /* JADX INFO: renamed from: b */
        public final hdg f88007b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f88008c;

        /* JADX INFO: renamed from: d */
        public final m11<? super Integer, ? super Throwable> f88009d;

        /* JADX INFO: renamed from: e */
        public int f88010e;

        /* JADX INFO: renamed from: f */
        public long f88011f;

        public C13542a(ycg<? super T> ycgVar, m11<? super Integer, ? super Throwable> m11Var, hdg hdgVar, zjd<? extends T> zjdVar) {
            this.f88006a = ycgVar;
            this.f88007b = hdgVar;
            this.f88008c = zjdVar;
            this.f88009d = m11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m23353a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f88007b.isCancelled()) {
                    long j = this.f88011f;
                    if (j != 0) {
                        this.f88011f = 0L;
                        this.f88007b.produced(j);
                    }
                    this.f88008c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88006a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            try {
                m11<? super Integer, ? super Throwable> m11Var = this.f88009d;
                int i = this.f88010e + 1;
                this.f88010e = i;
                if (m11Var.test(Integer.valueOf(i), th)) {
                    m23353a();
                } else {
                    this.f88006a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f88006a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f88011f++;
            this.f88006a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f88007b.setSubscription(fdgVar);
        }
    }

    public uh6(m86<T> m86Var, m11<? super Integer, ? super Throwable> m11Var) {
        super(m86Var);
        this.f88005c = m11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        hdg hdgVar = new hdg(false);
        ycgVar.onSubscribe(hdgVar);
        new C13542a(ycgVar, this.f88005c, hdgVar, this.f52360b).m23353a();
    }
}
