package p000;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class cii extends j93 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cii f16666a = new cii();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final ReentrantReadWriteLock f16667b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    @yfb
    public static final WeakHashMap<Class<? extends Throwable>, qy6<Throwable, Throwable>> f16668c = new WeakHashMap<>();

    private cii() {
    }

    @Override // p000.j93
    @yfb
    public qy6<Throwable, Throwable> get(@yfb Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f16667b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            qy6<Throwable, Throwable> qy6Var = f16668c.get(cls);
            if (qy6Var != null) {
                return qy6Var;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, qy6<Throwable, Throwable>> weakHashMap = f16668c;
                qy6<Throwable, Throwable> qy6Var2 = weakHashMap.get(cls);
                if (qy6Var2 != null) {
                    return qy6Var2;
                }
                qy6<Throwable, Throwable> qy6VarCreateConstructor = w75.createConstructor(cls);
                weakHashMap.put(cls, qy6VarCreateConstructor);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return qy6VarCreateConstructor;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
