package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class pqb extends vkb<Long> {

    /* JADX INFO: renamed from: a */
    public final woe f71646a;

    /* JADX INFO: renamed from: b */
    public final long f71647b;

    /* JADX INFO: renamed from: c */
    public final long f71648c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f71649d;

    /* JADX INFO: renamed from: pqb$a */
    public static final class RunnableC11072a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Long> f71650a;

        /* JADX INFO: renamed from: b */
        public long f71651b;

        public RunnableC11072a(pxb<? super Long> downstream) {
            this.f71650a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == zf4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != zf4.DISPOSED) {
                pxb<? super Long> pxbVar = this.f71650a;
                long j = this.f71651b;
                this.f71651b = 1 + j;
                pxbVar.onNext(Long.valueOf(j));
            }
        }

        public void setResource(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public pqb(long initialDelay, long period, TimeUnit unit, woe scheduler) {
        this.f71647b = initialDelay;
        this.f71648c = period;
        this.f71649d = unit;
        this.f71646a = scheduler;
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
    @Override // p000.vkb
    public void subscribeActual(pxb<? super Long> observer) {
        RunnableC11072a runnableC11072a = new RunnableC11072a(observer);
        observer.onSubscribe(runnableC11072a);
        woe woeVar = this.f71646a;
        if (!(woeVar instanceof b8h)) {
            runnableC11072a.setResource(woeVar.schedulePeriodicallyDirect(runnableC11072a, this.f71647b, this.f71648c, this.f71649d));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = woeVar.createWorker();
        runnableC11072a.setResource(abstractC14729cCreateWorker);
        abstractC14729cCreateWorker.schedulePeriodically(runnableC11072a, this.f71647b, this.f71648c, this.f71649d);
    }
}
