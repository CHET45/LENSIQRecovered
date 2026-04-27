package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class or5 {

    /* JADX INFO: renamed from: b */
    public static or5 f68369b = fromSet(new HashSet());

    /* JADX INFO: renamed from: a */
    public final Set<wr5> f68370a;

    private or5(Set<wr5> set) {
        this.f68370a = set;
    }

    public static or5 fromSet(Set<wr5> set) {
        return new or5(set);
    }

    public boolean covers(wr5 wr5Var) {
        Iterator<wr5> it = this.f68370a.iterator();
        while (it.hasNext()) {
            if (it.next().isPrefixOf(wr5Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || or5.class != obj.getClass()) {
            return false;
        }
        return this.f68370a.equals(((or5) obj).f68370a);
    }

    public Set<wr5> getMask() {
        return this.f68370a;
    }

    public int hashCode() {
        return this.f68370a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f68370a.toString() + "}";
    }
}
