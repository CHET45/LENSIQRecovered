package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class o71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f66587a;

    /* JADX INFO: renamed from: b */
    public final T f66588b;

    /* JADX INFO: renamed from: o71$a */
    public static final class C10212a<T> extends mz3<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f66589b;

        /* JADX INFO: renamed from: o71$a$a */
        public final class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f66590a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f66590a = C10212a.this.f66589b;
                return !ehb.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f66590a == null) {
                        this.f66590a = C10212a.this.f66589b;
                    }
                    if (ehb.isComplete(this.f66590a)) {
                        throw new NoSuchElementException();
                    }
                    if (ehb.isError(this.f66590a)) {
                        throw j75.wrapOrThrow(ehb.getError(this.f66590a));
                    }
                    T t = (T) ehb.getValue(this.f66590a);
                    this.f66590a = null;
                    return t;
                } catch (Throwable th) {
                    this.f66590a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10212a(T t) {
            this.f66589b = ehb.next(t);
        }

        public C10212a<T>.a getIterable() {
            return new a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f66589b = ehb.complete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f66589b = ehb.error(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f66589b = ehb.next(t);
        }
    }

    public o71(m86<T> m86Var, T t) {
        this.f66587a = m86Var;
        this.f66588b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10212a c10212a = new C10212a(this.f66588b);
        this.f66587a.subscribe((lj6) c10212a);
        return c10212a.getIterable();
    }
}
