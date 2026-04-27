package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class xh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f97780a;

    /* JADX INFO: renamed from: b */
    public final long f97781b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f97782c;

    /* JADX INFO: renamed from: d */
    public final voe f97783d;

    /* JADX INFO: renamed from: e */
    public final qh2 f97784e;

    /* JADX INFO: renamed from: xh2$a */
    public final class RunnableC15064a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f97785a;

        /* JADX INFO: renamed from: b */
        public final nm2 f97786b;

        /* JADX INFO: renamed from: c */
        public final dh2 f97787c;

        /* JADX INFO: renamed from: xh2$a$a */
        public final class a implements dh2 {
            public a() {
            }

            @Override // p000.dh2
            public void onComplete() {
                RunnableC15064a.this.f97786b.dispose();
                RunnableC15064a.this.f97787c.onComplete();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                RunnableC15064a.this.f97786b.dispose();
                RunnableC15064a.this.f97787c.onError(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                RunnableC15064a.this.f97786b.add(mf4Var);
            }
        }

        public RunnableC15064a(AtomicBoolean atomicBoolean, nm2 nm2Var, dh2 dh2Var) {
            this.f97785a = atomicBoolean;
            this.f97786b = nm2Var;
            this.f97787c = dh2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f97785a.compareAndSet(false, true)) {
                this.f97786b.clear();
                qh2 qh2Var = xh2.this.f97784e;
                if (qh2Var != null) {
                    qh2Var.subscribe(new a());
                    return;
                }
                dh2 dh2Var = this.f97787c;
                xh2 xh2Var = xh2.this;
                dh2Var.onError(new TimeoutException(j75.timeoutMessage(xh2Var.f97781b, xh2Var.f97782c)));
            }
        }
    }

    /* JADX INFO: renamed from: xh2$b */
    public static final class C15065b implements dh2 {

        /* JADX INFO: renamed from: a */
        public final nm2 f97790a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f97791b;

        /* JADX INFO: renamed from: c */
        public final dh2 f97792c;

        public C15065b(nm2 nm2Var, AtomicBoolean atomicBoolean, dh2 dh2Var) {
            this.f97790a = nm2Var;
            this.f97791b = atomicBoolean;
            this.f97792c = dh2Var;
        }

        @Override // p000.dh2
        public void onComplete() {
            if (this.f97791b.compareAndSet(false, true)) {
                this.f97790a.dispose();
                this.f97792c.onComplete();
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            if (!this.f97791b.compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                this.f97790a.dispose();
                this.f97792c.onError(th);
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f97790a.add(mf4Var);
        }
    }

    public xh2(qh2 qh2Var, long j, TimeUnit timeUnit, voe voeVar, qh2 qh2Var2) {
        this.f97780a = qh2Var;
        this.f97781b = j;
        this.f97782c = timeUnit;
        this.f97783d = voeVar;
        this.f97784e = qh2Var2;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        nm2 nm2Var = new nm2();
        dh2Var.onSubscribe(nm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        nm2Var.add(this.f97783d.scheduleDirect(new RunnableC15064a(atomicBoolean, nm2Var, dh2Var), this.f97781b, this.f97782c));
        this.f97780a.subscribe(new C15065b(nm2Var, atomicBoolean, dh2Var));
    }
}
