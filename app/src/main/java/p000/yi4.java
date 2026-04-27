package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class yi4 implements Iterable<ph4> {

    /* JADX INFO: renamed from: a */
    public final ky7<ci4, ph4> f101687a;

    /* JADX INFO: renamed from: b */
    public final qy7<ph4> f101688b;

    private yi4(ky7<ci4, ph4> ky7Var, qy7<ph4> qy7Var) {
        this.f101687a = ky7Var;
        this.f101688b = qy7Var;
    }

    public static yi4 emptySet(final Comparator<ph4> comparator) {
        return new yi4(uh4.emptyDocumentMap(), new qy7(Collections.emptyList(), new Comparator() { // from class: xi4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yi4.lambda$emptySet$0(comparator, (ph4) obj, (ph4) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$emptySet$0(Comparator comparator, ph4 ph4Var, ph4 ph4Var2) {
        int iCompare = comparator.compare(ph4Var, ph4Var2);
        return iCompare == 0 ? ph4.f70782a.compare(ph4Var, ph4Var2) : iCompare;
    }

    public yi4 add(ph4 ph4Var) {
        yi4 yi4VarRemove = remove(ph4Var.getKey());
        return new yi4(yi4VarRemove.f101687a.insert(ph4Var.getKey(), ph4Var), yi4VarRemove.f101688b.insert(ph4Var));
    }

    public boolean contains(ci4 ci4Var) {
        return this.f101687a.containsKey(ci4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yi4.class != obj.getClass()) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        if (size() != yi4Var.size()) {
            return false;
        }
        Iterator<ph4> it = iterator();
        Iterator<ph4> it2 = yi4Var.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @hib
    public ph4 getDocument(ci4 ci4Var) {
        return this.f101687a.get(ci4Var);
    }

    @hib
    public ph4 getFirstDocument() {
        return this.f101688b.getMinEntry();
    }

    @hib
    public ph4 getLastDocument() {
        return this.f101688b.getMaxEntry();
    }

    @hib
    public ph4 getPredecessor(ci4 ci4Var) {
        ph4 ph4Var = this.f101687a.get(ci4Var);
        if (ph4Var != null) {
            return this.f101688b.getPredecessorEntry(ph4Var);
        }
        throw new IllegalArgumentException("Key not contained in DocumentSet: " + ci4Var);
    }

    public int hashCode() {
        int iHashCode = 0;
        for (ph4 ph4Var : this) {
            iHashCode = (((iHashCode * 31) + ph4Var.getKey().hashCode()) * 31) + ph4Var.getData().hashCode();
        }
        return iHashCode;
    }

    public int indexOf(ci4 ci4Var) {
        ph4 ph4Var = this.f101687a.get(ci4Var);
        if (ph4Var == null) {
            return -1;
        }
        return this.f101688b.indexOf(ph4Var);
    }

    public boolean isEmpty() {
        return this.f101687a.isEmpty();
    }

    @Override // java.lang.Iterable
    @efb
    public Iterator<ph4> iterator() {
        return this.f101688b.iterator();
    }

    public yi4 remove(ci4 ci4Var) {
        ph4 ph4Var = this.f101687a.get(ci4Var);
        return ph4Var == null ? this : new yi4(this.f101687a.remove(ci4Var), this.f101688b.remove(ph4Var));
    }

    public int size() {
        return this.f101687a.size();
    }

    public List<ph4> toList() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<ph4> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (ph4 ph4Var : this) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(ph4Var);
        }
        sb.append("]");
        return sb.toString();
    }
}
