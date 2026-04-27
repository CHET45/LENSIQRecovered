package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.n7c;

/* JADX INFO: loaded from: classes5.dex */
public final class nld {

    /* JADX INFO: renamed from: l */
    public static final n7c f64894l;

    /* JADX INFO: renamed from: m */
    public static final n7c f64895m;

    /* JADX INFO: renamed from: a */
    public final List<n7c> f64896a;

    /* JADX INFO: renamed from: b */
    public List<n7c> f64897b;

    /* JADX INFO: renamed from: c */
    @hib
    public kmg f64898c;

    /* JADX INFO: renamed from: d */
    @hib
    public kmg f64899d;

    /* JADX INFO: renamed from: e */
    public final List<su5> f64900e;

    /* JADX INFO: renamed from: f */
    public final s6e f64901f;

    /* JADX INFO: renamed from: g */
    @hib
    public final String f64902g;

    /* JADX INFO: renamed from: h */
    public final long f64903h;

    /* JADX INFO: renamed from: i */
    public final EnumC9924a f64904i;

    /* JADX INFO: renamed from: j */
    @hib
    public final gc1 f64905j;

    /* JADX INFO: renamed from: k */
    @hib
    public final gc1 f64906k;

    /* JADX INFO: renamed from: nld$a */
    public enum EnumC9924a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* JADX INFO: renamed from: nld$b */
    public static class C9925b implements Comparator<ph4> {

        /* JADX INFO: renamed from: a */
        public final List<n7c> f64910a;

