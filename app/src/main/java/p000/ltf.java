package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.auf;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,372:1\n1855#2,2:373\n1726#2,3:419\n96#3,2:375\n140#3,5:377\n145#3:383\n133#3:384\n146#3,5:386\n98#3,7:391\n151#3,2:398\n137#3:400\n153#3,6:406\n161#3,3:415\n105#3:418\n89#4:382\n2420#5:385\n2313#5,2:401\n1843#5:403\n2315#5,2:404\n2317#5,3:412\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n239#1:373,2\n249#1:419,3\n246#1:375,2\n246#1:377,5\n246#1:383\n246#1:384\n246#1:386,5\n246#1:391,7\n246#1:398,2\n246#1:400\n246#1:406,6\n246#1:415,3\n246#1:418\n246#1:382\n246#1:385\n246#1:401,2\n246#1:403\n246#1:404,2\n246#1:412,3\n*E\n"})
public final class ltf<K, V> extends mtf<K, V, K> {
    public ltf(@yfb auf<K, V> aufVar) {
        super(aufVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        qrc<K, V> map$runtime_release;
        int modification$runtime_release;
        boolean z;
        ssf current;
        Set set = v82.toSet(collection);
        auf<K, V> map = getMap();
        boolean z2 = false;
        do {
            synchronized (buf.f14818a) {
                z2g firstStateRecord = map.getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                auf.C1612a c1612a = (auf.C1612a) gtf.current((auf.C1612a) firstStateRecord);
                map$runtime_release = c1612a.getMap$runtime_release();
                modification$runtime_release = c1612a.getModification$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(map$runtime_release);
            qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = map$runtime_release.builder();
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!set.contains(next.getKey())) {
                    interfaceC11636aBuilder.remove(next.getKey());
                    z2 = true;
                }
            }
            bth bthVar2 = bth.f14751a;
            qrc<K, V> qrcVarBuild = interfaceC11636aBuilder.build();
            if (md8.areEqual(qrcVarBuild, map$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = map.getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            auf.C1612a c1612a2 = (auf.C1612a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                auf.C1612a c1612a3 = (auf.C1612a) gtf.writableRecord(c1612a2, map, current);
                synchronized (buf.f14818a) {
                    if (c1612a3.getModification$runtime_release() == modification$runtime_release) {
                        c1612a3.setMap$runtime_release(qrcVarBuild);
                        c1612a3.setModification$runtime_release(c1612a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, map);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    @yfb
    public Void add(K k) {
        buf.unsupported();
        throw new us8();
    }

    @Override // java.util.Set, java.util.Collection
    @yfb
    public Void addAll(@yfb Collection<? extends K> collection) {
        buf.unsupported();
        throw new us8();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @yfb
    public v2g<K, V> iterator() {
        return new v2g<>(getMap(), ((ey7) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
