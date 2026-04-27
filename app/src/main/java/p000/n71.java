package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f63428a;

    /* JADX INFO: renamed from: n71$a */
    public static final class C9718a<T> extends ng4<jgb<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public final Semaphore f63429b = new Semaphore(0);

        /* JADX INFO: renamed from: c */
        public final AtomicReference<jgb<T>> f63430c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public jgb<T> f63431d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            jgb<T> jgbVar = this.f63431d;
            if (jgbVar != null && jgbVar.isOnError()) {
                throw k75.wrapOrThrow(this.f63431d.getError());
            }
            jgb<T> jgbVar2 = this.f63431d;
            if ((jgbVar2 == null || jgbVar2.isOnNext()) && this.f63431d == null) {
                try {
                    s71.verifyNonBlocking();
                    this.f63429b.acquire();
                    jgb<T> andSet = this.f63430c.getAndSet(null);
                    this.f63431d = andSet;
                    if (andSet.isOnError()) {
                        throw k75.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f63431d = jgb.createOnError(e);
                    throw k75.wrapOrThrow(e);
                }
            }
            return this.f63431d.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f63431d.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f63431d.getValue();
            this.f63431d = null;
            return value;
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            ofe.onError(e);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // p000.ycg
        public void onNext(jgb<T> args) {
            if (this.f63430c.getAndSet(args) == null) {
                this.f63429b.release();
            }
        }
    }

    public n71(zjd<? extends T> source) {
        this.f63428a = source;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C9718a c9718a = new C9718a();
        l86.fromPublisher(this.f63428a).materialize().subscribe((kj6<? super jgb<T>>) c9718a);
        return c9718a;
    }
}
