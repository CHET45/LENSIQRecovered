package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public class lpe extends woe implements lf4 {

    /* JADX INFO: renamed from: f */
    public static final lf4 f58413f = new C8934g();

    /* JADX INFO: renamed from: m */
    public static final lf4 f58414m = lf4.disposed();

    /* JADX INFO: renamed from: c */
    public final woe f58415c;

    /* JADX INFO: renamed from: d */
    public final qg6<l86<xd2>> f58416d;

    /* JADX INFO: renamed from: e */
    public lf4 f58417e;

    /* JADX INFO: renamed from: lpe$a */
    public static final class C8928a implements sy6<AbstractC8933f, xd2> {

        /* JADX INFO: renamed from: a */
        public final woe.AbstractC14729c f58418a;

        /* JADX INFO: renamed from: lpe$a$a */
        public final class a extends xd2 {

            /* JADX INFO: renamed from: a */
            public final AbstractC8933f f58419a;

            public a(AbstractC8933f action) {
                this.f58419a = action;
            }

            @Override // p000.xd2
            public void subscribeActual(ch2 actionCompletable) {
                actionCompletable.onSubscribe(this.f58419a);
                this.f58419a.m16311a(C8928a.this.f58418a, actionCompletable);
            }
        }

        public C8928a(woe.AbstractC14729c actualWorker) {
            this.f58418a = actualWorker;
        }

        @Override // p000.sy6
        public xd2 apply(final AbstractC8933f action) {
            return new a(action);
        }
    }

    /* JADX INFO: renamed from: lpe$b */
    public static class C8929b extends AbstractC8933f {

        /* JADX INFO: renamed from: a */
        public final Runnable f58421a;

        /* JADX INFO: renamed from: b */
        public final long f58422b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f58423c;

        public C8929b(Runnable action, long delayTime, TimeUnit unit) {
            this.f58421a = action;
            this.f58422b = delayTime;
            this.f58423c = unit;
        }

        @Override // p000.lpe.AbstractC8933f
        /* JADX INFO: renamed from: b */
        public lf4 mo16310b(woe.AbstractC14729c actualWorker, ch2 actionCompletable) {
            return actualWorker.schedule(new RunnableC8931d(this.f58421a, actionCompletable), this.f58422b, this.f58423c);
        }
    }

    /* JADX INFO: renamed from: lpe$c */
    public static class C8930c extends AbstractC8933f {

        /* JADX INFO: renamed from: a */
        public final Runnable f58424a;

        public C8930c(Runnable action) {
            this.f58424a = action;
        }

        @Override // p000.lpe.AbstractC8933f
        /* JADX INFO: renamed from: b */
        public lf4 mo16310b(woe.AbstractC14729c actualWorker, ch2 actionCompletable) {
            return actualWorker.schedule(new RunnableC8931d(this.f58424a, actionCompletable));
        }
    }

    /* JADX INFO: renamed from: lpe$d */
    public static class RunnableC8931d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ch2 f58425a;

        /* JADX INFO: renamed from: b */
        public final Runnable f58426b;

        public RunnableC8931d(Runnable action, ch2 actionCompletable) {
            this.f58426b = action;
            this.f58425a = actionCompletable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f58426b.run();
            } finally {
                this.f58425a.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: lpe$f */
    public static abstract class AbstractC8933f extends AtomicReference<lf4> implements lf4 {
        public AbstractC8933f() {
            super(lpe.f58413f);
        }

        /* JADX INFO: renamed from: a */
        public void m16311a(woe.AbstractC14729c actualWorker, ch2 actionCompletable) {
            lf4 lf4Var;
            lf4 lf4Var2 = get();
            if (lf4Var2 != lpe.f58414m && lf4Var2 == (lf4Var = lpe.f58413f)) {
                lf4 lf4VarMo16310b = mo16310b(actualWorker, actionCompletable);
                if (compareAndSet(lf4Var, lf4VarMo16310b)) {
                    return;
                }
                lf4VarMo16310b.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract lf4 mo16310b(woe.AbstractC14729c actualWorker, ch2 actionCompletable);

        @Override // p000.lf4
        public void dispose() {
            getAndSet(lpe.f58414m).dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* JADX INFO: renamed from: lpe$g */
    public static final class C8934g implements lf4 {
        @Override // p000.lf4
        public void dispose() {
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lpe(sy6<l86<l86<xd2>>, xd2> combine, woe actualScheduler) {
        this.f58415c = actualScheduler;
        qg6 serialized = nsh.create().toSerialized();
        this.f58416d = serialized;
        try {
            this.f58417e = ((xd2) combine.apply(serialized)).subscribe();
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        woe.AbstractC14729c abstractC14729cCreateWorker = this.f58415c.createWorker();
        qg6<T> serialized = nsh.create().toSerialized();
        l86<xd2> map = serialized.map(new C8928a(abstractC14729cCreateWorker));
        C8932e c8932e = new C8932e(serialized, abstractC14729cCreateWorker);
        this.f58416d.onNext(map);
        return c8932e;
    }

    @Override // p000.lf4
    public void dispose() {
        this.f58417e.dispose();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f58417e.isDisposed();
    }

    /* JADX INFO: renamed from: lpe$e */
    public static final class C8932e extends woe.AbstractC14729c {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f58427a = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final qg6<AbstractC8933f> f58428b;

        /* JADX INFO: renamed from: c */
        public final woe.AbstractC14729c f58429c;

        public C8932e(qg6<AbstractC8933f> actionProcessor, woe.AbstractC14729c actualWorker) {
            this.f58428b = actionProcessor;
            this.f58429c = actualWorker;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f58427a.compareAndSet(false, true)) {
                this.f58428b.onComplete();
                this.f58429c.dispose();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f58427a.get();
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb final Runnable action, final long delayTime, @cfb final TimeUnit unit) {
            C8929b c8929b = new C8929b(action, delayTime, unit);
            this.f58428b.onNext(c8929b);
            return c8929b;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb final Runnable action) {
            C8930c c8930c = new C8930c(action);
            this.f58428b.onNext(c8930c);
            return c8930c;
        }
    }
}
