package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class qqb extends Observable<Long> {

    /* JADX INFO: renamed from: a */
    public final voe f75126a;

    /* JADX INFO: renamed from: b */
    public final long f75127b;

    /* JADX INFO: renamed from: c */
    public final long f75128c;

    /* JADX INFO: renamed from: d */
    public final long f75129d;

    /* JADX INFO: renamed from: e */
    public final long f75130e;

    /* JADX INFO: renamed from: f */
    public final TimeUnit f75131f;

    /* JADX INFO: renamed from: qqb$a */
    public static final class RunnableC11586a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Long> f75132a;

        /* JADX INFO: renamed from: b */
        public final long f75133b;

        /* JADX INFO: renamed from: c */
        public long f75134c;

        public RunnableC11586a(oxb<? super Long> oxbVar, long j, long j2) {
            this.f75132a = oxbVar;
            this.f75134c = j;
            this.f75133b = j2;
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
            if (isDisposed()) {
                return;
            }
            long j = this.f75134c;
            this.f75132a.onNext(Long.valueOf(j));
            if (j != this.f75133b) {
                this.f75134c = j + 1;
            } else {
                ag4.dispose(this);
                this.f75132a.onComplete();
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public qqb(long j, long j2, long j3, long j4, TimeUnit timeUnit, voe voeVar) {
        this.f75129d = j3;
        this.f75130e = j4;
        this.f75131f = timeUnit;
        this.f75126a = voeVar;
        this.f75127b = j;
        this.f75128c = j2;
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
        RunnableC11586a runnableC11586a = new RunnableC11586a(oxbVar, this.f75127b, this.f75128c);
        oxbVar.onSubscribe(runnableC11586a);
        voe voeVar = this.f75126a;
        if (!(voeVar instanceof a8h)) {
            runnableC11586a.setResource(voeVar.schedulePeriodicallyDirect(runnableC11586a, this.f75129d, this.f75130e, this.f75131f));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = voeVar.createWorker();
        runnableC11586a.setResource(abstractC14185cCreateWorker);
        abstractC14185cCreateWorker.schedulePeriodically(runnableC11586a, this.f75129d, this.f75130e, this.f75131f);
    }
}
