package p000;

import android.adservices.common.AdFilters;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: renamed from: ve */
/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15651d
public final class C14012ve {

    /* JADX INFO: renamed from: a */
    @gib
    public final qx6 f90757a;

    public C14012ve(@gib qx6 qx6Var) {
        this.f90757a = qx6Var;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdFilters convertToAdServices$ads_adservices_release() {
        AdFilters.Builder builderM23278a = C13511ue.m23278a();
        qx6 qx6Var = this.f90757a;
        AdFilters adFiltersBuild = builderM23278a.setFrequencyCapFilters(qx6Var != null ? qx6Var.convertToAdServices$ads_adservices_release() : null).build();
        md8.checkNotNullExpressionValue(adFiltersBuild, "Builder()\n            .s…s())\n            .build()");
        return adFiltersBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14012ve) {
            return md8.areEqual(this.f90757a, ((C14012ve) obj).f90757a);
        }
        return false;
    }

    @gib
    public final qx6 getFrequencyCapFilters() {
        return this.f90757a;
    }

    public int hashCode() {
        qx6 qx6Var = this.f90757a;
        if (qx6Var != null) {
            return qx6Var.hashCode();
        }
        return 0;
    }

    @yfb
    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.f90757a;
    }
}
