package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class x27<T> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<T> f96093a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, T> f96094b;

    /* JADX INFO: renamed from: x27$a */
    public static final class C14886a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public T f96095a;

        /* JADX INFO: renamed from: b */
        public int f96096b = -2;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x27<T> f96097c;

        public C14886a(x27<T> x27Var) {
            this.f96097c = x27Var;
        }

        private final void calcNext() {
            T t;
            if (this.f96096b == -2) {
                t = (T) this.f96097c.f96093a.invoke();
            } else {
                qy6 qy6Var = this.f96097c.f96094b;
                T t2 = this.f96095a;
                md8.checkNotNull(t2);
                t = (T) qy6Var.invoke(t2);
            }
            this.f96095a = t;
            this.f96096b = t == null ? 0 : 1;
        }

        public final T getNextItem() {
            return this.f96095a;
        }

        public final int getNextState() {
            return this.f96096b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f96096b < 0) {
                calcNext();
            }
            return this.f96096b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f96096b < 0) {
                calcNext();
            }
            if (this.f96096b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f96095a;
            md8.checkNotNull(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f96096b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(T t) {
            this.f96095a = t;
        }

        public final void setNextState(int i) {
            this.f96096b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x27(@yfb ny6<? extends T> ny6Var, @yfb qy6<? super T, ? extends T> qy6Var) {
        md8.checkNotNullParameter(ny6Var, "getInitialValue");
        md8.checkNotNullParameter(qy6Var, "getNextValue");
        this.f96093a = ny6Var;
        this.f96094b = qy6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C14886a(this);
    }
}
