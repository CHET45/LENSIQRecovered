package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class ycd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f101122a;

    /* JADX INFO: renamed from: b */
    public final int f101123b;

    /* JADX INFO: renamed from: c */
    public final int f101124c;

    /* JADX INFO: renamed from: d */
    public final boolean f101125d;

    public ycd(@yfb String str, int i, int i2, boolean z) {
        md8.checkNotNullParameter(str, "processName");
        this.f101122a = str;
        this.f101123b = i;
        this.f101124c = i2;
        this.f101125d = z;
    }

    public static /* synthetic */ ycd copy$default(ycd ycdVar, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ycdVar.f101122a;
        }
        if ((i3 & 2) != 0) {
            i = ycdVar.f101123b;
        }
        if ((i3 & 4) != 0) {
            i2 = ycdVar.f101124c;
        }
        if ((i3 & 8) != 0) {
            z = ycdVar.f101125d;
        }
        return ycdVar.copy(str, i, i2, z);
    }

    @yfb
    public final String component1() {
        return this.f101122a;
    }

    public final int component2() {
        return this.f101123b;
    }

    public final int component3() {
        return this.f101124c;
    }

    public final boolean component4() {
        return this.f101125d;
    }

    @yfb
    public final ycd copy(@yfb String str, int i, int i2, boolean z) {
        md8.checkNotNullParameter(str, "processName");
        return new ycd(str, i, i2, z);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd)) {
            return false;
        }
        ycd ycdVar = (ycd) obj;
        return md8.areEqual(this.f101122a, ycdVar.f101122a) && this.f101123b == ycdVar.f101123b && this.f101124c == ycdVar.f101124c && this.f101125d == ycdVar.f101125d;
    }

    public final int getImportance() {
        return this.f101124c;
    }

    public final int getPid() {
        return this.f101123b;
    }

    @yfb
    public final String getProcessName() {
        return this.f101122a;
    }

    public int hashCode() {
        return (((((this.f101122a.hashCode() * 31) + Integer.hashCode(this.f101123b)) * 31) + Integer.hashCode(this.f101124c)) * 31) + Boolean.hashCode(this.f101125d);
    }

    public final boolean isDefaultProcess() {
        return this.f101125d;
    }

    @yfb
    public String toString() {
        return "ProcessDetails(processName=" + this.f101122a + ", pid=" + this.f101123b + ", importance=" + this.f101124c + ", isDefaultProcess=" + this.f101125d + ')';
    }
}
