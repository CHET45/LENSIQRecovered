package p000;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes5.dex */
@qx4
@yg8
public abstract class nr6 implements Condition {
    /* JADX INFO: renamed from: a */
    public abstract Condition mo273a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        mo273a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long nanosTimeout) throws InterruptedException {
        return mo273a().awaitNanos(nanosTimeout);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo273a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date deadline) throws InterruptedException {
        return mo273a().awaitUntil(deadline);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo273a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo273a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return mo273a().await(time, unit);
    }
}
