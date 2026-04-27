package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.gbb;

/* JADX INFO: loaded from: classes4.dex */
public final class jl0 extends gbb {

    /* JADX INFO: renamed from: a */
    public final gbb.EnumC6202c f51081a;

    /* JADX INFO: renamed from: b */
    public final gbb.EnumC6201b f51082b;

    /* JADX INFO: renamed from: jl0$b */
    public static final class C7967b extends gbb.AbstractC6200a {

        /* JADX INFO: renamed from: a */
        public gbb.EnumC6202c f51083a;

        /* JADX INFO: renamed from: b */
        public gbb.EnumC6201b f51084b;

        @Override // p000.gbb.AbstractC6200a
        public gbb build() {
            return new jl0(this.f51083a, this.f51084b);
        }

        @Override // p000.gbb.AbstractC6200a
        public gbb.AbstractC6200a setMobileSubtype(@hib gbb.EnumC6201b enumC6201b) {
            this.f51084b = enumC6201b;
            return this;
        }

        @Override // p000.gbb.AbstractC6200a
        public gbb.AbstractC6200a setNetworkType(@hib gbb.EnumC6202c enumC6202c) {
            this.f51083a = enumC6202c;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gbb)) {
            return false;
        }
        gbb gbbVar = (gbb) obj;
        gbb.EnumC6202c enumC6202c = this.f51081a;
        if (enumC6202c != null ? enumC6202c.equals(gbbVar.getNetworkType()) : gbbVar.getNetworkType() == null) {
            gbb.EnumC6201b enumC6201b = this.f51082b;
            if (enumC6201b == null) {
                if (gbbVar.getMobileSubtype() == null) {
                    return true;
                }
            } else if (enumC6201b.equals(gbbVar.getMobileSubtype())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.gbb
    @hib
    public gbb.EnumC6201b getMobileSubtype() {
        return this.f51082b;
    }

    @Override // p000.gbb
    @hib
    public gbb.EnumC6202c getNetworkType() {
        return this.f51081a;
    }

    public int hashCode() {
        gbb.EnumC6202c enumC6202c = this.f51081a;
        int iHashCode = ((enumC6202c == null ? 0 : enumC6202c.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        gbb.EnumC6201b enumC6201b = this.f51082b;
        return iHashCode ^ (enumC6201b != null ? enumC6201b.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f51081a + ", mobileSubtype=" + this.f51082b + "}";
    }

    private jl0(@hib gbb.EnumC6202c enumC6202c, @hib gbb.EnumC6201b enumC6201b) {
        this.f51081a = enumC6202c;
        this.f51082b = enumC6201b;
    }
}
