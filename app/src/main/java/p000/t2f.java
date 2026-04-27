package p000;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class t2f implements Executor, Runnable {

    /* JADX INFO: renamed from: d */
    public static final Logger f83534d = Logger.getLogger(t2f.class.getName());

    /* JADX INFO: renamed from: e */
    public static final AbstractC12875b f83535e = getAtomicHelper();

    /* JADX INFO: renamed from: f */
    public static final int f83536f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f83537m = -1;

    /* JADX INFO: renamed from: a */
    public Executor f83538a;

    /* JADX INFO: renamed from: b */
    public final Queue<Runnable> f83539b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    public volatile int f83540c = 0;

    /* JADX INFO: renamed from: t2f$b */
    public static abstract class AbstractC12875b {
        private AbstractC12875b() {
        }

        public abstract boolean runStateCompareAndSet(t2f t2fVar, int i, int i2);

        public abstract void runStateSet(t2f t2fVar, int i);
    }

    /* JADX INFO: renamed from: t2f$c */
    public static final class C12876c extends AbstractC12875b {

        /* JADX INFO: renamed from: a */
        public final AtomicIntegerFieldUpdater<t2f> f83541a;

        @Override // p000.t2f.AbstractC12875b
        public boolean runStateCompareAndSet(t2f t2fVar, int i, int i2) {
            return this.f83541a.compareAndSet(t2fVar, i, i2);
        }

        @Override // p000.t2f.AbstractC12875b
        public void runStateSet(t2f t2fVar, int i) {
            this.f83541a.set(t2fVar, i);
        }

        private C12876c(AtomicIntegerFieldUpdater<t2f> atomicIntegerFieldUpdater) {
            super();
            this.f83541a = atomicIntegerFieldUpdater;
        }
    }

    /* JADX INFO: renamed from: t2f$d */
    public static final class C12877d extends AbstractC12875b {
        private C12877d() {
            super();
        }

        @Override // p000.t2f.AbstractC12875b
        public boolean runStateCompareAndSet(t2f t2fVar, int i, int i2) {
            synchronized (t2fVar) {
                try {
                    if (t2fVar.f83540c != i) {
                        return false;
                    }
                    t2fVar.f83540c = i2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.t2f.AbstractC12875b
        public void runStateSet(t2f t2fVar, int i) {
            synchronized (t2fVar) {
                t2fVar.f83540c = i;
            }
        }
    }

    public t2f(Executor executor) {
        v7d.checkNotNull(executor, "'executor' must not be null.");
        this.f83538a = executor;
    }

    private static AbstractC12875b getAtomicHelper() {
        try {
            return new C12876c(AtomicIntegerFieldUpdater.newUpdater(t2f.class, "c"));
        } catch (Throwable th) {
            f83534d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new C12877d();
        }
    }

    private void schedule(@eib Runnable runnable) {
        if (f83535e.runStateCompareAndSet(this, 0, -1)) {
            try {
                this.f83538a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f83539b.remove(runnable);
                }
                f83535e.runStateSet(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f83539b.add((Runnable) v7d.checkNotNull(runnable, "'r' must not be null."));
        schedule(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnablePoll;
        try {
            Executor executor = this.f83538a;
            while (executor == this.f83538a && (runnablePoll = this.f83539b.poll()) != null) {
                try {
                    runnablePoll.run();
                } catch (RuntimeException e) {
                    f83534d.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, (Throwable) e);
                }
            }
            f83535e.runStateSet(this, 0);
            if (this.f83539b.isEmpty()) {
                return;
            }
            schedule(null);
        } catch (Throwable th) {
            f83535e.runStateSet(this, 0);
            throw th;
        }
    }

    public void setExecutor(Executor executor) {
        v7d.checkNotNull(executor, "'executor' must not be null.");
        this.f83538a = executor;
    }
}
