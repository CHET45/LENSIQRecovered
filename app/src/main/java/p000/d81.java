package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class d81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T> f28730a;

    /* JADX INFO: renamed from: b */
    public final int f28731b;

    /* JADX INFO: renamed from: d81$a */
    public static final class C4664a<T> extends AtomicReference<lf4> implements pxb<T>, Iterator<T>, lf4 {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: a */
        public final qzf<T> f28732a;

        /* JADX INFO: renamed from: b */
        public final Lock f28733b;

        /* JADX INFO: renamed from: c */
        public final Condition f28734c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f28735d;

        /* JADX INFO: renamed from: e */
        public volatile Throwable f28736e;

        public C4664a(int batchSize) {
            this.f28732a = new qzf<>(batchSize);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f28733b = reentrantLock;
            this.f28734c = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public void m8972a() {
            this.f28733b.lock();
            try {
                this.f28734c.signalAll();
            } finally {
                this.f28733b.unlock();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            m8972a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f28735d;
                boolean zIsEmpty = this.f28732a.isEmpty();
                if (z) {
                    Throwable th = this.f28736e;
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
                try {
                    s71.verifyNonBlocking();
                    this.f28733b.lock();
                    while (!this.f28735d && this.f28732a.isEmpty() && !isDisposed()) {
                        try {
                            this.f28734c.await();
                        } finally {
                        }
                    }
                    this.f28733b.unlock();
                } catch (InterruptedException e) {
                    zf4.dispose(this);
                    m8972a();
                    throw k75.wrapOrThrow(e);
                }
            }
            Throwable th2 = this.f28736e;
            if (th2 == null) {
                return false;
            }
            throw k75.wrapOrThrow(th2);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f28732a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f28735d = true;
            m8972a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f28736e = t;
            this.f28735d = true;
            m8972a();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f28732a.offer(t);
            m8972a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public d81(wub<? extends T> source, int bufferSize) {
        this.f28730a = source;
        this.f28731b = bufferSize;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C4664a c4664a = new C4664a(this.f28731b);
        this.f28730a.subscribe(c4664a);
        return c4664a;
    }
}
