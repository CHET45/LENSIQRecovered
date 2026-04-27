package p000;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class br6<E> extends ct6<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    @op1
    public int drainTo(Collection<? super E> c, int maxElements) {
        return mo8967m().drainTo(c, maxElements);
    }

    @Override // java.util.concurrent.BlockingQueue
    @op1
    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().offer(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @wx1
    @op1
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        mo8967m().put(e);
    }

    @Override // p000.ct6
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> mo8967m();

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return mo8967m().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @op1
    public E take() throws InterruptedException {
        return mo8967m().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @op1
    public int drainTo(Collection<? super E> c) {
        return mo8967m().drainTo(c);
    }
}
