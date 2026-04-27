package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class vv0 implements du9 {

    /* JADX INFO: renamed from: c */
    public static String f92326c = "[ ";

    /* JADX INFO: renamed from: d */
    public static String f92327d = " ]";

    /* JADX INFO: renamed from: e */
    public static String f92328e = ", ";
    private static final long serialVersionUID = -2849567615646933777L;

    /* JADX INFO: renamed from: a */
    public final String f92329a;

    /* JADX INFO: renamed from: b */
    public List<du9> f92330b = new CopyOnWriteArrayList();

    public vv0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.f92329a = str;
    }

    @Override // p000.du9
    public void add(du9 du9Var) {
        if (du9Var == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (contains(du9Var) || du9Var.contains(this)) {
            return;
        }
        this.f92330b.add(du9Var);
    }

    @Override // p000.du9
    public boolean contains(du9 du9Var) {
        if (du9Var == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (equals(du9Var)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        Iterator<du9> it = this.f92330b.iterator();
        while (it.hasNext()) {
            if (it.next().contains(du9Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.du9
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof du9)) {
            return this.f92329a.equals(((du9) obj).getName());
        }
        return false;
    }

    @Override // p000.du9
    public String getName() {
        return this.f92329a;
    }

    @Override // p000.du9
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // p000.du9
    public boolean hasReferences() {
        return this.f92330b.size() > 0;
    }

    @Override // p000.du9
    public int hashCode() {
        return this.f92329a.hashCode();
    }

    @Override // p000.du9
    public Iterator<du9> iterator() {
        return this.f92330b.iterator();
    }

    @Override // p000.du9
    public boolean remove(du9 du9Var) {
        return this.f92330b.remove(du9Var);
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator<du9> it = iterator();
        StringBuilder sb = new StringBuilder(getName());
        sb.append(' ');
        sb.append(f92326c);
        while (it.hasNext()) {
            sb.append(it.next().getName());
            if (it.hasNext()) {
                sb.append(f92328e);
            }
        }
        sb.append(f92327d);
        return sb.toString();
    }

    @Override // p000.du9
    public boolean contains(String str) {
        if (str != null) {
            if (this.f92329a.equals(str)) {
                return true;
            }
            if (!hasReferences()) {
                return false;
            }
            Iterator<du9> it = this.f92330b.iterator();
            while (it.hasNext()) {
                if (it.next().contains(str)) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Other cannot be null");
    }
}
