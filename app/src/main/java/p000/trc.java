package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
@e0g(parameters = 0)
public final class trc<K, V> extends AbstractC12852t2<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c */
    public static final int f85675c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final src<K, V> f85676b;

    public trc(@yfb src<K, V> srcVar) {
        this.f85676b = srcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f85676b.clear();
    }

    @Override // p000.AbstractC12852t2
    public boolean containsEntry(@yfb Map.Entry<? extends K, ? extends V> entry) {
        V v = this.f85676b.get(entry.getKey());
        return v != null ? md8.areEqual(v, entry.getValue()) : entry.getValue() == null && this.f85676b.containsKey(entry.getKey());
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f85676b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<Map.Entry<K, V>> iterator() {
        return new urc(this.f85676b);
    }

    @Override // p000.AbstractC12852t2
    public boolean removeEntry(@yfb Map.Entry<? extends K, ? extends V> entry) {
        return this.f85676b.remove(entry.getKey(), entry.getValue());
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@yfb Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
