package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class f81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f35668a;

    /* JADX INFO: renamed from: f81$a */
    public static final class C5675a<T> extends fg4<jgb<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public jgb<T> f35669b;

        /* JADX INFO: renamed from: c */
        public final Semaphore f35670c = new Semaphore(0);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<jgb<T>> f35671d = new AtomicReference<>();

        @Override // java.util.Iterator
        public boolean hasNext() {
            jgb<T> jgbVar = this.f35669b;
            if (jgbVar != null && jgbVar.isOnError()) {
                throw k75.wrapOrThrow(this.f35669b.getError());
            }
            if (this.f35669b == null) {
                try {
                    s71.verifyNonBlocking();
                    this.f35670c.acquire();
                    jgb<T> andSet = this.f35671d.getAndSet(null);
                    this.f35669b = andSet;
                    if (andSet.isOnError()) {
                        throw k75.wrapOrThrow(andSet.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f35669b = jgb.createOnError(e);
                    throw k75.wrapOrThrow(e);
                }
            }
            return this.f35669b.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.f35669b.getValue();
            this.f35669b = null;
            return value;
        }

        @Override // p000.pxb
        public void onComplete() {
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            ofe.onError(e);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // p000.pxb
        public void onNext(jgb<T> args) {
            if (this.f35671d.getAndSet(args) == null) {
                this.f35670c.release();
            }
        }
    }

    public f81(wub<T> source) {
        this.f35668a = source;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C5675a c5675a = new C5675a();
        vkb.wrap(this.f35668a).materialize().subscribe(c5675a);
        return c5675a;
    }
}
