package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class cmg<T> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f16977a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, Boolean> f16978b;

    /* JADX INFO: renamed from: cmg$a */
    public static final class C2391a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f16979a;

        /* JADX INFO: renamed from: b */
        public int f16980b = -1;

        /* JADX INFO: renamed from: c */
        public T f16981c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ cmg<T> f16982d;

        public C2391a(cmg<T> cmgVar) {
            this.f16982d = cmgVar;
            this.f16979a = cmgVar.f16977a.iterator();
        }

        private final void calcNext() {
            if (this.f16979a.hasNext()) {
                T next = this.f16979a.next();
                if (((Boolean) this.f16982d.f16978b.invoke(next)).booleanValue()) {
                    this.f16980b = 1;
                    this.f16981c = next;
                    return;
                }
            }
            this.f16980b = 0;
        }

        public final Iterator<T> getIterator() {
            return this.f16979a;
        }

        public final T getNextItem() {
            return this.f16981c;
        }

        public final int getNextState() {
            return this.f16980b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16980b == -1) {
                calcNext();
            }
            return this.f16980b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f16980b == -1) {
                calcNext();
            }
            if (this.f16980b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f16981c;
            this.f16981c = null;
            this.f16980b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(T t) {
            this.f16981c = t;
        }

        public final void setNextState(int i) {
            this.f16980b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cmg(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(qy6Var, "predicate");
        this.f16977a = vyeVar;
        this.f16978b = qy6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C2391a(this);
    }
}
