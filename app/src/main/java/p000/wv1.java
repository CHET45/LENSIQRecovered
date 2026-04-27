package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wv1 implements Iterator<Character>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(nextChar());
    }

    public abstract char nextChar();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public final Character next() {
        return Character.valueOf(nextChar());
    }
}
