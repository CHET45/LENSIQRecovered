package p000;

import android.adservices.adselection.GetAdSelectionDataRequest;
import android.net.Uri;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15648a
public final class o37 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5297eh f66411a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Uri f66412b;

    /* JADX INFO: renamed from: o37$a */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class C10178a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f66413a = new a(null);

        /* JADX INFO: renamed from: o37$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final GetAdSelectionDataRequest convertGetAdSelectionDataRequest(@yfb o37 o37Var) {
                md8.checkNotNullParameter(o37Var, "request");
                GetAdSelectionDataRequest getAdSelectionDataRequestBuild = n37.m17762a().setSeller(o37Var.getSeller().convertToAdServices$ads_adservices_release()).build();
                md8.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private a() {
            }
        }

        private C10178a() {
        }
    }

    /* JADX INFO: renamed from: o37$b */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 12), @e5e(extension = 31, version = 12)})
    public static final class C10179b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f66414a = new a(null);

        /* JADX INFO: renamed from: o37$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final GetAdSelectionDataRequest convertGetAdSelectionDataRequest(@yfb o37 o37Var) {
                md8.checkNotNullParameter(o37Var, "request");
                GetAdSelectionDataRequest getAdSelectionDataRequestBuild = n37.m17762a().setSeller(o37Var.getSeller().convertToAdServices$ads_adservices_release()).setCoordinatorOriginUri(o37Var.getCoordinatorOriginUri()).build();
                md8.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private a() {
            }
        }

        private C10179b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public o37(@yfb C5297eh c5297eh) {
        this(c5297eh, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(c5297eh, "seller");
    }

    @yg5.InterfaceC15650c
    public static /* synthetic */ void getCoordinatorOriginUri$annotations() {
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    @p7e({p7e.EnumC10826a.f69934a})
    @yfb
    @igg({"NewApi"})
    public final GetAdSelectionDataRequest convertToAdServices$ads_adservices_release() {
        C2307ch c2307ch = C2307ch.f16504a;
        return (c2307ch.adServicesVersion() >= 12 || c2307ch.extServicesVersionS() >= 12) ? C10179b.f66414a.convertGetAdSelectionDataRequest(this) : C10178a.f66413a.convertGetAdSelectionDataRequest(this);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o37)) {
            return false;
        }
        o37 o37Var = (o37) obj;
        return md8.areEqual(this.f66411a, o37Var.f66411a) && md8.areEqual(this.f66412b, o37Var.f66412b);
    }

    @gib
    public final Uri getCoordinatorOriginUri() {
        return this.f66412b;
    }

    @yfb
    public final C5297eh getSeller() {
        return this.f66411a;
    }

    public int hashCode() {
        int iHashCode = this.f66411a.hashCode() * 31;
        Uri uri = this.f66412b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.f66411a + ", coordinatorOriginUri=" + this.f66412b;
    }

    @yn8
    public o37(@yfb C5297eh c5297eh, @gib Uri uri) {
        md8.checkNotNullParameter(c5297eh, "seller");
        this.f66411a = c5297eh;
        this.f66412b = uri;
    }

    public /* synthetic */ o37(C5297eh c5297eh, Uri uri, int i, jt3 jt3Var) {
        this(c5297eh, (i & 2) != 0 ? null : uri);
    }
}
