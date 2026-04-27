package p000;

import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class bya {

    /* JADX INFO: renamed from: a */
    public final boolean f15202a;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f15203b;

    /* JADX INFO: renamed from: c */
    @wx1
    @uc7("lock")
    public AbstractC2103a f15204c;

    /* JADX INFO: renamed from: bya$a */
    public static abstract class AbstractC2103a {

        /* JADX INFO: renamed from: a */
        @Weak
        public final bya f15205a;

        /* JADX INFO: renamed from: b */
        public final Condition f15206b;

        /* JADX INFO: renamed from: c */
        @uc7("monitor.lock")
        public int f15207c = 0;

        /* JADX INFO: renamed from: d */
        @wx1
        @uc7("monitor.lock")
        public AbstractC2103a f15208d;

        public AbstractC2103a(bya monitor) {
            this.f15205a = (bya) v7d.checkNotNull(monitor, "monitor");
            this.f15206b = monitor.f15203b.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public bya() {
        this(false);
    }

    @uc7("lock")
    private void await(AbstractC2103a guard, boolean signalBeforeWaiting) throws InterruptedException {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.f15206b.await();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @uc7("lock")
    private boolean awaitNanos(AbstractC2103a guard, long nanos, boolean signalBeforeWaiting) throws InterruptedException {
        boolean z = true;
        while (nanos > 0) {
            if (z) {
                if (signalBeforeWaiting) {
                    try {
                        signalNextWaiter();
                    } catch (Throwable th) {
                        if (!z) {
                            endWaitingFor(guard);
                        }
                        throw th;
                    }
                }
                beginWaitingFor(guard);
                z = false;
            }
            nanos = guard.f15206b.awaitNanos(nanos);
            if (guard.isSatisfied()) {
                if (!z) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        if (!z) {
            endWaitingFor(guard);
        }
        return false;
    }

    @uc7("lock")
    private void awaitUninterruptibly(AbstractC2103a guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.f15206b.awaitUninterruptibly();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @uc7("lock")
    private void beginWaitingFor(AbstractC2103a guard) {
        int i = guard.f15207c;
        guard.f15207c = i + 1;
        if (i == 0) {
            guard.f15208d = this.f15204c;
            this.f15204c = guard;
        }
    }

    @uc7("lock")
    private void endWaitingFor(AbstractC2103a guard) {
        int i = guard.f15207c - 1;
        guard.f15207c = i;
        if (i == 0) {
            AbstractC2103a abstractC2103a = this.f15204c;
            AbstractC2103a abstractC2103a2 = null;
            while (abstractC2103a != guard) {
                abstractC2103a2 = abstractC2103a;
                abstractC2103a = abstractC2103a.f15208d;
            }
            if (abstractC2103a2 == null) {
                this.f15204c = abstractC2103a.f15208d;
            } else {
                abstractC2103a2.f15208d = abstractC2103a.f15208d;
            }
            abstractC2103a.f15208d = null;
        }
    }

    private static long initNanoTime(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    @uc7("lock")
    private boolean isSatisfied(AbstractC2103a guard) {
        try {
            return guard.isSatisfied();
        } catch (Error | RuntimeException e) {
            signalAllWaiters();
            throw e;
        }
    }

    private static long remainingNanos(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (System.nanoTime() - startTime);
    }

    @uc7("lock")
    private void signalAllWaiters() {
        for (AbstractC2103a abstractC2103a = this.f15204c; abstractC2103a != null; abstractC2103a = abstractC2103a.f15208d) {
            abstractC2103a.f15206b.signalAll();
        }
    }

    @uc7("lock")
    private void signalNextWaiter() {
        for (AbstractC2103a abstractC2103a = this.f15204c; abstractC2103a != null; abstractC2103a = abstractC2103a.f15208d) {
            if (isSatisfied(abstractC2103a)) {
                abstractC2103a.f15206b.signal();
                return;
            }
        }
    }

    private static long toSafeNanos(long time, TimeUnit unit) {
        return im9.constrainToRange(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    public void enter() {
        this.f15203b.lock();
    }

    public boolean enterIf(AbstractC2103a guard) {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f15203b;
        reentrantLock.lock();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean enterIfInterruptibly(AbstractC2103a guard) throws InterruptedException {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f15203b;
        reentrantLock.lockInterruptibly();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void enterInterruptibly() throws InterruptedException {
        this.f15203b.lockInterruptibly();
    }

    public void enterWhen(AbstractC2103a guard) throws InterruptedException {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f15203b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            await(guard, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public void enterWhenUninterruptibly(AbstractC2103a guard) {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f15203b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            awaitUninterruptibly(guard, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public int getOccupiedDepth() {
        return this.f15203b.getHoldCount();
    }

    public int getQueueLength() {
        return this.f15203b.getQueueLength();
    }

    public int getWaitQueueLength(AbstractC2103a guard) {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f15203b.lock();
        try {
            return guard.f15207c;
        } finally {
            this.f15203b.unlock();
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.f15203b.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.f15203b.hasQueuedThreads();
    }

    public boolean hasWaiters(AbstractC2103a guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public boolean isFair() {
        return this.f15202a;
    }

    public boolean isOccupied() {
        return this.f15203b.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.f15203b.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.f15203b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.f15203b.tryLock();
    }

    public boolean tryEnterIf(AbstractC2103a guard) {
        if (guard.f15205a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f15203b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
            }
            return zIsSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void waitFor(AbstractC2103a guard) throws InterruptedException {
        if (guard.f15205a != this || !this.f15203b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public void waitForUninterruptibly(AbstractC2103a guard) {
        if (guard.f15205a != this || !this.f15203b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    public bya(boolean fair) {
        this.f15204c = null;
        this.f15202a = fair;
        this.f15203b = new ReentrantLock(fair);
    }

    public boolean enter(long time, TimeUnit unit) throws Throwable {
        boolean zTryLock;
        long safeNanos = toSafeNanos(time, unit);
        ReentrantLock reentrantLock = this.f15203b;
        boolean z = true;
        if (!this.f15202a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jRemainingNanos = safeNanos;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jRemainingNanos, TimeUnit.NANOSECONDS);
                        break;
                    } catch (InterruptedException unused) {
                        jRemainingNanos = remainingNanos(jNanoTime, safeNanos);
                        zInterrupted = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th2) {
            th = th2;
            z = zInterrupted;
        }
    }

    public boolean enterInterruptibly(long time, TimeUnit unit) throws InterruptedException {
        return this.f15203b.tryLock(time, unit);
    }

    public boolean waitFor(AbstractC2103a guard, long time, TimeUnit unit) throws InterruptedException {
        long safeNanos = toSafeNanos(time, unit);
        if (guard.f15205a == this && this.f15203b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return awaitNanos(guard, safeNanos, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean waitForUninterruptibly(p000.bya.AbstractC2103a r7, long r8, java.util.concurrent.TimeUnit r10) throws java.lang.Throwable {
        /*
            r6 = this;
            long r8 = toSafeNanos(r8, r10)
            bya r10 = r7.f15205a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f15203b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.isSatisfied()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = initNanoTime(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = r0
        L22:
            boolean r7 = r6.awaitNanos(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.isSatisfied()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = remainingNanos(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = r0
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bya.waitForUninterruptibly(bya$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterIf(AbstractC2103a guard, long time, TimeUnit unit) {
        if (guard.f15205a == this) {
            if (!enter(time, unit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                }
                return zIsSatisfied;
            } finally {
                this.f15203b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(AbstractC2103a guard, long time, TimeUnit unit) throws InterruptedException {
        if (guard.f15205a == this) {
            ReentrantLock reentrantLock = this.f15203b;
            if (!reentrantLock.tryLock(time, unit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                }
                return zIsSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhen(p000.bya.AbstractC2103a r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = toSafeNanos(r12, r14)
            bya r2 = r11.f15205a
            if (r2 != r10) goto L62
            java.util.concurrent.locks.ReentrantLock r2 = r10.f15203b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f15202a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = initNanoTime(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.isSatisfied()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L4c
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = remainingNanos(r8, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            boolean r11 = r10.awaitNanos(r11, r0, r3)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            goto L4c
        L4a:
            r11 = move-exception
            goto L53
        L4c:
            r5 = 1
        L4d:
            if (r5 != 0) goto L52
            r2.unlock()
        L52:
            return r5
        L53:
            if (r3 != 0) goto L5e
            r10.signalNextWaiter()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5e:
            r2.unlock()
            throw r11
        L62:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bya.enterWhen(bya$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterWhenUninterruptibly(AbstractC2103a guard, long time, TimeUnit unit) throws Throwable {
        long jInitNanoTime;
        long jRemainingNanos;
        long safeNanos = toSafeNanos(time, unit);
        if (guard.f15205a == this) {
            ReentrantLock reentrantLock = this.f15203b;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean zInterrupted = Thread.interrupted();
            try {
                boolean zAwaitNanos = true;
                if (this.f15202a || !reentrantLock.tryLock()) {
                    jInitNanoTime = initNanoTime(safeNanos);
                    long jRemainingNanos2 = safeNanos;
                    while (true) {
                        try {
                            try {
                                break;
                            } catch (InterruptedException unused) {
                                jRemainingNanos2 = remainingNanos(jInitNanoTime, safeNanos);
                                zInterrupted = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (!reentrantLock.tryLock(jRemainingNanos2, TimeUnit.NANOSECONDS)) {
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    }
                } else {
                    jInitNanoTime = 0;
                }
                while (!guard.isSatisfied()) {
                    try {
                        if (jInitNanoTime == 0) {
                            jInitNanoTime = initNanoTime(safeNanos);
                            jRemainingNanos = safeNanos;
                        } else {
                            jRemainingNanos = remainingNanos(jInitNanoTime, safeNanos);
                        }
                        zAwaitNanos = awaitNanos(guard, jRemainingNanos, zIsHeldByCurrentThread);
                    } catch (InterruptedException unused2) {
                        zIsHeldByCurrentThread = false;
                        zInterrupted = zAwaitNanos;
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                if (!zAwaitNanos) {
                    reentrantLock.unlock();
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                return zAwaitNanos;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }
}
