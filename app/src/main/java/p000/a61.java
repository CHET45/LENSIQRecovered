package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class a61 implements Comparable<a61> {

    /* JADX INFO: renamed from: a */
    public final vj1 f493a;

    private a61(vj1 vj1Var) {
        this.f493a = vj1Var;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static a61 fromByteString(@efb vj1 vj1Var) {
        x7d.checkNotNull(vj1Var, "Provided ByteString must not be null.");
        return new a61(vj1Var);
    }

    @efb
    public static a61 fromBytes(@efb byte[] bArr) {
        x7d.checkNotNull(bArr, "Provided bytes array must not be null.");
        return new a61(vj1.copyFrom(bArr));
    }

    public boolean equals(@hib Object obj) {
        return (obj instanceof a61) && this.f493a.equals(((a61) obj).f493a);
    }

    public int hashCode() {
        return this.f493a.hashCode();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public vj1 toByteString() {
        return this.f493a;
    }

    @efb
    public byte[] toBytes() {
        return this.f493a.toByteArray();
    }

    @efb
    public String toString() {
        return "Blob { bytes=" + r0i.toDebugString(this.f493a) + " }";
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb a61 a61Var) {
        return r0i.compareByteStrings(this.f493a, a61Var.f493a);
    }
}
