package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000.p4d;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class id4<T> {

    /* JADX INFO: renamed from: a */
    public final p4d.InterfaceC10791a<ArrayList<T>> f46532a = new p4d.C10792b(10);

    /* JADX INFO: renamed from: b */
    public final scf<T, ArrayList<T>> f46533b = new scf<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f46534c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f46535d = new HashSet<>();

    private void dfs(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f46533b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                dfs(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @efb
    private ArrayList<T> getEmptyList() {
        ArrayList<T> arrayListAcquire = this.f46532a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    private void poolList(@efb ArrayList<T> arrayList) {
        arrayList.clear();
        this.f46532a.release(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public int m12892a() {
        return this.f46533b.size();
    }

    public void addEdge(@efb T t, @efb T t2) {
        if (!this.f46533b.containsKey(t) || !this.f46533b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> emptyList = this.f46533b.get(t);
        if (emptyList == null) {
            emptyList = getEmptyList();
            this.f46533b.put(t, emptyList);
        }
        emptyList.add(t2);
    }

    public void addNode(@efb T t) {
        if (this.f46533b.containsKey(t)) {
            return;
        }
        this.f46533b.put(t, null);
    }

    public void clear() {
        int size = this.f46533b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f46533b.valueAt(i);
            if (arrayListValueAt != null) {
                poolList(arrayListValueAt);
            }
        }
        this.f46533b.clear();
    }

    public boolean contains(@efb T t) {
        return this.f46533b.containsKey(t);
    }

    @hib
    public List getIncomingEdges(@efb T t) {
        return this.f46533b.get(t);
    }

    @hib
    public List<T> getOutgoingEdges(@efb T t) {
        int size = this.f46533b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f46533b.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f46533b.keyAt(i));
            }
        }
        return arrayList;
    }

    @efb
    public ArrayList<T> getSortedList() {
        this.f46534c.clear();
        this.f46535d.clear();
        int size = this.f46533b.size();
        for (int i = 0; i < size; i++) {
            dfs(this.f46533b.keyAt(i), this.f46534c, this.f46535d);
        }
        return this.f46534c;
    }

    public boolean hasOutgoingEdges(@efb T t) {
        int size = this.f46533b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f46533b.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
