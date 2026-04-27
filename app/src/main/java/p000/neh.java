package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class neh<T, R> implements vye<R> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f64217a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, R> f64218b;

    /* JADX INFO: renamed from: neh$a */
    public static final class C9836a implements Iterator<R>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f64219a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ neh<T, R> f64220b;

        public C9836a(neh<T, R> nehVar) {
            this.f64220b = nehVar;
            this.f64219a = nehVar.f64217a.iterator();
        }

        public final Iterator<T> getIterator() {
            return this.f64219a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64219a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f64220b.f64218b.invoke(this.f64219a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public neh(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(qy6Var, "transformer");
        this.f64217a = vyeVar;
        this.f64218b = qy6Var;
    }

    @yfb
    public final <E> vye<E> flatten$kotlin_stdlib(@yfb qy6<? super R, ? extends Iterator<? extends E>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "iterator");
        return new m36(this.f64217a, this.f64218b, qy6Var);
    }

    @Override // p000.vye
    @yfb
    public Iterator<R> iterator() {
        return new C9836a(this);
    }
}
