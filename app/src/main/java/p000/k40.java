package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class k40 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f52553a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f52554b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f52555c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f52556d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ci9 f52557e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final C12176ro f52558f;

    public k40(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4, @yfb ci9 ci9Var, @yfb C12176ro c12176ro) {
        md8.checkNotNullParameter(str, "appId");
        md8.checkNotNullParameter(str2, "deviceModel");
        md8.checkNotNullParameter(str3, "sessionSdkVersion");
        md8.checkNotNullParameter(str4, "osVersion");
        md8.checkNotNullParameter(ci9Var, "logEnvironment");
        md8.checkNotNullParameter(c12176ro, "androidAppInfo");
        this.f52553a = str;
        this.f52554b = str2;
        this.f52555c = str3;
        this.f52556d = str4;
        this.f52557e = ci9Var;
        this.f52558f = c12176ro;
    }

    public static /* synthetic */ k40 copy$default(k40 k40Var, String str, String str2, String str3, String str4, ci9 ci9Var, C12176ro c12176ro, int i, Object obj) {
        if ((i & 1) != 0) {
            str = k40Var.f52553a;
        }
        if ((i & 2) != 0) {
            str2 = k40Var.f52554b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = k40Var.f52555c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = k40Var.f52556d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            ci9Var = k40Var.f52557e;
        }
        ci9 ci9Var2 = ci9Var;
        if ((i & 32) != 0) {
            c12176ro = k40Var.f52558f;
        }
        return k40Var.copy(str, str5, str6, str7, ci9Var2, c12176ro);
    }

    @yfb
    public final String component1() {
        return this.f52553a;
    }

    @yfb
    public final String component2() {
        return this.f52554b;
    }

    @yfb
    public final String component3() {
        return this.f52555c;
    }

    @yfb
    public final String component4() {
        return this.f52556d;
    }

    @yfb
    public final ci9 component5() {
        return this.f52557e;
    }

    @yfb
    public final C12176ro component6() {
        return this.f52558f;
    }

    @yfb
    public final k40 copy(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4, @yfb ci9 ci9Var, @yfb C12176ro c12176ro) {
        md8.checkNotNullParameter(str, "appId");
        md8.checkNotNullParameter(str2, "deviceModel");
        md8.checkNotNullParameter(str3, "sessionSdkVersion");
        md8.checkNotNullParameter(str4, "osVersion");
        md8.checkNotNullParameter(ci9Var, "logEnvironment");
        md8.checkNotNullParameter(c12176ro, "androidAppInfo");
        return new k40(str, str2, str3, str4, ci9Var, c12176ro);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return md8.areEqual(this.f52553a, k40Var.f52553a) && md8.areEqual(this.f52554b, k40Var.f52554b) && md8.areEqual(this.f52555c, k40Var.f52555c) && md8.areEqual(this.f52556d, k40Var.f52556d) && this.f52557e == k40Var.f52557e && md8.areEqual(this.f52558f, k40Var.f52558f);
    }

    @yfb
    public final C12176ro getAndroidAppInfo() {
        return this.f52558f;
    }

    @yfb
    public final String getAppId() {
        return this.f52553a;
    }

    @yfb
    public final String getDeviceModel() {
        return this.f52554b;
    }

    @yfb
    public final ci9 getLogEnvironment() {
        return this.f52557e;
    }

    @yfb
    public final String getOsVersion() {
        return this.f52556d;
    }

    @yfb
    public final String getSessionSdkVersion() {
        return this.f52555c;
    }

    public int hashCode() {
        return (((((((((this.f52553a.hashCode() * 31) + this.f52554b.hashCode()) * 31) + this.f52555c.hashCode()) * 31) + this.f52556d.hashCode()) * 31) + this.f52557e.hashCode()) * 31) + this.f52558f.hashCode();
    }

    @yfb
    public String toString() {
        return "ApplicationInfo(appId=" + this.f52553a + ", deviceModel=" + this.f52554b + ", sessionSdkVersion=" + this.f52555c + ", osVersion=" + this.f52556d + ", logEnvironment=" + this.f52557e + ", androidAppInfo=" + this.f52558f + ')';
    }
}
