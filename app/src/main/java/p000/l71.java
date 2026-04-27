package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class l71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f56379a;

    /* JADX INFO: renamed from: b */
    public final int f56380b;

    /* JADX INFO: renamed from: l71$a */
    public static final class RunnableC8650a<T> extends AtomicReference<fdg> implements kj6<T>, Iterator<T>, Runnable, lf4 {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: C */
        public volatile Throwable f56381C;

        /* JADX INFO: renamed from: a */
        public final ozf<T> f56382a;

        /* JADX INFO: renamed from: b */
        public final long f56383b;

        /* JADX INFO: renamed from: c */
        public final long f56384c;

        /* JADX INFO: renamed from: d */
        public final Lock f56385d;

        /* JADX INFO: renamed from: e */
        public final Condition f56386e;

        /* JADX INFO: renamed from: f */
        public long f56387f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f56388m;

        public RunnableC8650a(int batchSize) {
            this.f56382a = new ozf<>(batchSize);
            this.f56383b = batchSize;
            this.f56384c = batchSize - (batchSize >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f56385d = reentrantLock;
            this.f56386e = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public void m15372a() {
            this.f56385d.lock();
            try {
                this.f56386e.signalAll();
            } finally {
                this.f56385d.unlock();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            ldg.cancel(this);
            m15372a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f56388m;
                boolean zIsEmpty = this.f56382a.isEmpty();
                if (z) {
                    Throwable th = this.f56381C;
                    if (th != null) {
                        throw k75.wrapOrThrow(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                s71.verifyNonBlocking();
                this.f56385d.lock();
                while (!this.f56388m && this.f56382a.isEmpty() && !isDisposed()) {
                    try {
                        try {
                            this.f56386e.await();
                        } catch (InterruptedException e) {
                            run();
                            throw k75.wrapOrThrow(e);
                        }
                    } finally {
                        this.f56385d.unlock();
                    }
                }
            }
            Throwable th2 = this.f56381C;
            if (th2 == null) {
                return false;
            }
            throw k75.wrapOrThrow(th2);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == ldg.CANCELLED;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f56382a.poll();
            long j = this.f56387f + 1;
            if (j == this.f56384c) {
                this.f56387f = 0L;
                get().request(j);
            } else {
                this.f56387f = j;
            }
            return tPoll;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f56388m = true;
            m15372a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f56381C = t;
            this.f56388m = true;
            m15372a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f56382a.offer(t)) {
                m15372a();
            } else {
                ldg.cancel(this);
                onError(new bwa("Queue full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, this.f56383b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            ldg.cancel(this);
            m15372a();
        }
    }

    public l71(l86<T> source, int bufferSize) {
        this.f56379a = source;
        this.f56380b = bufferSize;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        RunnableC8650a runnableC8650a = new RunnableC8650a(this.f56380b);
        this.f56379a.subscribe((kj6) runnableC8650a);
        return runnableC8650a;
    }
}
