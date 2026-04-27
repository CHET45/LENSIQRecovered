package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class o7j extends qv7 {

    /* JADX INFO: renamed from: a */
    public final int f66630a;

    /* JADX INFO: renamed from: b */
    public final int f66631b;

    public /* synthetic */ o7j(int i, int i2, q4j q4jVar) {
        this.f66630a = i;
        this.f66631b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qv7) {
            qv7 qv7Var = (qv7) obj;
            if (this.f66630a == qv7Var.getImageFormat() && this.f66631b == qv7Var.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.qv7
    public final int getImageFormat() {
        return this.f66630a;
    }

    @Override // p000.qv7
    public final int getStorageType() {
        return this.f66631b;
    }

    public final int hashCode() {
        return ((this.f66630a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f66631b;
    }

    public final String toString() {
        int i = this.f66630a;
        int i2 = this.f66631b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
