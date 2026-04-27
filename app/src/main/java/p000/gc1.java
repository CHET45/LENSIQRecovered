package p000;

import java.util.List;
import p000.n7c;

/* JADX INFO: loaded from: classes5.dex */
public final class gc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f39336a;

    /* JADX INFO: renamed from: b */
    public final List<b2i> f39337b;

    public gc1(List<b2i> list, boolean z) {
        this.f39337b = list;
        this.f39336a = z;
    }

    private int compareToDocument(List<n7c> list, ph4 ph4Var) {
        int iCompare;
        r80.hardAssert(this.f39337b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i = 0;
        for (int i2 = 0; i2 < this.f39337b.size(); i2++) {
            n7c n7cVar = list.get(i2);
            b2i b2iVar = this.f39337b.get(i2);
            if (n7cVar.f63457b.equals(wr5.f95193b)) {
                r80.hardAssert(s2i.isReferenceValue(b2iVar), "Bound has a non-key value where the key path is being used %s", b2iVar);
                iCompare = ci4.fromName(b2iVar.getReferenceValue()).compareTo(ph4Var.getKey());
            } else {
                b2i field = ph4Var.getField(n7cVar.getField());
                r80.hardAssert(field != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iCompare = s2i.compare(b2iVar, field);
            }
            if (n7cVar.getDirection().equals(n7c.EnumC9722a.DESCENDING)) {
                iCompare *= -1;
            }
            i = iCompare;
            if (i != 0) {
                break;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gc1.class != obj.getClass()) {
            return false;
        }
        gc1 gc1Var = (gc1) obj;
        return this.f39336a == gc1Var.f39336a && this.f39337b.equals(gc1Var.f39337b);
    }

    public List<b2i> getPosition() {
        return this.f39337b;
    }

    public int hashCode() {
        return ((this.f39336a ? 1 : 0) * 31) + this.f39337b.hashCode();
    }

    public boolean isInclusive() {
        return this.f39336a;
    }

    public String positionString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (b2i b2iVar : this.f39337b) {
            if (!z) {
                sb.append(",");
            }
            sb.append(s2i.canonicalId(b2iVar));
            z = false;
        }
        return sb.toString();
    }

    public boolean sortsAfterDocument(List<n7c> list, ph4 ph4Var) {
        int iCompareToDocument = compareToDocument(list, ph4Var);
        if (this.f39336a) {
            if (iCompareToDocument < 0) {
                return false;
            }
        } else if (iCompareToDocument <= 0) {
            return false;
        }
        return true;
    }

    public boolean sortsBeforeDocument(List<n7c> list, ph4 ph4Var) {
        int iCompareToDocument = compareToDocument(list, ph4Var);
        if (this.f39336a) {
            if (iCompareToDocument > 0) {
                return false;
            }
        } else if (iCompareToDocument >= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f39336a);
        sb.append(", position=");
        for (int i = 0; i < this.f39337b.size(); i++) {
            if (i > 0) {
                sb.append(" and ");
            }
            sb.append(s2i.canonicalId(this.f39337b.get(i)));
        }
        sb.append(c0b.f15434d);
        return sb.toString();
    }
}
