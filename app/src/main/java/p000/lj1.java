package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lj1 implements Iterator<Byte>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }
}
