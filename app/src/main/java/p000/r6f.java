package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class r6f {

    /* JADX INFO: renamed from: c */
    public static final r6f f77139c = new r6f(false, null);

    /* JADX INFO: renamed from: d */
    public static final r6f f77140d = new r6f(true, null);

    /* JADX INFO: renamed from: a */
    public final boolean f77141a;

    /* JADX INFO: renamed from: b */
    @hib
    public final or5 f77142b;

    private r6f(boolean z, @hib or5 or5Var) {
        x7d.checkArgument(or5Var == null || z, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f77141a = z;
        this.f77142b = or5Var;
    }

    @efb
    public static r6f merge() {
        return f77140d;
    }

    @efb
    public static r6f mergeFieldPaths(@efb List<xr5> list) {
        HashSet hashSet = new HashSet();
        Iterator<xr5> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().m25424b());
        }
        return new r6f(true, or5.fromSet(hashSet));
    }

    @efb
    public static r6f mergeFields(@efb List<String> list) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(xr5.m25422a(it.next()).m25424b());
        }
        return new r6f(true, or5.fromSet(hashSet));
    }

    /* JADX INFO: renamed from: a */
    public boolean m21076a() {
        return this.f77141a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r6f.class != obj.getClass()) {
            return false;
        }
        r6f r6fVar = (r6f) obj;
        if (this.f77141a != r6fVar.f77141a) {
            return false;
        }
        or5 or5Var = this.f77142b;
        or5 or5Var2 = r6fVar.f77142b;
        return or5Var != null ? or5Var.equals(or5Var2) : or5Var2 == null;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69935b})
    public or5 getFieldMask() {
        return this.f77142b;
    }

    public int hashCode() {
        int i = (this.f77141a ? 1 : 0) * 31;
        or5 or5Var = this.f77142b;
        return i + (or5Var != null ? or5Var.hashCode() : 0);
    }

    @efb
    public static r6f mergeFields(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(xr5.m25422a(str).m25424b());
        }
        return new r6f(true, or5.fromSet(hashSet));
    }
}
