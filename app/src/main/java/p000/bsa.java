package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class bsa<T1, T2, V> implements vye<V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T1> f14654a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final vye<T2> f14655b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final gz6<T1, T2, V> f14656c;

    /* JADX INFO: renamed from: bsa$a */
    public static final class C2032a implements Iterator<V>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T1> f14657a;

        /* JADX INFO: renamed from: b */
        public final Iterator<T2> f14658b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bsa<T1, T2, V> f14659c;

        public C2032a(bsa<T1, T2, V> bsaVar) {
            this.f14659c = bsaVar;
            this.f14657a = bsaVar.f14654a.iterator();
            this.f14658b = bsaVar.f14655b.iterator();
        }

        public final Iterator<T1> getIterator1() {
            return this.f14657a;
        }

        public final Iterator<T2> getIterator2() {
            return this.f14658b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14657a.hasNext() && this.f14658b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f14659c.f14656c.invoke(this.f14657a.next(), this.f14658b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bsa(@yfb vye<? extends T1> vyeVar, @yfb vye<? extends T2> vyeVar2, @yfb gz6<? super T1, ? super T2, ? extends V> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence1");
        md8.checkNotNullParameter(vyeVar2, "sequence2");
        md8.checkNotNullParameter(gz6Var, "transform");
        this.f14654a = vyeVar;
        this.f14655b = vyeVar2;
        this.f14656c = gz6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<V> iterator() {
        return new C2032a(this);
    }
}
