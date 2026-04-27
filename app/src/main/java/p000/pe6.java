package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class pe6 extends l86<Long> {

    /* JADX INFO: renamed from: b */
    public final woe f70547b;

    /* JADX INFO: renamed from: c */
    public final long f70548c;

    /* JADX INFO: renamed from: d */
    public final long f70549d;

    /* JADX INFO: renamed from: e */
    public final long f70550e;

    /* JADX INFO: renamed from: f */
    public final long f70551f;

    /* JADX INFO: renamed from: m */
    public final TimeUnit f70552m;

    /* JADX INFO: renamed from: pe6$a */
    public static final class RunnableC10930a extends AtomicLong implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f70553a;

        /* JADX INFO: renamed from: b */
        public final long f70554b;

        /* JADX INFO: renamed from: c */
        public long f70555c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f70556d = new AtomicReference<>();

        public RunnableC10930a(ycg<? super Long> actual, long start, long end) {
            this.f70553a = actual;
            this.f70555c = start;
            this.f70554b = end;
        }

        @Override // p000.fdg
        public void cancel() {
            zf4.dispose(this.f70556d);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lf4 lf4Var = this.f70556d.get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                long j = get();
                if (j == 0) {
                    this.f70553a.onError(new bwa("Can't deliver value " + this.f70555c + " due to lack of requests"));
                    zf4.dispose(this.f70556d);
                    return;
                }
                long j2 = this.f70555c;
                this.f70553a.onNext(Long.valueOf(j2));
                if (j2 == this.f70554b) {
                    if (this.f70556d.get() != zf4Var) {
                        this.f70553a.onComplete();
                    }
                    zf4.dispose(this.f70556d);
                } else {
                    this.f70555c = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }

        public void setResource(lf4 d) {
            zf4.setOnce(this.f70556d, d);
        }
    }

    public pe6(long start, long end, long initialDelay, long period, TimeUnit unit, woe scheduler) {
        this.f70550e = initialDelay;
        this.f70551f = period;
        this.f70552m = unit;
        this.f70547b = scheduler;
        this.f70548c = start;
        this.f70549d = end;
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
        RunnableC10930a runnableC10930a = new RunnableC10930a(s, this.f70548c, this.f70549d);
        s.onSubscribe(runnableC10930a);
        woe woeVar = this.f70547b;
        if (!(woeVar instanceof b8h)) {
            runnableC10930a.setResource(woeVar.schedulePeriodicallyDirect(runnableC10930a, this.f70550e, this.f70551f, this.f70552m));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = woeVar.createWorker();
        runnableC10930a.setResource(abstractC14729cCreateWorker);
        abstractC14729cCreateWorker.schedulePeriodically(runnableC10930a, this.f70550e, this.f70551f, this.f70552m);
    }
}
