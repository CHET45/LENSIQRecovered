package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class oe6 extends m86<Long> {

    /* JADX INFO: renamed from: b */
    public final voe f67395b;

    /* JADX INFO: renamed from: c */
    public final long f67396c;

    /* JADX INFO: renamed from: d */
    public final long f67397d;

    /* JADX INFO: renamed from: e */
    public final long f67398e;

    /* JADX INFO: renamed from: f */
    public final long f67399f;

    /* JADX INFO: renamed from: m */
    public final TimeUnit f67400m;

    /* JADX INFO: renamed from: oe6$a */
    public static final class RunnableC10342a extends AtomicLong implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f67401a;

        /* JADX INFO: renamed from: b */
        public final long f67402b;

        /* JADX INFO: renamed from: c */
        public long f67403c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f67404d = new AtomicReference<>();

        public RunnableC10342a(ycg<? super Long> ycgVar, long j, long j2) {
            this.f67401a = ycgVar;
            this.f67403c = j;
            this.f67402b = j2;
        }

        @Override // p000.fdg
        public void cancel() {
            ag4.dispose(this.f67404d);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            mf4 mf4Var = this.f67404d.get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var != ag4Var) {
                long j = get();
                if (j == 0) {
                    this.f67401a.onError(new cwa("Can't deliver value " + this.f67403c + " due to lack of requests"));
                    ag4.dispose(this.f67404d);
                    return;
                }
                long j2 = this.f67403c;
                this.f67401a.onNext(Long.valueOf(j2));
                if (j2 == this.f67402b) {
                    if (this.f67404d.get() != ag4Var) {
                        this.f67401a.onComplete();
                    }
                    ag4.dispose(this.f67404d);
                } else {
                    this.f67403c = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.setOnce(this.f67404d, mf4Var);
        }
    }

    public oe6(long j, long j2, long j3, long j4, TimeUnit timeUnit, voe voeVar) {
        this.f67398e = j3;
        this.f67399f = j4;
        this.f67400m = timeUnit;
        this.f67395b = voeVar;
        this.f67396c = j;
        this.f67397d = j2;
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
        RunnableC10342a runnableC10342a = new RunnableC10342a(ycgVar, this.f67396c, this.f67397d);
        ycgVar.onSubscribe(runnableC10342a);
        voe voeVar = this.f67395b;
        if (!(voeVar instanceof a8h)) {
            runnableC10342a.setResource(voeVar.schedulePeriodicallyDirect(runnableC10342a, this.f67398e, this.f67399f, this.f67400m));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = voeVar.createWorker();
        runnableC10342a.setResource(abstractC14185cCreateWorker);
        abstractC14185cCreateWorker.schedulePeriodically(runnableC10342a, this.f67398e, this.f67399f, this.f67400m);
    }
}
