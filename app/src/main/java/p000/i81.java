package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class i81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f46008a;

    /* JADX INFO: renamed from: i81$a */
    public static final class C7179a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final C7180b<T> f46009a;

        /* JADX INFO: renamed from: b */
        public final xub<T> f46010b;

        /* JADX INFO: renamed from: c */
        public T f46011c;

        /* JADX INFO: renamed from: d */
        public boolean f46012d = true;

        /* JADX INFO: renamed from: e */
        public boolean f46013e = true;

        /* JADX INFO: renamed from: f */
        public Throwable f46014f;

        /* JADX INFO: renamed from: m */
        public boolean f46015m;

        public C7179a(xub<T> xubVar, C7180b<T> c7180b) {
            this.f46010b = xubVar;
            this.f46009a = c7180b;
        }

        private boolean moveToNext() {
            if (!this.f46015m) {
                this.f46015m = true;
                this.f46009a.m12851b();
                new lrb(this.f46010b).subscribe(this.f46009a);
            }
            try {
                kgb<T> kgbVarTakeNext = this.f46009a.takeNext();
                if (kgbVarTakeNext.isOnNext()) {
                    this.f46013e = false;
                    this.f46011c = kgbVarTakeNext.getValue();
                    return true;
                }
                this.f46012d = false;
                if (kgbVarTakeNext.isOnComplete()) {
                    return false;
                }
                Throwable error = kgbVarTakeNext.getError();
                this.f46014f = error;
                throw j75.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f46009a.dispose();
                this.f46014f = e;
                throw j75.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f46014f;
            if (th != null) {
                throw j75.wrapOrThrow(th);
            }
            if (this.f46012d) {
                return !this.f46013e || moveToNext();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f46014f;
            if (th != null) {
                throw j75.wrapOrThrow(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f46013e = true;
            return this.f46011c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: renamed from: i81$b */
    public static final class C7180b<T> extends gg4<kgb<T>> {

        /* JADX INFO: renamed from: b */
        public final BlockingQueue<kgb<T>> f46016b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f46017c = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public void m12851b() {
            this.f46017c.set(1);
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            pfe.onError(th);
        }

        public kgb<T> takeNext() throws InterruptedException {
            m12851b();
            t71.verifyNonBlocking();
            return this.f46016b.take();
        }

        @Override // p000.oxb
        public void onNext(kgb<T> kgbVar) {
            if (this.f46017c.getAndSet(0) == 1 || !kgbVar.isOnNext()) {
                while (!this.f46016b.offer(kgbVar)) {
                    kgb<T> kgbVarPoll = this.f46016b.poll();
                    if (kgbVarPoll != null && !kgbVarPoll.isOnNext()) {
                        kgbVar = kgbVarPoll;
                    }
                }
            }
        }
    }

    public i81(xub<T> xubVar) {
        this.f46008a = xubVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C7179a(this.f46008a, new C7180b());
    }
}
