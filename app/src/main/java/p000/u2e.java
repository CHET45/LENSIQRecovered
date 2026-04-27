package p000;

import android.adservices.adselection.ReportEventRequest;
import android.util.Log;
import android.view.InputEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15651d
public final class u2e {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C13337a f86672f = new C13337a(null);

    /* JADX INFO: renamed from: g */
    public static final int f86673g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f86674h = 2;

    /* JADX INFO: renamed from: a */
    public final long f86675a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f86676b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f86677c;

    /* JADX INFO: renamed from: d */
    public final int f86678d;

    /* JADX INFO: renamed from: e */
    @gib
    public final InputEvent f86679e;

    /* JADX INFO: renamed from: u2e$a */
    public static final class C13337a {
        public /* synthetic */ C13337a(jt3 jt3Var) {
            this();
        }

        private C13337a() {
        }
    }

    /* JADX INFO: renamed from: u2e$b */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class C13338b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f86680a = new a(null);

        /* JADX INFO: renamed from: u2e$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final ReportEventRequest convertReportEventRequest(@yfb u2e u2eVar) {
                md8.checkNotNullParameter(u2eVar, "request");
                y2e.m25633a();
                ReportEventRequest reportEventRequestBuild = x2e.m24934a(u2eVar.getAdSelectionId(), u2eVar.getEventKey(), u2eVar.getEventData(), u2eVar.getReportingDestinations()).setInputEvent(u2eVar.getInputEvent()).build();
                md8.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private a() {
            }
        }

        private C13338b() {
        }
    }

    /* JADX INFO: renamed from: u2e$c */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    public static final class C13339c {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f86681a = new a(null);

        /* JADX INFO: renamed from: u2e$c$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final ReportEventRequest convertReportEventRequest(@yfb u2e u2eVar) {
                md8.checkNotNullParameter(u2eVar, "request");
                if (u2eVar.getInputEvent() != null) {
                    Log.w("ReportEventRequest", "inputEvent is ignored. Min version to use inputEvent is API 31 ext 10");
                }
                y2e.m25633a();
                ReportEventRequest reportEventRequestBuild = x2e.m24934a(u2eVar.getAdSelectionId(), u2eVar.getEventKey(), u2eVar.getEventData(), u2eVar.getReportingDestinations()).build();
                md8.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private a() {
            }
        }

        private C13339c() {
        }
    }

    /* JADX INFO: renamed from: u2e$d */
    @p7e({p7e.EnumC10826a.f69934a})
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13340d {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public u2e(long j, @yfb String str, @yfb String str2, int i) {
        this(j, str, str2, i, null, 16, null);
        md8.checkNotNullParameter(str, "eventKey");
        md8.checkNotNullParameter(str2, "eventData");
    }

    @yg5.InterfaceC15648a
    public static /* synthetic */ void getInputEvent$annotations() {
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    @p7e({p7e.EnumC10826a.f69934a})
    @yfb
    @igg({"NewApi"})
    public final ReportEventRequest convertToAdServices$ads_adservices_release() {
        C2307ch c2307ch = C2307ch.f16504a;
        return (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) ? C13338b.f86680a.convertReportEventRequest(this) : C13339c.f86681a.convertReportEventRequest(this);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e)) {
            return false;
        }
        u2e u2eVar = (u2e) obj;
        return this.f86675a == u2eVar.f86675a && md8.areEqual(this.f86676b, u2eVar.f86676b) && md8.areEqual(this.f86677c, u2eVar.f86677c) && this.f86678d == u2eVar.f86678d && md8.areEqual(this.f86679e, u2eVar.f86679e);
    }

    public final long getAdSelectionId() {
        return this.f86675a;
    }

    @yfb
    public final String getEventData() {
        return this.f86677c;
    }

    @yfb
    public final String getEventKey() {
        return this.f86676b;
    }

    @gib
    public final InputEvent getInputEvent() {
        return this.f86679e;
    }

    public final int getReportingDestinations() {
        return this.f86678d;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f86675a) * 31) + this.f86676b.hashCode()) * 31) + this.f86677c.hashCode()) * 31) + Integer.hashCode(this.f86678d)) * 31;
        InputEvent inputEvent = this.f86679e;
        return iHashCode + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "ReportEventRequest: adSelectionId=" + this.f86675a + ", eventKey=" + this.f86676b + ", eventData=" + this.f86677c + ", reportingDestinations=" + this.f86678d + "inputEvent=" + this.f86679e;
    }

    @yn8
    public u2e(long j, @yfb String str, @yfb String str2, int i, @gib InputEvent inputEvent) {
        md8.checkNotNullParameter(str, "eventKey");
        md8.checkNotNullParameter(str2, "eventData");
        this.f86675a = j;
        this.f86676b = str;
        this.f86677c = str2;
        this.f86678d = i;
        this.f86679e = inputEvent;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("Invalid reporting destinations bitfield.");
        }
    }

    public /* synthetic */ u2e(long j, String str, String str2, int i, InputEvent inputEvent, int i2, jt3 jt3Var) {
        this(j, str, str2, i, (i2 & 16) != 0 ? null : inputEvent);
    }
}
