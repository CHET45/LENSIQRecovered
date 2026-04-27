package p000;

import android.net.Uri;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5297eh f39205a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f39206b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Uri f39207c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Uri f39208d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<C12034re> f39209e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Instant f39210f;

    /* JADX INFO: renamed from: g */
    @gib
    public final Instant f39211g;

    /* JADX INFO: renamed from: h */
    @gib
    public final C1886bh f39212h;

    /* JADX INFO: renamed from: i */
    @gib
    public final ijh f39213i;

    /* JADX INFO: renamed from: gb3$a */
    @dwf({"SMAP\nCustomAudience.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudience.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class C6193a {

        /* JADX INFO: renamed from: a */
        @yfb
        public C5297eh f39214a;

        /* JADX INFO: renamed from: b */
        @yfb
        public String f39215b;

        /* JADX INFO: renamed from: c */
        @yfb
        public Uri f39216c;

        /* JADX INFO: renamed from: d */
        @yfb
        public Uri f39217d;

        /* JADX INFO: renamed from: e */
        @yfb
        public List<C12034re> f39218e;

        /* JADX INFO: renamed from: f */
        @gib
        public Instant f39219f;

        /* JADX INFO: renamed from: g */
        @gib
        public Instant f39220g;

        /* JADX INFO: renamed from: h */
        @gib
        public C1886bh f39221h;

        /* JADX INFO: renamed from: i */
        @gib
        public ijh f39222i;

        public C6193a(@yfb C5297eh c5297eh, @yfb String str, @yfb Uri uri, @yfb Uri uri2, @yfb List<C12034re> list) {
            md8.checkNotNullParameter(c5297eh, "buyer");
            md8.checkNotNullParameter(str, "name");
            md8.checkNotNullParameter(uri, "dailyUpdateUri");
            md8.checkNotNullParameter(uri2, "biddingLogicUri");
            md8.checkNotNullParameter(list, "ads");
            this.f39214a = c5297eh;
            this.f39215b = str;
            this.f39216c = uri;
            this.f39217d = uri2;
            this.f39218e = list;
        }

        @yfb
        public final gb3 build() {
            return new gb3(this.f39214a, this.f39215b, this.f39216c, this.f39217d, this.f39218e, this.f39219f, this.f39220g, this.f39221h, this.f39222i);
        }

        @yfb
        public final C6193a setActivationTime(@yfb Instant instant) {
            md8.checkNotNullParameter(instant, "activationTime");
            this.f39219f = instant;
            return this;
        }

        @yfb
        public final C6193a setAds(@yfb List<C12034re> list) {
            md8.checkNotNullParameter(list, "ads");
            this.f39218e = list;
            return this;
        }

        @yfb
        public final C6193a setBiddingLogicUri(@yfb Uri uri) {
            md8.checkNotNullParameter(uri, "biddingLogicUri");
            this.f39217d = uri;
            return this;
        }

        @yfb
        public final C6193a setBuyer(@yfb C5297eh c5297eh) {
            md8.checkNotNullParameter(c5297eh, "buyer");
            this.f39214a = c5297eh;
            return this;
        }

        @yfb
        public final C6193a setDailyUpdateUri(@yfb Uri uri) {
            md8.checkNotNullParameter(uri, "dailyUpdateUri");
            this.f39216c = uri;
            return this;
        }

        @yfb
        public final C6193a setExpirationTime(@yfb Instant instant) {
            md8.checkNotNullParameter(instant, "expirationTime");
            this.f39220g = instant;
            return this;
        }

        @yfb
        public final C6193a setName(@yfb String str) {
            md8.checkNotNullParameter(str, "name");
            this.f39215b = str;
            return this;
        }

        @yfb
        public final C6193a setTrustedBiddingData(@yfb ijh ijhVar) {
            md8.checkNotNullParameter(ijhVar, "trustedBiddingSignals");
            this.f39222i = ijhVar;
            return this;
        }

        @yfb
        public final C6193a setUserBiddingSignals(@yfb C1886bh c1886bh) {
            md8.checkNotNullParameter(c1886bh, "userBiddingSignals");
            this.f39221h = c1886bh;
            return this;
        }
    }

    public gb3(@yfb C5297eh c5297eh, @yfb String str, @yfb Uri uri, @yfb Uri uri2, @yfb List<C12034re> list, @gib Instant instant, @gib Instant instant2, @gib C1886bh c1886bh, @gib ijh ijhVar) {
        md8.checkNotNullParameter(c5297eh, "buyer");
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(uri, "dailyUpdateUri");
        md8.checkNotNullParameter(uri2, "biddingLogicUri");
        md8.checkNotNullParameter(list, "ads");
        this.f39205a = c5297eh;
        this.f39206b = str;
        this.f39207c = uri;
        this.f39208d = uri2;
        this.f39209e = list;
        this.f39210f = instant;
        this.f39211g = instant2;
        this.f39212h = c1886bh;
        this.f39213i = ijhVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb3)) {
            return false;
        }
        gb3 gb3Var = (gb3) obj;
        return md8.areEqual(this.f39205a, gb3Var.f39205a) && md8.areEqual(this.f39206b, gb3Var.f39206b) && md8.areEqual(this.f39210f, gb3Var.f39210f) && md8.areEqual(this.f39211g, gb3Var.f39211g) && md8.areEqual(this.f39207c, gb3Var.f39207c) && md8.areEqual(this.f39212h, gb3Var.f39212h) && md8.areEqual(this.f39213i, gb3Var.f39213i) && md8.areEqual(this.f39209e, gb3Var.f39209e);
    }

    @gib
    public final Instant getActivationTime() {
        return this.f39210f;
    }

    @yfb
    public final List<C12034re> getAds() {
        return this.f39209e;
    }

    @yfb
    public final Uri getBiddingLogicUri() {
        return this.f39208d;
    }

    @yfb
    public final C5297eh getBuyer() {
        return this.f39205a;
    }

    @yfb
    public final Uri getDailyUpdateUri() {
        return this.f39207c;
    }

    @gib
    public final Instant getExpirationTime() {
        return this.f39211g;
    }

    @yfb
    public final String getName() {
        return this.f39206b;
    }

    @gib
    public final ijh getTrustedBiddingSignals() {
        return this.f39213i;
    }

    @gib
    public final C1886bh getUserBiddingSignals() {
        return this.f39212h;
    }

    public int hashCode() {
        int iHashCode = ((this.f39205a.hashCode() * 31) + this.f39206b.hashCode()) * 31;
        Instant instant = this.f39210f;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f39211g;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.f39207c.hashCode()) * 31;
        C1886bh c1886bh = this.f39212h;
        int iHashCode4 = (iHashCode3 + (c1886bh != null ? c1886bh.hashCode() : 0)) * 31;
        ijh ijhVar = this.f39213i;
        return ((((iHashCode4 + (ijhVar != null ? ijhVar.hashCode() : 0)) * 31) + this.f39208d.hashCode()) * 31) + this.f39209e.hashCode();
    }

    @yfb
    public String toString() {
        return "CustomAudience: buyer=" + this.f39208d + ", name=" + this.f39206b + ", activationTime=" + this.f39210f + ", expirationTime=" + this.f39211g + ", dailyUpdateUri=" + this.f39207c + ", userBiddingSignals=" + this.f39212h + ", trustedBiddingSignals=" + this.f39213i + ", biddingLogicUri=" + this.f39208d + ", ads=" + this.f39209e;
    }

    public /* synthetic */ gb3(C5297eh c5297eh, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, C1886bh c1886bh, ijh ijhVar, int i, jt3 jt3Var) {
        this(c5297eh, str, uri, uri2, list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : c1886bh, (i & 256) != 0 ? null : ijhVar);
    }
}
