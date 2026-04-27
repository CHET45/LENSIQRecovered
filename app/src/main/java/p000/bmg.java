package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class bmg<T> implements vye<T>, zr4<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f14154a;

    /* JADX INFO: renamed from: b */
    public final int f14155b;

    /* JADX INFO: renamed from: bmg$a */
    public static final class C1951a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f14156a;

        /* JADX INFO: renamed from: b */
        public final Iterator<T> f14157b;

        public C1951a(bmg<T> bmgVar) {
            this.f14156a = bmgVar.f14155b;
            this.f14157b = bmgVar.f14154a.iterator();
        }

        public final Iterator<T> getIterator() {
            return this.f14157b;
        }

        public final int getLeft() {
            return this.f14156a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14156a > 0 && this.f14157b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f14156a;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.f14156a = i - 1;
            return this.f14157b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i) {
            this.f14156a = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bmg(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        this.f14154a = vyeVar;
        this.f14155b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + a18.f100c).toString());
    }

    @Override // p000.zr4
    @yfb
    public vye<T> drop(int i) {
        int i2 = this.f14155b;
        return i >= i2 ? ize.emptySequence() : new hcg(this.f14154a, i, i2);
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C1951a(this);
    }

    @Override // p000.zr4
    @yfb
    public vye<T> take(int i) {
        return i >= this.f14155b ? this : new bmg(this.f14154a, i);
    }
}
