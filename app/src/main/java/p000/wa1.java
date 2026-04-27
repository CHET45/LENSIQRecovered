package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wa1 implements Iterator<Boolean>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}
