package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p000.ap8;

/* JADX INFO: loaded from: classes.dex */
public final class t2g<K, V> extends u2g<K, V> implements Iterator<Map.Entry<K, V>>, xo8 {

    /* JADX INFO: renamed from: t2g$a */
    @dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#2,4:373\n1#3:377\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n334#1:373,4\n334#1:377\n*E\n"})
    public static final class C12878a implements Map.Entry<K, V>, ap8.InterfaceC1546a {

        /* JADX INFO: renamed from: a */
        public final K f83542a;

        /* JADX INFO: renamed from: b */
        public V f83543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t2g<K, V> f83544c;

        public C12878a(t2g<K, V> t2gVar) {
            this.f83544c = t2gVar;
            Map.Entry<K, V> entryM23077b = t2gVar.m23077b();
            md8.checkNotNull(entryM23077b);
            this.f83542a = entryM23077b.getKey();
            Map.Entry<K, V> entryM23077b2 = t2gVar.m23077b();
            md8.checkNotNull(entryM23077b2);
            this.f83543b = entryM23077b2.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f83542a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f83543b;
        }

        @Override // java.util.Map.Entry
        public void setValue(V v) {
            this.f83543b = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v) {
            t2g<K, V> t2gVar = this.f83544c;
            if (t2gVar.getMap().getModification$runtime_release() != t2gVar.f86685c) {
                throw new ConcurrentModificationException();
            }
            V v2 = (V) getValue();
            t2gVar.getMap().put(getKey(), v);
            setValue((Object) v);
            return v2;
        }
    }

    public t2g(@yfb auf<K, V> aufVar, @yfb Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(aufVar, it);
    }

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        m23076a();
        if (m23077b() != null) {
            return new C12878a(this);
        }
        throw new IllegalStateException();
    }
}
