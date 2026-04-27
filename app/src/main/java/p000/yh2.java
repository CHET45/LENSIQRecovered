package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class yh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f101465a;

    /* JADX INFO: renamed from: b */
    public final long f101466b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f101467c;

    /* JADX INFO: renamed from: d */
    public final woe f101468d;

    /* JADX INFO: renamed from: e */
    public final ph2 f101469e;

    /* JADX INFO: renamed from: yh2$a */
    public final class RunnableC15659a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f101470a;

        /* JADX INFO: renamed from: b */
        public final mm2 f101471b;

        /* JADX INFO: renamed from: c */
        public final ch2 f101472c;

        /* JADX INFO: renamed from: yh2$a$a */
        public final class a implements ch2 {
            public a() {
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                RunnableC15659a.this.f101471b.dispose();
                RunnableC15659a.this.f101472c.onComplete();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                RunnableC15659a.this.f101471b.dispose();
                RunnableC15659a.this.f101472c.onError(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                RunnableC15659a.this.f101471b.add(d);
            }
        }

        public RunnableC15659a(AtomicBoolean once, mm2 set, ch2 observer) {
            this.f101470a = once;
            this.f101471b = set;
            this.f101472c = observer;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f101470a.compareAndSet(false, true)) {
                this.f101471b.clear();
                ph2 ph2Var = yh2.this.f101469e;
                if (ph2Var != null) {
                    ph2Var.subscribe(new a());
                    return;
                }
                ch2 ch2Var = this.f101472c;
                yh2 yh2Var = yh2.this;
                ch2Var.onError(new TimeoutException(k75.timeoutMessage(yh2Var.f101466b, yh2Var.f101467c)));
            }
        }
    }

    /* JADX INFO: renamed from: yh2$b */
    public static final class C15660b implements ch2 {

        /* JADX INFO: renamed from: a */
        public final mm2 f101475a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f101476b;

        /* JADX INFO: renamed from: c */
        public final ch2 f101477c;

        public C15660b(mm2 set, AtomicBoolean once, ch2 observer) {
            this.f101475a = set;
            this.f101476b = once;
            this.f101477c = observer;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f101476b.compareAndSet(false, true)) {
                this.f101475a.dispose();
                this.f101477c.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (!this.f101476b.compareAndSet(false, true)) {
                ofe.onError(e);
            } else {
                this.f101475a.dispose();
                this.f101477c.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f101475a.add(d);
        }
    }

    public yh2(ph2 source, long timeout, TimeUnit unit, woe scheduler, ph2 other) {
        this.f101465a = source;
        this.f101466b = timeout;
        this.f101467c = unit;
        this.f101468d = scheduler;
        this.f101469e = other;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        mm2 mm2Var = new mm2();
        observer.onSubscribe(mm2Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        mm2Var.add(this.f101468d.scheduleDirect(new RunnableC15659a(atomicBoolean, mm2Var, observer), this.f101466b, this.f101467c));
        this.f101465a.subscribe(new C15660b(mm2Var, atomicBoolean, observer));
    }
}
