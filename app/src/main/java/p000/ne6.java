package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class ne6 extends l86<Long> {

    /* JADX INFO: renamed from: b */
    public final woe f64123b;

    /* JADX INFO: renamed from: c */
    public final long f64124c;

    /* JADX INFO: renamed from: d */
    public final long f64125d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f64126e;

    /* JADX INFO: renamed from: ne6$a */
    public static final class RunnableC9816a extends AtomicLong implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f64127a;

        /* JADX INFO: renamed from: b */
        public long f64128b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<lf4> f64129c = new AtomicReference<>();

        public RunnableC9816a(ycg<? super Long> downstream) {
            this.f64127a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            zf4.dispose(this.f64129c);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f64129c.get() != zf4.DISPOSED) {
                if (get() != 0) {
                    ycg<? super Long> ycgVar = this.f64127a;
                    long j = this.f64128b;
                    this.f64128b = j + 1;
                    ycgVar.onNext(Long.valueOf(j));
                    ro0.produced(this, 1L);
                    return;
                }
                this.f64127a.onError(new bwa("Can't deliver value " + this.f64128b + " due to lack of requests"));
                zf4.dispose(this.f64129c);
            }
        }

        public void setResource(lf4 d) {
            zf4.setOnce(this.f64129c, d);
        }
    }

    public ne6(long initialDelay, long period, TimeUnit unit, woe scheduler) {
        this.f64124c = initialDelay;
        this.f64125d = period;
        this.f64126e = unit;
        this.f64123b = scheduler;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.l86
    public void subscribeActual(ycg<? super Long> s) {
        RunnableC9816a runnableC9816a = new RunnableC9816a(s);
        s.onSubscribe(runnableC9816a);
        woe woeVar = this.f64123b;
        if (!(woeVar instanceof b8h)) {
            runnableC9816a.setResource(woeVar.schedulePeriodicallyDirect(runnableC9816a, this.f64124c, this.f64125d, this.f64126e));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = woeVar.createWorker();
        runnableC9816a.setResource(abstractC14729cCreateWorker);
        abstractC14729cCreateWorker.schedulePeriodically(runnableC9816a, this.f64124c, this.f64125d, this.f64126e);
    }
}
