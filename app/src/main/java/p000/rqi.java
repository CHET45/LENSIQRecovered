package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35(foreignKeys = {@fq6(childColumns = {"work_spec_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@tz7({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
@p7e({p7e.EnumC10826a.f69935b})
public class rqi {

    /* JADX INFO: renamed from: a */
    @efb
    @ab2(name = "tag")
    public final String f79060a;

    /* JADX INFO: renamed from: b */
    @efb
    @ab2(name = "work_spec_id")
    public final String f79061b;

    public rqi(@efb String tag, @efb String workSpecId) {
        this.f79060a = tag;
        this.f79061b = workSpecId;
    }
}
