package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class sg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2[] f81698a;

    /* JADX INFO: renamed from: sg2$a */
    public static final class C12564a implements ch2 {

        /* JADX INFO: renamed from: a */
        public final ch2 f81699a;

        /* JADX INFO: renamed from: b */
        public final mm2 f81700b;

        /* JADX INFO: renamed from: c */
        public final bc0 f81701c;

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f81702d;

        public C12564a(ch2 observer, mm2 set, bc0 error, AtomicInteger wip) {
            this.f81699a = observer;
            this.f81700b = set;
            this.f81701c = error;
            this.f81702d = wip;
        }

        /* JADX INFO: renamed from: a */
        public void m21948a() {
            if (this.f81702d.decrementAndGet() == 0) {
                this.f81701c.tryTerminateConsumer(this.f81699a);
            }
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            m21948a();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (this.f81701c.tryAddThrowableOrReport(e)) {
                m21948a();
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            this.f81700b.add(d);
        }
    }

    /* JADX INFO: renamed from: sg2$b */
    public static final class C12565b implements lf4 {

        /* JADX INFO: renamed from: a */
        public final bc0 f81703a;

        public C12565b(bc0 errors) {
            this.f81703a = errors;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f81703a.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f81703a.isTerminated();
        }
    }

    public sg2(ph2[] sources) {
        this.f81698a = sources;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        mm2 mm2Var = new mm2();
        AtomicInteger atomicInteger = new AtomicInteger(this.f81698a.length + 1);
        bc0 bc0Var = new bc0();
        mm2Var.add(new C12565b(bc0Var));
        observer.onSubscribe(mm2Var);
        for (ph2 ph2Var : this.f81698a) {
            if (mm2Var.isDisposed()) {
                return;
            }
            if (ph2Var == null) {
                bc0Var.tryAddThrowableOrReport(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                ph2Var.subscribe(new C12564a(observer, mm2Var, bc0Var, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            bc0Var.tryTerminateConsumer(observer);
        }
    }
}
