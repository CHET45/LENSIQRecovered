package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class crc<K, V> extends AbstractC5064e3<V> implements Collection<V>, vo8 {

    /* JADX INFO: renamed from: b */
    public static final int f27135b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wqc<K, V> f27136a;

    public crc(@yfb wqc<K, V> wqcVar) {
        this.f27136a = wqcVar;
    }

    @Override // p000.AbstractC5064e3, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f27136a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27136a.containsValue(obj);
    }

    @Override // p000.AbstractC5064e3
    public int getSize() {
        return this.f27136a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<V> iterator() {
        return new drc(this.f27136a);
    }
}
