package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gl9 implements Iterator<Long>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
