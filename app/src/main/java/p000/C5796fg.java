package p000;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.net.Uri;
import java.util.List;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15648a
public final class C5796fg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5297eh f36498a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<Long> f36499b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C1886bh f36500c;

    /* JADX INFO: renamed from: d */
    @yfb
    public Uri f36501d;

    public C5796fg(@yfb C5297eh c5297eh, @yfb List<Long> list, @yfb C1886bh c1886bh, @yfb Uri uri) {
        md8.checkNotNullParameter(c5297eh, "seller");
        md8.checkNotNullParameter(list, "adSelectionIds");
        md8.checkNotNullParameter(c1886bh, "adSelectionSignals");
        md8.checkNotNullParameter(uri, "selectionLogicUri");
        this.f36498a = c5297eh;
        this.f36499b = list;
        this.f36500c = c1886bh;
        this.f36501d = uri;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = C5294eg.m9948a().setSelectionSignals(this.f36500c.convertToAdServices$ads_adservices_release()).setAdSelectionIds(this.f36499b).setSelectionLogicUri(this.f36501d).setSeller(this.f36498a.convertToAdServices$ads_adservices_release()).build();
        md8.checkNotNullExpressionValue(adSelectionFromOutcomesConfigBuild, "Builder()\n            .s…s())\n            .build()");
        return adSelectionFromOutcomesConfigBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5796fg)) {
            return false;
        }
        C5796fg c5796fg = (C5796fg) obj;
        return md8.areEqual(this.f36498a, c5796fg.f36498a) && md8.areEqual(this.f36499b, c5796fg.f36499b) && md8.areEqual(this.f36500c, c5796fg.f36500c) && md8.areEqual(this.f36501d, c5796fg.f36501d);
    }

    @yfb
    public final List<Long> getAdSelectionIds() {
        return this.f36499b;
    }

    @yfb
    public final C1886bh getAdSelectionSignals() {
        return this.f36500c;
    }

    @yfb
    public final Uri getSelectionLogicUri() {
        return this.f36501d;
    }

    @yfb
    public final C5297eh getSeller() {
        return this.f36498a;
    }

    public int hashCode() {
        return (((((this.f36498a.hashCode() * 31) + this.f36499b.hashCode()) * 31) + this.f36500c.hashCode()) * 31) + this.f36501d.hashCode();
    }

    public final void setSelectionLogicUri(@yfb Uri uri) {
        md8.checkNotNullParameter(uri, "<set-?>");
        this.f36501d = uri;
    }

    @yfb
    public String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.f36498a + ", adSelectionIds='" + this.f36499b + "', adSelectionSignals=" + this.f36500c + ", selectionLogicUri=" + this.f36501d;
    }
}
