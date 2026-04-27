package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class hcg<T> implements vye<T>, zr4<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f43151a;

    /* JADX INFO: renamed from: b */
    public final int f43152b;

    /* JADX INFO: renamed from: c */
    public final int f43153c;

    /* JADX INFO: renamed from: hcg$a */
    public static final class C6797a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f43154a;

        /* JADX INFO: renamed from: b */
        public int f43155b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hcg<T> f43156c;

        public C6797a(hcg<T> hcgVar) {
            this.f43156c = hcgVar;
            this.f43154a = hcgVar.f43151a.iterator();
        }

        private final void drop() {
            while (this.f43155b < this.f43156c.f43152b && this.f43154a.hasNext()) {
                this.f43154a.next();
                this.f43155b++;
            }
        }

        public final Iterator<T> getIterator() {
            return this.f43154a;
        }

        public final int getPosition() {
            return this.f43155b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.f43155b < this.f43156c.f43153c && this.f43154a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            if (this.f43155b >= this.f43156c.f43153c) {
                throw new NoSuchElementException();
            }
            this.f43155b++;
            return this.f43154a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i) {
            this.f43155b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hcg(@yfb vye<? extends T> vyeVar, int i, int i2) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        this.f43151a = vyeVar;
        this.f43152b = i;
        this.f43153c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    private final int getCount() {
        return this.f43153c - this.f43152b;
    }

    @Override // p000.zr4
    @yfb
    public vye<T> drop(int i) {
        return i >= getCount() ? ize.emptySequence() : new hcg(this.f43151a, this.f43152b + i, this.f43153c);
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C6797a(this);
    }

    @Override // p000.zr4
    @yfb
    public vye<T> take(int i) {
        if (i >= getCount()) {
            return this;
        }
        vye<T> vyeVar = this.f43151a;
        int i2 = this.f43152b;
        return new hcg(vyeVar, i2, i + i2);
    }
}
