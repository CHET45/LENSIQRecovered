package p000;

import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.net.Uri;
import java.time.Instant;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15648a
public final class qq5 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f75111a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f75112b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Instant f75113c;

    /* JADX INFO: renamed from: d */
    @gib
    public final Instant f75114d;

    /* JADX INFO: renamed from: e */
    @gib
    public final C1886bh f75115e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qq5(@yfb Uri uri) {
        this(uri, null, null, null, null, 30, null);
        md8.checkNotNullParameter(uri, "fetchUri");
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final FetchAndJoinCustomAudienceRequest convertToAdServices$ads_adservices_release() {
        pq5.m19699a();
        FetchAndJoinCustomAudienceRequest.Builder expirationTime = oq5.m18810a(this.f75111a).setName(this.f75112b).setActivationTime(this.f75113c).setExpirationTime(this.f75114d);
        C1886bh c1886bh = this.f75115e;
        FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = expirationTime.setUserBiddingSignals(c1886bh != null ? c1886bh.convertToAdServices$ads_adservices_release() : null).build();
        md8.checkNotNullExpressionValue(fetchAndJoinCustomAudienceRequestBuild, "Builder(fetchUri)\n      …s())\n            .build()");
        return fetchAndJoinCustomAudienceRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq5)) {
            return false;
        }
        qq5 qq5Var = (qq5) obj;
        return md8.areEqual(this.f75111a, qq5Var.f75111a) && md8.areEqual(this.f75112b, qq5Var.f75112b) && md8.areEqual(this.f75113c, qq5Var.f75113c) && md8.areEqual(this.f75114d, qq5Var.f75114d) && md8.areEqual(this.f75115e, qq5Var.f75115e);
    }

    @gib
    public final Instant getActivationTime() {
        return this.f75113c;
    }

    @gib
    public final Instant getExpirationTime() {
        return this.f75114d;
    }

    @yfb
    public final Uri getFetchUri() {
        return this.f75111a;
    }

    @gib
    public final String getName() {
        return this.f75112b;
    }

    @gib
    public final C1886bh getUserBiddingSignals() {
        return this.f75115e;
    }

    public int hashCode() {
        int iHashCode = this.f75111a.hashCode() * 31;
        String str = this.f75112b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Instant instant = this.f75113c;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f75114d;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31;
        C1886bh c1886bh = this.f75115e;
        return iHashCode4 + (c1886bh != null ? c1886bh.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "FetchAndJoinCustomAudienceRequest: fetchUri=" + this.f75111a + ", name=" + this.f75112b + ", activationTime=" + this.f75113c + ", expirationTime=" + this.f75114d + ", userBiddingSignals=" + this.f75115e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qq5(@yfb Uri uri, @gib String str) {
        this(uri, str, null, null, null, 28, null);
        md8.checkNotNullParameter(uri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qq5(@yfb Uri uri, @gib String str, @gib Instant instant) {
        this(uri, str, instant, null, null, 24, null);
        md8.checkNotNullParameter(uri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qq5(@yfb Uri uri, @gib String str, @gib Instant instant, @gib Instant instant2) {
        this(uri, str, instant, instant2, null, 16, null);
        md8.checkNotNullParameter(uri, "fetchUri");
    }

    @yn8
    public qq5(@yfb Uri uri, @gib String str, @gib Instant instant, @gib Instant instant2, @gib C1886bh c1886bh) {
        md8.checkNotNullParameter(uri, "fetchUri");
        this.f75111a = uri;
        this.f75112b = str;
        this.f75113c = instant;
        this.f75114d = instant2;
        this.f75115e = c1886bh;
    }

    public /* synthetic */ qq5(Uri uri, String str, Instant instant, Instant instant2, C1886bh c1886bh, int i, jt3 jt3Var) {
        this(uri, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : c1886bh);
    }
}
