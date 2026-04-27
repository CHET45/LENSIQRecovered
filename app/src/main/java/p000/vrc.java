package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class vrc<K, V> extends AbstractC6688h3<K> implements Set<K>, fp8 {

    /* JADX INFO: renamed from: b */
    public static final int f92088b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final src<K, V> f92089a;

    public vrc(@yfb src<K, V> srcVar) {
        this.f92089a = srcVar;
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f92089a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f92089a.containsKey(obj);
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f92089a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<K> iterator() {
        return new wrc(this.f92089a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f92089a.containsKey(obj)) {
            return false;
        }
        this.f92089a.remove(obj);
        return true;
    }
}
