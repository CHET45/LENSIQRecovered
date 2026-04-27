package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35(foreignKeys = {@fq6(childColumns = {"work_spec_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @fq6(childColumns = {"prerequisite_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@tz7({"work_spec_id"}), @tz7({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@p7e({p7e.EnumC10826a.f69935b})
public class h64 {

    /* JADX INFO: renamed from: a */
    @efb
    @ab2(name = "work_spec_id")
    public final String f42471a;

    /* JADX INFO: renamed from: b */
    @efb
    @ab2(name = "prerequisite_id")
    public final String f42472b;

    public h64(@efb String workSpecId, @efb String prerequisiteId) {
        this.f42471a = workSpecId;
        this.f42472b = prerequisiteId;
    }
}
