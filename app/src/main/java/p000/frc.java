package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
@e0g(parameters = 0)
public final class frc<K, V> extends AbstractC7141i4<Map.Entry<? extends K, ? extends V>> implements ey7<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c */
    public static final int f37567c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final uqc<K, V> f37568b;

    public frc(@yfb uqc<K, V> uqcVar) {
        this.f37568b = uqcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f37568b.size();
    }

    @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<Map.Entry<K, V>> iterator() {
        return new grc(this.f37568b.getNode$runtime_release());
    }

    public boolean contains(@yfb Map.Entry<? extends K, ? extends V> entry) {
        if (entry == null) {
            return false;
        }
        V v = this.f37568b.get(entry.getKey());
        return v != null ? md8.areEqual(v, entry.getValue()) : entry.getValue() == null && this.f37568b.containsKey(entry.getKey());
    }
}
