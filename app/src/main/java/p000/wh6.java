package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class wh6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super Throwable> f94253c;

    /* JADX INFO: renamed from: d */
    public final long f94254d;

    /* JADX INFO: renamed from: wh6$a */
    public static final class C14602a<T> extends AtomicInteger implements lj6<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f94255a;

        /* JADX INFO: renamed from: b */
        public final hdg f94256b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends T> f94257c;

        /* JADX INFO: renamed from: d */
        public final m8d<? super Throwable> f94258d;

        /* JADX INFO: renamed from: e */
        public long f94259e;

        /* JADX INFO: renamed from: f */
        public long f94260f;

        public C14602a(ycg<? super T> ycgVar, long j, m8d<? super Throwable> m8dVar, hdg hdgVar, zjd<? extends T> zjdVar) {
            this.f94255a = ycgVar;
            this.f94256b = hdgVar;
            this.f94257c = zjdVar;
            this.f94258d = m8dVar;
            this.f94259e = j;
        }

        /* JADX INFO: renamed from: a */
        public void m24554a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f94256b.isCancelled()) {
                    long j = this.f94260f;
                    if (j != 0) {
                        this.f94260f = 0L;
                        this.f94256b.produced(j);
                    }
                    this.f94257c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f94255a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            long j = this.f94259e;
            if (j != Long.MAX_VALUE) {
                this.f94259e = j - 1;
            }
            if (j == 0) {
                this.f94255a.onError(th);
                return;
            }
            try {
                if (this.f94258d.test(th)) {
                    m24554a();
                } else {
                    this.f94255a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f94255a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f94260f++;
            this.f94255a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f94256b.setSubscription(fdgVar);
        }
    }

    public wh6(m86<T> m86Var, long j, m8d<? super Throwable> m8dVar) {
        super(m86Var);
        this.f94253c = m8dVar;
        this.f94254d = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        hdg hdgVar = new hdg(false);
        ycgVar.onSubscribe(hdgVar);
        new C14602a(ycgVar, this.f94254d, this.f94253c, hdgVar, this.f52360b).m24554a();
    }
}
