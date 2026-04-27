package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class oqb extends Observable<Long> {

    /* JADX INFO: renamed from: a */
    public final voe f68301a;

    /* JADX INFO: renamed from: b */
    public final long f68302b;

    /* JADX INFO: renamed from: c */
    public final long f68303c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f68304d;

    /* JADX INFO: renamed from: oqb$a */
    public static final class RunnableC10500a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Long> f68305a;

        /* JADX INFO: renamed from: b */
        public long f68306b;

        public RunnableC10500a(oxb<? super Long> oxbVar) {
            this.f68305a = oxbVar;
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
            if (get() != ag4.DISPOSED) {
                oxb<? super Long> oxbVar = this.f68305a;
                long j = this.f68306b;
                this.f68306b = 1 + j;
                oxbVar.onNext(Long.valueOf(j));
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public oqb(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        this.f68302b = j;
        this.f68303c = j2;
        this.f68304d = timeUnit;
        this.f68301a = voeVar;
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
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Long> oxbVar) {
        RunnableC10500a runnableC10500a = new RunnableC10500a(oxbVar);
        oxbVar.onSubscribe(runnableC10500a);
        voe voeVar = this.f68301a;
        if (!(voeVar instanceof a8h)) {
            runnableC10500a.setResource(voeVar.schedulePeriodicallyDirect(runnableC10500a, this.f68302b, this.f68303c, this.f68304d));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = voeVar.createWorker();
        runnableC10500a.setResource(abstractC14185cCreateWorker);
        abstractC14185cCreateWorker.schedulePeriodically(runnableC10500a, this.f68302b, this.f68303c, this.f68304d);
    }
}
