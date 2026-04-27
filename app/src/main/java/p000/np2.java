package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class np2 {
    public static /* synthetic */ void ReentrantLock$annotations() {
    }

    public static /* synthetic */ void WorkaroundAtomicReference$annotations() {
    }

    @yfb
    public static final <E> Set<E> identitySet(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    public static final <T> T withLock(@yfb ReentrantLock reentrantLock, @yfb ny6<? extends T> ny6Var) {
        reentrantLock.lock();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            reentrantLock.unlock();
            o28.finallyEnd(1);
        }
    }
}
