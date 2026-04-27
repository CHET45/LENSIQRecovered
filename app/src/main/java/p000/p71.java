package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class p71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f69863a;

    /* JADX INFO: renamed from: b */
    public final T f69864b;

    /* JADX INFO: renamed from: p71$a */
    public static final class C10810a<T> extends nz3<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f69865b;

        /* JADX INFO: renamed from: p71$a$a */
        public final class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f69866a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f69866a = C10810a.this.f69865b;
                return !fhb.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f69866a == null) {
                        this.f69866a = C10810a.this.f69865b;
                    }
                    if (fhb.isComplete(this.f69866a)) {
                        throw new NoSuchElementException();
                    }
                    if (fhb.isError(this.f69866a)) {
                        throw k75.wrapOrThrow(fhb.getError(this.f69866a));
                    }
                    T t = (T) fhb.getValue(this.f69866a);
                    this.f69866a = null;
                    return t;
                } catch (Throwable th) {
                    this.f69866a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10810a(T value) {
            this.f69865b = fhb.next(value);
        }

        public C10810a<T>.a getIterable() {
            return new a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f69865b = fhb.complete();
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            this.f69865b = fhb.error(e);
        }

        @Override // p000.ycg
        public void onNext(T args) {
            this.f69865b = fhb.next(args);
        }
    }

    public p71(l86<T> source, T initialValue) {
        this.f69863a = source;
        this.f69864b = initialValue;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10810a c10810a = new C10810a(this.f69864b);
        this.f69863a.subscribe((kj6) c10810a);
        return c10810a.getIterable();
    }
}
