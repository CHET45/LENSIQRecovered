package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class s08<T> implements Iterator<q08<? extends T>>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Iterator<T> f80271a;

    /* JADX INFO: renamed from: b */
    public int f80272b;

    /* JADX WARN: Multi-variable type inference failed */
    public s08(@yfb Iterator<? extends T> it) {
        md8.checkNotNullParameter(it, "iterator");
        this.f80271a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80271a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @yfb
    public final q08<T> next() {
        int i = this.f80272b;
        this.f80272b = i + 1;
        if (i < 0) {
            l82.throwIndexOverflow();
        }
        return new q08<>(i, this.f80271a.next());
    }
}
