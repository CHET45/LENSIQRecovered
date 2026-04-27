package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ci4 implements Comparable<ci4> {

    /* JADX INFO: renamed from: b */
    public static final String f16605b = "__name__";

    /* JADX INFO: renamed from: c */
    public static final Comparator<ci4> f16606c;

    /* JADX INFO: renamed from: d */
    public static final qy7<ci4> f16607d;

    /* JADX INFO: renamed from: a */
    public final s6e f16608a;

    static {
        Comparator<ci4> comparator = new Comparator() { // from class: bi4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((ci4) obj).compareTo((ci4) obj2);
            }
        };
        f16606c = comparator;
        f16607d = new qy7<>(Collections.emptyList(), comparator);
    }

    private ci4(s6e s6eVar) {
        r80.hardAssert(isDocumentKey(s6eVar), "Not a document key path: %s", s6eVar);
        this.f16608a = s6eVar;
    }

    public static Comparator<ci4> comparator() {
        return f16606c;
    }

    public static ci4 empty() {
        return fromSegments(Collections.emptyList());
    }

    public static qy7<ci4> emptyKeySet() {
        return f16607d;
    }

    public static ci4 fromName(String str) {
        s6e s6eVarFromString = s6e.fromString(str);
        boolean z = false;
        if (s6eVarFromString.length() > 4 && s6eVarFromString.getSegment(0).equals("projects") && s6eVarFromString.getSegment(2).equals("databases") && s6eVarFromString.getSegment(4).equals("documents")) {
            z = true;
        }
        r80.hardAssert(z, "Tried to parse an invalid key: %s", s6eVarFromString);
        return fromPath(s6eVarFromString.popFirst(5));
    }

    public static ci4 fromPath(s6e s6eVar) {
        return new ci4(s6eVar);
    }

    public static ci4 fromPathString(String str) {
        return new ci4(s6e.fromString(str));
    }

    public static ci4 fromSegments(List<String> list) {
        return new ci4(s6e.fromSegments(list));
    }

    public static boolean isDocumentKey(s6e s6eVar) {
        return s6eVar.length() % 2 == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ci4.class != obj.getClass()) {
            return false;
        }
        return this.f16608a.equals(((ci4) obj).f16608a);
    }

    public String getCollectionGroup() {
        return this.f16608a.getSegment(r0.length() - 2);
    }

    public s6e getCollectionPath() {
        return this.f16608a.popLast();
    }

    public String getDocumentId() {
        return this.f16608a.getLastSegment();
    }

    public s6e getPath() {
        return this.f16608a;
    }

    public boolean hasCollectionId(String str) {
        if (this.f16608a.length() >= 2) {
            s6e s6eVar = this.f16608a;
            if (s6eVar.f105873a.get(s6eVar.length() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16608a.hashCode();
    }

    public String toString() {
        return this.f16608a.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb ci4 ci4Var) {
        return this.f16608a.compareTo(ci4Var.f16608a);
    }
}
