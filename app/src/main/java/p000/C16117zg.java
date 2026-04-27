package p000;

import android.adservices.adselection.AdSelectionOutcome;
import android.net.Uri;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: renamed from: zg */
/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class C16117zg {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final a f105029c = new a(null);

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public static final C16117zg f105030d;

    /* JADX INFO: renamed from: a */
    public final long f105031a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Uri f105032b;

    /* JADX INFO: renamed from: zg$a */
    @yg5.InterfaceC15648a
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        @yg5.InterfaceC15648a
        public static /* synthetic */ void getNO_OUTCOME$annotations() {
        }

        private a() {
        }
    }

    static {
        Uri uri = Uri.EMPTY;
        md8.checkNotNullExpressionValue(uri, "EMPTY");
        f105030d = new C16117zg(0L, uri);
    }

    public C16117zg(long j, @yfb Uri uri) {
        md8.checkNotNullParameter(uri, "renderUri");
        this.f105031a = j;
        this.f105032b = uri;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16117zg)) {
            return false;
        }
        C16117zg c16117zg = (C16117zg) obj;
        return this.f105031a == c16117zg.f105031a && md8.areEqual(this.f105032b, c16117zg.f105032b);
    }

    public final long getAdSelectionId() {
        return this.f105031a;
    }

    @yfb
    public final Uri getRenderUri() {
        return this.f105032b;
    }

    @yg5.InterfaceC15648a
    public final boolean hasOutcome() {
        return !md8.areEqual(this, f105030d);
    }

    public int hashCode() {
        return (Long.hashCode(this.f105031a) * 31) + this.f105032b.hashCode();
    }

    @yfb
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f105031a + ", renderUri=" + this.f105032b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @p7e({p7e.EnumC10826a.f69934a})
    public C16117zg(@yfb AdSelectionOutcome adSelectionOutcome) {
        md8.checkNotNullParameter(adSelectionOutcome, "response");
        long adSelectionId = adSelectionOutcome.getAdSelectionId();
        Uri renderUri = adSelectionOutcome.getRenderUri();
        md8.checkNotNullExpressionValue(renderUri, "response.renderUri");
        this(adSelectionId, renderUri);
    }
}
