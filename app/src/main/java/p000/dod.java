package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class dod {
    private dod() {
    }

    @jd7
    @yg8
    @op1
    public static <E> int drain(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) throws InterruptedException {
        v7d.checkNotNull(buffer);
        long jNanoTime = System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        while (iDrainTo < numElements) {
            iDrainTo += q.drainTo(buffer, numElements - iDrainTo);
            if (iDrainTo < numElements) {
                E ePoll = q.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    break;
                }
                buffer.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    @jd7
    @yg8
    @op1
    public static <E> int drainUninterruptibly(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) {
        E ePoll;
        v7d.checkNotNull(buffer);
        long jNanoTime = System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        boolean z = false;
        while (iDrainTo < numElements) {
            try {
                iDrainTo += q.drainTo(buffer, numElements - iDrainTo);
                if (iDrainTo < numElements) {
                    while (true) {
                        try {
                            ePoll = q.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    buffer.add(ePoll);
                    iDrainTo++;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return iDrainTo;
    }

    @jd7
    @yg8
    public static <E> ArrayBlockingQueue<E> newArrayBlockingQueue(int capacity) {
        return new ArrayBlockingQueue<>(capacity);
    }

    public static <E> ArrayDeque<E> newArrayDeque() {
        return new ArrayDeque<>();
    }

    @jd7
    @yg8
    public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
        return new ConcurrentLinkedQueue<>();
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque() {
        return new LinkedBlockingDeque<>();
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new LinkedBlockingQueue<>();
    }

    @jd7
    @yg8
    public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue() {
        return new PriorityBlockingQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> newPriorityQueue() {
        return new PriorityQueue<>();
    }

    @jd7
    @yg8
    public static <E> SynchronousQueue<E> newSynchronousQueue() {
        return new SynchronousQueue<>();
    }

    public static <E> Deque<E> synchronizedDeque(Deque<E> deque) {
        return xhg.m25162h(deque, null);
    }

    public static <E> Queue<E> synchronizedQueue(Queue<E> queue) {
        return xhg.m25171q(queue, null);
    }

    public static <E> ArrayDeque<E> newArrayDeque(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ArrayDeque<>((Collection) elements);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        vg8.addAll(arrayDeque, elements);
        return arrayDeque;
    }

    @jd7
    @yg8
    public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) elements);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        vg8.addAll(concurrentLinkedQueue, elements);
        return concurrentLinkedQueue;
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int capacity) {
        return new LinkedBlockingDeque<>(capacity);
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(int capacity) {
        return new LinkedBlockingQueue<>(capacity);
    }

    @jd7
    @yg8
    public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) elements);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        vg8.addAll(priorityBlockingQueue, elements);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> newPriorityQueue(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityQueue<>((Collection) elements);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        vg8.addAll(priorityQueue, elements);
        return priorityQueue;
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) elements);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        vg8.addAll(linkedBlockingDeque, elements);
        return linkedBlockingDeque;
    }

    @jd7
    @yg8
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) elements);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        vg8.addAll(linkedBlockingQueue, elements);
        return linkedBlockingQueue;
    }
}
