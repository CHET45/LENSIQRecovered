package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class me6 extends m86<Long> {

    /* JADX INFO: renamed from: b */
    public final voe f60749b;

    /* JADX INFO: renamed from: c */
    public final long f60750c;

    /* JADX INFO: renamed from: d */
    public final long f60751d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f60752e;

    /* JADX INFO: renamed from: me6$a */
    public static final class RunnableC9332a extends AtomicLong implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f60753a;

        /* JADX INFO: renamed from: b */
        public long f60754b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<mf4> f60755c = new AtomicReference<>();

        public RunnableC9332a(ycg<? super Long> ycgVar) {
            this.f60753a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            ag4.dispose(this.f60755c);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60755c.get() != ag4.DISPOSED) {
                if (get() != 0) {
                    ycg<? super Long> ycgVar = this.f60753a;
                    long j = this.f60754b;
                    this.f60754b = j + 1;
                    ycgVar.onNext(Long.valueOf(j));
                    so0.produced(this, 1L);
                    return;
                }
                this.f60753a.onError(new cwa("Can't deliver value " + this.f60754b + " due to lack of requests"));
                ag4.dispose(this.f60755c);
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.setOnce(this.f60755c, mf4Var);
        }
    }

    public me6(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        this.f60750c = j;
        this.f60751d = j2;
        this.f60752e = timeUnit;
        this.f60749b = voeVar;
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
    @Override // p000.m86
    public void subscribeActual(ycg<? super Long> ycgVar) {
        RunnableC9332a runnableC9332a = new RunnableC9332a(ycgVar);
        ycgVar.onSubscribe(runnableC9332a);
        voe voeVar = this.f60749b;
        if (!(voeVar instanceof a8h)) {
            runnableC9332a.setResource(voeVar.schedulePeriodicallyDirect(runnableC9332a, this.f60750c, this.f60751d, this.f60752e));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = voeVar.createWorker();
        runnableC9332a.setResource(abstractC14185cCreateWorker);
        abstractC14185cCreateWorker.schedulePeriodically(runnableC9332a, this.f60750c, this.f60751d, this.f60752e);
    }
}
