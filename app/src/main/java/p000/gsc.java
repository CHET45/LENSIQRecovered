package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class gsc<K, V> implements Iterator<V>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f40947b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final esc<K, V> f40948a;

    public gsc(@yfb rrc<K, V> rrcVar) {
        this.f40948a = new esc<>(rrcVar.getFirstKey$runtime_release(), rrcVar.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40948a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f40948a.next().getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
