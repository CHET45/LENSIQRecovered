package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.auf;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n96#2,2:373\n140#2,5:375\n145#2:381\n133#2:382\n146#2,5:384\n98#2,7:389\n151#2,2:396\n137#2:398\n153#2,6:404\n161#2,3:413\n105#2:416\n96#2,2:417\n140#2,5:419\n145#2:425\n133#2:426\n146#2,5:428\n98#2,7:433\n151#2,2:440\n137#2:442\n153#2,6:448\n161#2,3:457\n105#2:460\n89#3:380\n89#3:424\n2420#4:383\n2313#4,2:399\n1843#4:401\n2315#4,2:402\n2317#4,3:410\n2420#4:427\n2313#4,2:443\n1843#4:445\n2315#4,2:446\n2317#4,3:454\n1726#5,3:461\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n262#1:373,2\n262#1:375,5\n262#1:381\n262#1:382\n262#1:384,5\n262#1:389,7\n262#1:396,2\n262#1:398\n262#1:404,6\n262#1:413,3\n262#1:416\n266#1:417,2\n266#1:419,5\n266#1:425\n266#1:426\n266#1:428,5\n266#1:433,7\n266#1:440,2\n266#1:442\n266#1:448,6\n266#1:457,3\n266#1:460\n262#1:380\n266#1:424\n262#1:383\n262#1:399,2\n262#1:401\n262#1:402,2\n262#1:410,3\n266#1:427\n266#1:443,2\n266#1:445\n266#1:446,2\n266#1:454,3\n270#1:461,3\n*E\n"})
public final class ntf<K, V> extends mtf<K, V, V> {
    public ntf(@yfb auf<K, V> aufVar) {
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
        return getMap().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().removeValue$runtime_release(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
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
                if (set.contains(next.getValue())) {
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
                if (!set.contains(next.getValue())) {
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
    public Void add(V v) {
        buf.unsupported();
        throw new us8();
    }

    @Override // java.util.Set, java.util.Collection
    @yfb
    public Void addAll(@yfb Collection<? extends V> collection) {
        buf.unsupported();
        throw new us8();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @yfb
    public w2g<K, V> iterator() {
        return new w2g<>(getMap(), ((ey7) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
