package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class nl0 extends wdd {

    /* JADX INFO: renamed from: a */
    public final Integer f64826a;

    public nl0(@hib Integer num) {
        this.f64826a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wdd)) {
            return false;
        }
        Integer num = this.f64826a;
        Integer productId = ((wdd) obj).getProductId();
        return num == null ? productId == null : num.equals(productId);
    }

    @Override // p000.wdd
    @hib
    public Integer getProductId() {
        return this.f64826a;
    }

    public int hashCode() {
        Integer num = this.f64826a;
        return (num == null ? 0 : num.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "ProductData{productId=" + this.f64826a + "}";
    }
}
