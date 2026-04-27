package p000;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class zq6<E> extends qr6<E> implements BlockingDeque<E> {
    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c) {
        return mo8967m().drainTo(c);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().offer(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().offerFirst(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().offerLast(e, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @wx1
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @wx1
    public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().pollFirst(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @wx1
    public E pollLast(long timeout, TimeUnit unit) throws InterruptedException {
        return mo8967m().pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        mo8967m().put(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e) throws InterruptedException {
        mo8967m().putFirst(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e) throws InterruptedException {
        mo8967m().putLast(e);
    }

    @Override // p000.qr6
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> mo8967m();

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return mo8967m().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return mo8967m().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return mo8967m().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return mo8967m().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c, int maxElements) {
        return mo8967m().drainTo(c, maxElements);
    }
}
