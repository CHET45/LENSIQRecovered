package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class cb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f16173c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f16174d;

    /* JADX INFO: renamed from: e */
    public final voe f16175e;

    /* JADX INFO: renamed from: cb6$a */
    public static final class RunnableC2261a<T> extends AtomicReference<mf4> implements Runnable, mf4 {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a */
        public final T f16176a;

        /* JADX INFO: renamed from: b */
        public final long f16177b;

        /* JADX INFO: renamed from: c */
        public final C2262b<T> f16178c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f16179d = new AtomicBoolean();

        public RunnableC2261a(T t, long j, C2262b<T> c2262b) {
            this.f16176a = t;
            this.f16177b = j;
            this.f16178c = c2262b;
        }

        /* JADX INFO: renamed from: a */
        public void m3886a() {
            if (this.f16179d.compareAndSet(false, true)) {
                this.f16178c.m3887a(this.f16177b, this.f16176a, this);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == ag4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            m3886a();
        }

        public void setResource(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }
    }

    /* JADX INFO: renamed from: cb6$b */
    public static final class C2262b<T> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: C */
        public boolean f16180C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16181a;

        /* JADX INFO: renamed from: b */
        public final long f16182b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f16183c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f16184d;

        /* JADX INFO: renamed from: e */
        public fdg f16185e;

        /* JADX INFO: renamed from: f */
        public mf4 f16186f;

        /* JADX INFO: renamed from: m */
        public volatile long f16187m;

        public C2262b(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f16181a = ycgVar;
            this.f16182b = j;
            this.f16183c = timeUnit;
            this.f16184d = abstractC14185c;
        }

        /* JADX INFO: renamed from: a */
        public void m3887a(long j, T t, RunnableC2261a<T> runnableC2261a) {
            if (j == this.f16187m) {
                if (get() == 0) {
                    cancel();
                    this.f16181a.onError(new cwa("Could not deliver value due to lack of requests"));
                } else {
                    this.f16181a.onNext(t);
                    so0.produced(this, 1L);
                    runnableC2261a.dispose();
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16185e.cancel();
            this.f16184d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16180C) {
                return;
            }
            this.f16180C = true;
            mf4 mf4Var = this.f16186f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            RunnableC2261a runnableC2261a = (RunnableC2261a) mf4Var;
            if (runnableC2261a != null) {
                runnableC2261a.m3886a();
            }
            this.f16181a.onComplete();
            this.f16184d.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f16180C) {
                pfe.onError(th);
                return;
            }
            this.f16180C = true;
            mf4 mf4Var = this.f16186f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            this.f16181a.onError(th);
            this.f16184d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16180C) {
                return;
            }
            long j = this.f16187m + 1;
            this.f16187m = j;
            mf4 mf4Var = this.f16186f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            RunnableC2261a runnableC2261a = new RunnableC2261a(t, j, this);
            this.f16186f = runnableC2261a;
            runnableC2261a.setResource(this.f16184d.schedule(runnableC2261a, this.f16182b, this.f16183c));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f16185e, fdgVar)) {
                this.f16185e = fdgVar;
                this.f16181a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }
    }

    public cb6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar) {
        super(m86Var);
        this.f16173c = j;
        this.f16174d = timeUnit;
        this.f16175e = voeVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C2262b(new t1f(ycgVar), this.f16173c, this.f16174d, this.f16175e.createWorker()));
    }
}
