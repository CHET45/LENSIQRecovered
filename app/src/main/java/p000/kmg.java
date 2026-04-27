package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p000.fr5;
import p000.ir5;
import p000.n7c;

/* JADX INFO: loaded from: classes5.dex */
public final class kmg {

    /* JADX INFO: renamed from: i */
    public static final long f54756i = -1;

    /* JADX INFO: renamed from: a */
    @hib
    public String f54757a;

    /* JADX INFO: renamed from: b */
    public final List<n7c> f54758b;

    /* JADX INFO: renamed from: c */
    public final List<su5> f54759c;

    /* JADX INFO: renamed from: d */
    public final s6e f54760d;

    /* JADX INFO: renamed from: e */
    @hib
    public final String f54761e;

    /* JADX INFO: renamed from: f */
    public final long f54762f;

    /* JADX INFO: renamed from: g */
    @hib
    public final gc1 f54763g;

    /* JADX INFO: renamed from: h */
    @hib
    public final gc1 f54764h;

    /* JADX INFO: renamed from: kmg$a */
    public static /* synthetic */ class C8457a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54765a;

        static {
            int[] iArr = new int[fr5.EnumC5939b.values().length];
            f54765a = iArr;
            try {
                iArr[fr5.EnumC5939b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54765a[fr5.EnumC5939b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54765a[fr5.EnumC5939b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54765a[fr5.EnumC5939b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54765a[fr5.EnumC5939b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54765a[fr5.EnumC5939b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54765a[fr5.EnumC5939b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54765a[fr5.EnumC5939b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54765a[fr5.EnumC5939b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54765a[fr5.EnumC5939b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public kmg(s6e s6eVar, @hib String str, List<su5> list, List<n7c> list2, long j, @hib gc1 gc1Var, @hib gc1 gc1Var2) {
        this.f54760d = s6eVar;
        this.f54761e = str;
        this.f54758b = list2;
        this.f54759c = list;
        this.f54762f = j;
        this.f54763g = gc1Var;
        this.f54764h = gc1Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair<b2i, Boolean> getAscendingBound(ir5.AbstractC7573c abstractC7573c, @hib gc1 gc1Var) {
        b2i b2iVar = s2i.f80460d;
        Iterator<fr5> it = getFieldFiltersForPath(abstractC7573c.getFieldPath()).iterator();
        boolean zIsInclusive = true;
        while (true) {
            int i = 0;
            boolean z = false;
            if (!it.hasNext()) {
                if (gc1Var != null) {
                    while (true) {
                        if (i < this.f54758b.size()) {
                            if (this.f54758b.get(i).getField().equals(abstractC7573c.getFieldPath())) {
                                b2i b2iVar2 = gc1Var.getPosition().get(i);
                                if (s2i.lowerBoundCompare(b2iVar, zIsInclusive, b2iVar2, gc1Var.isInclusive()) < 0) {
                                    zIsInclusive = gc1Var.isInclusive();
                                    b2iVar = b2iVar2;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair<>(b2iVar, Boolean.valueOf(zIsInclusive));
            }
            fr5 next = it.next();
            b2i value = s2i.f80460d;
            switch (C8457a.f54765a[next.getOperator().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    value = next.getValue();
                    z = true;
                    break;
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                case 8:
                    value = s2i.getLowerBound(next.getValue());
                    z = true;
                    break;
                case 10:
                    value = next.getValue();
                    break;
            }
            if (s2i.lowerBoundCompare(b2iVar, zIsInclusive, value, z) < 0) {
                zIsInclusive = z;
                b2iVar = value;
            }
        }
    }

    private Pair<b2i, Boolean> getDescendingBound(ir5.AbstractC7573c abstractC7573c, @hib gc1 gc1Var) {
        b2i b2iVar = s2i.f80462f;
        Iterator<fr5> it = getFieldFiltersForPath(abstractC7573c.getFieldPath()).iterator();
        boolean zIsInclusive = true;
        while (true) {
            int i = 0;
            z = false;
            boolean z = false;
            if (!it.hasNext()) {
                if (gc1Var != null) {
                    while (true) {
                        if (i < this.f54758b.size()) {
                            if (this.f54758b.get(i).getField().equals(abstractC7573c.getFieldPath())) {
                                b2i b2iVar2 = gc1Var.getPosition().get(i);
                                if (s2i.upperBoundCompare(b2iVar, zIsInclusive, b2iVar2, gc1Var.isInclusive()) > 0) {
                                    zIsInclusive = gc1Var.isInclusive();
                                    b2iVar = b2iVar2;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair<>(b2iVar, Boolean.valueOf(zIsInclusive));
            }
            fr5 next = it.next();
            b2i value = s2i.f80462f;
            switch (C8457a.f54765a[next.getOperator().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    value = next.getValue();
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                    value = next.getValue();
                    break;
                case 9:
                case 10:
                    value = s2i.getUpperBound(next.getValue());
                    break;
            }
            if (s2i.upperBoundCompare(b2iVar, zIsInclusive, value, z) > 0) {
                zIsInclusive = z;
                b2iVar = value;
            }
        }
    }

    private List<fr5> getFieldFiltersForPath(wr5 wr5Var) {
        ArrayList arrayList = new ArrayList();
        for (su5 su5Var : this.f54759c) {
            if (su5Var instanceof fr5) {
                fr5 fr5Var = (fr5) su5Var;
                if (fr5Var.getField().equals(wr5Var)) {
                    arrayList.add(fr5Var);
                }
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kmg.class != obj.getClass()) {
            return false;
        }
        kmg kmgVar = (kmg) obj;
        String str = this.f54761e;
        if (str == null ? kmgVar.f54761e != null : !str.equals(kmgVar.f54761e)) {
            return false;
        }
        if (this.f54762f != kmgVar.f54762f || !this.f54758b.equals(kmgVar.f54758b) || !this.f54759c.equals(kmgVar.f54759c) || !this.f54760d.equals(kmgVar.f54760d)) {
            return false;
        }
        gc1 gc1Var = this.f54763g;
        if (gc1Var == null ? kmgVar.f54763g != null : !gc1Var.equals(kmgVar.f54763g)) {
            return false;
        }
        gc1 gc1Var2 = this.f54764h;
        gc1 gc1Var3 = kmgVar.f54764h;
        return gc1Var2 != null ? gc1Var2.equals(gc1Var3) : gc1Var3 == null;
    }

    @hib
    public List<b2i> getArrayValues(ir5 ir5Var) {
        ir5.AbstractC7573c arraySegment = ir5Var.getArraySegment();
        if (arraySegment == null) {
            return null;
        }
        for (fr5 fr5Var : getFieldFiltersForPath(arraySegment.getFieldPath())) {
            int i = C8457a.f54765a[fr5Var.getOperator().ordinal()];
            if (i == 1) {
                return fr5Var.getValue().getArrayValue().getValuesList();
            }
            if (i == 2) {
                return Collections.singletonList(fr5Var.getValue());
            }
        }
        return null;
    }

    public String getCanonicalId() {
        String str = this.f54757a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getPath().canonicalString());
        if (this.f54761e != null) {
            sb.append("|cg:");
            sb.append(this.f54761e);
        }
        sb.append("|f:");
        Iterator<su5> it = getFilters().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getCanonicalId());
        }
        sb.append("|ob:");
        for (n7c n7cVar : getOrderBy()) {
            sb.append(n7cVar.getField().canonicalString());
            sb.append(n7cVar.getDirection().equals(n7c.EnumC9722a.ASCENDING) ? "asc" : g55.f38798g);
        }
        if (hasLimit()) {
            sb.append("|l:");
            sb.append(getLimit());
        }
        gc1 gc1Var = this.f54763g;
        String str2 = ny5.f66009F;
        if (gc1Var != null) {
            sb.append("|lb:");
            sb.append(this.f54763g.isInclusive() ? "b:" : ny5.f66009F);
            sb.append(this.f54763g.positionString());
        }
        if (this.f54764h != null) {
            sb.append("|ub:");
            if (!this.f54764h.isInclusive()) {
                str2 = "b:";
            }
            sb.append(str2);
            sb.append(this.f54764h.positionString());
        }
        String string = sb.toString();
        this.f54757a = string;
        return string;
    }

    @hib
    public String getCollectionGroup() {
        return this.f54761e;
    }

    @hib
    public gc1 getEndAt() {
        return this.f54764h;
    }

    public List<su5> getFilters() {
        return this.f54759c;
    }

    public n7c.EnumC9722a getKeyOrder() {
        return this.f54758b.get(r0.size() - 1).getDirection();
    }

    public long getLimit() {
        return this.f54762f;
    }

    public gc1 getLowerBound(ir5 ir5Var) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (ir5.AbstractC7573c abstractC7573c : ir5Var.getDirectionalSegments()) {
            Pair<b2i, Boolean> ascendingBound = abstractC7573c.getKind().equals(ir5.AbstractC7573c.a.ASCENDING) ? getAscendingBound(abstractC7573c, this.f54763g) : getDescendingBound(abstractC7573c, this.f54763g);
            arrayList.add((b2i) ascendingBound.first);
            zBooleanValue &= ((Boolean) ascendingBound.second).booleanValue();
        }
        return new gc1(arrayList, zBooleanValue);
    }

    @hib
    public Collection<b2i> getNotInValues(ir5 ir5Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ir5.AbstractC7573c abstractC7573c : ir5Var.getDirectionalSegments()) {
            for (fr5 fr5Var : getFieldFiltersForPath(abstractC7573c.getFieldPath())) {
                int i = C8457a.f54765a[fr5Var.getOperator().ordinal()];
                if (i == 3 || i == 4) {
                    linkedHashMap.put(abstractC7573c.getFieldPath(), fr5Var.getValue());
                } else if (i == 5 || i == 6) {
                    linkedHashMap.put(abstractC7573c.getFieldPath(), fr5Var.getValue());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List<n7c> getOrderBy() {
        return this.f54758b;
    }

    public s6e getPath() {
        return this.f54760d;
    }

    public int getSegmentCount() {
        HashSet hashSet = new HashSet();
        Iterator<su5> it = this.f54759c.iterator();
        int i = 0;
        while (it.hasNext()) {
            for (fr5 fr5Var : it.next().getFlattenedFilters()) {
                if (!fr5Var.getField().isKeyField()) {
                    if (fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS) || fr5Var.getOperator().equals(fr5.EnumC5939b.ARRAY_CONTAINS_ANY)) {
                        i = 1;
                    } else {
                        hashSet.add(fr5Var.getField());
                    }
                }
            }
        }
        for (n7c n7cVar : this.f54758b) {
            if (!n7cVar.getField().isKeyField()) {
                hashSet.add(n7cVar.getField());
            }
        }
        return hashSet.size() + i;
    }

    @hib
    public gc1 getStartAt() {
        return this.f54763g;
    }

    public gc1 getUpperBound(ir5 ir5Var) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (ir5.AbstractC7573c abstractC7573c : ir5Var.getDirectionalSegments()) {
            Pair<b2i, Boolean> descendingBound = abstractC7573c.getKind().equals(ir5.AbstractC7573c.a.ASCENDING) ? getDescendingBound(abstractC7573c, this.f54764h) : getAscendingBound(abstractC7573c, this.f54764h);
            arrayList.add((b2i) descendingBound.first);
            zBooleanValue &= ((Boolean) descendingBound.second).booleanValue();
        }
        return new gc1(arrayList, zBooleanValue);
    }

    public boolean hasLimit() {
        return this.f54762f != -1;
    }

    public int hashCode() {
        int iHashCode = this.f54758b.hashCode() * 31;
        String str = this.f54761e;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f54759c.hashCode()) * 31) + this.f54760d.hashCode()) * 31;
        long j = this.f54762f;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        gc1 gc1Var = this.f54763g;
        int iHashCode3 = (i + (gc1Var != null ? gc1Var.hashCode() : 0)) * 31;
        gc1 gc1Var2 = this.f54764h;
        return iHashCode3 + (gc1Var2 != null ? gc1Var2.hashCode() : 0);
    }

    public boolean isDocumentQuery() {
        return ci4.isDocumentKey(this.f54760d) && this.f54761e == null && this.f54759c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f54760d.canonicalString());
        if (this.f54761e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f54761e);
        }
        if (!this.f54759c.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < this.f54759c.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f54759c.get(i));
            }
        }
        if (!this.f54758b.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < this.f54758b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f54758b.get(i2));
            }
        }
        sb.append(c0b.f15434d);
        return sb.toString();
    }
}
