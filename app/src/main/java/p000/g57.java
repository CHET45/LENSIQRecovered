package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g57 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f38808a;

    /* JADX INFO: renamed from: b */
    public final boolean f38809b;

    /* JADX INFO: renamed from: g57$a */
    @dwf({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class C6133a {

        /* JADX INFO: renamed from: a */
        @yfb
        public String f38810a = "";

        /* JADX INFO: renamed from: b */
        public boolean f38811b = true;

        @yfb
        public final g57 build() {
            return new g57(this.f38810a, this.f38811b);
        }

        @yfb
        public final C6133a setAdsSdkName(@yfb String str) {
            md8.checkNotNullParameter(str, "adsSdkName");
            if (str.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f38810a = str;
            return this;
        }

        @yfb
        public final C6133a setShouldRecordObservation(boolean z) {
            this.f38811b = z;
            return this;
        }
    }

    public g57() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g57)) {
            return false;
        }
        g57 g57Var = (g57) obj;
        return md8.areEqual(this.f38808a, g57Var.f38808a) && this.f38809b == g57Var.f38809b;
    }

    @yfb
    public final String getAdsSdkName() {
        return this.f38808a;
    }

    public int hashCode() {
        return (this.f38808a.hashCode() * 31) + Boolean.hashCode(this.f38809b);
    }

    @xn8(name = "shouldRecordObservation")
    public final boolean shouldRecordObservation() {
        return this.f38809b;
    }

    @yfb
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f38808a + ", shouldRecordObservation=" + this.f38809b;
    }

    public g57(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "adsSdkName");
        this.f38808a = str;
        this.f38809b = z;
    }

    public /* synthetic */ g57(String str, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
