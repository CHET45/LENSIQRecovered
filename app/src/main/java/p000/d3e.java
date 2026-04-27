package p000;

import android.adservices.adselection.ReportImpressionRequest;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class d3e {

    /* JADX INFO: renamed from: a */
    public final long f28344a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C15642yf f28345b;

    /* JADX INFO: renamed from: d3e$a */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class C4598a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f28346a = new a(null);

        /* JADX INFO: renamed from: d3e$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final ReportImpressionRequest convertReportImpressionRequest(@yfb d3e d3eVar) {
                md8.checkNotNullParameter(d3eVar, "request");
                if (md8.areEqual(d3eVar.getAdSelectionConfig(), C15642yf.f101368h.getEMPTY())) {
                    c3e.m3748a();
                    return a3e.m126a(d3eVar.getAdSelectionId());
                }
                c3e.m3748a();
                return b3e.m2883a(d3eVar.getAdSelectionId(), d3eVar.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }

            private a() {
            }
        }

        private C4598a() {
        }
    }

    /* JADX INFO: renamed from: d3e$b */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    public static final class C4599b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f28347a = new a(null);

        /* JADX INFO: renamed from: d3e$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final ReportImpressionRequest convertReportImpressionRequest(@yfb d3e d3eVar) {
                md8.checkNotNullParameter(d3eVar, "request");
                if (md8.areEqual(d3eVar.getAdSelectionConfig(), C15642yf.f101368h.getEMPTY())) {
                    throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                }
                c3e.m3748a();
                return b3e.m2883a(d3eVar.getAdSelectionId(), d3eVar.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }

            private a() {
            }
        }

        private C4599b() {
        }
    }

    public d3e(long j, @yfb C15642yf c15642yf) {
        md8.checkNotNullParameter(c15642yf, "adSelectionConfig");
        this.f28344a = j;
        this.f28345b = c15642yf;
    }

    @yfb
    @igg({"NewApi"})
    @p7e({p7e.EnumC10826a.f69934a})
    public final ReportImpressionRequest convertToAdServices$ads_adservices_release() {
        C2307ch c2307ch = C2307ch.f16504a;
        return (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) ? C4598a.f28346a.convertReportImpressionRequest(this) : C4599b.f28347a.convertReportImpressionRequest(this);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3e)) {
            return false;
        }
        d3e d3eVar = (d3e) obj;
        return this.f28344a == d3eVar.f28344a && md8.areEqual(this.f28345b, d3eVar.f28345b);
    }

    @yfb
    public final C15642yf getAdSelectionConfig() {
        return this.f28345b;
    }

    public final long getAdSelectionId() {
        return this.f28344a;
    }

    public int hashCode() {
        return (Long.hashCode(this.f28344a) * 31) + this.f28345b.hashCode();
    }

    @yfb
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.f28344a + ", adSelectionConfig=" + this.f28345b;
    }

    @yg5.InterfaceC15651d
    public d3e(long j) {
        this(j, C15642yf.f101368h.getEMPTY());
    }
}
