package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35(foreignKeys = {@fq6(childColumns = {"work_spec_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@tz7({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@p7e({p7e.EnumC10826a.f69935b})
public class bqi {

    /* JADX INFO: renamed from: a */
    @efb
    @ab2(name = "name")
    public final String f14522a;

    /* JADX INFO: renamed from: b */
    @efb
    @ab2(name = "work_spec_id")
    public final String f14523b;

    public bqi(@efb String name, @efb String workSpecId) {
        this.f14522a = name;
        this.f14523b = workSpecId;
    }
}
