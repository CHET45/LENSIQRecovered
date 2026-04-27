package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class t08<T> implements vye<q08<? extends T>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f83311a;

    /* JADX INFO: renamed from: t08$a */
    public static final class C12841a implements Iterator<q08<? extends T>>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f83312a;

        /* JADX INFO: renamed from: b */
        public int f83313b;

        public C12841a(t08<T> t08Var) {
            this.f83312a = t08Var.f83311a.iterator();
        }

        public final int getIndex() {
            return this.f83313b;
        }

        public final Iterator<T> getIterator() {
            return this.f83312a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83312a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f83313b = i;
        }

        @Override // java.util.Iterator
        public q08<T> next() {
            int i = this.f83313b;
            this.f83313b = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            return new q08<>(i, this.f83312a.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t08(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        this.f83311a = vyeVar;
    }

    @Override // p000.vye
    @yfb
    public Iterator<q08<T>> iterator() {
        return new C12841a(this);
    }
}
