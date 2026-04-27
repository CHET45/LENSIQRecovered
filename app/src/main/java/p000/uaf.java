package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class uaf implements Iterator<Short>, uo8 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(nextShort());
    }

    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @yfb
    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
    public final Short next2() {
        return Short.valueOf(nextShort());
    }
}
