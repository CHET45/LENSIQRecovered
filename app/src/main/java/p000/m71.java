package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f60044a;

    /* JADX INFO: renamed from: m71$a */
    public static final class C9168a<T> extends mg4<kgb<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public final Semaphore f60045b = new Semaphore(0);

        /* JADX INFO: renamed from: c */
        public final AtomicReference<kgb<T>> f60046c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public kgb<T> f60047d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            kgb<T> kgbVar = this.f60047d;
            if (kgbVar != null && kgbVar.isOnError()) {
                throw j75.wrapOrThrow(this.f60047d.getError());
            }
            kgb<T> kgbVar2 = this.f60047d;
            if ((kgbVar2 == null || kgbVar2.isOnNext()) && this.f60047d == null) {
                try {
                    t71.verifyNonBlocking();
                    this.f60045b.acquire();
                    kgb<T> andSet = this.f60046c.getAndSet(null);
                    this.f60047d = andSet;
                    if (andSet.isOnError()) {
                        throw j75.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f60047d = kgb.createOnError(e);
                    throw j75.wrapOrThrow(e);
                }
            }
            return this.f60047d.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f60047d.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f60047d.getValue();
            this.f60047d = null;
            return value;
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            pfe.onError(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // p000.ycg
        public void onNext(kgb<T> kgbVar) {
            if (this.f60046c.getAndSet(kgbVar) == null) {
                this.f60045b.release();
            }
        }
    }

    public m71(zjd<? extends T> zjdVar) {
        this.f60044a = zjdVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C9168a c9168a = new C9168a();
        m86.fromPublisher(this.f60044a).materialize().subscribe((lj6<? super kgb<T>>) c9168a);
        return c9168a;
    }
}
