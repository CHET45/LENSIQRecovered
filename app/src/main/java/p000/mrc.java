package p000;

import java.util.Collection;
import java.util.Iterator;
import p000.lsc;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class mrc<E> extends AbstractC6688h3<E> implements lsc.InterfaceC8954a<E> {

    /* JADX INFO: renamed from: f */
    public static final int f61840f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public lrc<E> f61841a;

    /* JADX INFO: renamed from: b */
    @yfb
    public q4b f61842b = new q4b();

    /* JADX INFO: renamed from: c */
    @yfb
    public oih<E> f61843c;

    /* JADX INFO: renamed from: d */
    public int f61844d;

    /* JADX INFO: renamed from: e */
    public int f61845e;

    public mrc(@yfb lrc<E> lrcVar) {
        this.f61841a = lrcVar;
        this.f61843c = this.f61841a.getNode$runtime_release();
        this.f61845e = this.f61841a.size();
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        int size = size();
        this.f61843c = this.f61843c.mutableAdd(e != null ? e.hashCode() : 0, e, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@yfb Collection<? extends E> collection) {
        lrc<E> lrcVarBuild = collection instanceof lrc ? (lrc) collection : null;
        if (lrcVarBuild == null) {
            mrc mrcVar = collection instanceof mrc ? (mrc) collection : null;
            lrcVarBuild = mrcVar != null ? mrcVar.build() : null;
        }
        if (lrcVarBuild == null) {
            return super.addAll(collection);
        }
        a64 a64Var = new a64(0, 1, null);
        int size = size();
        oih<E> oihVarMutableAddAll = this.f61843c.mutableAddAll(lrcVarBuild.getNode$runtime_release(), 0, a64Var, this);
        int size2 = (collection.size() + size) - a64Var.getCount();
        if (size != size2) {
            this.f61843c = oihVarMutableAddAll;
            setSize(size2);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        oih<E> eMPTY$runtime_release = oih.f67755d.getEMPTY$runtime_release();
        md8.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f61843c = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f61843c.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return collection instanceof lrc ? this.f61843c.containsAll(((lrc) collection).getNode$runtime_release(), 0) : collection instanceof mrc ? this.f61843c.containsAll(((mrc) collection).f61843c, 0) : super.containsAll(collection);
    }

    public final int getModCount$runtime_release() {
        return this.f61844d;
    }

    @yfb
    public final oih<E> getNode$runtime_release() {
        return this.f61843c;
    }

    @yfb
    public final q4b getOwnership$runtime_release() {
        return this.f61842b;
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f61845e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new orc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.f61843c = this.f61843c.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        lrc<E> lrcVarBuild = collection instanceof lrc ? (lrc) collection : null;
        if (lrcVarBuild == null) {
            mrc mrcVar = collection instanceof mrc ? (mrc) collection : null;
            lrcVarBuild = mrcVar != null ? mrcVar.build() : null;
        }
        if (lrcVarBuild == null) {
            return super.removeAll(collection);
        }
        a64 a64Var = new a64(0, 1, null);
        int size = size();
        Object objMutableRemoveAll = this.f61843c.mutableRemoveAll(lrcVarBuild.getNode$runtime_release(), 0, a64Var, this);
        int count = size - a64Var.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            md8.checkNotNull(objMutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f61843c = (oih) objMutableRemoveAll;
            setSize(count);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        lrc<E> lrcVarBuild = collection instanceof lrc ? (lrc) collection : null;
        if (lrcVarBuild == null) {
            mrc mrcVar = collection instanceof mrc ? (mrc) collection : null;
            lrcVarBuild = mrcVar != null ? mrcVar.build() : null;
        }
        if (lrcVarBuild == null) {
            return super.retainAll(collection);
        }
        a64 a64Var = new a64(0, 1, null);
        int size = size();
        Object objMutableRetainAll = this.f61843c.mutableRetainAll(lrcVarBuild.getNode$runtime_release(), 0, a64Var, this);
        int count = a64Var.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            md8.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f61843c = (oih) objMutableRetainAll;
            setSize(count);
        }
        return size != size();
    }

    public void setSize(int i) {
        this.f61845e = i;
        this.f61844d++;
    }

    @Override // p000.oqc.InterfaceC10501a
    @yfb
    public lrc<E> build() {
        lrc<E> lrcVar;
        if (this.f61843c == this.f61841a.getNode$runtime_release()) {
            lrcVar = this.f61841a;
        } else {
            this.f61842b = new q4b();
            lrcVar = new lrc<>(this.f61843c, size());
        }
        this.f61841a = lrcVar;
        return lrcVar;
    }
}
