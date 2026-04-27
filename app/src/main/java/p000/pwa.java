package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pwa extends cr7 {

    /* JADX INFO: renamed from: g */
    public static final String f72369g = "MLLT";

    /* JADX INFO: renamed from: b */
    public final int f72370b;

    /* JADX INFO: renamed from: c */
    public final int f72371c;

    /* JADX INFO: renamed from: d */
    public final int f72372d;

    /* JADX INFO: renamed from: e */
    public final int[] f72373e;

    /* JADX INFO: renamed from: f */
    public final int[] f72374f;

    public pwa(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f72370b = i;
        this.f72371c = i2;
        this.f72372d = i3;
        this.f72373e = iArr;
        this.f72374f = iArr2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pwa.class != obj.getClass()) {
            return false;
        }
        pwa pwaVar = (pwa) obj;
        return this.f72370b == pwaVar.f72370b && this.f72371c == pwaVar.f72371c && this.f72372d == pwaVar.f72372d && Arrays.equals(this.f72373e, pwaVar.f72373e) && Arrays.equals(this.f72374f, pwaVar.f72374f);
    }

    public int hashCode() {
        return ((((((((527 + this.f72370b) * 31) + this.f72371c) * 31) + this.f72372d) * 31) + Arrays.hashCode(this.f72373e)) * 31) + Arrays.hashCode(this.f72374f);
    }
}
