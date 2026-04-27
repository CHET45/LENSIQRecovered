package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class rqb extends vkb<Long> {

    /* JADX INFO: renamed from: a */
    public final woe f79037a;

    /* JADX INFO: renamed from: b */
    public final long f79038b;

    /* JADX INFO: renamed from: c */
    public final long f79039c;

    /* JADX INFO: renamed from: d */
    public final long f79040d;

    /* JADX INFO: renamed from: e */
    public final long f79041e;

    /* JADX INFO: renamed from: f */
    public final TimeUnit f79042f;

    /* JADX INFO: renamed from: rqb$a */
    public static final class RunnableC12206a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Long> f79043a;

        /* JADX INFO: renamed from: b */
        public final long f79044b;

        /* JADX INFO: renamed from: c */
        public long f79045c;

        public RunnableC12206a(pxb<? super Long> actual, long start, long end) {
            this.f79043a = actual;
            this.f79045c = start;
            this.f79044b = end;
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
            if (isDisposed()) {
                return;
            }
            long j = this.f79045c;
            this.f79043a.onNext(Long.valueOf(j));
            if (j != this.f79044b) {
                this.f79045c = j + 1;
                return;
            }
            if (!isDisposed()) {
                this.f79043a.onComplete();
            }
            zf4.dispose(this);
        }

        public void setResource(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public rqb(long start, long end, long initialDelay, long period, TimeUnit unit, woe scheduler) {
        this.f79040d = initialDelay;
        this.f79041e = period;
        this.f79042f = unit;
        this.f79037a = scheduler;
        this.f79038b = start;
        this.f79039c = end;
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
        RunnableC12206a runnableC12206a = new RunnableC12206a(observer, this.f79038b, this.f79039c);
        observer.onSubscribe(runnableC12206a);
        woe woeVar = this.f79037a;
        if (!(woeVar instanceof b8h)) {
            runnableC12206a.setResource(woeVar.schedulePeriodicallyDirect(runnableC12206a, this.f79040d, this.f79041e, this.f79042f));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = woeVar.createWorker();
        runnableC12206a.setResource(abstractC14729cCreateWorker);
        abstractC14729cCreateWorker.schedulePeriodically(runnableC12206a, this.f79040d, this.f79041e, this.f79042f);
    }
}
