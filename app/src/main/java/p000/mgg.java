package p000;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mgg {

    /* JADX INFO: renamed from: a */
    public final Surface f60975a;

    /* JADX INFO: renamed from: b */
    public final int f60976b;

    /* JADX INFO: renamed from: c */
    public final int f60977c;

    /* JADX INFO: renamed from: d */
    public final int f60978d;

    public mgg(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgg)) {
            return false;
        }
        mgg mggVar = (mgg) obj;
        return this.f60976b == mggVar.f60976b && this.f60977c == mggVar.f60977c && this.f60978d == mggVar.f60978d && this.f60975a.equals(mggVar.f60975a);
    }

    public int hashCode() {
        return (((((this.f60975a.hashCode() * 31) + this.f60976b) * 31) + this.f60977c) * 31) + this.f60978d;
    }

    public mgg(Surface surface, int i, int i2, int i3) {
        u80.checkArgument(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f60975a = surface;
        this.f60976b = i;
        this.f60977c = i2;
        this.f60978d = i3;
    }
}