        public C9925b(List<n7c> list) {
            boolean z;
            Iterator<n7c> it = list.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    z = (z || it.next().getField().equals(wr5.f95193b)) ? true : z;
                }
            }
            if (!z) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f64910a = list;
        }

        @Override // java.util.Comparator
        public int compare(ph4 ph4Var, ph4 ph4Var2) {
            Iterator<n7c> it = this.f64910a.iterator();
            while (it.hasNext()) {
                int iM17802a = it.next().m17802a(ph4Var, ph4Var2);
                if (iM17802a != 0) {
                    return iM17802a;
                }
            }
            return 0;
        }
    }

    static {
        n7c.EnumC9722a enumC9722a = n7c.EnumC9722a.ASCENDING;
        wr5 wr5Var = wr5.f95193b;
        f64894l = n7c.getInstance(enumC9722a, wr5Var);
        f64895m = n7c.getInstance(n7c.EnumC9722a.DESCENDING, wr5Var);
    }

    public nld(s6e s6eVar, @hib String str, List<su5> list, List<n7c> list2, long j, EnumC9924a enumC9924a, @hib gc1 gc1Var, @hib gc1 gc1Var2) {
        this.f64901f = s6eVar;
        this.f64902g = str;
        this.f64896a = list2;
        this.f64900e = list;
        this.f64903h = j;
        this.f64904i = enumC9924a;
        this.f64905j = gc1Var;
        this.f64906k = gc1Var2;
    }

    public static nld atPath(s6e s6eVar) {
        return new nld(s6eVar, null);
    }

    private boolean matchesBounds(ph4 ph4Var) {
        gc1 gc1Var = this.f64905j;
        if (gc1Var != null && !gc1Var.sortsBeforeDocument(getNormalizedOrderBy(), ph4Var)) {
            return false;
        }
        gc1 gc1Var2 = this.f64906k;
        return gc1Var2 == null || gc1Var2.sortsAfterDocument(getNormalizedOrderBy(), ph4Var);
    }

    private boolean matchesFilters(ph4 ph4Var) {
        Iterator<su5> it = this.f64900e.iterator();
        while (it.hasNext()) {
            if (!it.next().matches(ph4Var)) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesOrderBy(ph4 ph4Var) {
        for (n7c n7cVar : getNormalizedOrderBy()) {
            if (!n7cVar.getField().equals(wr5.f95193b) && ph4Var.getField(n7cVar.f63457b) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesPathAndCollectionGroup(ph4 ph4Var) {
        s6e path = ph4Var.getKey().getPath();
        return this.f64902g != null ? ph4Var.getKey().hasCollectionId(this.f64902g) && this.f64901f.isPrefixOf(path) : ci4.isDocumentKey(this.f64901f) ? this.f64901f.equals(path) : this.f64901f.isPrefixOf(path) && this.f64901f.length() == path.length() - 1;
    }

    public nld asCollectionQueryAtPath(s6e s6eVar) {
        return new nld(s6eVar, null, this.f64900e, this.f64896a, this.f64903h, this.f64904i, this.f64905j, this.f64906k);
    }

    public Comparator<ph4> comparator() {
        return new C9925b(getNormalizedOrderBy());
    }

    public nld endAt(gc1 gc1Var) {
        return new nld(this.f64901f, this.f64902g, this.f64900e, this.f64896a, this.f64903h, this.f64904i, this.f64905j, gc1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nld.class != obj.getClass()) {
            return false;
        }
        nld nldVar = (nld) obj;
        if (this.f64904i != nldVar.f64904i) {
            return false;
        }
        return toTarget().equals(nldVar.toTarget());
    }

    public nld filter(su5 su5Var) {
        r80.hardAssert(!isDocumentQuery(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f64900e);
        arrayList.add(su5Var);
        return new nld(this.f64901f, this.f64902g, arrayList, this.f64896a, this.f64903h, this.f64904i, this.f64905j, this.f64906k);
    }

    public String getCanonicalId() {
        return toTarget().getCanonicalId() + "|lt:" + this.f64904i;
    }

    @hib
    public String getCollectionGroup() {
        return this.f64902g;
    }

    @hib
    public gc1 getEndAt() {
        return this.f64906k;
    }

    public List<n7c> getExplicitOrderBy() {
        return this.f64896a;
    }

    public List<su5> getFilters() {
        return this.f64900e;
    }

    public SortedSet<wr5> getInequalityFilterFields() {
        TreeSet treeSet = new TreeSet();
        Iterator<su5> it = getFilters().iterator();
        while (it.hasNext()) {
            for (fr5 fr5Var : it.next().getFlattenedFilters()) {
                if (fr5Var.isInequality()) {
                    treeSet.add(fr5Var.getField());
                }
            }
        }
        return treeSet;
    }

    public long getLimit() {
        return this.f64903h;
    }

    public EnumC9924a getLimitType() {
        return this.f64904i;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public synchronized java.util.List<p000.n7c> getNormalizedOrderBy() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List<n7c> r0 = r6.f64897b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L9b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List<n7c> r2 = r6.f64896a     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            n7c r3 = (p000.n7c) r3     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            wr5 r3 = r3.f63457b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.canonicalString()     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L15
        L2e:
            r0 = move-exception
            goto L9f
        L30:
            java.util.List<n7c> r2 = r6.f64896a     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L4b
            java.util.List<n7c> r2 = r6.f64896a     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2e
            n7c r2 = (p000.n7c) r2     // Catch: java.lang.Throwable -> L2e
            n7c$a r2 = r2.getDirection()     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L4b:
            n7c$a r2 = p000.n7c.EnumC9722a.ASCENDING     // Catch: java.lang.Throwable -> L2e
        L4d:
            java.util.SortedSet r3 = r6.getInequalityFilterFields()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2e
        L55:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2e
            wr5 r4 = (p000.wr5) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r4.canonicalString()     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            boolean r5 = r4.isKeyField()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            n7c r4 = p000.n7c.getInstance(r2, r4)     // Catch: java.lang.Throwable -> L2e
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L79:
            wr5 r3 = p000.wr5.f95193b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.canonicalString()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L95
            n7c$a r1 = p000.n7c.EnumC9722a.ASCENDING     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L90
            n7c r1 = p000.nld.f64894l     // Catch: java.lang.Throwable -> L2e
            goto L92
        L90:
            n7c r1 = p000.nld.f64895m     // Catch: java.lang.Throwable -> L2e
        L92:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
        L95:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2e
            r6.f64897b = r0     // Catch: java.lang.Throwable -> L2e
        L9b:
            java.util.List<n7c> r0 = r6.f64897b     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return r0
        L9f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nld.getNormalizedOrderBy():java.util.List");
    }

    public s6e getPath() {
        return this.f64901f;
    }

    @hib
    public gc1 getStartAt() {
        return this.f64905j;
    }

    public boolean hasLimit() {
        return this.f64903h != -1;
    }

    public int hashCode() {
        return (toTarget().hashCode() * 31) + this.f64904i.hashCode();
    }

    public boolean isCollectionGroupQuery() {
        return this.f64902g != null;
    }

    public boolean isDocumentQuery() {
        return ci4.isDocumentKey(this.f64901f) && this.f64902g == null && this.f64900e.isEmpty();
    }

    public nld limitToFirst(long j) {
        return new nld(this.f64901f, this.f64902g, this.f64900e, this.f64896a, j, EnumC9924a.LIMIT_TO_FIRST, this.f64905j, this.f64906k);
    }

    public nld limitToLast(long j) {
        return new nld(this.f64901f, this.f64902g, this.f64900e, this.f64896a, j, EnumC9924a.LIMIT_TO_LAST, this.f64905j, this.f64906k);
    }

    public boolean matches(ph4 ph4Var) {
        return ph4Var.isFoundDocument() && matchesPathAndCollectionGroup(ph4Var) && matchesOrderBy(ph4Var) && matchesFilters(ph4Var) && matchesBounds(ph4Var);
    }

    public boolean matchesAllDocuments() {
        if (this.f64900e.isEmpty() && this.f64903h == -1 && this.f64905j == null && this.f64906k == null) {
            return getExplicitOrderBy().isEmpty() || (getExplicitOrderBy().size() == 1 && getExplicitOrderBy().get(0).f63457b.isKeyField());
        }
        return false;
    }

    public nld orderBy(n7c n7cVar) {
        r80.hardAssert(!isDocumentQuery(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f64896a);
        arrayList.add(n7cVar);
        return new nld(this.f64901f, this.f64902g, this.f64900e, arrayList, this.f64903h, this.f64904i, this.f64905j, this.f64906k);
    }

    public nld startAt(gc1 gc1Var) {
        return new nld(this.f64901f, this.f64902g, this.f64900e, this.f64896a, this.f64903h, this.f64904i, gc1Var, this.f64906k);
    }

    public synchronized kmg toAggregateTarget() {
        try {
            if (this.f64899d == null) {
                this.f64899d = toTarget(this.f64896a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f64899d;
    }

    public String toString() {
        return "Query(target=" + toTarget().toString() + ";limitType=" + this.f64904i.toString() + c0b.f15434d;
    }

    public synchronized kmg toTarget() {
        try {
            if (this.f64898c == null) {
                this.f64898c = toTarget(getNormalizedOrderBy());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f64898c;
    }

    private synchronized kmg toTarget(List<n7c> list) {
        if (this.f64904i == EnumC9924a.LIMIT_TO_FIRST) {
            return new kmg(getPath(), getCollectionGroup(), getFilters(), list, this.f64903h, getStartAt(), getEndAt());
        }
        ArrayList arrayList = new ArrayList();
        for (n7c n7cVar : list) {
            n7c.EnumC9722a direction = n7cVar.getDirection();
            n7c.EnumC9722a enumC9722a = n7c.EnumC9722a.DESCENDING;
            if (direction == enumC9722a) {
                enumC9722a = n7c.EnumC9722a.ASCENDING;
            }
            arrayList.add(n7c.getInstance(enumC9722a, n7cVar.getField()));
        }
        gc1 gc1Var = this.f64906k;
        gc1 gc1Var2 = gc1Var != null ? new gc1(gc1Var.getPosition(), this.f64906k.isInclusive()) : null;
        gc1 gc1Var3 = this.f64905j;
        return new kmg(getPath(), getCollectionGroup(), getFilters(), arrayList, this.f64903h, gc1Var2, gc1Var3 != null ? new gc1(gc1Var3.getPosition(), this.f64905j.isInclusive()) : null);
    }

    public nld(s6e s6eVar, @hib String str) {
        this(s6eVar, str, Collections.emptyList(), Collections.emptyList(), -1L, EnumC9924a.LIMIT_TO_FIRST, null, null);
    }
}
