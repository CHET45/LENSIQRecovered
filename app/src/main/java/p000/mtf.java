package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class mtf<K, V, E> implements Set<E>, fp8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final auf<K, V> f62115a;

    public mtf(@yfb auf<K, V> aufVar) {
        this.f62115a = aufVar;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f62115a.clear();
    }

    @yfb
    public final auf<K, V> getMap() {
        return this.f62115a;
    }

    public int getSize() {
        return this.f62115a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f62115a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }
}
