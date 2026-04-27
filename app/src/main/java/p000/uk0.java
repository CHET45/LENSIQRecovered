package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.kj5;

/* JADX INFO: loaded from: classes4.dex */
public final class uk0 extends kj5 {

    /* JADX INFO: renamed from: a */
    public final Integer f88191a;

    /* JADX INFO: renamed from: uk0$b */
    public static final class C13562b extends kj5.AbstractC8393a {

        /* JADX INFO: renamed from: a */
        public Integer f88192a;

        @Override // p000.kj5.AbstractC8393a
        public kj5 build() {
            return new uk0(this.f88192a);
        }

        @Override // p000.kj5.AbstractC8393a
        public kj5.AbstractC8393a setOriginAssociatedProductId(@hib Integer num) {
            this.f88192a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj5)) {
            return false;
        }
        Integer num = this.f88191a;
        Integer originAssociatedProductId = ((kj5) obj).getOriginAssociatedProductId();
        return num == null ? originAssociatedProductId == null : num.equals(originAssociatedProductId);
    }

    @Override // p000.kj5
    @hib
    public Integer getOriginAssociatedProductId() {
        return this.f88191a;
    }

    public int hashCode() {
        Integer num = this.f88191a;
        return (num == null ? 0 : num.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f88191a + "}";
    }

    private uk0(@hib Integer num) {
        this.f88191a = num;
    }
}
