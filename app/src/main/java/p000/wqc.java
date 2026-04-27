package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class wqc<K, V> extends AbstractC6093g3<K, V> implements qrc.InterfaceC11636a<K, V> {

    /* JADX INFO: renamed from: m */
    public static final int f95164m = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public uqc<K, V> f95165a;

    /* JADX INFO: renamed from: b */
    @yfb
    public q4b f95166b = new q4b();

    /* JADX INFO: renamed from: c */
    @yfb
    public nih<K, V> f95167c;

    /* JADX INFO: renamed from: d */
    @gib
    public V f95168d;

    /* JADX INFO: renamed from: e */
    public int f95169e;

    /* JADX INFO: renamed from: f */
    public int f95170f;

    public wqc(@yfb uqc<K, V> uqcVar) {
        this.f95165a = uqcVar;
        this.f95167c = this.f95165a.getNode$runtime_release();
        this.f95170f = this.f95165a.size();
    }

    /* JADX INFO: renamed from: a */
    public final void m24752a(@yfb q4b q4bVar) {
        this.f95166b = q4bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        nih<K, V> eMPTY$runtime_release = nih.f64689e.getEMPTY$runtime_release();
        md8.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f95167c = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        return this.f95167c.containsKey(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V get(K k) {
        return this.f95167c.get(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        return new yqc(this);
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<K> getKeys() {
        return new arc(this);
    }

    public final int getModCount$runtime_release() {
        return this.f95169e;
    }

    @yfb
    public final nih<K, V> getNode$runtime_release() {
        return this.f95167c;
    }

    @gib
    public final V getOperationResult$runtime_release() {
        return this.f95168d;
    }

    @yfb
    public final q4b getOwnership() {
        return this.f95166b;
    }

    @Override // p000.AbstractC6093g3
    public int getSize() {
        return this.f95170f;
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Collection<V> getValues() {
        return new crc(this);
    }

    @Override // p000.AbstractC6093g3, java.util.AbstractMap, java.util.Map
    @gib
    public V put(K k, V v) {
        this.f95168d = null;
        this.f95167c = this.f95167c.mutablePut(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f95168d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@yfb Map<? extends K, ? extends V> map) {
        uqc<K, V> uqcVarBuild = map instanceof uqc ? (uqc) map : null;
        if (uqcVarBuild == null) {
            wqc wqcVar = map instanceof wqc ? (wqc) map : null;
            uqcVarBuild = wqcVar != null ? wqcVar.build() : null;
        }
        if (uqcVarBuild == null) {
            super.putAll(map);
            return;
        }
        a64 a64Var = new a64(0, 1, null);
        int size = size();
        nih<K, V> nihVar = this.f95167c;
        nih<K, V> node$runtime_release = uqcVarBuild.getNode$runtime_release();
        md8.checkNotNull(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f95167c = nihVar.mutablePutAll(node$runtime_release, 0, a64Var, this);
        int size2 = (uqcVarBuild.size() + size) - a64Var.getCount();
        if (size != size2) {
            setSize(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V remove(K k) {
        this.f95168d = null;
        nih nihVarMutableRemove = this.f95167c.mutableRemove(k != null ? k.hashCode() : 0, k, 0, this);
        if (nihVarMutableRemove == null) {
            nihVarMutableRemove = nih.f64689e.getEMPTY$runtime_release();
            md8.checkNotNull(nihVarMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f95167c = nihVarMutableRemove;
        return this.f95168d;
    }

    public final void setModCount$runtime_release(int i) {
        this.f95169e = i;
    }

    public final void setNode$runtime_release(@yfb nih<K, V> nihVar) {
        this.f95167c = nihVar;
    }

    public final void setOperationResult$runtime_release(@gib V v) {
        this.f95168d = v;
    }

    public void setSize(int i) {
        this.f95170f = i;
        this.f95169e++;
    }

    @Override // p000.qrc.InterfaceC11636a, p000.qqc.InterfaceC11587a
    @yfb
    public uqc<K, V> build() {
        uqc<K, V> uqcVar;
        if (this.f95167c == this.f95165a.getNode$runtime_release()) {
            uqcVar = this.f95165a;
        } else {
            this.f95166b = new q4b();
            uqcVar = new uqc<>(this.f95167c, size());
        }
        this.f95165a = uqcVar;
        return uqcVar;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        nih nihVarMutableRemove = this.f95167c.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (nihVarMutableRemove == null) {
            nihVarMutableRemove = nih.f64689e.getEMPTY$runtime_release();
            md8.checkNotNull(nihVarMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f95167c = nihVarMutableRemove;
        return size != size();
    }
}
