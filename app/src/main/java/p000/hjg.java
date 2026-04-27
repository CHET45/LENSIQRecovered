package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35(foreignKeys = {@fq6(childColumns = {"work_spec_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@p7e({p7e.EnumC10826a.f69935b})
public class hjg {

    /* JADX INFO: renamed from: a */
    @dbd
    @efb
    @ab2(name = "work_spec_id")
    public final String f43826a;

    /* JADX INFO: renamed from: b */
    @ab2(name = "system_id")
    public final int f43827b;

    public hjg(@efb String workSpecId, int systemId) {
        this.f43826a = workSpecId;
        this.f43827b = systemId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hjg)) {
            return false;
        }
        hjg hjgVar = (hjg) o;
        if (this.f43827b != hjgVar.f43827b) {
            return false;
        }
        return this.f43826a.equals(hjgVar.f43826a);
    }

    public int hashCode() {
        return (this.f43826a.hashCode() * 31) + this.f43827b;
    }
}
