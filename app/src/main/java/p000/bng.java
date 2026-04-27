package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.fr5;
import p000.ir5;
import p000.n7c;

/* JADX INFO: loaded from: classes5.dex */
public class bng {

    /* JADX INFO: renamed from: a */
    public final String f14227a;

    /* JADX INFO: renamed from: b */
    public final SortedSet<fr5> f14228b;

    /* JADX INFO: renamed from: c */
    public final List<fr5> f14229c;

    /* JADX INFO: renamed from: d */
    public final List<n7c> f14230d;

    public bng(kmg kmgVar) {
        this.f14227a = kmgVar.getCollectionGroup() != null ? kmgVar.getCollectionGroup() : kmgVar.getPath().getLastSegment();
        this.f14230d = kmgVar.getOrderBy();
        this.f14228b = new TreeSet(new Comparator() { // from class: ang
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bng.lambda$new$0((fr5) obj, (fr5) obj2);
            }
        });
        this.f14229c = new ArrayList();
        Iterator<su5> it = kmgVar.getFilters().iterator();
        while (it.hasNext()) {
            fr5 fr5Var = (fr5) it.next();
            if (fr5Var.isInequality()) {
                this.f14228b.add(fr5Var);
            } else {
                this.f14229c.add(fr5Var);
            }
        }
    }

    private boolean hasMatchingEqualityFilter(ir5.AbstractC7573c abstractC7573c) {
        Iterator<fr5> it = this.f14229c.iterator();
        while (it.hasNext()) {
            if (matchesFilter(it.next(), abstractC7573c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(fr5 fr5Var, fr5 fr5Var2) {
        return fr5Var.getField().compareTo(fr5Var2.getField());
    }

    private boolean matchesFilter(@hib fr5 fr5Var, ir5.AbstractC7573c abstractC7573c) {
        if (fr5Var == null || !fr5Var.getField().equals(abstractC7573c.getFieldPath())) {
            return false;
        }
        return abstractC7573c.getKind().equals(ir5.AbstractC7573c.a.CONTAINS) == (fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS) || fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS_ANY));
    }

    private boolean matchesOrderBy(n7c n7cVar, ir5.AbstractC7573c abstractC7573c) {
        if (n7cVar.getField().equals(abstractC7573c.getFieldPath())) {
            return (abstractC7573c.getKind().equals(ir5.AbstractC7573c.a.ASCENDING) && n7cVar.getDirection().equals(n7c.EnumC9722a.ASCENDING)) || (abstractC7573c.getKind().equals(ir5.AbstractC7573c.a.DESCENDING) && n7cVar.getDirection().equals(n7c.EnumC9722a.DESCENDING));
        }
        return false;
    }

    @hib
    public ir5 buildTargetIndex() {
        if (hasMultipleInequality()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (fr5 fr5Var : this.f14229c) {
            if (!fr5Var.getField().isKeyField()) {
                if (fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS) || fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS_ANY)) {
                    arrayList.add(ir5.AbstractC7573c.create(fr5Var.getField(), ir5.AbstractC7573c.a.CONTAINS));
                } else if (!hashSet.contains(fr5Var.getField())) {
                    hashSet.add(fr5Var.getField());
                    arrayList.add(ir5.AbstractC7573c.create(fr5Var.getField(), ir5.AbstractC7573c.a.ASCENDING));
                }
            }
        }
        for (n7c n7cVar : this.f14230d) {
            if (!n7cVar.getField().isKeyField() && !hashSet.contains(n7cVar.getField())) {
                hashSet.add(n7cVar.getField());
                arrayList.add(ir5.AbstractC7573c.create(n7cVar.getField(), n7cVar.getDirection() == n7c.EnumC9722a.ASCENDING ? ir5.AbstractC7573c.a.ASCENDING : ir5.AbstractC7573c.a.DESCENDING));
            }
        }
        return ir5.create(-1, this.f14227a, arrayList, ir5.f48032d);
    }

    public boolean hasMultipleInequality() {
        return this.f14228b.size() > 1;
    }

    public boolean servedByIndex(ir5 ir5Var) {
        r80.hardAssert(ir5Var.getCollectionGroup().equals(this.f14227a), "Collection IDs do not match", new Object[0]);
        if (hasMultipleInequality()) {
            return false;
        }
        ir5.AbstractC7573c arraySegment = ir5Var.getArraySegment();
        if (arraySegment != null && !hasMatchingEqualityFilter(arraySegment)) {
            return false;
        }
        Iterator<n7c> it = this.f14230d.iterator();
        List<ir5.AbstractC7573c> directionalSegments = ir5Var.getDirectionalSegments();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < directionalSegments.size() && hasMatchingEqualityFilter(directionalSegments.get(i))) {
            hashSet.add(directionalSegments.get(i).getFieldPath().canonicalString());
            i++;
        }
        if (i == directionalSegments.size()) {
            return true;
        }
        if (this.f14228b.size() > 0) {
            fr5 fr5VarFirst = this.f14228b.first();
            if (!hashSet.contains(fr5VarFirst.getField().canonicalString())) {
                ir5.AbstractC7573c abstractC7573c = directionalSegments.get(i);
                if (!matchesFilter(fr5VarFirst, abstractC7573c) || !matchesOrderBy(it.next(), abstractC7573c)) {
                    return false;
                }
            }
            i++;
        }
        while (i < directionalSegments.size()) {
            ir5.AbstractC7573c abstractC7573c2 = directionalSegments.get(i);
            if (!it.hasNext() || !matchesOrderBy(it.next(), abstractC7573c2)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
