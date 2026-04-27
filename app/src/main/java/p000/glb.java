package p000;

import java.util.ArrayList;
import java.util.Collection;
import p000.drb;

/* JADX INFO: loaded from: classes3.dex */
public class glb<T> extends ArrayList<T> implements drb<T> {

    /* JADX INFO: renamed from: a */
    public transient k89 f40137a = new k89();

    private void notifyAdd(int i, int i2) {
        k89 k89Var = this.f40137a;
        if (k89Var != null) {
            k89Var.notifyInserted(this, i, i2);
        }
    }

    private void notifyRemove(int i, int i2) {
        k89 k89Var = this.f40137a;
        if (k89Var != null) {
            k89Var.notifyRemoved(this, i, i2);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        super.add(t);
        notifyAdd(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            notifyAdd(size, size() - size);
        }
        return zAddAll;
    }

    @Override // p000.drb
    public void addOnListChangedCallback(drb.AbstractC4925a abstractC4925a) {
        if (this.f40137a == null) {
            this.f40137a = new k89();
        }
        this.f40137a.add(abstractC4925a);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            notifyRemove(0, size);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i) {
        T t = (T) super.remove(i);
        notifyRemove(i, 1);
        return t;
    }

    @Override // p000.drb
    public void removeOnListChangedCallback(drb.AbstractC4925a abstractC4925a) {
        k89 k89Var = this.f40137a;
        if (k89Var != null) {
            k89Var.remove(abstractC4925a);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        notifyRemove(i, i2 - i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        T t2 = (T) super.set(i, t);
        k89 k89Var = this.f40137a;
        if (k89Var != null) {
            k89Var.notifyChanged(this, i, 1);
        }
        return t2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        super.add(i, t);
        notifyAdd(i, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i, collection);
        if (zAddAll) {
            notifyAdd(i, collection.size());
        }
        return zAddAll;
    }
}
