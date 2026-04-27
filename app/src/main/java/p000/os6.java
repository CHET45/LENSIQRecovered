package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes5.dex */
@qx4
@yg8
public abstract class os6 implements Lock {
    /* JADX INFO: renamed from: a */
    public abstract Lock mo274a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo274a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        mo274a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return mo274a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo274a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo274a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return mo274a().tryLock(time, unit);
    }
}
