package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class pv5<T> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f72203a;

    /* JADX INFO: renamed from: b */
    public final boolean f72204b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<T, Boolean> f72205c;

    /* JADX INFO: renamed from: pv5$a */
    public static final class C11143a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f72206a;

        /* JADX INFO: renamed from: b */
        public int f72207b = -1;

        /* JADX INFO: renamed from: c */
        public T f72208c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ pv5<T> f72209d;

        public C11143a(pv5<T> pv5Var) {
            this.f72209d = pv5Var;
            this.f72206a = pv5Var.f72203a.iterator();
        }

        private final void calcNext() {
            while (this.f72206a.hasNext()) {
                T next = this.f72206a.next();
                if (((Boolean) this.f72209d.f72205c.invoke(next)).booleanValue() == this.f72209d.f72204b) {
                    this.f72208c = next;
                    this.f72207b = 1;
                    return;
                }
            }
            this.f72207b = 0;
        }

        public final Iterator<T> getIterator() {
            return this.f72206a;
        }

        public final T getNextItem() {
            return this.f72208c;
        }

        public final int getNextState() {
            return this.f72207b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f72207b == -1) {
                calcNext();
            }
            return this.f72207b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f72207b == -1) {
                calcNext();
            }
            if (this.f72207b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f72208c;
            this.f72208c = null;
            this.f72207b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(T t) {
            this.f72208c = t;
        }

        public final void setNextState(int i) {
            this.f72207b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pv5(@yfb vye<? extends T> vyeVar, boolean z, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(qy6Var, "predicate");
        this.f72203a = vyeVar;
        this.f72204b = z;
        this.f72205c = qy6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C11143a(this);
    }

    public /* synthetic */ pv5(vye vyeVar, boolean z, qy6 qy6Var, int i, jt3 jt3Var) {
        this(vyeVar, (i & 2) != 0 ? true : z, qy6Var);
    }
}
