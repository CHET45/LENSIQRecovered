package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class meh<T, R> implements vye<R> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f60821a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<Integer, T, R> f60822b;

    /* JADX INFO: renamed from: meh$a */
    public static final class C9339a implements Iterator<R>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f60823a;

        /* JADX INFO: renamed from: b */
        public int f60824b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ meh<T, R> f60825c;

        public C9339a(meh<T, R> mehVar) {
            this.f60825c = mehVar;
            this.f60823a = mehVar.f60821a.iterator();
        }

        public final int getIndex() {
            return this.f60824b;
        }

        public final Iterator<T> getIterator() {
            return this.f60823a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60823a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            gz6 gz6Var = this.f60825c.f60822b;
            int i = this.f60824b;
            this.f60824b = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            return (R) gz6Var.invoke(Integer.valueOf(i), this.f60823a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f60824b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public meh(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(gz6Var, "transformer");
        this.f60821a = vyeVar;
        this.f60822b = gz6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<R> iterator() {
        return new C9339a(this);
    }
}
