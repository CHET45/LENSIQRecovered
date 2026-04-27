package p000;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class rt6<K, V> extends qs6<K, V> implements SortedMap<K, V> {

    /* JADX INFO: renamed from: rt6$a */
    public class C12280a extends tt9.C13201g0<K, V> {
        public C12280a(final rt6 this$0) {
            super(this$0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m21513m(@wx1 Comparator<?> comparator, @wx1 Object o1, @wx1 Object o2) {
        return comparator == null ? ((Comparable) o1).compareTo(o2) : comparator.compare(o1, o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qs6
    /* JADX INFO: renamed from: c */
    public boolean mo20637c(@wx1 Object key) {
        try {
            return m21513m(comparator(), tailMap(key).firstKey(), key) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedMap
    @wx1
    public Comparator<? super K> comparator() {
        return mo8967m().comparator();
    }

    @Override // java.util.SortedMap
    @dgc
    public K firstKey() {
        return mo8967m().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@dgc K toKey) {
        return mo8967m().headMap(toKey);
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: k */
    public abstract SortedMap<K, V> mo8967m();

    /* JADX INFO: renamed from: l */
    public SortedMap<K, V> mo21515l(K fromKey, K toKey) {
        v7d.checkArgument(m21513m(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
        return tailMap(fromKey).headMap(toKey);
    }

    @Override // java.util.SortedMap
    @dgc
    public K lastKey() {
        return mo8967m().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
        return mo8967m().subMap(fromKey, toKey);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@dgc K fromKey) {
        return mo8967m().tailMap(fromKey);
    }
}
