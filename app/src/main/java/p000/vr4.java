package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class vr4<T> implements vye<T>, zr4<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f92046a;

    /* JADX INFO: renamed from: b */
    public final int f92047b;

    /* JADX INFO: renamed from: vr4$a */
    public static final class C14226a implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f92048a;

        /* JADX INFO: renamed from: b */
        public int f92049b;

        public C14226a(vr4<T> vr4Var) {
            this.f92048a = vr4Var.f92046a.iterator();
            this.f92049b = vr4Var.f92047b;
        }

        private final void drop() {
            while (this.f92049b > 0 && this.f92048a.hasNext()) {
                this.f92048a.next();
                this.f92049b--;
            }
        }

        public final Iterator<T> getIterator() {
            return this.f92048a;
        }

        public final int getLeft() {
            return this.f92049b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.f92048a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            return this.f92048a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i) {
            this.f92049b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vr4(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        this.f92046a = vyeVar;
        this.f92047b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + a18.f100c).toString());
    }

    @Override // p000.zr4
    @yfb
    public vye<T> drop(int i) {
        int i2 = this.f92047b + i;
        return i2 < 0 ? new vr4(this, i) : new vr4(this.f92046a, i2);
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new C14226a(this);
    }

    @Override // p000.zr4
    @yfb
    public vye<T> take(int i) {
        int i2 = this.f92047b;
        int i3 = i2 + i;
        return i3 < 0 ? new bmg(this, i) : new hcg(this.f92046a, i2, i3);
    }
}
