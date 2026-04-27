package p000;

import io.reactivex.Observable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f32103a;

    /* JADX INFO: renamed from: e81$a */
    public static final class C5188a<T> extends gg4<kgb<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public kgb<T> f32104b;

        /* JADX INFO: renamed from: c */
        public final Semaphore f32105c = new Semaphore(0);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<kgb<T>> f32106d = new AtomicReference<>();

        @Override // java.util.Iterator
        public boolean hasNext() {
            kgb<T> kgbVar = this.f32104b;
            if (kgbVar != null && kgbVar.isOnError()) {
                throw j75.wrapOrThrow(this.f32104b.getError());
            }
            if (this.f32104b == null) {
                try {
                    t71.verifyNonBlocking();
                    this.f32105c.acquire();
                    kgb<T> andSet = this.f32106d.getAndSet(null);
                    this.f32104b = andSet;
                    if (andSet.isOnError()) {
                        throw j75.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f32104b = kgb.createOnError(e);
                    throw j75.wrapOrThrow(e);
                }
            }
            return this.f32104b.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f32104b.getValue();
            this.f32104b = null;
            return value;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            pfe.onError(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // p000.oxb
        public void onNext(kgb<T> kgbVar) {
            if (this.f32106d.getAndSet(kgbVar) == null) {
                this.f32105c.release();
            }
        }
    }

    public e81(xub<T> xubVar) {
        this.f32103a = xubVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C5188a c5188a = new C5188a();
        Observable.wrap(this.f32103a).materialize().subscribe(c5188a);
        return c5188a;
    }
}
