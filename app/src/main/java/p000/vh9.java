package p000;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@xn8(name = "LocksKt")
public final class vh9 {
    @t28
    private static final <T> T read(ReentrantReadWriteLock reentrantReadWriteLock, ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        md8.checkNotNullParameter(ny6Var, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            lock.unlock();
            o28.finallyEnd(1);
        }
    }

    @t28
    private static final <T> T withLock(Lock lock, ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(lock, "<this>");
        md8.checkNotNullParameter(ny6Var, "action");
        lock.lock();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            lock.unlock();
            o28.finallyEnd(1);
        }
    }

    @t28
    private static final <T> T write(ReentrantReadWriteLock reentrantReadWriteLock, ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        md8.checkNotNullParameter(ny6Var, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            o28.finallyEnd(1);
        }
    }
}
