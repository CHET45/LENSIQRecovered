package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class q71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f73361a;

    /* JADX INFO: renamed from: q71$a */
    public static final class C11328a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final C11329b<T> f73362a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f73363b;

        /* JADX INFO: renamed from: c */
        public T f73364c;

        /* JADX INFO: renamed from: d */
        public boolean f73365d = true;

        /* JADX INFO: renamed from: e */
        public boolean f73366e = true;

        /* JADX INFO: renamed from: f */
        public Throwable f73367f;

        /* JADX INFO: renamed from: m */
        public boolean f73368m;

        public C11328a(zjd<? extends T> zjdVar, C11329b<T> c11329b) {
            this.f73363b = zjdVar;
            this.f73362a = c11329b;
        }

        private boolean moveToNext() {
            try {
                if (!this.f73368m) {
                    this.f73368m = true;
                    this.f73362a.m20102d();
                    m86.fromPublisher(this.f73363b).materialize().subscribe((lj6<? super kgb<T>>) this.f73362a);
                }
                kgb<T> kgbVarTakeNext = this.f73362a.takeNext();
                if (kgbVarTakeNext.isOnNext()) {
                    this.f73366e = false;
                    this.f73364c = kgbVarTakeNext.getValue();
                    return true;
                }
                this.f73365d = false;
                if (kgbVarTakeNext.isOnComplete()) {
                    return false;
                }
                if (!kgbVarTakeNext.isOnError()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable error = kgbVarTakeNext.getError();
                this.f73367f = error;
                throw j75.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f73362a.dispose();
                this.f73367f = e;
                throw j75.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f73367f;
            if (th != null) {
                throw j75.wrapOrThrow(th);
            }
            if (this.f73365d) {
                return !this.f73366e || moveToNext();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f73367f;
            if (th != null) {
                throw j75.wrapOrThrow(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f73366e = true;
            return this.f73364c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: renamed from: q71$b */
    public static final class C11329b<T> extends mg4<kgb<T>> {

        /* JADX INFO: renamed from: b */
        public final BlockingQueue<kgb<T>> f73369b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f73370c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public void m20102d() {
            this.f73370c.set(1);
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            pfe.onError(th);
        }

        public kgb<T> takeNext() throws InterruptedException {
            m20102d();
            t71.verifyNonBlocking();
            return this.f73369b.take();
        }

        @Override // p000.ycg
        public void onNext(kgb<T> kgbVar) {
            if (this.f73370c.getAndSet(0) == 1 || !kgbVar.isOnNext()) {
                while (!this.f73369b.offer(kgbVar)) {
                    kgb<T> kgbVarPoll = this.f73369b.poll();
                    if (kgbVarPoll != null && !kgbVarPoll.isOnNext()) {
                        kgbVar = kgbVarPoll;
                    }
                }
            }
        }
    }

    public q71(zjd<? extends T> zjdVar) {
        this.f73361a = zjdVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C11328a(this.f73361a, new C11329b());
    }
}
