package p000;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import p000.e5e;

/* JADX INFO: loaded from: classes3.dex */
public final class cji {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<uii> f16760a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Uri f16761b;

    /* JADX INFO: renamed from: c */
    @gib
    public final InputEvent f16762c;

    /* JADX INFO: renamed from: d */
    @gib
    public final Uri f16763d;

    /* JADX INFO: renamed from: e */
    @gib
    public final Uri f16764e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Uri f16765f;

    /* JADX INFO: renamed from: cji$a */
    @dwf({"SMAP\nWebSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class C2336a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<uii> f16766a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final Uri f16767b;

        /* JADX INFO: renamed from: c */
        @gib
        public InputEvent f16768c;

        /* JADX INFO: renamed from: d */
        @gib
        public Uri f16769d;

        /* JADX INFO: renamed from: e */
        @gib
        public Uri f16770e;

        /* JADX INFO: renamed from: f */
        @gib
        public Uri f16771f;

        public C2336a(@yfb List<uii> list, @yfb Uri uri) {
            md8.checkNotNullParameter(list, "webSourceParams");
            md8.checkNotNullParameter(uri, "topOriginUri");
            this.f16766a = list;
            this.f16767b = uri;
        }

        @yfb
        public final cji build() {
            return new cji(this.f16766a, this.f16767b, this.f16768c, this.f16769d, this.f16770e, this.f16771f);
        }

        @yfb
        public final C2336a setAppDestination(@gib Uri uri) {
            this.f16769d = uri;
            return this;
        }

        @yfb
        public final C2336a setInputEvent(@yfb InputEvent inputEvent) {
            md8.checkNotNullParameter(inputEvent, "inputEvent");
            this.f16768c = inputEvent;
            return this;
        }

        @yfb
        public final C2336a setVerifiedDestination(@gib Uri uri) {
            this.f16771f = uri;
            return this;
        }

        @yfb
        public final C2336a setWebDestination(@gib Uri uri) {
            this.f16770e = uri;
            return this;
        }
    }

    public cji(@yfb List<uii> list, @yfb Uri uri, @gib InputEvent inputEvent, @gib Uri uri2, @gib Uri uri3, @gib Uri uri4) {
        md8.checkNotNullParameter(list, "webSourceParams");
        md8.checkNotNullParameter(uri, "topOriginUri");
        this.f16760a = list;
        this.f16761b = uri;
        this.f16762c = inputEvent;
        this.f16763d = uri2;
        this.f16764e = uri3;
        this.f16765f = uri4;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @igg({"ClassVerificationFailure", "NewApi"})
    public final WebSourceRegistrationRequest convertToAdServices$ads_adservices_release() {
        bji.m3217a();
        WebSourceRegistrationRequest webSourceRegistrationRequestBuild = aji.m842a(uii.f88059c.convertWebSourceParams$ads_adservices_release(this.f16760a), this.f16761b).setWebDestination(this.f16764e).setAppDestination(this.f16763d).setInputEvent(this.f16762c).setVerifiedDestination(this.f16765f).build();
        md8.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …ion)\n            .build()");
        return webSourceRegistrationRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cji)) {
            return false;
        }
        cji cjiVar = (cji) obj;
        return md8.areEqual(this.f16760a, cjiVar.f16760a) && md8.areEqual(this.f16764e, cjiVar.f16764e) && md8.areEqual(this.f16763d, cjiVar.f16763d) && md8.areEqual(this.f16761b, cjiVar.f16761b) && md8.areEqual(this.f16762c, cjiVar.f16762c) && md8.areEqual(this.f16765f, cjiVar.f16765f);
    }

    @gib
    public final Uri getAppDestination() {
        return this.f16763d;
    }

    @gib
    public final InputEvent getInputEvent() {
        return this.f16762c;
    }

    @yfb
    public final Uri getTopOriginUri() {
        return this.f16761b;
    }

    @gib
    public final Uri getVerifiedDestination() {
        return this.f16765f;
    }

    @gib
    public final Uri getWebDestination() {
        return this.f16764e;
    }

    @yfb
    public final List<uii> getWebSourceParams() {
        return this.f16760a;
    }

    public int hashCode() {
        int iHashCode = (this.f16760a.hashCode() * 31) + this.f16761b.hashCode();
        InputEvent inputEvent = this.f16762c;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.f16763d;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f16764e;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.f16761b.hashCode();
        InputEvent inputEvent2 = this.f16762c;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f16765f;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    @yfb
    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.f16760a + "], TopOriginUri=" + this.f16761b + ", InputEvent=" + this.f16762c + ", AppDestination=" + this.f16763d + ", WebDestination=" + this.f16764e + ", VerifiedDestination=" + this.f16765f) + " }";
    }

    public /* synthetic */ cji(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i, jt3 jt3Var) {
        this(list, uri, (i & 4) != 0 ? null : inputEvent, (i & 8) != 0 ? null : uri2, (i & 16) != 0 ? null : uri3, (i & 32) != 0 ? null : uri4);
    }
}
