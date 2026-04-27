package p000;

import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15651d
public final class hwh {

    /* JADX INFO: renamed from: a */
    public final long f45178a;

    /* JADX INFO: renamed from: b */
    public final int f45179b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C5297eh f45180c;

    public hwh(long j, int i, @yfb C5297eh c5297eh) {
        md8.checkNotNullParameter(c5297eh, "callerAdTech");
        this.f45178a = j;
        this.f45179b = i;
        this.f45180c = c5297eh;
        if (i == 0) {
            throw new IllegalArgumentException("Win event types cannot be manually updated.");
        }
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException("Ad event type must be one of AD_EVENT_TYPE_IMPRESSION, AD_EVENT_TYPE_VIEW, or AD_EVENT_TYPE_CLICK");
        }
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final UpdateAdCounterHistogramRequest convertToAdServices$ads_adservices_release() {
        gwh.m12011a();
        UpdateAdCounterHistogramRequest updateAdCounterHistogramRequestBuild = fwh.m11206a(this.f45178a, this.f45179b, this.f45180c.convertToAdServices$ads_adservices_release()).build();
        md8.checkNotNullExpressionValue(updateAdCounterHistogramRequestBuild, "Builder(\n               …   )\n            .build()");
        return updateAdCounterHistogramRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwh)) {
            return false;
        }
        hwh hwhVar = (hwh) obj;
        return this.f45178a == hwhVar.f45178a && this.f45179b == hwhVar.f45179b && md8.areEqual(this.f45180c, hwhVar.f45180c);
    }

    public final int getAdEventType() {
        return this.f45179b;
    }

    public final long getAdSelectionId() {
        return this.f45178a;
    }

    @yfb
    public final C5297eh getCallerAdTech() {
        return this.f45180c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f45178a) * 31) + Integer.hashCode(this.f45179b)) * 31) + this.f45180c.hashCode();
    }

    @yfb
    public String toString() {
        int i = this.f45179b;
        return "UpdateAdCounterHistogramRequest: adSelectionId=" + this.f45178a + ", adEventType=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid ad event type" : "AD_EVENT_TYPE_CLICK" : "AD_EVENT_TYPE_VIEW" : "AD_EVENT_TYPE_IMPRESSION" : "AD_EVENT_TYPE_WIN") + ", callerAdTech=" + this.f45180c;
    }
}
