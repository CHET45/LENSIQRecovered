package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class bsc<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f14664b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final esc<K, V> f14665a;

    public bsc(@yfb rrc<K, V> rrcVar) {
        this.f14665a = new esc<>(rrcVar.getFirstKey$runtime_release(), rrcVar.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14665a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        return new ls9(this.f14665a.getNextKey$runtime_release(), this.f14665a.next().getValue());
    }
}
