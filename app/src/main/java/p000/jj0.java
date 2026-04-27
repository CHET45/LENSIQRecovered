package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.xn0;

/* JADX INFO: loaded from: classes4.dex */
public final class jj0 extends xn0 {

    /* JADX INFO: renamed from: a */
    public final xn0.EnumC15205a f50688a;

    /* JADX INFO: renamed from: b */
    public final long f50689b;

    public jj0(xn0.EnumC15205a enumC15205a, long j) {
        if (enumC15205a == null) {
            throw new NullPointerException("Null status");
        }
        this.f50688a = enumC15205a;
        this.f50689b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xn0)) {
            return false;
        }
        xn0 xn0Var = (xn0) obj;
        return this.f50688a.equals(xn0Var.getStatus()) && this.f50689b == xn0Var.getNextRequestWaitMillis();
    }

    @Override // p000.xn0
    public long getNextRequestWaitMillis() {
        return this.f50689b;
    }

    @Override // p000.xn0
    public xn0.EnumC15205a getStatus() {
        return this.f50688a;
    }

    public int hashCode() {
        int iHashCode = (this.f50688a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f50689b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f50688a + ", nextRequestWaitMillis=" + this.f50689b + "}";
    }
}
