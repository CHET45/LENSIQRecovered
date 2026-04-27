package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class k71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f52706a;

    /* JADX INFO: renamed from: b */
    public final int f52707b;

    /* JADX INFO: renamed from: k71$a */
    public static final class RunnableC8220a<T> extends AtomicReference<fdg> implements lj6<T>, Iterator<T>, Runnable, mf4 {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: C */
        public volatile Throwable f52708C;

        /* JADX INFO: renamed from: a */
        public final pzf<T> f52709a;

        /* JADX INFO: renamed from: b */
        public final long f52710b;

        /* JADX INFO: renamed from: c */
        public final long f52711c;

        /* JADX INFO: renamed from: d */
        public final Lock f52712d;

        /* JADX INFO: renamed from: e */
        public final Condition f52713e;

        /* JADX INFO: renamed from: f */
        public long f52714f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f52715m;

        public RunnableC8220a(int i) {
            this.f52709a = new pzf<>(i);
            this.f52710b = i;
            this.f52711c = i - (i >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f52712d = reentrantLock;
            this.f52713e = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public void m14565a() {
            this.f52712d.lock();
            try {
                this.f52713e.signalAll();
            } finally {
                this.f52712d.unlock();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            mdg.cancel(this);
            m14565a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f52715m;
                boolean zIsEmpty = this.f52709a.isEmpty();
                if (z) {
                    Throwable th = this.f52708C;
                    if (th != null) {
                        throw j75.wrapOrThrow(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                t71.verifyNonBlocking();
                this.f52712d.lock();
                while (!this.f52715m && this.f52709a.isEmpty() && !isDisposed()) {
                    try {
                        try {
                            this.f52713e.await();
                        } catch (InterruptedException e) {
                            run();
                            throw j75.wrapOrThrow(e);
                        }
                    } finally {
                        this.f52712d.unlock();
                    }
                }
            }
            Throwable th2 = this.f52708C;
            if (th2 == null) {
                return false;
            }
            throw j75.wrapOrThrow(th2);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == mdg.CANCELLED;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f52709a.poll();
            long j = this.f52714f + 1;
            if (j == this.f52711c) {
                this.f52714f = 0L;
                get().request(j);
            } else {
                this.f52714f = j;
            }
            return tPoll;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f52715m = true;
            m14565a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f52708C = th;
            this.f52715m = true;
            m14565a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f52709a.offer(t)) {
                m14565a();
            } else {
                mdg.cancel(this);
                onError(new cwa("Queue full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, this.f52710b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            mdg.cancel(this);
            m14565a();
        }
    }

    public k71(m86<T> m86Var, int i) {
        this.f52706a = m86Var;
        this.f52707b = i;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        RunnableC8220a runnableC8220a = new RunnableC8220a(this.f52707b);
        this.f52706a.subscribe((lj6) runnableC8220a);
        return runnableC8220a;
    }
}
