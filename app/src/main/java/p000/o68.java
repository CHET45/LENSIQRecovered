package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o68 implements Iterator<Integer>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
