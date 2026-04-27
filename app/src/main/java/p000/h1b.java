package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h1b implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final int f41997a;

    public h1b(int i) {
        v80.checkArgument(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.f41997a = i;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1b) && this.f41997a == ((h1b) obj).f41997a;
    }

    public int hashCode() {
        return 527 + Integer.hashCode(this.f41997a);
    }

    public String toString() {
        return "Orientation= " + this.f41997a;
    }
}
