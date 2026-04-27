package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class pk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f71156c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f71157d;

    /* JADX INFO: renamed from: e */
    public final voe f71158e;

    /* JADX INFO: renamed from: pk6$a */
    public static final class RunnableC10991a<T> extends AtomicLong implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: C */
        public boolean f71159C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f71160a;

        /* JADX INFO: renamed from: b */
        public final long f71161b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f71162c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f71163d;

        /* JADX INFO: renamed from: e */
        public fdg f71164e;

        /* JADX INFO: renamed from: f */
        public final b0f f71165f = new b0f();

        /* JADX INFO: renamed from: m */
        public volatile boolean f71166m;

        public RunnableC10991a(ycg<? super T> ycgVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f71160a = ycgVar;
            this.f71161b = j;
            this.f71162c = timeUnit;
            this.f71163d = abstractC14185c;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f71164e.cancel();
            this.f71163d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f71159C) {
                return;
            }
            this.f71159C = true;
            this.f71160a.onComplete();
            this.f71163d.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f71159C) {
                pfe.onError(th);
                return;
            }
            this.f71159C = true;
            this.f71160a.onError(th);
            this.f71163d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f71159C || this.f71166m) {
                return;
            }
            this.f71166m = true;
            if (get() == 0) {
                this.f71159C = true;
                cancel();
                this.f71160a.onError(new cwa("Could not deliver value due to lack of requests"));
            } else {
                this.f71160a.onNext(t);
                so0.produced(this, 1L);
                mf4 mf4Var = this.f71165f.get();
                if (mf4Var != null) {
                    mf4Var.dispose();
                }
                this.f71165f.replace(this.f71163d.schedule(this, this.f71161b, this.f71162c));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f71164e, fdgVar)) {
                this.f71164e = fdgVar;
                this.f71160a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71166m = false;
        }
    }

    public pk6(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar) {
        super(m86Var);
        this.f71156c = j;
        this.f71157d = timeUnit;
        this.f71158e = voeVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new RunnableC10991a(new t1f(ycgVar), this.f71156c, this.f71157d, this.f71158e.createWorker()));
    }
}
