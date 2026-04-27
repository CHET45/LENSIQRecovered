package p000;

import androidx.work.C1507b;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35(foreignKeys = {@fq6(childColumns = {"work_spec_id"}, entity = oqi.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@p7e({p7e.EnumC10826a.f69935b})
public class eqi {

    /* JADX INFO: renamed from: a */
    @dbd
    @efb
    @ab2(name = "work_spec_id")
    public final String f33872a;

    /* JADX INFO: renamed from: b */
    @efb
    @ab2(name = "progress")
    public final C1507b f33873b;

    public eqi(@efb String workSpecId, @efb C1507b progress) {
        this.f33872a = workSpecId;
        this.f33873b = progress;
    }
}
