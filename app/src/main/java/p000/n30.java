package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class n30 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C9667a f63102c = new C9667a(null);

    /* JADX INFO: renamed from: d */
    public static final int f63103d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f63104e = 2;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f63105a;

    /* JADX INFO: renamed from: b */
    public final int f63106b;

    /* JADX INFO: renamed from: n30$a */
    public static final class C9667a {
        public /* synthetic */ C9667a(jt3 jt3Var) {
            this();
        }

        private C9667a() {
        }
    }

    public n30(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "id");
        this.f63105a = str;
        this.f63106b = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n30)) {
            return false;
        }
        n30 n30Var = (n30) obj;
        return md8.areEqual(this.f63105a, n30Var.f63105a) && this.f63106b == n30Var.f63106b;
    }

    @yfb
    public final String getId() {
        return this.f63105a;
    }

    public final int getScope() {
        return this.f63106b;
    }

    public int hashCode() {
        return (this.f63105a.hashCode() * 31) + Integer.hashCode(this.f63106b);
    }

    @yfb
    public String toString() {
        return "AppSetId: id=" + this.f63105a + ", scope=" + (this.f63106b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
