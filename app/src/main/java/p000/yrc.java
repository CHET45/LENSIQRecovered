package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class yrc<K, V> extends AbstractC5064e3<V> implements Collection<V>, vo8 {

    /* JADX INFO: renamed from: b */
    public static final int f102785b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final src<K, V> f102786a;

    public yrc(@yfb src<K, V> srcVar) {
        this.f102786a = srcVar;
    }

    @Override // p000.AbstractC5064e3, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f102786a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f102786a.containsValue(obj);
    }

    @Override // p000.AbstractC5064e3
    public int getSize() {
        return this.f102786a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<V> iterator() {
        return new zrc(this.f102786a);
    }
}
