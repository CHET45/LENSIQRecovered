package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class c81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T> f15923a;

    /* JADX INFO: renamed from: b */
    public final int f15924b;

    /* JADX INFO: renamed from: c81$a */
    public static final class C2220a<T> extends AtomicReference<mf4> implements oxb<T>, Iterator<T>, mf4 {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: a */
        public final rzf<T> f15925a;

        /* JADX INFO: renamed from: b */
        public final Lock f15926b;

        /* JADX INFO: renamed from: c */
        public final Condition f15927c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f15928d;

        /* JADX INFO: renamed from: e */
        public volatile Throwable f15929e;

        public C2220a(int i) {
            this.f15925a = new rzf<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f15926b = reentrantLock;
            this.f15927c = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public void m3836a() {
            this.f15926b.lock();
            try {
                this.f15927c.signalAll();
            } finally {
                this.f15926b.unlock();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            m3836a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f15928d;
                boolean zIsEmpty = this.f15925a.isEmpty();
                if (z) {
                    Throwable th = this.f15929e;
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
                try {
                    t71.verifyNonBlocking();
                    this.f15926b.lock();
                    while (!this.f15928d && this.f15925a.isEmpty() && !isDisposed()) {
                        try {
                            this.f15927c.await();
                        } finally {
                        }
                    }
                    this.f15926b.unlock();
                } catch (InterruptedException e) {
                    ag4.dispose(this);
                    m3836a();
                    throw j75.wrapOrThrow(e);
                }
            }
            Throwable th2 = this.f15929e;
            if (th2 == null) {
                return false;
            }
            throw j75.wrapOrThrow(th2);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f15925a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f15928d = true;
            m3836a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f15929e = th;
            this.f15928d = true;
            m3836a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f15925a.offer(t);
            m3836a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public c81(xub<? extends T> xubVar, int i) {
        this.f15923a = xubVar;
        this.f15924b = i;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C2220a c2220a = new C2220a(this.f15924b);
        this.f15923a.subscribe(c2220a);
        return c2220a;
    }
}
