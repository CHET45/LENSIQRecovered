package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class qk6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f74742c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f74743d;

    /* JADX INFO: renamed from: e */
    public final woe f74744e;

    /* JADX INFO: renamed from: qk6$a */
    public static final class RunnableC11523a<T> extends AtomicLong implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: C */
        public boolean f74745C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f74746a;

        /* JADX INFO: renamed from: b */
        public final long f74747b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f74748c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f74749d;

        /* JADX INFO: renamed from: e */
        public fdg f74750e;

        /* JADX INFO: renamed from: f */
        public final a0f f74751f = new a0f();

        /* JADX INFO: renamed from: m */
        public volatile boolean f74752m;

        public RunnableC11523a(ycg<? super T> actual, long timeout, TimeUnit unit, woe.AbstractC14729c worker) {
            this.f74746a = actual;
            this.f74747b = timeout;
            this.f74748c = unit;
            this.f74749d = worker;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f74750e.cancel();
            this.f74749d.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f74745C) {
                return;
            }
            this.f74745C = true;
            this.f74746a.onComplete();
            this.f74749d.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f74745C) {
                ofe.onError(t);
                return;
            }
            this.f74745C = true;
            this.f74746a.onError(t);
            this.f74749d.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f74745C || this.f74752m) {
                return;
            }
            this.f74752m = true;
            if (get() == 0) {
                this.f74745C = true;
                cancel();
                this.f74746a.onError(new bwa("Could not deliver value due to lack of requests"));
            } else {
                this.f74746a.onNext(t);
                ro0.produced(this, 1L);
                lf4 lf4Var = this.f74751f.get();
                if (lf4Var != null) {
                    lf4Var.dispose();
                }
                this.f74751f.replace(this.f74749d.schedule(this, this.f74747b, this.f74748c));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f74750e, s)) {
                this.f74750e = s;
                this.f74746a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f74752m = false;
        }
    }

    public qk6(l86<T> source, long timeout, TimeUnit unit, woe scheduler) {
        super(source);
        this.f74742c = timeout;
        this.f74743d = unit;
        this.f74744e = scheduler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new RunnableC11523a(new u1f(s), this.f74742c, this.f74743d, this.f74744e.createWorker()));
    }
}
