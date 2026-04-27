package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ck4 implements Iterator<Double>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Double next() {
        return Double.valueOf(nextDouble());
    }
}
