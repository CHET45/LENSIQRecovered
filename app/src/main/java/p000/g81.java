package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class g81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f38983a;

    /* JADX INFO: renamed from: b */
    public final T f38984b;

    /* JADX INFO: renamed from: g81$a */
    public static final class C6159a<T> extends kx3<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f38985b;

        /* JADX INFO: renamed from: g81$a$a */
        public final class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f38986a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f38986a = C6159a.this.f38985b;
                return !ehb.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f38986a == null) {
                        this.f38986a = C6159a.this.f38985b;
                    }
                    if (ehb.isComplete(this.f38986a)) {
                        throw new NoSuchElementException();
                    }
                    if (ehb.isError(this.f38986a)) {
                        throw j75.wrapOrThrow(ehb.getError(this.f38986a));
                    }
                    T t = (T) ehb.getValue(this.f38986a);
                    this.f38986a = null;
                    return t;
                } catch (Throwable th) {
                    this.f38986a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C6159a(T t) {
            this.f38985b = ehb.next(t);
        }

        public C6159a<T>.a getIterable() {
            return new a();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f38985b = ehb.complete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f38985b = ehb.error(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f38985b = ehb.next(t);
        }
    }

    public g81(xub<T> xubVar, T t) {
        this.f38983a = xubVar;
        this.f38984b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C6159a c6159a = new C6159a(this.f38984b);
        this.f38983a.subscribe(c6159a);
        return c6159a.getIterable();
    }
}
