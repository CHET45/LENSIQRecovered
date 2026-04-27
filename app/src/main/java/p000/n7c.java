package p000;

/* JADX INFO: loaded from: classes5.dex */
public class n7c {

    /* JADX INFO: renamed from: a */
    public final EnumC9722a f63456a;

    /* JADX INFO: renamed from: b */
    public final wr5 f63457b;

    /* JADX INFO: renamed from: n7c$a */
    public enum EnumC9722a {
        ASCENDING(1),
        DESCENDING(-1);


        /* JADX INFO: renamed from: a */
        public final int f63461a;

        EnumC9722a(int i) {
            this.f63461a = i;
        }

        /* JADX INFO: renamed from: a */
        public int m17803a() {
            return this.f63461a;
        }
    }

    private n7c(EnumC9722a enumC9722a, wr5 wr5Var) {
        this.f63456a = enumC9722a;
        this.f63457b = wr5Var;
    }

    public static n7c getInstance(EnumC9722a enumC9722a, wr5 wr5Var) {
        return new n7c(enumC9722a, wr5Var);
    }

    /* JADX INFO: renamed from: a */
    public int m17802a(ph4 ph4Var, ph4 ph4Var2) {
        int iM17803a;
        int iCompare;
        if (this.f63457b.equals(wr5.f95193b)) {
            iM17803a = this.f63456a.m17803a();
            iCompare = ph4Var.getKey().compareTo(ph4Var2.getKey());
        } else {
            b2i field = ph4Var.getField(this.f63457b);
            b2i field2 = ph4Var2.getField(this.f63457b);
            r80.hardAssert((field == null || field2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            iM17803a = this.f63456a.m17803a();
            iCompare = s2i.compare(field, field2);
        }
        return iM17803a * iCompare;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n7c)) {
            return false;
        }
        n7c n7cVar = (n7c) obj;
        return this.f63456a == n7cVar.f63456a && this.f63457b.equals(n7cVar.f63457b);
    }

    public EnumC9722a getDirection() {
        return this.f63456a;
    }

    public wr5 getField() {
        return this.f63457b;
    }

    public int hashCode() {
        return ((899 + this.f63456a.hashCode()) * 31) + this.f63457b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63456a == EnumC9722a.ASCENDING ? "" : "-");
        sb.append(this.f63457b.canonicalString());
        return sb.toString();
    }
}
