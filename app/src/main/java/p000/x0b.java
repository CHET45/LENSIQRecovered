package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x0b implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final int f95971a;

    public x0b(int i) {
        this.f95971a = i;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0b) && this.f95971a == ((x0b) obj).f95971a;
    }

    public int hashCode() {
        return this.f95971a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f95971a;
    }
}
