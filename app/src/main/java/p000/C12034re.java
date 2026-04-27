package p000;

import android.adservices.common.AdData;
import android.net.Uri;
import android.util.Log;
import java.util.Set;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: renamed from: re */
/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class C12034re {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f77965a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f77966b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Set<Integer> f77967c;

    /* JADX INFO: renamed from: d */
    @gib
    public final C14012ve f77968d;

    /* JADX INFO: renamed from: e */
    @gib
    public final String f77969e;

    /* JADX INFO: renamed from: re$a */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C16516a f77970a = new C16516a(null);

        /* JADX INFO: renamed from: re$a$a, reason: collision with other inner class name */
        public static final class C16516a {
            public /* synthetic */ C16516a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final AdData convertAdData(@yfb C12034re c12034re) {
                md8.checkNotNullParameter(c12034re, "adData");
                AdData.Builder adCounterKeys = C11444qe.m20268a().setMetadata(c12034re.getMetadata()).setRenderUri(c12034re.getRenderUri()).setAdCounterKeys(c12034re.getAdCounterKeys());
                C14012ve adFilters = c12034re.getAdFilters();
                AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).setAdRenderId(c12034re.getAdRenderId()).build();
                md8.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private C16516a() {
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: re$b */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    public static final class b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f77971a = new a(null);

        /* JADX INFO: renamed from: re$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final AdData convertAdData(@yfb C12034re c12034re) {
                md8.checkNotNullParameter(c12034re, "adData");
                if (!c12034re.getAdCounterKeys().isEmpty()) {
                    Log.w("AdData", "adCounterKeys is ignored. Min version to use adCounterKeys is API 33 ext 8 or API 31/32 ext 9");
                }
                if (c12034re.getAdFilters() != null) {
                    Log.w("AdData", "adFilters is ignored. Min version to use adFilters is API 33 ext 8 or API 31/32 ext 9");
                }
                if (c12034re.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                AdData adDataBuild = C11444qe.m20268a().setMetadata(c12034re.getMetadata()).setRenderUri(c12034re.getRenderUri()).build();
                md8.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: re$c */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    public static final class c {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f77972a = new a(null);

        /* JADX INFO: renamed from: re$c$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final AdData convertAdData(@yfb C12034re c12034re) {
                md8.checkNotNullParameter(c12034re, "adData");
                if (c12034re.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                AdData.Builder adCounterKeys = C11444qe.m20268a().setMetadata(c12034re.getMetadata()).setRenderUri(c12034re.getRenderUri()).setAdCounterKeys(c12034re.getAdCounterKeys());
                C14012ve adFilters = c12034re.getAdFilters();
                AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).build();
                md8.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private a() {
            }
        }

        private c() {
        }
    }

    @yg5.InterfaceC15648a
    public C12034re(@yfb Uri uri, @yfb String str, @yfb Set<Integer> set, @gib C14012ve c14012ve, @gib String str2) {
        md8.checkNotNullParameter(uri, "renderUri");
        md8.checkNotNullParameter(str, "metadata");
        md8.checkNotNullParameter(set, "adCounterKeys");
        this.f77965a = uri;
        this.f77966b = str;
        this.f77967c = set;
        this.f77968d = c14012ve;
        this.f77969e = str2;
    }

    @yfb
    @igg({"NewApi"})
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdData convertToAdServices$ads_adservices_release() {
        C2307ch c2307ch = C2307ch.f16504a;
        return (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) ? a.f77970a.convertAdData(this) : (c2307ch.adServicesVersion() >= 8 || c2307ch.extServicesVersionS() >= 9) ? c.f77972a.convertAdData(this) : b.f77971a.convertAdData(this);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12034re)) {
            return false;
        }
        C12034re c12034re = (C12034re) obj;
        return md8.areEqual(this.f77965a, c12034re.f77965a) && md8.areEqual(this.f77966b, c12034re.f77966b) && md8.areEqual(this.f77967c, c12034re.f77967c) && md8.areEqual(this.f77968d, c12034re.f77968d) && md8.areEqual(this.f77969e, c12034re.f77969e);
    }

    @yfb
    public final Set<Integer> getAdCounterKeys() {
        return this.f77967c;
    }

    @gib
    public final C14012ve getAdFilters() {
        return this.f77968d;
    }

    @gib
    public final String getAdRenderId() {
        return this.f77969e;
    }

    @yfb
    public final String getMetadata() {
        return this.f77966b;
    }

    @yfb
    public final Uri getRenderUri() {
        return this.f77965a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f77965a.hashCode() * 31) + this.f77966b.hashCode()) * 31) + this.f77967c.hashCode()) * 31;
        C14012ve c14012ve = this.f77968d;
        int iHashCode2 = (iHashCode + (c14012ve != null ? c14012ve.hashCode() : 0)) * 31;
        String str = this.f77969e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "AdData: renderUri=" + this.f77965a + ", metadata='" + this.f77966b + "', adCounterKeys=" + this.f77967c + ", adFilters=" + this.f77968d + ", adRenderId=" + this.f77969e;
    }

    public /* synthetic */ C12034re(Uri uri, String str, Set set, C14012ve c14012ve, String str2, int i, jt3 jt3Var) {
        this(uri, str, (i & 4) != 0 ? w6f.emptySet() : set, (i & 8) != 0 ? null : c14012ve, (i & 16) != 0 ? null : str2);
    }

    public /* synthetic */ C12034re(Uri uri, String str, Set set, C14012ve c14012ve, int i, jt3 jt3Var) {
        this(uri, str, (i & 4) != 0 ? w6f.emptySet() : set, (i & 8) != 0 ? null : c14012ve);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yg5.InterfaceC15651d
    public C12034re(@yfb Uri uri, @yfb String str, @yfb Set<Integer> set, @gib C14012ve c14012ve) {
        this(uri, str, set, c14012ve, null);
        md8.checkNotNullParameter(uri, "renderUri");
        md8.checkNotNullParameter(str, "metadata");
        md8.checkNotNullParameter(set, "adCounterKeys");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12034re(@yfb Uri uri, @yfb String str) {
        this(uri, str, w6f.emptySet(), null);
        md8.checkNotNullParameter(uri, "renderUri");
        md8.checkNotNullParameter(str, "metadata");
    }
}
