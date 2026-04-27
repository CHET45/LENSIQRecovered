package p000;

import java.util.List;

/* JADX INFO: renamed from: ro */
/* JADX INFO: loaded from: classes5.dex */
public final class C12176ro {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f78834a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f78835b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f78836c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f78837d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ycd f78838e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<ycd> f78839f;

    public C12176ro(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4, @yfb ycd ycdVar, @yfb List<ycd> list) {
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(str2, "versionName");
        md8.checkNotNullParameter(str3, "appBuildVersion");
        md8.checkNotNullParameter(str4, "deviceManufacturer");
        md8.checkNotNullParameter(ycdVar, "currentProcessDetails");
        md8.checkNotNullParameter(list, "appProcessDetails");
        this.f78834a = str;
        this.f78835b = str2;
        this.f78836c = str3;
        this.f78837d = str4;
        this.f78838e = ycdVar;
        this.f78839f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C12176ro copy$default(C12176ro c12176ro, String str, String str2, String str3, String str4, ycd ycdVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12176ro.f78834a;
        }
        if ((i & 2) != 0) {
            str2 = c12176ro.f78835b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c12176ro.f78836c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c12176ro.f78837d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            ycdVar = c12176ro.f78838e;
        }
        ycd ycdVar2 = ycdVar;
        if ((i & 32) != 0) {
            list = c12176ro.f78839f;
        }
        return c12176ro.copy(str, str5, str6, str7, ycdVar2, list);
    }

    @yfb
    public final String component1() {
        return this.f78834a;
    }

    @yfb
    public final String component2() {
        return this.f78835b;
    }

    @yfb
    public final String component3() {
        return this.f78836c;
    }

    @yfb
    public final String component4() {
        return this.f78837d;
    }

    @yfb
    public final ycd component5() {
        return this.f78838e;
    }

    @yfb
    public final List<ycd> component6() {
        return this.f78839f;
    }

    @yfb
    public final C12176ro copy(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4, @yfb ycd ycdVar, @yfb List<ycd> list) {
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(str2, "versionName");
        md8.checkNotNullParameter(str3, "appBuildVersion");
        md8.checkNotNullParameter(str4, "deviceManufacturer");
        md8.checkNotNullParameter(ycdVar, "currentProcessDetails");
        md8.checkNotNullParameter(list, "appProcessDetails");
        return new C12176ro(str, str2, str3, str4, ycdVar, list);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12176ro)) {
            return false;
        }
        C12176ro c12176ro = (C12176ro) obj;
        return md8.areEqual(this.f78834a, c12176ro.f78834a) && md8.areEqual(this.f78835b, c12176ro.f78835b) && md8.areEqual(this.f78836c, c12176ro.f78836c) && md8.areEqual(this.f78837d, c12176ro.f78837d) && md8.areEqual(this.f78838e, c12176ro.f78838e) && md8.areEqual(this.f78839f, c12176ro.f78839f);
    }

    @yfb
    public final String getAppBuildVersion() {
        return this.f78836c;
    }

    @yfb
    public final List<ycd> getAppProcessDetails() {
        return this.f78839f;
    }

    @yfb
    public final ycd getCurrentProcessDetails() {
        return this.f78838e;
    }

    @yfb
    public final String getDeviceManufacturer() {
        return this.f78837d;
    }

    @yfb
    public final String getPackageName() {
        return this.f78834a;
    }

    @yfb
    public final String getVersionName() {
        return this.f78835b;
    }

    public int hashCode() {
        return (((((((((this.f78834a.hashCode() * 31) + this.f78835b.hashCode()) * 31) + this.f78836c.hashCode()) * 31) + this.f78837d.hashCode()) * 31) + this.f78838e.hashCode()) * 31) + this.f78839f.hashCode();
    }

    @yfb
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f78834a + ", versionName=" + this.f78835b + ", appBuildVersion=" + this.f78836c + ", deviceManufacturer=" + this.f78837d + ", currentProcessDetails=" + this.f78838e + ", appProcessDetails=" + this.f78839f + ')';
    }
}
