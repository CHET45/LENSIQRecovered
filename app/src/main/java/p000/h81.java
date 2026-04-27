package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class h81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f42878a;

    /* JADX INFO: renamed from: b */
    public final T f42879b;

    /* JADX INFO: renamed from: h81$a */
    public static final class C6743a<T> extends jx3<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f42880b;

        /* JADX INFO: renamed from: h81$a$a */
        public final class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f42881a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f42881a = C6743a.this.f42880b;
                return !fhb.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f42881a == null) {
                        this.f42881a = C6743a.this.f42880b;
                    }
                    if (fhb.isComplete(this.f42881a)) {
                        throw new NoSuchElementException();
                    }
                    if (fhb.isError(this.f42881a)) {
                        throw k75.wrapOrThrow(fhb.getError(this.f42881a));
                    }
                    T t = (T) fhb.getValue(this.f42881a);
                    this.f42881a = null;
                    return t;
                } catch (Throwable th) {
                    this.f42881a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C6743a(T value) {
            this.f42880b = fhb.next(value);
        }

        public C6743a<T>.a getIterable() {
            return new a();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f42880b = fhb.complete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f42880b = fhb.error(e);
        }

        @Override // p000.pxb
        public void onNext(T args) {
            this.f42880b = fhb.next(args);
        }
    }

    public h81(wub<T> source, T initialValue) {
        this.f42878a = source;
        this.f42879b = initialValue;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C6743a c6743a = new C6743a(this.f42879b);
        this.f42878a.subscribe(c6743a);
        return c6743a.getIterable();
    }
}
