package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m46 implements Iterator<Float>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(nextFloat());
    }

    public abstract float nextFloat();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Float next() {
        return Float.valueOf(nextFloat());
    }
}
