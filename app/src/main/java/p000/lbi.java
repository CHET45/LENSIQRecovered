package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.cj4;

/* JADX INFO: loaded from: classes5.dex */
public class lbi {

    /* JADX INFO: renamed from: a */
    public final nld f57124a;

    /* JADX INFO: renamed from: b */
    public final yi4 f57125b;

    /* JADX INFO: renamed from: c */
    public final yi4 f57126c;

    /* JADX INFO: renamed from: d */
    public final List<cj4> f57127d;

    /* JADX INFO: renamed from: e */
    public final boolean f57128e;

    /* JADX INFO: renamed from: f */
    public final qy7<ci4> f57129f;

    /* JADX INFO: renamed from: g */
    public final boolean f57130g;

    /* JADX INFO: renamed from: h */
    public boolean f57131h;

    /* JADX INFO: renamed from: i */
    public boolean f57132i;

    /* JADX INFO: renamed from: lbi$a */
    public enum EnumC8766a {
        NONE,
        LOCAL,
        SYNCED
    }

    public lbi(nld nldVar, yi4 yi4Var, yi4 yi4Var2, List<cj4> list, boolean z, qy7<ci4> qy7Var, boolean z2, boolean z3, boolean z4) {
        this.f57124a = nldVar;
        this.f57125b = yi4Var;
        this.f57126c = yi4Var2;
        this.f57127d = list;
        this.f57128e = z;
        this.f57129f = qy7Var;
        this.f57130g = z2;
        this.f57131h = z3;
        this.f57132i = z4;
    }

    public static lbi fromInitialDocuments(nld nldVar, yi4 yi4Var, qy7<ci4> qy7Var, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator<ph4> it = yi4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(cj4.create(cj4.EnumC2330a.ADDED, it.next()));
        }
        return new lbi(nldVar, yi4Var, yi4.emptySet(nldVar.comparator()), arrayList, z, qy7Var, true, z2, z3);
    }

    public boolean didSyncStateChange() {
        return this.f57130g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbi)) {
            return false;
        }
        lbi lbiVar = (lbi) obj;
        if (this.f57128e == lbiVar.f57128e && this.f57130g == lbiVar.f57130g && this.f57131h == lbiVar.f57131h && this.f57124a.equals(lbiVar.f57124a) && this.f57129f.equals(lbiVar.f57129f) && this.f57125b.equals(lbiVar.f57125b) && this.f57126c.equals(lbiVar.f57126c) && this.f57132i == lbiVar.f57132i) {
            return this.f57127d.equals(lbiVar.f57127d);
        }
        return false;
    }

    public boolean excludesMetadataChanges() {
        return this.f57131h;
    }

    public List<cj4> getChanges() {
        return this.f57127d;
    }

    public yi4 getDocuments() {
        return this.f57125b;
    }

    public qy7<ci4> getMutatedKeys() {
        return this.f57129f;
    }

    public yi4 getOldDocuments() {
        return this.f57126c;
    }

    public nld getQuery() {
        return this.f57124a;
    }

    public boolean hasCachedResults() {
        return this.f57132i;
    }

    public boolean hasPendingWrites() {
        return !this.f57129f.isEmpty();
    }

    public int hashCode() {
        return (((((((((((((((this.f57124a.hashCode() * 31) + this.f57125b.hashCode()) * 31) + this.f57126c.hashCode()) * 31) + this.f57127d.hashCode()) * 31) + this.f57129f.hashCode()) * 31) + (this.f57128e ? 1 : 0)) * 31) + (this.f57130g ? 1 : 0)) * 31) + (this.f57131h ? 1 : 0)) * 31) + (this.f57132i ? 1 : 0);
    }

    public boolean isFromCache() {
        return this.f57128e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f57124a + ", " + this.f57125b + ", " + this.f57126c + ", " + this.f57127d + ", isFromCache=" + this.f57128e + ", mutatedKeys=" + this.f57129f.size() + ", didSyncStateChange=" + this.f57130g + ", excludesMetadataChanges=" + this.f57131h + ", hasCachedResults=" + this.f57132i + c0b.f15434d;
    }
}
