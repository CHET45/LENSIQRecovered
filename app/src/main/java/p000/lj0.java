package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.c42;

/* JADX INFO: loaded from: classes4.dex */
public final class lj0 extends c42 {

    /* JADX INFO: renamed from: a */
    public final c42.EnumC2200b f57725a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6463gq f57726b;

    /* JADX INFO: renamed from: lj0$b */
    public static final class C8833b extends c42.AbstractC2199a {

        /* JADX INFO: renamed from: a */
        public c42.EnumC2200b f57727a;

        /* JADX INFO: renamed from: b */
        public AbstractC6463gq f57728b;

        @Override // p000.c42.AbstractC2199a
        public c42 build() {
            return new lj0(this.f57727a, this.f57728b);
        }

        @Override // p000.c42.AbstractC2199a
        public c42.AbstractC2199a setAndroidClientInfo(@hib AbstractC6463gq abstractC6463gq) {
            this.f57728b = abstractC6463gq;
            return this;
        }

        @Override // p000.c42.AbstractC2199a
        public c42.AbstractC2199a setClientType(@hib c42.EnumC2200b enumC2200b) {
            this.f57727a = enumC2200b;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c42)) {
            return false;
        }
        c42 c42Var = (c42) obj;
        c42.EnumC2200b enumC2200b = this.f57725a;
        if (enumC2200b != null ? enumC2200b.equals(c42Var.getClientType()) : c42Var.getClientType() == null) {
            AbstractC6463gq abstractC6463gq = this.f57726b;
            if (abstractC6463gq == null) {
                if (c42Var.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (abstractC6463gq.equals(c42Var.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.c42
    @hib
    public AbstractC6463gq getAndroidClientInfo() {
        return this.f57726b;
    }

    @Override // p000.c42
    @hib
    public c42.EnumC2200b getClientType() {
        return this.f57725a;
    }

    public int hashCode() {
        c42.EnumC2200b enumC2200b = this.f57725a;
        int iHashCode = ((enumC2200b == null ? 0 : enumC2200b.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        AbstractC6463gq abstractC6463gq = this.f57726b;
        return iHashCode ^ (abstractC6463gq != null ? abstractC6463gq.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f57725a + ", androidClientInfo=" + this.f57726b + "}";
    }

    private lj0(@hib c42.EnumC2200b enumC2200b, @hib AbstractC6463gq abstractC6463gq) {
        this.f57725a = enumC2200b;
        this.f57726b = abstractC6463gq;
    }
}
