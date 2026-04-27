package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class bs4<T> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f14641a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, Boolean> f14642b;

    /* JADX INFO: renamed from: bs4$a */
    public static final class C2031a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f14643a;

        /* JADX INFO: renamed from: b */
        public int f14644b = -1;

        /* JADX INFO: renamed from: c */
        public T f14645c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bs4<T> f14646d;

        public C2031a(bs4<T> bs4Var) {
            this.f14646d = bs4Var;
            this.f14643a = bs4Var.f14641a.iterator();
        }

        private final void drop() {
            while (this.f14643a.hasNext()) {
                T next = this.f14643a.next();
                if (!((Boolean) this.f14646d.f14642b.invoke(next)).booleanValue()) {
                    this.f14645c = next;
                    this.f14644b = 1;
                    return;
                }
            }
            this.f14644b = 0;
        }

        public final int getDropState() {
            return this.f14644b;
        }

        public final Iterator<T> getIterator() {
            return this.f14643a;
        }

        public final T getNextItem() {
            return this.f14645c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14644b == -1) {
                drop();
            }
            return this.f14644b == 1 || this.f14643a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f14644b == -1) {
                drop();
            }
            if (this.f14644b != 1) {
                return this.f14643a.next();
            }
            T t = this.f14645c;
            this.f14645c = null;
            this.f14644b = 0;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i) {
            this.f14644b = i;
        }

        public final void setNextItem(T t) {
            this.f14645c = t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bs4(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(qy6Var, "predicate");
        this.f14641a = vyeVar;
        this.f14642b = qy6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C2031a(this);
    }
}
