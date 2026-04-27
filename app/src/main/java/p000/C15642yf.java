package p000;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.e5e;
import p000.p7e;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class C15642yf {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final a f101368h = new a(null);

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C15642yf f101369i;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5297eh f101370a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Uri f101371b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<C5297eh> f101372c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final C1886bh f101373d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final C1886bh f101374e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Map<C5297eh, C1886bh> f101375f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final Uri f101376g;

    /* JADX INFO: renamed from: yf$a */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final C15642yf getEMPTY() {
            return C15642yf.f101369i;
        }

        private a() {
        }
    }

    static {
        C5297eh c5297eh = new C5297eh("");
        Uri uri = Uri.EMPTY;
        md8.checkNotNullExpressionValue(uri, "EMPTY");
        List listEmptyList = l82.emptyList();
        C1886bh c1886bh = new C1886bh("");
        C1886bh c1886bh2 = new C1886bh("");
        Map mapEmptyMap = xt9.emptyMap();
        md8.checkNotNullExpressionValue(uri, "EMPTY");
        f101369i = new C15642yf(c5297eh, uri, listEmptyList, c1886bh, c1886bh2, mapEmptyMap, uri);
    }

    public C15642yf(@yfb C5297eh c5297eh, @yfb Uri uri, @yfb List<C5297eh> list, @yfb C1886bh c1886bh, @yfb C1886bh c1886bh2, @yfb Map<C5297eh, C1886bh> map, @yfb Uri uri2) {
        md8.checkNotNullParameter(c5297eh, "seller");
        md8.checkNotNullParameter(uri, "decisionLogicUri");
        md8.checkNotNullParameter(list, "customAudienceBuyers");
        md8.checkNotNullParameter(c1886bh, "adSelectionSignals");
        md8.checkNotNullParameter(c1886bh2, "sellerSignals");
        md8.checkNotNullParameter(map, "perBuyerSignals");
        md8.checkNotNullParameter(uri2, "trustedScoringSignalsUri");
        this.f101370a = c5297eh;
        this.f101371b = uri;
        this.f101372c = list;
        this.f101373d = c1886bh;
        this.f101374e = c1886bh2;
        this.f101375f = map;
        this.f101376g = uri2;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @p7e({p7e.EnumC10826a.f69934a})
    private final List<AdTechIdentifier> convertToAdServices(List<C5297eh> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C5297eh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdSelectionConfig convertToAdServices$ads_adservices_release() {
        AdSelectionConfig adSelectionConfigBuild = C15041xf.m25110a().setAdSelectionSignals(this.f101373d.convertToAdServices$ads_adservices_release()).setCustomAudienceBuyers(convertToAdServices(this.f101372c)).setDecisionLogicUri(this.f101371b).setSeller(this.f101370a.convertToAdServices$ads_adservices_release()).setPerBuyerSignals(convertToAdServices(this.f101375f)).setSellerSignals(this.f101374e.convertToAdServices$ads_adservices_release()).setTrustedScoringSignalsUri(this.f101376g).build();
        md8.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
        return adSelectionConfigBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15642yf)) {
            return false;
        }
        C15642yf c15642yf = (C15642yf) obj;
        return md8.areEqual(this.f101370a, c15642yf.f101370a) && md8.areEqual(this.f101371b, c15642yf.f101371b) && md8.areEqual(this.f101372c, c15642yf.f101372c) && md8.areEqual(this.f101373d, c15642yf.f101373d) && md8.areEqual(this.f101374e, c15642yf.f101374e) && md8.areEqual(this.f101375f, c15642yf.f101375f) && md8.areEqual(this.f101376g, c15642yf.f101376g);
    }

    @yfb
    public final C1886bh getAdSelectionSignals() {
        return this.f101373d;
    }

    @yfb
    public final List<C5297eh> getCustomAudienceBuyers() {
        return this.f101372c;
    }

    @yfb
    public final Uri getDecisionLogicUri() {
        return this.f101371b;
    }

    @yfb
    public final Map<C5297eh, C1886bh> getPerBuyerSignals() {
        return this.f101375f;
    }

    @yfb
    public final C5297eh getSeller() {
        return this.f101370a;
    }

    @yfb
    public final C1886bh getSellerSignals() {
        return this.f101374e;
    }

    @yfb
    public final Uri getTrustedScoringSignalsUri() {
        return this.f101376g;
    }

    public int hashCode() {
        return (((((((((((this.f101370a.hashCode() * 31) + this.f101371b.hashCode()) * 31) + this.f101372c.hashCode()) * 31) + this.f101373d.hashCode()) * 31) + this.f101374e.hashCode()) * 31) + this.f101375f.hashCode()) * 31) + this.f101376g.hashCode();
    }

    @yfb
    public String toString() {
        return "AdSelectionConfig: seller=" + this.f101370a + ", decisionLogicUri='" + this.f101371b + "', customAudienceBuyers=" + this.f101372c + ", adSelectionSignals=" + this.f101373d + ", sellerSignals=" + this.f101374e + ", perBuyerSignals=" + this.f101375f + ", trustedScoringSignalsUri=" + this.f101376g;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @p7e({p7e.EnumC10826a.f69934a})
    private final Map<AdTechIdentifier, AdSelectionSignals> convertToAdServices(Map<C5297eh, C1886bh> map) {
        HashMap map2 = new HashMap();
        for (C5297eh c5297eh : map.keySet()) {
            AdTechIdentifier adTechIdentifierConvertToAdServices$ads_adservices_release = c5297eh.convertToAdServices$ads_adservices_release();
            C1886bh c1886bh = map.get(c5297eh);
            map2.put(adTechIdentifierConvertToAdServices$ads_adservices_release, c1886bh != null ? c1886bh.convertToAdServices$ads_adservices_release() : null);
        }
        return map2;
    }
}
