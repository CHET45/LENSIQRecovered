package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class arc<K, V> extends AbstractC6688h3<K> implements Set<K>, fp8 {

    /* JADX INFO: renamed from: b */
    public static final int f11683b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wqc<K, V> f11684a;

    public arc(@yfb wqc<K, V> wqcVar) {
        this.f11684a = wqcVar;
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f11684a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f11684a.containsKey(obj);
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f11684a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<K> iterator() {
        return new brc(this.f11684a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f11684a.containsKey(obj)) {
            return false;
        }
        this.f11684a.remove(obj);
        return true;
    }
}
