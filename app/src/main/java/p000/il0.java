package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class il0 extends oi9 {

    /* JADX INFO: renamed from: b */
    public final long f47331b;

    public il0(long j) {
        this.f47331b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof oi9) && this.f47331b == ((oi9) obj).getNextRequestWaitMillis();
    }

    @Override // p000.oi9
    public long getNextRequestWaitMillis() {
        return this.f47331b;
    }

    public int hashCode() {
        long j = this.f47331b;
        return ((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f47331b + "}";
    }
}
