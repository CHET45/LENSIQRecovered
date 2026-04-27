package p000;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@qx4
public abstract class pc8<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final Runnable f70317a;

    /* JADX INFO: renamed from: b */
    public static final Runnable f70318b;

    /* JADX INFO: renamed from: c */
    public static final int f70319c = 1000;

    /* JADX INFO: renamed from: pc8$b */
    @gdi
    public static final class RunnableC10900b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a */
        public final pc8<?> f70320a;

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @gdi
        @wx1
        /* JADX INFO: renamed from: b */
        public Thread m19414b() {
            return super.getExclusiveOwnerThread();
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f70320a.toString();
        }

        private RunnableC10900b(pc8<?> task) {
            this.f70320a = task;
        }
    }

    /* JADX INFO: renamed from: pc8$c */
    public static final class RunnableC10901c implements Runnable {
        private RunnableC10901c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f70317a = new RunnableC10901c();
        f70318b = new RunnableC10901c();
    }

    private void waitForInterrupt(Thread currentThread) {
        Runnable runnable = get();
        RunnableC10900b runnableC10900b = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC10900b;
            if (!z2 && runnable != f70318b) {
                break;
            }
            if (z2) {
                runnableC10900b = (RunnableC10900b) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f70318b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(runnableC10900b);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            currentThread.interrupt();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14139a(Throwable error);

    /* JADX INFO: renamed from: b */
    public abstract void mo14140b(@agc T result);

    /* JADX INFO: renamed from: c */
    public final void m19412c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            RunnableC10900b runnableC10900b = new RunnableC10900b();
            runnableC10900b.setOwner(Thread.currentThread());
            if (compareAndSet(runnable, runnableC10900b)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f70317a) == f70318b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo14141d();

    @agc
    /* JADX INFO: renamed from: e */
    public abstract T mo14142e() throws Exception;

    /* JADX INFO: renamed from: f */
    public abstract String mo14143f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo14142e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo14141d = mo14141d();
            if (!zMo14141d) {
                try {
                    objMo14142e = mo14142e();
                } catch (Throwable th) {
                    try {
                        uwc.m23618b(th);
                        if (!compareAndSet(threadCurrentThread, f70317a)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (zMo14141d) {
                            return;
                        }
                        mo14139a(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f70317a)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (!zMo14141d) {
                            mo14140b(tib.m22676a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f70317a) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC10900b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo14143f();
    }
}
