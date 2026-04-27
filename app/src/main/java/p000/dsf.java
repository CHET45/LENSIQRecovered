package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dsf implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final float f30601a;

    /* JADX INFO: renamed from: b */
    public final int f30602b;

    public dsf(float f, int i) {
        this.f30601a = f;
        this.f30602b = i;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dsf.class != obj.getClass()) {
            return false;
        }
        dsf dsfVar = (dsf) obj;
        return this.f30601a == dsfVar.f30601a && this.f30602b == dsfVar.f30602b;
    }

    public int hashCode() {
        return ((527 + v56.hashCode(this.f30601a)) * 31) + this.f30602b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f30601a + ", svcTemporalLayerCount=" + this.f30602b;
    }
}
