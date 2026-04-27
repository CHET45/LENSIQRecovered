package p000;

import android.adservices.measurement.DeletionRequest;
import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import p000.e5e;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
public final class s54 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C12447b f80689g = new C12447b(null);

    /* JADX INFO: renamed from: h */
    public static final int f80690h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f80691i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f80692j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f80693k = 1;

    /* JADX INFO: renamed from: a */
    public final int f80694a;

    /* JADX INFO: renamed from: b */
    public final int f80695b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Instant f80696c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Instant f80697d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<Uri> f80698e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<Uri> f80699f;

    /* JADX INFO: renamed from: s54$a */
    @c5e(26)
    @dwf({"SMAP\nDeletionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeletionRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    public static final class C12446a {

        /* JADX INFO: renamed from: a */
        public final int f80700a;

        /* JADX INFO: renamed from: b */
        public final int f80701b;

        /* JADX INFO: renamed from: c */
        @yfb
        public Instant f80702c;

        /* JADX INFO: renamed from: d */
        @yfb
        public Instant f80703d;

        /* JADX INFO: renamed from: e */
        @yfb
        public List<? extends Uri> f80704e;

        /* JADX INFO: renamed from: f */
        @yfb
        public List<? extends Uri> f80705f;

        public C12446a(int i, int i2) {
            this.f80700a = i;
            this.f80701b = i2;
            Instant instant = Instant.MIN;
            md8.checkNotNullExpressionValue(instant, "MIN");
            this.f80702c = instant;
            Instant instant2 = Instant.MAX;
            md8.checkNotNullExpressionValue(instant2, "MAX");
            this.f80703d = instant2;
            this.f80704e = l82.emptyList();
            this.f80705f = l82.emptyList();
        }

        @yfb
        public final s54 build() {
            return new s54(this.f80700a, this.f80701b, this.f80702c, this.f80703d, this.f80704e, this.f80705f);
        }

        @yfb
        public final C12446a setDomainUris(@yfb List<? extends Uri> list) {
            md8.checkNotNullParameter(list, "domainUris");
            this.f80704e = list;
            return this;
        }

        @yfb
        public final C12446a setEnd(@yfb Instant instant) {
            md8.checkNotNullParameter(instant, "end");
            this.f80703d = instant;
            return this;
        }

        @yfb
        public final C12446a setOriginUris(@yfb List<? extends Uri> list) {
            md8.checkNotNullParameter(list, "originUris");
            this.f80705f = list;
            return this;
        }

        @yfb
        public final C12446a setStart(@yfb Instant instant) {
            md8.checkNotNullParameter(instant, "start");
            this.f80702c = instant;
            return this;
        }
    }

    /* JADX INFO: renamed from: s54$b */
    public static final class C12447b {

        /* JADX INFO: renamed from: s54$b$a */
        @p7e({p7e.EnumC10826a.f69934a})
        @i8e(EnumC11189pz.f72536a)
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        /* JADX INFO: renamed from: s54$b$b */
        @p7e({p7e.EnumC10826a.f69934a})
        @i8e(EnumC11189pz.f72536a)
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public /* synthetic */ C12447b(jt3 jt3Var) {
            this();
        }

        private C12447b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s54(int i, int i2, @yfb Instant instant, @yfb Instant instant2, @yfb List<? extends Uri> list, @yfb List<? extends Uri> list2) {
        md8.checkNotNullParameter(instant, "start");
        md8.checkNotNullParameter(instant2, "end");
        md8.checkNotNullParameter(list, "domainUris");
        md8.checkNotNullParameter(list2, "originUris");
        this.f80694a = i;
        this.f80695b = i2;
        this.f80696c = instant;
        this.f80697d = instant2;
        this.f80698e = list;
        this.f80699f = list2;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @igg({"ClassVerificationFailure", "NewApi"})
    public final DeletionRequest convertToAdServices$ads_adservices_release() {
        DeletionRequest deletionRequestBuild = r54.m21017a().setDeletionMode(this.f80694a).setMatchBehavior(this.f80695b).setStart(this.f80696c).setEnd(this.f80697d).setDomainUris(this.f80698e).setOriginUris(this.f80699f).build();
        md8.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s54)) {
            return false;
        }
        s54 s54Var = (s54) obj;
        return this.f80694a == s54Var.f80694a && md8.areEqual(new HashSet(this.f80698e), new HashSet(s54Var.f80698e)) && md8.areEqual(new HashSet(this.f80699f), new HashSet(s54Var.f80699f)) && md8.areEqual(this.f80696c, s54Var.f80696c) && md8.areEqual(this.f80697d, s54Var.f80697d) && this.f80695b == s54Var.f80695b;
    }

    public final int getDeletionMode() {
        return this.f80694a;
    }

    @yfb
    public final List<Uri> getDomainUris() {
        return this.f80698e;
    }

    @yfb
    public final Instant getEnd() {
        return this.f80697d;
    }

    public final int getMatchBehavior() {
        return this.f80695b;
    }

    @yfb
    public final List<Uri> getOriginUris() {
        return this.f80699f;
    }

    @yfb
    public final Instant getStart() {
        return this.f80696c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f80694a) * 31) + this.f80698e.hashCode()) * 31) + this.f80699f.hashCode()) * 31) + this.f80696c.hashCode()) * 31) + this.f80697d.hashCode()) * 31) + Integer.hashCode(this.f80695b);
    }

    @yfb
    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.f80694a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.f80695b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.f80696c + ", End=" + this.f80697d + ", DomainUris=" + this.f80698e + ", OriginUris=" + this.f80699f + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s54(int i, int i2, Instant instant, Instant instant2, List list, List list2, int i3, jt3 jt3Var) {
        if ((i3 & 4) != 0) {
            instant = Instant.MIN;
            md8.checkNotNullExpressionValue(instant, "MIN");
        }
        Instant instant3 = instant;
        if ((i3 & 8) != 0) {
            instant2 = Instant.MAX;
            md8.checkNotNullExpressionValue(instant2, "MAX");
        }
        this(i, i2, instant3, instant2, (i3 & 16) != 0 ? l82.emptyList() : list, (i3 & 32) != 0 ? l82.emptyList() : list2);
    }
}
