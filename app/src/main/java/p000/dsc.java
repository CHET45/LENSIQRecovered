package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dsc<K, V> implements Iterator<K>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f30599b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final esc<K, V> f30600a;

    public dsc(@yfb rrc<K, V> rrcVar) {
        this.f30600a = new esc<>(rrcVar.getFirstKey$runtime_release(), rrcVar.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30600a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k = (K) this.f30600a.getNextKey$runtime_release();
        this.f30600a.next();
        return k;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
